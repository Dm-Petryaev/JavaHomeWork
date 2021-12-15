package com.pb.PetryayevDm.HW11;



import java.io.Serializable;
import java.time.*;

public class Person implements Serializable {
    private String nombre, direccion, telefono;
    private transient LocalDate cumple;
    private transient LocalDateTime cambio;

    public Person(String nombre, String direccion, String telefono,
                  LocalDate cumple, LocalDateTime cambio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cumple = cumple;
        this.cambio = cambio;
    }


    public Person() {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCumple(int y, int m, int d) {
        this.cumple = LocalDate.of(y, m, d);
    }

    public void setCambio(LocalDateTime modified) {
        this.cambio = modified;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCumple() {
        return cumple.toString();
    }

    public String getCambio() {
        return cambio.toString();
    }

    @Override
    public String toString() {
        return "\n{ФИО: " + nombre + "\n" +
                "Адрес: " + direccion + "\n" +
                "Дата рождения: " + cumple + "\n" +
                "Телефон: " + telefono + "\n" +
                "Последнее изменение: " + cambio + "}";
    }
}