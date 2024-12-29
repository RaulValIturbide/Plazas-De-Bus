package plazasbus;
import java.util.Scanner;

public class PlazasBus {
    //false significa que el asiento esta libre
    //true significa asiento ocupado

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usuario;
        boolean terminar = false;
        boolean[] aPlaza = new boolean[10];

        do{
        usuario = Menu.preguntaAsiento();
        
        if (comprobacionAsiento(aPlaza[usuario]) == false){
            System.out.println("Asiento " + (usuario+1)  + " asignado");
            aPlaza[usuario] = true;
        
        }else{
            System.out.println("El asiento " + (usuario+1) + " ya esta ocupado, lo siento");
        }
        
        System.out.println("Ahora mismo hay " + contarAsientosVacios(aPlaza) + " asientos libres");
        if(contarAsientosVacios(aPlaza) == 0){
            terminar = true;
        }
        }while(!terminar);
        
    }

    private static boolean comprobacionAsiento(boolean aPlaza) {
        if (aPlaza == true) {
            return true;
        } else {
            return false;
        }

    }
    private static int contarAsientosVacios(boolean[] aPlaza){
        int contador = 0;
        for (int i = 0; i<aPlaza.length;i++){
            if (aPlaza[i] == false){
            contador++;
            }
        }
    return contador;}

}
