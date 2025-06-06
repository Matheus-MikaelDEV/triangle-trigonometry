package application;

import java.util.Locale;
import java.util.Scanner;
import entities.TriangleRatios;
import util.Calcule;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        do {
            System.out.println("1 - Realizar alguma operação\n2 - Sair");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    boolean subMenu = true;
                    while (subMenu) {
                        System.out.println("Qual operação deseja realizar?");
                        System.out.println("1 - Seno\n2 - Cosseno\n3 - Tangente\n4 - Sair");
                        option = sc.nextInt();
                        sc.nextLine();

                        switch (option) {
                            case 1:
                                System.out.print("Qual o valor do cateto oposto? ");
                                double b = sc.nextDouble();
                                sc.nextLine();
                                System.out.print("Qual o valor da hipotenusa? ");
                                double a = sc.nextDouble();
                                sc.nextLine();

                                TriangleRatios ratios = new TriangleRatios(b, 0, a);

                                System.out.println("Resultado do seno: " + Calcule.calculateSine(ratios));

                                break;
                            case 2:
                                System.out.print("Qual o valor do cateto adjacente? ");
                                double c = sc.nextDouble();
                                sc.nextLine();
                                System.out.print("Qual o valor da hipotenusa? ");
                                a = sc.nextDouble();
                                sc.nextLine();

                                ratios = new TriangleRatios(0, c, a);

                                System.out.println("Resultado do cosseno: " + Calcule.calculateCosine(ratios));

                                break;
                            case 3:
                                System.out.print("Qual o valor do cateto oposto? ");
                                b = sc.nextDouble();
                                sc.nextLine();
                                System.out.print("Qual o valor da cateto adjacente? ");
                                c = sc.nextDouble();
                                sc.nextLine();

                                ratios = new TriangleRatios(b, c, 0);

                                System.out.println("Resultado da tangente: " + Calcule.calculateTangent(ratios));

                                break;
                            case 4:
                                System.out.println("Saindo do SubMenu...");
                                subMenu = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
            }
        }while (true);
    }
}