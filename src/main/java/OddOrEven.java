import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {  //metodus

            Scanner reader = new Scanner(System.in); //elohivom a coddal behozzza a szamot, amit beutok a keyboardbol
            System.out.print("Enter a number: ");
            int num = reader.nextInt(); //ezzel dolgozod fel ascannalest
            if(num % 2 == 0)  //ha a szamot elosztod 2vel, a szazalek kimutatja a maradekot. ha nincs maradek paros, ha nem akkor paratlan
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
}
