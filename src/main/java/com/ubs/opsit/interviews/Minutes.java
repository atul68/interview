package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.TimeUnit;


public class Minutes implements TimeUnit {

    private static final String RED_LIGHT = "R";
    private static final String YELLOW_LIGHT = "Y";
    private static final String ALL_FOUR_LIGHTS_OFF = "OOOO";
    private static final String ALL_ELVN_LIGHTS_OFF = "OOOOOOOOOOO";

    private String getLampsForMinuteFive(int m) {
        StringBuffer lmp = new StringBuffer(ALL_ELVN_LIGHTS_OFF);
        for (int i = 0; i < m; i++) {
            if (0 == (i + 1) % 3) {
                lmp.replace(i, i + 1, RED_LIGHT);
            } else {
                lmp.replace(i, i + 1, YELLOW_LIGHT);
            }
        }
        return lmp.toString();
    }

    private String getLampsForMinuteSingle(int m) {
        StringBuffer lmp = new StringBuffer(ALL_FOUR_LIGHTS_OFF);
        for (int i = 0; i < m; i++) {
            lmp.replace(i, i + 1, YELLOW_LIGHT);
        }
        return lmp.toString();
    }

    @Override
    public String getLamps(int m) {
        int minuteDivided = m / 5;
        int minuteModule = m % 5;
        return getLampsForMinuteFive(minuteDivided) + "\r\n" + getLampsForMinuteSingle(minuteModule);
    }
}
