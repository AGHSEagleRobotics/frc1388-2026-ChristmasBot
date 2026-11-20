package frc.robot.commands;

import frc.robot.subsystems.DriveTrainSubsystem;

import java.util.function.Supplier;
import edu.wpi.first.math.MathUtil;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.Command;


public class DriveCommands extends Command {
    private DriveTrainSubsystem m_driveTrainSubsystem;
    private Supplier<Double> m_speed;
    private double DEADBAND = 0.07;
    
    // Constructor
    public DriveCommands(DriveTrainSubsystem driveTrainSubsystem, Supplier<Double> speed) {
        m_driveTrainSubsystem = driveTrainSubsystem;
        speed = m_speed;

        // Pulls subsystem into Constructor
        addRequirements(m_driveTrainSubsystem);
    }

    // Applies the speed supplier value from the controller to the power in the drive train subsystem
    public void applyPower() {
        double power = m_speed.get();
        m_speed = MathUtil.applyDeadband(m_speed, DEADBAND);
        m_driveTrainSubsystem.setPower(power);
    }

}
