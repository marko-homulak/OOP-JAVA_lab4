//import static java.lang.Math.pow;

public class Pyramid extends Solid {
   
   private double A; // the length of the side of the base
   private double H; // the height of the pyramid

   public static final int NUMBER_OF_BASIS_SIDES = 4; // Static field

   Pyramid(double a, double h) {
      this.A = a;
      this.H = h;
      volume = (1 / 3.) * Math.pow(a, 2) * h;
  }
  
  public void setA(double a) {
      this.A = a;
   }

   public void setH(double h) {
      this.H = h;
   }

  public double getA() {
      return A;
  }
  
  public double getH() {
      return H;
  }

  public double getVolume() {
      return volume;
  }

}
