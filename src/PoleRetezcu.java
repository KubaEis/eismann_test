import java.util.Scanner;

public class PoleRetezcu {
    static Scanner sc = new Scanner(System.in);
    public String[] poleR;
    public void nactiRetezce(){
        System.out.println("nacti do pole ctyri slova: ");
        poleR = new String[4];
        for (int i = 0; i < poleR.length; i++){
            System.out.println("pozice "+i+": ");
            poleR[i] = sc.nextLine();
        }
    }
    public String[] poleRetezcu(){
        for (int i = 0; i < poleR.length; i++){
            System.out.print(poleR[i]+"-");
        }
        return poleR;
    }

}
