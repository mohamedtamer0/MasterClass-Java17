package org.example;

public class TheWhileAndDoWhileStatements {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        boolean isReady = true;
        while (isReady) {
            if (j > 5) break;
            System.out.println(j);
            j++;
        }


        int x = 1;
        boolean isReadyx = true;
        do {
            if (x > 5) break;
            System.out.println(x);
            x++;
            isReadyx = (x > 0);
        } while (isReadyx);


        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

    }
}
