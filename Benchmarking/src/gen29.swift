  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v5: s0 = v0[0]
    var v3: Double = v1
    v3 = v1
    let v9: [[Double]] = v5.p1
    let v14: [Double] = v9[1]
    let v25: [Double] = v9[0]
    var v8: [[Double]] = v9
    v8[0] = v14
    var v30: [Double] = v25
    let v24: [[Double]] = v5.p0
    v8[0] = v25
    let v27: [Double] = v8[1]
    let v35: Double = v30[0]
    let v42: [Double] = v24[0]
    v30 = v42
    let v36: [[Double]] = [v30, v27, v27, v14, v42, v14]
    let v29: Double = v27[0]
    var v72: [[Double]] = v36
    let v63: [Double] = v36[5]
    let v48: [Double] = v72[1]
    v8[0] = v48
    let v178: [Double] = [v3, v35, v29]
    v72[5] = v63
    var v96: [Double] = v178
    let v64: Double = v96[1]
    return v64
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])]
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
