import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1.Scrieti un program care afiseaza “Imi place Java”

        System.out.println("Imi place Java");

        /* 2.Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”*/

        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");

        /* 3.Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.*/

        int a = 24;
        int d = a-6;
        System.out.println(d);

        /* 4. Scrieti un program in care cititi o propozitie de la tastatura. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti orice propozitie: ");

        String propozitie = scanner.nextLine();

        System.out.println("Propozitia introdusa este: " +propozitie);

        myVariables("Java is ",1000000,true);
        douaNumere();
        exercitiulsapte();
        opt();

    }

    /* 5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un String si un boolean, apoi apelati metoda din metoda “main” */

    static void myVariables(String text, int age, boolean isJavaHard) {

        //boolean isJavahard = true;

        System.out.println(text + age + " times harder than I thought");
        System.out.println(isJavaHard);

    }

    /* 6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran. */

    public static void douaNumere() {

        System.out.println ("Introduceti primul numar:");

        Scanner scanner = new Scanner(System.in);
        double numar1 = scanner.nextDouble();

        System.out.println("Introduceti al doilea numar:");

        double numar2 = scanner.nextDouble();

        String ambele = scanner.nextLine();

        System.out.println("Numerele introduse sunt :" +numar1 + " si " + numar2);

    }
     /* 7. Scrieti un program in care cititi de la tastatura un numar, si calculati: - rezultatul sumei cu 5
- rezultatul scaderii cu 12.3
- rezultatul inmultirii cu -3.2
- rezultatul impartirii cu 4
- rezultatul modulului cu 6 */

    public static void exercitiulsapte() {

        System.out.println ("Introduceti orice numar:");

        Scanner scanner = new Scanner(System.in);
        double oricenumar = scanner.nextDouble();
        double a = oricenumar + 5;
        String rezultat = scanner.nextLine();

        System.out.println("Plus 5 egal: " +a);
        float b = (float) (oricenumar - 12.3);
        System.out.println("Minus 12.3 egal: " +b);
        double c = oricenumar * -3.2;
        System.out.println("Inmultit cu -3.2 egal: " +c);
        double d = oricenumar % 6;
        System.out.println("Modul cu 6 egal: " +d);
    }
    /* Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa fie 12 si 2: */

    public static void opt() {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}