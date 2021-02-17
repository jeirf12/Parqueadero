package co.unicauca.parqueaderopublico.modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Jhonfer Ruiz,Jhonny Rosero
 */
public class CarroVehiculoCostoTest {
    
    public CarroVehiculoCostoTest() {
    }

    /**
     * Test of calcularPago method, of class CarroVehiculoCosto.
     */
    @Test
    public void testCalcularPago() {
        //Prueba 1
        System.out.println("calcularPago");
        int minutos = 23;
        CarroVehiculoCosto instance = new CarroVehiculoCosto();
        double expResult = 2000;
        double result = instance.calcularPago(minutos);
        assertEquals(expResult, result, 0.0);
        //Prueba 2
        System.out.println("calcularPago");
        minutos = 62;
        expResult = 2100;
        result = instance.calcularPago(minutos);
        assertEquals(expResult, result, 0.0);
        //Prueba 3
        System.out.println("calcularPago");
        minutos = 203;
        expResult = 4400;
        result = instance.calcularPago(minutos);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
