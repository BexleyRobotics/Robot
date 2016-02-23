package org.usfirst.frc.team4753.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
/**
 *
 */
public class driveTrain extends Subsystem {
	Talon motorL1 = new Talon(1);
    Talon motorL2 = new Talon(3);
    Talon motorR1 = new Talon(2);
    Talon motorR2 = new Talon(4);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void joydriveTankOneStick(Joystick joy){
    	setLeftMotors((joy.getY()/2 + joy.getX()/2));
    	setRightMotors((joy.getY()/2 - joy.getX()/2));
    	
    }
    public void joydriveTankTwoSticks(Joystick joy1, Joystick joy2){
    	setLeftMotors(joy1.getY());
    	setRightMotors(joy2.getY());
    }
    
    
    //helpers to be found below
    private void setLeftMotors(double speed){
    	motorL1.set(speed);
    	motorL2.set(speed);
    }
    private void setRightMotors(double speed){
    	motorR1.set(speed);
    	motorR2.set(speed);
    }
}

