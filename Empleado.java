
package com.mycompany.mavenproject2;


public class Empleado {
    protected String cedula, nombre, dependencia;
     
public Empleado(String cedula, String nombre, String dependencia) {
  this.cedula = cedula; this.nombre = nombre; this.dependencia = dependencia;
 }
 
 
public String resumen() {
  return "Cédula: " + cedula + ", nombre: " + nombre + ", dependencia: " + dependencia;
 }
 
 
public double calcularPagoMensual() { return 0; }
}


