import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;

public class ViewCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<String> cart = (List<String>) session.getAttribute("cart");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Your Cart</h2>");

        if(cart != null){
            for(String book : cart){
                out.println(book + "<br>");
            }
        } else {
            out.println("Cart is empty");
        }
    }
}
