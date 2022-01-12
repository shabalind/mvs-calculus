  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: Double) -> Double {
    let v4: s0 = v0[0]
    let v3: [[Double]] = v4.p0
    let v8: s0 = v0[1]
    let v18: [Double] = v3[1]
    let v15: [[Double]] = v8.p0
    let v49: Double = v18[0]
    let v56: [Double] = [v2, v2, v49, v2, v2]
    let v63: [Double] = v15[1]
    let v66: Double = v63[0]
    let v84: Double = v56[3]
    let v217: Double = v66 - v84
    return v217
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]]), s0(p0: [[2.0], [3.0]])]
    let v1: s0 = s0(p0: [[4.0], [5.0]])
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
