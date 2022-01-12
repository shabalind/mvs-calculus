  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f34(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    let v7: [[Double]] = v0.p1
    let v5: [[Double]] = v0.p0
    let v6: [[[Double]]] = [v5, v5, v2, v5, v2, v2, v5]
    var v4: [[Double]] = v7
    var v3: s0 = v0
    var v8: [[[Double]]] = v6
    v3.p1 = v7
    let v1: [[Double]] = v0.p0
    v3.p1 = v4
    v3.p0 = v5
    let v18: [Double] = v7[0]
    var v26: [[Double]] = v4
    let v12: s0 = s0(p0: v1, p1: v26)
    var v16: [[[Double]]] = v8
    v3.p0 = v2
    v8[5] = v5
    let v11: [[Double]] = v3.p0
    var v43: [[[Double]]] = v16
    v43[5] = v11
    v8[6] = v11
    var v14: s0 = v3
    var v46: s0 = v14
    let v19: [[Double]] = v14.p1
    v26[0] = v18
    let v35: [[Double]] = v43[1]
    v8[5] = v11
    let v28: [Double] = v5[0]
    v3.p1 = v19
    let v52: s1 = s1(p0: v46, p1: v12)
    let v49: [Double] = v11[1]
    let v98: [[Double]] = v43[0]
    let v65: [[Double]] = v6[3]
    v3.p0 = v35
    var v58: s0 = v12
    v3.p0 = v11
    v58.p0 = v98
    v26[0] = v49
    v14.p0 = v5
    var v60: s1 = v52
    v46.p0 = v65
    v60.p0 = v58
    v26[0] = v28
    let v87: s0 = v60.p0
    return v87
  }
  func f33(_ v0: Double) -> Double {
    var v8: Double = v0
    var v4: Double = v0
    var v2: Double = v8
    var v3: Double = v2
    var v11: Double = v4
    var v5: Double = v0
    let v27: Double = v11 * v3
    var v28: Double = v0
    let v16: [Double] = [v5, v28]
    let v17: Double = v16[0]
    v4 = v5
    v2 = v17
    return v27
  }
  func f30(_ v0: s1) -> s1 {
    var v6: s1 = v0
    var v3: s1 = v0
    var v4: s1 = v3
    let v5: [s1] = [v3, v3, v4, v3]
    let v2: [[s1]] = [v5, v5, v5, v5, v5, v5]
    let v1: s0 = v6.p0
    let v12: s0 = v4.p0
    let v15: s0 = v6.p1
    var v10: s1 = v6
    var v11: s0 = v15
    let v25: s0 = v3.p0
    let v24: s0 = f34(v1)
    let v31: s0 = f34(v11)
    let v30: s0 = v4.p1
    let v21: s0 = f34(v31)
    v10.p1 = v24
    v6.p1 = v21
    v6.p0 = v11
    let v29: s0 = f34(v12)
    let v51: s0 = v4.p1
    let v84: [[Double]] = v51.p1
    v10.p0 = v12
    var v37: s1 = v10
    let v43: [s1] = v2[0]
    let v49: s0 = f34(v31)
    v3.p1 = v25
    v4.p0 = v49
    let v41: s0 = f34(v51)
    v11.p1 = v84
    let v47: s0 = f34(v1)
    let v104: s0 = v37.p0
    let v94: s0 = v3.p1
    let v54: s0 = f34(v94)
    v4.p0 = v47
    let v110: [[Double]] = v30.p1
    v4 = v6
    v4 = v37
    v6.p1 = v29
    let v154: [[Double]] = v41.p0
    v37.p0 = v31
    v11.p0 = v154
    v11.p1 = v110
    v6 = v4
    v4.p0 = v25
    let v129: s1 = v43[3]
    v3.p0 = v54
    v4.p0 = v47
    v10.p0 = v104
    return v129
  }
  func f25(_ v0: s0) -> s0 {
    let v7: s0 = f34(v0)
    let v10: s0 = f34(v0)
    var v19: s0 = v0
    let v25: [[Double]] = v7.p1
    let v29: s0 = f34(v19)
    let v17: [s0] = [v29, v10, v19, v29, v29]
    var v72: [s0] = v17
    v19.p1 = v25
    let v54: s0 = v72[2]
    return v54
  }
  func f21(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v4: s0 = f34(v0)
    let v10: s0 = f25(v0)
    let v20: [[Double]] = v4.p0
    v6.p0 = v20
    let v30: s1 = s1(p0: v10, p1: v6)
    var v84: s1 = v30
    var v63: s1 = v84
    let v151: s0 = v63.p1
    v63.p0 = v4
    let v100: s0 = f34(v151)
    return v100
  }
  func f10(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    var v2: s0 = v0
    let v4: [[Double]] = v0.p1
    let v8: s0 = f34(v2)
    let v9: s0 = f21(v0)
    let v6: s0 = s0(p0: v5, p1: v4)
    let v1: [Double] = v5[1]
    let v12: s0 = f21(v9)
    let v13: s0 = f25(v12)
    let v3: [[Double]] = v9.p1
    v2.p1 = v3
    let v15: [[Double]] = v8.p0
    v2.p0 = v15
    let v18: [[Double]] = v8.p0
    v2.p1 = v4
    let v17: [[Double]] = v9.p0
    var v25: s0 = v0
    let v27: s0 = f21(v25)
    let v30: [[Double]] = v12.p1
    v2.p1 = v30
    let v37: [[Double]] = v27.p0
    let v51: [[Double]] = v6.p0
    v2.p0 = v5
    var v44: [[Double]] = v18
    v25.p1 = v30
    v2 = v27
    v25.p1 = v3
    let v47: [[Double]] = v13.p0
    let v31: s0 = f21(v2)
    v25.p0 = v51
    v2.p0 = v18
    v2.p0 = v51
    var v48: s0 = v31
    v25.p0 = v44
    v25.p0 = v47
    var v75: [[Double]] = v4
    let v41: [Double] = v5[1]
    v44[0] = v41
    var v215: s0 = v0
    var v53: s0 = v48
    let v71: s1 = s1(p0: v53, p1: v53)
    v53.p0 = v5
    let v112: s1 = s1(p0: v6, p1: v215)
    v215.p1 = v75
    v2.p1 = v4
    v75[0] = v1
    let v198: s0 = v71.p1
    let v84: s0 = v112.p0
    v48.p0 = v15
    let v201: [[Double]] = v84.p0
    v2.p0 = v37
    v53.p0 = v201
    v25.p0 = v17
    return v198
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v6: s1 = v0
    var v5: s1 = v0
    var v7: Double = v1
    var v4: s1 = v0
    let v3: s0 = v4.p0
    var v9: s1 = v0
    v9.p0 = v3
    let v10: s0 = v0.p1
    let v15: s0 = v5.p0
    let v14: s1 = s1(p0: v3, p1: v15)
    let v20: [[Double]] = v3.p1
    var v11: [[Double]] = v20
    let v30: s0 = v9.p0
    v4.p1 = v30
    let v24: [Double] = v11[0]
    let v36: s0 = v6.p0
    v11[0] = v24
    let v27: [[Double]] = v15.p0
    let v22: s0 = f34(v36)
    v11[0] = v24
    let v61: [Double] = v27[1]
    v6.p0 = v36
    v6.p1 = v22
    var v41: [Double] = v61
    v41 = v24
    let v34: s0 = f10(v15)
    v5.p0 = v10
    let v58: s1 = f30(v14)
    v6.p0 = v30
    v9.p0 = v30
    let v67: s0 = v4.p0
    let v69: s0 = v58.p0
    v6.p0 = v22
    v41[0] = v7
    let v120: Double = v41[0]
    v5.p1 = v67
    v4.p0 = v69
    let v71: s0 = f10(v22)
    v4.p1 = v36
    v5.p0 = v71
    v6.p0 = v34
    v4.p0 = v69
    v5.p1 = v15
    let v102: Double = f33(v120)
    let v140: Double = f33(v102)
    return v140
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
