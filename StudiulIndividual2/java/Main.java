package StudiulIndividual2.java;
//Am introdus aceste biblioteci pentru ca sa pot citi variabilile de la tastatura .
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;//sortarea
import java.util.Comparator;
public class Main {
    public static void main(String[] args) throws IOException {
        Calculator st1 = new Calculator(1, "Calculator", "BK", 2016, 14, 220);
        Boiler b1 = new Boiler(1, "Maxt", "Boiler", 35, 42, 2001, 100, 300);
        Frigider f1 = new Frigider(1, "Frigider", 20019, 35, 42, "BM-5000", 24);

        Calculator st2 = new Calculator(2, "Calculator", "KFC", 2016, 15, 140);
        Boiler b2 = new Boiler(2, "Maxt-3000", "Boiler", 35, 42, 2001, 100, 400);
        Frigider f2 = new Frigider(2, "Frigider", 20019, 35, 240, "BM-3000", 20);

        Calculator st3 = new Calculator(3, "Calculator", "MAC", 2016, 15, 100);
        Boiler b3 = new Boiler(3, "Maxt-2000", "Boiler", 35, 42, 2001, 40, 220);
        Frigider f3 = new Frigider(3, "Frigider", 20019, 35, 220, "BM-200", 15);
       //Meniul
        for (int q = 1; q == 1;q++ ) {
            System.out.println("Menu: ");
            System.out.println("1.  Găsiți obiectul electronic ce conține puterea cuprinsă întrun diapazon citit de la tastatură.");
            System.out.println("2. Sortați aparatele electronice dintr-un oficiu în dependentă de puterea acestuia.");
            System.out.println("3.Conectez aparatele din oficiul1 in priza si inregistrez energia consumata timp de o ora \n ");
            System.out.println("4.EXIT  ");
//Introducem de la tastatura  sarcina care dorim sa o realizam
            String h;
            int o;
            BufferedReader menu = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Alegeti sarcina care doriti sa o indepliniti  :  ");
            h = menu.readLine();
            o = Integer.parseInt(h);
            switch (o) {
                case 1: {
                    System.out.println("\n Găsiți în oficiu obiectul electronic ce conține puterea cuprinsă întrun diapazon citit de la tastatură.\n");
                    int a, b;
                    //  int a=10, b=1000;
                    String l;
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    // Citim valoarea variabilei a
                    System.out.print("De la :  ");
                    l = br.readLine();
                    a = Integer.parseInt(l);
                    // Citim valoarea variabilei b
                    System.out.print("Pana la:  ");
                    l = br.readLine();
                    b = Integer.parseInt(l);

                    if (st1.putereW >= a && st1.putereW <= b) {
                        System.out.println(st1.getAE() + "   " + st1.getNB());
                    }  if (st2.putereW >= a && st2.putereW <= b)
                        System.out.println(st2.getAE() + "   " + st2.getNB());
                   if (st3.putereW >= a && st3.putereW <= b)
                        System.out.println(st3.getAE() + "   " + st3.getNB());

                    if (b1.putereW >= a && b1.putereW <= b) {
                        System.out.println(b1.getAE() + "   " + b1.getNB());
                    } if (b2.putereW >= a && b2.putereW <= b) System.out.println(b2.getAE() + "   " + b2.getNB());
                    if (b3.putereW >= a && b3.putereW <= b) System.out.println(b3.getAE() + "   " + b3.getNB());

                    if (f1.putereW >= a && f1.putereW <= b) {
                        System.out.println(f1.getAE() + "   " + f1.getNB());
                    }  if (f2.putereW >= a && f2.putereW <= b) System.out.println(f2.getAE() + "   " + f2.getNB());
                 if (f3.putereW >= a && f3.putereW <= b) System.out.println(f3.getAE() + "   " + f3.getNB());

                 //  else System.out.println("Aparate cu puterea introdusa nu sunt ");
                    }
                q = 0;
                case 2: {
                    System.out.println("\nSortați aparatele electronice dintr-un oficiu în dependentă de puterea acestuia.\n");//am ales oficiul1
//Am sortat in crestere de la mai mic la mai mare.
                    System.out.println("Menu: ");
                    System.out.println("1. Sortati oficiu 1  ");
                    System.out.println("2. Sortati oficiu 2  ");
                    System.out.println("3. Sortati oficiu 3  ");
                    //
                    String w;
                    int e;
                    BufferedReader case2 = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Alegeti sarcina care doriti sa o indepliniti  :  ");
                    w = menu.readLine();
                    e = Integer.parseInt(w);
                    switch (e) {
                    //
                        case 1:    {    String[] oficiu1 = {String.valueOf(st1.getAE() + st1.getNB()), String.valueOf(b1.getAE() + b1.getNB()), String.valueOf(f1.getAE() + f1.getNB())};
                    int[] oficiu1W = {st1.consumE, b1.consumE, f1.consumE};
                    int i = 0;

                    Arrays.sort(oficiu1W);
                    for (Integer s : oficiu1W) {
                        if (oficiu1W[i] == st1.consumE) {
                            System.out.println(st1.getAE() + st1.getNB());
                        } else if (oficiu1W[i] == b1.consumE) {
                            System.out.println(b1.getAE() + b1.getNB());
                        } else if (oficiu1W[i] == f1.consumE) {
                            System.out.println(f1.getAE() + f1.getNB()); }i++;}  } break;
                        case 2:{ String[] oficiu2 = {String.valueOf(st2.getAE() + st2.getNB()), String.valueOf(b2.getAE() + b2.getNB()), String.valueOf(f2.getAE() + f2.getNB())};
                            int[] oficiu2W = {st2.consumE, b2.consumE, f2.consumE};
                          int i = 0;
                            Arrays.sort(oficiu2W);
                            for (Integer s: oficiu2W) {
                                if (oficiu2W[i] == st2.consumE) {
                                    System.out.println(st2.getAE() + st2.getNB());
                                } else if (oficiu2W[i] == b2.consumE) {
                                    System.out.println(b2.getAE() + b2.getNB());
                                } else if (oficiu2W[i] == f2.consumE) {
                                    System.out.println(f2.getAE() + f2.getNB()); }i++;}} break;
                        case 3: {String[] oficiu3 = {String.valueOf(st3.getAE() + st3.getNB()), String.valueOf(b3.getAE() + b3.getNB()), String.valueOf(f3.getAE() + f3.getNB())};
                            int[] oficiu3W = {st3.consumE, b3.consumE, f3.consumE};
                            int j = 0;
                            Arrays.sort(oficiu3W);
                            for (Integer s: oficiu3W) {
                                if (oficiu3W[j] == st3.consumE) {
                                    System.out.println(st3.getAE() + st3.getNB());
                                } else if (oficiu3W[j] == b3.consumE) {
                                    System.out.println(b3.getAE() + b3.getNB());
                                } else if (oficiu3W[j] == f3.consumE) {
                                    System.out.println(f3.getAE() + f3.getNB()); } j++;  }}  break;
                        default: System.out.println("Asa oficiu nui ");  break;}
                    }
                q = 0;
                case 3: {
                    System.out.println("\nConectez aparatele din oficiul1 in priza si inregistrez energia consumata timp de o ora \n ");
                    System.out.println("Menu: ");
                    System.out.println("1. Conectati aparatele din oficiul1 ");
                    System.out.println("2. Conectati aparatele din oficiul2  ");
                    System.out.println("3. Conectati aparatele din oficiul3  ");
                    //
                    String g;
                    int k;
                    BufferedReader case3 = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Alegeti sarcina care doriti sa o indepliniti  :  ");
                    g = menu.readLine();
                    k = Integer.parseInt(g);
                    switch (k) {
                        //
                        case 1: {
                            System.out.println(st1.getVolum() + "   " + st1.getNB());
                            System.out.println(b1.getVolum() + "   " + b1.getNB());
                            System.out.println(f1.getVolum() + "   " + f1.getNB());
                        }
                        break;
                        case 2: {
                            System.out.println(st2.getVolum() + "   " + st2.getNB());
                            System.out.println(b2.getVolum() + "   " + b2.getNB());
                            System.out.println(f2.getVolum() + "   " + f2.getNB());
                        }
                        break;
                        case 3: {
                            System.out.println(st3.getVolum() + "   " + st3.getNB());
                            System.out.println(b3.getVolum() + "   " + b3.getNB());
                            System.out.println(f3.getVolum() + "   " + f3.getNB());
                        }
                        break;
                        default:
                            System.out.println("Asa oficiu nui");
                            break;
                    }

                }q = 0;
                case 4: break;
                default:{
                    System.out.println("Asa sarcina nu-i  ");}
                    q = 0; }}}}