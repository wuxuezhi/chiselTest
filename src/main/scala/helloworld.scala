
import chisel3._
import chisel3.stage.ChiselStage

object HelloWorld extends App {
  println("{generating Verilog file}")
  (new ChiselStage).emitVerilog(new hello)
}

class hello extends Module {
  val  io = IO(new Bundle() {
    val a = Input(UInt(2.W))
    val b = Input(UInt(2.W))
    val c = Output(UInt(2.W))
  })

  io.c := io.a & io.b
}