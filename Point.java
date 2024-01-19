public class Point{

    private int x;
    private int y;

    public Point(int MyX, int MyY){
        x = MyX;
        y = MyY;


    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int manhattanDistance(Point other){
        int xDist = Math.abs(x - other.getX());
        int yDist = Math.abs(y - other.getY());
    
        return xDist + yDist;
    }
    

    public boolean isCollinear(Point p1, Point p2){

        

        double s1 = (double)(y - p1.getY()) / (x - p1.getX());
        double s2 = (double)(y - p2.getY()) / (x - p2.getX());
        if(x==p1.getX() && x==p2.getX()){
            return true;
        }
       
        return Math.abs(s1 - s2) <.01;

            


    }

}