import java.util.Scanner;

public class PoleZnaku {
    static Scanner sc = new Scanner(System.in);
    private int N;
    private char[] pismena;
    private int pozice;



    public void nactiZnaky() {
        System.out.println("kolik chces nacist znaku?");
        N = sc.nextInt();
        pismena = new char[N];
        System.out.println("Nacist pole znaku :");
        for (int i = 0; i < N; i++) {
            System.out.println("pozice "+i+": ");
            pismena[i] = sc.next().charAt(0);
        }
    }

    public char[] pozadovaneZnaky(char[] pismena) {
        System.out.println("Na jake pozici chcete nacist znaku?");
        pozice = sc.nextInt();
        System.out.println("Znak na pozici "+pozice+" je : "+pismena[pozice]);
        return pismena;
    }

    public char[] getPismena() {
        return pismena;
    }
}
