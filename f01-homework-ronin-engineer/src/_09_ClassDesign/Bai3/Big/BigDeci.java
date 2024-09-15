package _09_ClassDesign.Bai3.Big;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDeci {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("65178361783467134671364781364817341346718364.834938798");
        BigDecimal b = new BigDecimal("18374183748137481374134781348713487134813748137418374.8748731674736431235676");

        System.out.println(b.divide(a, 4, RoundingMode.HALF_DOWN));
    }
}
