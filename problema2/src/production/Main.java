package production;

public class Main {
    public static void main(String[] args) {
        // Inicialización de dependencias
        IInventario inventario = new Inventario();
        TransaccionService transaccionService = new TransaccionService(inventario);
        ICarrito carrito = new Carrito();

        // Crear productos
        Producto producto1 = new Producto("Producto 1", 1000);
        Producto producto2 = new Producto("Producto 2", 2000);
        Producto producto3 = new Producto("Producto 3", 3000);

        // Agregar productos al inventario
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);

        // Agregar productos al carrito
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        // Procesar transacción
        transaccionService.procesarTransaccion(carrito);
    }
}
