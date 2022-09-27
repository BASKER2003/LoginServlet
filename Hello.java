
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
@SuppressWarnings("serial")
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private int visits = 0;
 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
 
		PrintWriter strout = res.getWriter();
		visits++;
		String username= req.getParameter("usertxt");
		String password = req.getParameter("passwordtxt");
 
		if((username.equals("administrator")) && (password.equals("Sam1")))
		{
			strout.println("<html><head><title>Hello</title></head><body><h1>Hello World</h1><h4>Number of visits: "+visits+"</h4>\n<p>Welcome to <b>"+req.getParameter("usertxt") + "</b></p></body></html>");
		}
		else
		{
			strout.println("<html><head><title>Hello</title></head><body><h1>Incorrcet Username and Password</h1></body></html>");
		}
		strout.close();
	}
 
 
 
}
