/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea.tarea1;

import java.util.ArrayList;

/**
 *
 * @author noisex
 */
public class UEPS extends Articulo{

    @Override
    public void costeo() {
        float sumCantidadTotal = 0, sumPrecioTotal = 0;
        for (int i=0; i<this.getVenta().size(); i++){
            sumCantidadTotal = sumCantidadTotal + this.getVenta().get(i).getCantidad();
            sumPrecioTotal = sumPrecioTotal +( this.getVenta().get(i).getPrecio() * this.getVenta().get(i).getCantidad());
        }
        System.out.println(sumCantidadTotal);
        System.out.println(sumPrecioTotal);

        
       ArrayList<Costo> temp = this.getCosto();
       float tempAmmount = 0, tempSum = 0, sumatempTotal=0;
       for (int i = (this.getCosto().size())-1; i>=0; i--){
//           System.out.println(this.getCosto().get(i).getNumero());
//           System.out.println(temp.get(i).getCantidad());
//            System.out.println("La suma temporal es " + tempSum);
            sumatempTotal = sumatempTotal + (temp.get(i).getCantidad() * temp.get(i).getCosto());
            if (tempAmmount < sumCantidadTotal){
                tempAmmount = tempAmmount + temp.get(i).getCantidad();
                tempSum = tempSum + (temp.get(i).getCantidad() * temp.get(i).getCosto());
            }
            if (tempAmmount > sumCantidadTotal){
                float dif = tempAmmount - sumCantidadTotal;
                tempSum = tempSum - (dif * temp.get(i).getCosto());
                tempAmmount = tempAmmount - (dif);
            }
            if (tempAmmount == sumCantidadTotal){
                System.out.println("La suma temporal es " + tempSum);
                this.setCostoVentas(tempSum);
                this.setUtilidad(sumPrecioTotal - tempSum);
                this.setCostoExistencia(sumatempTotal - tempSum);
            }
           
       }
    }
    
}
