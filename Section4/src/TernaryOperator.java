public class TernaryOperator {
    public static void main(String[] args) {
        String makeOfCar = "Vol";
        boolean isDomestic = makeOfCar == "Vol" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }
}
