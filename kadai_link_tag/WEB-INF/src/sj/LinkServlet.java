package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LinkServlet extends HttpServlet  {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		  // 呼び出し元Jspからデータ受け取り
		  request.setCharacterEncoding("UTF8");
		  // 呼び出し先Jspに渡すデータセット
		  request.setAttribute("message", "Servletからデータを受信しました：侍太郎さん、こんにちは！");

		  // Hello.jsp にページ遷移
		  RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
		  dispatch.forward(request, response);
		}
}
