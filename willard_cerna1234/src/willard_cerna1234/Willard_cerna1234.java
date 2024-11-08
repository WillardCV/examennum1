/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package willard_cerna1234;

import java.util.Scanner;

/**
 *
 * @author WillardCerna
 */
public class Willard_cerna1234 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {
            
            System.out.println("----- MENÚ -----");
            System.out.println("1. PIRAMIDE");
            System.out.println("2. EL MAYOR");
            System.out.println("3. CLIENTE");
            System.out.println("4. CARACTERES VOCALES");
            System.out.println("5. SALIR");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();  
            
            
            switch (opcion) {
                case 1:
                    
                    piramide(entrada);
                    break;
                    
                case 2:
                    
                    elMayor(entrada);
                    break;
                
                case 3:
                    
                    cliente(entrada);
                    break;
                
                case 4:
                    
                    caracteresVocales(entrada);
                    break;
                    
                case 5:
                    
                    System.out.println("HASTA LUEGO");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
            
                   } while (opcion != 5); 
        
                          entrada.close();
    }
            public static void piramide(Scanner entrada){
                System.out.println("Piramide");
                    System.out.println("Ingrese una cantidad de filas: ");
        int Filas = entrada.nextInt();
                    int numero = 0;
                    
                    
                    for (int filas = 1; filas <= Filas; filas++) 
                    {
                        int sumaLinea=0;
                        for (int espacio = 0; espacio < filas; espacio++) {
                            System.out.print(numero+" ");
                            sumaLinea+=numero;
                             numero+=2;
                        }
                        System.out.println("= "+sumaLinea);
  
            }
            }
                      public static void elMayor(Scanner scanner) {
        int numero, mayor = Integer.MIN_VALUE, suma = 0, contador = 0;
                          String respuesta;

            do {
                  System.out.print("Ingresa un número entero: ");
                   numero = scanner.nextInt();
                   suma += numero;
                  contador++;

                    if (numero > mayor) {
                     mayor = numero;
               }

                 System.out.print("¿Deseas ingresar otro número? (SI/NO): ");
                      respuesta = scanner.next();
            
        }            while (respuesta.equalsIgnoreCase("SI"));
        
                  if (contador > 0) {
                            double promedio = (double) suma / contador;
                           System.out.println("El número mayor ingresado es: " + mayor);
                            System.out.println("El promedio de los números ingresados es: " + promedio);
                      } else {
                    System.out.println("No se ingresaron números.");
                   }
             }

                      public static void cliente(Scanner scanner) {
                       System.out.print("Ingresa el nombre del cliente: ");
                          String nombreCliente = scanner.nextLine();
        
                              int normalCount = 0, hdCount = 0, subtotal = 0;
                              String canal, respuesta;
                              double impuesto, total;

             do {
                     System.out.print("Ingresa el tipo de canal (HD o NORMAL): ");
                     canal = scanner.nextLine().toUpperCase();
            
                if (canal.equals("HD")) {
                hdCount++;
                subtotal += 30; 
                } else if (canal.equals("NORMAL")) {
                normalCount++;
                subtotal += 20;
                 } else {
                System.out.println("Tipo de canal no válido.");
            }

            System.out.print("¿Deseas ingresar otro canal? (SI/NO): ");
            respuesta = scanner.nextLine().toUpperCase();
            
        } while (respuesta.equalsIgnoreCase("SI"));

       
                       String cajaDigital;
                          do {
 System.out.print("Ingresa el tipo de Caja Digital (LIGHTBOX, HDBOX, DVRBOX): ");
 cajaDigital = scanner.nextLine().toUpperCase();
       } while (!cajaDigital.equals("LIGHTBOX") && !cajaDigital.equals("HDBOX") && !cajaDigital.equals("DVRBOX"));
        
        
        int costoCaja = 0;
        switch (cajaDigital) {
            case "LIGHTBOX":
                costoCaja = 50;
                break;
            case "HDBOX":
                costoCaja = 100;
                break;
            case "DVRBOX":
                costoCaja = 150;
                break;
            default:
                break;
        }

        subtotal += costoCaja;
        impuesto = subtotal * 0.15;
        total = subtotal + impuesto;

        
        System.out.println("\nResumen de la información:");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Canales NORMALES: " + normalCount);
        System.out.println("Canales HD: " + hdCount);
        System.out.println("Subtotal a pagar: Lps. " + subtotal);
        System.out.println("Impuesto (15%): Lps. " + impuesto);
        System.out.println("Total a Pagar: Lps. " + total);
    }

    
    public static void caracteresVocales(Scanner scanner) {
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();
        int vocales = 0;

        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocales++;
                    break;
            }
        }

        System.out.println("La cantidad de vocales en la cadena es: " + vocales);
    }
}

    
    

