public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //Operadores de asignacion
        System.out.println("a es igual a b -> "+ (a==b));
        System.out.println("a es diferente a b -> "+ (a!=b));

        //Operadores Relacionales
        System.out.println("a es mayor a b -> "+ (a>b));
        System.out.println("a es menor a b -> "+ (a<b));

        System.out.println("a es mayor o igual a b -> "+ (a>=b));
        System.out.println("a es menor o igual a b -> "+ (a<=b));

        System.out.println("-----------------  ------ -");
        if (a ==b){
            System.out.println(" a es igual a b");
        } else if ((a!=b) && (a>b)) { //(a!=b)
            System.out.println(" a es diferente a b");
        } else if (a>b) {
            System.out.println(" a es Mayor a b");
        } else if (a<b) {
            System.out.println(" a es Menor a b");
        } else if (a>=b) {
            System.out.println(" a es Mayor o igual a b");
        }else if (a<=b) {
            System.out.println(" a es Menor o igual a b");
        }
    }
}
