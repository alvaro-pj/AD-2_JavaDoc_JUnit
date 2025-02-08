package org.example.main;

import org.example.clases.Cociente;
import org.example.clases.Producto;
import org.example.clases.Resta;
import org.example.clases.Suma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcion;
        do {
            System.out.println("\nCalculadora - Elija una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. Cociente");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Suma");
                    Suma suma = new Suma();

                    int opcionSuma;
                    do {
                        System.out.println("\nCalculadora - Elija una operación:");
                        System.out.println("1. Suma de dos números reales");
                        System.out.println("2. Suma de dos números enteros");
                        System.out.println("3. Suma de tres números reales");
                        System.out.println("4. Suma con valor acumulado");
                        System.out.println("5. Salir");
                        System.out.print("Seleccione una opción: ");
                        opcionSuma = scanner.nextInt();

                        switch (opcionSuma) {
                            case 1:
                                System.out.print("Ingrese dos números reales: ");
                                double a = scanner.nextDouble();
                                double b = scanner.nextDouble();
                                System.out.println("Resultado: " + suma.sumaReales(a, b));
                                break;
                            case 2:
                                System.out.print("Ingrese dos números enteros: ");
                                int x = scanner.nextInt();
                                int y = scanner.nextInt();
                                System.out.println("Resultado: " + suma.sumaEnteros(x, y));
                                break;
                            case 3:
                                System.out.print("Ingrese tres números reales: ");
                                a = scanner.nextDouble();
                                b = scanner.nextDouble();
                                double c = scanner.nextDouble();
                                System.out.println("Resultado: " + suma.sumaTresReales(a, b, c));
                                break;
                            case 4:
                                System.out.print("Ingrese un número para sumar al acumulado: ");
                                a = scanner.nextDouble();
                                suma.sumaAcumulada(a);
                                System.out.println("Valor acumulado: "+ suma.getAcumulado());
                                break;
                            case 5:
                                System.out.println("Saliendo de la calculadora...");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }
                    } while (opcion != 5);
                    break;
                case 2:
                    System.out.println("2. Resta");
                    Resta resta = new Resta();
                    int opcionResta;

                    do {
                        System.out.println("\n--- Menú de Resta ---");
                        System.out.println("1. Resta de dos números reales");
                        System.out.println("2. Resta de dos números enteros");
                        System.out.println("3. Resta de tres números reales");
                        System.out.println("4. Resta con valor acumulado");
                        System.out.println("5. Salir");
                        System.out.print("Seleccione una opción: ");

                        opcionResta = scanner.nextInt();

                        switch (opcionResta) {
                            case 1:
                                System.out.print("Ingrese el primer número real: ");
                                double a1 = scanner.nextDouble();
                                System.out.print("Ingrese el segundo número real: ");
                                double b1 = scanner.nextDouble();
                                System.out.println("Resultado: " + resta.restaReales(a1, b1));
                                break;
                            case 2:
                                System.out.print("Ingrese el primer número entero: ");
                                int a2 = scanner.nextInt();
                                System.out.print("Ingrese el segundo número entero: ");
                                int b2 = scanner.nextInt();
                                System.out.println("Resultado: " + resta.restaEnteros(a2, b2));
                                break;
                            case 3:
                                System.out.print("Ingrese el primer número real: ");
                                double a3 = scanner.nextDouble();
                                System.out.print("Ingrese el segundo número real: ");
                                double b3 = scanner.nextDouble();
                                System.out.print("Ingrese el tercer número real: ");
                                double c3 = scanner.nextDouble();
                                System.out.println("Resultado: " + resta.restaTresReales(a3, b3, c3));
                                break;
                            case 4:
                                System.out.print("Ingrese el número a restar del valor acumulado: ");
                                double valor = scanner.nextDouble();
                                resta.restaAcumulada(valor);
                                System.out.println("Nuevo valor acumulado: " + resta.getAcumulado());
                                break;
                            case 5:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }
                    } while (opcionResta != 5);
                    break;
                case 3:
                    System.out.println("3. Producto");
                    Producto producto = new Producto();

                    int opcionProducto;

                    do {
                        System.out.println("\nMenu de operaciones:");
                        System.out.println("1. Producto de dos números reales");
                        System.out.println("2. Producto de dos números enteros");
                        System.out.println("3. Producto de tres números reales");
                        System.out.println("4. Potencia");
                        System.out.println("5. Salir");
                        System.out.print("Elija una opción: ");
                        opcionProducto = scanner.nextInt();

                        switch (opcionProducto) {
                            case 1:
                                System.out.print("Ingrese el primer número real: ");
                                double num1 = scanner.nextDouble();
                                System.out.print("Ingrese el segundo número real: ");
                                double num2 = scanner.nextDouble();
                                System.out.println("El producto es: " + producto.productoDosReales(num1, num2));
                                break;

                            case 2:
                                System.out.print("Ingrese el primer número entero: ");
                                int entero1 = scanner.nextInt();
                                System.out.print("Ingrese el segundo número entero: ");
                                int entero2 = scanner.nextInt();
                                System.out.println("El producto es: " + producto.productoDosEnteros(entero1, entero2));
                                break;

                            case 3:
                                System.out.print("Ingrese el primer número real: ");
                                double numReal1 = scanner.nextDouble();
                                System.out.print("Ingrese el segundo número real: ");
                                double numReal2 = scanner.nextDouble();
                                System.out.print("Ingrese el tercer número real: ");
                                double numReal3 = scanner.nextDouble();
                                System.out.println("El producto es: " + producto.productoTresReales(numReal1, numReal2, numReal3));
                                break;

                            case 4:
                                System.out.print("Ingrese la base: ");
                                double base = scanner.nextDouble();
                                System.out.print("Ingrese el exponente: ");
                                double exponente = scanner.nextDouble();
                                System.out.println("El resultado de la potencia es: " + producto.potencia(base, exponente));
                                break;

                            case 5:
                                System.out.println("¡Adiós!");
                                break;

                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                        }
                    } while (opcionProducto != 5);
                    break;
                case 4:
                    System.out.println("4. Cociente");
                    Cociente cociente = new Cociente();
                    int opcionCociente;

                    do {
                        // Menú
                        System.out.println("\n---- Menú de Operaciones de la Calculadora ----");
                        System.out.println("1. División de dos números reales");
                        System.out.println("2. División de dos números enteros");
                        System.out.println("3. Inverso de un número real");
                        System.out.println("4. Raíz de un número");
                        System.out.println("5. Salir");
                        System.out.print("Elija una opción: ");
                        opcionCociente = scanner.nextInt();

                        switch(opcionCociente) {
                            case 1:
                                // División de dos números reales
                                System.out.print("Ingrese el primer número real: ");
                                double real1 = scanner.nextDouble();
                                System.out.print("Ingrese el segundo número real: ");
                                double real2 = scanner.nextDouble();
                                double resultadoReal = cociente.dividorReales(real1, real2);
                                System.out.println("Resultado: " + resultadoReal);
                                break;

                            case 2:
                                // División de dos números enteros
                                System.out.print("Ingrese el primer número entero: ");
                                int entero1 = scanner.nextInt();
                                System.out.print("Ingrese el segundo número entero: ");
                                int entero2 = scanner.nextInt();
                                int resultadoEntero = cociente.dividorEnteros(entero1, entero2);
                                System.out.println("Resultado: " + resultadoEntero);
                                break;

                            case 3:
                                // Inverso de un número real
                                System.out.print("Ingrese un número real: ");
                                double real = scanner.nextDouble();
                                double inverso = cociente.inversoReal(real);
                                System.out.println("Inverso: " + inverso);
                                break;

                            case 4:
                                // Raíz de un número
                                System.out.print("Ingrese un número: ");
                                double numero = scanner.nextDouble();
                                double raiz = cociente.raiz(numero);
                                System.out.println("Raíz: " + raiz);
                                break;

                            case 5:
                                System.out.println("¡Gracias por usar la calculadora!");
                                break;

                            default:
                                System.out.println("Opción no válida, intente de nuevo.");
                        }
                    } while(opcionCociente != 5);
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
