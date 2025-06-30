package Logic_Building.Easy_Problems;

public class RectanglesOverlap{

    static class point{
        int x,y;
        point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    // Returns true if two rectangles (l1, r1) and (l2, r2) overlap -Time Complexity : O(1)
    //Space Complexity : O(1)
    public static boolean doOverlap(point l1, point r1, point l2, point r2){

        // If one rectangle is to the left of the other
        if(l1.x > r2.x || l2.x > r1.x)
            return false;

        // If one rectangle is above the other
        if(r1.y > l1.y || r2.y > l1.y)
            return false;

        return true;
    }

    public static void main(String[] args) {
      point l1 = new point(0,10);
      point r1 = new point(10,0);
      point l2 = new point(5,5);
      point r2 = new point(15,0);

        if (doOverlap(l1, r1, l2, r2))
            System.out.println("Rectangles Overlap");
        else
            System.out.println("Rectangles Don't Overlap");
    }
}