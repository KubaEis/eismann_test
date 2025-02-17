import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PoleRetezcu pole = new PoleRetezcu();
        pole.nactiRetezce();
        pole.poleRetezcu();


        PoleZnaku pole2 = new PoleZnaku();
        pole2.nactiZnaky();
        pole2.pozadovaneZnaky(pole2.getPismena());

        Hodnoceni[] vysvedceni = new Hodnoceni[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Jake je jmeno zaka?");
            String jmeno = sc.nextLine();
            System.out.println("Jaky je predmet zaka?");
            String predmet = sc.nextLine();
            System.out.println("Jake je hodnoceni zaka?");
            int hodnoceni = sc.nextInt();
            sc.nextLine();
            vysvedceni[i] = new Hodnoceni(jmeno, predmet, hodnoceni);
        }
        Hodnoceni nejlepsi = vysvedceni[0];
        for (Hodnoceni student : vysvedceni) {
            if (student.getZnamka() < nejlepsi.getZnamka()) {
                nejlepsi = student;
            }
        }
        System.out.println("zak s nejlepsi znamkou se jmenuje: "+nejlepsi.getNazev());
    }
}