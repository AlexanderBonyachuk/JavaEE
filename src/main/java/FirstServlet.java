import CartPocket.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // cart for online store
        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");

        if (user == null) {
            // response for anonymous user
            // authorization
            // registration
            // session.setAttribute("curren_user", ID);
        } else {
            // response for authorization user
        }

    }
}
