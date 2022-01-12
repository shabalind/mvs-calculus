  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v3: [s0] = v0[0]
    let v8: s0 = v3[0]
    let v14: [[Double]] = v8.p0
    var v13: Double = v1
    let v30: [Double] = v14[0]
    var v29: [Double] = v30
    let v26: Double = v29[0]
    let v28: Double = v26 / v13
    let v79: Double = v28 + v1
    v29[0] = v1
    return v79
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]]
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
