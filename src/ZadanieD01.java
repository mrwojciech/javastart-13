import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/changeMetrics")
public class ZadanieD01 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String textHolder = request.getParameter("textHolder");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer(textHolder, writer);
//        doSomething(textHolder);
    }

    private void writer(String textHolder, PrintWriter writer) {
        int characterCounter = textHolder.length();
        int whiteCharacterCounter = textHolder.length()-textHolder.replaceAll(" ","").length();
        int wordCounter = textHolder.split(" ").length;
        boolean isPalindrom = isPalindrom(textHolder);
        writer.println("Twoj tekst: ");
        writer.println("");
        writer.println("Ma tyle znakow: "+characterCounter);
        writer.println();
        writer.println("Ma tyle spacji: "+whiteCharacterCounter);
        writer.println();
        writer.println("Ma tyle slow: "+wordCounter);
        writer.println();
        writer.println("Czy jest palindromem?: "+isPalindrom);
        writer.println();
        writer.println(textHolder);

    }

    private boolean isPalindrom(String textHolder) {
        return textHolder.equals(new StringBuffer().append(textHolder).reverse().toString());
    }
}
