  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s1
    var p2: Double
  }
  func f66(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v5: [[Double]] = v4.p0
    let v1: s1 = s1(p0: v0, p1: v0)
    v4.p0 = v5
    let v3: [Double] = v5[0]
    var v6: [Double] = v3
    var v7: [[Double]] = v5
    v7[0] = v3
    let v12: [[Double]] = v4.p1
    let v2: s0 = v1.p1
    let v9: [Double] = v7[0]
    let v19: [[Double]] = v4.p1
    let v10: [Double] = v7[0]
    var v8: [Double] = v10
    v4.p0 = v7
    v4.p0 = v5
    var v22: s1 = v1
    let v11: [[Double]] = v0.p1
    let v15: Double = v3[0]
    v8[0] = v15
    let v50: [[Double]] = v0.p0
    let v17: [[Double]] = [v3, v9, v6, v3, v10, v9, v8]
    var v36: s1 = v1
    v7[0] = v8
    v4.p1 = v5
    var v25: [[Double]] = v50
    v6[0] = v15
    v22.p1 = v2
    let v30: s0 = v22.p1
    let v33: [Double] = v19[0]
    let v41: s0 = v22.p0
    v22.p1 = v0
    let v29: s0 = s0(p0: v12, p1: v12)
    v22.p1 = v29
    let v31: s0 = v36.p0
    let v21: [Double] = v5[0]
    v25[0] = v33
    v22.p0 = v4
    v22.p0 = v31
    v36.p0 = v30
    let v23: [[Double]] = v30.p0
    v36.p0 = v30
    let v49: [Double] = v17[3]
    let v45: Double = v49[0]
    v4.p1 = v23
    let v39: s0 = s0(p0: v25, p1: v5)
    var v47: s0 = v41
    let v56: s0 = v36.p0
    let v55: s0 = v1.p1
    let v40: [[Double]] = v47.p1
    v25[0] = v21
    v36.p0 = v55
    v4.p0 = v40
    v36.p1 = v39
    let v66: s2 = s2(p0: v22, p1: v56)
    let v92: s0 = v66.p1
    v22.p0 = v2
    v4.p1 = v5
    v36.p0 = v4
    v4.p1 = v11
    v4.p0 = v11
    v8[0] = v45
    return v92
  }
  func f60(_ v0: s1) -> s1 {
    let v2: s0 = v0.p1
    var v4: s1 = v0
    let v3: s0 = f66(v2)
    let v11: [[Double]] = v3.p1
    var v8: s0 = v3
    v8.p0 = v11
    let v21: s0 = f66(v8)
    var v39: s1 = v4
    v4 = v0
    v4.p1 = v21
    let v44: s0 = f66(v2)
    let v52: s0 = v4.p1
    v39.p0 = v21
    v4.p0 = v44
    let v113: s2 = s2(p0: v39, p1: v52)
    let v138: s1 = v113.p0
    return v138
  }
  func f53(_ v0: s1, _ v1: s1) -> s1 {
    let v5: s1 = f60(v0)
    let v3: s1 = f60(v5)
    var v7: s1 = v1
    let v6: s0 = v7.p0
    let v8: [[Double]] = v6.p1
    v7.p1 = v6
    var v9: s0 = v6
    v9.p0 = v8
    v9.p0 = v8
    v9.p0 = v8
    var v10: s0 = v6
    v7.p0 = v9
    let v26: [[Double]] = v10.p0
    let v37: s0 = f66(v6)
    let v36: s0 = v3.p1
    v7.p1 = v10
    let v38: s1 = s1(p0: v36, p1: v37)
    v9.p1 = v26
    return v38
  }
  func f47(_ v0: s1) -> s1 {
    let v4: s1 = f53(v0, v0)
    let v3: s1 = f60(v0)
    let v7: s0 = v0.p1
    var v5: s0 = v7
    let v2: [[Double]] = v7.p0
    let v10: [[Double]] = v7.p1
    let v6: s0 = f66(v5)
    var v11: s1 = v0
    let v8: s0 = f66(v7)
    v5 = v6
    let v16: s1 = f53(v3, v4)
    var v12: s0 = v8
    let v25: s0 = v0.p1
    v12.p0 = v10
    var v13: s1 = v11
    v12.p0 = v10
    v5.p0 = v2
    v5.p1 = v2
    let v14: s1 = f53(v0, v16)
    let v36: s0 = v14.p1
    v13.p0 = v6
    var v33: s1 = v13
    var v21: s0 = v6
    let v68: s1 = f53(v4, v33)
    let v39: s0 = v33.p0
    let v32: s1 = f53(v68, v13)
    let v93: s0 = v3.p0
    v11.p0 = v12
    let v47: s0 = v16.p0
    v33.p1 = v36
    v13.p1 = v93
    v33.p0 = v21
    v5 = v47
    v33.p0 = v39
    v11.p1 = v25
    return v32
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: [s0], _ v2: Double) -> Double {
    var v11: [s0] = v1
    let v9: s0 = v11[1]
    let v13: s0 = f66(v9)
    let v21: s1 = s1(p0: v13, p1: v13)
    let v17: s1 = f53(v21, v21)
    let v25: s1 = f47(v17)
    var v35: s1 = v25
    let v53: s0 = v1[1]
    v11[1] = v9
    v35.p1 = v13
    let v60: s0 = v35.p0
    let v32: [[Double]] = v60.p1
    v11[1] = v53
    v11[1] = v13
    let v54: [Double] = v32[0]
    let v174: Double = v54[0]
    return v174
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]])), s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0]])), s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: s0(p0: [[10.0]], p1: [[11.0]]))], p1: s1(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: s0(p0: [[14.0]], p1: [[15.0]])), p2: 16.0), s3(p0: [s1(p0: s0(p0: [[17.0]], p1: [[18.0]]), p1: s0(p0: [[19.0]], p1: [[20.0]])), s1(p0: s0(p0: [[21.0]], p1: [[22.0]]), p1: s0(p0: [[23.0]], p1: [[24.0]])), s1(p0: s0(p0: [[25.0]], p1: [[26.0]]), p1: s0(p0: [[27.0]], p1: [[28.0]]))], p1: s1(p0: s0(p0: [[29.0]], p1: [[30.0]]), p1: s0(p0: [[31.0]], p1: [[32.0]])), p2: 33.0)]
    let v1: [s0] = [s0(p0: [[34.0]], p1: [[35.0]]), s0(p0: [[36.0]], p1: [[37.0]])]
    let v2: Double = 38.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 38.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
