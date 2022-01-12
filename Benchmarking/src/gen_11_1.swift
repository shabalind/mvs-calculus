  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: [s2]
    var p1: [s2]
  }
  func f77(_ v0: [s0]) -> [s0] {
    let v6: s0 = v0[1]
    var v3: s0 = v6
    let v4: s0 = v0[0]
    v3 = v6
    var v7: [s0] = v0
    let v5: [s0] = [v6, v4, v4, v3, v6]
    let v9: s0 = v5[0]
    let v1: s0 = v5[0]
    let v2: [[Double]] = v4.p1
    let v17: [[Double]] = v9.p0
    v3.p0 = v17
    v7[1] = v1
    v3 = v9
    v3.p1 = v2
    v3.p1 = v2
    v7[1] = v6
    return v7
  }
  func f64(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    let v8: [[Double]] = v0.p0
    var v3: [[Double]] = v8
    let v7: [Double] = v4[1]
    var v6: [Double] = v7
    let v1: [Double] = v3[0]
    v3 = v8
    v6 = v1
    var v12: [[Double]] = v8
    v3[0] = v7
    let v15: [Double] = v12[0]
    v3[0] = v15
    let v21: [[Double]] = v0.p1
    var v13: s0 = v0
    let v23: Double = v7[0]
    v6[0] = v23
    let v19: [Double] = v21[0]
    v6[0] = v23
    var v25: s0 = v13
    let v10: s0 = s0(p0: v3, p1: v21)
    v3[0] = v6
    v3[0] = v7
    v3[0] = v15
    let v28: [s0] = [v0, v10, v0]
    let v34: [s0] = f77(v28)
    let v61: [[Double]] = v25.p0
    let v56: [Double] = v61[0]
    var v50: [s0] = v34
    let v52: s0 = v50[1]
    v12[0] = v56
    v3[0] = v19
    return v52
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v2: [s2] = v0.p0
    let v3: s2 = v2[0]
    let v8: [s0] = v3.p0
    let v20: s0 = v8[1]
    let v27: s0 = f64(v20)
    let v52: [[Double]] = v27.p1
    var v64: [[Double]] = v52
    let v95: [Double] = v64[1]
    let v100: Double = v95[0]
    return v100
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s2(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: [s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0]], p1: [[16.0], [17.0]])])], p1: [s2(p0: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]])], p1: [s0(p0: [[27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0], [32.0]]), s0(p0: [[33.0]], p1: [[34.0], [35.0]])])])
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
