  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  struct s6 {
    var p0: s3
    var p1: s2
    var p2: s0
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: s1, _ v2: Double) -> Double {
    let v3: s0 = v0.p2
    var v5: s0 = v3
    var v12: Double = v2
    let v7: [Double] = v5.p0
    let v10: s0 = v1.p0
    let v14: Double = v7[0]
    let v34: [[Double]] = [v7, v7, v7, v7, v7]
    let v19: s0 = v1.p0
    let v13: [Double] = v34[3]
    let v23: Double = v2 / v14
    let v27: [[Double]] = v19.p1
    var v65: [Double] = v13
    v65[2] = v2
    let v21: Double = v65[0]
    let v24: [[Double]] = v19.p1
    v65[1] = v21
    let v38: [Double] = v24[2]
    let v46: [[Double]] = v10.p1
    var v37: [[Double]] = v46
    v37[0] = v38
    v5.p0 = v65
    let v80: [Double] = v34[3]
    v12 = v23
    v5.p0 = v80
    var v55: Double = v21
    var v77: [[Double]] = v27
    let v92: [Double] = v34[3]
    v5.p0 = v92
    let v195: Double = v92[0]
    v65[2] = v195
    v65[1] = v12
    v5.p1 = v77
    v5.p1 = v37
    return v55
  }
  func benchmark() {
    let v0: s6 = s6(p0: s3(p0: s1(p0: s0(p0: [0.0, 1.0, 2.0], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [6.0, 7.0, 8.0], p1: [[9.0], [10.0], [11.0]])), p1: s0(p0: [12.0, 13.0, 14.0], p1: [[15.0], [16.0], [17.0]])), p1: s2(p0: s0(p0: [18.0, 19.0, 20.0], p1: [[21.0], [22.0], [23.0]]), p1: [s0(p0: [24.0, 25.0, 26.0], p1: [[27.0], [28.0], [29.0]]), s0(p0: [30.0, 31.0, 32.0], p1: [[33.0], [34.0], [35.0]]), s0(p0: [36.0, 37.0, 38.0], p1: [[39.0], [40.0], [41.0]])]), p2: s0(p0: [42.0, 43.0, 44.0], p1: [[45.0], [46.0], [47.0]]))
    let v1: s1 = s1(p0: s0(p0: [48.0, 49.0, 50.0], p1: [[51.0], [52.0], [53.0]]), p1: s0(p0: [54.0, 55.0, 56.0], p1: [[57.0], [58.0], [59.0]]))
    let v2: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
