  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [Double]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s1, _ v2: s1, _ v3: s2, _ v4: Double) -> Double {
    let v7: [[Double]] = v0.p1
    let v6: [Double] = v7[0]
    let v8: [[Double]] = v0.p1
    let v13: Double = v6[0]
    let v25: [Double] = v8[0]
    let v56: Double = v25[0]
    let v49: Double = v13 * v56
    let v75: Double = v6[0]
    var v48: Double = v49
    v48 = v75
    return v48
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
    let v1: s1 = s1(p0: [3.0, 4.0], p1: s0(p0: [[5.0], [6.0]], p1: [[7.0]]))
    let v2: s1 = s1(p0: [8.0, 9.0], p1: s0(p0: [[10.0], [11.0]], p1: [[12.0]]))
    let v3: s2 = s2(p0: s0(p0: [[13.0], [14.0]], p1: [[15.0]]), p1: s0(p0: [[16.0], [17.0]], p1: [[18.0]]))
    let v4: Double = 19.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 19.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
