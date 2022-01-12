  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f50(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v1: [Double] = v6[0]
    let v5: [[Double]] = v0.p0
    var v2: s0 = v0
    var v7: [Double] = v1
    var v3: [Double] = v7
    let v11: [[Double]] = v2.p1
    let v4: [s0] = [v0, v2, v0, v2]
    var v10: [[Double]] = v5
    v7 = v1
    var v8: [s0] = v4
    var v12: [[Double]] = v11
    let v14: [[Double]] = v0.p1
    v8[1] = v2
    let v21: [Double] = v12[2]
    v8[0] = v0
    v8 = v4
    let v24: [Double] = v12[0]
    var v15: [s0] = v8
    var v31: [[Double]] = v14
    v2.p1 = v12
    v31[1] = v7
    let v17: s0 = v15[1]
    var v18: s0 = v17
    v2.p0 = v10
    let v26: [[Double]] = v18.p1
    v12[2] = v21
    let v45: s0 = s0(p0: v5, p1: v31)
    v31[0] = v7
    v18.p1 = v31
    let v59: [[Double]] = v17.p0
    v31[1] = v24
    let v69: [[Double]] = v17.p1
    var v42: [[Double]] = v59
    v18.p1 = v69
    v15[1] = v45
    let v33: [Double] = v26[0]
    v2.p0 = v42
    v31[1] = v3
    let v36: [[Double]] = v45.p0
    let v43: [[Double]] = v17.p1
    v2.p1 = v43
    var v46: [Double] = v7
    let v67: Double = v46[0]
    v12[0] = v33
    var v98: Double = v67
    v2.p1 = v11
    v3[0] = v98
    v2.p0 = v36
    return v18
  }
  func f32(_ v0: s0) -> s0 {
    let v8: s0 = f50(v0)
    let v3: [[Double]] = v0.p0
    let v7: s0 = f50(v0)
    let v5: [[Double]] = v8.p0
    let v15: [[Double]] = v8.p1
    var v6: s0 = v8
    let v2: [[Double]] = v6.p1
    let v11: s0 = s0(p0: v3, p1: v2)
    let v19: [[Double]] = v11.p0
    v6 = v11
    let v9: s0 = f50(v8)
    let v20: s0 = f50(v7)
    let v24: [[Double]] = v8.p0
    var v12: s0 = v7
    var v25: s0 = v0
    let v18: s0 = f50(v0)
    var v10: [[Double]] = v15
    let v36: s0 = f50(v0)
    let v23: [Double] = v3[1]
    let v17: [[Double]] = v25.p0
    let v14: s0 = f50(v0)
    let v22: s0 = f50(v7)
    var v29: [[Double]] = v17
    v10[2] = v23
    v10[1] = v23
    v29[0] = v23
    v6.p1 = v2
    var v43: [Double] = v23
    let v87: s0 = f50(v20)
    v6.p1 = v15
    v25.p0 = v24
    v25.p0 = v5
    let v57: [[Double]] = v22.p1
    var v34: s0 = v12
    v6 = v14
    v29[0] = v23
    v6.p0 = v29
    let v64: s0 = f50(v9)
    var v35: [Double] = v43
    let v30: s0 = f50(v87)
    let v82: [[Double]] = v36.p1
    var v56: s0 = v36
    let v98: [[Double]] = v14.p0
    v12.p0 = v3
    let v83: [[Double]] = v7.p1
    let v69: [[Double]] = v56.p1
    let v71: [[Double]] = v12.p0
    v12.p1 = v82
    let v54: [[Double]] = v6.p0
    v6.p1 = v10
    let v74: s0 = f50(v30)
    v29[1] = v35
    let v99: s0 = f50(v74)
    let v283: [Double] = v98[1]
    let v79: s0 = f50(v99)
    v6.p1 = v57
    let v61: [[Double]] = v64.p1
    v12.p1 = v69
    v34.p1 = v83
    let v140: s0 = f50(v99)
    var v150: [[Double]] = v82
    let v182: [[Double]] = v140.p0
    v56.p0 = v71
    v34.p0 = v98
    v56.p1 = v150
    v34.p1 = v15
    let v218: [[Double]] = v79.p0
    v25.p0 = v54
    v34.p1 = v61
    v34.p0 = v19
    v56.p0 = v218
    v29[1] = v283
    v25.p1 = v61
    v56 = v18
    v34.p0 = v182
    return v34
  }
  @inline(never)
  func f0(_ v0: Double, _ v1: [s0]) -> Double {
    var v6: [s0] = v1
    var v4: [s0] = v6
    let v9: s0 = v1[1]
    var v12: [s0] = v4
    let v14: s0 = v12[0]
    let v3: s0 = f50(v9)
    let v10: [[Double]] = v14.p0
    v4[1] = v3
    var v11: [s0] = v6
    let v24: [[[Double]]] = [v10, v10, v10, v10, v10, v10]
    let v34: [[Double]] = v24[3]
    let v23: s0 = v4[0]
    let v22: s0 = f32(v23)
    v6[1] = v22
    var v136: [[Double]] = v34
    let v49: [Double] = v136[1]
    let v307: Double = v49[0]
    v6 = v11
    var v359: Double = v307
    return v359
  }
  func benchmark() {
    let v0: Double = 0.0
    let v1: [s0] = [s0(p0: [[1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0], [9.0], [10.0]])]
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = [StructValue(Name(str='s0', ty=None), [[[1.0], [2.0]], [[3.0], [4.0], [5.0]]]), StructValue(Name(str='s0', ty=None), [[[6.0], [7.0]], [[8.0], [9.0], [10.0]]])]
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
