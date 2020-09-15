package co.unicauca.parqueaderopublico.modelo;

/**
 * @author Jhonfer Ruiz,Jhonny Rosero
 */
public interface IVehiculoCosto {
    /**
     * calcula el pago dependiendo de la clase instanciada
     * @param minutos recibe las horas que estuvo el vehiculo en forma 
     * de minutos para mas facil su manejo a la hora del calculo
     * @return pago de naturaleza double
     */
    double calcularPago(int minutos);
}
