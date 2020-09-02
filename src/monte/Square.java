package monte;

public class Square extends Shape{
    private double aX,aY,bX,bY;

    public Square(Point center,Double side) {
        double halfSide=side/2;
        aX=center.getX()-halfSide;//minimum X
        aY=center.getY()-halfSide;//minimum Y
        bX=center.getX()+halfSide;//maximum X
        bY=center.getY()+halfSide;//maximum Y
    }

    @Override
    public RESULT test(double x, double y) {
        if(x < aX) return RESULT.OUTSIDE;
        if(y < aY) return RESULT.OUTSIDE;
        if(x > bX) return RESULT.OUTSIDE;
        if(y > bY) return RESULT.OUTSIDE;
        //for sure we are inside or on the border
        if(x == aX) return RESULT.BORDER;
        if(y == aY) return RESULT.BORDER;
        if(x == bX) return RESULT.BORDER;
        if(y == bY) return RESULT.BORDER;
        //for sure we are inside
        return RESULT.INSIDE;
    }

    @Override
    public double GetMinX() {
        return aX;
    }

    @Override
    public double GetMinY() {
        return aY;
    }

    @Override
    public double GetMaxX() {
        return bX;
    }

    @Override
    public double GetMaxY() {
        return bY;
    }
}
