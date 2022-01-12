  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f67(_ v0: Double) -> Double {
    let v2: Double = v0 * v0
    let v3: [Double] = [v2, v2, v2, v2, v2]
    let v19: Double = v3[0]
    return v19
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: Double) -> Double {
    let v4: Double = f67(v2)
    let v7: s0 = v1[0]
    let v12: Double = f67(v4)
    let v9: [[Double]] = v7.p0
    let v11: [Double] = [v12, v12, v12, v2, v4]
    let v13: [Double] = v9[0]
    let v14: Double = v13[0]
    let v34: Double = v11[2]
    let v64: Double = v34 * v34
    let v57: Double = v14 - v64
    return v57
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: [s0] = [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])]
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
