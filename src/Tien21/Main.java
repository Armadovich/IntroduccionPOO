package Tien21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] array = new Electrodomestico[10];
        array[0] = new Electrodomestico(50, "azul",'D',40);
        array[1] = new Electrodomestico(120, "marron",'F',50);
        array[2] = new Electrodomestico(145, "marron",'A',200);
        array[3] = new Electrodomestico(100, "gris",'G',120);
        array[4] = new Lavavajillas(100,"blanco",'B',100,15);
        array[5] = new Lavavajillas(150,"rojo",'C',120,5);
        array[6] = new Lavavajillas(149,"rojo",'B',34,16);
        array[7] = new Television(250, "negro", 'F', 50,25,false);
        array[8] = new Television(146, "negro", 'D', 134,65,false);
        array[9] = new Television(200, "negro", 'C', 15,30,true);

        double precioTelevisiones = 0;
        double precioLavavajillas = 0;
        double precioElectrodomesticos = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Television){
                precioTelevisiones += array[i].precioFinal();
            }
            else if (array[i] instanceof Lavavajillas){
                precioLavavajillas += array[i].precioFinal();
            }
            precioElectrodomesticos += array[i].precioFinal();
        }

        System.out.println("El precio total de las televisiones es "+ precioTelevisiones);
        System.out.println("El precio total de los lavavajillas es "+ precioLavavajillas);
        System.out.println("El precio total de todos los electrodomesticos es "+ precioElectrodomesticos);

        System.out.println("Total de Televisiones: " + Arrays.stream(array).filter(ob -> ob instanceof Television).mapToDouble(Electrodomestico::precioFinal).sum());
        System.out.println("Total de Lavavajillas: " + Arrays.stream(array).filter(ob -> ob instanceof Lavavajillas).mapToDouble(Electrodomestico::precioFinal).sum());
        System.out.println("Total: " + Arrays.stream(array).mapToDouble(Electrodomestico::precioFinal).sum());
    }


}
