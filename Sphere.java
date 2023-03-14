import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere extends Solid {
   
   private double R; // the radius of the sphere

   Sphere(double r) {
      this.R = r;
      volume = (4 / 3.) * PI * pow(r, 3);
   }

   public void setR(double r) {
      this.R = r;
   }

   public double getR() {
      return R;
   }

   public double getVolume() {
      return volume;
   }

}
