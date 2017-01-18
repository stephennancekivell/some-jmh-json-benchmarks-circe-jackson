#jmh json benchmarks for scala

People often wonder what the fastest json library is. These benchmarks are to help you make a informed desicion. Keep in mind performance shouldnt be your only consideration. Pure Jackson maybe faster than Circe, but it doesnt give the programmer as any of the good tooling.


    [info] Benchmark                            Mode  Cnt       Score     Error  Units
    [info] DecodeTest.argonautDecode           thrpt  200   51125.380 ± 215.120  ops/s
    [info] DecodeTest.argonautShapelessDecode  thrpt  200   49929.765 ± 231.572  ops/s
    [info] DecodeTest.circeJackson             thrpt  200   69157.472 ± 283.285  ops/s
    [info] DecodeTest.circeJacksonAuto         thrpt  200   67946.734 ± 315.876  ops/s
    [info] DecodeTest.circeJawn                thrpt  200   69259.949 ± 272.004  ops/s
    [info] DecodeTest.jacksonDecode            thrpt  200  189955.204 ± 860.234  ops/s
    [info] DecodeTest.sprayDecode              thrpt  200   85526.006 ± 383.987  ops/s

 
Also see [Circe benchmarks](https://github.com/circe/circe-benchmarks)