package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
* This class is the glue that binds the controls on the physical operator
* interface to the commands and command groups that allow control of the robot.
*/
public class OI {

 //// CREATING BUTTONS
 // One type of button is a joystick button which is any button on a
 //// joystick.
 // You create one by telling it which joystick it's on and which button
 // number it is.
  Joystick operator = new Joystick(0);
  public Joystick getJoystick(){
    return operator;
  }
  
  


  public void setupOperator(){
    
  }
 }