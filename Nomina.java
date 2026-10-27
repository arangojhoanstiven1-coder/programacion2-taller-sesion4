
package com.mycompany.mavenproject2;


public class Nomina {
    public static void main(String[] args) {
  Docente d1 = new Docente("111", "Ana", "Sistemas", 60, 35000);
  Administrativo a1 = new Administrativo("222", "Luis", "Tesorería", 1800000);
  System.out.println("DOCENTE: " + d1.resumen());
  System.out.println("Pago docente: $" + d1.calcularPagoMensual());
  System.out.println("ADMINISTRATIVO: " + a1.resumen());
  System.out.println("Pago administrativo: $" + a1.calcularPagoMensual());
  System.out.println("Vacaciones válidas: " + a1.tomarVacaciones(5));
  System.out.println("Intento excesivo: " + a1.tomarVacaciones(11));
  System.out.println("Resumen final: " + a1.resumen());
 }
}


