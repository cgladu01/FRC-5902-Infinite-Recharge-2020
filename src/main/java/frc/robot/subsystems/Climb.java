package frc.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.FlyWheelOutput;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class Climb extends Subsystem {
  OI m_oi = new OI();
  
//check if flyWheel needs to be capital
public final WPI_TalonSRX climb = RobotMap.climb;

  @Override
  public void initDefaultCommand() {
  }

  public void Up (double speed){
    climb.set(speed);
  }

  public void Stop(){
    climb.set(0);
  }

  public void Climbing(){
    boolean xboxY = m_oi.getXbox().getYButton();
    if (xboxY){  
    Up(0.5);
    }else {
    Up(0);
    }
  }
  

}