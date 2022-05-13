/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticexception;

/**
 *
 * @author Nasywa Davina
 */
    class AgeInvalid extends Exception{
    AgeInvalid(String s){
    }
}
public class KeywordThrow{
    static void validate(int age)throws AgeInvalid{
        if(age<18)
            throw new AgeInvalid ("not valid");
            else
            System.out.println("welcome to vote");
    }
    public static void main (String args[]){
        try{
            validate(13);
        }
        catch(Exception i){
            System.out.println("Exception aktif" + i);
        }
        System.out.println("rest ");
    }
}
