package co.unicauca.parqueaderopublico.modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Jhonfer Ruiz,Jhonny Rosero
 */
public class CamionVehiculoCostoTest {
    
    public CamionVehiculoCostoTest() {
    }
    
    /**
     * Test of calcularPago method, of class CamionVehiculoCosto.
     */
    @Test
    public void testCalcularPago() {
        //prueba 1
        System.out.println("calcularPago");
        int minutos = 1000;
        CamionVehiculoCosto instance = new CamionVehiculoCosto();
        double expResult = 15000;
        double result = instance.calcularPago(minutos);
        assertEquals(expResult, result, 0.0);
        //Prueba 2
        System.out.println("calcularPago");
        minutos = 632;
        expResult = 10000;
        result = instance.calcularPago(minutos);
        assertEquals(expResult, result, 0.0);
        //Prueba 3
        System.out.println("calcularPago");
        minutos = 2533;
        expResult = 26400;
        result = instance.calcularPago(minutos);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
