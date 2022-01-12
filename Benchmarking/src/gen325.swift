  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f18(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p1
    let v5: [[Double]] = v0.p0
    let v15: [[Double]] = v0.p1
    let v18: [[Double]] = v0.p1
    let v23: [[Double]] = v0.p1
    var v26: s0 = v0
    v26.p1 = v23
    let v29: [[Double]] = v0.p1
    let v36: [[Double]] = v0.p0
    let v49: [[Double]] = v0.p0
    v26.p1 = v5
    var v41: s0 = v26
    var v22: [[Double]] = v15
    v41.p0 = v18
    let v40: [Double] = v7[0]
    v41.p0 = v23
    let v52: [[Double]] = v41.p1
    var v38: s0 = v0
    v41.p1 = v36
    v26.p1 = v22
    let v48: [[Double]] = v0.p0
    let v63: [s0] = [v38, v41, v26, v0, v38, v26, v41]
    v26.p1 = v48
    let v119: [[Double]] = v41.p0
    let v66: s0 = v63[1]
    v26.p0 = v119
    var v126: [[Double]] = v52
    v26.p0 = v29
    v38.p0 = v5
    v38.p0 = v126
    v22[1] = v40
    v41.p0 = v49
    return v66
  }
  func f14(_ v0: s0, _ v1: s0) -> s0 {
    var v7: s0 = v0
    let v2: s0 = f18(v7)
    let v13: s0 = f18(v7)
    var v5: s0 = v2
    let v6: [[Double]] = v1.p0
    v5.p1 = v6
    v5.p1 = v6
    v5.p0 = v6
    let v36: [[Double]] = v13.p1
    v5.p1 = v36
    let v40: s0 = f18(v5)
    return v40
  }
  func f5(_ v0: [s0], _ v1: s0) -> s0 {
    let v5: [[Double]] = v1.p0
    let v8: [[[Double]]] = [v5, v5, v5, v5]
    let v4: s0 = v0[0]
    let v7: s0 = f18(v1)
    let v2: [[Double]] = v4.p0
    let v3: [[Double]] = v8[3]
    let v11: s0 = f14(v1, v4)
    let v10: s0 = s0(p0: v3, p1: v2)
    var v20: [s0] = v0
    v20[1] = v1
    let v38: s0 = v20[0]
    v20[1] = v7
    let v73: s0 = f14(v10, v38)
    let v92: s0 = f18(v73)
    let v45: s0 = f14(v11, v92)
    return v45
  }
  func f3(_ v0: s0) -> s0 {
    let v5: s0 = f18(v0)
    let v2: s0 = f14(v0, v5)
    var v6: s0 = v5
    var v4: s0 = v6
    let v8: [s0] = [v2, v5]
    let v10: s0 = v8[0]
    var v12: s0 = v10
    let v3: s0 = v8[0]
    let v9: [s0] = [v6, v6, v2, v3]
    let v7: s0 = v8[0]
    var v13: s0 = v10
    var v21: [s0] = v9
    var v14: [s0] = v8
    var v27: [s0] = v8
    let v22: [[Double]] = v0.p0
    let v11: s0 = v27[0]
    let v18: s0 = f14(v6, v6)
    let v20: s0 = f5(v27, v11)
    let v19: s0 = f5(v14, v18)
    let v17: [[Double]] = v4.p1
    v27[1] = v12
    let v26: [[Double]] = v0.p0
    let v16: s0 = f14(v4, v5)
    v27[1] = v16
    let v50: [[Double]] = v7.p0
    let v71: s0 = v21[2]
    v14[1] = v16
    let v46: s0 = f5(v14, v20)
    v27[1] = v5
    v4.p1 = v26
    let v30: s0 = f14(v12, v71)
    v21[3] = v4
    let v54: s0 = f14(v10, v20)
    let v58: s0 = f18(v30)
    v14[0] = v2
    let v51: [[Double]] = v58.p1
    v4.p0 = v22
    v4.p0 = v50
    v6.p1 = v51
    let v44: [[Double]] = v46.p1
    v12.p1 = v51
    v13.p0 = v17
    let v105: [[Double]] = v19.p0
    v6 = v18
    var v92: [[Double]] = v44
    v12.p1 = v92
    v21[3] = v13
    let v108: s0 = f14(v54, v30)
    v6.p1 = v105
    return v108
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v5: s0 = f14(v1, v0)
    let v7: [[Double]] = v5.p0
    let v4: [[Double]] = v1.p0
    let v15: s0 = f3(v5)
    var v12: s0 = v1
    let v14: [[Double]] = v1.p0
    let v19: [[Double]] = v15.p1
    let v18: s0 = f3(v12)
    let v23: [[Double]] = v18.p0
    let v17: [Double] = v23[0]
    v12.p0 = v14
    v12.p1 = v19
    v12.p0 = v7
    let v91: Double = v17[0]
    v12.p0 = v4
    return v91
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])
    let v1: s0 = s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])
    let v2: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
