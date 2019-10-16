package labSession05A;

import java.util.ArrayList;
import java.util.Collections;

public class RightTriangle extends Triangle {

    private boolean checkRightAngled(int lineFirst, int lineSecond, int lineThird) {
        return lineFirst == Math.sqrt(Math.pow(lineSecond, 2) + Math.pow(lineThird, 2)) ||
                lineSecond == Math.sqrt(Math.pow(lineFirst, 2) + Math.pow(lineThird, 2)) ||
                lineThird == Math.sqrt(Math.pow(lineFirst, 2) + Math.pow(lineSecond, 2));
    }

    public RightTriangle() {
        while (!checkRightAngled(line1, line2, line3)) {
            System.out.println("This is not a right triangle.");
            changeLine();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(line1);
        arr.add(line2);
        arr.add(line3);
        line1 = Collections.min(arr);
        arr.remove(Integer.valueOf(line1));
        line2 = Collections.min(arr);
        arr.remove(Integer.valueOf(line2));
        line3 = Collections.min(arr);
    }

    public double getArea() {
        return (double) line1 * line2 / 2;
    }

    public static void main(String[] args) {
        RightTriangle r = new RightTriangle();
    }
}
