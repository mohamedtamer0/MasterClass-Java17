package org.example;

public class MoreSwitchStatement {
    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value Was 1");
            case 2, 3, 4 -> {
                System.out.println("Was a 2,3,4");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("was not 1,2,3,4, Or 5");
        }

        String month = "APR";
        System.out.println(month + " is in the " + getQuarter(month) + " Quarter");

        String monthEnhanced = "NOV";
        System.out.println(month + " is in the " + getQuarterEnhanced(monthEnhanced) + " Quarter");

        String monthEnhancedWithYield = "MAR";
        System.out.println(month + " is in the " + getQuarterEnhancedWithYield(monthEnhancedWithYield) + " Quarter");
    }

    public static String getQuarter(String month) {
        switch (month) {
            case "JAN":
            case "FEB":
            case "MAR":
                return "1st";
            case "APR":
            case "MAY":
            case "JUN":
                return "2st";
            case "JUL":
            case "AUG":
            case "SEP":
                return "3st";
            case "OCT":
            case "NOV":
            case "DEC":
                return "4st";
        }

        return "bad";
    }

    public static String getQuarterEnhanced(String month) {
        return switch (month) {
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> "2st";
            case "JUL", "AUG", "SEP" -> "3st";
            case "OCT", "NOV", "DEC" -> "4st";
            default -> "bad";
        };

    }

    public static String getQuarterEnhancedWithYield(String month) {
        return switch (month) {
            case "JAN", "FEB", "MAR" -> { yield "1st"; }
            case "APR", "MAY", "JUN" -> "2st";
            case "JUL", "AUG", "SEP" -> "3st";
            case "OCT", "NOV", "DEC" -> "4st";
            default -> {
                yield month + " is bad";
            }
        };

    }
}
