package com.twschool.practice;

public class MarsRoverPosition {
    private  int coordinates_X;
    private  int coordinates_Y;
    private Direction direction;
    public MarsRoverPosition(int coordinatesX, int coordinatesY, Direction direction) {
        this.coordinates_X = coordinatesX ;
        this.coordinates_Y = coordinatesY;
        this.direction = direction;
    }


    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
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

    public void move() {
        if("N".equals(getDirection())){
            setCoordinates_Y(getCoordinates_Y()+1);
        }else if("W".equals(getDirection())){
            setCoordinates_X(getCoordinates_X()-1);
        }else if("S".equals(getDirection())){
            setCoordinates_Y(getCoordinates_Y()-1);
        }else if("E".equals(getDirection())){
            setCoordinates_X(getCoordinates_X()+1);
        }
    }
}
