public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(int seconds) {
        //Two step approach to get hours

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds
                    + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
        int hours = minutes / 60;
        System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("remainingMinutes = " + remainingMinutes);
        return "";
    }

    private static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes
                    + "), must be a positive integer value";
        }

        if (seconds <= 0 || seconds >= 0) {
            return "Invalid data for seconds(" + minutes
                    + "), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "S";
    }
}
