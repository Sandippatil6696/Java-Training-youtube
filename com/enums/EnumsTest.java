package com.enums;

public enum EnumsTest {
    RED("stop") , YELLOW("caution") , GREEN("ok") ;

    private String action ;

    private EnumsTest(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    
}
