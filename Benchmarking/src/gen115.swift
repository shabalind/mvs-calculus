  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f87(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p1
    let v2: [Double] = v5[0]
    let v7: [[Double]] = v0.p0
    var v35: s0 = v0
    v35.p1 = v5
    var v24: s0 = v0
    v24.p1 = v5
    let v43: [[Double]] = v24.p1
    var v39: s0 = v0
    v39.p1 = v5
    let v20: [[Double]] = v0.p0
    let v26: [[Double]] = v24.p0
    v35.p0 = v26
    var v50: [[Double]] = v20
    v24.p0 = v20
    v39 = v35
    var v54: [[Double]] = v43
    let v58: [[Double]] = v0.p0
    v35.p1 = v43
    v39.p1 = v54
    v35.p0 = v7
    v35 = v24
    v24.p0 = v50
    let v112: [[Double]] = v0.p1
    v35.p0 = v58
    v39.p1 = v43
    var v79: [[Double]] = v43
    var v105: s0 = v39
    v39.p1 = v112
    v35.p1 = v5
    v79[0] = v2
    let v252: [[Double]] = v39.p1
    v105.p1 = v79
    v39.p1 = v252
    return v105
  }
  func f82(_ v0: s0, _ v1: s0) -> s0 {
    var v7: s0 = v0
    let v10: s0 = f87(v1)
    let v4: [[Double]] = v0.p1
    let v5: s0 = f87(v1)
    let v8: [[Double]] = v7.p1
    var v3: [[Double]] = v8
    let v6: [Double] = v3[0]
    var v9: [[Double]] = v4
    var v11: [Double] = v6
    var v2: [Double] = v11
    v9[0] = v6
    let v15: [[Double]] = v5.p1
    v9[0] = v2
    v7.p1 = v15
    v3[0] = v6
    v7.p1 = v3
    v7.p1 = v8
    let v22: Double = v2[0]
    let v19: s0 = f87(v1)
    v2 = v11
    let v14: [Double] = v4[0]
    v7.p1 = v9
    let v81: [[Double]] = [v6, v2, v11, v14, v11]
    v9 = v8
    var v23: Double = v22
    let v42: [Double] = v81[0]
    let v27: [[Double]] = v19.p0
    v3 = v15
    var v33: [Double] = v14
    v7.p1 = v9
    let v26: [[Double]] = v10.p0
    var v21: [[Double]] = v26
    v7.p0 = v21
    v3[0] = v33
    v9[0] = v2
    v3[0] = v42
    let v61: s0 = f87(v7)
    var v28: s0 = v61
    v2[0] = v23
    v7.p0 = v27
    return v28
  }
  func f59(_ v0: s0) -> s0 {
    var v8: s0 = v0
    var v6: s0 = v0
    var v4: s0 = v0
    let v7: [[Double]] = v4.p1
    let v1: [[Double]] = v6.p0
    let v10: [Double] = v7[0]
    let v5: s0 = f82(v4, v6)
    var v2: [[Double]] = v7
    let v3: [Double] = v1[1]
    let v11: s0 = f87(v0)
    let v13: s0 = f87(v5)
    v6.p0 = v1
    let v12: [[Double]] = v0.p0
    v2[0] = v10
    let v17: s0 = f82(v5, v11)
    v6.p0 = v12
    let v22: [[Double]] = v13.p0
    let v24: [Double] = v12[0]
    let v34: s0 = f82(v17, v8)
    let v26: [[Double]] = v6.p0
    v8.p0 = v12
    var v30: [Double] = v10
    var v16: [Double] = v30
    var v27: [Double] = v16
    let v31: Double = v3[0]
    v8.p1 = v2
    v8.p0 = v26
    v6.p0 = v22
    let v57: s0 = f87(v6)
    let v52: [[Double]] = v8.p1
    v6.p1 = v52
    v6.p0 = v1
    let v96: s0 = f82(v34, v8)
    v27[0] = v31
    let v72: [[Double]] = v57.p1
    v4.p1 = v72
    let v62: [[Double]] = v0.p1
    v2[0] = v24
    v8.p0 = v26
    v16[0] = v31
    v2[0] = v27
    v4.p1 = v62
    return v96
  }
  func f52(_ v0: [s0]) -> [s0] {
    let v4: s0 = v0[0]
    let v7: [[Double]] = v4.p0
    let v11: s0 = f82(v4, v4)
    let v5: [[Double]] = v11.p1
    var v2: [s0] = v0
    let v9: s0 = f82(v4, v4)
    let v15: s0 = s0(p0: v7, p1: v5)
    let v18: s0 = f59(v15)
    let v20: s0 = f59(v9)
    v2[0] = v15
    var v69: [s0] = v2
    v69[0] = v20
    v69[0] = v18
    return v69
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v3: [Double] = [v1, v1, v1]
    let v7: Double = v3[2]
    let v22: [s0] = v0[0]
    var v13: Double = v7
    var v10: Double = v1
    var v12: Double = v13
    let v28: [s0] = f52(v22)
    let v15: s0 = v28[0]
    let v35: Double = v1 - v12
    let v55: Double = v35 * v12
    let v36: [[Double]] = v15.p0
    v13 = v10
    let v58: [Double] = v36[0]
    let v34: Double = v58[0]
    let v87: Double = v55 * v34
    return v87
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])], [s0(p0: [[6.0], [7.0]], p1: [[8.0]])]]
    let v1: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
