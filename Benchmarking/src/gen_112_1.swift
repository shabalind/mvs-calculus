  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  func f13(_ v0: Double) -> Double {
    let v6: Double = v0 * v0
    var v4: Double = v6
    let v3: [Double] = [v6, v0, v0, v0, v4]
    let v18: Double = v3[1]
    return v18
  }
  func f9(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v4: [[Double]] = v0.p0
    let v10: [[Double]] = v0.p1
    let v3: [[Double]] = v0.p1
    let v5: [[Double]] = v0.p2
    let v2: [[[Double]]] = [v3, v10, v3]
    let v1: [Double] = v4[1]
    let v9: [[Double]] = v0.p2
    var v14: [[Double]] = v6
    let v12: [[Double]] = v0.p1
    v14[0] = v1
    let v18: s0 = s0(p0: v14, p1: v12, p2: v5)
    let v15: [[Double]] = v2[0]
    let v21: [[Double]] = v18.p0
    let v16: [[Double]] = v18.p0
    let v24: [Double] = v21[2]
    let v30: [Double] = v16[0]
    v14[1] = v24
    v14[0] = v30
    var v50: [Double] = v1
    var v17: [[Double]] = v9
    var v62: [[Double]] = v16
    let v43: [[Double]] = v18.p0
    v62[0] = v50
    let v20: [[Double]] = v0.p2
    var v31: s0 = v0
    v17[1] = v1
    let v64: [[Double]] = v0.p2
    v31.p0 = v62
    v17[1] = v1
    v14[0] = v24
    let v44: [Double] = v20[0]
    v14[1] = v1
    v14[1] = v24
    var v60: [[Double]] = v12
    v14[1] = v24
    v31.p2 = v17
    var v135: [[Double]] = v15
    v17[1] = v1
    v31.p0 = v62
    v31.p0 = v4
    let v80: [[Double]] = v18.p2
    v31.p1 = v135
    v31.p0 = v16
    var v68: s0 = v31
    let v98: [[Double]] = v31.p0
    var v86: s0 = v18
    let v79: [[Double]] = v86.p0
    let v77: [[Double]] = v68.p0
    v86.p1 = v10
    let v142: [[Double]] = v18.p2
    var v69: s0 = v31
    v14[2] = v44
    v68.p2 = v80
    v69.p2 = v17
    v68.p2 = v142
    v31.p0 = v98
    v86.p1 = v60
    v86.p0 = v21
    v31.p0 = v43
    v69.p0 = v77
    v69.p2 = v64
    v69.p0 = v79
    return v69
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: [[Double]] = v0.p0
    let v4: [[Double]] = v0.p1
    let v2: [Double] = v7[2]
    let v11: [Double] = v4[0]
    let v13: s0 = f9(v0)
    let v5: [Double] = v7[0]
    let v15: [[Double]] = v13.p0
    var v8: [[Double]] = v15
    var v25: s0 = v13
    let v18: [Double] = v8[0]
    v8[2] = v11
    var v19: [[Double]] = v4
    var v26: s0 = v25
    let v12: Double = v18[0]
    v26.p1 = v4
    let v28: Double = f13(v12)
    v19[0] = v2
    let v40: s0 = f9(v13)
    v25.p0 = v15
    let v24: [[Double]] = v25.p1
    let v29: Double = f13(v28)
    v26.p1 = v24
    let v45: [Double] = v19[0]
    var v30: [Double] = v5
    var v59: [[Double]] = v19
    let v33: [[Double]] = v25.p2
    v25.p2 = v33
    let v43: s0 = s0(p0: v7, p1: v59, p2: v33)
    let v16: [[Double]] = v40.p2
    v25.p0 = v7
    let v38: [[Double]] = v25.p0
    v19[0] = v45
    let v42: [Double] = v33[0]
    v59[0] = v30
    var v36: [[Double]] = v16
    let v46: Double = v45[0]
    let v60: [Double] = v8[1]
    let v53: [[Double]] = v43.p2
    v25.p2 = v33
    v25.p0 = v8
    v36 = v53
    let v75: Double = f13(v46)
    var v85: [[Double]] = v33
    let v118: Double = v60[0]
    v59[0] = v11
    v26.p2 = v36
    v26.p0 = v38
    v30[0] = v118
    let v69: [[Double]] = v26.p1
    v19 = v69
    let v145: Double = f13(v29)
    let v97: Double = v75 * v118
    var v127: [[Double]] = v36
    var v152: [[Double]] = v127
    v25.p2 = v85
    v26.p2 = v152
    v36[1] = v42
    v30[0] = v145
    return v97
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0]])
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
