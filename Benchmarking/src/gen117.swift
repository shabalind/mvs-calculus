  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f66(_ v0: s1) -> s1 {
    var v3: s1 = v0
    let v6: s0 = v3.p0
    let v4: s1 = s1(p0: v6, p1: v6)
    let v1: [[Double]] = v6.p0
    var v7: s0 = v6
    v3.p1 = v7
    let v15: [[Double]] = v6.p1
    v7.p0 = v1
    var v20: [[Double]] = v15
    v7.p0 = v1
    v7.p1 = v20
    return v4
  }
  func f56(_ v0: Double, _ v1: s0) -> s0 {
    let v7: [[Double]] = v1.p0
    let v2: [[Double]] = v1.p0
    let v6: [Double] = v2[0]
    let v11: [Double] = v7[0]
    var v9: [Double] = v11
    let v3: [[Double]] = v1.p1
    var v4: s0 = v1
    v4.p0 = v7
    var v5: [[Double]] = v3
    let v8: [Double] = v7[1]
    let v13: [[Double]] = v1.p0
    let v12: [Double] = v3[0]
    var v18: [[Double]] = v5
    var v22: [[Double]] = v5
    v5[0] = v8
    v4.p1 = v22
    v4.p0 = v7
    v4.p1 = v5
    var v21: s0 = v1
    v21.p1 = v5
    var v10: [[Double]] = v3
    let v28: [Double] = v7[1]
    v4.p0 = v13
    let v14: [Double] = v7[0]
    v18[0] = v14
    v21.p1 = v5
    v21.p0 = v13
    v18[0] = v28
    var v46: [[Double]] = v13
    let v19: Double = v12[0]
    let v23: [Double] = v46[1]
    var v53: s0 = v4
    let v24: [[Double]] = v1.p1
    v4.p0 = v13
    var v31: s0 = v21
    let v35: [[Double]] = v53.p0
    v10[0] = v23
    v10 = v22
    v53.p0 = v46
    v4.p1 = v10
    v21.p0 = v46
    v22[0] = v11
    v9 = v8
    let v48: [[Double]] = v21.p0
    let v52: [[Double]] = v31.p0
    v5[0] = v8
    let v56: [[Double]] = v31.p1
    let v62: [[Double]] = v21.p1
    let v30: [[Double]] = v21.p1
    let v72: [Double] = v52[0]
    v21.p0 = v52
    var v32: [[Double]] = v7
    let v98: [[Double]] = v1.p0
    v21.p0 = v2
    v21.p0 = v46
    v31.p1 = v30
    let v96: [[[Double]]] = [v2, v46, v32]
    v46 = v32
    var v61: Double = v19
    var v99: [[Double]] = v24
    v10[0] = v9
    let v80: [[Double]] = v1.p0
    let v65: [[Double]] = v1.p1
    v4.p1 = v5
    let v63: [[Double]] = v96[0]
    v4.p0 = v35
    v21.p1 = v18
    v21.p1 = v65
    let v55: s1 = s1(p0: v31, p1: v53)
    let v148: [[Double]] = v31.p1
    v21.p1 = v56
    v9[0] = v61
    v21.p0 = v98
    let v178: [Double] = v5[0]
    v5[0] = v178
    let v201: [Double] = v46[1]
    v46[1] = v6
    v21.p0 = v2
    var v79: [[Double]] = v32
    v99[0] = v201
    v9 = v28
    v99[0] = v8
    v53.p1 = v62
    v32[0] = v72
    v53.p0 = v63
    let v295: s0 = v55.p1
    v21.p0 = v48
    var v296: s0 = v295
    v21.p0 = v79
    v4.p1 = v10
    v296.p1 = v148
    v31.p0 = v80
    v4.p1 = v99
    v53.p0 = v35
    v53.p1 = v10
    return v296
  }
  func f51(_ v0: s1) -> s1 {
    let v1: s1 = f66(v0)
    let v8: s1 = f66(v1)
    var v7: s1 = v8
    var v9: s1 = v7
    return v9
  }
  func f44(_ v0: Double, _ v1: [Double]) -> [Double] {
    let v2: Double = v1[0]
    let v5: Double = v1[0]
    let v6: Double = v1[0]
    let v4: Double = v1[0]
    var v8: [Double] = v1
    let v7: Double = v8[0]
    v8[0] = v5
    v8[0] = v0
    var v10: [Double] = v8
    v10[0] = v0
    let v9: Double = v1[0]
    let v22: [Double] = [v2]
    v8[0] = v9
    let v12: Double = v8[0]
    v8[0] = v4
    let v14: Double = v22[0]
    var v16: Double = v0
    v10[0] = v4
    var v28: Double = v5
    v10[0] = v6
    let v25: Double = v22[0]
    var v17: [Double] = v10
    let v42: Double = v8[0]
    var v43: [Double] = v17
    let v30: Double = v22[0]
    v8 = v43
    var v40: [Double] = v10
    var v15: Double = v28
    let v27: Double = v43[0]
    var v24: [Double] = v40
    let v19: [Double] = [v9, v2, v14, v25, v14, v16, v7]
    v10[0] = v27
    v17[0] = v15
    var v35: [Double] = v19
    let v33: Double = v35[1]
    v17 = v40
    v40 = v24
    v40 = v17
    let v41: Double = v35[2]
    var v26: [Double] = v1
    v26 = v40
    v10[0] = v33
    v43[0] = v12
    var v39: [Double] = v19
    v40[0] = v16
    v26[0] = v42
    v26[0] = v5
    v43[0] = v42
    let v45: Double = v39[2]
    v40[0] = v41
    v17[0] = v45
    let v55: Double = v19[5]
    let v46: Double = v19[4]
    v26[0] = v55
    v16 = v30
    v24[0] = v46
    v43[0] = v27
    return v26
  }
  func f29(_ v0: [s1]) -> [s1] {
    return v0
  }
  func f21(_ v0: s1) -> s1 {
    let v7: s0 = v0.p1
    let v3: s1 = f51(v0)
    var v6: s0 = v7
    let v4: s1 = f66(v0)
    let v9: s1 = s1(p0: v6, p1: v6)
    let v5: [s1] = [v3]
    var v8: s1 = v9
    let v2: [[Double]] = v7.p1
    let v13: s1 = v5[0]
    var v16: [[Double]] = v2
    let v14: s1 = f66(v4)
    let v11: s1 = f66(v13)
    let v35: [s1] = f29(v5)
    v6.p1 = v2
    let v10: [[Double]] = v6.p0
    var v12: s0 = v6
    let v19: s1 = v35[0]
    var v24: s0 = v6
    let v22: [Double] = v10[1]
    var v17: [[Double]] = v16
    let v68: [[Double]] = v6.p0
    let v81: Double = v22[0]
    v16[0] = v22
    let v25: [Double] = f44(v81, v22)
    v24.p0 = v68
    let v47: s0 = v14.p0
    v17[0] = v22
    let v36: s0 = f56(v81, v24)
    v6.p1 = v2
    let v44: s0 = f56(v81, v47)
    let v85: [Double] = v68[0]
    v17[0] = v85
    let v52: [[Double]] = v36.p1
    let v218: [Double] = v52[0]
    v8.p1 = v12
    v17[0] = v25
    let v144: s0 = v4.p0
    v8.p1 = v144
    v8 = v11
    let v97: [Double] = v17[0]
    v8.p1 = v47
    v16[0] = v97
    var v171: s1 = v8
    v171.p0 = v44
    v12.p1 = v16
    let v186: s0 = v19.p1
    v16[0] = v218
    v171.p1 = v186
    return v171
  }
  func f14(_ v0: s1) -> s1 {
    let v7: [s1] = [v0, v0]
    let v2: s0 = v0.p1
    let v8: s1 = v7[1]
    let v6: s1 = v7[1]
    var v4: s0 = v2
    let v3: s1 = f21(v8)
    let v11: s1 = s1(p0: v2, p1: v4)
    let v15: [[Double]] = v2.p1
    var v25: [[Double]] = v15
    let v39: [[Double]] = v4.p0
    let v21: s1 = f21(v11)
    let v34: [Double] = v25[0]
    var v32: [[Double]] = v39
    v32[1] = v34
    var v17: [Double] = v34
    v32[1] = v17
    var v72: s1 = v11
    let v31: [s1] = [v3, v72, v8, v21]
    let v127: s1 = v31[3]
    v4.p0 = v32
    v25[0] = v17
    let v82: s0 = v6.p0
    v72.p0 = v82
    let v493: s1 = f51(v127)
    return v493
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v7: s1 = f14(v0)
    let v6: s1 = f21(v7)
    let v2: s0 = v6.p1
    let v8: [[Double]] = v2.p0
    let v42: [Double] = v8[1]
    var v103: [Double] = v42
    let v73: Double = v103[0]
    return v73
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
