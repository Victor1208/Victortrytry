package org.usfirst.frc.team6414.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

import java.sql.Driver;

import org.usfirst.frc.team6414.robot.RobotMap;
import org.usfirst.frc.team6414.robot.commands.EncoderDrivebyjoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class EncoderChassis extends Subsystem {
	private Spark frontLeft;
	private Spark backLeft;
	

	private Spark frontRight;
	private Spark backRight;

	private MecanumDrive robotDrive;
	
	public EncoderChassis(){
		frontLeft = new Spark(RobotMap.DRIVE_FRONT_LEFT);
		backLeft = new Spark(RobotMap.DRIVE_BACK_LEFT);
		frontRight = new Spark(RobotMap.DRIVE_FRONT_RIGHT);
		backRight = new Spark(RobotMap.DRIVE_BACK_RIGHT);
				
		robotDrive = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);
	    robotDrive.setSafetyEnabled(true);
	    robotDrive.setExpiration(0.1);
	    robotDrive.setMaxOutput(1.0);
	}
	

	
    
    public void initDefaultCommand() {
    	setDefaultCommand(new EncoderDrivebyjoystick());
    }


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    
	public void driveByJoystick(double yDir, double xDir){
    		SmartDashboard.putString("driveByJoystick?", yDir + "," + xDir);
    		robotDrive.driveCartesian(yDir, xDir, 0.0);
    	}
    public void stop(){
	   robotDrive.driveCartesian(0, 0, 0);
   }
}
    	

