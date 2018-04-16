package main.java.frc.team5332.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {

    /**
     * This method is ran when the robot turns on. Anything that needs to be initialized
     * like motors or sensors needs to be initialized here.
     */
    @Override
    public void robotInit() {
        CMap.setupJoystickButtons();
        CMap.compressor.setClosedLoopControl(true);
    }

    /**
     * This method is ran once when autonomous begins. Here, we would schedule commands taht would run
     * before the match begins the autonomous period. This would be things like telling the robot to lower
     * the intake, or start searching for the Game Specific Message.
     */
    @Override
    public void autonomousInit() {

    }

    /**
     * This method is called every 20 ms during autonomous and will execute the actions during the autonomous period. In
     * other words, whatever autonomous the robot has decided to run, it will run here.
     */
    @Override
    public void autonomousPeriodic() {

    }

    /**
     * This method is called before teleop begins and is used to do things such as clear out all of the autonomous commands
     * and prepare the robot for human control.
     */
    @Override
    public void teleopInit() {

    }

    /**
     * This method is called every 20 ms during teleoperated period and is used to allow the human to control the robot.
     */
    @Override
    public void teleopPeriodic() {

    }
}