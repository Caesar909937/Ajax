package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Checkname
 */
@WebServlet("/Checkname")
public class Checkname extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Checkname() {
      super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		//返回数据，设置响应头和响应编码格式
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		if(name.equals("zhangsan")) {
			System.out.println("名字重复！");
			pw.write("F");
		}else {
		   System.out.println("名字不重复！");
		   pw.write("T");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
