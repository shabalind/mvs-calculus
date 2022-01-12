  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: s0
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s3 {
    var p0: [s0]
    var p1: s2
  }
  struct s7 {
    var p0: s0
    var p1: s3
  }
  struct s9 {
    var p0: s1
    var p1: s7
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    let v4: s1 = v0.p0
    let v8: [s0] = v4.p0
    let v9: s0 = v8[0]
    let v30: [[Double]] = v9.p0
    let v42: [Double] = v30[0]
    let v44: [[Double]] = v9.p1
    let v64: [Double] = v44[0]
    var v47: [Double] = v64
    let v49: Double = v42[0]
    var v80: Double = v49
    let v86: Double = v47[0]
    let v183: Double = v86 * v80
    return v183
  }
  func benchmark() {
    let v0: s9 = s9(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0]])], p1: s0(p0: [[2.0]], p1: [[3.0]]), p2: s0(p0: [[4.0]], p1: [[5.0]])), p1: s7(p0: s0(p0: [[6.0]], p1: [[7.0]]), p1: s3(p0: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]])], p1: s2(p0: s0(p0: [[14.0]], p1: [[15.0]]), p1: s1(p0: [s0(p0: [[16.0]], p1: [[17.0]])], p1: s0(p0: [[18.0]], p1: [[19.0]]), p2: s0(p0: [[20.0]], p1: [[21.0]]))))))
    let v1: Double = 22.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 22.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
