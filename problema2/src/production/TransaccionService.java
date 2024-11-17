package production;

public class TransaccionService {
    private final IInventario inventario;

    public TransaccionService(IInventario inventario) {
        this.inventario = inventario;
    }

    public void procesarTransaccion(ICarrito carrito) {
        double precioTotal = carrito.calcularPrecioTotal();
        System.out.println("El precio total es: " + precioTotal);
        inventario.actualizarInventario((Carrito) carrito);
    }
}
