package date;

import java.sql.*;
import java.util.ArrayList;

public class Ex05 {	// 기초 연습용
	public static void main(String[] args) throws Exception{
		// hr 계정의 employees 테이블에서 first_name과 hire_date만 지정하여
		// DTO 혹은 Hashmap에 저장하여 리스트로 가져온 후 출력하세요
	
		// 1) 접속할 주소, 계정, 비밀번호 설정
		String url = "Jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "hr";
		String password = "hr";
	
		// 2) 드라이버 불러오기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 클래스의 이름을 매개변수로 받아서 Class 객체를 리턴
	
		// 3) sql 준비
		String sql = "select * from employees";
		
		// 4) 연결 (conn)
		Connection conn = DriverManager.getConnection(url, user, password);
		
		// 5) 상태 (실행 준비, pstmt)
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		// 6) 결과 (pstmt.executeQuery())
		ResultSet rs = pstmt.executeQuery();
		
		// 7) while(rs.next())
		ArrayList<Ex05DTO> list = new ArrayList<>();
		
		while(rs.next()) {
			// 8) 불러온 값을 자바 객체에 저장 (dto 혹은 hashmap)
			Ex05DTO dto = new Ex05DTO();
			dto.setFirst_name(rs.getString("First_name"));
			dto.setHire_date(rs.getDate("hire_date"));
			
			// 9) 리스트에 하나씩 추가
			list.add(dto);
			
		}
		
		// 10) 반복문이 끝나면 리스트의 내용을 출력하기
		for(Ex05DTO s : list) {
			System.out.printf("%s %s\n", s.getFirst_name(), s.getHire_date());
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		
		
		
	
		
	}

	

}
