package monte;

public class Union extends Shape{
    private Shape A;
    private Shape B;

    public Union(Shape a, Shape b){
        this.A = a;
        this.B = B;
    }

    @Override
    public RESULT test(double x, double y) {
        if(A.test(x, y) != RESULT.OUTSIDE)
        {
            return A.test(x, y);
        }
        if(B.test(x, y) != RESULT.OUTSIDE)
        {
            return B.test(x, y);
        }
        return RESULT.OUTSIDE;
    }

    @Override
    public double GetMinY() {
        return 0;
    }

    @Override
    public double GetMinX() {
        return 0;
    }

    @Override
    public double GetMaxY() {
        return 0;
    }

    @Override
    public double GetMaxX() {
        return 0;
    }
}
