  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s7 {
    var p0: [[s1]]
    var p1: s0
  }
  func f53(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v2: [Double] = v6[0]
    var v5: s0 = v0
    let v3: Double = v2[0]
    let v1: [[Double]] = v0.p0
    let v9: [[Double]] = v5.p0
    v5.p0 = v1
    var v8: [Double] = v2
    var v11: Double = v3
    v8[0] = v11
    v5.p0 = v1
    let v10: [[Double]] = v5.p1
    let v4: [Double] = v10[0]
    v5.p1 = v10
    let v27: [[Double]] = v5.p1
    var v15: [[Double]] = v27
    let v19: [[Double]] = v5.p1
    let v14: [Double] = v27[0]
    let v18: s0 = s0(p0: v6, p1: v19)
    var v24: s0 = v18
    let v50: Double = v4[0]
    v24.p0 = v6
    v8[0] = v50
    v24.p0 = v9
    var v21: s0 = v18
    v24.p1 = v10
    var v17: Double = v50
    v21.p0 = v9
    var v31: [[Double]] = v15
    v5.p1 = v31
    let v49: Double = v4[0]
    v15[0] = v14
    v8[0] = v17
    v31[0] = v8
    var v32: s0 = v24
    var v47: Double = v49
    let v61: [[Double]] = v24.p0
    v5.p1 = v19
    v24 = v21
    v31[0] = v8
    v11 = v47
    v5.p0 = v9
    v21.p0 = v61
    v24.p0 = v9
    v5.p1 = v27
    return v32
  }
  func f51(_ v0: s0) -> s0 {
    let v2: s0 = f53(v0)
    let v5: s0 = f53(v0)
    let v4: s0 = f53(v0)
    let v6: [[Double]] = v5.p0
    let v3: [Double] = v6[0]
    let v9: [[Double]] = v2.p0
    var v1: [Double] = v3
    let v7: s0 = f53(v0)
    let v13: [[Double]] = v5.p1
    let v8: [[Double]] = v0.p1
    let v11: [[Double]] = v7.p1
    var v14: s0 = v4
    v14.p0 = v6
    var v12: s0 = v0
    v12.p1 = v13
    let v19: [Double] = v6[0]
    v14 = v4
    var v23: [Double] = v3
    var v25: [[Double]] = v11
    var v17: s0 = v14
    var v16: [[Double]] = v25
    var v28: s0 = v12
    let v24: Double = v19[0]
    let v22: [[Double]] = v4.p0
    var v33: [[Double]] = v16
    v12.p1 = v25
    v23[0] = v24
    let v27: [[Double]] = v28.p0
    let v31: s0 = f53(v17)
    let v46: [Double] = v27[1]
    let v30: [[Double]] = v14.p0
    v17.p0 = v6
    let v34: [[Double]] = v4.p1
    v33[0] = v1
    let v32: [[Double]] = v0.p0
    v28.p0 = v30
    let v20: [[Double]] = v17.p1
    let v62: Double = v1[0]
    let v45: s0 = f53(v14)
    v14.p1 = v8
    v25[0] = v19
    let v72: [Double] = v25[0]
    var v43: s0 = v31
    var v71: [Double] = v3
    var v57: Double = v62
    v71[0] = v57
    v14.p1 = v34
    v33[0] = v72
    v23[0] = v62
    let v70: [[Double]] = v0.p0
    v43 = v45
    v12.p0 = v9
    v43.p0 = v9
    v14 = v2
    v14.p0 = v27
    v25[0] = v71
    let v75: [Double] = v32[1]
    let v86: [[[Double]]] = [v70, v22]
    v25[0] = v23
    var v161: [[[Double]]] = v86
    v25 = v20
    let v159: [[Double]] = v86[1]
    v1[0] = v57
    v43.p0 = v6
    v43.p1 = v8
    v12.p0 = v159
    v25[0] = v46
    let v74: s0 = f53(v43)
    var v96: [[[Double]]] = v161
    let v90: [[Double]] = v96[1]
    v12.p1 = v33
    v33[0] = v75
    v14.p0 = v90
    return v74
  }
  func f36(_ v0: s7) -> s7 {
    var v4: s7 = v0
    v4 = v0
    let v8: [[s1]] = v4.p0
    var v3: [[s1]] = v8
    let v19: s0 = v4.p1
    let v6: s0 = f51(v19)
    let v21: [s1] = v8[1]
    let v10: s7 = s7(p0: v3, p1: v6)
    var v30: s7 = v0
    let v14: [[s1]] = v30.p0
    v4 = v0
    let v24: [[s1]] = v10.p0
    let v25: [s1] = v14[2]
    var v37: [[s1]] = v24
    var v17: s7 = v10
    v30.p0 = v24
    var v38: [[s1]] = v37
    v3[1] = v21
    v38[1] = v25
    v3 = v38
    return v17
  }
  func f4(_ v0: s7) -> s7 {
    let v7: [s7] = [v0, v0, v0, v0]
    let v2: s7 = f36(v0)
    var v5: [s7] = v7
    var v12: [s7] = v5
    let v11: s7 = v12[3]
    let v19: s7 = f36(v2)
    v5[1] = v19
    let v36: s7 = f36(v11)
    let v58: s7 = f36(v36)
    v12[1] = v58
    let v85: s7 = f36(v58)
    v5[2] = v85
    return v85
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    var v4: s7 = v0
    var v3: s7 = v4
    let v6: s7 = f4(v0)
    let v5: [[s1]] = v6.p0
    v4.p0 = v5
    v3.p0 = v5
    let v11: s7 = f4(v3)
    let v12: s0 = v11.p1
    let v10: [[Double]] = v12.p1
    v3.p1 = v12
    let v54: s0 = v6.p1
    v4.p1 = v54
    v4.p1 = v54
    let v41: [Double] = v10[0]
    let v49: Double = v41[0]
    return v49
  }
  func benchmark() {
    let v0: s7 = s7(p0: [[s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]]))], [s1(p0: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))], [s1(p0: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])], p1: s0(p0: [[24.0], [25.0]], p1: [[26.0]]))]], p1: s0(p0: [[27.0], [28.0]], p1: [[29.0]]))
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
