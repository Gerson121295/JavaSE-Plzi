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

        System.out.println((double) a/b); //Resultado es: 2.5
        //El codigo anterior el casting es forzado

        //Casting automatico deja a criterio el resultado
        double c = a/b;
        System.out.println(c); //Resultado es: 2.0

        //Convertir un caracter a entero
        char n = '1';
        int nI= n;
        System.out.println(nI); // 49

        short nS =(short) n;
        System.out.println(nS);

    }
}
