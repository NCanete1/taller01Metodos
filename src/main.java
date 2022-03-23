public class main {
    public static int Numero1(){
        int min = 1;
        int max = 20;
        int n = (int) (Math.random() * (max - min)) + min;
        return n;
    }
    public static int CantProductos(){
        int min = 0;
        int max = 15;
        int x = (int) (Math.random() * (max - min)) + min;
        return x;
    }
    public static int[] ProductosCarro(int Numero1){
        int[] cantidad= new int[Numero1];
        for (int i = 0; i < Numero1; i++) {
            cantidad[i] = CantProductos();
        }
        return cantidad;
    }
    public static void MostrarProductos(){
        int n = Numero1();
        for(int i=0;i<n;i++){
            System.out.println(ProductosCarro((n)));
        }
    }
    public static int[] ValorProductos(int cantidad) {
        int[] precio = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            int n = i * 150;
            precio[i] = 500 + n;
        }
        return precio;
    }

    public static int SumaProductos(int[] a, int b) {
        int suma = 0;
        for (int i = 0; i < b; i++) {
            suma = a[i] + suma;
        }
        return suma;
    }

    public static void main(String[] args) {
     MostrarProductos();
    }
}