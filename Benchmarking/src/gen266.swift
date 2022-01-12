  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: Double) -> Double {
    let v9: [[Double]] = v0.p0
    var v5: Double = v2
    let v4: [Double] = v9[0]
    var v32: Double = v5
    let v25: Double = v2 / v32
    let v37: Double = v4[0]
    var v20: [Double] = v4
    v20 = v4
    v32 = v37
    v20[0] = v25
    var v54: [Double] = v20
    let v56: Double = v54[0]
    v54[0] = v25
    var v129: Double = v56
    return v129
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])
    let v1: [s0] = [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])]
    let v2: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
