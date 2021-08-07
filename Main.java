/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EP1P2;



/**
 *
 * @author Wicho
 */
public class Main {
    public static void main(String[] args) {
       
        
        Clase1 complemento = new Clase1();
        Clase2 datos = new Clase2();
        

        System.out.println("Descipcion ");
        System.out.println("");
        
        datos.Producto = "Bolsas de \ncemento   ";
        datos.Unidades = 80;
        datos.PrecioUnitario = 40;
        datos.Kilogramos = 90;
        complemento.AgregaVendedores(datos);
        
        
        
         datos.Producto = "Bolsas de Cal ";
        datos.Unidades = 50;
        datos.PrecioUnitario = 50;
        datos.Kilogramos = 40;
        complemento.AgregaVendedores(datos);
        
         datos.Producto = "tubos PC";
        datos.Unidades = 350;
        datos.PrecioUnitario = 40;
        datos.Kilogramos = 200;
        complemento.AgregaVendedores(datos);
        
         datos.Producto = "Quintales de \n hierro     ";
        datos.Unidades = 100;
        datos.PrecioUnitario = 450;
        datos.Kilogramos = 500;
        complemento.AgregaVendedores(datos);
        
        
               

        complemento.operaciones(datos);
        complemento.imprimirDecorado();

    
        
        
        
        
        
    }
}
