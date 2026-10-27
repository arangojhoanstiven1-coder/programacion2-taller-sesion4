
package com.mycompany.mavenproject2;


public class Administrativo extends Empleado {
 private final double salarioBasico;
 private int diasVacaciones;
 
public Administrativo(String cedula, String nombre, String dependencia, double salarioBasico) {
  super(cedula, nombre, dependencia);
  this.salarioBasico = salarioBasico; this.diasVacaciones = 15;
 }

public boolean tomarVacaciones(int dias) {
  if (dias <= 0) { System.out.println("Los días deben ser mayores que cero."); 
    return false; }
  if (dias > diasVacaciones) { System.out.println("Solicitud rechazada: días insuficientes."); 
    return false; }
  diasVacaciones -= dias; return true;
 }

 @Override public double calcularPagoMensual() { return salarioBasico; }
 @Override public String resumen() {
  return super.resumen() + ", salario: $" + salarioBasico + ", vacaciones disponibles: " + diasVacaciones;
 }
}

