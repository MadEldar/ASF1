package labSession05A;

import java.util.ArrayList;
import java.util.Collections;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle() {
        while (line1 != line2 && line2 != line3 && line1 != line3) {
            System.out.println("This is not a isosceles triangle.");
            changeLine();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(line1);
        arr.add(line2);
        arr.add(line3);
        line1 = Collections.min(arr);
        line2 = line1;
        line3 = Collections.max(arr);
    }

    public static void main(String[] args) {
        IsoscelesTriangle i = new IsoscelesTriangle();
    }
}
