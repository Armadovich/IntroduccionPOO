package VehiculosExcepciones;

public class Main {
    public static void main(String[] args) {

        Vehiculo[] test = new Vehiculo[5];
        System.out.println("Coche 1");
        try {
            test[0] = new Vehiculo("rojo", "BMW", "6983HTE", 2016);
        } catch (ExcepcionVehiculo e){
            System.out.println(e.getMessage());
        }
        System.out.println("Coche 2");
        try {
            test[1] = new Vehiculo("violeta", "Porsche", "4563GLH", 2020);
        } catch (ExcepcionVehiculo e){
            System.out.println(e.getMessage());
        }
        System.out.println("Coche 3");
        try{
            test[2] = new Vehiculo("azul", "Fiat", "345FGH", 2025);
        } catch (ExcepcionVehiculo e){
            System.out.println(e.getMessage());
        }
        System.out.println("Coche 4");
        try {
            test[3] = new Vehiculo("naranja", "McLaren", "3458FgH", 2020);
        } catch (ExcepcionVehiculo e){
            System.out.println(e.getMessage());
        }
        System.out.println("Coche 5");
        try {
            test[4] = new Vehiculo("azul", "Opel", "7932ORE", 2015);
        } catch (ExcepcionVehiculo e){
            System.out.println(e.getMessage());
        }
    }
}
