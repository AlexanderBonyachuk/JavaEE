import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // counting the number of visits from user
        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 1;
            session.setAttribute("count", 2);
        } else {
            session.setAttribute("count", count + 1);
        }

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Your count is: " + count + " </h1>");
        pw.println("</html>");
    }
}
