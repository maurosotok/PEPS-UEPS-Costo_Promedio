/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea.tarea1;

/**
 *
 * @author noisex
 */
public class Ventas {
    private int numeroFactura, cantidad;
    private float precio;
    public Ventas (int numeroFactura, int cantidad, float precio){
        this.numeroFactura = numeroFactura;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public int getNumeroFactura(){
        return this.numeroFactura;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public float getPrecio(){
        return this.precio;
    }
    
}
