  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s7 {
    var p0: Double
    var p1: s2
  }
  func f22(_ v0: Double, _ v1: s2) -> Double {
    let v5: s0 = v1.p0
    let v7: [[Double]] = v5.p1
    let v12: [Double] = v7[0]
    let v10: Double = v12[0]
    return v10
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s7, _ v2: Double) -> Double {
    let v4: Double = v2 - v2
    let v5: Double = f22(v2, v0)
    let v7: Double = v4 * v5
    let v14: Double = f22(v7, v0)
    return v14
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s1(p0: s0(p0: [[2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])]))
    let v1: s7 = s7(p0: 8.0, p1: s2(p0: s0(p0: [[9.0]], p1: [[10.0]]), p1: s1(p0: s0(p0: [[11.0]], p1: [[12.0]]), p1: [s0(p0: [[13.0]], p1: [[14.0]]), s0(p0: [[15.0]], p1: [[16.0]])])))
    let v2: Double = 17.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 17.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
