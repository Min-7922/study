package phonebook1;

import java.util.List;

public class Handler {
	
	JdbcTemplate template = new JdbcTemplate();
	
	public void showlist() {
		String sql = "select * from phonebook order by favorite desc, name";
		
		RowMapper<PhonebookDTO> mapper = (rs) -> {
			PhonebookDTO dto = new PhonebookDTO();
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			return dto;
		};
		
		List<PhonebookDTO> list = template.queryForList(sql, mapper);
		System.out.println("==========================");
		for(PhonebookDTO ob : list) {
			System.out.printf("%s %s \t%d %s\n",
					ob.getName(),
					ob.getPnum(),
					ob.getAge(),
					ob.getFavorite());
		}
		System.out.println("==========================");
		
	}// end of show
	
	
	
	public void insert(String name, String pnum, int age, String fav) {
		String sql = "insert into phonebook values (?, ?, ?, ?)";
		int row = template.update(sql, name, pnum, age, fav);
		System.out.println("결과 : "+ row + "행이 삽입되었습니다\n");
	}
	
	
	
	public void delete(String name) {
		String sql = "delete from phonebook where name = ?";
		int row = template.update(sql, name);
		System.out.println("결과 : " + row + "행이 삭제되었습니다\n");
	}
	
	
	
	public void updatePnum(String name, String pnum) {
		String sql = "update phonebook set pnum = ? where name = ?";
		int row = template.update(sql, pnum, name);
		System.out.println("결과 : " + row + "행이 수정되었습니다\n");
	}
	
	
	
	public void updateFav(String name) {
		String sql = "update phonebook set favorite = decode(favorite, 'Y, 'N','N','Y') where name = ?";
		
		int row = template.update(sql, name);
		System.out.println("결과 : " + row + "행이 수정되었습니다\n");
	}
	
	
	
	
	
	
	
	
	
	

} // end of class
