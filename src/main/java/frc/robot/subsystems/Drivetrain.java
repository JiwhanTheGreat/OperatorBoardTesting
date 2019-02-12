package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Drivetrain extends Subsystem {
    public WPI_TalonSRX leftPrimary, leftSecondary, rightPrimary, rightSecondary;
    public RobotMap robotMap = new RobotMap();

    public Drivetrain(){
        leftPrimary = new WPI_TalonSRX(robotMap.LEFT_PRIMARY);
        leftSecondary = new WPI_TalonSRX(robotMap.LEFT_SECONDARY);
        rightPrimary = new WPI_TalonSRX(robotMap.RIGHT_PRIMARY);
        rightSecondary = new WPI_TalonSRX(robotMap.RIGHT_PRIMARY);

        leftSecondary.follow(leftPrimary);
        rightSecondary.follow(rightPrimary);
    }

    public void initDefaultCommand(){

    }

    public double getLeftPower() {
        return leftPrimary.get();
    }

    public double getRightPower() {
        return rightPrimary.get();
    }
    
    public void setPowerLeft(double power){
        leftPrimary.set(power);
    }

    public void setPowerRight(double power){
        rightPrimary.set(power);
    }

    public void setPowers(double left, double right) {
        setPowerLeft(left);
        setPowerRight(right);
    }

    public double getLeftPosition() {
        return leftPrimary.getSelectedSensorPosition();
    }

    public double getRightPosition() {
        return rightPrimary.getSelectedSensorPosition();
    } 

    public void resetLeftPosition() {
        leftPrimary.setSelectedSensorPosition(0);
    }

    public double getPosition() {
        return (getLeftPosition() + getRightPosition())/2;
    }

    public void stop() {
        leftPrimary.stopMotor();
        rightPrimary.stopMotor();
    }

}