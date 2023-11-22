package employees;

import java.sql.*;
import java.util.ArrayList;

public class EmployeesDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "hr";
	private String password = "hr"; 
	
	
	private Connection connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch(Exception e) { e.printStackTrace(); }
		return conn;
	}
	
	private void close() {	
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch(SQLException e) { e.printStackTrace(); }
	}

	
	public void show() {	// 목록 출력 메서드
		try {
			String sql = "select first_name, salary, hire_date, "
					+ "  EXTRACT (year from sysdate) - EXTRACT (year from hire_date) as job_tenure "
					+ "  from employees order by job_tenure";
			
			connect();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<EmployeesDTO> list = new ArrayList<>();
			while(rs.next()) {
				EmployeesDTO dto = new EmployeesDTO();
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setHire_date(rs.getDate("hire_date"));
				dto.setJob_tenure(rs.getInt("job_tenure")); 
				
				list.add(dto);
			}
			
			for(EmployeesDTO dto : list) {
				System.out.printf("%15s | 급여 : %,6d $ | 입사 날짜 : %s | 근속연수: %s년\n", 
						dto.getFirst_name(), dto.getSalary(), dto.getHire_date(), dto.getJob_tenure());
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally { close(); }
		
	} // end of show()
	
	
	
} // end of class
