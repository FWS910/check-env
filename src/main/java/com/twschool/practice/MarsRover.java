package com.twschool.practice;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {

        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public MarsRoverPosition execute(String command) {
        for(int i = 0;i<command.length();i++){
            if(String.valueOf(command.charAt(i)).equals("L")||String.valueOf(command.charAt(i)).equals("R")){
                marsRoverPosition.setDirection(getDirection(marsRoverPosition.getDirection(), String.valueOf(command.charAt(i))));
            }else if (String.valueOf(command.charAt(i)).equals("M")){
                if(marsRoverPosition.getDirection().equals("N")){
                    marsRoverPosition.setCoordinates_Y(marsRoverPosition.getCoordinates_Y()+1);
                }else if(marsRoverPosition.getDirection().equals("W")){
                    marsRoverPosition.setCoordinates_X(marsRoverPosition.getCoordinates_X()-1);
                }else if(marsRoverPosition.getDirection().equals("S")){
                    marsRoverPosition.setCoordinates_Y(marsRoverPosition.getCoordinates_Y()-1);
                }else if(marsRoverPosition.getDirection().equals("E")){
                    marsRoverPosition.setCoordinates_X(marsRoverPosition.getCoordinates_X()+1);
                }
            }else {
                System.out.println("输入参数有误");
            }
        }
        return marsRoverPosition;
    }
    public String getDirection(String direction, String roll) {
        if (direction.equals("N") && roll.equals("L")) {
            return "W";
        }else if (direction.equals("N") && roll.equals("R")) {
            return "E";
        }else if (direction.equals("W") && roll.equals("L")) {
            return "S";
        }else if (direction.equals("W") && roll.equals("R")) {
            return "N";
        }else if (direction.equals("S") && roll.equals("L")) {
            return "E";
        }else if (direction.equals("S") && roll.equals("R")) {
            return "W";
        }else if (direction.equals("E") && roll.equals("L")) {
            return "N";
        }else if (direction.equals("E") && roll.equals("R")) {
            return "S";
        }else{
            System.out.println("输入参数有误,请重新输入");
            return "0";
        }

    }
}
