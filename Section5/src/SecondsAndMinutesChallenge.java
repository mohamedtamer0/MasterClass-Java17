public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    private static String getDurationString(int seconds) {
        //Two step approach to get hours
        int minutes = seconds / 60;
        int hours = minutes / 60;
        System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("remainingMinutes = " + remainingMinutes);
        return "";
    }

    private static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "S";
    }
}
