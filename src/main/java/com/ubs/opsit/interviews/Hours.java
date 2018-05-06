package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.TimeUnit;

public class Hours implements TimeUnit {

    private static final String ALL_LIGHTS_OFF = "OOOO";
    private static final String RED_LiGHT = "R";
    private static final int MULTIPLE_OF_FIVE = 5;

    public String getLampForHoursMultipleOfFive(int h) {
        StringBuffer lamps = new StringBuffer(ALL_LIGHTS_OFF);
        System.out.println(lamps + "    LAMPS CLASS");
        for (int i = 0; i < (h / MULTIPLE_OF_FIVE); i++) {
            System.out.println(lamps + "    LAMPS FOR LOOP   " + i + "   I   " + h );
            lamps.replace(i, i + 1, RED_LiGHT);
            System.out.println(lamps + "    LAMPS LOOP LAST");
        }
        return lamps.toString();
    }

    public String getLampForSingleHours(int h) {
        StringBuffer lmp = new StringBuffer(ALL_LIGHTS_OFF);
        for (int i = 0; i < (h % MULTIPLE_OF_FIVE); i++) {
            lmp.replace(i, i + 1, RED_LiGHT);
        }
        return lmp.toString();
    }

    @Override
    public String getLamps(int hrs) {
        return getLampForHoursMultipleOfFive(hrs) + "\r\n" + getLampForSingleHours(hrs);
    }
}