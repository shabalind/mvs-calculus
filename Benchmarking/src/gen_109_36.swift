  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v2: s0 = v0.p0
    let v3: [[Double]] = v2.p0
    let v5: [Double] = v3[0]
    let v7: [[Double]] = v2.p0
    let v10: [[Double]] = v2.p0
    let v15: [Double] = v7[0]
    let v9: [Double] = v10[0]
    let v14: [[Double]] = [v9, v5, v5, v15, v15]
    let v58: [Double] = v14[2]
    let v51: Double = v58[0]
    return v51
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]]), p1: [[s0(p0: [[1.0]])], [s0(p0: [[2.0]])]])
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
