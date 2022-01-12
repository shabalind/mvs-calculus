  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: Double
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s0, _ v2: Double) -> Double {
    let v13: [[Double]] = v1.p1
    var v12: Double = v2
    let v14: [Double] = v13[0]
    var v23: [Double] = v14
    let v10: Double = v14[0]
    var v28: Double = v12
    let v15: Double = v23[0]
    v23[0] = v12
    v23[0] = v28
    v23[0] = v15
    var v20: Double = v15
    let v51: Double = v23[0]
    var v32: Double = v51
    v23[0] = v10
    var v75: Double = v32
    v23[0] = v20
    return v75
  }
  func benchmark() {
    let v0: s3 = s3(p0: 0.0, p1: s1(p0: [s0(p0: [[1.0]], p1: [[2.0]]), s0(p0: [[3.0]], p1: [[4.0]])], p1: s0(p0: [[5.0]], p1: [[6.0]])))
    let v1: s0 = s0(p0: [[7.0]], p1: [[8.0]])
    let v2: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
