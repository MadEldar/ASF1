package labSession05A;

public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle() {
        while (line1 != line3 || line1 != line2) {
            System.out.println("This is not an equilateral triangle");
            changeLine();
        }
        line2 = line1;
        line3 = line1;
    }
}
