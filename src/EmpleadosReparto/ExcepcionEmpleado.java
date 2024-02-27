package EmpleadosReparto;

public class ExcepcionEmpleado extends Exception{

    private String errorMessage;
    static final int WRONG_INPUT = 1;
    static final int WRONG_CHARACTERS = 2;
    static final int WRONG_NAME_LENGHT = 3;
    static final int WRONG_AGE_LENGTH = 4;

    public ExcepcionEmpleado() {
    }

    public ExcepcionEmpleado(String message) {
        super(message);
    }

    public ExcepcionEmpleado(int error) {
        switch (error){
            case WRONG_INPUT:
                errorMessage = "*** ERROR: Input inválido";
                break;
            case WRONG_CHARACTERS:
                errorMessage = "*** ERROR: Caracteres inválidos";
                break;
            case WRONG_NAME_LENGHT:
                errorMessage = "*** ERROR: Longitud mayor a 20 caracteres de la cadena";
        }
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}
