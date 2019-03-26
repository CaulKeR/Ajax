import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName").trim();
		if(userName == null || "".equals(userName)) {
			userName = "Guest";
		}
		
		String content = "Привет, " + userName;
		response.setContentType("text/plain");

		OutputStream outStream = response.getOutputStream();
		outStream.write(content.getBytes("UTF-8"));
	    outStream.flush();
	    outStream.close();
	}
	 
}
