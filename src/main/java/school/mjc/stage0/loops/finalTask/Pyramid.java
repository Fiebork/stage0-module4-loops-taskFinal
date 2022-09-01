package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            return;
        }
        StringBuffer output = new StringBuffer();
        for (int i = 0; i < cathetusLength; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = cathetusLength - 1; j > 0; j--) {
                if (j > cathetusLength - 1 - i) {
                    s.append(" ");
                } else {
                    s.append(j + 1);
                }
            }
            s.reverse();
            output.insert(0, s.reverse().toString() + "1" + s.reverse().toString().trim() + "\n");
        }
        output.deleteCharAt(output.length() - 1);
        System.out.println(output);
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
