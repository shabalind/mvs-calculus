  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: Double
  }
  struct s3 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s5 {
    var p0: [s1]
    var p1: s3
  }
  func f4(_ v0: Double, _ v1: s3) -> Double {
    let v5: [s0] = v1.p0
    let v7: s0 = v5[1]
    let v2: [[Double]] = v7.p0
    let v11: [Double] = v2[1]
    let v22: Double = v11[0]
    return v22
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    let v2: s3 = v0.p1
    let v14: Double = f4(v1, v2)
    let v17: Double = f4(v14, v2)
    let v15: Double = f4(v17, v2)
    let v19: Double = f4(v15, v2)
    return v19
  }
  func benchmark() {
    let v0: s5 = s5(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: 4.0)], p1: s3(p0: [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0], [12.0]]), s0(p0: [[13.0], [14.0]], p1: [[15.0], [16.0]])], p1: [s0(p0: [[17.0], [18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0], [24.0]])]))
    let v1: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
