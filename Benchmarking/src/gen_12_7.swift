  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    var v5: Double = v1
    let v8: [s0] = v0[1]
    let v3: s0 = v8[0]
    let v9: [[Double]] = v3.p0
    let v4: [Double] = v9[0]
    v5 = v1
    v5 = v1
    let v27: Double = v5 + v1
    let v53: Double = v4[0]
    var v83: Double = v53
    let v98: Double = v83 / v27
    return v98
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0]], p1: [[1.0]])], [s0(p0: [[2.0]], p1: [[3.0]])]]
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
