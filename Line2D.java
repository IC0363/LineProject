public class Line2D {
    private Point point1;
    private Point point2;

    public Line2D(Point p1, Point p2){
        point1 = p1;
        point2 = p2;


    }
    public Line2D (int x1, int y1, int x2, int y2){
        point1 = new Point(x1,y2);
        point2 = new Point(x2,y2);


    }
    public Point getp1(){
        return point1;
    }
    public Point getp2(){
        return point2;
    }

    public String toString(){
        return "[(" + point1 + "), (" + point2 + ")]";
    }
    public double getSlope(){
        double slope1 = point2.getX() - point1.getX(); 
        double slope2 = point2.getY()-point1.getY();
        if(slope1 ==0){
             throw new IllegalArgumentException("undefined slope");

        }
        return slope2/slope1;
    }
    public boolean isCollinear(Point p){
        double Xvalue = point2.getX() - point1.getX(); 
        double Yvalue = point2.getY()-point1.getY();
        double slope1 = Yvalue/Xvalue;

        double slope2 = (double) (p.getY() - point1.getY()) / (p.getX() - point1.getX());

        return Math.abs(slope1-slope2)<.01;

    }



    
}
