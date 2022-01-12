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
    let v8: s0 = v0.p1
    let v4: [[Double]] = v8.p0
    let v12: [Double] = v4[0]
    var v16: [[Double]] = v4
    v16[0] = v12
    let v9: [Double] = v16[0]
    v16[0] = v12
    let v19: Double = v9[0]
    var v18: Double = v19
    var v62: Double = v18
    v62 = v1
    return v62
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))
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
