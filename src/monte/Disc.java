package monte;

public class Disc extends Shape  {
    private Point center;
    private double radius;
    private double r_squared;

    public Disc(Point center,double radius) {
        this.center=center;
        this.radius=radius;
        this.r_squared=radius*radius;
    }

    @Override
    public RESULT test(double x, double y) {
        double t=Math.pow(x-center.getX(),2)+Math.pow(y-center.getY(),2);
        if(t<r_squared) {
            return RESULT.INSIDE;
        }else
        if(t>r_squared){
            return RESULT.OUTSIDE;
        }else {
            return RESULT.BORDER;
        }
    }

    @Override
    public double GetMinX() {
        return center.getX()-radius;
    }

    @Override
    public double GetMinY() {
        return center.getY()-radius;
    }

    @Override
    public double GetMaxX() {
        return center.getX()+radius;
    }

    @Override
    public double GetMaxY() {
        return center.getY()+radius;
    }
}
