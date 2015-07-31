package com.hxy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		//以下基本是固定的代码
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();//获取输出流
		
		//使用输出流，打印一个html文本
		out.println("<html><head><title>Hello World Sample</title></head>");
		out.println("<body><h1>Test Servlet 's Hello World:" + 
				new Date().toLocaleString() + //这个时间是服务端的时间
				"</h1></body></html>");
		
		System.out.println(new Date().toLocaleString());
		
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
