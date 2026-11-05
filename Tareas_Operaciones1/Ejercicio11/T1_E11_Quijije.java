package Ejercicio11;


public class T1_E11_Quijije {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        boolean parte1 = (5 > 3) && (8 <= 10);
        boolean parte2 = !(a == b);
        boolean resultado = parte1 || parte2;
        
        System.out.println("Resultado: " + resultado);
    }
}