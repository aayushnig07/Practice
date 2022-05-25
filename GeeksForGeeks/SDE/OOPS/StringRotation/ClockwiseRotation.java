package OOPS.StringRotation;

public class ClockwiseRotation implements IRotation {

    @Override
    public String rotate(String s, int pos) {
        return s.substring(2, s.length()) + s.substring(0, pos);
    }

}
