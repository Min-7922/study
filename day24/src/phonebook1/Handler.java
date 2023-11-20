package phonebook1;

import java.util.List;

public class Handler {

	private PhonebookDAO dao = new PhonebookDAO();
	
	public List<PhonebookDTO> selectList() throws Exception {
		List<PhonebookDTO> list = dao.selectList();
		return list;
		
	}
	
	public int insertPhonebook(PhonebookDTO ob) throws Exception {
		int row = dao.insert(ob);
		return row;
	}

//	public int updatePnum(String name, String pnum) {
//		int row = dao.update(name, pnum);
//		return row;
//	}
	
}
