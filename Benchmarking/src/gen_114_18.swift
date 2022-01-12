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
    var p0: [[s1]]
    var p1: s1
  }
  func f35(_ v0: s0) -> s0 {
    var v8: s0 = v0
    var v6: s0 = v8
    return v6
  }
  func f30(_ v0: Double, _ v1: s0, _ v2: [s1]) -> Double {
    let v4: s0 = f35(v1)
    let v9: [[Double]] = v4.p1
    let v57: [Double] = v9[1]
    var v62: [Double] = v57
    let v136: Double = v62[0]
    return v136
  }
  func f26(_ v0: s0, _ v1: s0, _ v2: s1, _ v3: s2) -> s0 {
    let v8: s0 = f35(v1)
    var v10: s1 = v2
    let v7: s0 = f35(v0)
    let v5: s0 = f35(v1)
    let v13: [[s0]] = v10.p1
    v10.p1 = v13
    let v12: s0 = f35(v7)
    let v9: s0 = f35(v5)
    let v15: [s0] = v13[0]
    var v11: [s0] = v15
    let v14: s0 = f35(v1)
    var v17: s1 = v2
    var v22: s0 = v1
    let v20: [[Double]] = v5.p0
    let v49: [s0] = v13[0]
    v22.p0 = v20
    let v21: s0 = f35(v14)
    var v26: s1 = v17
    var v42: [s0] = v15
    v10.p0 = v8
    let v36: [s0] = v13[0]
    let v29: [[Double]] = v12.p1
    let v30: [[Double]] = v0.p0
    v11[0] = v21
    v42[0] = v9
    let v33: s0 = f35(v7)
    v42[0] = v1
    var v44: [[s0]] = v13
    var v48: [s0] = v36
    v10.p1 = v13
    let v37: s0 = v26.p0
    v17.p1 = v13
    let v28: [[s0]] = v10.p1
    let v60: s0 = v2.p0
    let v53: [[s0]] = v17.p1
    v44[0] = v11
    let v47: s0 = f35(v12)
    v42[0] = v22
    var v55: [[Double]] = v29
    v42[0] = v60
    var v45: s0 = v37
    v44 = v53
    let v97: s0 = v17.p0
    v26.p1 = v28
    let v65: [[Double]] = v12.p0
    v44[0] = v42
    v45.p0 = v30
    let v143: s0 = s0(p0: v65, p1: v55)
    v48[0] = v12
    v11[0] = v14
    let v56: s0 = f35(v21)
    v42[0] = v7
    let v118: [[Double]] = v7.p1
    v44[0] = v49
    var v133: [[Double]] = v118
    let v76: [s0] = [v143, v97, v37, v8, v45, v56]
    v11[0] = v33
    let v68: s0 = v76[2]
    v22.p1 = v55
    v44[0] = v48
    v17.p0 = v47
    v10.p1 = v44
    v45.p1 = v133
    let v153: [[Double]] = v0.p1
    v45.p1 = v153
    return v68
  }
  func f17(_ v0: s2) -> s2 {
    let v9: s1 = v0.p1
    let v4: s0 = v9.p0
    let v7: s0 = f26(v4, v4, v9, v0)
    let v5: [[s0]] = v9.p1
    let v13: [s0] = v5[0]
    let v8: [s0] = v5[0]
    let v10: s0 = v9.p0
    var v24: [s0] = v8
    var v26: [[s0]] = v5
    var v25: [[s0]] = v26
    let v52: [[s1]] = v0.p0
    v24[0] = v7
    v24[0] = v10
    v26 = v25
    var v40: s1 = v9
    v25[0] = v13
    v40.p1 = v26
    v25[0] = v24
    var v69: s2 = v0
    v69.p0 = v52
    v69.p1 = v40
    return v69
  }
  func f11(_ v0: s2) -> s2 {
    let v3: s2 = f17(v0)
    let v2: s2 = f17(v3)
    return v2
  }
  func f6(_ v0: s0) -> s0 {
    let v7: s0 = f35(v0)
    var v1: s0 = v7
    var v2: s0 = v1
    let v5: [[Double]] = v7.p1
    let v6: s0 = f35(v1)
    let v4: s0 = f35(v2)
    var v9: [[Double]] = v5
    let v11: [Double] = v9[0]
    let v13: [[Double]] = v6.p0
    v2.p0 = v13
    let v10: [[Double]] = v2.p1
    v1.p1 = v9
    let v12: [[[Double]]] = [v9, v9, v5, v5, v5, v10, v10]
    v2.p1 = v5
    let v34: [[Double]] = v0.p0
    let v32: [[Double]] = v12[0]
    let v20: [Double] = v34[1]
    let v27: [[Double]] = v2.p0
    v1.p0 = v27
    v2.p1 = v32
    v9[1] = v11
    v9[0] = v20
    v9[1] = v11
    let v41: s0 = f35(v4)
    v2.p1 = v32
    let v59: [[Double]] = v12[0]
    v2.p0 = v34
    let v64: [Double] = v9[0]
    v9[1] = v64
    v2.p1 = v5
    v1 = v2
    v1.p1 = v59
    let v142: s0 = f35(v41)
    return v142
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v5: s2 = v0
    var v2: s2 = v0
    let v4: s2 = f11(v5)
    let v8: s1 = v5.p1
    let v6: s2 = f17(v0)
    let v13: s0 = v8.p0
    var v9: s2 = v2
    let v11: [[s0]] = v8.p1
    let v3: s1 = v6.p1
    v2 = v5
    let v12: [s0] = v11[0]
    v2.p1 = v3
    let v16: Double = v1 + v1
    v2.p1 = v3
    let v18: s0 = v12[0]
    let v26: [[s1]] = v9.p0
    let v17: s2 = f11(v9)
    let v20: [s1] = v26[0]
    var v25: s0 = v13
    let v19: Double = v1 - v16
    let v28: s0 = f26(v13, v25, v3, v17)
    let v32: s0 = v8.p0
    let v27: Double = v1 / v19
    let v46: s0 = f6(v13)
    let v33: s0 = v12[0]
    let v31: [[Double]] = v32.p0
    let v64: s0 = f26(v33, v18, v8, v5)
    v25.p0 = v31
    let v42: [[s1]] = v4.p0
    let v84: [s1] = v42[0]
    v2.p0 = v26
    let v61: s1 = v84[0]
    var v69: [[s1]] = v42
    let v113: Double = f30(v1, v28, v20)
    let v83: Double = v113 * v27
    let v63: [s1] = v69[0]
    v9.p1 = v61
    v69[0] = v63
    let v94: s0 = f26(v64, v46, v8, v6)
    let v75: Double = f30(v83, v94, v63)
    return v75
  }
  func benchmark() {
    let v0: s2 = s2(p0: [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]])]], p1: s1(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), p1: [[s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])]]))
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
