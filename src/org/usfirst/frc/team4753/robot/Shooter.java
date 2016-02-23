package org.usfirst.frc.team4753.robot;

import edu.wpi.first.wpilibj.Talon;

public class Shooter {
	Talon shooterWheelL = new Talon(5);
    Talon shooterWheelR = new Talon(6);
    Talon Angler = new Talon(7);
    Double angle = 0;
    
    public void setAngle(double ang){
    	angle = ang;
    	
    }
    
    public void runAngler(){
    	Angler.set(1);
    }
    public void runAngler(speed){
    	Angler.set(speed);
    }
    
    public void 
}
