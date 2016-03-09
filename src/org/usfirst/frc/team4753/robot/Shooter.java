package org.usfirst.frc.team4753.robot;

import edu.wpi.first.wpilibj.Talon;

public class Shooter
{
	Talon leftShootingMotor;
	Talon rightShootingMotor;
	double angle;
	public Shooter (Talon leftMotor, Talon rightMotor)
	{
		leftShootingMotor = leftMotor;
		rightShootingMotor = rightMotor;
	}
	
	public void setAngle(double ang)
	{
		angle = ang; 
		
	}
	
}
	
    
   
    	

    
   