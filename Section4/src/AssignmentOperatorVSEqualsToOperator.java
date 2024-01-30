public class AssignmentOperatorVSEqualsToOperator {
    public static void main(String[] args) {
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen 'isCar'");//show msg
        }

        boolean isCar2 = false;
        if (isCar2 == true) {
            System.out.println("This is not supposed to happen 'isCar2'");//not show msg
        }

        boolean isCar3 = false;
        if (!isCar2) { //Not
            System.out.println("This is not supposed to happen 'isCar3'");//show msg
        }
    }
}
