import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import 
jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
*
* @author Lenevo
*/
public class LoginServlet extends HttpServlet {
 protected void doGet(HttpServletRequest 
req, HttpServletRequest resp) {
 }
 protected void doPost(HttpServletRequest 
request, HttpServletResponse response) {
 response.setContentType("text/html");
 PrintWriter out = null;
 String x = 
request.getParameter("password");
 String y = 
request.getParameter("username");
 boolean result = true;
 
 try {
 out = response.getWriter();
 
 if (result) {
 out.println("<h1> fetching the 
datafrom database</h1> <br>");
 Connection con = 
DriverManager.getConnection("jdbc:oracle:thin
:@localhost:1521:XE","c##sarthak", "sarthak"); 
 out.print("Executed</br>"); 
 String query = "select * from 
REGISTRATIONFILE;";
 PreparedStatement stmt = 
con.prepareStatement(query);
 ResultSet res = stmt.executeQuery();
 while (res.next()) {
 out.print("Name");
 out.print(res.getString("Name"));
 out.println();
 out.print(" State representation ");
 out.println(res.getString("STATE"));
 
 out.print("Payment Mode");
 
out.println(res.getString("PAYMODE")); 
 }
 } else {
 out.println("Sorry the login is invalid 
");
 }
 } catch (Exception e) {
 out.println(e.getMessage());
 }
 }
 @Override
 public void service(HttpServletRequest 
request, HttpServletResponse response) {
 String method = request.getMethod();
 if (method.equalsIgnoreCase("GET")) {
 try {
 doGet(request, response);
 } catch (Exception e) {
 }
 } else if 
(method.equalsIgnoreCase("POST")) {
 try {
 doPost(request, response);
 } catch (Exception e) {
 }
 }
 }
}
