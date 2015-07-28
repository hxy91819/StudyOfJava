package com.hxy.hisConfigConvert;

import junit.framework.TestCase;

public class testHisConfigConvertorServlet extends TestCase {
    public void testconvertQuot(){
        String inputString = "\"love you \"";
        
        String result = HisConfigConvertorServlet.convertQuot(inputString);
        
        System.out.println(result);
    }
}
