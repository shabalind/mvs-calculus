  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v3: [s0] = v0[1]
    var v2: [s0] = v3
    var v10: [[s0]] = v0
    let v6: [s0] = v10[1]
    v10 = v0
    v10[1] = v2
    let v13: s0 = v2[0]
    let v14: [[Double]] = v13.p1
    let v11: [s0] = v0[1]
    v10[0] = v2
    let v40: [Double] = v14[0]
    v10[0] = v11
    var v41: [s0] = v6
    v10 = v0
    let v170: s0 = v41[0]
    v2[0] = v170
    let v130: Double = v40[0]
    return v130
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]]
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
