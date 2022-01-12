  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  func f66(_ v0: [s1]) -> [s1] {
    var v26: [s1] = v0
    return v26
  }
  func f65(_ v0: [s1]) -> [s1] {
    let v1: [s1] = f66(v0)
    var v3: [s1] = v1
    let v7: s1 = v0[0]
    var v4: [s1] = v1
    let v8: s1 = v4[0]
    var v6: s1 = v7
    var v9: s1 = v8
    var v2: [s1] = v4
    let v11: [[s0]] = v6.p1
    let v10: [s1] = f66(v3)
    v9.p1 = v11
    var v5: [s1] = v3
    let v22: [s0] = v11[0]
    var v15: [[s0]] = v11
    let v13: s1 = v0[0]
    v4[0] = v7
    let v21: [s1] = f66(v0)
    let v14: [[s1]] = [v21, v21, v0, v5, v10, v2, v21]
    let v25: [[s0]] = v8.p1
    let v12: [s0] = v11[1]
    let v42: [[s0]] = v7.p1
    let v16: [s1] = f66(v5)
    let v27: s0 = v13.p0
    let v36: s1 = s1(p0: v27, p1: v15)
    var v30: s0 = v27
    let v17: [s1] = v14[4]
    let v24: [s1] = f66(v16)
    v6.p0 = v30
    let v51: [s1] = f66(v5)
    v5[0] = v13
    let v47: [s1] = f66(v5)
    v15[0] = v12
    let v57: [s1] = f66(v47)
    v2[0] = v6
    var v28: s1 = v36
    v9.p1 = v25
    let v19: s0 = v8.p0
    v28.p1 = v42
    let v38: [s1] = f66(v5)
    let v34: [s1] = f66(v5)
    let v35: s0 = v12[0]
    v28.p0 = v27
    let v32: s0 = v22[0]
    var v33: s1 = v28
    let v72: [[Double]] = v19.p1
    v6.p1 = v11
    let v43: s0 = v13.p0
    let v64: [[Double]] = v27.p1
    var v63: [[s0]] = v42
    v6.p0 = v19
    v5[0] = v13
    v28.p0 = v35
    v30.p1 = v72
    let v23: [s1] = f66(v24)
    v6.p0 = v35
    let v95: s1 = v17[0]
    let v61: s1 = v34[0]
    let v53: [[[Double]]] = [v64, v72, v72, v64]
    let v84: [[Double]] = v53[0]
    let v103: [[s1]] = [v57, v34, v23, v51, v34]
    let v71: [[s0]] = v36.p1
    v5[0] = v33
    v2[0] = v13
    v4[0] = v95
    v33.p0 = v32
    var v169: [[s1]] = v103
    v6.p0 = v43
    let v48: [s0] = v71[0]
    v33.p1 = v63
    var v89: s0 = v43
    v6.p0 = v89
    v33.p1 = v11
    var v98: [[s1]] = v169
    var v70: [[s1]] = v169
    v5[0] = v9
    v15[0] = v48
    v169 = v70
    let v129: [s1] = f66(v17)
    let v214: [s1] = v98[2]
    v6.p1 = v63
    v28.p1 = v15
    v169[3] = v38
    let v160: [s1] = f66(v214)
    v30.p1 = v84
    v4[0] = v61
    v98[2] = v129
    v33 = v6
    return v160
  }
  func f32(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    let v1: [[Double]] = v0.p0
    let v9: [[Double]] = v0.p1
    let v13: [[[Double]]] = [v4, v9, v9, v4, v4, v9, v4]
    var v16: [[[Double]]] = v13
    let v19: [[Double]] = v16[6]
    let v35: s0 = s0(p0: v1, p1: v19)
    return v35
  }
  func f20(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p0
    let v1: [[Double]] = v0.p0
    var v3: s0 = v0
    let v11: [[Double]] = v3.p0
    var v8: s0 = v3
    let v18: s0 = f32(v8)
    v3 = v8
    let v14: [[Double]] = v0.p0
    let v13: s0 = f32(v8)
    var v12: [[Double]] = v4
    v3.p0 = v4
    let v19: [[Double]] = v18.p0
    let v25: s0 = f32(v18)
    var v15: s0 = v18
    let v22: s0 = f32(v25)
    let v37: [[Double]] = v13.p0
    let v24: s0 = f32(v15)
    v3.p0 = v19
    var v33: s0 = v24
    v8.p0 = v1
    let v27: [[Double]] = v22.p1
    let v42: s0 = f32(v24)
    v8.p1 = v27
    let v45: [[Double]] = v24.p1
    v33.p0 = v37
    v33.p0 = v12
    let v63: [[Double]] = v24.p1
    let v44: [[Double]] = v42.p1
    v3.p0 = v37
    v3.p0 = v37
    let v77: [Double] = v44[1]
    v15.p0 = v1
    v12[2] = v77
    let v54: [[Double]] = v3.p1
    v8.p0 = v14
    let v84: [Double] = v54[1]
    let v107: s0 = f32(v33)
    let v123: s0 = f32(v107)
    v15.p1 = v45
    v12[1] = v84
    v3.p1 = v63
    v15.p0 = v11
    v33 = v15
    return v123
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v7: [s1] = v0.p0
    let v11: [s1] = f65(v7)
    let v30: s1 = v11[0]
    let v19: s0 = v30.p0
    let v10: s0 = v30.p0
    let v9: s0 = v30.p0
    let v15: [[Double]] = v10.p1
    let v13: s0 = f32(v19)
    let v26: [[Double]] = v9.p1
    let v24: [Double] = v26[0]
    let v85: s0 = f32(v13)
    var v70: s0 = v85
    let v60: s0 = f20(v9)
    var v114: s0 = v70
    v70 = v60
    let v98: [[Double]] = v114.p1
    let v135: [Double] = v98[0]
    let v117: [[Double]] = v114.p0
    var v106: [[Double]] = v117
    v106[0] = v24
    let v163: [Double] = v106[2]
    v70.p1 = v15
    let v190: Double = v163[0]
    v106[0] = v135
    return v190
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])]])], p1: s1(p0: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), p1: [[s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])]]))
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
