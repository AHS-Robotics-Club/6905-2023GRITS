// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.concurrent.CancellationException;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

  private final CANSparkMax leftMain = new CANSparkMax(6, MotorType.kBrushed);
  private final CANSparkMax leftFollower = new CANSparkMax(7, MotorType.kBrushed);
  private final CANSparkMax rightMain = new CANSparkMax(8, MotorType.kBrushed);
  private final CANSparkMax rightFollwer = new CANSparkMax(9, MotorType.kBrushed);


  /** Creates a new ExampleSubsystem. */
  public DriveSubsystem() {
    leftMain.setInverted(false);
    leftFollower.setInverted(false);
    rightMain.setInverted(true);
    rightFollwer.setInverted(true);
  }

  // /**
  //  * Example command factory method.
  //  *
  //  * @return a command
  //  */
  // public CommandBase exampleMethodCommand() {
  //   // Inline construction of command goes here.
  //   // Subsystem::RunOnce implicitly requires `this` subsystem.
  //   return runOnce(
  //       () -> {
  //         /* one-time action goes here */
  //       });
  // }

  // /**
  //  * An example method querying a boolean state of the subsystem (for example, a digital sensor).
  //  *
  //  * @return value of some boolean subsystem state, such as a digital sensor.
  //  */
  // public boolean exampleCondition() {
  //   // Query some boolean state, such as a digital sensor.
  //   return false;
  // }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setMotors(double leftSpeed, double rightSpeed) {
    leftMain.set(leftSpeed);
    leftFollower.set(leftSpeed);
    rightMain.set(-rightSpeed);
    rightFollwer.set(-rightSpeed);
  }


  // @Override
  // public void simulationPeriodic() {
  //   // This method will be called once per scheduler run during simulation
  // }
}
