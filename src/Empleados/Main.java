package Empleados;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empleado[] test = new Empleado[7];
        test[0] = new Operario("Armada", 1300, LocalDate.of(2014,4,14),"", "8");
        test[1] = new Directivo("Fulgencio", 4500, LocalDate.of(2004, 1, 22), "Asistente Direccion", "Direccion");
        test[2] = new Tecnico("Acha", 1200, LocalDate.of(2024, 1, 22),"Radiologia", "4", "Rayos X");
        test[3] = new Empleado("Dani",56, LocalDate.of(2024,1,7));
        test[4] = new Oficial("Breo", 6,LocalDate.now(),"areaJugones","espacial","Ratoniano");
        test[5] = new Directivo("Hacha", 0,LocalDate.now(),"Cafetero","Cafeteria");
    }
}
