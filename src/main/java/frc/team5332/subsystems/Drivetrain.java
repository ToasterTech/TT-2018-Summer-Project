package main.java.frc.team5332.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import main.java.frc.team5332.robot.CMap;

public class Drivetrain extends Subsystem {
    SpeedControllerGroup leftDriveMotors, rightDriveMotors;

    public Drivetrain(){
        leftDriveMotors = new SpeedControllerGroup(new VictorSP(CMap.motor_leftDrive1), new VictorSP(CMap.motor_leftDrive2));
        rightDriveMotors = new SpeedControllerGroup(new VictorSP(CMap.motor_rightDrive1), new VictorSP(CMap.motor_rightDrive2));
    }

    @Override
    protected void initDefaultCommand() {

    }

    public void tankDrive(double leftValue, double rightValue){
        leftDriveMotors.set(leftValue);
        rightDriveMotors.set(rightValue);
    }

}
