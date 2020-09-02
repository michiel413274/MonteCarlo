package monte;

public interface IHitTest {
    public enum RESULT{
        INSIDE,
        OUTSIDE,
        BORDER
    };
    public RESULT test(double x, double y);
}
