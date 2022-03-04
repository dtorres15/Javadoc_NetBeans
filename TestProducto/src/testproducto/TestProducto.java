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
public class TestProducto {

/**
 * 
 * @param args 
 */
    public static void main(String[] args) {
        int edad;
        int numero;
        edad = 15;

        Producto pro;  //definición de la variable

        pro = new Producto(); //llamamos al constructor dr la clase Producto. Tiene el mimo nombre que la clase
        //  pro.nombre="tomate";
        pro.setNombre("tomate");
        //  pro.tipoIva=10;
        pro.setTipoIva(10);

        // pro.precioBase = 3.5;
        pro.setPrecioBase(-456);
        // pro.precioBase = -65;
        
//        pro.precioMinimo = 10;
//        Producto.precioMinimo =12;
        Producto.setPrecioMinimo(5); //para usar miembros estáticos  poner el nombre de la clase.
       

        System.out.println("Precio venta publico: " + pro.precioVentaPublico());

        System.out.println("Nombre: " + pro.getNombre());
         System.out.println("Precio mínimo: " + pro.getPrecioMinimo());
        System.out.println("Prcio base: " + pro.getPrecioBase());
        System.out.println("Tipo iva: " + pro.getTipoIva());

        
        System.out.println("");
        Producto proDos = new Producto();
         proDos.setNombre("Melon");
        proDos.setTipoIva(21);
        proDos.setPrecioBase(10);
        
         System.out.println("Precio venta publico: " + pro.precioVentaPublico());

        System.out.println("Nombre: " + proDos.getNombre());
        System.out.println("Precio mínimo: " + proDos.getPrecioMinimo()); //no es recomendable
        System.out.println("Prcio base: " + proDos.getPrecioBase());
        System.out.println("Tipo iva: " + proDos.getTipoIva());
        
        System.out.println("");
        
        Producto  p1;
        
        p1 = new Producto("alcachofa",12.5,4);
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Precio mínimo: " + p1.getPrecioMinimo()); //no es recomendable
        System.out.println("Prcio base: " + p1.getPrecioBase());
        System.out.println("Tipo iva: " + p1.getTipoIva());
        
        
        
        
        
    }

}
