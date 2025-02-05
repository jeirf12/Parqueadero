package co.unicauca.parqueaderopublico.utilidades;

/**
 * @author Jhonfer Ruiz,Jhonny Rosero
 */
public class Round {
    /**
     * El método redondea un valor ingresado
     * @param numero recibe un dato ingresado
     * @return retorna el numero redondeado
     */
    public static int redondear(int numero){
        int residuo=numero%100;
        if (residuo!=0) {
            numero+=100-residuo;
        }
        return numero;
    }
}
