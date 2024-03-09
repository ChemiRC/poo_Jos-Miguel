package edu.chemi_ramirez.reto6.process;

public class Empleado {
}

import java.util.Date;

class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private int horasExtras;
    private String telefono;
    private Date fechaNacimiento;
    private Categoria categoria;

    public Empleado(String nombre, int horasTrabajadas, int horasExtras, String telefono, Date fechaNacimiento, Categoria categoria) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double CalcularSueldoNormal() {
        return horasTrabajadas * categoria.getSueldoBase();
    }

    public double CalcularSueldoExtra() {
        return horasExtras * categoria.getPagoPorHoraExtra();
    }

    public int CalcularTotalHoras() {
        return horasTrabajadas + horasExtras;
    }
}
