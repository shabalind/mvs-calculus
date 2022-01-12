  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f2(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v6: [[Double]] = v5.p1
    v5.p1 = v6
    v5.p1 = v6
    v5.p1 = v6
    let v10: [[Double]] = v0.p1
    var v9: [[Double]] = v10
    v5.p1 = v9
    return v5
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: [[Double]] = v0.p1
    var v7: Double = v1
    var v6: s0 = v0
    var v5: Double = v7
    v6.p1 = v3
    let v4: s0 = f2(v6)
    let v8: s0 = f2(v0)
    let v12: [Double] = v3[1]
    let v10: [[Double]] = v4.p0
    let v15: s0 = f2(v6)
    let v13: s0 = f2(v8)
    let v17: [[Double]] = v4.p0
    let v9: s0 = f2(v13)
    var v16: [Double] = v12
    let v24: [Double] = v17[0]
    let v19: s0 = f2(v4)
    v5 = v7
    v6.p0 = v10
    let v18: s0 = f2(v8)
    var v21: [[Double]] = v3
    v6.p0 = v17
    v6.p0 = v17
    let v23: [[Double]] = v8.p1
    let v36: Double = v24[0]
    v21[2] = v16
    let v46: Double = v24[0]
    let v44: s0 = f2(v15)
    v21[0] = v16
    let v31: [Double] = v10[0]
    v21[2] = v24
    let v47: [Double] = v17[0]
    var v35: [Double] = v16
    let v20: [[Double]] = v4.p1
    v21[1] = v35
    let v42: [[Double]] = v13.p1
    var v25: [[Double]] = v3
    v6.p1 = v25
    let v41: [[[Double]]] = [v3, v23, v20, v20, v3, v3]
    let v26: [[Double]] = v19.p1
    v6.p0 = v10
    let v50: [Double] = v25[0]
    v6 = v44
    let v56: [[Double]] = v9.p0
    var v62: [Double] = v12
    v25[1] = v62
    let v105: [[Double]] = v15.p0
    let v58: [[[Double]]] = [v42]
    let v54: [[Double]] = v41[5]
    v16[0] = v7
    v6.p0 = v56
    v35[0] = v7
    v62[0] = v1
    let v197: s0 = f2(v18)
    let v33: [[Double]] = v58[0]
    v21[2] = v50
    v21 = v54
    let v149: [Double] = v23[1]
    var v71: [[Double]] = v25
    let v83: s0 = s0(p0: v10, p1: v54)
    let v69: s0 = f2(v18)
    let v185: [[Double]] = v83.p0
    v6 = v69
    v21[0] = v149
    let v161: [[Double]] = v197.p0
    let v78: [Double] = v26[1]
    var v82: Double = v1
    v62[0] = v46
    v6.p0 = v161
    let v311: [Double] = [v82, v1, v36, v5, v46, v36, v36]
    let v183: s0 = s0(p0: v185, p1: v21)
    v16[0] = v36
    v6.p0 = v105
    v25[0] = v78
    let v72: [[Double]] = v183.p1
    v25[2] = v47
    let v178: Double = v311[5]
    v6.p1 = v72
    v6.p0 = v185
    v71[0] = v31
    v6.p1 = v33
    v6.p1 = v71
    v6.p0 = v161
    return v178
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
