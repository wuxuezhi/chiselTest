;buildInfoPackage: chisel3, version: 3.4.2, scalaVersion: 2.12.12, sbtVersion: 1.3.10
circuit hello : 
  module hello : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip a : UInt<2>, flip b : UInt<2>, c : UInt<2>}
    
    node _T = and(io.a, io.b) @[helloworld.scala 17:16]
    io.c <= _T @[helloworld.scala 17:8]
    
