circuit hello :
  module hello :
    input clock : Clock
    input reset : UInt<1>
    input io_a : UInt<2>
    input io_b : UInt<2>
    output io_c : UInt<2>

    node _T = and(io_a, io_b) @[helloworld.scala 17:16]
    io_c <= _T @[helloworld.scala 17:8]
