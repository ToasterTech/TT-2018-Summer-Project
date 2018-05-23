package main.java.frc.team5332.commands.drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import main.java.frc.team5332.robot.CMap;

public class JoystickDrive extends Command{

    public JoystickDrive(){
        requires(CMap.drivetrain);
    }

    @Override
    protected void execute() {
        CMap.drivetrain.tankDrive(-CMap.gamepad.getRawAxis(CMap.gamepad_leftYAxis), -CMap.gamepad.getRawAxis(CMap.gamepad_rightYAxis));
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        CMap.drivetrain.tankDrive(0, 0);
    }
}
