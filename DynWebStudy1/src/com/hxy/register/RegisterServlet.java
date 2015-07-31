package com.hxy.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// HttpServletRequest是用户发送的请求，包含文本框的内容等。
		String usernameString = req.getParameter("username");
		String passwordString = req.getParameter("password");// 从文本框中取值。
		String repasswordString = req.getParameter("repassword");
		String ageString = req.getParameter("age");
		
		String showInfoString = "";
		
		int ageInt = 0;
		try {
	        ageInt = Integer.parseInt(ageString);
        } catch (NumberFormatException e) {
        	showInfoString = "年龄转换错误，请检查是否是数字";
        }
		
		if(showInfoString.equals("")){
			//只有数字没报错的时候，才进行后面的校验
			if(!usernameString.equals("")){
				//姓名不为空才判断后面的
				if(Integer.parseInt(ageString) < 18){
					//年龄不满18岁，报错
					showInfoString = "年龄不满18岁，不能注册！";
				} else {
					if(!passwordString.equals(repasswordString)){
						//密码不一致，报错。
						showInfoString = "两次输入的密码不一致！";
					} else {
						showInfoString = "恭喜您成功完成注册！";
					}
				}
			} else {
				//姓名输入为空
				showInfoString = "账户名输入为空，请检查！";
			}
		}
		
		// 固定的代码，打印必须的。
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		out.println("<html><head><title>Login Result</title></head>");

		out.println("<body>" + showInfoString + "</body></html>");
	}
}
