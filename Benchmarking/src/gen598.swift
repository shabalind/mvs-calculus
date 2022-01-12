  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: s1
  }
  struct s3 {
    var p0: [s2]
    var p1: [Double]
  }
  func f106(_ v0: [s3]) -> [s3] {
    let v6: s3 = v0[2]
    var v7: [s3] = v0
    v7[0] = v6
    var v10: [s3] = v7
    v7[1] = v6
    return v10
  }
  func f105(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p1
    let v5: [[Double]] = v0.p0
    let v4: [Double] = v7[0]
    let v6: [Double] = v7[0]
    let v2: [[Double]] = v0.p1
    let v9: s0 = s0(p0: v5, p1: v7)
    let v1: Double = v6[0]
    var v12: [[Double]] = v2
    let v11: [[Double]] = v0.p0
    let v10: [[Double]] = v9.p0
    let v8: [Double] = v2[0]
    v12[0] = v4
    v12[0] = v4
    v12[0] = v8
    var v31: Double = v1
    let v28: [Double] = v10[1]
    var v25: s0 = v9
    var v15: s0 = v0
    var v16: [Double] = v8
    v12[0] = v6
    var v19: Double = v31
    let v32: [Double] = v7[0]
    let v20: [Double] = v11[0]
    let v24: [[Double]] = v15.p1
    var v41: [Double] = v20
    let v46: [[Double]] = v0.p1
    let v65: s0 = s0(p0: v11, p1: v46)
    var v40: [[Double]] = v46
    v41[0] = v1
    v25.p1 = v24
    let v47: [[Double]] = v9.p1
    v15.p1 = v7
    v40[0] = v41
    let v23: [[Double]] = v0.p1
    let v44: [[Double]] = v25.p0
    v25.p1 = v47
    v16[0] = v19
    let v45: [[Double]] = v65.p1
    var v35: [Double] = v16
    let v74: [[Double]] = v65.p1
    v41[0] = v19
    let v56: [Double] = v40[0]
    v25.p1 = v12
    v15.p1 = v45
    v15.p1 = v23
    v12[0] = v56
    v25.p1 = v74
    v25.p1 = v74
    v12[0] = v32
    v15.p0 = v44
    v12[0] = v35
    v12[0] = v28
    return v25
  }
  func f103(_ v0: s3) -> s3 {
    let v6: [Double] = v0.p1
    var v7: [Double] = v6
    let v4: [s3] = [v0, v0, v0]
    var v1: s3 = v0
    let v3: Double = v6[1]
    v1.p1 = v6
    v7[1] = v3
    var v11: [s3] = v4
    let v12: [s3] = f106(v11)
    let v8: Double = v7[1]
    var v42: s3 = v1
    v42.p1 = v6
    v11[1] = v1
    v7[0] = v8
    v11[2] = v42
    let v14: [Double] = v42.p1
    v42.p1 = v14
    let v31: s3 = v12[2]
    v1.p1 = v7
    v7[0] = v8
    return v31
  }
  func f101(_ v0: s1, _ v1: s3) -> s1 {
    var v7: s1 = v0
    let v9: s0 = v7.p1
    v7.p1 = v9
    let v11: [s0] = v7.p0
    v7.p0 = v11
    let v22: [s0] = v7.p0
    v7.p0 = v22
    v7.p0 = v22
    var v54: s1 = v0
    let v48: [s0] = v0.p0
    v54.p0 = v22
    v54.p0 = v48
    return v54
  }
  func f98(_ v0: s3, _ v1: s1) -> s3 {
    let v7: s3 = f103(v0)
    var v4: s3 = v0
    let v5: [s2] = v7.p0
    let v14: [s2] = v7.p0
    let v17: s3 = f103(v4)
    v4.p0 = v5
    let v8: s3 = f103(v17)
    let v27: [Double] = v8.p1
    let v19: s3 = s3(p0: v14, p1: v27)
    let v50: s3 = f103(v17)
    v4 = v50
    return v19
  }
  func f59(_ v0: s0, _ v1: s3) -> s3 {
    let v10: [Double] = v1.p1
    let v11: s3 = f103(v1)
    let v17: [s2] = v11.p0
    var v25: [s2] = v17
    let v48: s3 = s3(p0: v25, p1: v10)
    return v48
  }
  func f58(_ v0: s3) -> s3 {
    var v2: s3 = v0
    let v4: s3 = f103(v0)
    let v13: s3 = f103(v0)
    let v1: s3 = f103(v2)
    let v5: [Double] = v1.p1
    v2.p1 = v5
    v2.p1 = v5
    let v7: [Double] = v13.p1
    let v15: s3 = f103(v2)
    v2.p1 = v7
    let v18: [s2] = v4.p0
    let v19: s3 = f103(v15)
    var v22: [s2] = v18
    let v49: s2 = v22[0]
    var v54: s2 = v49
    let v71: [s2] = v0.p0
    let v43: s1 = v54.p1
    var v40: s1 = v43
    let v58: s1 = f101(v40, v19)
    v2.p0 = v71
    var v33: s1 = v58
    let v57: s3 = f98(v2, v33)
    return v57
  }
  func f19(_ v0: s3) -> s3 {
    let v5: s3 = f58(v0)
    let v6: [s2] = v0.p0
    let v3: [Double] = v5.p1
    let v1: s2 = v6[0]
    var v11: [s2] = v6
    var v12: [s2] = v6
    let v28: s3 = f58(v0)
    let v25: s1 = v1.p1
    var v19: s2 = v1
    v11[0] = v1
    let v10: s1 = v19.p1
    let v24: s3 = s3(p0: v11, p1: v3)
    let v18: s1 = v19.p1
    let v13: s2 = v12[0]
    v19.p1 = v18
    v19.p1 = v25
    v12[0] = v13
    var v26: s1 = v18
    var v42: s1 = v25
    let v41: s3 = f98(v24, v26)
    let v71: s1 = v19.p1
    v42 = v71
    let v31: s0 = v10.p1
    v26.p1 = v31
    let v30: s0 = v42.p1
    var v72: s0 = v30
    let v52: s2 = v12[0]
    let v81: s1 = f101(v42, v41)
    let v55: [s2] = [v52, v13, v19, v13, v19, v13, v13]
    v42.p1 = v72
    v19.p1 = v81
    let v37: s3 = f98(v28, v18)
    let v114: s0 = f105(v72)
    let v124: s2 = v55[3]
    let v62: s2 = v12[0]
    let v121: s0 = v81.p1
    let v95: s3 = f59(v121, v37)
    v26.p1 = v30
    v11[0] = v62
    v12[0] = v13
    let v79: [[Double]] = v114.p1
    v72.p1 = v79
    v11[0] = v124
    v72 = v121
    return v95
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v7: s3 = f103(v0)
    let v4: s3 = f19(v7)
    let v5: s3 = f103(v4)
    let v23: [Double] = v5.p1
    let v68: Double = v23[0]
    return v68
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s2(p0: [[s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]]))]], p1: s1(p0: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]])))], p1: [18.0, 19.0])
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
