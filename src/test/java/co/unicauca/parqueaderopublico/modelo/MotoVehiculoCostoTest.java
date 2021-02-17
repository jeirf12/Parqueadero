package co.unicauca.parqueaderopublico.modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Jhonfer Ruiz,Jhonny Rosero
 */
public class MotoVehiculoCostoTest {
    
    public MotoVehiculoCostoTest() {
    }

    /**
     * Test of calcularPago method, of class MotoVehiculoCosto.
     */
    @Test
    public void testCalcularPago() {
        //Prueba 1
        System.out.println("calcularPago");
        int minutos = 46;
        MotoVehiculoCosto instance = new MotoVehiculoCosto();
        double expResult = 1000;
        double result = instance.calcularPago(minutos);
        assertEquals(expResult, result, 0.0);
        
        //Prueba 2
        System.out.println("calcularPago");
        minutos = 163;
        expResult = 1900;
        result = instance.calcularPago(minutos);
        assertEquals(expResult, result, 0.0);
        //Prueba 3
        System.out.println("calcularPago");
        minutos = 180;
        expResult = 2000;
        result = instance.calcularPago(minutos);
        assertEquals(expResult, result, 0.0);
    }
    
}
