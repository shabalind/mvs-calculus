  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f26(_ v0: s0, _ v1: s0, _ v2: s0) -> s0 {
    var v3: s0 = v1
    var v4: s0 = v0
    v3 = v4
    let v7: [[Double]] = v3.p1
    let v5: [Double] = v7[0]
    v3.p1 = v7
    let v14: Double = v5[0]
    let v13: [[Double]] = v1.p0
    var v23: Double = v14
    let v21: [[Double]] = v0.p1
    let v20: [[Double]] = v4.p0
    v4.p0 = v13
    let v15: [Double] = v20[0]
    var v24: [[Double]] = v20
    v24[0] = v5
    var v18: [[Double]] = v24
    v4.p0 = v20
    var v19: s0 = v2
    v4.p0 = v18
    var v34: [[Double]] = v18
    v24[1] = v5
    var v47: s0 = v4
    v19.p0 = v24
    var v44: [Double] = v15
    v4.p1 = v21
    v3.p0 = v34
    let v51: [[Double]] = v3.p1
    v44[0] = v23
    v19.p1 = v7
    let v37: [s0] = [v3, v47, v0, v4, v2, v19]
    let v70: s0 = v37[3]
    v19.p1 = v51
    let v102: [[Double]] = v70.p1
    var v60: [Double] = v44
    v47.p1 = v102
    v44[0] = v23
    v44[0] = v23
    let v107: s0 = v37[2]
    v24[1] = v60
    return v107
  }
  func f25(_ v0: s0) -> s0 {
    var v2: s0 = v0
    let v1: [[Double]] = v2.p1
    let v7: [[Double]] = v0.p0
    var v4: [[Double]] = v1
    let v3: s0 = f26(v2, v0, v2)
    v2 = v0
    let v5: s0 = f26(v3, v2, v0)
    let v6: [Double] = v7[1]
    let v9: s0 = f26(v3, v5, v3)
    let v8: [[Double]] = v3.p1
    let v34: [Double] = v7[1]
    let v13: [[Double]] = v3.p0
    v2.p1 = v8
    let v17: s0 = f26(v3, v2, v3)
    var v21: [[Double]] = v7
    var v10: [[Double]] = v4
    let v15: [Double] = v7[1]
    let v45: [[Double]] = v3.p1
    let v23: s0 = f26(v3, v0, v17)
    var v14: s0 = v9
    let v24: s0 = s0(p0: v13, p1: v8)
    let v22: [Double] = v8[0]
    v4[0] = v34
    v21 = v13
    let v40: s0 = f26(v9, v2, v2)
    let v49: s0 = f26(v0, v0, v23)
    let v26: s0 = f26(v40, v49, v40)
    let v42: s0 = f26(v26, v3, v14)
    let v41: [[Double]] = [v22, v15, v22, v6, v34, v6]
    let v32: s0 = f26(v23, v2, v26)
    v4 = v45
    let v62: s0 = f26(v42, v0, v26)
    let v28: s0 = f26(v62, v32, v17)
    v14.p1 = v10
    let v44: [[Double]] = v26.p1
    let v81: [[Double]] = v28.p1
    let v54: s0 = f26(v9, v42, v26)
    let v61: s0 = f26(v9, v40, v24)
    v2.p0 = v21
    let v102: s0 = f26(v26, v62, v5)
    let v89: [[Double]] = v24.p0
    let v56: s0 = f26(v42, v42, v26)
    let v100: [Double] = v41[2]
    var v88: [[Double]] = v10
    let v57: [[Double]] = v102.p0
    let v55: [[Double]] = v49.p0
    var v103: [[Double]] = v57
    v14.p1 = v81
    v14.p1 = v8
    v14.p1 = v88
    v2.p0 = v89
    v14.p0 = v55
    v21[0] = v100
    let v118: s0 = f26(v62, v14, v14)
    v14.p0 = v103
    v2.p1 = v44
    let v65: s0 = f26(v102, v42, v42)
    v2.p1 = v8
    let v98: s0 = f26(v65, v9, v3)
    v14 = v118
    let v157: s0 = f26(v54, v61, v56)
    let v128: s0 = f26(v17, v98, v157)
    return v128
  }
  func f23(_ v0: s0, _ v1: s0) -> s0 {
    var v5: s0 = v1
    let v7: s0 = f25(v1)
    let v13: [[Double]] = v5.p0
    var v11: s0 = v5
    var v15: s0 = v5
    let v14: [[Double]] = v15.p1
    let v19: [[Double]] = v7.p0
    let v3: [Double] = v13[1]
    let v52: s0 = f25(v1)
    let v26: [[Double]] = v0.p1
    var v40: [[Double]] = v13
    let v27: [[Double]] = v52.p0
    v15.p0 = v40
    v5.p1 = v26
    v40[0] = v3
    let v66: [Double] = v14[0]
    var v38: [[Double]] = v19
    v11.p0 = v27
    let v67: s0 = s0(p0: v38, p1: v14)
    v15.p0 = v40
    v40[0] = v66
    let v55: s0 = f26(v67, v11, v11)
    v15.p1 = v26
    var v97: s0 = v55
    return v97
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: [[s0]], _ v2: s0, _ v3: s0, _ v4: [[s0]], _ v5: Double) -> Double {
    let v9: s0 = f23(v3, v3)
    let v11: [[Double]] = v9.p1
    let v31: [Double] = v11[0]
    let v50: Double = v31[0]
    return v50
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])]]
    let v1: [[s0]] = [[s0(p0: [[6.0], [7.0]], p1: [[8.0]])], [s0(p0: [[9.0], [10.0]], p1: [[11.0]])]]
    let v2: s0 = s0(p0: [[12.0], [13.0]], p1: [[14.0]])
    let v3: s0 = s0(p0: [[15.0], [16.0]], p1: [[17.0]])
    let v4: [[s0]] = [[s0(p0: [[18.0], [19.0]], p1: [[20.0]])], [s0(p0: [[21.0], [22.0]], p1: [[23.0]])], [s0(p0: [[24.0], [25.0]], p1: [[26.0]])]]
    let v5: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
