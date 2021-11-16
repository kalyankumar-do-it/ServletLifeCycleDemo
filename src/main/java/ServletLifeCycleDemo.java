import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/send")
public class ServletLifeCycleDemo extends HttpServlet
{
	int num;
	
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("Init Method");
		num=10;
		System.out.println("num is intialised :"+num);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		System.out.println("doPost Method");
		System.out.println("num is in service method :"+num);
		out.print("Given Text : "+req.getParameter("sText"));
	}
	
	// closing connections 
	@Override
	public void destroy() 
	{
		System.out.println("Destroy Method");
	}

}
