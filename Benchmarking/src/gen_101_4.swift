  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f55(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v2: [[Double]] = v1.p1
    v1.p1 = v2
    let v8: [[Double]] = v1.p0
    let v4: [[Double]] = v1.p1
    let v21: [Double] = v4[0]
    let v9: [[Double]] = v0.p0
    v1.p0 = v8
    let v15: [Double] = v8[2]
    var v23: [[Double]] = v9
    v23[0] = v21
    let v24: [[Double]] = v1.p1
    var v32: s0 = v0
    let v20: [[Double]] = v1.p0
    let v25: [[[Double]]] = [v8, v20, v20, v9, v23]
    v32.p0 = v23
    let v18: [[Double]] = v1.p0
    v32.p1 = v2
    let v28: [[Double]] = v1.p0
    v1.p1 = v4
    var v27: s0 = v32
    v23[0] = v15
    let v34: [[Double]] = v1.p1
    let v37: [[Double]] = v25[4]
    v27.p1 = v24
    var v48: [[[Double]]] = v25
    v48[2] = v18
    v23 = v20
    v1.p0 = v28
    v27.p1 = v34
    let v109: [[Double]] = v48[0]
    v1.p0 = v109
    v32.p0 = v37
    v1 = v27
    var v76: s0 = v0
    v48[0] = v23
    v76.p0 = v18
    return v76
  }
  func f37(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v4: [[Double]] = v7.p1
    var v1: [[Double]] = v4
    let v2: [Double] = v1[0]
    let v3: [[Double]] = v7.p0
    let v6: [[Double]] = v7.p0
    let v5: [Double] = v6[1]
    var v18: [[Double]] = v4
    var v20: s0 = v7
    v18[0] = v5
    v7.p1 = v4
    let v22: s0 = s0(p0: v3, p1: v18)
    let v36: [[Double]] = v20.p0
    var v19: s0 = v0
    let v39: [[Double]] = v19.p1
    let v24: [Double] = v39[0]
    var v52: [[Double]] = v36
    v19.p0 = v52
    v18[0] = v2
    v7.p1 = v1
    v1[0] = v24
    return v22
  }
  func f31(_ v0: s0, _ v1: s0) -> s0 {
    let v6: [s0] = [v0, v1, v0, v0, v1]
    var v5: [s0] = v6
    let v2: s0 = v5[2]
    let v10: [[Double]] = v0.p0
    let v29: [[Double]] = v2.p1
    let v23: s0 = s0(p0: v10, p1: v29)
    return v23
  }
  func f21(_ v0: s0) -> s0 {
    let v5: s0 = f55(v0)
    let v6: [[Double]] = v0.p0
    let v3: s0 = f55(v5)
    let v7: [[Double]] = v5.p1
    let v8: s0 = s0(p0: v6, p1: v7)
    let v9: s0 = f37(v3)
    let v25: s0 = f31(v3, v9)
    let v18: s0 = f55(v25)
    let v15: [s0] = [v5, v8, v8, v0, v3, v8, v18]
    let v53: s0 = v15[4]
    let v37: s0 = f37(v53)
    return v37
  }
  func f5(_ v0: s0) -> s0 {
    var v8: s0 = v0
    var v16: s0 = v8
    let v12: s0 = f21(v16)
    let v19: [s0] = [v12]
    let v15: s0 = v19[0]
    return v15
  }
  func f2(_ v0: s0) -> s0 {
    var v3: s0 = v0
    var v7: s0 = v3
    var v1: s0 = v7
    var v4: s0 = v0
    let v6: [s0] = [v7, v4, v1, v7, v3, v7]
    let v5: s0 = v6[2]
    let v9: s0 = v6[5]
    let v13: [[Double]] = v4.p1
    var v10: s0 = v3
    let v15: s0 = f55(v4)
    v10.p1 = v13
    let v8: [Double] = v13[0]
    let v11: [[Double]] = v5.p1
    let v19: s0 = v6[0]
    let v12: [[Double]] = v4.p0
    v4.p0 = v12
    let v24: [Double] = v11[0]
    let v18: s0 = f55(v10)
    var v16: [[Double]] = v12
    var v14: [Double] = v24
    v16[2] = v8
    let v17: s0 = v6[3]
    v10.p1 = v13
    let v22: [[Double]] = v10.p1
    v16[1] = v8
    let v21: Double = v14[0]
    var v40: s0 = v5
    let v25: s0 = f21(v40)
    v16[2] = v14
    let v47: [[Double]] = v18.p1
    let v35: [Double] = v22[0]
    var v45: [[Double]] = v47
    v40.p0 = v16
    let v20: s0 = f55(v19)
    let v29: s0 = f31(v5, v1)
    let v37: [[Double]] = v0.p1
    let v89: [[Double]] = v10.p0
    v45[0] = v35
    v45[0] = v35
    v45[0] = v35
    let v34: s0 = f37(v1)
    let v55: s0 = f5(v19)
    var v79: s0 = v55
    var v57: Double = v21
    v7.p0 = v89
    v10.p1 = v37
    v79 = v34
    let v62: [[Double]] = v17.p0
    v40.p1 = v45
    let v56: [[Double]] = v25.p1
    let v52: [[Double]] = v15.p0
    var v82: [[Double]] = v45
    var v119: [[Double]] = v56
    let v59: s0 = f31(v20, v9)
    let v53: Double = v21 / v57
    v45 = v119
    let v138: s0 = f55(v79)
    let v115: s0 = f31(v138, v59)
    v14[0] = v57
    let v66: [Double] = [v57, v21, v21, v53, v53]
    let v86: [[Double]] = v29.p0
    v79.p1 = v11
    v4.p1 = v22
    v40.p0 = v89
    v40.p0 = v86
    v1.p1 = v22
    let v73: Double = v66[4]
    v119[0] = v8
    v3.p0 = v62
    v7.p0 = v52
    v14[0] = v73
    v7.p1 = v82
    return v115
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: [[Double]] = v0.p1
    let v9: s0 = f5(v0)
    let v5: s0 = f37(v0)
    var v8: s0 = v5
    let v6: [Double] = v3[0]
    let v10: s0 = f55(v9)
    v8.p1 = v3
    var v15: [Double] = v6
    var v22: [Double] = v15
    v8.p1 = v3
    let v29: Double = v22[0]
    let v27: [[Double]] = v8.p0
    let v38: s0 = f2(v10)
    let v52: [Double] = v27[2]
    let v25: [[Double]] = v38.p0
    v8.p0 = v25
    v22[0] = v1
    let v67: Double = v52[0]
    let v73: Double = v29 / v67
    v22[0] = v67
    return v73
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
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
