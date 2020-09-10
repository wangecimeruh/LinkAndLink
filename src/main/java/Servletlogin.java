import javassist.bytecode.stackmap.BasicBlock;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = {"/login"})
public class Servletlogin extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SaveUsers user = null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(true);
            String username = request.getParameter("name");
            String password = request.getParameter("password");
            try {

                if (username != null && password != null) {
//                    session.setAttribute("us", username);
//                    session.setAttribute("ps", password);
//
//                    String thename = (String) request.getSession(true).getAttribute("us");
//                    String thepassword = (String) request.getSession(true).getAttribute("ps");

                    Session sessions = HibernateDB.getSessionFactory().openSession();
                    user = (SaveUsers) sessions.createQuery("FROM SaveUsers U WHERE U.Name = :userName").setParameter("userName", username)
                            .uniqueResult();
                    if (user != null && user.getPassword().equals(password)) {
                        response.sendRedirect("./profile.html");

                    } else {
                        response.sendRedirect("./Login.html");
                    }


                }
            } catch (Exception ex) {
                out.println("Exception :" + ex.getMessage());
            }
        }
    }
}

