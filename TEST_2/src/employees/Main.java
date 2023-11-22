package employees;

public class Main {
	public static void main(String[] args) {
		// 문제 7번
		// employees테이블의 first_name, salary, hire_date, 입사후 몇 년이 지났는지 조회하는 프로그램
		
		EmployeesDAO dao = new EmployeesDAO();
		
		System.out.println("===========================직원 정보 목록 출력===========================");
		System.out.println();
		dao.show();
	}
}
