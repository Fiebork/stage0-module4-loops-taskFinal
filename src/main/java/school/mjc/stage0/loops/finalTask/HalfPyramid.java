package school.mjc.stage0.loops.finalTask;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String s = "*";
        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder sRepeated = new StringBuilder(IntStream.range(0, i).mapToObj(a -> s).collect(Collectors.joining("")));
            sRepeated.append(" ".repeat(Math.max(0, cathetusLength - sRepeated.length())));
            System.out.println(sRepeated.reverse());
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
