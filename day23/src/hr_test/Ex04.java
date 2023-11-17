package hr_test;

public class Ex04 {
	public static void main(String[] args) {
		// countries테이블에 insert하기
		
		JdbcTemplate template = new JdbcTemplate();
		
		String sql = "insert into countries values (?, ?, ?)";
		
		int row = template.update(sql, "KR", "South Korea", 3);
		
		System.out.println("결과 : " + row);
		// 결과 : 1 	==>  1행이 추가되었다는 뜻
		// Ex03 에서 테이블 조회시 추가된 것을 확인할 수 있음
		// 한번 더 실행했을 때 예외생김 (기본키인 국가코드가 중첩되기 때문에 무결성제약조건 위배로 오류)
	}

}
