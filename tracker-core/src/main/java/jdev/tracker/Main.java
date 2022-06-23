package jdev.tracker;

import jdev.dto.Point;

import java.io.IOException;

/**
 * Created by jdev on 07.03.2017.
 */
public class Main {
    public static void main(Boolean isTust, String... args) throws Exception {
        for (int i=0; i<5; i++) {
            extractedMethod(45, isTust, false);
    }
}

    private static void extractedMethod(int lat, Boolean isTrust, Boolean isTust) throws IOException, InterruptedException {
        System.out.println("Main.main say Hello!!!!");
        Point point = new Point();
        point.setLat(lat);
        System.out.println(point.toJson());
        Thread.sleep(1000);
    }
}
