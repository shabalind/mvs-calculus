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
    var p0: s0
    var p1: s1
  }
  struct s6 {
    var p0: [s3]
    var p1: s0
  }
  struct s7 {
    var p0: s0
    var p1: [s6]
  }
  struct s12 {
    var p0: s3
    var p1: s7
  }
  func f77(_ v0: s3) -> s3 {
    return v0
  }
  @inline(never)
  func f0(_ v0: s12, _ v1: Double) -> Double {
    let v2: s3 = v0.p0
    let v14: s3 = f77(v2)
    var v80: Double = v1
    let v56: s1 = v14.p1
    let v46: [s0] = v56.p0
    let v62: s0 = v46[1]
    let v49: [[Double]] = v62.p1
    let v116: [Double] = v49[0]
    let v133: Double = v116[0]
    let v211: Double = v80 / v133
    return v211
  }
  func benchmark() {
    let v0: s12 = s12(p0: s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s1(p0: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: [[s0(p0: [[9.0], [10.0]], p1: [[11.0]])]])), p1: s7(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: [s6(p0: [s3(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]]), p1: s1(p0: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])], p1: [[s0(p0: [[24.0], [25.0]], p1: [[26.0]])]])), s3(p0: s0(p0: [[27.0], [28.0]], p1: [[29.0]]), p1: s1(p0: [s0(p0: [[30.0], [31.0]], p1: [[32.0]]), s0(p0: [[33.0], [34.0]], p1: [[35.0]])], p1: [[s0(p0: [[36.0], [37.0]], p1: [[38.0]])]]))], p1: s0(p0: [[39.0], [40.0]], p1: [[41.0]]))]))
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
