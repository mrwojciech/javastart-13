import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/doMetrics")
public class ZadanieD02 extends HttpServlet {
    private final String NEXT_LINE ="<br>";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String kg = request.getParameter("kg");
        String m = request.getParameter("m");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer(Double.valueOf(kg), Double.valueOf(m), writer);
    }

    private void writer(Double kg, Double m, PrintWriter writer) {
        Double kgDouble = kg;
        Double mDouble = m;
        writer.println("Twoje miary to: ");
        writer.println(NEXT_LINE);
        writer.println("Metr: " + mDouble);
        writer.println(NEXT_LINE);
        writer.println("Kg: " + kgDouble);
        writer.println(NEXT_LINE);
        writer.println("Cm: " + mDouble * 100);
        writer.println(NEXT_LINE);
        writer.println("mm: " + mDouble * 100 * 100);
        writer.println(NEXT_LINE);
        writer.println("gram: " + kgDouble * 100);
        writer.println(NEXT_LINE);
        writer.println("mgram: " + kgDouble * 100 * 100);

    }

}
