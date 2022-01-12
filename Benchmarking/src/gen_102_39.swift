  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f74(_ v0: s0) -> s0 {
    var v3: s0 = v0
    v3 = v0
    var v6: s0 = v3
    let v5: [[Double]] = v3.p0
    var v1: s0 = v3
    let v9: [Double] = v5[0]
    var v8: [[Double]] = v5
    let v10: [[Double]] = v3.p1
    v1 = v3
    let v7: [[Double]] = v0.p0
    let v11: [Double] = v7[0]
    var v12: [[Double]] = v8
    let v13: s0 = s0(p0: v12, p1: v10)
    v1.p0 = v10
    var v21: [[Double]] = v10
    let v22: [[Double]] = v6.p1
    let v26: [[Double]] = v1.p1
    v3.p0 = v7
    let v17: [Double] = v22[0]
    let v18: [[Double]] = v13.p0
    let v31: [s0] = [v6, v0, v6, v6, v1, v6]
    var v15: [s0] = v31
    var v27: [s0] = v15
    let v37: [[Double]] = v1.p1
    let v28: [[Double]] = v1.p0
    v3.p0 = v37
    v3.p1 = v28
    v21[0] = v17
    v1.p1 = v21
    let v29: [[Double]] = v0.p1
    v1.p0 = v5
    let v30: [[Double]] = v3.p0
    v3 = v1
    var v24: [[Double]] = v12
    v24[0] = v11
    v1.p1 = v26
    v6 = v0
    v21[0] = v17
    let v34: [Double] = v10[0]
    v6.p0 = v24
    v1.p0 = v12
    v27[4] = v1
    let v64: s0 = v15[3]
    let v23: [[Double]] = v1.p0
    v12[0] = v17
    v15[4] = v64
    v1.p0 = v22
    v6.p0 = v29
    v1.p1 = v29
    v21[0] = v34
    v27[5] = v3
    let v289: s0 = v27[0]
    v3.p1 = v23
    v15 = v27
    v1.p0 = v7
    v6.p0 = v23
    v1 = v289
    v3.p1 = v18
    v21[0] = v9
    v6.p1 = v30
    let v148: [[Double]] = v6.p1
    v6.p0 = v148
    return v289
  }
  func f66(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v6: [[Double]] = v1.p0
    var v4: s0 = v0
    let v2: [[Double]] = v0.p0
    let v5: [[Double]] = v4.p1
    v4.p0 = v5
    var v12: s0 = v0
    v12 = v1
    v4.p0 = v6
    let v30: [[Double]] = v12.p1
    let v28: s0 = f74(v4)
    v12.p1 = v6
    v1.p0 = v30
    let v31: s0 = f74(v28)
    let v35: [[Double]] = v4.p1
    v1.p1 = v2
    let v45: [[Double]] = v12.p0
    let v57: s0 = f74(v31)
    let v72: s0 = s0(p0: v45, p1: v5)
    let v105: s0 = f74(v72)
    v1.p1 = v35
    let v76: [[Double]] = v57.p1
    v1.p0 = v76
    return v105
  }
  func f49(_ v0: s0) -> s0 {
    let v1: s0 = f74(v0)
    var v5: s0 = v1
    return v5
  }
  func f33(_ v0: s0) -> s0 {
    let v3: [s0] = [v0, v0]
    let v6: s0 = f49(v0)
    var v4: s0 = v6
    let v1: [[Double]] = v0.p1
    let v5: [[Double]] = v4.p0
    let v9: s0 = v3[0]
    v4.p0 = v1
    var v24: [s0] = v3
    v4.p0 = v5
    v4.p0 = v1
    let v16: [[Double]] = v6.p0
    let v12: [[Double]] = v6.p1
    var v10: [s0] = v24
    let v26: [[Double]] = v9.p0
    let v21: [[Double]] = v0.p0
    let v17: [[Double]] = v4.p1
    let v13: s0 = f74(v6)
    let v15: [[Double]] = v6.p0
    let v19: [[Double]] = v9.p0
    let v23: s0 = f49(v9)
    let v77: s0 = v10[1]
    v4.p0 = v26
    v4.p0 = v17
    let v62: [Double] = v15[0]
    let v36: [[Double]] = v4.p0
    let v28: [[Double]] = v23.p1
    let v41: [Double] = v12[0]
    let v33: s0 = f49(v9)
    let v45: s0 = v3[1]
    v4.p1 = v12
    v4.p0 = v21
    let v27: s0 = f74(v45)
    let v38: Double = v62[0]
    v4.p1 = v16
    var v59: Double = v38
    v4.p0 = v28
    let v22: s0 = f66(v13)
    v4.p1 = v17
    v4.p1 = v36
    let v100: s0 = f74(v6)
    v4.p0 = v19
    let v79: s0 = s0(p0: v15, p1: v5)
    v4.p0 = v21
    let v44: [[Double]] = v79.p1
    var v48: [[Double]] = v44
    let v60: Double = v59 + v59
    var v58: Double = v60
    let v76: Double = v62[0]
    v4.p1 = v5
    let v70: [Double] = [v58]
    let v71: s0 = f74(v27)
    let v84: Double = v59 / v58
    let v89: [s0] = [v100, v79, v71, v33, v22, v77, v45]
    v4.p1 = v12
    let v136: [[Double]] = v79.p1
    var v83: [[Double]] = v136
    v4.p0 = v28
    v4.p1 = v48
    var v105: [Double] = v70
    var v119: [s0] = v89
    let v169: s0 = v119[2]
    v105[0] = v59
    v4.p1 = v83
    var v90: Double = v76
    v48[0] = v105
    v48[0] = v41
    let v127: Double = v90 + v60
    let v224: Double = v84 * v127
    v58 = v224
    return v169
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    var v8: Double = v1
    let v3: s0 = v0[0]
    let v6: s0 = f49(v3)
    let v4: [[Double]] = v3.p0
    let v7: s0 = f33(v6)
    let v12: [[Double]] = v7.p0
    let v16: s0 = s0(p0: v4, p1: v12)
    let v26: [[Double]] = v16.p0
    var v15: Double = v1
    var v23: Double = v8
    let v31: [Double] = v26[0]
    var v56: Double = v23
    let v57: Double = v31[0]
    let v92: [Double] = [v56, v1, v1, v57, v15, v15]
    let v136: [[Double]] = [v92, v92, v92, v92, v92, v92]
    let v104: [Double] = v136[0]
    var v97: Double = v56
    var v126: [Double] = v104
    var v125: [Double] = v126
    var v242: [Double] = v125
    let v257: Double = v242[2]
    v125[4] = v97
    return v257
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0]])]
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
