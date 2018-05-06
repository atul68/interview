package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.TimeUnit;

public class Seconds implements TimeUnit {
    
    public String getLamps(int s) {
        if (0 == s % 2) {
            return "Y";
        }
        return "O";
    }
}