import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static org.graalvm.compiler.nodeinfo.Verbosity.Name;


@WebServlet(urlPatterns = {"/signup"})
public class ServletSave extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Session session = HibernateDB.getSessionFactory().getCurrentSession();
        PrintWriter writer;
        Transaction tx = session.getTransaction();
        try {
            if (true) {
                tx.begin();
                SaveUsers users = new SaveUsers();

                // read form fields
                String Name = request.getParameter("name");
                String PhoneNumber = request.getParameter("phoneNumber");
                String Age = request.getParameter("age");
                String Email = request.getParameter("email");
                String gender = request.getParameter("gender");
                String sexuality = request.getParameter("sexuality");
                String Location = request.getParameter("location");
                String Password = request.getParameter("password");

                //Save to the DB
                users.setName(Name);
                users.setPhoneNumber(Integer.parseInt(PhoneNumber));
                users.setAge(Integer.parseInt(Age));
                users.setEmail(Email);
                if (gender != null)
                    users.setGender(Gender.valueOf(gender));
                if (sexuality != null)
                    users.setSexuality(Sexuality.valueOf(sexuality));
                users.setLocation(Location);
                users.setPassword(Password);
                session.save(users);
                tx.commit();
               response.sendRedirect("./profile.html");
            }else {
                response.sendRedirect("./signup.html");
                response.setContentType("text/html");
                writer = response.getWriter();
                writer.println("<html><body>");
                writer.println("invalid Credentials!!!!!");
                writer.println("</body></html>");


            }

//            //trial code
//            response.setContentType("text/html");
//            writer = response.getWriter();
//            writer.println("<html><body>");
//            writer.println("The name is"+" "+request.getParameter("name")+ " "+
//                    "number is " +request.getParameter("phoneNumber")+" "+request.getParameter("age")+" "+request.getParameter("email")+" "+request.getParameter("gender")+
//                    request.getParameter("sexuality")+" "+ request.getParameter("location"));
//            writer.println("</body></html>");
            //End of trial code

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Session session = HibernateDB.getSessionFactory().getCurrentSession();
//
//        Transaction tx = session.getTransaction();
//        try {
//            tx.begin();
//            SaveUsers users = new SaveUsers();
////            String Name = request.setAttribute("name",Name);
//            users.getName();
//
//
//
//        }catch (Exception e){
//
//
//        }


    }

    }

