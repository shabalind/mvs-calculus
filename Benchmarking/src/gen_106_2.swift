  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f96(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v1: [[Double]] = v0.p1
    let v3: [Double] = v1[1]
    let v4: [[Double]] = v6.p0
    v6 = v0
    let v16: [[Double]] = v6.p0
    let v9: [[Double]] = v6.p1
    let v8: s0 = s0(p0: v1, p1: v9)
    let v13: [[Double]] = v6.p0
    v6.p0 = v9
    let v21: [[Double]] = v8.p1
    v6.p0 = v21
    var v30: [[Double]] = v13
    v30 = v9
    v6.p1 = v30
    let v19: s0 = s0(p0: v16, p1: v16)
    v6.p0 = v4
    var v64: s0 = v19
    v64.p0 = v4
    v30[1] = v3
    let v105: [[Double]] = v0.p0
    v6.p1 = v105
    return v64
  }
  func f91(_ v0: s0, _ v1: s0) -> s0 {
    var v5: s0 = v0
    var v2: s0 = v5
    var v10: s0 = v2
    return v10
  }
  func f90(_ v0: s0, _ v1: s0) -> s0 {
    let v5: [[Double]] = v1.p1
    let v4: [[Double]] = v0.p0
    let v10: [s0] = [v1, v0, v1, v0, v1]
    let v3: [Double] = v5[0]
    let v7: [[Double]] = v1.p0
    let v2: s0 = f96(v1)
    let v18: s0 = f96(v1)
    let v8: s0 = f96(v18)
    let v27: s0 = f91(v8, v2)
    let v20: [[Double]] = v18.p0
    let v16: [Double] = v5[0]
    let v26: [[Double]] = v1.p1
    let v28: s0 = f96(v8)
    var v29: [[Double]] = v5
    let v32: s0 = v10[4]
    let v55: [[Double]] = v28.p1
    let v24: s0 = f91(v32, v1)
    let v42: [[Double]] = v24.p0
    let v63: s0 = f96(v27)
    var v52: s0 = v8
    var v47: [[Double]] = v29
    let v35: s0 = s0(p0: v55, p1: v29)
    v52.p1 = v20
    v52.p1 = v42
    v52.p0 = v26
    v52.p0 = v5
    v52.p0 = v42
    v52.p0 = v47
    v52 = v35
    v47 = v7
    v52.p1 = v42
    let v135: s0 = f91(v18, v52)
    v52.p0 = v42
    v29[1] = v16
    v52.p0 = v4
    v47[1] = v3
    let v366: s0 = f91(v135, v63)
    return v366
  }
  func f65(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    let v1: s0 = s0(p0: v5, p1: v5)
    let v2: s0 = f91(v1, v0)
    var v8: [[Double]] = v5
    var v3: s0 = v2
    let v11: [[Double]] = v3.p0
    let v6: s0 = f96(v3)
    let v9: s0 = f91(v1, v2)
    let v14: [[Double]] = v9.p1
    v3.p1 = v5
    v3.p1 = v11
    let v16: [[Double]] = v6.p0
    v3.p1 = v16
    let v25: [[Double]] = v9.p1
    let v27: s0 = f90(v9, v3)
    v3.p1 = v25
    let v26: [s0] = [v9]
    let v44: s0 = s0(p0: v11, p1: v8)
    let v49: s0 = v26[0]
    let v61: s0 = f91(v49, v1)
    let v29: [[Double]] = v9.p1
    let v35: s0 = f91(v44, v44)
    let v46: s0 = s0(p0: v14, p1: v25)
    v3.p1 = v29
    let v95: [s0] = [v46, v35, v61, v46, v35, v27]
    let v74: s0 = v95[4]
    return v74
  }
  func f43(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v6: s0 = f90(v1, v0)
    let v2: [[Double]] = v1.p0
    var v7: s0 = v1
    let v4: [[Double]] = v1.p0
    var v8: s0 = v1
    v7.p0 = v2
    let v9: [[Double]] = v1.p1
    v1.p0 = v4
    let v24: [[Double]] = v0.p1
    let v21: s0 = f96(v0)
    let v17: [[Double]] = v6.p1
    let v23: s0 = f91(v8, v8)
    let v32: s0 = f91(v21, v23)
    let v27: [[Double]] = v32.p1
    v7.p1 = v4
    var v30: s0 = v7
    let v37: [[Double]] = v6.p1
    let v43: [[Double]] = v6.p0
    var v16: s0 = v30
    v30.p1 = v43
    v1.p0 = v2
    v8.p1 = v37
    v7.p0 = v24
    v30.p0 = v24
    v30.p0 = v27
    v8.p1 = v9
    let v68: [[Double]] = v23.p1
    v16.p0 = v9
    var v132: s0 = v16
    v132.p1 = v37
    let v89: [[Double]] = v21.p0
    let v104: [[Double]] = v23.p0
    v30.p1 = v43
    v30.p0 = v17
    v8.p1 = v89
    v1.p0 = v68
    v132.p0 = v104
    v16.p1 = v4
    return v132
  }
  func f38(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p1
    var v3: [[Double]] = v7
    let v2: [Double] = v7[0]
    let v10: [[Double]] = v0.p1
    let v4: s0 = f43(v0)
    v3[1] = v2
    let v9: [[Double]] = v0.p1
    let v11: [[Double]] = v0.p1
    let v5: s0 = f96(v4)
    let v6: s0 = f96(v5)
    let v15: [Double] = v10[1]
    v3[0] = v15
    let v19: [[Double]] = v5.p0
    let v16: s0 = s0(p0: v19, p1: v3)
    let v14: s0 = f96(v16)
    var v21: [[Double]] = v3
    let v12: s0 = f91(v14, v16)
    v3 = v19
    let v43: s0 = s0(p0: v21, p1: v7)
    let v29: [[Double]] = v43.p0
    let v20: s0 = s0(p0: v3, p1: v29)
    v21[1] = v2
    let v84: s0 = f96(v6)
    let v27: [[Double]] = [v2]
    v21[1] = v2
    var v48: [[Double]] = v7
    let v33: [[[Double]]] = [v7, v9, v19, v48, v9, v48, v11]
    v48[0] = v2
    let v54: [[Double]] = v20.p0
    let v53: [[Double]] = v12.p0
    let v28: s0 = f65(v84)
    var v37: [[Double]] = v27
    let v76: [[Double]] = v33[3]
    let v97: [[Double]] = v33[2]
    let v39: [Double] = v37[0]
    v37[0] = v39
    var v74: [[Double]] = v11
    var v102: s0 = v28
    v48[0] = v39
    v102.p1 = v76
    let v125: [[Double]] = v28.p0
    v102.p1 = v125
    v48 = v74
    v102.p0 = v54
    v102.p1 = v53
    v102.p1 = v11
    v102.p1 = v11
    v102.p1 = v97
    v102.p1 = v21
    return v102
  }
  func f29(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v3: s0 = f38(v0)
    let v5: [[Double]] = v0.p1
    let v2: [[Double]] = v3.p1
    v6.p0 = v2
    v6.p1 = v2
    let v4: s0 = f96(v3)
    v6.p0 = v2
    v6.p1 = v5
    let v13: s0 = f65(v3)
    let v34: [[Double]] = v0.p0
    let v20: [[Double]] = v3.p0
    v6.p1 = v5
    let v21: s0 = f65(v6)
    v6.p1 = v20
    let v30: [[Double]] = v21.p0
    let v50: [[Double]] = v4.p0
    let v24: [[Double]] = v13.p0
    v6.p0 = v50
    let v33: [[Double]] = v13.p1
    var v26: s0 = v3
    v6.p1 = v24
    v26.p0 = v33
    let v48: [[Double]] = v0.p0
    v26.p1 = v30
    let v72: [[Double]] = v13.p0
    let v101: [[Double]] = v3.p0
    var v44: [[Double]] = v72
    v26.p1 = v48
    let v87: s0 = f96(v26)
    v26.p0 = v101
    v26.p0 = v33
    v26.p0 = v44
    v6.p1 = v34
    return v87
  }
  func f11(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v1: [[Double]] = v5.p0
    let v7: s0 = f90(v0, v5)
    let v4: s0 = f91(v0, v0)
    v5.p0 = v1
    let v2: [[Double]] = v5.p0
    let v15: [[Double]] = v4.p1
    v5.p0 = v2
    v5.p0 = v15
    v5.p1 = v15
    return v7
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v2: s0 = v0
    let v3: [[Double]] = v2.p1
    var v6: s0 = v2
    let v10: [[Double]] = v0.p1
    let v8: s0 = f11(v0)
    let v14: s0 = f91(v2, v6)
    let v4: [[Double]] = v8.p1
    v2.p0 = v4
    let v13: s0 = f43(v0)
    let v21: [[Double]] = v14.p0
    let v20: [[Double]] = v0.p0
    v6.p0 = v3
    v6.p0 = v3
    var v26: s0 = v6
    v2.p0 = v21
    let v39: s0 = s0(p0: v21, p1: v21)
    let v49: s0 = f29(v13)
    var v36: [[Double]] = v10
    v6.p1 = v4
    let v72: s0 = f91(v26, v49)
    v2.p0 = v36
    v6.p1 = v20
    var v64: s0 = v8
    let v224: s0 = f96(v72)
    let v136: [[Double]] = v224.p1
    let v99: [s0] = [v64, v64, v39, v13, v49]
    let v102: s0 = v99[1]
    let v94: [[Double]] = v102.p1
    let v91: [Double] = v94[0]
    v6.p1 = v136
    let v178: Double = v91[0]
    v2.p0 = v10
    v64.p0 = v4
    return v178
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])
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
