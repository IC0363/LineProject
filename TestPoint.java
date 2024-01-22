public class TestPoint {
    public static void main(String[]args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,9);
        Point p4 = new Point(6,8);

        Line2D l1 = new Line2D(p1, p2);
        Line2D l2 = new Line2D(p3, p4);
        Line2D l3 = new Line2D(4, 9, 6, 8);
        System.out.println("Testing constructor using 2 Point objects and the toString method");
        System.out.println("Line 1: " + l1.toString());
        System.out.println("Line 2: " + l2.toString());

        System.out.println("Testing constructor using 4 int's and the toString method");

        System.out.println("Line 3 " + l3.toString());


        System.out.println("Testing getP1 and getP2 methods:");
        System.out.println("Line 1, getp1: " + l1.getp1());
        System.out.println("Line 1, getp2: " +l1.getp2());
        System.out.println("Line 2, getp2: " +l2.getp1());
        System.out.println("Line 2, getp2: " +l2.getp2());
        
        System.out.println("Testing getSlope: ");
        System.out.println("Line 1 slope: " + l1.getSlope());
        System.out.println("Line 2 slope: " +l2.getSlope());

        System.out.println("Testing isCollinear: ");

        System.out.println("Line1 and p3: " + l1.isCollinear(p3));
        System.out.println("Line1 and p4: " + l1.isCollinear(p4));
        

    }
    
}
