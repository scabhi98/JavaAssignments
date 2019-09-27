import java.util.Scanner;

public class Triangle{
    float side1, side2, side3;
    String type;
    Triangle(){
        side1 = side2 = side3 = 0;
    }
    public boolean makeTriangleWithSides(float side_1, float side_2, float side_3){
        if(side_1 + side_2 > side_3 && side_1 + side_3 > side_2 && side_2 + side_3 > side_3){
            side1 = side_1;
            side2 = side_2;
            side3 = side_3;
            return true;
        }
        else
            return false;
    }
    public boolean getSides() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Enter Three Sides: ");
        float s1,s2,s3;
        s1 = sc.nextFloat();
        s2 = sc.nextFloat();
        s3 = sc.nextFloat();
        sc.close();
        return this.makeTriangleWithSides(s1, s2, s3);
    }
    public double getArea(){
        float s = (side1 + side2 + side3)/2;
        double area;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}