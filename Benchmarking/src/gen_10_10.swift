  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  func f64(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p1
    let v7: [[Double]] = v0.p1
    let v4: [Double] = v7[0]
    let v5: [[Double]] = v0.p1
    var v8: [Double] = v4
    var v6: s0 = v0
    let v1: [Double] = v0.p0
    v6 = v0
    let v9: [Double] = v6.p0
    let v2: [Double] = v6.p0
    var v10: [[Double]] = v5
    let v12: [Double] = v10[0]
    v10[0] = v8
    let v11: [[Double]] = v6.p1
    let v17: [Double] = v0.p0
    let v15: [Double] = v11[0]
    var v24: [Double] = v9
    let v28: Double = v1[1]
    let v36: [[Double]] = [v17, v9, v9]
    var v19: s0 = v0
    v10[0] = v4
    let v27: [Double] = v36[1]
    v6.p1 = v3
    var v29: [Double] = v12
    var v26: [Double] = v24
    var v100: s0 = v6
    let v34: [Double] = v6.p0
    var v32: Double = v28
    var v73: s0 = v100
    var v43: [Double] = v8
    v73.p0 = v2
    let v46: [Double] = v0.p0
    var v30: [Double] = v15
    let v47: Double = v28 - v32
    v10 = v7
    v10[0] = v43
    let v38: [Double] = v36[2]
    v19.p1 = v11
    v26[0] = v32
    var v58: Double = v47
    v8[0] = v28
    v8[0] = v58
    let v35: [[Double]] = v19.p1
    let v61: Double = v46[0]
    v30 = v29
    v24[0] = v28
    let v37: [Double] = v6.p0
    let v91: [[Double]] = v19.p1
    v73.p0 = v26
    let v57: [[Double]] = v6.p1
    var v99: Double = v61
    v73.p1 = v91
    v8[0] = v99
    v10[0] = v30
    v43[0] = v61
    v6.p1 = v57
    let v83: [[Double]] = v73.p1
    let v84: Double = v12[0]
    let v60: [[Double]] = v6.p1
    let v67: [[Double]] = v0.p1
    v6.p1 = v60
    v19.p0 = v38
    let v97: Double = v34[1]
    v24[1] = v97
    v19.p0 = v27
    v100.p1 = v83
    v73.p1 = v67
    v19.p1 = v83
    v24[0] = v84
    v73.p0 = v37
    v100.p1 = v35
    return v73
  }
  func f54(_ v0: s0, _ v1: s0) -> s0 {
    let v4: s0 = f64(v1)
    let v3: [Double] = v1.p0
    let v5: s0 = f64(v0)
    let v8: Double = v3[1]
    let v19: [Double] = v4.p0
    var v31: [Double] = v19
    var v25: s0 = v5
    v31[0] = v8
    v25.p0 = v31
    let v38: s0 = f64(v25)
    return v38
  }
  func f29(_ v0: [Double]) -> [Double] {
    let v2: Double = v0[0]
    var v3: Double = v2
    let v9: Double = v0[0]
    let v7: Double = v2 * v3
    var v5: Double = v7
    let v1: Double = v0[0]
    var v14: [Double] = v0
    let v11: Double = v0[0]
    let v15: Double = v0[0]
    v14[0] = v15
    let v6: Double = v0[0]
    v14[0] = v6
    let v13: Double = v0[0]
    var v12: Double = v5
    let v10: Double = v0[0]
    var v25: [Double] = v14
    let v17: [Double] = [v13, v1, v9]
    var v51: [Double] = v0
    v12 = v10
    let v23: Double = v0[0]
    let v16: Double = v0[0]
    let v19: [[Double]] = [v51, v0]
    var v24: [[Double]] = v19
    let v21: Double = v17[0]
    v24 = v19
    let v28: Double = v51[0]
    v25[0] = v23
    v51[0] = v21
    let v70: [Double] = v24[1]
    let v30: Double = v28 + v15
    var v45: [Double] = v70
    v45[0] = v30
    var v44: [Double] = v0
    v24[0] = v45
    var v27: Double = v11
    let v31: [[Double]] = [v44, v25, v70]
    v24[1] = v51
    v45 = v70
    v25[0] = v27
    v25[0] = v16
    v24[0] = v0
    var v47: Double = v12
    let v66: [Double] = v31[0]
    var v38: [Double] = v45
    var v73: [Double] = v66
    v73[0] = v47
    let v80: Double = v38[0]
    v12 = v6
    v5 = v80
    return v73
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v6: s0 = f54(v0, v0)
    let v4: [[Double]] = v6.p1
    let v8: [Double] = v4[0]
    var v10: s0 = v6
    let v7: [[Double]] = [v8, v8]
    let v11: Double = v8[0]
    let v15: [Double] = f29(v8)
    let v9: [Double] = v7[1]
    let v17: [Double] = f29(v15)
    let v42: Double = v17[0]
    let v14: Double = v9[0]
    var v23: s0 = v10
    var v27: Double = v1
    let v28: [Double] = v23.p0
    v23.p0 = v28
    let v37: Double = v9[0]
    let v38: Double = v14 / v11
    var v19: [Double] = v28
    let v50: Double = v19[0]
    v23.p1 = v4
    let v25: [[Double]] = v6.p1
    v19[1] = v27
    let v41: [Double] = [v38, v37, v50, v1, v14, v14, v11]
    let v51: Double = v41[0]
    v27 = v42
    v23.p1 = v4
    v23.p1 = v25
    return v51
  }
  func benchmark() {
    let v0: s0 = s0(p0: [0.0, 1.0], p1: [[2.0]])
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
