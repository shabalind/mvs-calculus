  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s4 {
    var p0: s0
    var p1: [s0]
  }
  struct s5 {
    var p0: s4
    var p1: s0
  }
  func f106(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v4: s0 = v1
    let v3: [[Double]] = v0.p1
    let v2: [Double] = v3[0]
    let v9: [[Double]] = v4.p0
    v1.p1 = v3
    v4.p0 = v9
    let v24: [[Double]] = v0.p0
    v4.p1 = v3
    let v8: [Double] = v24[0]
    let v11: [[Double]] = v1.p0
    var v20: [[Double]] = v11
    let v29: [[Double]] = v4.p0
    let v19: [[Double]] = v4.p1
    let v58: [[Double]] = v0.p1
    v1.p0 = v9
    v4.p1 = v58
    let v37: [[Double]] = v1.p0
    var v35: [[Double]] = v24
    let v65: [Double] = v9[0]
    v35[0] = v65
    v35[0] = v2
    v4.p0 = v24
    v4.p0 = v29
    let v49: [Double] = v20[0]
    let v39: [[Double]] = v0.p1
    v4.p0 = v37
    v4.p1 = v39
    v35[0] = v49
    v35[0] = v8
    let v86: s0 = s0(p0: v35, p1: v19)
    return v86
  }
  func f99(_ v0: s2) -> s2 {
    var v4: s2 = v0
    var v5: s2 = v4
    let v3: [s0] = v4.p1
    let v1: [s0] = v0.p1
    var v7: [s0] = v1
    let v2: s0 = v0.p0
    v7[0] = v2
    v5.p0 = v2
    let v8: [s0] = v0.p1
    let v9: s0 = f106(v2)
    var v6: s0 = v2
    var v11: s0 = v6
    var v13: s0 = v2
    v5.p1 = v7
    let v30: s0 = v3[0]
    let v15: [s0] = v4.p1
    var v16: s2 = v4
    v7[0] = v13
    let v19: [[Double]] = v6.p1
    let v25: s0 = f106(v13)
    let v47: [s0] = v16.p1
    v13.p1 = v19
    let v12: s0 = v47[0]
    v7[0] = v30
    v6 = v11
    v7[0] = v2
    let v20: [Double] = v19[1]
    var v34: [[Double]] = v19
    let v18: s0 = v15[0]
    var v23: [s0] = v15
    var v22: [[Double]] = v19
    let v27: [Double] = v34[0]
    v11.p1 = v22
    v13.p1 = v19
    let v28: s0 = f106(v30)
    v23[0] = v30
    let v45: [s0] = v4.p1
    let v29: [[Double]] = v12.p0
    let v32: [s0] = v0.p1
    let v36: [[Double]] = v25.p0
    var v42: [s0] = v47
    var v26: s0 = v11
    var v53: [[Double]] = v36
    v16.p1 = v8
    let v58: s0 = f106(v9)
    let v38: s0 = f106(v18)
    let v49: [[Double]] = v58.p1
    let v68: s0 = v45[0]
    v5.p1 = v23
    let v54: s2 = s2(p0: v13, p1: v45)
    var v48: [[Double]] = v49
    let v70: [[Double]] = v68.p0
    v7[0] = v25
    let v143: [[Double]] = v38.p0
    let v73: [[Double]] = v68.p0
    v7[0] = v2
    v53 = v73
    let v62: [[Double]] = v26.p1
    var v89: [[Double]] = v143
    v23[0] = v68
    v11.p1 = v48
    let v60: s0 = s0(p0: v53, p1: v62)
    let v69: s0 = f106(v18)
    let v82: [[Double]] = v18.p1
    let v75: s2 = s2(p0: v60, p1: v15)
    let v55: [Double] = v36[0]
    let v101: s0 = v5.p0
    var v74: [[Double]] = v19
    v11.p0 = v29
    v4.p1 = v32
    v13.p1 = v48
    v11.p0 = v89
    var v104: [s0] = v47
    v11.p0 = v70
    v11.p0 = v29
    let v83: s0 = f106(v11)
    v23[0] = v69
    v16.p1 = v104
    var v59: [[Double]] = v53
    v16.p0 = v83
    v48[0] = v27
    v11.p1 = v74
    v11.p1 = v34
    let v137: [[Double]] = v101.p0
    v89[0] = v20
    v13.p0 = v59
    v4.p0 = v68
    v26.p0 = v137
    v34[0] = v27
    let v253: [[Double]] = v28.p1
    v4.p1 = v32
    v4.p1 = v42
    let v87: [[[Double]]] = [v49, v19, v253, v253, v253]
    v23[0] = v11
    let v140: s0 = v54.p0
    let v109: [[Double]] = v87[0]
    v26.p1 = v109
    v5.p0 = v140
    v11.p1 = v82
    v6.p1 = v62
    v22[1] = v55
    v16.p0 = v28
    return v75
  }
  func f90(_ v0: s2) -> s2 {
    let v2: s2 = f99(v0)
    let v1: [s0] = v0.p1
    let v5: s2 = f99(v0)
    var v6: [s0] = v1
    let v8: s0 = v2.p0
    let v9: s0 = f106(v8)
    let v19: s2 = f99(v5)
    let v16: s0 = f106(v8)
    let v13: s2 = f99(v19)
    v6[0] = v9
    let v17: s0 = v13.p0
    let v36: s0 = f106(v16)
    let v28: s2 = s2(p0: v36, p1: v6)
    let v53: s0 = v13.p0
    v6[0] = v17
    v6[0] = v53
    return v28
  }
  func f73(_ v0: Double) -> Double {
    var v7: Double = v0
    var v3: Double = v0
    let v5: [Double] = [v3, v7, v3, v7, v7, v7]
    let v11: Double = v5[4]
    let v13: Double = v11 + v11
    return v13
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s5, _ v2: s0, _ v3: Double) -> Double {
    let v7: s2 = f90(v0)
    let v4: [s0] = v7.p1
    let v12: s0 = v4[0]
    let v25: [[Double]] = v12.p1
    let v16: [Double] = v25[0]
    var v24: [Double] = v16
    let v43: Double = v16[0]
    let v39: Double = f73(v3)
    let v37: Double = v3 + v39
    v24[0] = v39
    let v61: Double = v43 / v43
    let v72: Double = v24[0]
    let v77: [Double] = [v43, v37, v61, v72, v43, v37]
    let v116: Double = v77[3]
    return v116
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [s0(p0: [[3.0]], p1: [[4.0], [5.0]])])
    let v1: s5 = s5(p0: s4(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: [s0(p0: [[9.0]], p1: [[10.0], [11.0]])]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0]]))
    let v2: s0 = s0(p0: [[15.0]], p1: [[16.0], [17.0]])
    let v3: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
