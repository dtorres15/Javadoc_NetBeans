/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproducto;

/**
 *
 * @author Daniel Torres
 * @version 1.1
 * @since  04/03/2022
 */
public class Producto {
     private static double precioMinimo = 5; //especifico de la clase
     
     private String nombre;  // especifico pra cada objeto
     private double precioBase;// valen cero por defecto
     private double tipoIva;//valen cero por defecto
    
     public Producto(){//constructor por defecto
         
     }
/**
 * Establece el producto con las caracteristicas de nombre, precio base y el tipo de iva
 * @param nombre el nombre de un dicho producto
 * @param precioBase la cantidad minima del precio de dicho producto
 * @param tipoIva el tipo de iva que posee dicho producto
 */
     
    public Producto(String nombre, double precioBase, double tipoIva){ // no devuelve nada y no es void
        this.nombre = nombre;
       // this.precioBase = precioBase;
       this.setPrecioBase(precioBase);
       this.setTipoIva(tipoIva);
        
    }
/**
 * Proporciona el precio que esta en cara al publico
 * @return devuelve el precio base y el precio base con el tipo de iva
 */     
    public double precioVentaPublico(){
        return precioBase + precioBase*tipoIva/100;
        
    }
/**
* Establece el precio base de un producto, calculado con su precio minimo 
* @param precio Cantidad de dinero 
*/
    public void setPrecioBase(double precio){//parámetro del mismo tipo que el atributo
        if (precio < precioMinimo){
            precio = precioMinimo;
        }
        this.precioBase = precio;
    }
/**
 * establece el nombre de dicho producto
 * @param nombre nombre de dicho elemento
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Calcula el tipo de Iva  que necesita dicho producto
 * @param tipoIva calculo para diferenciar el tipo de iva que existe
 */
    public void setTipoIva(double tipoIva) {
        if(tipoIva < 3.3 ){
            tipoIva = 3.3;
        }
        this.tipoIva = tipoIva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getTipoIva() {
        return tipoIva;
    }
/**
 * Establece el precio minimo que va a tener un producto
 * @param precioMinimo cantidad minima de un precio
 */
    public static void setPrecioMinimo(double precioMinimo) {
        Producto.precioMinimo = precioMinimo;
    }

    public static double getPrecioMinimo() {
        return precioMinimo;
    }
    
    
    
}
