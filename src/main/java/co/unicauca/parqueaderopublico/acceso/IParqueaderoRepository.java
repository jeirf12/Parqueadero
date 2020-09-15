package co.unicauca.parqueaderopublico.acceso;

import java.util.List;

/**
 * @author Jhonfer Ruiz,Jhonny Rosero
 */
public interface IParqueaderoRepository {
    boolean guardarVehiculo(Parqueadero vehiculo);
    List<Parqueadero> lista();
}
