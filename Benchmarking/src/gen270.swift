  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v3: [[Double]] = v0.p1
    var v10: Double = v2
    var v23: Double = v2
    let v9: [Double] = v3[0]
    let v24: Double = v9[0]
    v10 = v24
    let v49: [Double] = [v24, v10, v2, v10, v10]
    var v35: [Double] = v49
    v10 = v24
    let v36: Double = v9[0]
    var v67: [Double] = v35
    var v34: Double = v36
    var v29: Double = v36
    let v55: Double = v29 + v10
    var v44: Double = v34
    v35[2] = v44
    let v64: Double = v49[3]
    v67[1] = v55
    v67[1] = v23
    let v93: Double = v67[2]
    v35[2] = v64
    return v93
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: s0 = s0(p0: [[2.0]], p1: [[3.0]])
    let v2: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
