package main.java.frc.team5332.robot;

import edu.wpi.first.wpilibj.Joystick;
import main.java.frc.team5332.subsystems.Drivetrain;

public class CMap {
    //Motors
    public static int motor_leftDrive1 = 0;
    public static int motor_leftDrive2 = 1;
    public static int motor_rightDrive1 = 2;
    public static int motor_rightDrive2 = 3;

    //Joystick Objects
    public static Joystick gamepad = new Joystick(0);

    //Joystick Axes
    public static int gamepad_leftYAxis = 0;
    public static int gamepad_rightYAxis = 1;

    //Subsystems
    public static Drivetrain drivetrain = new Drivetrain();

}
