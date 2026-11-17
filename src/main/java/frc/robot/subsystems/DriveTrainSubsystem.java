// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.DriveTrainConstants.OperatorConstants;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class DriveTrainSubsystem extends SubsystemBase {
  private final WPI_VictorSPX m_luffy = new WPI_VictorSPX(OperatorConstants.LEFT_FRONT_MOTOR);
  private final WPI_VictorSPX m_rafeal = new WPI_VictorSPX(OperatorConstants.RIGHT_FRONT_MOTOR);
  private final WPI_TalonSRX m_rob = new WPI_TalonSRX(OperatorConstants.RIGHT_BACK_MOTOR);
  private final WPI_TalonSRX m_libby = new WPI_TalonSRX(OperatorConstants.LEFT_BACK_MOTOR);
  
  /** Creates a new DriveTrainSubsystem. */
  public DriveTrainSubsystem() {}

  public Command leftSideForward() {
    return null;
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
