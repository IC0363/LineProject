public class TestPoint {
    public static void main(String[]args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,9);
        Point p4 = new Point(6,8);

        Line2D l1 = new Line2D(p1, p2);
        Line2D l2 = new Line2D(p3, p4);
        Line2D l3 = new Line2D(4, 9, 6, 8);

        System.out.println(l1.toString());
        System.out.println(l2.toString());

        System.out.println(l3.toString());

        System.out.println(l1.getp1());
        System.out.println(l1.getp2());
        System.out.println(l2.getp1());
        System.out.println(l2.getp2());
        System.out.println(l3.getp1());
        System.out.println(l3.getp2());

        System.out.println(l1.getSlope());
        System.out.println(l2.getSlope());

        System.out.println(l1.isCollinear(p3));
        System.out.println(l2.isCollinear(p4));
        

    }
    
}
