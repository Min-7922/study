package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {	// Data Access Object 	// 기능과 행위 중심의 클래스
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	private final String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String username = "hr";
	private final String password = "hr";
	
	private final String driverName = "oracle.jdbc.driver.OracleDriver";
	
	
	public DAO() {	// DAO객체를 생성하면 드라이버 로드 및 연결을 수행한다 (객체 생성 시 초기작동)
		try {
			Class.forName(driverName);	// 접속에 사용할 오라클 DB전용 드라이버를 불러온다
			conn = DriverManager.getConnection(url, username, password);	// 주소와 계정정보를 이용하여 DB에 대한 연결을 만들어낸다
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이 잘못되었습니다 : " + e);
//			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB에 접속하는데 문제가 발생했습니다 : " + e);
//			e.printStackTrace();
		}
	}
	
	// DB에 접속하여 직원의 이름과 급여를 가져와서 리스트 형태로 반환하는 함수
	public List<DTO> getQueryFromEmployees() throws SQLException {	
		ArrayList<DTO> list = new ArrayList<>();	// DTO자료형만 들어갈 수 있는 list
		String sql = "select first_name, salary from employees";
		stmt = conn.createStatement();	// 연결 상태를 확인하고, 상태가 정상이면 명령어를 전달할 준비를 수행한다
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			// 빈 객체를 생성한다
			DTO dto = new DTO();
			
			// DB에서 first_name을 문자열 형태로 가져와서 객체에 저장한다
			dto.setFirstName(rs.getString("first_name"));
			
			// DB에서 salary를 정수형태로 가져와서 객체에 저장한다
			dto.setSalary(rs.getInt("salary"));
			
			// 객체를 리스트에 추가한다
			list.add(dto);
		}
		rs.close();
		stmt.close();
		conn.close();
		return list;
	}

	public List<DTO> getQueryFromEmployeesTop5() throws SQLException{
		// 데이터를 모아서 반환할 ArrayList를 생성한다
		ArrayList<DTO> list = new ArrayList<>();
		
		// 생성자에서 만들어진 conn에서 stmt를 받아온다
		stmt = conn.createStatement();
		
		// 명령을 수행할 쿼리문을 String sql에 작성한다 (sqldeveloper에서 실행했던 명령문)
		String sql = "select first_name, salary from employees order by salary desc fetch  first 5 rows only";
		
		// stmt에서 sql을 전달하면서 실행하고, 그 결과를 rs에 저장한다
		rs = stmt.executeQuery(sql);
		
		// 반복문으로 rs에 담긴 내용을 DTO 객체로 옮겨담아서 리스트에 추가한다
		while(rs.next()) {
			DTO dto = new DTO();
			
			dto.setFirstName(rs.getString("first_name"));
			dto.setSalary(rs.getInt("salary"));
			
			list.add(dto);
		}
		
		// 열려있는 연결을 역순으로 닫는다
		rs.close();
		stmt.close();
		conn.close();
		
		// 반환
		return list;
	}
	
} // end of DAO

























