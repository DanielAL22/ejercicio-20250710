package com.devopsgang;

public class DiscountService {
    public double getRate(String code){
        if (code.equals("SALE10")) return 0.10;
        return 0.0;
    }
}