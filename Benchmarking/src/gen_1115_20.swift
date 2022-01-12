  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v3: s0 = v0[0]
    let v6: [[Double]] = v3.p1
    let v5: s0 = v0[0]
    let v9: [[Double]] = v5.p0
    let v13: [Double] = v9[0]
    let v34: [Double] = v6[1]
    let v43: Double = v34[0]
    let v40: Double = v13[0]
    var v59: Double = v40
    let v26: Double = v59 * v43
    return v26
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])]
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
