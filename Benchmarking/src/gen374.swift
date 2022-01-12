  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f21(_ v0: [s0]) -> [s0] {
    return v0
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [s0], _ v2: Double) -> Double {
    let v7: [Double] = v0[0]
    var v9: [Double] = v7
    let v3: Double = v2 + v2
    v9[0] = v3
    let v6: [s0] = f21(v1)
    let v5: s0 = v6[0]
    let v11: [[Double]] = v5.p1
    let v10: [Double] = v11[0]
    let v8: Double = v10[0]
    var v19: Double = v8
    v9[0] = v8
    let v31: Double = v10[0]
    v9[0] = v8
    let v59: Double = v9[0]
    let v53: Double = v2 / v19
    v9[0] = v53
    var v47: Double = v59
    var v55: Double = v31
    var v179: Double = v55
    v9[0] = v179
    var v127: Double = v47
    let v177: Double = v127 * v47
    return v177
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [s0] = [s0(p0: [[2.0], [3.0]], p1: [[4.0], [5.0], [6.0]])]
    let v2: Double = 7.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 7.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
