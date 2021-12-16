package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet/AnnoMapping.do")
public class AnnoMapping extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("message", "@webServlet으로 매핑했어용~");
		req.getRequestDispatcher("/Servlet/AnnoMapping.jsp").forward(req, resp);
		/*
		 AnnoMapping.jsp라는 View로 나의 요청을 뿌려줄거야!
		 그럼 AnnoMapping.jsp가 그 요청을 화면에 출력한다
		 */
	}
}
