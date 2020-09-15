package me.isortegah.labs.gestorTareas;

public class TareaImprimirProducto implements TareaProducto{

    @Override
    public int ejecutar(Producto producto) {
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Id: " + producto.getId());
        System.out.println("Precio: " + producto.getPrecio());
        return 0;
    }
}
