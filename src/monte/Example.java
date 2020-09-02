package monte;

public class Example {
    public static void main (String[] args) {
        int dartsInsideDisc = 0;
        int datsInsideSquare = 0;
        double discCenterX = 1.0f;
        double discCenterY = 1.0f;
        for (int i = 0; i < 1000; i++) {
            double randomX = Math.random() * 2 - discCenterX; //0.....2
            double randomY = Math.random() * 2 - discCenterY; //0.....2
            boolean insideDisc = (randomX * randomX + randomY * randomY) <= 1;
            boolean insideSquare = true;
            if (insideDisc) {
                dartsInsideDisc++;
            }
            ;
            //========================
            double pieEstimation = (4.0f * dartsInsideDisc) / (datsInsideSquare);
            if(i%100 ==0)
            {
                System.out.printf("step:%d, inside:%d pi estimation: %f", i, dartsInsideDisc, pieEstimation);
            }
        }
    }
}
