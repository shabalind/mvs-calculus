  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: [Double]
  }
  struct s7 {
    var p0: [s3]
    var p1: s1
  }
  func f86(_ v0: Double) -> Double {
    var v7: Double = v0
    v7 = v0
    var v1: Double = v7
    var v6: Double = v0
    var v9: Double = v7
    var v4: Double = v1
    var v14: Double = v6
    v9 = v6
    let v21: [Double] = [v0, v0, v6, v4, v9, v0]
    var v25: [Double] = v21
    var v40: Double = v0
    let v23: Double = v21[2]
    v25[3] = v14
    var v20: Double = v23
    let v57: Double = v25[5]
    var v32: [Double] = v21
    v25[5] = v7
    v25[2] = v20
    let v64: Double = v32[2]
    let v61: Double = v21[2]
    v1 = v40
    v25[5] = v64
    v25[3] = v61
    return v57
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v17: Double = f86(v1)
    let v10: [Double] = [v1, v1]
    var v13: Double = v17
    var v25: Double = v13
    var v48: [Double] = v10
    let v39: [[Double]] = [v10, v10, v10, v48, v48, v48]
    let v61: [Double] = v39[1]
    let v147: Double = v10[0]
    let v73: Double = f86(v147)
    v48[1] = v25
    let v115: Double = v61[0]
    v48[0] = v73
    return v115
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s3(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])), p1: [10.0])], p1: s1(p0: s0(p0: [[11.0], [12.0]], p1: [[13.0], [14.0], [15.0]]), p1: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0], [20.0]])))
    let v1: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
