  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f14(_ v0: s1, _ v1: s0) -> s1 {
    var v2: s0 = v1
    let v3: s0 = v0.p0
    let v6: s0 = v0.p0
    var v7: s0 = v3
    var v5: s0 = v6
    let v11: [[Double]] = v5.p2
    v7.p0 = v11
    let v12: [Double] = v11[0]
    let v13: s0 = v0.p0
    let v19: s1 = s1(p0: v7, p1: v6)
    var v16: [[Double]] = v11
    let v17: [[Double]] = v3.p1
    let v48: [[Double]] = v13.p2
    v5 = v2
    var v35: [[Double]] = v48
    var v24: [[Double]] = v17
    let v39: [s1] = [v0]
    v5.p2 = v16
    let v37: [[Double]] = v7.p0
    let v44: s1 = v39[0]
    var v38: s1 = v19
    let v29: [Double] = v24[2]
    v7.p2 = v11
    var v81: [[Double]] = v17
    v81[1] = v29
    let v23: s0 = v38.p0
    v35[0] = v29
    let v137: s0 = v44.p1
    let v70: [[Double]] = v23.p1
    v5.p1 = v70
    v24[0] = v29
    v81[2] = v12
    v5.p0 = v48
    let v73: [Double] = v70[1]
    v2.p2 = v35
    let v64: [[Double]] = v7.p2
    var v75: [[Double]] = v64
    v2.p2 = v37
    var v61: s0 = v23
    v7.p0 = v75
    v7.p1 = v81
    let v136: [[Double]] = v137.p2
    v75[0] = v73
    let v128: s0 = v44.p1
    let v96: [Double] = v24[1]
    v75[0] = v96
    v61.p2 = v136
    let v134: s1 = s1(p0: v128, p1: v61)
    return v134
  }
  func f13(_ v0: s1, _ v1: s0, _ v2: [s1], _ v3: s1) -> s0 {
    let v4: s0 = v0.p0
    let v12: [[Double]] = v1.p1
    var v5: s0 = v1
    v5 = v4
    v5.p1 = v12
    let v9: s0 = v0.p0
    let v18: s1 = f14(v0, v5)
    let v33: s1 = f14(v18, v9)
    v5 = v1
    let v30: [[Double]] = v1.p0
    let v20: s0 = v18.p0
    let v73: s1 = f14(v33, v4)
    let v85: s1 = f14(v73, v20)
    let v140: s1 = f14(v85, v5)
    let v108: s0 = v140.p1
    v5.p0 = v30
    return v108
  }
  func f6(_ v0: s0, _ v1: s0) -> s0 {
    let v8: [[Double]] = v0.p0
    let v6: [[Double]] = v1.p2
    var v18: s0 = v0
    v18.p2 = v6
    v18 = v1
    var v11: s0 = v18
    let v15: [[Double]] = v1.p1
    var v45: [[Double]] = v15
    var v19: [[Double]] = v8
    let v25: s1 = s1(p0: v11, p1: v1)
    let v29: [[Double]] = v1.p0
    v18.p1 = v45
    var v30: s0 = v11
    var v36: s0 = v18
    v36.p0 = v19
    let v41: s1 = f14(v25, v30)
    let v24: [Double] = v15[1]
    v19[0] = v24
    let v33: s1 = f14(v41, v18)
    v11 = v18
    var v86: [[Double]] = v19
    let v47: s1 = f14(v33, v36)
    v18.p2 = v86
    v18.p2 = v29
    var v58: [[Double]] = v15
    v45 = v58
    v11.p2 = v29
    v11.p2 = v6
    let v66: s0 = v47.p1
    v19 = v8
    return v66
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: s1, _ v2: Double) -> Double {
    let v4: [s1] = v0[1]
    let v6: [s1] = v0[0]
    let v14: s0 = v1.p0
    let v12: s1 = v6[0]
    let v24: s1 = f14(v12, v14)
    var v28: s1 = v24
    let v13: s1 = f14(v28, v14)
    let v19: s0 = f6(v14, v14)
    let v23: s1 = f14(v12, v19)
    let v41: s0 = v28.p1
    let v11: s0 = v23.p0
    v28.p1 = v11
    v28.p0 = v14
    let v63: [[Double]] = v41.p2
    let v54: s0 = f13(v13, v11, v4, v13)
    v28.p1 = v14
    v28.p1 = v54
    let v170: [Double] = v63[0]
    let v128: Double = v170[0]
    return v128
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0]]), p1: s0(p0: [[5.0]], p1: [[6.0], [7.0], [8.0]], p2: [[9.0]]))], [s1(p0: s0(p0: [[10.0]], p1: [[11.0], [12.0], [13.0]], p2: [[14.0]]), p1: s0(p0: [[15.0]], p1: [[16.0], [17.0], [18.0]], p2: [[19.0]]))]]
    let v1: s1 = s1(p0: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]], p2: [[24.0]]), p1: s0(p0: [[25.0]], p1: [[26.0], [27.0], [28.0]], p2: [[29.0]]))
    let v2: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
