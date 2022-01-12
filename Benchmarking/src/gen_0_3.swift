  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
    var p2: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v8: s1 = v0.p0
    let v2: s0 = v8.p2
    let v6: [[Double]] = v2.p0
    var v4: [[Double]] = v6
    let v9: [Double] = v4[0]
    let v14: [Double] = v4[0]
    v4[0] = v14
    let v21: Double = v14[0]
    v4[0] = v9
    let v23: Double = v14[0]
    var v19: Double = v23
    v4[0] = v9
    let v69: Double = v1 * v23
    let v68: Double = v19 - v69
    v4[0] = v14
    let v71: [Double] = [v69, v68, v21]
    var v144: [Double] = v71
    let v280: Double = v144[0]
    return v280
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [s0(p0: [[0.0]]), s0(p0: [[1.0]]), s0(p0: [[2.0]])], p1: [[s0(p0: [[3.0]])]], p2: s0(p0: [[4.0]])), p1: [s0(p0: [[5.0]])])
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
