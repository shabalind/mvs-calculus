  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [[s0]]
  }
  struct s3 {
    var p0: s2
    var p1: [s1]
  }
  struct s4 {
    var p0: s1
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v4: s1 = v0.p0
    var v2: Double = v1
    let v10: s0 = v4.p1
    let v48: s0 = v4.p1
    let v22: [[Double]] = v48.p0
    let v16: [[Double]] = v10.p0
    let v36: [Double] = v16[0]
    let v47: [Double] = v22[0]
    var v54: [Double] = v36
    v54[0] = v2
    v54 = v47
    let v142: Double = v54[0]
    return v142
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), p1: s3(p0: s2(p0: [[s0(p0: [[6.0], [7.0]], p1: [[8.0]])]]), p1: [s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0]]))]))
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
