/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploFacade;



/**
 *
 * @author Estudiante
 */
public class ImpresoraDemo extends Impresora{
  
    
    public static void main(String[] args) {
        ImpresoraNormal impresora1 = new ImpresoraNormal("PDF","a4",true,"texto 1");
        ImpresoraAdicional impresora2 = new ImpresoraAdicional("Excel","A3",false,"Texto 2");
        
        System.out.println(impresora1);
        System.out.println(impresora2);
    }
}
