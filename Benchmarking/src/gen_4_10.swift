  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: Double) -> Double {
    var v7: Double = v2
    let v3: s0 = v0[0]
    let v8: [[Double]] = v3.p1
    let v14: [Double] = v8[2]
    v7 = v2
    let v15: Double = v14[0]
    let v25: s0 = v1.p0
    var v23: [Double] = v14
    var v17: [Double] = v23
    let v40: Double = v14[0]
    let v32: [[Double]] = v25.p0
    let v31: [Double] = v32[0]
    v23 = v31
    v17[0] = v2
    v23[0] = v15
    v23[0] = v7
    let v109: Double = v17[0]
    v23[0] = v40
    let v139: Double = v7 + v109
    return v139
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]
    let v1: s1 = s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))
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
