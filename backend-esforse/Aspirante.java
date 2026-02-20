package com.esforse.sanciones.model;

public class Aspirante {
    private Long idAspirante;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String grado;

    // Constructor vacío
    public Aspirante() {}

    // Método para generar la información que irá en el código QR
    public String obtenerDatosQR() {
        return "ID: " + idAspirante + " | Aspirante: " + nombres + " " + apellidos + " | Grado: " + grado;
    }
}
