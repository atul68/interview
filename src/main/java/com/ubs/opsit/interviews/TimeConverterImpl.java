package com.ubs.opsit.interviews;

import java.util.ArrayList;
import java.util.List;

public class TimeConverterImpl implements TimeConverter {

	 
	
    public String convertTime(String aTime){
    	List<TimeUnit> timeUnits = new ArrayList<TimeUnit>();
    	timeUnits.add(new Seconds());
        timeUnits.add(new Minutes());
        timeUnits.add(new Hours());
		
        StringBuilder timeS = new StringBuilder();
        String[] timeElemnts = aTime.split(":");
        String[] result= new String[3];
        
      
        int i = 0;
        int j = 2;        
        for (TimeUnit timeUnit : timeUnits) { 
        	System.out.println("typeof ::" + timeUnit );
            for(String timeElemnt : timeElemnts) {
                //timeS.append(timeUnits.get(i).getLamps(Integer.parseInt(timeElemnts[j]))).append("\n");
                //System.out.println("timeS"+timeS.toString());
                result[i]=timeUnits.get(i).getLamps(Integer.parseInt(timeElemnts[j]));
                i++;
                j--;
                break;
            }
        }
        
        //System.out.println("result is #########################################"+result[0] +"\n" + result[1]+"\n"+ result[2]);
        timeS.append(result[0].toString()). append("\r\n").append(result[2].toString()).append("\r\n").append(result[1].toString());//.append("\n").append(result[1]);
        System.out.println("timeS--->"+timeS.toString());
        return timeS.toString();
		
	}

}
