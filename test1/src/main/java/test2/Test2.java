package test2;
// 자바 베이스에 html을 얹은 느낌 = servlet
// 자바에 대한 내용을 충분히 이해해야 쓰기 수월하다
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// directive


public class Test2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	// declaration
	
	
	// 이 밑으로 scriptlet
	@Override	// Server에서 실행될 프로그램의 service함수는 역할상 main함수와 같다
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		// jsp는 예외를 처리할 수 있는 함수가 있기는 하지만 애초에 service함수 자체에 IOException을 throws하기 때문에 굳이 예외처리를 따로 하지 않는다.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String now = sdf.format(new Date());
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter pw = response.getWriter();
		
		
		// 이 아래가 expression
		String html = "";
		html += "<!DOCTYPE html>";
		html += "<html lang =\"ko\">";
		html += "<head>";
		html +=	"    <title>MyServlet</title>";
		html += "    <meta charset=\"UTF-8\">";
		html += "</head>";
		html += "<body>";
		html += "    <h1>My Servlet</h1>";
		html += "    <hr>";
		html += "    <h3>"+ now +"</h3>";
		html += "</body>";
		html += "</html>";
		
		pw.write(html);
		pw.flush();
		pw.close();
	}

}
