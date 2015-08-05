package com.hxy.dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    // 计算两个日期相隔多少天
    private static int getDiffDays(String beginDate, String endDate) throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d1=sdf.parse(beginDate);  
        Date d2=sdf.parse(endDate);
        
        return daysBetween(d1, d2);
    }
    
    private static int daysBetween(Date smdate,Date bdate) throws ParseException    
    {    
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        smdate=sdf.parse(sdf.format(smdate));  
        bdate=sdf.parse(sdf.format(bdate));  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(smdate);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(bdate);    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(between_days));           
    }  
    
    public static void main(String[] args) {
        try {
            System.out.println(getDiffDays("2015-03-06", "2015-08-04"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
