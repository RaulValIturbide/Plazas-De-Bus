package plazasbus;

import java.util.Scanner;

public class Menu {

    static Scanner teclado = new Scanner(System.in);

    public static int preguntaAsiento() {
        System.out.println("Que asiento te gustaria ocupar?");
        int usuario = teclado.nextInt();
        return usuario-1;
    }

    
}
