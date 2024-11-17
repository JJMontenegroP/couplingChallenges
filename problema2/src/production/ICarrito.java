package production;

import java.util.List;

public interface ICarrito {
    void agregarProducto(Producto producto);
    void eliminarProducto(Producto producto);
    List<Producto> obtenerProductos();
    double calcularPrecioTotal();
}
