  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: [[s0]]
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    var v4: Double = v1
    var v23: Double = v1
    let v20: Double = v4 / v23
    let v81: Double = v4 + v23
    var v47: Double = v81
    var v77: Double = v4
    var v62: Double = v77
    let v78: [Double] = [v23, v23, v62, v20, v1, v77, v47]
    let v150: [[Double]] = [v78, v78, v78, v78, v78, v78, v78]
    let v142: [Double] = v150[5]
    let v163: Double = v142[0]
    return v163
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s0(p0: [[0.0], [1.0]]), p1: s1(p0: [s0(p0: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]]), s0(p0: [[6.0], [7.0]])], p1: s0(p0: [[8.0], [9.0]]), p2: [[s0(p0: [[10.0], [11.0]])], [s0(p0: [[12.0], [13.0]])]])), s3(p0: s0(p0: [[14.0], [15.0]]), p1: s1(p0: [s0(p0: [[16.0], [17.0]]), s0(p0: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0]])], p1: s0(p0: [[22.0], [23.0]]), p2: [[s0(p0: [[24.0], [25.0]])], [s0(p0: [[26.0], [27.0]])]])), s3(p0: s0(p0: [[28.0], [29.0]]), p1: s1(p0: [s0(p0: [[30.0], [31.0]]), s0(p0: [[32.0], [33.0]]), s0(p0: [[34.0], [35.0]])], p1: s0(p0: [[36.0], [37.0]]), p2: [[s0(p0: [[38.0], [39.0]])], [s0(p0: [[40.0], [41.0]])]]))]
    let v1: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
