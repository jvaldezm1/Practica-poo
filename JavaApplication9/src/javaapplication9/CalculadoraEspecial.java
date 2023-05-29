
package javaapplication9;


public class CalculadoraEspecial extends Calculadora  {

public CalculadoraEspecial(){

}
  /*//Are de declaración de metodos
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
    
     
//calculo de area de un circulo  
 public static double calcularAreaCirculo(double radio) {
    return Math.PI * Math.pow(radio, 2);
}
 
 //calculo de un factorial
   public static int calcularFactorial(int numero) {
    if (numero == 0)
        return 1;
    else
        return numero * calcularFactorial(numero - 1);
}
   
  //calcular el comun divisor 
   public static int calcularMCD(int num1, int num2) {
    if (num2 == 0)
        return num1;
    return calcularMCD(num2, num1 % num2);
}
   
   //generar numero aleatorio
  public static int generarNumeroAleatorio(int min, int max) {
    return min + (int) (Math.random() * ((max - min) + 1));
}
    
  //calculo para redondear un decimal
  public static double redondearDecimal(double numero, int decimales) {
    int factor = (int) Math.pow(10, decimales);
    return Math.round(numero * factor) / (double) factor;
}
  
  //calcular area de un cuadrado 
 public static int  CalculoArea( int numero1 ,int numero2  ){
     return numero1 * numero2;
 }
   
  */

    public String getTipoCalculadora() {
        return tipoCalculadora;
    }

    public String getColor() {
        return color;
    }

   

    public int getDimensionPantalla() {
        return dimensionPantalla;
    }

    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDimensionPantalla(int dimensionPantalla) {
        this.dimensionPantalla = dimensionPantalla;
    }

   
}
