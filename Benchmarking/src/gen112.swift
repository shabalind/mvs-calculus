  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f111(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p0
    let v5: [[Double]] = v0.p1
    let v6: [Double] = v5[0]
    var v7: [[Double]] = v4
    let v2: s0 = s0(p0: v4, p1: v7)
    var v10: s0 = v0
    let v1: [[Double]] = v2.p1
    v10.p1 = v1
    v7[0] = v6
    let v25: [[Double]] = v0.p0
    let v22: [[Double]] = v2.p0
    let v73: [[Double]] = v2.p1
    v10.p1 = v25
    let v32: [s0] = [v0, v10, v2, v10, v0, v2, v10]
    var v41: [s0] = v32
    let v33: s0 = v41[0]
    let v71: [Double] = v22[0]
    v7[0] = v71
    v10.p1 = v73
    return v33
  }
  func f109(_ v0: s0, _ v1: [s0]) -> s0 {
    let v3: s0 = v1[0]
    let v6: [[Double]] = v0.p1
    var v5: [[Double]] = v6
    v5 = v6
    let v4: [[Double]] = v3.p0
    let v2: s0 = s0(p0: v4, p1: v5)
    let v11: [[Double]] = v0.p0
    let v13: s0 = f111(v2)
    let v23: s0 = f111(v3)
    let v35: s0 = v1[0]
    let v21: s0 = f111(v13)
    let v16: [[Double]] = v23.p0
    let v15: [[Double]] = v35.p0
    let v24: [Double] = v11[0]
    v5[0] = v24
    var v17: [Double] = v24
    var v42: s0 = v21
    v42.p1 = v6
    v5[0] = v24
    let v50: [Double] = v16[0]
    v42.p1 = v6
    let v68: [Double] = v15[0]
    v5[0] = v50
    v5[0] = v17
    let v92: Double = v68[0]
    v17[0] = v92
    return v42
  }
  func f101(_ v0: Double, _ v1: s0) -> Double {
    let v8: [[Double]] = v1.p0
    let v4: [Double] = v8[0]
    let v11: Double = v4[0]
    let v3: s0 = f111(v1)
    var v6: [Double] = v4
    let v9: Double = v4[0]
    let v12: s0 = f111(v3)
    let v19: [[Double]] = v12.p1
    v6 = v4
    let v56: Double = v9 + v11
    let v39: [Double] = v19[0]
    v6[0] = v0
    let v80: Double = v6[0]
    v6 = v4
    v6 = v39
    let v140: Double = v80 - v56
    return v140
  }
  func f95(_ v0: s0) -> s0 {
    let v1: [s0] = [v0]
    let v8: s0 = f109(v0, v1)
    let v9: s0 = f109(v8, v1)
    return v9
  }
  func f90(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p1
    var v7: s0 = v0
    var v6: s0 = v7
    let v3: [[[Double]]] = [v5, v5, v5]
    var v4: [[Double]] = v5
    let v10: [[Double]] = v0.p0
    v7.p0 = v5
    var v2: s0 = v7
    let v8: s0 = f111(v6)
    let v1: s0 = f111(v2)
    let v9: s0 = f111(v1)
    let v15: [[Double]] = v3[2]
    v2.p0 = v10
    var v16: [[Double]] = v15
    var v12: [[Double]] = v16
    let v14: [[Double]] = v1.p1
    let v22: s0 = f111(v2)
    v7 = v1
    v6.p0 = v12
    let v38: [[Double]] = v9.p1
    let v17: [[Double]] = v3[2]
    v7.p1 = v38
    let v19: s0 = f111(v8)
    let v28: [[Double]] = v8.p0
    v7.p0 = v28
    var v60: [[Double]] = v17
    v7 = v19
    let v43: [[Double]] = v22.p0
    v2.p1 = v4
    v7.p0 = v60
    v6.p1 = v5
    v4 = v14
    v16 = v12
    v6.p0 = v43
    var v58: s0 = v1
    return v58
  }
  func f83(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v1: [[Double]] = v0.p0
    var v4: s0 = v3
    var v5: [[Double]] = v1
    let v2: [[Double]] = v3.p0
    var v12: s0 = v4
    var v27: s0 = v12
    let v15: [[[Double]]] = [v1, v2]
    let v13: [[Double]] = v27.p0
    let v23: s0 = f90(v12)
    let v24: s0 = f90(v23)
    v3 = v24
    let v38: [Double] = v13[0]
    let v42: [[Double]] = v15[1]
    var v19: [Double] = v38
    let v28: [[Double]] = v3.p0
    let v31: Double = v19[0]
    let v22: [[Double]] = v23.p1
    let v36: Double = v31 + v31
    let v122: s0 = s0(p0: v5, p1: v42)
    v19[0] = v36
    var v50: s0 = v0
    let v47: [[Double]] = v50.p1
    v19[0] = v36
    let v66: s0 = s0(p0: v47, p1: v28)
    v50.p0 = v22
    let v52: [[Double]] = v122.p1
    var v78: [Double] = v19
    v50.p1 = v52
    v50.p1 = v28
    v5[0] = v78
    let v217: s0 = f111(v66)
    return v217
  }
  func f81(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p1
    let v4: s0 = f90(v0)
    let v5: [[Double]] = v4.p0
    let v6: [[Double]] = v0.p1
    let v1: [s0] = [v0, v0, v0, v4, v4, v0, v4]
    let v2: s0 = v1[6]
    var v3: s0 = v2
    let v9: s0 = v1[6]
    let v8: s0 = f83(v3)
    let v18: [[Double]] = v9.p0
    let v13: s0 = v1[6]
    let v14: s0 = f83(v13)
    let v39: s0 = f95(v8)
    var v26: s0 = v0
    v26.p1 = v5
    let v31: [[Double]] = v14.p0
    let v33: [[Double]] = v26.p1
    var v50: s0 = v39
    v50.p0 = v18
    v50.p0 = v7
    v26.p1 = v31
    let v80: [[Double]] = v26.p1
    v50.p0 = v33
    let v82: [[Double]] = v0.p1
    v26.p1 = v31
    v50.p0 = v6
    v3.p1 = v82
    v26.p1 = v80
    return v50
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: Double) -> Double {
    let v4: s0 = v0[2]
    let v17: s0 = f81(v4)
    var v23: Double = v2
    let v21: s0 = v0[2]
    var v30: Double = v23
    let v20: [[Double]] = v17.p0
    let v39: Double = f101(v30, v21)
    var v29: Double = v23
    let v58: [Double] = v20[0]
    let v61: Double = v58[0]
    var v54: Double = v29
    v29 = v61
    let v106: [Double] = [v54, v29, v2, v39, v54, v61, v2]
    var v195: [Double] = v106
    let v114: Double = v195[6]
    v195[1] = v2
    return v114
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])]
    let v1: s0 = s0(p0: [[6.0]], p1: [[7.0]])
    let v2: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
