package VehiculosExcepciones;

public class ExcepcionVehiculo extends Exception {
    final static String EX1 = "La matricula no tiene el formato adecuado";
    final static String EX2 = "El color del vehiculo es erróneo";
    final static String DEFAULT = "Se ha lanzado una excepción";
    private String mensajeError;

    public ExcepcionVehiculo(int error) {
        mensajeError = ExcepcionMensaje(error);
    }
    public static String ExcepcionMensaje(int error){
        return switch (error) {
            case 1 -> EX1;
            case 2 -> EX2;
            default -> DEFAULT;
        };
    }

    @Override
    public String getMessage() {
        return mensajeError;
    }
}
