  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f72(_ v0: s1) -> s1 {
    return v0
  }
  func f71(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v3: [[Double]] = v5.p1
    var v4: [[Double]] = v3
    v5.p1 = v4
    let v2: [[Double]] = v0.p1
    let v1: [Double] = v2[2]
    let v9: [[Double]] = v0.p0
    var v8: s0 = v0
    v4[1] = v1
    var v6: [[Double]] = v9
    let v7: [[Double]] = v8.p1
    v8.p1 = v4
    v8.p1 = v4
    var v16: [[Double]] = v6
    var v13: [[Double]] = v16
    let v25: [[Double]] = v8.p0
    v8.p1 = v2
    let v24: [[Double]] = v0.p1
    let v18: [Double] = v7[2]
    v5.p0 = v25
    v8.p1 = v3
    v8.p0 = v13
    let v14: [[[Double]]] = [v3, v2, v4, v7, v3, v24, v24]
    let v36: [[Double]] = v14[3]
    v5.p0 = v13
    v16[0] = v18
    var v90: s0 = v0
    v90.p1 = v36
    return v90
  }
  func f69(_ v0: s0) -> s0 {
    let v2: s0 = f71(v0)
    let v4: [[Double]] = v0.p1
    let v5: s0 = f71(v0)
    var v1: s0 = v2
    let v9: s0 = f71(v5)
    let v7: [[Double]] = v1.p0
    v1.p1 = v4
    var v19: [[Double]] = v7
    v1.p0 = v19
    let v22: [[Double]] = v9.p0
    let v14: [Double] = v7[0]
    let v10: [Double] = v7[0]
    var v11: [Double] = v14
    var v17: [Double] = v10
    v19[0] = v14
    let v29: s0 = f71(v1)
    var v20: [[Double]] = v4
    let v16: [Double] = v20[1]
    v1.p0 = v22
    let v25: s0 = s0(p0: v19, p1: v20)
    var v21: [[Double]] = v7
    let v18: [[Double]] = v25.p0
    let v36: [Double] = v19[0]
    let v66: [[Double]] = v5.p1
    let v33: [[Double]] = v29.p1
    v20[2] = v14
    v1.p0 = v21
    v19[0] = v17
    let v31: s0 = f71(v29)
    v1.p1 = v33
    v21[0] = v11
    let v24: Double = v10[0]
    let v39: Double = v24 * v24
    var v46: Double = v24
    let v72: Double = v46 / v39
    let v61: Double = v11[0]
    v20[2] = v16
    let v32: Double = v14[0]
    let v50: [Double] = v66[1]
    v17[0] = v61
    v17[0] = v72
    let v91: Double = v36[0]
    var v90: [[Double]] = v20
    v17[0] = v24
    v17 = v10
    v1 = v31
    v21[0] = v50
    let v142: [Double] = [v91, v72, v72, v46, v32]
    let v77: s0 = s0(p0: v18, p1: v90)
    v1.p1 = v20
    v1.p1 = v90
    v19[0] = v14
    let v171: Double = v142[0]
    v17[0] = v171
    return v77
  }
  func f67(_ v0: s1) -> s1 {
    let v1: s1 = f72(v0)
    let v7: [s0] = v1.p0
    let v3: s1 = f72(v0)
    let v5: s0 = v7[0]
    let v6: [s0] = v3.p0
    let v2: s0 = v6[0]
    var v8: s1 = v3
    v8 = v0
    var v12: [s0] = v7
    let v10: s0 = v0.p1
    v12[1] = v5
    let v15: s0 = f71(v2)
    let v13: [s0] = v1.p0
    v8.p1 = v15
    v8.p0 = v12
    v8.p0 = v6
    let v14: s0 = f69(v10)
    v12[1] = v2
    v8.p0 = v13
    v8.p1 = v14
    return v8
  }
  func f30(_ v0: s1) -> s1 {
    let v10: s1 = f72(v0)
    let v2: s1 = f67(v10)
    let v72: [s0] = v2.p0
    var v71: s1 = v0
    v71.p0 = v72
    return v71
  }
  func f22(_ v0: s0, _ v1: [s0], _ v2: s1) -> [s0] {
    let v5: s0 = v1[1]
    let v9: s0 = f71(v5)
    var v18: [s0] = v1
    v18[0] = v9
    let v17: s0 = v2.p1
    v18[0] = v9
    v18[0] = v17
    return v18
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: [s0] = v0.p0
    var v6: s1 = v0
    var v7: s1 = v6
    var v11: [s0] = v4
    v7.p0 = v11
    let v2: s1 = f30(v6)
    let v8: s0 = v2.p1
    let v18: [[Double]] = v8.p0
    let v21: [s0] = f22(v8, v11, v7)
    let v30: s0 = v4[0]
    v11[1] = v30
    let v31: [Double] = v18[0]
    var v52: [Double] = v31
    v6.p0 = v21
    let v84: Double = v52[0]
    return v84
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], p1: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]))
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
