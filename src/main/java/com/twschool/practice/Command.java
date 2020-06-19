package com.twschool.practice;

public enum Command {
    L {
        @Override
        public void execute(MarsRoverPosition position) {
            position.setDirection(position.getDirection().turnLeft());
        }
    },R{
        @Override
        public void execute(MarsRoverPosition position) {
            position.setDirection(position.getDirection().turnRight());
        }
    },M {
        @Override
        public void execute(MarsRoverPosition position) {
            position.getDirection().move(position);
        }
    } ;

    public abstract void execute(MarsRoverPosition position);
}
