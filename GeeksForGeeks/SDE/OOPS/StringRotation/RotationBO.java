package OOPS.StringRotation;

public class RotationBO {

    StringRotationFactory factory;

    public RotationBO(StringRotationFactory factory) {
        this.factory = factory;
    }

    //try to implement looping
    public boolean checkForEquality(String s1, String s2, int pos) {
        if (s1.length() != s2.length())
            return false;

        for(IRotation rotation: factory.getRotations()){
            if(rotation.rotate(s1, pos).equals(s2))
                return true;
        }
        return false;
    }

}
