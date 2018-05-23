package main.java.frc.team5332.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import main.java.frc.team5332.commands.drivetrain.JoystickDrive;

// My name is Jonathan Daniel.
public class Robot extends IterativeRobot {
    @Override
    public void robotInit() {

    }

    @Override
    public void teleopInit() {
        Scheduler.getInstance().add(new JoystickDrive());
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}