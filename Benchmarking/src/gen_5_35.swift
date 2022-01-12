  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  struct s3 {
    var p0: s2
    var p1: [s0]
  }
  func f36(_ v0: Double) -> Double {
    var v2: Double = v0
    var v7: Double = v2
    var v3: Double = v7
    return v3
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v7: Double = f36(v1)
    var v5: Double = v7
    let v4: Double = f36(v5)
    var v17: Double = v1
    v17 = v5
    let v41: Double = v5 + v4
    let v190: Double = v5 / v17
    let v137: Double = v41 + v190
    return v137
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s2(p0: [s0(p0: [0.0, 1.0], p1: [[2.0]]), s0(p0: [3.0, 4.0], p1: [[5.0]]), s0(p0: [6.0, 7.0], p1: [[8.0]])], p1: s1(p0: s0(p0: [9.0, 10.0], p1: [[11.0]]), p1: [[s0(p0: [12.0, 13.0], p1: [[14.0]])], [s0(p0: [15.0, 16.0], p1: [[17.0]])]], p2: s0(p0: [18.0, 19.0], p1: [[20.0]]))), p1: [s0(p0: [21.0, 22.0], p1: [[23.0]])])]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
