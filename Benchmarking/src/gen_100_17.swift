  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f16(_ v0: Double) -> Double {
    var v5: Double = v0
    var v4: Double = v0
    var v2: Double = v0
    var v3: Double = v0
    v2 = v3
    var v7: Double = v5
    var v8: Double = v4
    var v13: Double = v3
    let v1: Double = v13 * v7
    v5 = v3
    var v14: Double = v4
    var v30: Double = v2
    var v16: Double = v8
    let v43: [Double] = [v14, v8, v8]
    var v39: [Double] = v43
    let v25: [Double] = [v7]
    v39[0] = v1
    let v19: Double = v25[0]
    v39[1] = v16
    v39[1] = v19
    v39[0] = v30
    v39[2] = v3
    let v81: Double = v39[1]
    return v81
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v6: [[Double]] = v0.p0
    let v18: [Double] = v6[2]
    let v14: Double = v18[0]
    let v24: Double = f16(v14)
    let v47: Double = v18[0]
    let v42: [Double] = v6[1]
    let v95: Double = f16(v1)
    let v60: [Double] = v6[1]
    var v57: [Double] = v60
    v57[0] = v95
    let v74: Double = f16(v47)
    let v121: Double = v57[0]
    var v116: [Double] = v42
    let v92: Double = v47 + v121
    var v112: [Double] = v116
    v57[0] = v92
    let v101: Double = v112[0]
    v112[0] = v74
    v57[0] = v24
    let v232: Double = v92 + v101
    return v232
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
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
