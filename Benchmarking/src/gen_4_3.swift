  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v6: s0 = v0[2]
    let v7: [[Double]] = v6.p0
    let v10: [[Double]] = v6.p0
    var v2: [[Double]] = v7
    let v9: [Double] = v2[0]
    v2[2] = v9
    let v59: Double = v9[0]
    let v36: Double = v1 * v59
    let v34: Double = v36 * v36
    let v62: [Double] = v10[2]
    var v70: Double = v34
    v2[1] = v62
    let v68: Double = v34 * v70
    v2 = v10
    return v68
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
