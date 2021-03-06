package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
        @Test
        public void should_add_coordinates_direct_when_execute_given_init_position_x0_y0_direction_N( ){

            MarsRover marsRover = new MarsRover(new MarsRoverPosition(0, 0, Direction.N));


            Assert.assertNotNull(marsRover);
            Assert.assertEquals(0,marsRover.getMarsRoverPosition().getCoordinates_X());
            Assert.assertEquals(0,marsRover.getMarsRoverPosition().getCoordinates_Y());
            Assert.assertEquals(Direction.N,marsRover.getMarsRoverPosition().getDirection());

    }
    @Test
    public void should_add_coordinatesY_by_1_when_execute_M_command_given_init_position_x0_y0_direction_N( ){

        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0, 0, Direction.N));


        marsRover.execute(Command.M);

        Assert.assertNotNull(marsRover);
        Assert.assertEquals(0,marsRover.getMarsRoverPosition().getCoordinates_X());
        Assert.assertEquals(1,marsRover.getMarsRoverPosition().getCoordinates_Y());
        Assert.assertEquals(Direction.N,marsRover.getMarsRoverPosition().getDirection());

    }




}
