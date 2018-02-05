package org.usfirst.frc.team6414.robot.subsystems;

import org.usfirst.frc.team6414.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoid extends Subsystem {
	private static DoubleSolenoid doubleSolenoid;
	
	public Solenoid(){
		doubleSolenoid = new DoubleSolenoid(7,RobotMap.SOLENOID_FWD_CHANNEL,RobotMap.SOLENOID_BWD_CHANNEL);
	}

	public void close(){ 							
		doubleSolenoid.set(DoubleSolenoid.Value.kForward);	
	}

	public void open(){						
		doubleSolenoid.set(DoubleSolenoid.Value.kReverse); 	
	}

	public void stop()
	{
		doubleSolenoid.set(DoubleSolenoid.Value.kOff);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

