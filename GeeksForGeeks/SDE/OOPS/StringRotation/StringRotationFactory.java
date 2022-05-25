package OOPS.StringRotation;

import java.util.ArrayList;
import java.util.List;

//try to implemenet as a factory
public class StringRotationFactory {
    List<IRotation> rotations = new ArrayList<>();

    public List<IRotation> getRotations() {
        return rotations;
    }

    public void setRotations(List<IRotation> rotations) {
        this.rotations = rotations;
    }

    public void registerRotation(IRotation rotation) {
        rotations.add(rotation);
    }
}
// ClockwiseRotation clockwiseRotation;
// AntiClockwiseRotation antiClockwiseRotation;

// public ClockwiseRotation getClockwiseRotation() {
// return clockwiseRotation;
// }
// public void setClockwiseRotation(ClockwiseRotation clockwiseRotation) {
// this.clockwiseRotation = clockwiseRotation;
// }
// public AntiClockwiseRotation getAntiClockwiseRotation() {
// return antiClockwiseRotation;
// }
// public void setAntiClockwiseRotation(AntiClockwiseRotation
// antiClockwiseRotation) {
// this.antiClockwiseRotation = antiClockwiseRotation;
// }

// enum rotationTypes {
// ClockwiseRotation,
// MEDIUM,
// HIGH
// }
