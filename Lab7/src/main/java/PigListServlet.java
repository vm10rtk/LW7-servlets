import Entity.Pig;
import Entity.PigList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/pigList")
public class PigListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PigList pigList = PigList.getInstance();
        ArrayList<Pig> pigs = pigList.getPigs();

        request.setAttribute("pigs", pigs);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/pigList.jsp");
        dispatcher.forward(request, response);
    }
}
