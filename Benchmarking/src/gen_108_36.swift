  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [s1]
    var p1: [[s0]]
  }
  struct s4 {
    var p0: s1
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s1, _ v2: Double) -> Double {
    let v5: [s0] = v1.p0
    let v10: s0 = v5[1]
    let v25: [[Double]] = v10.p1
    let v17: [Double] = v25[1]
    let v26: Double = v17[0]
    let v20: [Double] = v25[1]
    let v33: Double = v2 + v26
    let v50: Double = v20[0]
    var v63: Double = v50
    let v171: Double = v63 / v33
    return v171
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], p1: [[s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])]]), p1: s3(p0: [s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], p1: [[s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])]])], p1: [[s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])]]))
    let v1: s1 = s1(p0: [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])], p1: [[s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])]])
    let v2: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
