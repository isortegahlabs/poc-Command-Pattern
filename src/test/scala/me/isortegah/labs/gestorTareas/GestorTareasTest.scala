package me.isortegah.labs.gestorTareas

import org.scalatest.Assertions
import org.scalatest.funspec.AnyFunSpec

class GestorTareasTest extends AnyFunSpec with Assertions{

  describe("A GestorTareas") {

    it("should run the TareaValidarProducto task"){
      val gt = new GestorTareas
      assert(gt.ejecutar(new TareaValidarProducto, new Producto(1, "tablet", 100)) == 0)
    }

    it("should run the TareaEnvioCorreo task"){
      val gt = new GestorTareas
      assert(gt.ejecutar(new TareaEnvioCorreo, new Producto(1, "tablet", 100)) == 0)
    }

    it("should run the TareaImprimirProducto task"){
      val gt = new GestorTareas
      assert(gt.ejecutar(new TareaImprimirProducto, new Producto(1, "tablet", 100)) == 0)
    }
  }

}
