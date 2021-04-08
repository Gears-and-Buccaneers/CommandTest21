// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;


public class SingleMotor extends SubsystemBase {
  /** Creates a new SingleMotor. */
  public SingleMotor() {}

  private final TalonFX main1 = new TalonFX(3);

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void run(double val){
    main1.set(ControlMode.PercentOutput, val);
  }
}
