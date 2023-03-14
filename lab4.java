import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of the base length of the square pyramid >> ");
        double a = scan.nextDouble();

        System.out.println("Enter the value of the height of the pyramid >> ");
        double h = scan.nextDouble();

        System.out.println("Enter the value of the radius of the sphere >> ");
        double r = scan.nextDouble();

        Solid pyramid = new Pyramid(a, h);
        Solid sphere = new Sphere(r);

        double volumePyramid = pyramid.getVolume();
        double volumeSphere = sphere.getVolume();

        System.out.println("The volume of the pyramid = " + volumePyramid);
        System.out.println("The volume of the sphere = " + volumeSphere);

        // Static field example
        System.out.println("Number of basis sides of pyramid = " + Pyramid.NUMBER_OF_BASIS_SIDES);
        
        // Comparison of two objects example
        System.out.println("Is the volume of pyramid greater than the volume of sphere? " + compareVolumes(pyramid, sphere));
    }

    public static boolean compareVolumes(Solid s1, Solid s2) {
        return s1.getVolume() > s2.getVolume();
    }
}
