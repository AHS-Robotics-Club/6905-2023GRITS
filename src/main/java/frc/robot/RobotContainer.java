package frc.robot;

import frc.robot.Constants.OIConstants;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.commands.DriveForwardCmd;
import frc.robot.subsystems.DriveSubsystem;



import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
// import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
  private final DriveSubsystem driveSubsystem = new DriveSubsystem();

  private final Joystick joystick1 = new Joystick(0);

  public RobotContainer() {

    driveSubsystem.setDefaultCommand(
      new ArcadeDriveCmd(driveSubsystem, 
      () -> -joystick1.getRawAxis(OIConstants.kArcadeDriveSpeedAxis), 
      () -> joystick1.getRawAxis(OIConstants.kArcadeDriveTurnAxis))
    );



    configureButtonBindings();
  }

  private void configureButtonBindings() {
    new JoystickButton(joystick1, 3); 
  }

  public Command getAutonomousCommand() {
    return new SequentialCommandGroup(
      new DriveForwardCmd(driveSubsystem, 1.5)
    );
  }
}
