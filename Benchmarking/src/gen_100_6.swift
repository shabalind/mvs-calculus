  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  func f38(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p0
    var v4: s0 = v0
    let v7: [[Double]] = v4.p0
    v4.p0 = v7
    let v8: [[Double]] = v0.p0
    var v5: s0 = v4
    var v3: [[Double]] = v1
    let v9: [[Double]] = v4.p0
    let v2: s0 = s0(p0: v8)
    let v6: [Double] = v1[0]
    let v15: [[Double]] = v4.p0
    let v11: Double = v6[0]
    let v13: [[Double]] = v5.p0
    let v14: [[Double]] = v0.p0
    var v12: Double = v11
    v5.p0 = v8
    let v37: [Double] = v8[0]
    let v19: Double = v12 + v12
    let v18: [Double] = v15[0]
    var v20: [[Double]] = v1
    v3[0] = v18
    v4.p0 = v3
    let v17: [Double] = v7[0]
    let v26: [[Double]] = v5.p0
    v4.p0 = v9
    v3[0] = v37
    let v22: [[[Double]]] = [v26, v15]
    v3 = v7
    v5.p0 = v20
    let v25: [[Double]] = v4.p0
    let v34: [[Double]] = v4.p0
    var v27: [[[Double]]] = v22
    var v16: Double = v11
    v4.p0 = v34
    v16 = v19
    v3 = v9
    var v42: s0 = v5
    var v43: Double = v16
    v4.p0 = v13
    var v29: s0 = v5
    v29.p0 = v25
    var v49: [Double] = v18
    v5.p0 = v14
    var v87: [[Double]] = v9
    let v70: [[Double]] = v29.p0
    let v82: [[Double]] = v0.p0
    var v56: [Double] = v6
    v42.p0 = v9
    let v85: [Double] = v1[0]
    v56 = v6
    let v44: [[Double]] = v22[0]
    v87[0] = v56
    v4.p0 = v9
    v5.p0 = v20
    v3[0] = v17
    let v58: [[Double]] = v4.p0
    let v64: [[Double]] = v0.p0
    v42.p0 = v70
    v49[0] = v43
    let v57: [[Double]] = v27[1]
    v42.p0 = v58
    var v79: [[[Double]]] = v22
    let v32: [[Double]] = v79[0]
    v42.p0 = v87
    let v147: [[Double]] = v5.p0
    var v67: [[Double]] = v147
    v4.p0 = v57
    let v65: [[Double]] = v42.p0
    v87[0] = v49
    let v48: [[Double]] = v29.p0
    v79[0] = v82
    let v95: [[Double]] = v2.p0
    v42.p0 = v44
    let v68: [Double] = v1[0]
    v87[0] = v68
    v27[0] = v48
    let v110: s0 = s0(p0: v65)
    v3[0] = v56
    v3[0] = v85
    v29.p0 = v64
    v42.p0 = v95
    v42.p0 = v32
    v29.p0 = v58
    v5.p0 = v67
    v87[0] = v17
    return v110
  }
  func f33(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    let v3: [[Double]] = v0.p0
    let v1: s0 = f38(v0)
    var v4: s0 = v1
    v4.p0 = v3
    var v13: s0 = v4
    v4.p0 = v5
    let v9: s0 = f38(v4)
    var v11: s0 = v1
    let v7: [[Double]] = v1.p0
    v4.p0 = v7
    let v14: s0 = f38(v11)
    let v21: s0 = f38(v11)
    v11.p0 = v7
    let v20: [[Double]] = v11.p0
    let v50: [[Double]] = v9.p0
    let v42: s0 = f38(v13)
    var v44: s0 = v42
    v13.p0 = v50
    let v71: s0 = f38(v14)
    let v51: s0 = f38(v0)
    let v39: s0 = f38(v71)
    v13.p0 = v7
    v4.p0 = v5
    v13.p0 = v50
    let v147: [[Double]] = v39.p0
    v4.p0 = v147
    let v98: [s0] = [v51, v42, v44, v71, v21, v1, v44]
    var v145: [s0] = v98
    let v129: s0 = v145[5]
    v4.p0 = v20
    let v148: s0 = f38(v129)
    let v82: s0 = f38(v148)
    return v82
  }
  func f31(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v4: s0 = v1
    let v5: s0 = f33(v0)
    let v6: s0 = f38(v5)
    var v3: s0 = v0
    let v12: s0 = f33(v3)
    let v2: [[Double]] = v5.p0
    let v11: [[Double]] = v4.p0
    var v10: s0 = v12
    let v28: [Double] = v2[0]
    let v13: [[Double]] = v5.p0
    v4.p0 = v13
    let v20: [[Double]] = v10.p0
    v3.p0 = v20
    let v57: s0 = f38(v10)
    v10.p0 = v2
    v10.p0 = v2
    let v30: s0 = f33(v57)
    let v31: [[Double]] = v6.p0
    let v35: s0 = f38(v30)
    let v36: [[Double]] = v10.p0
    v3.p0 = v31
    let v53: s0 = f33(v35)
    let v119: [Double] = v36[0]
    let v50: [Double] = v13[0]
    var v139: [[Double]] = v31
    let v98: s0 = f38(v35)
    let v116: [[Double]] = v98.p0
    let v62: [[Double]] = v53.p0
    let v99: s0 = s0(p0: v139)
    v3.p0 = v62
    v3.p0 = v20
    v4.p0 = v116
    v3.p0 = v11
    v139[0] = v119
    v139[0] = v28
    v139[0] = v50
    return v99
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v6: s0 = f31(v0)
    let v3: [[Double]] = v6.p0
    let v24: [Double] = v3[0]
    let v26: Double = v24[0]
    var v38: Double = v26
    let v71: [Double] = v3[0]
    var v83: [Double] = v71
    v83[0] = v38
    var v57: Double = v38
    v83[0] = v57
    let v176: Double = v83[0]
    let v97: Double = v176 + v38
    return v97
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]])
    let v1: Double = 1.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 1.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
