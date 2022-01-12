  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    var v5: [[s0]] = v0
    var v2: Double = v1
    let v4: [s0] = v5[1]
    let v9: s0 = v4[0]
    let v12: [[Double]] = v9.p0
    let v27: [Double] = v12[0]
    let v24: Double = v2 + v1
    let v21: Double = v27[0]
    let v30: Double = v24 + v21
    let v70: Double = v2 - v30
    return v70
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]])], [s0(p0: [[2.0], [3.0]])], [s0(p0: [[4.0], [5.0]])]]
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
