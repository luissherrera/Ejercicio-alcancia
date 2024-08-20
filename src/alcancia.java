/* Realizado por Luis Eduardo Herrera
Se realizo el codigo de una alcancia donde se van acumulando las monedas de varias demominaciones
y se cuentan por medio de contadores llevando cuanto van y el total acumulado
 */


import java.util.Scanner;

public class alcancia {
    public static void main(String[] args) {
        int monedas20 = 0;
        int monedas50 = 0;
        int monedas100 = 0;
        int monedas200 = 0;
        int monedas500 = 0;

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- Menú ---");
            System.out.println("--1. Agregar moneda--");
            System.out.println("--2. Contar monedas--");
            System.out.println("--3. Calcular total ahorrado--");
            System.out.println("--4. Romper alcancía--");
            System.out.println("--5. Salir--");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la denominación de la moneda (20, 50, 100, 200, 500): ");
                    int denominacion = scanner.nextInt();
                    switch (denominacion) {
                        case 20:
                            monedas20++;
                            break;
                        case 50:
                            monedas50++;
                            break;
                        case 100:
                            monedas100++;
                            break;
                        case 200:
                            monedas200++;
                            break;
                        case 500:
                            monedas500++;
                            break;
                        default:
                            System.out.println("Denominación no válida.");
                    }
                    break;
                case 2:
                    System.out.println("Monedas de $20: " + monedas20);
                    System.out.println("Monedas de $50: " + monedas50);
                    System.out.println("Monedas de $100: " + monedas100);
                    System.out.println("Monedas de $200: " + monedas200);
                    System.out.println("Monedas de $500: " + monedas500);
                    break;
                case 3:
                    int total = monedas20 * 20 + monedas50 * 50 + monedas100 * 100 + monedas200 * 200
                            + monedas500 * 500;
                    System.out.println("Total ahorrado: $" + total);
                    break;
                case 4:
                    System.out.println("Rompiendo la alcancía..");
                    System.out.println("Monedas de $20: " + monedas20);
                    System.out.println("Monedas de $50: " + monedas50);
                    System.out.println("Monedas de $100: " + monedas100);
                    System.out.println("Monedas de $200: " + monedas200);
                    System.out.println("Monedas de $500: " + monedas500);
                    int totalFinal = monedas20 * 20 + monedas50 * 50 + monedas100 * 100 + monedas200 * 200
                            + monedas500 * 500;
                    System.out.println("Total ahorrado: $" + totalFinal);

                    monedas20 = 0;
                    monedas50 = 0;
                    monedas100 = 0;
                    monedas200 = 0;
                    monedas500 = 0;
                    System.out.println("Alcancía vacia.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
