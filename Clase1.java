/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EP1P2;

import java.text.DecimalFormat;

/**
 *
 * @author Wicho
 */
public class Clase1 {
    public static final int MaxFila = 5;
    public static final int MaxColumnas = 8;
    private int totalFilas = 0;
    
    private static String [][] complemento = new String  [5][8]; //nombre de la matriz
     private static  double  [][] ArregloNumero = new double[5][8];
     private static double  [][] ArregloNumero2 = new double[5][8];
     private static double  [][] ArregloNumero3 = new double[5][8];
    
    
    private int filaActual = 0;
    
    private static DecimalFormat f = new DecimalFormat("0.00");
     
   private static final double paso1 =0;
        private static final double x2 =0;
        private static final double x3 =0;
        private static final double x4 =0;
        private static final double x11 =0;
        private static final double x22 =0;
        private static final double x33 =0;
        private static final double x44 =0;
        private static final double paso5 =0;
        private static final double paso81 =0;
        private static final double paso82 =0;
        private static final double paso83 =0;
        private static final double paso84 =0;
        private static final double fin1 =0;
        private static final double fin2 =0;
        private static final double fin3 =0;
        private static final double fin4 =0;
        private static final double fin5 =0;
    
     public void AgregaVendedores (Clase2 Datos){
        
            
            complemento[filaActual][0] = Datos.Producto; 
            complemento[filaActual][1] = Datos.Unidades+"";
            complemento[filaActual][2] =  Datos.PrecioUnitario+"";
            complemento[filaActual][3] =  Clase2.Kilogramos+"";
        filaActual++;
        
        
      
       
        
  
    }
     
         public void operaciones (Clase2 Datos){
             
        double gastoalvalor = 8700;
            double gastoalpeso = 7500;
         
        double  paso1 = 0,x1 = 0,x2 = 0,x3 = 0,x4 = 0,x11 = 0,x22 = 0,x33 = 0,x44 = 0,paso5 = 0,paso81 = 0,paso82 = 0,paso83 = 0,paso84 = 0,fin1 = 0,fin2 = 0,fin3 = 0,fin4 = 0,fin5 = 0;
        
       
    for(int columna=1;columna<complemento.length;columna++)
    {      
        for(int fila=0;fila<complemento.length-1;fila++)
        {
              ArregloNumero[fila][columna]=Double.valueOf(complemento[fila][1]);   
              ArregloNumero2[fila][columna]=Double.valueOf(complemento[fila][2]); 
              paso1 += ArregloNumero[fila][columna] * ArregloNumero2[fila][columna]; 
     
              ArregloNumero[fila][columna] = Double.valueOf(complemento[0][2]);
              x1 = ArregloNumero[fila][columna] * (gastoalvalor / paso1);
              complemento[0][4] = f.format(x1)+"";
              
              ArregloNumero[fila][columna] = Double.valueOf(complemento[1][2]);
              x2 = ArregloNumero[fila][columna] * (gastoalvalor / paso1);
               complemento[1][4] = f.format(x2)+"";
              
              ArregloNumero[fila][columna] = Double.valueOf(complemento[2][2]);
              x3 = ArregloNumero[fila][columna] * (gastoalvalor / paso1);
               complemento[2][4] = f.format(x3)+"";
              
              ArregloNumero[fila][columna] = Double.valueOf(complemento[3][2]);
              x4 = ArregloNumero[fila][columna] * (gastoalvalor / paso1);
               complemento[3][4] = f.format(x4)+"";
               
               ArregloNumero[fila][columna]=Double.valueOf(complemento[fila][1]);   
              ArregloNumero2[fila][columna]=Double.valueOf(complemento[fila][3]); 
              paso5 += ArregloNumero[fila][columna] * ArregloNumero2[fila][columna]; 
              
              ArregloNumero[fila][columna] = Double.valueOf(complemento[0][3]);
              x11 = ArregloNumero[fila][columna] * (gastoalpeso / paso5);
              complemento[0][5] = f.format(x11)+"";
              
              ArregloNumero[fila][columna] = Double.valueOf(complemento[1][3]);
              x22 = ArregloNumero[fila][columna] * (gastoalpeso / paso5);
               complemento[1][5] = f.format(x22)+"";
              
              ArregloNumero[fila][columna] = Double.valueOf(complemento[2][3]);
              x33 = ArregloNumero[fila][columna] * (gastoalpeso / paso5);
               complemento[2][5] = f.format(x33)+"";
              
              ArregloNumero[fila][columna] = Double.valueOf(complemento[3][3]);
              x44 = ArregloNumero[fila][columna] * (gastoalpeso / paso5);
               complemento[3][5] = f.format(x44)+"";
              
                ArregloNumero[fila][columna]=Double.valueOf(complemento[0][2]);
              paso81 = x1 + x11 + ArregloNumero[fila][columna];
              complemento[0][6] = f.format(paso81)+"";
              
              ArregloNumero[fila][columna]=Double.valueOf(complemento[1][2]);
              paso82 = x2 + x22 + ArregloNumero[fila][columna];
              complemento[1][6] = f.format(paso82)+"";
              
              ArregloNumero[fila][columna]=Double.valueOf(complemento[2][2]);
              paso83 = x3 + x33 + ArregloNumero[fila][columna];
              complemento[2][6] = f.format(paso83)+"";
              
              ArregloNumero[fila][columna]=Double.valueOf(complemento[3][2]);
              paso84 = x4 + x44 + ArregloNumero[fila][columna];
              complemento[3][6] = f.format(paso84)+"";
            
              ArregloNumero[fila][columna]=Double.valueOf(complemento[0][1]);
              fin1 = ArregloNumero[fila][columna] * paso81;
              complemento[0][7] = "Q"+f.format(fin1)+""; 
              
              ArregloNumero[fila][columna]=Double.valueOf(complemento[1][1]);
              fin2 = ArregloNumero[fila][columna] * paso82;
              complemento[1][7] = "Q"+f.format(fin2)+"";
              
              ArregloNumero[fila][columna]=Double.valueOf(complemento[2][1]);
              fin3 = ArregloNumero[fila][columna] * paso83;
              complemento[2][7] = "Q"+f.format(fin3)+"";
              
              ArregloNumero[fila][columna]=Double.valueOf(complemento[3][1]);
              fin4 = ArregloNumero[fila][columna] * paso84;
              complemento[3][7] = "Q"+f.format(fin4)+"";
              
              fin5 = fin1 + fin2 + fin3 +fin4;
              complemento[4][7] = "Q"+f.format(fin5)+"";
              
          
              
              
              //complemento[MaxFila-1][4] = f.format(paso5)+"";
   
        }   
        
        
        
    }
}
        
       
       
    
    

     

      public  void imprimirDecorado(){
       
       for (int x = 0; x < complemento.length; x++) {
            System.out.print("-");
            for (int y = 0; y < complemento[x].length; y++) {
                System.out.print(complemento[x][y]);
                if (y != complemento[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("-");
        }
   }
   
    
       
        
}
