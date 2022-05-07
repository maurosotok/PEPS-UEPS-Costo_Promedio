/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea.tarea1;

/**
 *
 * @author noisex
 */
public class Costo {
    private int numero, cantidad;
    private float costo;
    public Costo (int numero, int cantidad, float costo){
        this.numero = numero;
        this.cantidad = cantidad;
        this.costo = costo;
    }
    public int getNumero(){
        return this.numero;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public float getCosto(){
        return this.costo;
    }
}
