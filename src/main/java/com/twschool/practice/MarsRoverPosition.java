package com.twschool.practice;

public class MarsRoverPosition {
    private  int coordinates_X;
    private  int coordinates_Y;
    private String direction;
    public MarsRoverPosition(int coordinatesX, int coordinatesY, String direction) {
        this.coordinates_X = coordinatesX ;
        this.coordinates_Y = coordinatesY;
        this.direction = direction;
    }


    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getCoordinates_Y() {
        return coordinates_Y;
    }

    public void setCoordinates_Y(int coordinates_Y) {
        this.coordinates_Y = coordinates_Y;
    }

    public int getCoordinates_X() {
        return coordinates_X;
    }

    public void setCoordinates_X(int coordinates_X) {
        this.coordinates_X = coordinates_X;
    }

}
