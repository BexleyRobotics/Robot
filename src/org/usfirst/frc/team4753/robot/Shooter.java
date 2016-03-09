package org.usfirst.frc.team4753.robot;

import edu.wpi.first.wpilibj.Talon;
import org.usfirst.frc.team4753.robot.RobotMap;

public class Shooter 
{
	
	Talon leftmotor = shooterWheelL;
	double angle;
    
    public void setAngle(double ang)
    {
    	angle = ang;
    	
    }
    
   
    	

    
    public void runAngler(speed){
    	Angler.set(speed);
    }
}
