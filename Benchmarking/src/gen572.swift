  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: [[Double]] = v0.p0
    let v3: [Double] = v7[1]
    var v11: [[Double]] = v7
    v11[1] = v3
    var v23: [Double] = v3
    let v10: Double = v23[0]
    v23[0] = v10
    var v24: [[Double]] = v11
    let v15: [Double] = v24[1]
    let v18: Double = v15[0]
    let v28: Double = v18 + v1
    var v25: [Double] = v23
    var v128: [Double] = v25
    let v54: Double = v128[0]
    v25[0] = v1
    v23[0] = v28
    return v54
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]])
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
