package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
        @Test
        public void should_add_coordinates_direct_when_execute_given_init_position_x0_y0_direction_N( ){

            MarsRover marsRover = new MarsRover(new MarsRoverPosition(0, 0, "N"));


            Assert.assertNotNull(marsRover);
            Assert.assertEquals(0,marsRover.getMarsRoverPosition().getCoordinates_X());
            Assert.assertEquals(0,marsRover.getMarsRoverPosition().getCoordinates_Y());
            Assert.assertEquals("N",marsRover.getMarsRoverPosition().getDirection());

    }
    @Test
    public void should_add_coordinatesY_by_1_when_execute_M_command_given_init_position_x0_y0_direction_N( ){

        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0, 0, "N"));


        MarsRoverPosition marsRoverPosition = marsRover.execute("M");

        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(0,marsRoverPosition.getCoordinates_X());
        Assert.assertEquals(1,marsRoverPosition.getCoordinates_Y());
        Assert.assertEquals("N",marsRoverPosition.getDirection());

    }
    @Test

    public void should_direction_W_when_execute_L_command_given_init_position_x0_y0_direction_N( ) {

        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0, 0, "N"));
        MarsRoverPosition marsRoverPosition = marsRover.execute("L");

        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(0,marsRoverPosition.getCoordinates_Y());
        Assert.assertEquals(0,marsRoverPosition.getCoordinates_Y());
        Assert.assertEquals("W",marsRoverPosition.getDirection());
    }
    @Test
    public void should_direction_E_when_execute_R_command_given_init_position_x0_y0_direction_N() {

        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0, 0, "N"));
        MarsRoverPosition marsRoverPosition = marsRover.execute("R");

        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(0,marsRoverPosition.getCoordinates_X());
        Assert.assertEquals(0,marsRoverPosition.getCoordinates_Y());
        Assert.assertEquals("E",marsRoverPosition.getDirection());
    }

    @Test
    public void should_minus_coordinatesX_by_1_when_execute_M_command_given_init_position_x0_y0_direction_W( ) {

        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0, 0, "W"));
        MarsRoverPosition marsRoverPosition = marsRover.execute("M");

        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(-1,marsRoverPosition.getCoordinates_X());
        Assert.assertEquals(0,marsRoverPosition.getCoordinates_Y());
        Assert.assertEquals("W",marsRoverPosition.getDirection());
    }

    @Test
    public void should_direction_S_when_execute_L_command_given_init_position_x0_y0_direction_W( ) {

        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0, 0, "W"));
        MarsRoverPosition marsRoverPosition = marsRover.execute("L");
        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(0,marsRoverPosition.getCoordinates_X());
        Assert.assertEquals(0,marsRoverPosition.getCoordinates_Y());
        Assert.assertEquals("S",marsRoverPosition.getDirection());
    }

    @Test
    public void should_minus_coordinatesY_by_1_when_execute_M_command_given_init_position_x0_y0_direction_S( ) {

        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0, 0, "S"));
        MarsRoverPosition marsRoverPosition = marsRover.execute("M");

        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(0,marsRoverPosition.getCoordinates_X());
        Assert.assertEquals(-1,marsRoverPosition.getCoordinates_Y());
        Assert.assertEquals("S",marsRoverPosition.getDirection());
    }






}
