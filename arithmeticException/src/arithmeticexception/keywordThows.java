/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticexception;

/**
 *
 * @author Nasywa Davina
 */
public class keywordThows {
    public static void test(int n)
        throws NullPointerException,ArithmeticException{
        if (n < 0) {
            throw new NullPointerException(
                    "KESALAHAN: null pointer");
        } else {
            throw new ArithmeticException(
                    "KESALAHAN: arithmetic exception");
        }
    }

    public static void main(String[] args) {
        try {
            test(-12); // menimbulkan eksepsi NullPointerException
            //test(0); // menimbulkan eksepsi ArithmeticException
        } catch (ArithmeticException|NullPointerException e) {
            System.out.println("Eksepsi ditangkap di sini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}
    
