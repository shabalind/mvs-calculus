  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s7 {
    var p0: Double
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v6: Double = v1 + v1
    let v3: [Double] = [v1, v6, v6]
    let v5: Double = v0.p0
    var v10: [Double] = v3
    let v7: Double = v10[2]
    let v28: Double = v3[2]
    v10[1] = v28
    v10[2] = v1
    let v31: Double = v10[2]
    let v21: Double = v28 * v31
    let v25: [Double] = [v7, v5, v5, v5]
    let v53: Double = v25[0]
    v10[2] = v21
    return v53
  }
  func benchmark() {
    let v0: s7 = s7(p0: 0.0, p1: s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0], [5.0]]))
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
