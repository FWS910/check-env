package com.twschool.practice;

import java.util.List;

public enum Direction {
    N {
        @Override
        public Direction turnLeft() {
            return W;
        }

        @Override
        public Direction turnRight() {
            return E;
        }

        @Override
        public void move(MarsRoverPosition position) {
            position.setCoordinates_Y(position.getCoordinates_Y()+1);
        }
    },W {
        @Override
        public Direction turnLeft() {
            return S;
        }

        @Override
        public Direction turnRight() {
            return N;
        }

        @Override
        public void move(MarsRoverPosition position) {
            position.setCoordinates_X(position.getCoordinates_X()-1);
        }
    },S {
        @Override
        public Direction turnLeft() {
            return E;
        }

        @Override
        public Direction turnRight() {
            return W;
        }

        @Override
        public void move(MarsRoverPosition position) {
            position.setCoordinates_Y(position.getCoordinates_Y()-1);
        }
    },E {
        @Override
        public Direction turnLeft() {
            return N;
        }

        @Override
        public Direction turnRight() {
            return S;
        }

        @Override
        public void move(MarsRoverPosition position) {
            position.setCoordinates_X(position.getCoordinates_X()+1);
        }
    };
    public abstract Direction turnLeft();
    public abstract Direction turnRight();

    public abstract void move(MarsRoverPosition position);
}
