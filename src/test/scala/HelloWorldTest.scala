import chisel3._
import chisel3.iotesters._

object HelloWorldTest extends App {
  println("{running testbench}")
  chisel3.iotesters.Driver(() => new hello()) {
    c => new HelloWorldTestbench(c)
  }

  chisel3.iotesters.Driver.execute(Array("--generate-vcd-output", "on"), () => new hello()) {
    c => new HelloWorldTestbench(c)
  }

}

class HelloWorldTestbench(dut : hello) extends PeekPokeTester(dut) {
  poke(dut.io.a, 0.U)
  poke(dut.io.b, 1.U)
  step(1)
  println("result is: "+ peek(dut.io.c).toString)
  poke(dut.io.a, 3.U)
  poke(dut.io.b, 2.U)
  step(1)
  println("result is: " + peek(dut.io.c).toString)
}