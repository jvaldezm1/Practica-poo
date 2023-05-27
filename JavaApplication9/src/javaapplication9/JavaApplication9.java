
package javaapplication9;

import java.util.Scanner;


public class JavaApplication9 {

   

 
    public static void main(String[] args) {
        Scanner sn= new Scanner (System.in);
        Calculadora Calculadora = new Calculadora();
     CalculadoraEspecial CalculadoraEspecial=new CalculadoraEspecial();
        boolean salir = false;
        int opcion;
        
        
        do {
        
         System.out.println("");
           System.out.println("=======================");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
           System.out.println("********");
           System.out.println("Calculadora Especial");
             System.out.println("********");
           System.out.println("7. Radio de un circulo");
           System.out.println ("8. calculo de un factorial");
           System.out.println("9. comun divisor");
           System.out.println("10. Generar numero aleatorio");
           System.out.println("11. calculo de un numero decimal");
           System.out.println("12. Calcular area de un cuadrado");
           System.out.println("Selecciona una opcion:  ");
           System.out.println("=======================");
           opcion = sn.nextInt();
          
           
           
           switch (opcion){
               
               case 1:System.out.println("El resultado de la suma es = " + Calculadora.sumar(10, 5));
                   break;
               case 2: 
                System.out.println("El resultado de la resta es = " +Calculadora.restar(10, 5));
                   break;
               case 3:
                   System.out.println("El resultado de la multiplicacion es = " +Calculadora.multiplicar(10, 5));
                   break;
               case 4:
                   System.out.println("El resultado de la division es = " +Calculadora.dividir(10, 5));
                   break;
                   
               case 5:
                  System.out.println("El resultado de la raiz cuadrada es = " +Calculadora.raizCuadrada(16));
                   break;
                   
               case 6:
                  System.out.println("Es primo? = " +Calculadora.esPrimo(11));
                   break;
                   
               case 7:
             System.out.println("el radio es  = " +CalculadoraEspecial.calcularAreaCirculo(25));
                   break;
                   
               case 8: 
                   System.out.println("El calculo del factorial es  = " +CalculadoraEspecial.calcularFactorial (10));
                   break;
                   
               case 9:
                   System.out.println("El comun divisor es de= " +CalculadoraEspecial.calcularMCD(6,9));
                   break;
               case 10:
                   System.out.println("El numero aleatorio es = " +CalculadoraEspecial.generarNumeroAleatorio(50,70));
                   break;
               case 11:
                   System.out.println("El numero decimal es = " +CalculadoraEspecial.redondearDecimal(15,25));
                   break;
               case 12:
                 System.out.println("area de un cuadrado es = "+ CalculadoraEspecial.CalculoArea(5,5));
                   break;
           }
           
        }  while(!salir);  
      
    }
}
           
        
        
        
           
 
      
    
   


