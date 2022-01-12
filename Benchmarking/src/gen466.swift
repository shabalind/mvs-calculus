  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f13(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v7: s0 = v0
    var v8: s0 = v4
    var v1: s0 = v0
    let v2: [[Double]] = v1.p1
    let v6: [s0] = [v7, v4, v7, v8]
    let v9: [[Double]] = v0.p0
    var v5: [s0] = v6
    v5[0] = v8
    v4.p1 = v2
    v5[1] = v8
    let v29: s0 = v6[1]
    v5[2] = v29
    let v16: s0 = v5[1]
    v7.p0 = v9
    let v23: [[Double]] = v16.p0
    var v37: s0 = v0
    v37 = v1
    let v31: [[Double]] = v37.p1
    v1.p0 = v23
    var v22: [s0] = v5
    let v83: s0 = v22[2]
    v8.p1 = v31
    return v83
  }
  func f7(_ v0: s0) -> s0 {
    var v2: s0 = v0
    let v3: s0 = f13(v2)
    let v4: [[Double]] = v2.p1
    let v5: s0 = f13(v0)
    var v1: s0 = v3
    let v10: s0 = f13(v0)
    var v9: s0 = v10
    let v13: [[Double]] = v3.p0
    let v25: [Double] = v13[0]
    let v20: [[Double]] = v9.p0
    let v15: s0 = f13(v5)
    var v62: [[Double]] = v4
    v2.p0 = v20
    let v30: s0 = f13(v15)
    let v23: s0 = f13(v0)
    let v45: [[Double]] = v3.p1
    var v33: [[Double]] = v62
    v62[0] = v25
    let v35: [[Double]] = v10.p1
    let v59: s0 = f13(v30)
    let v26: [s0] = [v1, v2, v0, v59, v23]
    let v56: s0 = f13(v1)
    let v37: [[Double]] = v56.p1
    v1.p1 = v45
    var v89: [s0] = v26
    v9.p1 = v35
    v2.p1 = v33
    let v354: s0 = v89[2]
    v1.p1 = v37
    return v354
  }
  func f5(_ v0: s0) -> s0 {
    let v3: s0 = f7(v0)
    var v1: s0 = v0
    let v6: s0 = f7(v3)
    let v2: [[Double]] = v0.p1
    let v5: [[Double]] = v6.p1
    let v4: [Double] = v5[1]
    v1 = v3
    var v7: s0 = v6
    var v8: [Double] = v4
    let v10: Double = v8[0]
    let v13: Double = v8[0]
    let v9: s0 = f7(v6)
    let v15: s0 = f7(v3)
    let v20: [[Double]] = v3.p0
    v8[0] = v13
    v8 = v4
    let v12: s0 = s0(p0: v20, p1: v5)
    v7.p1 = v2
    v8[0] = v13
    let v19: [[Double]] = v9.p0
    var v18: [[Double]] = v20
    v18 = v19
    let v32: [[Double]] = v9.p0
    let v27: [[Double]] = v7.p0
    v7.p0 = v20
    let v35: [Double] = v18[0]
    v8[0] = v10
    let v43: s0 = s0(p0: v19, p1: v2)
    v7.p1 = v2
    let v37: [[Double]] = v0.p0
    var v26: [[Double]] = v5
    let v31: [Double] = v27[0]
    let v50: [[Double]] = v9.p1
    let v38: [[Double]] = v43.p1
    let v30: Double = v31[0]
    v1.p0 = v19
    let v34: [[Double]] = v9.p0
    let v22: [Double] = v2[1]
    var v29: [[Double]] = v50
    v7.p0 = v18
    let v41: [[Double]] = v6.p1
    let v25: [Double] = v18[0]
    let v54: [[[Double]]] = [v50, v38, v38, v38, v38]
    v18[0] = v25
    v29[1] = v31
    v18 = v27
    let v42: [[Double]] = v1.p0
    let v73: [[Double]] = v12.p0
    let v84: [Double] = v32[0]
    var v52: [[Double]] = v73
    let v125: [[Double]] = v54[3]
    let v69: [Double] = v125[0]
    let v80: s0 = f13(v15)
    v26[0] = v22
    v52[0] = v8
    let v46: s0 = f7(v12)
    v18[0] = v84
    let v72: [[Double]] = v46.p1
    v7.p1 = v41
    v29[1] = v35
    v1.p0 = v37
    let v66: s0 = s0(p0: v19, p1: v26)
    v1.p1 = v2
    let v74: [[Double]] = v3.p1
    v1.p1 = v72
    v7.p0 = v42
    let v49: [[Double]] = v1.p0
    v8[0] = v30
    v7.p0 = v52
    v26[1] = v31
    let v110: [[Double]] = v1.p0
    v7.p0 = v34
    var v92: [[[Double]]] = v54
    let v98: [Double] = v37[0]
    let v67: s0 = f13(v80)
    let v95: s0 = f13(v67)
    v1.p1 = v29
    var v200: s0 = v3
    v200.p1 = v41
    v52[0] = v69
    let v146: [[Double]] = v12.p1
    v200.p1 = v146
    v52[0] = v22
    let v176: s0 = f13(v95)
    var v172: [[Double]] = v37
    let v170: [[Double]] = v92[1]
    let v151: [Double] = v72[0]
    let v260: [[Double]] = v66.p0
    var v89: s0 = v200
    v7.p1 = v170
    v200.p0 = v19
    v18[0] = v98
    v18[0] = v84
    var v169: [[Double]] = v74
    v1.p1 = v169
    v200.p0 = v172
    v172[0] = v35
    v29[0] = v151
    v89.p0 = v49
    v200.p0 = v260
    let v139: [[Double]] = v176.p1
    v1.p1 = v139
    v89.p0 = v110
    return v89
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: s0, _ v2: [s0], _ v3: Double) -> Double {
    let v5: s0 = f5(v1)
    let v12: [[Double]] = v5.p1
    let v15: [Double] = v12[1]
    let v25: Double = v15[0]
    let v49: Double = v3 * v25
    var v40: Double = v49
    return v40
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])]]
    let v1: s0 = s0(p0: [[3.0]], p1: [[4.0], [5.0]])
    let v2: [s0] = [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])]
    let v3: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
