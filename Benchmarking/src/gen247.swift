  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  func f22(_ v0: [[Double]]) -> [[Double]] {
    let v4: [Double] = v0[0]
    var v1: [Double] = v4
    var v8: [Double] = v4
    var v7: [[Double]] = v0
    var v3: [[Double]] = v7
    let v11: [Double] = v3[0]
    var v2: [Double] = v8
    let v12: [[Double]] = [v4, v2, v8]
    let v19: [Double] = v12[0]
    var v14: [[Double]] = v3
    v14[0] = v11
    let v18: Double = v8[0]
    var v21: [[Double]] = v14
    v21[0] = v1
    v2 = v11
    let v44: [Double] = v7[0]
    v2[0] = v18
    let v26: Double = v19[0]
    v21[0] = v44
    v8[0] = v26
    v1[0] = v18
    return v21
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v7: s1 = v0.p0
    var v5: s2 = v0
    let v8: s0 = v5.p1
    v5.p1 = v8
    v5.p1 = v8
    v5.p0 = v7
    v5.p0 = v7
    var v4: s0 = v8
    let v3: s0 = v7.p1
    v5.p1 = v4
    var v2: s0 = v3
    let v6: s0 = v0.p1
    let v12: [[Double]] = v6.p0
    let v16: [Double] = v12[1]
    let v14: s2 = s2(p0: v7, p1: v2)
    var v13: [[Double]] = v12
    var v11: s2 = v0
    v11 = v5
    let v26: [[Double]] = v2.p1
    v13[1] = v16
    v5 = v11
    let v35: [[Double]] = f22(v26)
    let v37: [Double] = v13[1]
    var v9: s2 = v14
    v2 = v8
    let v18: [[Double]] = f22(v35)
    let v50: s1 = v5.p0
    let v33: [[Double]] = f22(v35)
    let v21: [Double] = v26[0]
    v5 = v0
    var v23: s0 = v3
    let v25: s0 = v0.p1
    let v20: [[s0]] = v50.p0
    let v41: [[Double]] = f22(v18)
    v9.p1 = v23
    let v61: [[Double]] = f22(v26)
    let v36: s0 = v9.p1
    v2 = v25
    var v84: s1 = v50
    let v86: s2 = s2(p0: v84, p1: v25)
    var v55: [[Double]] = v13
    v4.p1 = v41
    v4.p0 = v55
    v23.p0 = v13
    let v66: s0 = v14.p1
    v84.p1 = v36
    let v71: s1 = s1(p0: v20, p1: v66)
    let v116: [[Double]] = v23.p0
    let v151: [[Double]] = f22(v33)
    v13[0] = v21
    v84.p0 = v20
    v9.p0 = v71
    v9.p0 = v84
    v5 = v86
    v23.p1 = v151
    let v81: Double = v37[0]
    let v76: s0 = s0(p0: v116, p1: v61)
    v9.p1 = v76
    v5.p1 = v66
    v4.p0 = v116
    return v81
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])]], p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]])), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
