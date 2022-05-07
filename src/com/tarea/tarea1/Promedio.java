/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea.tarea1;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Promedio extends Articulo {

    @Override
    public void costeo() {
        float sumCantidadTotal = 0, sumPrecioTotal = 0;
        for (int i=0; i<this.getVenta().size(); i++){
            sumCantidadTotal = sumCantidadTotal + this.getVenta().get(i).getCantidad();
            sumPrecioTotal = sumPrecioTotal +( this.getVenta().get(i).getPrecio() * this.getVenta().get(i).getCantidad());
        }
        

        
        
        ArrayList<Costo> temp = this.getCosto();
        float tempAmmount = 0,  sumatempTotal=0;
        for (int i = 0; i<this.getCosto().size(); i++){
            sumatempTotal = sumatempTotal + (temp.get(i).getCosto()*temp.get(i).getCantidad());
            tempAmmount = tempAmmount + temp.get(i).getCantidad();
        }
        
        System.out.println(sumatempTotal);
        System.out.println(tempAmmount);
        
        
        float promedio = sumatempTotal / tempAmmount;
        float dif = tempAmmount - sumCantidadTotal;
        
        System.out.println(promedio);
        System.out.println(dif);
        System.out.println(sumCantidadTotal*promedio);
        
        this.setCostoVentas(sumCantidadTotal * promedio);
        this.setUtilidad(sumPrecioTotal-this.getCostoVentas());
        this.setCostoExistencia(dif * promedio);
        
       
    }
    
}
