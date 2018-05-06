package com.ubs.opsit.interviews;

import java.util.ArrayList;
import java.util.List;
import com.ubs.opsit.interviews.TimeUnit;
import com.ubs.opsit.interviews.Seconds;
import com.ubs.opsit.interviews.Minutes;
import com.ubs.opsit.interviews.Hours;

public class BerlinClock {
     
    private static List<TimeUnit> timeUnits = new ArrayList<TimeUnit>();
    
    public static void main(String args[]) {
        
        timeUnits.add(new Seconds());
        timeUnits.add(new Minutes());
        timeUnits.add(new Hours());
        
        System.out.println(getTime("13:17:01"));
        
    }
    
    public static String getTime(String time) {
        StringBuilder timeS = new StringBuilder();
        String[] result= new String[3];
        String[] timeElemnts = time.split(":");
        
        int i = 0;
        int j = 2;
        
        for (TimeUnit timeUnit : timeUnits) {
            for(String timeElemnt : timeElemnts) {
                timeS.append(timeUnits.get(i).getLamps(Integer.parseInt(timeElemnts[j]))).append("\n");
                result[i]=timeUnits.get(i).getLamps(Integer.parseInt(timeElemnts[j]));
                i++;
                j--;
                break;
            }
        }
        System.out.println("result is #########################################"+result[0] + result[1]+ result[2]);
        return timeS.toString();
    }
}
