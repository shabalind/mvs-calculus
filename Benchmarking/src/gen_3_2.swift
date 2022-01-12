  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: Double) -> Double {
    let v3: s0 = v1[2]
    let v5: [[Double]] = v3.p0
    let v10: [Double] = v5[0]
    let v12: Double = v10[0]
    var v17: Double = v12
    var v23: [Double] = v10
    v23[0] = v17
    let v45: Double = v23[0]
    v23[0] = v17
    v23[0] = v12
    v17 = v12
    return v45
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]]), s0(p0: [[1.0]]), s0(p0: [[2.0]])]
    let v1: [s0] = [s0(p0: [[3.0]]), s0(p0: [[4.0]]), s0(p0: [[5.0]])]
    let v2: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
