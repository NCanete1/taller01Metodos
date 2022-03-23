public class main {
    public static int Numero1(){
        int min = 1;
        int max = 20;
        int n = (int) (Math.random() * (max - min)) + min;
        return n;
    }
    public static int StockProductos(){
        int min = 0;
        int max = 15;
        int x = (int) (Math.random() * (max - min)) + min;
        return x;
    }
    public static int[] ProductosCarro(){
        int[] cantidad= new int[Numero1()];
        for (int i = 0; i < cantidad.length; i++) {
            cantidad[i] = StockProductos();
        }
        return cantidad;
    }
    public static int TotalProductos(){
        int[] Productos= ProductosCarro();
        int total=0;
        for(int i=0;i<Productos.length;i++){
            total= total+Productos[i];
        }
        return total;
    }
    public static void MostrarDetalle(int[] Productos){
        for(int i=0;i<Productos.length;i++){
            System.out.println("El producto ["+ (i+1) +"] cantidad:"+Productos[i]);
        }
    }
    public static int[] PrecioProductos() {
        int[] precio = ProductosCarro();
        for (int i = 0; i < precio.length; i++) {
            int n = i * 150;
            precio[i] = 500 + n;
        }
        return precio;
    }
    public static int TotalCompra(){
        int [] precio = PrecioProductos();
        int [] cantidad = ProductosCarro();
        int total=0;
        for (int i = 0; i < ProductosCarro().length; i++) {
            total = total+ (precio[i] * cantidad[i]);
        }
        return total;
    }

    public static void Ejecutar() {
        int [] precio = PrecioProductos();
        int [] cantidad = ProductosCarro();
        int total=0;
        for (int i = 0; i < ProductosCarro().length; i++) {
            System.out.println("Producto ["+ (i+1)+ "]" +": "+ cantidad[i]+ " Precio: "+ (cantidad[i]* precio[i]));
            System.out.println("El total de productos = "+ TotalProductos());

            total = total+ (precio[i] * cantidad[i]);
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        Ejecutar();
    }
}