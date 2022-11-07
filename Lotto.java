import java.util.Random;
public class Lotto {
    public static void main (String [] args){
     // Überprüfe die Anzahl der Argumente
      if(args.length !=2) {
        System.out.println("ERROR:⁢ Bitte genau 2 Argumente übergeben!");
        return;
       }
     // überprüfe ob n und m gültige Werte haben 
      int n = Integer.parseInt(args[0]);
      int m = Integer.parseInt(args[1]);
      if (n<1 || n>m) {
        System.out.println("ERROR:⁢ n muss >=1 und <=m sein");
        return;
      }
      Random rand = new Random();
      for (int i=1;i<=n;++i){
        int rnd = rand.nextInt(m+1);
        System.out.print(", "+rnd);
      }

    }

}
