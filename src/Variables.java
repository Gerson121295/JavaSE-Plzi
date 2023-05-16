public class Variables {
//En un programa pueden haber muchos metodos main pero por buena practica solo 1
    public static void main(String[] args) {
        //Declarando una variable
        int speed;
        //Asigna valor a la variable
        speed = 10;
        System.out.println(speed);

        int salary = 1000;

        String employeeName = "Gerson";
        System.out.println(employeeName);

        //Naming- Convencion de Nombres para usar variables: Ej: camelCase
        //Inciacion de variables validas
//       String $countryName = "Spain";
//        String _backgroundColor = "Green";

//Inciacion de variables No validas
//        String background-color = "blue";

        //Constantes
        int POSITION = -5;
        int MAX_WIDTH = 99;
        int MIN_WIDTH = 1;

        //Convención:
        // Upper Camel Case: NamingJava (para nombre de Clases)
        // Lower Camel Case: fullName, sizeInCentimeters (para nombre de variables y metodos)

        //DataTypes
        int n = 1234567890; //int solo permite agregar 10 digitos
        long nL = 12345678901L; //se debe agregar un letra L al final
        double nD = 123.456123456; //Para calculos matematicos que requiera presicion
        float nF = 123.456F; //agregar F al final

        // Enteros:
        // byte: 1 byte  Rango: -128 a 127
        // short:2 bytes Rango: -32,768 a 37,767
        // int:  4 bytes Rango: -2,147,483,648 a 2,147,483,647
        // long: 8 bytes Rango: el doble de 4 bytes

        //float: 4 bytes
        //double: 8 bytes

        System.out.println("\n -------------------------------->");
        //A partir de Java 10 soporta agregar la variable sin el tipo de dato
        var salario = 1000; //int
        //pension 3%
        var pension = salario*0.03; //int double

        var totalSalario = salario - pension;

        System.out.println(salario);
        System.out.println(pension);
        System.out.println(totalSalario);

        System.out.println();
        System.out.println("-----------Cadena-------------");

        var nombreEmpleado = "Gerson Ep";
        System.out.println("El nombre es: " + nombreEmpleado + " Su salario es: " + totalSalario);
    }

}

