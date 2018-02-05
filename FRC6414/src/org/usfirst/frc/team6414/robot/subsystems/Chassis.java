package org.usfirst.frc.team6414.robot.subsystems;

import org.usfirst.frc.team6414.robot.Robot;
import org.usfirst.frc.team6414.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Chassis extends Subsystem {
	private CANTalon frontLeft;
	private CANTalon backLeft;
	

	private CANTalon frontRight;
	private CANTalon backRight;
	
	
	public Chassis(){
		frontLeft = new CANTalon(RobotMap.DRIVE_FRONT_LEFT);
		backLeft = new CANTalon(RobotMap.DRIVE_BACK_LEFT);
		frontRight = new CANTalon(RobotMap.DRIVE_FRONT_RIGHT);
		backRight = new CANTalon(RobotMap.DRIVE_BACK_RIGHT);
				
	}
	
	public void mecanumrotate(){
	double FL, BL, FR, BR;
	FL = Robot.oi.getDrivingJoyStickX() + Robot.oi.getDrivingJoyStickY() - Robot.oi.getDrivingJoyStickZ();
	BL = -Robot.oi.getDrivingJoyStickX() + Robot.oi.getDrivingJoyStickY() + Robot.oi.getDrivingJoyStickZ();
	FR = -Robot.oi.getDrivingJoyStickX() + Robot.oi.getDrivingJoyStickY() + Robot.oi.getDrivingJoyStickZ();
	BR = Robot.oi.getDrivingJoyStickX() + Robot.oi.getDrivingJoyStickY() - Robot.oi.getDrivingJoyStickZ();
	
	if(FL>1){
		FL = 1;
	}
	if(FL<-1){
		FL = -1;
	}
	if(BL>1){
		BL = 1;
	}
	if(BL<-1){
		BL = -1;
	}
	if(FR>1){
		FR = 1;
	}
	if(FR<-1){
		FR = -1;
	}
	if(BR>1){
		BR = 1;
	}
	if(BR<-1){
		BR = -1;
	}	
	
	frontLeft.set(FL);
	backLeft.set(BL);
	frontRight.set(FR);
	backRight.set(BR);
	
	}
	

	public void stop() {
	frontLeft.set(0.0);
	backLeft.set(0.0);
	frontRight.set(0.0);
	backRight.set(0.0);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

