  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f40(_ v0: Double) -> Double {
    var v2: Double = v0
    var v8: Double = v2
    var v7: Double = v2
    var v3: Double = v8
    let v15: [Double] = [v0, v3]
    var v13: [Double] = v15
    v13[1] = v7
    v13[1] = v2
    var v14: [Double] = v13
    var v11: [Double] = v15
    var v20: [Double] = v14
    let v37: Double = v11[0]
    let v66: Double = v20[1]
    v13[1] = v37
    return v66
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v8: Double = v1
    let v6: Double = v1 + v1
    var v3: Double = v6
    var v21: Double = v1
    let v93: Double = f40(v21)
    let v43: Double = f40(v8)
    var v100: Double = v93
    let v44: [Double] = [v6, v93, v1, v100, v3, v43]
    var v276: Double = v6
    v8 = v276
    var v138: [Double] = v44
    v3 = v6
    let v118: Double = v138[4]
    return v118
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
