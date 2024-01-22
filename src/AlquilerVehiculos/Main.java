package AlquilerVehiculos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("12321412F","Julio","Agosto");
        Vehiculo vehiculo1 = new Vehiculo("1231FGS","Chevrolet","Q4","blanco",30);
        Alquiler alquiler1 = new Alquiler(cliente1,vehiculo1, LocalDate.now(),3);

        System.out.println(alquiler1.getCliente().getNombre());
    }
}
