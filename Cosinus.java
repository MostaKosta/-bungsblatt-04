import java.lang.Math.*;
public class Cosinus {
    private static int fakultät(int fact){
        for(int i=1;i<=fact;i++){
            fact=fact*i;
        }
        return fact;
    }
    private static double calculate(double x){
        double sum =0;
        for (int i=0;i<=10;++i){
         sum+= Math.pow(-1,i)*Math.pow(x,2*i)/fakultät(2*i);
        }
        return sum;
    }
    public static void main(String[] args) {
        // Überprüfe die Anzahl der Argumente
        if(args.length < 1) {
            System.out.println("ERROR:⁢ Bitte mindestens ein Argument übergeben!");
            return;
        }  
        double x = Double.parseDouble(args[0]);
        double pi = 2*Math.PI;
        // x inside the range
        if (0<=x<=2*pi) {
            System.out.format("the value of cos is %.5f",calculate(x));
        }
        // x outside of the range
        else if (x>2*pi || x<2*pi){
            System.out.format("the value of cos is %.5f",calculate(x-2*pi));
        }

    }
}
