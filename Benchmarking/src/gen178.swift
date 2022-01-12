  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s4 {
    var p0: [[s0]]
    var p1: [s0]
  }
  func f11(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v7: [[Double]] = v0.p0
    let v8: [[Double]] = v0.p0
    let v5: [[[Double]]] = [v6, v8, v7, v7, v8, v7, v7]
    var v1: [[[Double]]] = v5
    var v11: [[[Double]]] = v5
    let v12: [[Double]] = v11[3]
    let v25: [[Double]] = v0.p1
    let v17: [[Double]] = v0.p0
    var v32: s0 = v0
    v32.p1 = v17
    var v26: [[[Double]]] = v5
    v11[6] = v25
    var v72: [[[Double]]] = v1
    v72[5] = v8
    v32.p1 = v8
    v32.p1 = v7
    let v24: [[Double]] = v32.p1
    let v29: [[Double]] = v32.p1
    v32.p1 = v17
    let v27: [[Double]] = v0.p0
    let v34: s0 = s0(p0: v29, p1: v25)
    v32.p1 = v12
    let v68: s0 = s0(p0: v29, p1: v27)
    v32.p1 = v24
    v1[1] = v17
    v1 = v26
    let v36: [s0] = [v68, v34, v32, v32]
    let v51: [[Double]] = v0.p1
    v1[4] = v8
    v32.p1 = v51
    let v95: [[Double]] = v26[1]
    v26[3] = v29
    v1[0] = v25
    let v54: s0 = v36[1]
    v11 = v72
    v32.p0 = v95
    return v54
  }
  func f8(_ v0: s4) -> s4 {
    var v6: s4 = v0
    let v7: [[s0]] = v0.p0
    v6 = v0
    var v5: [[s0]] = v7
    v6 = v0
    let v4: [s0] = v0.p1
    v6.p0 = v5
    let v2: [[s0]] = v0.p0
    let v1: [s0] = v0.p1
    v6.p1 = v4
    v5[0] = v1
    let v9: [[s0]] = v0.p0
    v6.p1 = v1
    var v8: s4 = v6
    let v13: s0 = v1[0]
    let v10: s0 = v4[0]
    var v11: [s0] = v4
    let v22: s0 = f11(v10)
    let v14: s0 = f11(v22)
    var v24: s4 = v0
    v6.p1 = v1
    let v19: [[s0]] = v0.p0
    var v29: [s0] = v1
    var v17: [[s0]] = v2
    v17[1] = v11
    let v25: [[s0]] = v0.p0
    let v31: [[s0]] = v24.p0
    let v42: s0 = f11(v13)
    v6.p0 = v5
    let v18: s0 = f11(v42)
    v29[0] = v14
    v24.p1 = v4
    let v32: [s0] = v9[0]
    let v40: [s0] = v19[0]
    let v34: s0 = f11(v13)
    let v38: [s0] = v17[1]
    v24.p1 = v38
    v11[0] = v18
    let v45: s2 = s2(p0: v32, p1: v11)
    v24.p0 = v5
    let v111: [s0] = v19[1]
    v24.p0 = v19
    var v92: s4 = v8
    v6.p0 = v2
    let v54: [s4] = [v6]
    v24.p1 = v111
    v92.p1 = v4
    v6.p1 = v4
    v8.p1 = v38
    v92.p0 = v25
    var v112: [s4] = v54
    v112[0] = v24
    v24.p1 = v40
    v11[0] = v34
    let v129: s4 = v112[0]
    v92.p0 = v31
    var v86: s2 = v45
    let v293: [s0] = v2[1]
    v8.p1 = v29
    let v176: [s0] = v86.p0
    v17[0] = v293
    v5[1] = v29
    let v189: [s0] = v92.p1
    v17[1] = v176
    v6.p1 = v189
    return v129
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v4: s4 = v0[1]
    let v14: s4 = f8(v4)
    let v27: [s0] = v14.p1
    let v30: s0 = v27[0]
    let v29: [[Double]] = v30.p1
    let v20: s0 = s0(p0: v29, p1: v29)
    let v28: s0 = f11(v20)
    let v75: [[Double]] = v28.p1
    let v278: [Double] = v75[0]
    let v139: Double = v278[0]
    return v139
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [[s0(p0: [[0.0]], p1: [[1.0]])], [s0(p0: [[2.0]], p1: [[3.0]])]], p1: [s0(p0: [[4.0]], p1: [[5.0]])]), s4(p0: [[s0(p0: [[6.0]], p1: [[7.0]])], [s0(p0: [[8.0]], p1: [[9.0]])]], p1: [s0(p0: [[10.0]], p1: [[11.0]])])]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
