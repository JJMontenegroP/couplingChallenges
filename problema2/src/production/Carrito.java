package production;

import java.util.ArrayList;
import java.util.List;

public class Carrito implements ICarrito {
    private List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }

    @Override
    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}
