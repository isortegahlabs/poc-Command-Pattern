package me.isortegah.labs.gestorTareas;

public class Principal {

    public static void main(String[] args) {
        SuperTarea st= new SuperTarea();

        st.addTarea(new TareaValidarProducto());
        st.addTarea(new TareaEnvioCorreo());
        st.addTarea(new TareaImprimirProducto());

        GestorTareas gt= new GestorTareas();
        Producto p= new Producto(1,"tablet",100);
        Producto p1= new Producto(2,"movil",101);

        gt.ejecutar(st, p);
        gt.ejecutar(st , p1);

    }
}
