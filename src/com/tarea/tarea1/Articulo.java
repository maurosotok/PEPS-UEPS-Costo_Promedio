/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea.tarea1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author noisex
 */
abstract class Articulo {
    private String codigo;
    private String nombre;
    private ArrayList<Costo> costo = new ArrayList<Costo>();
    private ArrayList<Ventas> venta = new ArrayList<Ventas>();
    private float costoVentas=0, utilidad=0, costoExistencia=0;
    
    
    public void setCostoVentas(float costoVentas){
        this.costoVentas = costoVentas;
    }
    public float getCostoVentas(){
        return this.costoVentas;
    }
    public void setUtilidad(float utilidad){
      this.utilidad = utilidad;  
    }
    public float getUtilidad(){
        return this.utilidad;
    }
    public void setCostoExistencia(float costoExistencia){
        this.costoExistencia = costoExistencia;
    }
    public float getCostoExistencia (){
        return this.costoExistencia;
    }

    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setCosto(Costo costo) {
        this.costo.add(costo);
    }
    public ArrayList<Costo> getCosto (){
        return this.costo;
    }
    
    public void setVentas (Ventas venta){
        this.venta.add(venta);
    }
    
    public ArrayList<Ventas> getVenta (){
        return this.venta;
    }
    
    public void crearArchivo(String metodo){
        try{
            File archivo = new File("datos.txt");
            if (archivo.createNewFile()){
                System.out.println("archivo creado");
            } else{
                System.out.println("archivo ya existe");
            }
        } catch (IOException e){
            System.out.println("ocurrio un error");
            e.printStackTrace();
        }
        
        try{
            FileWriter escribir = new FileWriter("datos.txt", true);
            escribir.write("\n" + getNombre() + "\n");
            escribir.write(getCodigo() + "\n");
            for (Costo c : getCosto()){
                escribir.write("Numero de compra" + " Cantidad" + " Costo");
                escribir.write( "\n" + c.getNumero() + " " );
                escribir.write(c.getCantidad() + " " );
                escribir.write(c.getCosto() + "\n");
            }
            for (Ventas v: getVenta()){
                escribir.write("Numero de factura" + " Cantidad" + " Precio");
                escribir.write( "\n" + v.getNumeroFactura() + " " );
                escribir.write(v.getCantidad() + " " );
                escribir.write(v.getPrecio() + "\n");
                
            }
            
            escribir.write("Costeo, Costo Ventas, Utilidad, Costo Existencia \n" );
            escribir.write(metodo + " " +  getCostoVentas() +" " +  getUtilidad() + " " + getCostoExistencia());
            escribir.close();
            
        } catch (IOException e){
            System.out.println("ocurrio un error");
            e.printStackTrace();
        }
    }
    
    abstract void costeo();

}


