  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v3: s0 = v0[0]
    let v11: s1 = s1(p0: v3, p1: v0)
    let v12: s0 = v0[0]
    let v20: s0 = v11.p0
    let v26: [[Double]] = v20.p1
    let v25: [Double] = v26[1]
    let v23: [[Double]] = v12.p1
    var v96: [[Double]] = v23
    let v72: [Double] = v96[0]
    let v100: [Double] = v26[0]
    v96[1] = v100
    let v132: Double = v72[0]
    v96[1] = v25
    return v132
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0]])]
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
