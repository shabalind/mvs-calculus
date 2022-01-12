  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [[s1]]
  }
  func f80(_ v0: s1) -> s1 {
    let v5: s0 = v0.p1
    let v1: [[Double]] = v5.p0
    var v7: s0 = v5
    var v4: s1 = v0
    var v12: [[Double]] = v1
    let v9: [[Double]] = v7.p0
    var v2: [[Double]] = v9
    let v11: [[Double]] = v7.p0
    v7.p0 = v12
    var v16: s1 = v0
    let v18: [Double] = v11[0]
    v12[0] = v18
    let v20: s0 = v4.p0
    var v29: s1 = v4
    let v19: [Double] = v12[0]
    var v13: s1 = v0
    var v22: s0 = v20
    let v36: s0 = v13.p0
    let v23: s0 = v29.p1
    let v24: s0 = v29.p1
    let v14: [[Double]] = v36.p1
    let v31: [[Double]] = v24.p1
    v12[0] = v19
    var v68: [[Double]] = v31
    let v25: [Double] = v14[1]
    let v30: s0 = s0(p0: v2, p1: v68)
    let v28: Double = v18[0]
    v13.p0 = v22
    let v57: [Double] = v14[0]
    var v37: [Double] = v57
    let v59: [Double] = v1[0]
    v37[0] = v28
    let v38: s0 = v16.p0
    v68[1] = v37
    v29.p0 = v38
    v13.p0 = v36
    let v51: s0 = v4.p1
    v7.p1 = v31
    let v77: s0 = v4.p1
    v4.p0 = v77
    v68[1] = v59
    v4.p0 = v23
    v2[0] = v25
    let v97: s1 = s1(p0: v30, p1: v51)
    return v97
  }
  func f79(_ v0: s2) -> s2 {
    let v1: s0 = v0.p0
    let v9: s0 = v0.p0
    var v12: s0 = v1
    var v10: s2 = v0
    var v17: s2 = v10
    let v15: [[Double]] = v9.p1
    v10.p0 = v12
    v10 = v17
    let v16: [s2] = [v10, v17]
    let v23: s2 = v16[0]
    let v33: s2 = v16[0]
    var v45: s0 = v12
    let v27: s1 = s1(p0: v9, p1: v45)
    let v84: s1 = f80(v27)
    let v115: s1 = f80(v27)
    let v39: s0 = v84.p0
    v12.p1 = v15
    let v46: s0 = v115.p1
    let v165: [[Double]] = v46.p0
    let v107: s0 = v23.p0
    v10.p0 = v39
    v12.p0 = v165
    v17.p0 = v107
    return v33
  }
  func f73(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v4: [[Double]] = v7.p0
    let v6: [s0] = [v7, v0]
    var v5: s0 = v0
    let v2: [[Double]] = v5.p1
    v7 = v0
    let v1: [[Double]] = v7.p0
    var v14: [[Double]] = v2
    let v13: [Double] = v1[0]
    v14 = v2
    v7.p1 = v14
    var v11: s0 = v7
    let v18: [Double] = v1[0]
    v14[0] = v18
    let v8: [[Double]] = v11.p1
    v11.p1 = v8
    let v12: [Double] = v14[0]
    let v9: [[Double]] = v11.p1
    v14[2] = v12
    v5.p1 = v9
    let v19: [[Double]] = v7.p1
    let v15: [[Double]] = v11.p0
    v7.p1 = v19
    let v20: [Double] = v2[2]
    var v17: [[Double]] = v4
    v5.p1 = v2
    var v10: [[Double]] = v17
    v7.p0 = v10
    var v33: [[Double]] = v9
    let v26: [[Double]] = v5.p1
    let v23: [[Double]] = v5.p1
    let v24: s0 = v6[0]
    v10[0] = v13
    v11.p0 = v15
    v17[0] = v20
    v11.p0 = v4
    let v42: [Double] = v33[0]
    let v34: s0 = v6[0]
    v10[0] = v13
    v11.p0 = v10
    v17[0] = v20
    v33 = v19
    v5 = v24
    v11.p1 = v23
    let v54: [Double] = v9[0]
    v5.p1 = v8
    var v102: s0 = v24
    let v116: [[Double]] = v0.p1
    let v57: [[Double]] = v34.p0
    v14[0] = v42
    v7.p1 = v2
    let v47: [[Double]] = v5.p1
    var v44: s0 = v102
    v14[0] = v54
    var v101: [[Double]] = v26
    v7.p1 = v101
    v10[0] = v42
    v44.p1 = v116
    v102.p1 = v9
    v102.p0 = v15
    v7.p1 = v47
    v44.p0 = v57
    return v44
  }
  func f54(_ v0: s2, _ v1: [s1]) -> s2 {
    let v11: s0 = v0.p0
    var v18: s2 = v0
    var v28: s0 = v11
    v18.p0 = v28
    return v18
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v3: s2 = f79(v0)
    let v7: [[s1]] = v0.p1
    let v9: [s1] = v7[0]
    let v12: s0 = v0.p0
    var v14: s0 = v12
    let v11: s2 = f54(v3, v9)
    let v17: s0 = f73(v14)
    v14 = v12
    let v32: [[Double]] = v17.p0
    let v29: [Double] = v32[0]
    let v36: [[Double]] = v14.p1
    let v53: Double = v29[0]
    var v52: s0 = v12
    let v45: [[Double]] = v17.p1
    v14.p1 = v45
    v52.p1 = v36
    let v69: s0 = v11.p0
    v14 = v52
    v52.p1 = v36
    let v61: [[Double]] = v69.p1
    v52.p1 = v61
    v52.p1 = v61
    return v53
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [[s1(p0: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), p1: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]))]])
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
