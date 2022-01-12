  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  struct s6 {
    var p0: [[s0]]
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    let v3: [[s0]] = v0.p0
    let v15: [s0] = v3[0]
    var v21: [s0] = v15
    let v16: s0 = v21[0]
    v21[0] = v16
    let v33: s0 = v21[0]
    let v20: s2 = s2(p0: v33, p1: v33)
    let v32: s0 = v20.p1
    let v43: [[Double]] = v32.p0
    let v82: [Double] = v43[0]
    let v71: Double = v82[0]
    return v71
  }
  func benchmark() {
    let v0: s6 = s6(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])]], p1: s3(p0: s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: [[s0(p0: [[12.0]], p1: [[13.0], [14.0]])], [s0(p0: [[15.0]], p1: [[16.0], [17.0]])], [s0(p0: [[18.0]], p1: [[19.0], [20.0]])]]), p1: [s0(p0: [[21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]])]))
    let v1: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
