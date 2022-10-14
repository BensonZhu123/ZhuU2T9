public class RightTriangle {
    double base;
    double height;

    public RightTriangle(double b, double h) {
        base = b;
        height = h;
    }

    public double hypotenuse(){
        return Math.pow((Math.pow(base,2)+Math.pow(height,2)),0.5);
    }
}
