package org.usfirst.frc.team6414.robot.commands;

import org.usfirst.frc.team6414.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class EncoderDrivebyjoystick extends Command {
    public EncoderDrivebyjoystick() {
        this.requires(Robot.encoderchassis);
    }

    protected void initialize() {
    }

    protected void execute() {
     Robot.encoderchassis.driveByJoystick(Robot.oi.getDrivingJoyStickX(), Robot.oi.getDrivingJoyStickY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.encoderchassis.stop();
    }

    protected void interrupted() {
    }
}

/**
 *
 */
