  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: s0
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s0, _ v2: Double) -> Double {
    let v5: [[s0]] = v0.p1
    let v3: [s0] = v5[0]
    let v9: s0 = v3[0]
    let v8: [[Double]] = v9.p1
    let v23: [Double] = v8[1]
    let v20: Double = v23[0]
    var v59: [Double] = v23
    let v34: Double = v59[0]
    var v53: Double = v2
    let v54: Double = v20 + v34
    var v85: Double = v53
    v59[0] = v85
    return v54
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [[s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]])
    let v1: s0 = s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])
    let v2: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
