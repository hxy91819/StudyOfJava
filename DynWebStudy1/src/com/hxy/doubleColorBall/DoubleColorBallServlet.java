package com.hxy.doubleColorBall;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoubleColorBallServlet
 */
public class DoubleColorBallServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoubleColorBallServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //六个不能重复的红球
	    Set<Integer> set = new HashSet<Integer>();
	    
	    Random random = new Random();
	    
	    while(set.size() < 6){
	        int randomVal = random.nextInt(33) + 1;//双色球红球一共3个数字
	        
	        set.add(randomVal);
	    }
	    
	    int randomVal = random.nextInt(16) + 1;//篮球以供16个数字
	    
	    String result = "red ball: ";
	    
	    for(Integer i : set){
	        result += i + " ";
	    }
	    
	    result += "<br/>blue ball: " + randomVal;

	    // 固定的代码，打印必须的。
	    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Login Result</title></head>");

        out.println("<body> " + result + "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
