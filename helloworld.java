import java.util.Scanner;

class Calculatrice {
    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new Exception("Erreur ");
        }
        return a / b;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

        System.out.println("hello !");
        System.out.print("donner le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez l'opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        
            switch (operation) {
                case '+':
                    resultat = calc.addition(num1, num2);
                    break;
                case '-':
                    resultat = calc.soustraction(num1, num2);
                    break;
                case '*':
                    resultat = calc.multiplication(num1, num2);
                    break;
                case '/':
                    resultat = calc.division(num1, num2);
                    break;
                default:
                    System.out.println("Opération invalide !");
                    return;
            }
            System.out.println("Résultat : " + resultat);
        ;
        }
        scanner.close();
    }
}
