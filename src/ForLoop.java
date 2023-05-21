public class ForLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        turnOnOffLight();

        for (int i = 1; i <= 10; i++) {
            printSOS();
        }

    }

    //Funcion imprime una señal SOS
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        //operador ternario:
        // isTurnOnLight =  //Agrega la asignacion
        // () //dentro de parentesis agregar la operacion a ejecutar
        // ?  //para indicar que es una operacion
        // valor1  //seria el primer dato de regreso
        // valor2  //seria el segundo dato de regreso
        //Si la funcion cumple se devuelve el primer dato, sino, devuelve el segundo dato

        //isTurnOnLight = () ? valor1:valor2;
        isTurnOnLight = (isTurnOnLight) ? false:true;
/*
        // if equivalente al operador ternario
        if(isTurnOnLight) { //si la lampará = true;
            isTurnOnLight = false;
        }else { //pero si esta apagada
            isTurnOnLight = true;
        }
 */

        return isTurnOnLight;
    }

}
