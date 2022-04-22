module hello(
  input        clock,
  input        reset,
  input  [1:0] io_a,
  input  [1:0] io_b,
  output [1:0] io_c
);
  assign io_c = io_a & io_b; // @[helloworld.scala 17:16]
endmodule
