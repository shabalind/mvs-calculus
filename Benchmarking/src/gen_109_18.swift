  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f11(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p1
    let v4: [[[Double]]] = [v5, v5]
    let v10: [[Double]] = v0.p1
    var v17: s0 = v0
    v17.p0 = v10
    var v24: s0 = v17
    let v31: [[Double]] = v17.p0
    let v13: [[Double]] = v0.p1
    let v26: [[Double]] = v24.p1
    v17.p1 = v31
    var v37: [[[Double]]] = v4
    let v28: [[Double]] = v37[1]
    v17.p0 = v28
    v17.p1 = v13
    let v57: [[Double]] = v17.p1
    let v61: s0 = s0(p0: v57, p1: v26)
    return v61
  }
  func f9(_ v0: s0, _ v1: s0) -> s0 {
    let v4: [[Double]] = v1.p1
    let v7: [Double] = v4[0]
    let v8: [[Double]] = v0.p1
    var v6: s0 = v1
    v6.p0 = v4
    let v17: s0 = f11(v0)
    var v15: s0 = v1
    let v20: [Double] = v8[0]
    var v14: s0 = v17
    let v19: s0 = f11(v14)
    let v16: [[Double]] = v14.p0
    var v24: [[Double]] = v8
    var v29: s0 = v0
    let v38: [[Double]] = v19.p0
    let v31: s0 = s0(p0: v38, p1: v16)
    let v28: [[Double]] = v15.p1
    let v25: s0 = s0(p0: v8, p1: v24)
    v15.p0 = v28
    let v50: s0 = f11(v14)
    v24[0] = v20
    v24[0] = v7
    let v57: [[Double]] = v31.p1
    let v65: s0 = f11(v31)
    let v94: s0 = f11(v1)
    let v51: s0 = f11(v15)
    let v86: [[Double]] = v50.p1
    let v67: s0 = f11(v94)
    let v81: s0 = f11(v29)
    let v83: [[Double]] = v67.p1
    let v90: [[Double]] = v25.p1
    let v115: s0 = s0(p0: v83, p1: v90)
    let v79: s0 = f11(v6)
    v14.p1 = v57
    let v133: [[Double]] = v51.p0
    let v134: [s0] = [v115, v65, v115, v81]
    let v147: [[Double]] = v79.p1
    let v173: s0 = v134[1]
    v14.p0 = v86
    v29.p1 = v133
    let v178: s0 = f11(v173)
    v24 = v147
    return v178
  }
  func f8(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v5: [[Double]] = v6.p1
    let v1: [Double] = v5[0]
    var v3: [Double] = v1
    let v2: s0 = f11(v0)
    let v4: [Double] = v5[0]
    var v8: s0 = v2
    let v18: s0 = f9(v6, v0)
    var v7: [[Double]] = v5
    v6.p0 = v5
    let v10: Double = v3[0]
    let v13: [[Double]] = v8.p0
    v8.p1 = v13
    let v9: [[Double]] = v0.p1
    var v11: [[Double]] = v7
    let v19: s0 = f9(v18, v8)
    let v12: [[Double]] = v19.p1
    let v17: [[Double]] = v18.p1
    var v22: [[Double]] = v12
    var v28: [[Double]] = v7
    v28[0] = v4
    let v16: Double = v3[0]
    v3[0] = v16
    let v35: [Double] = v17[0]
    v7[0] = v3
    v3[0] = v10
    v28[0] = v35
    v22[0] = v4
    v8.p1 = v9
    let v49: [Double] = v22[0]
    let v60: s0 = s0(p0: v7, p1: v28)
    v7[0] = v49
    v8.p0 = v11
    v6.p0 = v13
    v6.p1 = v7
    return v60
  }
  func f7(_ v0: s0, _ v1: s0) -> s0 {
    let v6: s0 = f9(v1, v1)
    let v3: [[Double]] = v0.p0
    let v7: s0 = f9(v0, v6)
    let v2: [[Double]] = v1.p1
    let v11: s0 = f8(v1)
    let v13: s0 = f11(v0)
    let v12: s0 = s0(p0: v2, p1: v2)
    let v19: s0 = f9(v12, v13)
    let v21: s0 = f8(v7)
    let v38: [[Double]] = v19.p1
    let v30: s0 = f9(v7, v11)
    let v37: [[Double]] = v7.p1
    let v80: s0 = f9(v21, v6)
    var v39: s0 = v30
    v39.p0 = v3
    let v36: [[Double]] = v80.p0
    v39.p0 = v38
    v39.p0 = v37
    v39.p1 = v36
    return v39
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v5: [[Double]] = v0.p1
    let v6: [[Double]] = v0.p0
    let v4: [[Double]] = v0.p0
    var v2: s0 = v0
    let v8: s0 = f9(v0, v0)
    let v12: s0 = f8(v0)
    v2.p0 = v6
    v2.p0 = v5
    let v10: s0 = f9(v2, v2)
    v2.p0 = v6
    v2 = v12
    let v3: [[Double]] = v10.p0
    let v18: [Double] = v3[0]
    let v14: s0 = f11(v8)
    var v20: s0 = v14
    v20.p0 = v3
    var v39: s0 = v14
    let v44: [[Double]] = v20.p1
    let v51: [Double] = v44[0]
    let v26: [[Double]] = v0.p0
    let v61: [[Double]] = v0.p1
    let v34: s0 = f9(v12, v20)
    var v35: [[Double]] = v4
    var v23: [[Double]] = v26
    let v97: [[Double]] = v2.p0
    var v43: s0 = v34
    let v53: [[[Double]]] = [v97, v97, v44, v61, v3]
    var v37: s0 = v12
    let v65: [[Double]] = v20.p1
    v2.p1 = v65
    let v73: s0 = f9(v39, v37)
    let v47: s0 = f7(v12, v43)
    let v68: [[Double]] = v73.p0
    let v78: [[Double]] = v47.p1
    var v104: [[Double]] = v5
    v39.p0 = v78
    v2.p1 = v61
    v20.p1 = v35
    v37.p0 = v104
    let v127: [[Double]] = v53[1]
    v104[0] = v18
    v2.p1 = v127
    v23[0] = v51
    v39.p1 = v23
    let v108: Double = v51[0]
    v2.p0 = v68
    return v108
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
