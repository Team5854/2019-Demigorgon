package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class CargoBuket {
    private TalonSRX motor;
    public CargoBuket(int id) {
        motor = new TalonSRX(id);
    }

    public void shoot(boolean in, boolean out) {
        if (in) {
            motor.set(ControlMode.PercentOutput, 1);
        } else if (out) {
            motor.set(ControlMode.PercentOutput, -1);
        } else {
            motor.set(ControlMode.PercentOutput, 0);
        }
    }

}