package me.isortegah.labs.gestorTareas;

public class TareaEnvioCorreo implements TareaProducto{

    @Override
    public int ejecutar(Producto producto) {
        System.out.println(producto.getNombre() +" enviado por correo") ;

        return 0;
    }
}
