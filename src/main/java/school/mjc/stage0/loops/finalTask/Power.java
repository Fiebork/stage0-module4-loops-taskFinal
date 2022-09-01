package school.mjc.stage0.loops.finalTask;

import static java.lang.Math.*;

public class Power {
    public void printPower(int numberToPrint, int power) {
        System.out.println((int) pow(numberToPrint, power));
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
