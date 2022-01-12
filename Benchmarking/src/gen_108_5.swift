  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f24(_ v0: s0, _ v1: Double) -> Double {
    var v7: s0 = v0
    let v2: [[Double]] = v7.p1
    let v9: [[Double]] = v7.p0
    v7.p0 = v9
    let v22: [Double] = v2[0]
    let v12: Double = v22[0]
    let v11: [[Double]] = v0.p1
    let v29: [Double] = v2[0]
    v7.p0 = v11
    var v21: Double = v12
    let v41: Double = v29[0]
    v21 = v41
    v7.p1 = v11
    return v21
  }
  func f22(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    var v5: [[Double]] = v2
    let v6: s0 = s0(p0: v2, p1: v2)
    var v7: s0 = v6
    let v4: [Double] = v2[0]
    let v3: [[Double]] = v6.p1
    let v8: Double = v4[0]
    let v11: [[Double]] = v0.p1
    let v17: [[[Double]]] = [v11, v11, v2, v3]
    let v12: [[Double]] = v0.p1
    let v21: [Double] = v11[0]
    let v15: Double = f24(v6, v8)
    v7.p1 = v5
    v7.p1 = v12
    var v26: s0 = v6
    var v18: [Double] = v21
    let v10: Double = f24(v6, v15)
    var v20: [[Double]] = v2
    var v14: [[[Double]]] = v17
    var v40: s0 = v7
    v7.p0 = v11
    var v27: [[Double]] = v20
    v7.p1 = v11
    var v25: [[Double]] = v11
    v40.p1 = v5
    let v22: [[Double]] = v17[2]
    let v33: [[Double]] = v26.p0
    let v61: Double = f24(v6, v10)
    v14[1] = v5
    v27[0] = v4
    let v28: Double = f24(v40, v61)
    let v32: [[Double]] = v7.p0
    let v42: [Double] = v32[0]
    v14[0] = v32
    v18[0] = v28
    let v69: [[Double]] = v17[3]
    v26.p1 = v20
    v40.p0 = v3
    v27 = v12
    v7.p1 = v33
    v27[0] = v21
    v27[0] = v42
    let v114: [[Double]] = v26.p0
    let v54: [[Double]] = v14[3]
    v25[0] = v4
    v20[0] = v4
    v5[0] = v42
    let v51: [Double] = v22[0]
    v27[0] = v51
    let v135: [Double] = v54[0]
    var v132: [Double] = v135
    v5[0] = v18
    v20[0] = v18
    let v56: [[Double]] = v6.p0
    let v82: [[Double]] = v26.p1
    v14[2] = v56
    v40.p0 = v20
    v5[0] = v132
    v14[2] = v11
    v7.p1 = v25
    v7.p0 = v27
    let v190: [Double] = v82[0]
    v5[0] = v51
    v7.p1 = v5
    v5[0] = v190
    v14[0] = v114
    v5 = v69
    return v40
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: [s0] = v0.p0
    let v7: s0 = v4[1]
    let v17: s0 = f22(v7)
    let v24: [[Double]] = v7.p0
    let v30: [Double] = v24[0]
    let v81: Double = v30[0]
    let v51: Double = f24(v17, v81)
    return v51
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0]]))
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
