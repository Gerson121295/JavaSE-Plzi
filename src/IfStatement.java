public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if(isBluetoothEnabled){ //Si es verdadero
            //send file
            fileSended++;
            System.out.println("archivo Enviado");
            System.out.println(fileSended);
        }else{
            fileSended--;
            System.out.println("Please turn on your bluetooth to start the transfer");
            System.out.println(fileSended);
        }

    }
}
