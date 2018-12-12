package oop11;

import java.io.File;

public class Demo {

    private static final DataPoint dp = new DataPoint();

    public static void main(String[] args) {
        File f = new File("c:\\Java\\netatmo-export-201801-201804.csv");
        TempReader rd = new TempReader();
        rd.readTextFile(f, dp);
        dp.getMax();
    }
}
