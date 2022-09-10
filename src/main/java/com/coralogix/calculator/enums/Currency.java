package com.coralogix.calculator.enums;

public enum Currency {
    USD("USD"), EUR("EUR"), PEN("PEN"), COP("COP");
    private String code;

    Currency(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
