  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f110(_ v0: s1) -> s1 {
    let v7: s0 = v0.p0
    var v2: s0 = v7
    let v1: [s0] = v0.p1
    let v6: [s1] = [v0, v0, v0]
    let v4: s1 = s1(p0: v2, p1: v1)
    var v3: [s1] = v6
    let v9: [[Double]] = v7.p0
    let v15: s1 = v6[2]
    v2.p0 = v9
    let v22: s0 = v15.p0
    v3[0] = v15
    v3[0] = v4
    let v48: [[Double]] = v22.p0
    v2.p0 = v48
    let v32: s1 = v3[0]
    var v58: [s1] = v6
    v58[0] = v32
    let v47: s1 = v58[0]
    var v86: s1 = v47
    return v86
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v6: [s1] = v0[0]
    var v8: Double = v1
    let v10: s1 = v6[0]
    let v12: s1 = f110(v10)
    let v11: s0 = v12.p0
    let v25: [[Double]] = v11.p0
    let v20: [Double] = v25[1]
    var v35: [Double] = v20
    var v30: [[Double]] = v25
    v35[0] = v8
    v30[0] = v35
    v30[0] = v35
    v35[0] = v1
    let v90: [Double] = v30[0]
    v35[0] = v8
    let v106: Double = v90[0]
    return v106
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]])])]]
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
