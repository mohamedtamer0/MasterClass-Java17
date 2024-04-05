public class MethodOverloadingChallenge {

    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCM(5, 8) + "CM");
        System.out.println("68in = " + convertToCM(68) + "CM");
    }

    public static double convertToCM(int inches) {
        return inches * 2.54;
    }

    public static double convertToCM(int feet, int inches) {
        return convertToCM(((feet * 12) + inches));
    }
}
