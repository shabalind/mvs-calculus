  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f123(_ v0: s1) -> s1 {
    let v8: [s1] = [v0, v0, v0, v0, v0, v0, v0]
    let v6: s1 = v8[5]
    let v2: s1 = v8[1]
    var v24: [s1] = v8
    v24[5] = v2
    let v14: s1 = v24[0]
    v24[3] = v6
    return v14
  }
  func f114(_ v0: s1, _ v1: s1) -> s1 {
    var v6: s1 = v1
    let v4: s1 = f123(v6)
    let v3: s0 = v4.p0
    v6.p1 = v3
    v6.p1 = v3
    var v58: s1 = v4
    var v123: s1 = v58
    let v141: s1 = f123(v123)
    return v141
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v6: s1 = f114(v0, v0)
    let v4: s0 = v6.p1
    let v13: [[Double]] = v4.p0
    let v30: [Double] = v13[0]
    let v75: Double = v30[0]
    return v75
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]))
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
