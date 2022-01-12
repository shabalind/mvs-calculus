  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  func f27(_ v0: Double) -> Double {
    var v7: Double = v0
    var v3: Double = v7
    var v4: Double = v3
    let v6: [Double] = [v0, v3]
    let v2: Double = v6[1]
    let v12: Double = v6[0]
    let v15: Double = v6[1]
    v4 = v15
    let v8: [[Double]] = [v6]
    v4 = v12
    let v11: [Double] = v8[0]
    let v13: [Double] = v8[0]
    let v34: Double = v13[1]
    let v48: [Double] = [v4]
    var v26: [Double] = v48
    v26[0] = v15
    let v35: Double = v11[0]
    var v30: [Double] = v48
    var v72: [Double] = v30
    v72[0] = v35
    var v100: [Double] = v72
    v30[0] = v12
    v100[0] = v34
    v100[0] = v2
    let v64: [[Double]] = [v26, v100]
    let v62: [Double] = v64[1]
    let v142: Double = v62[0]
    return v142
  }
  func f7(_ v0: s0, _ v1: s0) -> s0 {
    let v6: [s0] = [v1, v1, v1]
    let v7: [[Double]] = v1.p0
    let v2: [[Double]] = v1.p1
    let v4: s0 = v6[1]
    let v19: [[Double]] = v4.p1
    var v21: [[Double]] = v19
    let v12: [Double] = v2[2]
    v21[1] = v12
    let v45: s0 = s0(p0: v7, p1: v21)
    v21[0] = v12
    let v41: [Double] = v7[0]
    v21[1] = v41
    return v45
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s2, _ v2: Double) -> Double {
    let v7: s0 = v0.p1
    var v8: Double = v2
    let v5: s0 = f7(v7, v7)
    let v10: Double = f27(v2)
    let v16: [[Double]] = v5.p1
    let v12: [Double] = v16[2]
    v8 = v10
    let v144: Double = f27(v2)
    let v43: Double = f27(v8)
    let v69: Double = f27(v144)
    let v88: Double = v12[0]
    let v74: Double = v43 * v69
    let v145: Double = v88 - v74
    return v145
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], p1: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]))
    let v1: s2 = s2(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
