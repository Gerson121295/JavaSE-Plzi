public class Arrays {
    public static void main(String[] args) {
        //Declarar un Array, Los arreglos se declaran en plural
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2]; //4*2=8(le caben 8 elementos)

        /*
        * -----------------------------------
        * |     Country     |   City        |
        * -----------------------------------
        * |     Mexico      |   CDMX        |
        * |     Mexico      |   Guadalajara |
        * |     Colombia    |   Bogota      | //colombia = renglon 1, bogota = columna 0
        * |     Colombia    |   Medellin    |  //colombia=renglon 0, medellin = columna 1
        * -----------------------------------
         */

        int [][][] numbers = new int [2][2][2]; //2 renglones, 2 columnas y 2 paginas
        int [][][][] numbers4 = new int [2][2][2][2];

       //indice: es la manera de identificar una posicion en un arreglo

        //asignar datos a un arreglo
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "CupCake";
        androidVersions[3] = "Donut";

        //acceder a un dato del arreglo
        System.out.println("----- Array de 1 dimension -------");
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println("---------------------");
        System.out.println("----- Array de 2 dimension -------");

        //primeros e agrega el renglo luego la columna
        cities[0][0] = "colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        System.out.println();
        System.out.println("---------------------");
        System.out.println("----- Array de 4 dimension -------");

        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);
        System.out.println();
        System.out.println("---------------------");
    }
}
