  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  struct s4 {
    var p0: [s3]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    var v5: Double = v1
    let v2: Double = v1 - v1
    let v15: [Double] = [v1, v2, v1]
    var v13: [Double] = v15
    v5 = v2
    var v30: Double = v5
    v13[0] = v2
    v13[1] = v5
    var v46: Double = v30
    v13[2] = v46
    v13[1] = v30
    let v124: Double = v13[0]
    return v124
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s3(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s0(p0: [[2.0]], p1: [[3.0]])], p2: [s0(p0: [[4.0]], p1: [[5.0]])]), p1: s0(p0: [[6.0]], p1: [[7.0]])), s3(p0: s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [s0(p0: [[10.0]], p1: [[11.0]])], p2: [s0(p0: [[12.0]], p1: [[13.0]])]), p1: s0(p0: [[14.0]], p1: [[15.0]])), s3(p0: s1(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: [s0(p0: [[18.0]], p1: [[19.0]])], p2: [s0(p0: [[20.0]], p1: [[21.0]])]), p1: s0(p0: [[22.0]], p1: [[23.0]]))], p1: [s1(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: [s0(p0: [[26.0]], p1: [[27.0]])], p2: [s0(p0: [[28.0]], p1: [[29.0]])]), s1(p0: s0(p0: [[30.0]], p1: [[31.0]]), p1: [s0(p0: [[32.0]], p1: [[33.0]])], p2: [s0(p0: [[34.0]], p1: [[35.0]])]), s1(p0: s0(p0: [[36.0]], p1: [[37.0]]), p1: [s0(p0: [[38.0]], p1: [[39.0]])], p2: [s0(p0: [[40.0]], p1: [[41.0]])])])
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
