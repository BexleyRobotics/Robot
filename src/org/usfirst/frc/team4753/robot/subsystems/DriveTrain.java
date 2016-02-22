package org.usfirst.frc.team4753.robot.subsystems;
import org.usfirst.frc.team4753.robot.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	Joystick sticky = OI.stick; 
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void joystickInput(Joystick sticky)
    {
    	robot.tankdrive(left, right);
    }
}

