  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s1
  }
  struct s3 {
    var p0: [s0]
    var p1: s1
  }
  struct s5 {
    var p0: s3
    var p1: s3
  }
  struct s6 {
    var p0: s2
    var p1: [s5]
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    var v3: s6 = v0
    let v4: s2 = v3.p0
    let v8: s1 = v4.p1
    let v17: [s0] = v8.p1
    let v55: s0 = v17[0]
    let v31: [[Double]] = v55.p0
    var v52: [[Double]] = v31
    let v36: [Double] = v52[0]
    v52[0] = v36
    let v89: [Double] = v52[0]
    v52[0] = v89
    let v155: Double = v89[0]
    return v155
  }
  func benchmark() {
    let v0: s6 = s6(p0: s2(p0: [[s0(p0: [[0.0]], p1: [[1.0]])], [s0(p0: [[2.0]], p1: [[3.0]])]], p1: s1(p0: [[s0(p0: [[4.0]], p1: [[5.0]])], [s0(p0: [[6.0]], p1: [[7.0]])]], p1: [s0(p0: [[8.0]], p1: [[9.0]])])), p1: [s5(p0: s3(p0: [s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]])], p1: s1(p0: [[s0(p0: [[16.0]], p1: [[17.0]])], [s0(p0: [[18.0]], p1: [[19.0]])]], p1: [s0(p0: [[20.0]], p1: [[21.0]])])), p1: s3(p0: [s0(p0: [[22.0]], p1: [[23.0]]), s0(p0: [[24.0]], p1: [[25.0]]), s0(p0: [[26.0]], p1: [[27.0]])], p1: s1(p0: [[s0(p0: [[28.0]], p1: [[29.0]])], [s0(p0: [[30.0]], p1: [[31.0]])]], p1: [s0(p0: [[32.0]], p1: [[33.0]])])))])
    let v1: Double = 34.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 34.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
