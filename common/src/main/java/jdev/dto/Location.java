package jdev.dto;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public class Location {
    Point point;

    public static void math()  {

    }

    public String toJson() throws JsonProcessingException {
        return point.toJson();
    }

    public double getLat() {
        return point.getLat();
    }

    public void setLat(int lat) throws IOException {
        point.setLat(lat);
    }

    public double getLon() {
        return point.getLon();
    }

    public void setLon(double lon) {
        point.setLon(lon);
    }

    public String getAutoId() {
        return point.getAutoId();
    }

    public void setAutoId(String autoId) {
        point.setAutoId(autoId);
    }

    public long getTime() {
        return point.getTime();
    }

    public void setTime(long time) {
        point.setTime(time);
    }
}