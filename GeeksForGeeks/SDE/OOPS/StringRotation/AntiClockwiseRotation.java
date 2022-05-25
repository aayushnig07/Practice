package OOPS.StringRotation;

public class AntiClockwiseRotation implements IRotation {

    @Override
    public String rotate(String s, int pos) {
        return s.substring(s.length() - pos, s.length()) + s.substring(0, s.length() - pos);
    }

}
