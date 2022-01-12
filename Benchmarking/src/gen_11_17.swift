  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  func f71(_ v0: s0) -> s0 {
    let v1: [s0] = [v0, v0, v0, v0, v0, v0]
    let v19: s0 = v1[0]
    var v43: [s0] = v1
    let v65: s0 = v43[5]
    v43[0] = v19
    v43[0] = v0
    return v65
  }
  func f68(_ v0: s0) -> s0 {
    let v2: s0 = f71(v0)
    var v4: s0 = v0
    let v6: s0 = f71(v4)
    let v7: [[Double]] = v6.p0
    var v3: [[Double]] = v7
    let v12: [Double] = v3[1]
    v3[1] = v12
    v3[0] = v12
    let v9: s0 = f71(v0)
    var v5: s0 = v9
    let v13: [[Double]] = v9.p1
    let v8: Double = v12[0]
    v3[1] = v12
    let v21: [[Double]] = v9.p1
    let v16: [Double] = v21[0]
    var v27: [Double] = v12
    let v15: [[Double]] = v2.p0
    var v17: [[Double]] = v15
    let v24: [Double] = v17[2]
    let v14: s0 = f71(v5)
    v4.p1 = v21
    v3[0] = v12
    v27[0] = v8
    v17[2] = v16
    let v28: Double = v12[0]
    v4.p1 = v13
    let v19: Double = v24[0]
    v5.p0 = v17
    let v32: [Double] = v17[1]
    v3[1] = v32
    let v18: s0 = s0(p0: v7, p1: v21, p2: v21)
    let v41: s0 = f71(v14)
    let v42: [[Double]] = v41.p2
    let v65: [Double] = v3[1]
    v3[2] = v65
    let v40: [[Double]] = v18.p0
    v4.p0 = v3
    var v46: [Double] = v65
    var v44: [[Double]] = v40
    var v58: [[Double]] = v42
    v27[0] = v28
    v17[0] = v27
    v3[0] = v27
    let v93: [[Double]] = v14.p2
    let v34: [[Double]] = v9.p1
    let v180: [Double] = v93[0]
    let v84: [[Double]] = v5.p1
    let v116: s0 = s0(p0: v44, p1: v84, p2: v34)
    let v96: s0 = f71(v116)
    v46[0] = v19
    v58[0] = v46
    v5.p2 = v58
    let v183: s0 = f71(v96)
    v3[0] = v180
    return v183
  }
  func f66(_ v0: s0) -> s0 {
    let v3: s0 = f71(v0)
    let v2: s0 = f71(v3)
    let v4: s0 = f71(v2)
    let v8: [[Double]] = v0.p2
    var v16: s0 = v3
    v16.p1 = v8
    let v6: [[Double]] = v16.p2
    let v12: [[Double]] = v16.p0
    v16 = v3
    v16 = v4
    let v35: [[Double]] = v0.p2
    let v18: s0 = s0(p0: v12, p1: v35, p2: v6)
    let v42: [[Double]] = v4.p1
    let v31: [[Double]] = v18.p1
    let v60: s0 = s0(p0: v12, p1: v31, p2: v8)
    var v69: [[Double]] = v8
    v16.p2 = v69
    v16.p2 = v42
    let v41: s0 = f68(v60)
    v16.p2 = v69
    let v37: [[Double]] = v41.p2
    v16.p1 = v6
    v16.p1 = v37
    return v41
  }
  func f35(_ v0: s2) -> s2 {
    let v2: [s2] = [v0]
    let v17: s2 = v2[0]
    return v17
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s0, _ v2: [s0], _ v3: Double) -> Double {
    let v5: s2 = f35(v0)
    let v8: [Double] = [v3, v3, v3, v3, v3]
    let v4: [[Double]] = v1.p1
    var v18: [[Double]] = v4
    let v7: [s0] = v5.p1
    var v11: [[Double]] = v4
    let v12: s0 = v7[0]
    var v22: [[Double]] = v18
    let v14: [Double] = v22[0]
    let v24: s0 = f66(v12)
    v11[0] = v14
    let v20: Double = v14[0]
    let v39: Double = v14[0]
    var v30: [Double] = v8
    let v31: Double = v8[4]
    var v35: Double = v39
    let v47: Double = v35 * v20
    v22[0] = v14
    v30[4] = v39
    v30[1] = v47
    v18[0] = v14
    let v55: [[Double]] = v24.p1
    v30[3] = v20
    let v120: [Double] = v55[0]
    var v84: [Double] = v120
    let v44: Double = v84[0]
    let v102: Double = v30[2]
    v30[0] = v31
    v30[4] = v44
    v30[0] = v3
    let v81: [[Double]] = v1.p1
    let v174: [Double] = v81[0]
    let v145: [Double] = v11[0]
    v22[0] = v145
    v18[0] = v174
    v30[2] = v31
    return v102
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0]], p2: [[9.0]])], p1: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0]], p2: [[14.0]])]), p1: [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0]], p2: [[19.0]])])
    let v1: s0 = s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]], p2: [[24.0]])
    let v2: [s0] = [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0]], p2: [[29.0]])]
    let v3: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
