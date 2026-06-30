import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
   
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("admin".equals(username) && "1234".equals(password)) {
        
        	req.setAttribute("username", username);
            req.getRequestDispatcher("welcome.jsp").forward(req, resp);
        } 
        else {
        
        	req.setAttribute("error", "Invalid credentials!");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}