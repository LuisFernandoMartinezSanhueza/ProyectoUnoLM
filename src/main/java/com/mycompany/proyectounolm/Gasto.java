package com.mycompany.proyectounolm;

public class Gasto {
    
    private String nombre;
    private double valor;
    private boolean pagado;

    public Gasto(String nombre, double valor, boolean pagado) {
        this.nombre = nombre;
        this.valor = valor;
        this.pagado = pagado;
    }

    public double getValor() {
        return valor;
    }
    
}
