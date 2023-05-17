public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //ceil devuelve un numero entero (hacia arriba) de un numero
        System.out.println(Math.ceil(x));

        //floor devuelve un numero entero (hacia abajo) de un numero
        System.out.println(Math.floor(x));

        //Devuelve un numero elevado a otro numero.
        System.out.println(Math.pow(x,y)); // recibe numero a elevar y potencia

        //Devuelve el numero mayor entre los datos
        System.out.println(Math.max(x,y));

        //Devuelve la raiz
        System.out.println(Math.sqrt(y));

        //Calcular el area de un circulo: PI * r^2
        System.out.println(Math.PI * (Math.pow(y,2)));

        //Calcular el area de una esfera: 4*PI*r^2
        System.out.println(4*(Math.PI)*(Math.pow(y,2)));

        //Volumen de una esfera: (4/3)*pi*r^3
        System.out.println((4/3)*(Math.PI)*(Math.pow(y,3)));

    }
}
