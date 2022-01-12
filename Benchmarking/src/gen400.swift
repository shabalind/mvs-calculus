  import Dispatch
  @inline(never)
  func f0(_ v0: Double) -> Double {
    var v5: Double = v0
    var v1: Double = v5
    var v7: Double = v1
    var v13: Double = v7
    var v2: Double = v13
    var v9: Double = v5
    var v11: Double = v0
    var v12: Double = v1
    var v14: Double = v9
    var v20: Double = v1
    var v18: Double = v9
    var v32: Double = v12
    var v15: Double = v20
    var v24: Double = v20
    var v21: Double = v24
    var v29: Double = v7
    var v39: Double = v21
    let v26: [Double] = [v21, v15, v29, v18, v14, v11, v39]
    let v31: Double = v26[1]
    var v22: [Double] = v26
    let v57: Double = v22[6]
    var v46: [Double] = v26
    var v36: Double = v2
    v46[5] = v57
    v1 = v57
    v18 = v31
    let v55: Double = v46[4]
    let v97: [Double] = [v36, v55]
    var v80: [Double] = v97
    var v79: [Double] = v80
    v24 = v32
    var v64: [Double] = v79
    let v76: Double = v22[0]
    let v66: Double = v64[0]
    v5 = v76
    return v66
  }
  func benchmark() {
    let v0: Double = 0.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 0.0
    for _ in 1...1000 {
      result = f0(v0)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
