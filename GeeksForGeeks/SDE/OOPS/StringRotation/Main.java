package OOPS.StringRotation;

public class Main {

    public static void main(String[] args) {

        StringRotationFactory factory = new StringRotationFactory();
        factory.registerRotation(new AntiClockwiseRotation());
        factory.registerRotation(new ClockwiseRotation());
        RotationBO bo = new RotationBO(factory);
        System.out.println(bo.checkForEquality(new String("amazon"), new String("azonam"), 2));
    }

}
