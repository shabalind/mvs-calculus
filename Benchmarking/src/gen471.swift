  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f1(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v6: [[Double]] = v1.p0
    let v5: [Double] = v6[1]
    var v3: [[Double]] = v6
    let v7: [[Double]] = v0.p0
    let v4: [[Double]] = v1.p1
    let v8: [[Double]] = v0.p1
    let v9: [[Double]] = v0.p0
    let v11: [[[Double]]] = [v8, v4, v8, v8, v4, v8]
    let v24: [[Double]] = v0.p1
    let v14: [[Double]] = v11[5]
    let v23: [Double] = v6[0]
    let v20: [[Double]] = v11[1]
    let v35: [[Double]] = v1.p0
    var v39: [[Double]] = v35
    var v37: [[Double]] = v39
    let v58: s0 = s0(p0: v9, p1: v14)
    v1.p1 = v24
    v1.p1 = v4
    let v34: [Double] = v9[1]
    var v47: s0 = v0
    let v25: [[Double]] = v58.p1
    let v62: [[Double]] = v0.p0
    let v86: [[Double]] = v47.p0
    v3[0] = v23
    var v19: [[Double]] = v86
    var v57: s0 = v1
    var v63: s0 = v1
    v1.p0 = v19
    v63.p0 = v6
    let v32: [[Double]] = v58.p1
    v57.p0 = v7
    v37[0] = v34
    v57.p0 = v3
    v1.p1 = v25
    let v31: [[Double]] = v11[1]
    let v33: [[Double]] = v63.p1
    let v75: s0 = s0(p0: v39, p1: v14)
    v1.p0 = v7
    let v43: [[Double]] = v57.p0
    let v214: [[Double]] = v63.p1
    v63.p0 = v19
    v1.p0 = v62
    v47.p1 = v31
    var v68: s0 = v57
    let v95: [Double] = v32[0]
    let v60: [[Double]] = v1.p1
    v57.p0 = v6
    v3[1] = v5
    v68.p1 = v214
    v57 = v75
    v68.p0 = v43
    v3[0] = v95
    v57.p0 = v37
    v1.p1 = v33
    v57.p1 = v60
    v47.p1 = v20
    v68.p1 = v20
    return v68
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v5: s0 = f1(v0)
    let v11: [[Double]] = v5.p0
    let v13: [[Double]] = v5.p0
    var v20: [[Double]] = v11
    let v34: [Double] = v20[0]
    v20 = v13
    let v59: Double = v34[0]
    return v59
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
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
