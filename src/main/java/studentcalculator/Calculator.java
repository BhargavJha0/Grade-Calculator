package studentcalculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cal")
public class Calculator extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String a = req.getParameter("number1");
   int aa = Integer.parseInt(a);
   String b = req.getParameter("number2");
   int ab = Integer.parseInt(b);
   String c = req.getParameter("number3");
   int ac = Integer.parseInt(c);
   String d = req.getParameter("number4");
   int ad = Integer.parseInt(d);
   String e = req.getParameter("number5");
   int ae = Integer.parseInt(e);
   
   
   int sum = aa+ab+ac+ad+ae;
   float per = (sum / 500.0f) * 100;
   
   System.out.println(per);
   
   if(per>=80)
   {
		PrintWriter out = resp.getWriter();
		out.println(" <h1>Grade A+</h1>");
	}
   else if(per>50 && per<=80) {
	   
	   PrintWriter out = resp.getWriter();
		out.println(" <h1>Grade B</h1>");
	   
	   
   }

   else {
	   
		PrintWriter out = resp.getWriter();
		out.println(" <h1> Grade C </h1>");
		
	}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
