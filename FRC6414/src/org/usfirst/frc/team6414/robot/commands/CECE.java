package org.usfirst.frc.team6414.robot.commands;

import org.usfirst.frc.team6414.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CECE extends Command {

    public CECE() {
    	this.requires(Robot.chassis);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.dongqilai();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.buyaodong();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
