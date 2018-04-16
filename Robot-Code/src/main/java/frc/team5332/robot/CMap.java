package main.java.frc.team5332.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The purpose of this class is to hold all of the port numbers for each sensor, motor and joystick button. That way, we
 * can create these motors and sensors in each subsystem as we go on.
 */
public class CMap {
    //Motor Port Numbers


    //Sensor Port Numbers


    //Joysticks
    Joystick gamepad = new Joystick(0);
    Joystick elevaorStick = new Joystick(1);

    //Joystick Buttons


    //Pneumatics
    public static Compressor compressor = new Compressor();

    //Subsystems


    /**
     * This method sets up the whileHeld(), whenPressed() and whenReleased() cases for each of the joystick buttons.
     */
    public static void setupJoystickButtons(){

    }
}
