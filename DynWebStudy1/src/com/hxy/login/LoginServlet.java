package com.hxy.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet invoked!");
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost invoked!");
		process(req, resp);
	}
	
	/**
	 * doGet和doPost方法执行的内容相同
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// System.out.println(req);
		// System.out.println(resp);

		// HttpServletRequest是用户发送的请求，包含文本框的内容等。
		String usernameString = req.getParameter("username");
		String passwordString = req.getParameter("password");// 从文本框中取值。

		// 固定的代码，打印必须的。
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html><head><title>Login Result</title></head>");

		out.println("<body>username: " + usernameString + "<br/>password: " + passwordString + "</body></html>");
	}
}
