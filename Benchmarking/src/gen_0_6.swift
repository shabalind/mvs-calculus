  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f32(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v1: [[Double]] = v7.p1
    var v4: [[Double]] = v1
    var v6: s0 = v0
    var v2: s0 = v6
    let v5: [Double] = v1[1]
    var v3: [Double] = v5
    v4[2] = v5
    let v11: [[Double]] = v6.p0
    v7.p1 = v1
    let v9: Double = v5[0]
    let v8: [Double] = [v9, v9, v9, v9, v9]
    var v18: [[Double]] = v11
    let v22: [[Double]] = v2.p1
    v6.p0 = v11
    var v10: [[Double]] = v22
    v18[0] = v3
    v7 = v2
    let v26: s0 = s0(p0: v18, p1: v1)
    let v27: Double = v8[1]
    var v45: s0 = v0
    let v23: [Double] = v4[0]
    let v28: [[Double]] = v2.p1
    v6.p1 = v10
    let v38: [[Double]] = v2.p1
    let v34: [Double] = v28[1]
    let v41: Double = v23[0]
    v2.p0 = v11
    var v33: s0 = v0
    v6.p1 = v38
    v3[0] = v41
    let v42: [Double] = v18[1]
    let v116: [[Double]] = v26.p0
    let v112: [[Double]] = v0.p1
    let v109: Double = v9 + v41
    let v63: [[Double]] = v26.p0
    let v51: [[Double]] = v45.p0
    let v72: [[Double]] = v33.p0
    var v49: s0 = v7
    let v80: [[Double]] = v2.p1
    v33.p0 = v11
    let v70: s0 = s0(p0: v72, p1: v4)
    let v75: [[Double]] = v49.p0
    let v90: [[Double]] = v0.p0
    v33.p0 = v18
    v7.p1 = v80
    v33.p0 = v51
    var v175: [Double] = v42
    v2.p0 = v116
    let v79: [[Double]] = v45.p1
    v45.p0 = v75
    let v117: [[Double]] = v33.p1
    v6.p1 = v79
    v3[0] = v109
    v49.p0 = v18
    v18[0] = v5
    v6.p0 = v90
    let v148: [[Double]] = v45.p0
    v10[1] = v34
    v2.p1 = v117
    v18[0] = v175
    v45.p0 = v148
    v49.p1 = v112
    v175[0] = v27
    v45.p0 = v63
    return v70
  }
  func f2(_ v0: s0) -> s0 {
    let v4: s0 = f32(v0)
    let v2: s0 = f32(v0)
    var v1: s0 = v4
    var v6: s0 = v0
    var v5: s0 = v2
    let v9: s0 = f32(v6)
    var v8: s0 = v9
    var v11: s0 = v4
    let v13: [[Double]] = v11.p1
    v1.p1 = v13
    let v12: [Double] = v13[0]
    v8.p1 = v13
    var v7: [[Double]] = v13
    let v15: [[Double]] = v5.p0
    let v19: [Double] = v7[2]
    let v10: [[Double]] = v2.p1
    var v27: [[Double]] = v15
    let v33: [Double] = v27[1]
    let v26: Double = v12[0]
    let v23: [[Double]] = v1.p1
    var v21: Double = v26
    v8.p1 = v7
    var v43: [Double] = v33
    v8.p1 = v10
    let v31: s0 = f32(v5)
    let v29: [[Double]] = v0.p0
    v7[2] = v43
    let v30: [s0] = [v31, v2, v8, v31, v31, v8, v1]
    let v32: [Double] = v7[2]
    v43[0] = v21
    let v37: [Double] = v29[0]
    var v22: [[Double]] = v23
    let v28: s0 = f32(v2)
    var v36: [[Double]] = v15
    var v16: [[Double]] = v15
    v27[1] = v43
    let v50: s0 = s0(p0: v36, p1: v22)
    v16[1] = v37
    var v58: Double = v21
    v8.p1 = v13
    let v256: [[s0]] = [v30, v30, v30, v30, v30, v30, v30]
    let v46: Double = v19[0]
    v7[1] = v43
    let v68: [s0] = v256[6]
    var v88: [[Double]] = v16
    let v98: [Double] = v13[0]
    let v76: Double = v26 / v58
    let v99: Double = v26 / v46
    v11 = v50
    var v86: [s0] = v68
    v58 = v76
    let v125: [Double] = v7[0]
    var v103: [[Double]] = v88
    v5.p0 = v103
    let v106: Double = v125[0]
    var v80: [Double] = v32
    v80[0] = v106
    v11.p0 = v16
    v43[0] = v58
    var v112: Double = v99
    v88[0] = v80
    v8.p1 = v7
    v80[0] = v112
    let v115: [[Double]] = v28.p1
    v22[0] = v98
    v1.p1 = v115
    let v130: s0 = v86[1]
    v88[1] = v98
    v22[0] = v43
    v80[0] = v46
    return v130
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v4: s0 = f2(v0)
    let v8: [[Double]] = v4.p1
    let v9: [Double] = v8[0]
    let v59: Double = v9[0]
    return v59
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
