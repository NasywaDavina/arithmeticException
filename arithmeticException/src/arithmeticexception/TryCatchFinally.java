/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticexception;

/**
 *
 * @author Nasywa Davina
 */
public class TryCatchFinally {
    public class tryCatchFinally {
    public tryCatchFinally() {
    }

    public static void main(String args[]) {
      int zeroInt = 0;
      int anInt = 10; 
        try {
int DivResult = anInt / zeroInt;
            System.out.println("Hasilnya adalah " + DivResult);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("terjadi pembagian dengan nol");
            System.out.println("diatasi blok penanganan sendiri");
            System.out.println(e);
        } finally {
            System.out.println("kalimat di finally");
        }
        System.out.println("kalimat diluar blok try-catch-finally");
    }
}
}
