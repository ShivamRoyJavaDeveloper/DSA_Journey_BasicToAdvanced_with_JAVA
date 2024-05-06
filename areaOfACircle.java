package i02Basics;

public class areaOfACircle {
    public static void main(String[]args){
        int r = 4;
        double A = 3.14*r*r;
        System.out.println("Area of circle with radius "+r+" is : "+A);

        // Find volume of a sphere

        double radiusA = 9.55;
        double volumeV = (4*3.14*radiusA*radiusA*radiusA)*1/3;
        System.out.println("volume of a "+radiusA+" radius sphere is "+ volumeV);
    }
}
