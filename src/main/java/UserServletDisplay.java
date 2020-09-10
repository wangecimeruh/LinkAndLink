import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Session;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = {"/display"})
public class UserServletDisplay extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Session session = HibernateDB.getSessionFactory().openSession();
        List<SaveUsers> user = session.createQuery("FROM SaveUsers s").getResultList();
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            response.getWriter().println(json);
        } catch(Exception e) {
            //e.printStackTrace();
            response.getWriter().println(e.getMessage());

        }
    }
}
