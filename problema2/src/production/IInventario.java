package production;

public interface IInventario {
    void agregarProducto(Producto producto);
    boolean verificarDisponibilidad(Producto producto);
    void actualizarInventario(Carrito carrito);
}
