package miPrincipal;
public class DemoPila{
    public static void menu(){
        System.out.println("************************");
        System.out.println("          PILA          ");
        System.out.println("************************");
        System.out.println();
        //Crear una nueva pila de enteros
        Pila<Integer> pila = new Pila<Integer>();
        //apilar algunos datos enteros
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);
        System.out.println("El tope de la pilar es "+pila.cima());
        //se desapila
        int posicion = pila.buscar(5);
        if (posicion != -1) {
            System.out.println("El elemento 5 se encuentra en la posición " + posicion + " de la pila.");
        } else {
            System.out.println("El elemento 5 no se encuentra en la pila.");
        }

       
        pila.retirar();

        System.out.println("El tope de la pila es " + pila.cima());


        posicion = pila.buscar(5);
        if (posicion != -1) {
            System.out.println("El elemento 5 se encuentra en la posición " + posicion + " de la pila.");
        } else {
            System.out.println("El elemento 5 no se encuentra en la pila.");
        }
    

    }

}