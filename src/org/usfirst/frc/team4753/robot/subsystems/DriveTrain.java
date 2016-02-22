package org.usfirst.frc.team4753.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void joystickInput(Joystick)
    {
    	robot.tankdrive(left, right);
    }
}

