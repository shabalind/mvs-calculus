  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f13(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v3: [[Double]] = v0.p0
    let v5: [Double] = v3[0]
    let v9: [[Double]] = v0.p0
    let v7: [[Double]] = v0.p1
    var v8: s0 = v0
    let v4: Double = v5[0]
    var v1: s0 = v8
    let v2: [Double] = v3[1]
    let v11: [Double] = v3[1]
    var v12: [Double] = v2
    v12[0] = v4
    v12[0] = v4
    let v14: Double = v5[0]
    v8 = v1
    v12 = v2
    var v19: [[Double]] = v6
    let v30: [[Double]] = v0.p1
    var v20: s0 = v8
    v20.p1 = v19
    v8.p1 = v30
    v19[1] = v11
    var v28: [[Double]] = v3
    v1.p0 = v19
    var v50: [Double] = v12
    v1 = v8
    let v29: [[Double]] = v20.p1
    var v23: s0 = v8
    v19 = v29
    v23.p1 = v7
    v8.p0 = v19
    let v48: [Double] = v19[1]
    var v36: [Double] = v50
    let v38: [[Double]] = v20.p1
    var v21: [[Double]] = v7
    var v26: s0 = v0
    v1.p0 = v30
    let v58: [[Double]] = v23.p0
    v12[0] = v14
    v20.p0 = v21
    let v35: Double = v36[0]
    let v66: [[Double]] = v26.p0
    v23.p1 = v19
    var v45: Double = v35
    var v59: Double = v45
    v26.p0 = v28
    v12[0] = v59
    var v54: [Double] = v48
    v20.p0 = v66
    var v56: s0 = v23
    v26.p1 = v9
    v28[1] = v12
    v19[1] = v54
    v20.p1 = v58
    v23.p0 = v19
    v1.p0 = v38
    v20.p0 = v38
    v26.p1 = v9
    return v56
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [[Double]], _ v2: Double) -> Double {
    var v5: s0 = v0
    let v6: [[Double]] = v0.p0
    let v29: s0 = f13(v5)
    let v25: [[Double]] = v29.p1
    var v15: s0 = v29
    let v24: [[Double]] = v15.p1
    let v21: Double = v2 * v2
    v15.p1 = v6
    let v76: [Double] = v24[0]
    v15.p0 = v25
    let v41: Double = v76[0]
    v15.p0 = v6
    let v38: Double = v21 - v41
    return v38
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])
    let v1: [[Double]] = [[4.0]]
    let v2: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
