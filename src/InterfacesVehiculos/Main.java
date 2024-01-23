package InterfacesVehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] test = new Vehiculo[4];
        test[0] = new Motocicleta(150);
        test[1] = new Motocicleta(100);
        test[2] = new Turismo(-47);
        test[3] = new Turismo(120);

        for (Vehiculo vehiculo : test) {
            System.out.println(vehiculo.acelerar(30));

        }
    }
}
