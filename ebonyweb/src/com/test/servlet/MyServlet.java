package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义的一个Servlet，可以提供服务，效果相当于jsp，html等。
 * 通常都要继承HttpServlet
 * Servlet的开发，可以基于这个例子完成
 * @author Administrator
 *
 */
public class MyServlet extends HttpServlet {
	//需要重写doGet和doPost
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		process(req, resp);
	}
	
	//执行
	protected void process(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(req.getClass().getName());
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<HTML><HEAD><TITLE>My First Servlet</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H1>Hello World</H1>");
		out.println("<br>" + new java.util.Date().toLocaleString());
		
		System.out.println("当前系统时间为：" + new java.util.Date().toLocaleString());
		
		out.println("</BODY><HTML>");
	}
	
}
