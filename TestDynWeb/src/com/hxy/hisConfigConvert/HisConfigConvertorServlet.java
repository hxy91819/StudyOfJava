package com.hxy.hisConfigConvert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxy.client.Client;

public class HisConfigConvertorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        process(req, resp);
    }

    private void process(HttpServletRequest req, HttpServletResponse resp)
            throws IOException
    {
        String inputXML = req.getParameter("inputXML");
        
        String convertResult = Client.getStringOfHisConfig(inputXML);
        
//        convertResult = HisConfigConvertorServlet.convertQuot(convertResult);
        
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();

        out.println("<html><head><title>HisConfigConvertorResult</title></head>");
        
        String endHtmlString = "<body><h4>转换的结果如下：</h4><textarea rows=\"%s\" cols=\"%s\" name=\"%s\">%s</textarea></body></html>";
        endHtmlString = String.format(endHtmlString, "20", "80", "result", convertResult);

        out.println(endHtmlString);

        out.flush();
    }
    
    static String convertQuot(String inputString){
        return inputString.replaceAll("\"", "&quot;");
    }
}
