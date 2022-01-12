  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v8: s0 = v0.p0
    var v6: s0 = v8
    let v7: [[Double]] = v8.p1
    v6.p1 = v7
    v6.p1 = v7
    v6.p1 = v7
    let v19: [[Double]] = v6.p0
    v6.p0 = v19
    let v22: [Double] = v19[1]
    let v23: Double = v22[0]
    return v23
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))
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
