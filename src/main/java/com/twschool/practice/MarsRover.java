package com.twschool.practice;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {

        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public void execute(Command command) {
        command.execute(marsRoverPosition);

    }

    public void getDirection(Direction direction, Command roll) {

        roll.execute(marsRoverPosition);

    }
}
