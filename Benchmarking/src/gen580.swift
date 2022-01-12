  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: s0
  }
  struct s2 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [s1]
    var p1: [[s0]]
  }
  func f67(_ v0: [s3]) -> [s3] {
    let v7: [[s3]] = [v0, v0, v0, v0]
    let v1: [s3] = v7[0]
    let v6: s3 = v1[1]
    var v9: [s3] = v0
    v9[0] = v6
    v9[0] = v6
    return v9
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: [s2], _ v2: Double) -> Double {
    let v7: [s3] = f67(v0)
    let v8: s3 = v7[0]
    let v14: [s1] = v8.p0
    let v13: s1 = v14[0]
    let v34: s0 = v13.p1
    let v21: [[Double]] = v34.p0
    let v93: [Double] = v21[1]
    let v80: Double = v93[0]
    return v80
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s1(p0: s0(p0: [[0.0], [1.0]]), p1: s0(p0: [[2.0], [3.0]]), p2: s0(p0: [[4.0], [5.0]]))], p1: [[s0(p0: [[6.0], [7.0]])], [s0(p0: [[8.0], [9.0]])]]), s3(p0: [s1(p0: s0(p0: [[10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0]]), p2: s0(p0: [[14.0], [15.0]]))], p1: [[s0(p0: [[16.0], [17.0]])], [s0(p0: [[18.0], [19.0]])]])]
    let v1: [s2] = [s2(p0: s0(p0: [[20.0], [21.0]]), p1: [[s0(p0: [[22.0], [23.0]])], [s0(p0: [[24.0], [25.0]])], [s0(p0: [[26.0], [27.0]])]]), s2(p0: s0(p0: [[28.0], [29.0]]), p1: [[s0(p0: [[30.0], [31.0]])], [s0(p0: [[32.0], [33.0]])], [s0(p0: [[34.0], [35.0]])]]), s2(p0: s0(p0: [[36.0], [37.0]]), p1: [[s0(p0: [[38.0], [39.0]])], [s0(p0: [[40.0], [41.0]])], [s0(p0: [[42.0], [43.0]])]])]
    let v2: Double = 44.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 44.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
