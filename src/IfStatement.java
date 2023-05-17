public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if(isBluetoothEnabled){ //Si es verdadero
            //send file
            fileSended++;
            System.out.println("archivo Enviado");
            System.out.println(fileSended);
        }
    }
}
