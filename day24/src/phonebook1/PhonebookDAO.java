package phonebook1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class PhonebookDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";
	
//	public PhonebookDAO() throws ClassNotFoundException, SQLException {
//		Class.forName(OracleDriver.class.getName());
//		conn = DriverManager.getConnection(url, username, password);
//	}
	
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public List<PhonebookDTO> selectList() throws Exception {
		ArrayList<PhonebookDTO> list = new ArrayList<>();
		String sql = "select * from phonebook order by favorite desc, name asc";
		
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			// RowMapper에 작성했던 규칙을 여기에 작성
			PhonebookDTO dto = new PhonebookDTO();
			dto.setIdx(rs.getInt("idx"));
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			list.add(dto);
		};
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return list;
		
	}
	
	public int insert(PhonebookDTO ob) throws Exception{
		String sql = "insert into phonebook(name, pnum, age, favorite) values (?, ?, ?, ?)";
//		String sql2 = "select phonebook_seq.currval from dual";
		
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
//		PreparedStatement pstmt2 = conn.prepareStatement(sql2);
//		PhonebookDTO dto = new PhonebookDTO();
		
		
		pstmt.setString(1, ob.getName());
		pstmt.setString(2, ob.getPnum());
		pstmt.setInt(3, ob.getAge());
		pstmt.setString(4, ob.getFavorite());
		
		int row = pstmt.executeUpdate();
		
		if(rs != null) rs.close();		// 통로 개설의 역순으로 닫아준다
		if(pstmt != null) pstmt.close(); 
		if(conn != null) conn.close();
		
		return row;
	}

	public int update(String name, String pnum) throws Exception{
		String sql = "update phonebook set pnum = ? where name = ?";
		PhonebookDTO dto = new PhonebookDTO();
		
		
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		int idx=0;
		
		if(dto.getName().equals(name)) idx = dto.getIdx();
		pstmt.setInt(1, idx);
		pstmt.setString(2, pnum);
		
		int row = pstmt.executeUpdate();
		return row;
	}
	
	
	
	

}
