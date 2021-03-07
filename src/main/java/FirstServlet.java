import testClass.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = request.getSession();
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        Cart cart = (Cart) session.getAttribute("cart");
//        if (cart ==null){
//             cart = new Cart();
//             cart.setName(name);
//             cart.setQuantity(quantity);
//        }
//        session.setAttribute("cart", cart);


        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 0;
        }
        count++;
        session.setAttribute("count", count);


        //String name = request.getParameter("name");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        // printWriter.println("<h1> Hello, " + name + "</h1>");

         printWriter.println("<h1> Count " + count + "</h1>");

        printWriter.println("</html>");
        //resp.sendRedirect("index.jsp");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//        dispatcher.forward(request, resp);

//                RequestDispatcher dispatcher = request.getRequestDispatcher("showCart.jsp");
//        dispatcher.forward(request, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
