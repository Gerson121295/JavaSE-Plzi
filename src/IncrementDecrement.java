public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;

        lives = lives -1;

        System.out.println(lives); //4

//forma postfija
        lives--; //para decrementar 1
        System.out.println(lives);
        lives++;  //Incrementa 1
        System.out.println(lives);

        System.out.println("--------------");
//forma prefija
        //gana regalo por ganar 1 vida
        int gift = 100 + lives++; //postfijo: accede primero al dato de la variable despues la incrementa
        System.out.println(gift);
        System.out.println(lives);

        System.out.println("--------------");
        int gift1 = 100 + ++lives; //prefijo: obtiene el dato incrementado - agrega 100puntos mas la vida que acaba de adquirir
        System.out.println(gift1);
        System.out.println(lives);

    }
}
/*
//Operadores de Asignacion
    Operador  Aplicacion  Desglose
        +=      a+= b        a = a+b
        -=      a-= b        a = a-b
        *=      a*= b        a = a*b
        /=      a/= b        a = a/b
        %=      a%= b        a = a%b

//Operadores de incremento
    Operador    Nombre      Ejemplo    Desglose
        ++      incremento      i++     i=i+1
        --      decremento      i--     i=i-1


*/


