package me.isortegah.labs.gestorTareas

import org.scalatest.Assertions
import org.scalatest.funspec.AnyFunSpec

class SuperTareaTest extends AnyFunSpec with Assertions{

  describe("A SuperTarea") {

    it("should run a to-do list"){
      val st = new SuperTarea
      st.addTarea(new TareaValidarProducto)
      st.addTarea(new TareaImprimirProducto)
      st.addTarea(new TareaEnvioCorreo)
      assert(st.ejecutar(new Producto(1, "tablet", 100)) == 0)
    }


  }

}
