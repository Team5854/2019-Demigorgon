package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Hatch {
    DoubleSolenoid solenoid;
    DoubleSolenoid solenoidd;
    private boolean toggle;
    private boolean toggley;
    public Hatch() {
        solenoid = new DoubleSolenoid(14, 4, 5);
        solenoidd = new DoubleSolenoid(14, 6, 7);
    }
    private boolean wait = false;
    public void actuate(boolean out) {
        if (out && !wait) {
            toggle = !toggle;
            wait = !wait;
        } else if (wait && !out) {
            wait = !wait;
        }
        if (toggle) {
            solenoid.set(Value.kForward);
        } else {
            solenoid.set(Value.kReverse);
        }
    }

    private boolean waity = false;
    public void uppy(boolean out) {
        if (out && !waity) {
            toggley = !toggley;
            waity = !waity;
        } else if (waity && !out) {
            waity = !waity;
        }
        if (toggley) {
            solenoidd.set(Value.kForward);
        } else {
            solenoidd.set(Value.kReverse);
        }
    }
}