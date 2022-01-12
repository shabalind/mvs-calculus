  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
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
    var p0: s1
    var p1: s0
  }
  struct s5 {
    var p0: [s2]
    var p1: [[s3]]
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: [s5], _ v2: Double) -> Double {
    let v3: [s3] = v0[1]
    let v6: s3 = v3[0]
    let v16: s0 = v6.p1
    let v11: s0 = v6.p1
    let v21: [[Double]] = v11.p1
    var v36: [[Double]] = v21
    let v25: [Double] = v36[0]
    let v30: [[Double]] = v16.p1
    v36[0] = v25
    let v49: [Double] = v36[0]
    v36[0] = v49
    let v33: Double = v49[0]
    var v59: Double = v33
    let v56: [Double] = v30[0]
    let v73: Double = v25[0]
    v36[0] = v56
    let v110: Double = v73 * v59
    let v157: Double = v73 + v110
    return v157
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]), p2: s0(p0: [[4.0]], p1: [[5.0]])), p1: s0(p0: [[6.0]], p1: [[7.0]]))], [s3(p0: s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: s0(p0: [[10.0]], p1: [[11.0]]), p2: s0(p0: [[12.0]], p1: [[13.0]])), p1: s0(p0: [[14.0]], p1: [[15.0]]))]]
    let v1: [s5] = [s5(p0: [s2(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: [[s0(p0: [[18.0]], p1: [[19.0]])], [s0(p0: [[20.0]], p1: [[21.0]])]])], p1: [[s3(p0: s1(p0: s0(p0: [[22.0]], p1: [[23.0]]), p1: s0(p0: [[24.0]], p1: [[25.0]]), p2: s0(p0: [[26.0]], p1: [[27.0]])), p1: s0(p0: [[28.0]], p1: [[29.0]]))], [s3(p0: s1(p0: s0(p0: [[30.0]], p1: [[31.0]]), p1: s0(p0: [[32.0]], p1: [[33.0]]), p2: s0(p0: [[34.0]], p1: [[35.0]])), p1: s0(p0: [[36.0]], p1: [[37.0]]))]]), s5(p0: [s2(p0: s0(p0: [[38.0]], p1: [[39.0]]), p1: [[s0(p0: [[40.0]], p1: [[41.0]])], [s0(p0: [[42.0]], p1: [[43.0]])]])], p1: [[s3(p0: s1(p0: s0(p0: [[44.0]], p1: [[45.0]]), p1: s0(p0: [[46.0]], p1: [[47.0]]), p2: s0(p0: [[48.0]], p1: [[49.0]])), p1: s0(p0: [[50.0]], p1: [[51.0]]))], [s3(p0: s1(p0: s0(p0: [[52.0]], p1: [[53.0]]), p1: s0(p0: [[54.0]], p1: [[55.0]]), p2: s0(p0: [[56.0]], p1: [[57.0]])), p1: s0(p0: [[58.0]], p1: [[59.0]]))]])]
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
