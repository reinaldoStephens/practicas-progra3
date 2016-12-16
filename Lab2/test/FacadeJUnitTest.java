/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import EjemploFacade.FachadaImpresora;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Estudiante
 */
public class FacadeJUnitTest {
    
    public FacadeJUnitTest() {
    }
    
 

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testFachadaImpresora() {
         FachadaImpresora impresora = new FachadaImpresora();
         String impresion1 = impresora.imprimirNormal("texto1");
         String impresion2 = impresora.imprimirAdicional("Texto2");
         
         System.out.println(impresion2);
         
         assertEquals(impresion1, "Impresora{tipoDocumento=PDF, hoja=A4, color=true, texto=texto1}");
//         assertEquals(impresion2, "Impresora{tipoDocumento=EXCEL, hoja=A3, color=false, texto=Texto2}");
     }
}

