/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.excepciones.modelo;

/**
 *
 * @author Estudiante
 */
public class Test1 {
    public Test1() throws Excepcion1{
        int a = 0;
        this.dividirPorCero();
    }
    public int dividirPorCero() throws Excepcion1{
        int r = 0;
        int k = 5;
        if(r==0){
            throw new Excepcion1("r=0");
        }
            return 5/0;
        
    }
       
    public static void main(String[] args) {
       try {
        Test1 e = new Test1();
        }catch(ArithmeticException error){
            System.out.println(error.getMessage());
        }catch(Excepcion1 error2){
            System.out.println(error2.getMessage());
        }
    }
}
