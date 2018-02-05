package org.usfirst.frc.team6414.robot.commands;

import org.usfirst.frc.team6414.robot.Robot;
import org.usfirst.frc.team6414.robot.subsystems.Solenoid;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OpenSolenoid extends Command {

	
    public OpenSolenoid() {
    	
    	this.requires(Robot.solenoid);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.solenoid.open();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.solenoid.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}