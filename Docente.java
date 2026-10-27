
package com.mycompany.mavenproject2;


public class Docente extends Empleado {
 private final int horasCatedra;
 private final double valorHora;
 
public Docente(String cedula, String nombre, String dependencia, int horasCatedra, double valorHora) {
  super(cedula, nombre, dependencia);
  this.horasCatedra = horasCatedra; this.valorHora = valorHora;
 }

 @Override public double calcularPagoMensual() { return horasCatedra * valorHora; }
 @Override public String resumen() {
  return super.resumen() + ", horas: " + horasCatedra + ", valor hora: $" + valorHora;
 }
}

