package me.isortegah.labs.gestorTareas;

public class TareaValidarProducto implements TareaProducto{

    @Override
    public int ejecutar(Producto producto) {
        if (producto.getPrecio() > 100) {
            System.out.println("producto valido");
        }else {

            System.out.println("producto invalido");
        }

        return 0;
    }
}
