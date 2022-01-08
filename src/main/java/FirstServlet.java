import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // redirect to another site

        response.sendRedirect("https://www.google.com"); // redirect
        // other options
//        response.sendRedirect("/testJsp.jsp");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp"); // forward
//        dispatcher.forward(request, response);
    }
}
