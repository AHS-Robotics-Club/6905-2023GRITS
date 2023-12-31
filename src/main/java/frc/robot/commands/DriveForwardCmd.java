package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveForwardCmd extends CommandBase {
    private final DriveSubsystem driveSubsystem; 
    private final double distance; // Used if we're using encoders


    public DriveForwardCmd(DriveSubsystem driveSubsystem, double distance) {
        this.driveSubsystem = driveSubsystem; 
        this.distance = distance; 
        addRequirements(driveSubsystem);
    }


    @Override
    public void initialize() {
        System.out.println("DriveForwardCmd started!");        
    }

    @Override
    public void execute() {
        driveSubsystem.setMotors(0.5, 0.5);
    }

    @Override

    public void end(boolean interrupted) {
        driveSubsystem.setMotors(0, 0);
        System.out.println("DriveForwardCmd ended!");
    }



}
