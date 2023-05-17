public class Casting {
    public static void main(String[] args) {
        //En un año sembro 30 arboles
        //Cuantos arboles sembró al mes

        double monthlyTree = 30.0/12.0;
        System.out.println(monthlyTree);

        //Estimacion: comvertir tipo de dato en double a entero
        int estimatedMonthlyTree = (int) monthlyTree;
        System.out.println(estimatedMonthlyTree);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

    }
}
