  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f88(_ v0: s0) -> s0 {
    let v5: [s0] = [v0, v0, v0, v0, v0, v0, v0]
    let v3: s0 = v5[3]
    var v1: [s0] = v5
    var v7: s0 = v0
    let v4: [[Double]] = v7.p1
    let v6: [[Double]] = v3.p0
    v7.p1 = v6
    var v8: [s0] = v1
    let v9: [Double] = v4[0]
    v7.p1 = v4
    v8[0] = v7
    let v12: s0 = v8[6]
    v8[0] = v3
    v1[0] = v3
    v8[3] = v0
    var v11: [Double] = v9
    let v13: [[Double]] = v0.p0
    v1[4] = v12
    v7.p1 = v4
    let v50: [[Double]] = v12.p1
    v7.p0 = v50
    let v16: [[Double]] = v0.p0
    v1[0] = v7
    var v10: s0 = v7
    let v19: [[Double]] = v3.p0
    let v18: [Double] = v4[0]
    let v31: [[Double]] = v10.p0
    let v23: [[Double]] = [v18, v11, v18, v9]
    v7.p1 = v19
    let v24: [[Double]] = v12.p0
    let v30: [[Double]] = v0.p1
    let v29: [[Double]] = v0.p1
    let v37: [s0] = [v0, v12, v10, v0, v12, v7]
    v8[6] = v3
    var v43: [[Double]] = v13
    v10.p1 = v43
    var v26: [s0] = v5
    let v60: [[Double]] = v0.p1
    let v41: s0 = v26[3]
    v10.p1 = v50
    v7.p1 = v24
    v7 = v10
    let v87: [[Double]] = v0.p0
    v10.p0 = v31
    v10.p0 = v16
    let v47: [[Double]] = v10.p1
    let v40: [Double] = v23[1]
    var v108: [s0] = v37
    v10.p1 = v30
    v10.p0 = v29
    v10.p1 = v47
    v7.p0 = v60
    v43[0] = v40
    v10.p1 = v50
    let v162: s0 = v108[0]
    let v64: [[Double]] = v41.p0
    v10.p1 = v4
    v10.p1 = v64
    v7.p1 = v87
    return v162
  }
  func f83(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v3: s0 = f88(v0)
    let v2: [[Double]] = v0.p1
    let v7: [[Double]] = v3.p1
    var v5: [[Double]] = v7
    var v6: s0 = v0
    v4.p0 = v5
    let v16: s0 = f88(v6)
    let v9: [[Double]] = v4.p1
    var v1: [[Double]] = v5
    v6.p1 = v7
    let v25: [[Double]] = v3.p0
    let v10: s0 = f88(v3)
    let v8: [[Double]] = v4.p0
    v4.p1 = v9
    let v12: [Double] = v7[0]
    v1[0] = v12
    v4.p0 = v1
    let v18: s0 = f88(v4)
    v4.p1 = v25
    var v13: [Double] = v12
    let v20: [[Double]] = v18.p0
    let v11: [[Double]] = v10.p0
    let v15: [Double] = v7[0]
    let v19: s0 = s0(p0: v9, p1: v1)
    let v26: s0 = f88(v19)
    let v36: [Double] = v8[0]
    let v37: [[Double]] = v6.p1
    let v32: [[Double]] = v16.p1
    let v56: s0 = s0(p0: v2, p1: v2)
    let v49: s0 = f88(v56)
    let v46: Double = v15[0]
    v5[0] = v12
    let v68: [Double] = v32[0]
    let v24: s0 = s0(p0: v11, p1: v20)
    let v41: [Double] = [v46]
    let v53: s0 = f88(v49)
    let v54: [[Double]] = v53.p1
    var v64: [Double] = v12
    v1[0] = v41
    v4.p0 = v54
    let v72: [[Double]] = v4.p1
    let v89: [s0] = [v26, v24, v49, v18]
    v6 = v26
    var v106: [s0] = v89
    let v147: s0 = v106[1]
    v1[0] = v13
    v5[0] = v68
    v1[0] = v64
    v4.p1 = v72
    v4.p1 = v72
    v4.p1 = v37
    v1[0] = v36
    return v147
  }
  func f79(_ v0: s0) -> s0 {
    let v5: s0 = f83(v0)
    let v7: [[Double]] = v5.p0
    let v11: s0 = f83(v5)
    let v25: s0 = f88(v11)
    var v13: s0 = v11
    let v38: [[Double]] = v25.p0
    var v31: s0 = v0
    v31.p0 = v7
    let v41: [[Double]] = v13.p1
    v31.p1 = v38
    v31.p1 = v41
    return v31
  }
  func f66(_ v0: Double) -> Double {
    var v1: Double = v0
    var v6: Double = v0
    let v4: [Double] = [v0, v6]
    var v7: Double = v0
    v6 = v1
    let v8: Double = v4[1]
    let v5: Double = v4[0]
    v7 = v8
    let v13: Double = v7 * v0
    var v2: Double = v8
    let v42: Double = v4[1]
    let v15: Double = v4[1]
    let v14: Double = v4[0]
    var v10: [Double] = v4
    v10[1] = v0
    v10[1] = v14
    let v11: Double = v4[0]
    var v9: Double = v13
    var v36: [Double] = v4
    let v16: [[Double]] = [v10]
    var v12: [[Double]] = v16
    let v19: Double = v36[0]
    v36[1] = v13
    v10[1] = v15
    let v32: Double = v19 + v42
    v12[0] = v36
    let v26: Double = v10[1]
    var v21: Double = v32
    var v22: Double = v5
    v36[1] = v9
    let v43: [Double] = [v15, v1, v26, v11, v9, v11]
    var v106: [Double] = v43
    let v35: [Double] = v16[0]
    v36[1] = v22
    var v96: [Double] = v106
    let v48: Double = v43[4]
    var v63: Double = v0
    var v37: [Double] = v43
    v12[0] = v35
    v37[0] = v0
    var v58: [Double] = v43
    v36[1] = v15
    var v90: [Double] = v106
    let v38: [Double] = v12[0]
    v36[1] = v15
    var v77: [Double] = v58
    v10 = v38
    var v131: [Double] = v37
    v37[4] = v63
    var v67: Double = v48
    var v85: [Double] = v96
    v85 = v77
    let v65: Double = v85[3]
    v12[0] = v36
    v36[1] = v21
    let v167: Double = v4[0]
    let v117: Double = v90[1]
    v90[5] = v167
    v77 = v131
    let v123: Double = v36[1]
    let v216: Double = v9 / v117
    let v112: Double = v67 / v216
    v37[5] = v112
    v106[1] = v2
    v10[1] = v123
    v36[0] = v0
    let v95: Double = v65 / v32
    return v95
  }
  func f44(_ v0: Double) -> Double {
    let v3: Double = f66(v0)
    let v4: Double = f66(v3)
    var v8: Double = v4
    let v1: Double = f66(v4)
    let v7: Double = f66(v1)
    let v17: [Double] = [v8, v3, v0]
    let v11: Double = v17[0]
    let v13: Double = f66(v0)
    var v37: [Double] = v17
    var v15: [Double] = v37
    let v20: Double = v15[2]
    v15[2] = v11
    let v25: Double = f66(v20)
    let v23: Double = v15[2]
    let v19: Double = f66(v7)
    var v32: Double = v23
    v37[1] = v0
    var v34: Double = v32
    v37[2] = v34
    v37[0] = v13
    v15[2] = v19
    let v42: [Double] = [v11]
    let v29: Double = v37[1]
    var v35: [Double] = v42
    v37[0] = v25
    let v75: [[Double]] = [v35]
    v35[0] = v29
    let v76: s0 = s0(p0: v75, p1: v75)
    let v84: [[Double]] = v76.p0
    let v95: s0 = f88(v76)
    let v104: [Double] = v84[0]
    let v127: [[Double]] = v95.p0
    var v214: [[Double]] = v127
    v214[0] = v104
    let v306: [Double] = v214[0]
    let v242: Double = v306[0]
    v34 = v3
    return v242
  }
  func f9(_ v0: Double, _ v1: s0) -> Double {
    let v7: [[Double]] = v1.p1
    let v11: [Double] = v7[0]
    let v24: Double = v11[0]
    let v45: Double = f44(v24)
    let v32: Double = f66(v45)
    let v33: Double = f66(v32)
    return v33
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v4: Double = v1
    var v9: Double = v4
    let v5: s0 = f79(v0)
    let v3: [[Double]] = v5.p0
    let v6: [Double] = v3[0]
    let v26: s0 = f79(v0)
    var v27: [Double] = v6
    let v34: Double = v4 / v1
    v27[0] = v9
    let v32: Double = v27[0]
    var v36: s0 = v26
    v27[0] = v34
    let v55: Double = f9(v32, v36)
    return v55
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
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
