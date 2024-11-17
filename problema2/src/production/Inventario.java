package production;

import java.util.HashMap;

public class Inventario implements IInventario {
    private HashMap<String, Producto> productos;

    public Inventario() {
        this.productos = new HashMap<>();
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.put(producto.getNombre(), producto);
    }

    @Override
    public boolean verificarDisponibilidad(Producto producto) {
        return productos.containsKey(producto.getNombre());
    }

    @Override
    public void actualizarInventario(Carrito carrito) {
        for (Producto producto : carrito.obtenerProductos()) {
            productos.remove(producto.getNombre());
        }
    }
}
