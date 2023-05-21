public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //Calcular el area de un circulo: PI * r^2
        double area= circleArea(y);
        System.out.println(area); // otra forma de llamado (circleArea(y)

        //Calcular el area de una esfera: 4*PI*r^2
        System.out.println(sphereArea(y));

        //Volumen de una esfera: (4/3)*pi*r^3
        sphereVolumen(y); // LLamada de la funcion

        //Llamada de la funcion convertir moneda
        System.out.println("Pesos a DOlares: " + converToDolar(200, "MXN"));
        System.out.println("Pesos a DOlares: " + converToDolar(1000, "COP"));

        //Habiliar opcion de ver la documentacion en Intelli
        //Clic en file --> Setting --> Editor --> General --> Code Completion --> Habilitar Show the documentation popup in [1000] ms --> Aceptar
        //otra forma: Clic en file --> Setting --> Editor --> General --> Code Editing -->Quick documentacion --> habilitar Show quick Documentation on hover -->Aceptar
        //Luego al escribir la funcion y al pasar el mouse o clic en los 2 puntos se verá la documentacion
        converToDolar(100, "MXN");
    }


    //Las funciones deben vivir al nivel de la clase

    //Tiposde comentarios:
    // (este es de una sola linea, el compilador no la lee)

    /*
    * Este comentario es de multiples lineas
    * El compilador no la lee
    * fin.
     */

    /**
     * Este tipo de comentario o para la documentacio
     * que el compilador si va a leer.
     * Por lo que se usa esta estructura
     */

    public static double circleArea(double r){
        //Calcular el area de un circulo: PI * r^2
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        //Calcular el area de una esfera: 4*PI*r^2
        return 4*(Math.PI)*(Math.pow(r,2));
    }

    public static double sphereVolumen(double r){
        //Volumen de una esfera: (4/3)*pi*r^3
        return (4/3)*(Math.PI)*(Math.pow(r,3));
    }

    //Documentacion de la funcion usando JavaDoc

    /**
     * Descripcion: Esta funcion que especificando su moneda comvierte una cantidad de dinero en dolares
     * @param quantity  Cantidad de dinero
     * @param currency  Tipo de moneda: Solo acepta MXN o COP(colombianos)
     * @return quantity Devuelve la cantidad actualizada en dolares
     */
    public static double converToDolar(double quantity, String currency){
        //MXN COP Qtz
        switch (currency){
            case "MXN" :
                quantity = quantity*0.052;
                break;
            case "COP":
                quantity = quantity*0.00031;
                break;
            default:
                System.out.println("Currency does not exist in the database ");
                break;
        }

        return quantity;
    }
}
