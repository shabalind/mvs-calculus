  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [s0]
    var p3: [s0]
    var p4: s0
  }
  struct s3 {
    var p0: s0
    var p1: [s1]
  }
  struct s4 {
    var p0: [[s1]]
    var p1: [s3]
  }
  func f31(_ v0: s4) -> s4 {
    var v4: s4 = v0
    return v4
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v2: s4 = v0[0]
    let v8: s4 = f31(v2)
    let v3: [[s1]] = v8.p0
    let v16: [s1] = v3[0]
    let v58: s1 = v16[0]
    let v54: s0 = v58.p1
    let v55: [[Double]] = v54.p1
    let v37: [Double] = v55[0]
    let v59: Double = v37[0]
    return v59
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [[s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]), p2: [s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]])], p3: [s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]])], p4: s0(p0: [[14.0]], p1: [[15.0]]))]], p1: [s3(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: [s1(p0: s0(p0: [[18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0]]), p2: [s0(p0: [[22.0]], p1: [[23.0]]), s0(p0: [[24.0]], p1: [[25.0]]), s0(p0: [[26.0]], p1: [[27.0]])], p3: [s0(p0: [[28.0]], p1: [[29.0]]), s0(p0: [[30.0]], p1: [[31.0]])], p4: s0(p0: [[32.0]], p1: [[33.0]]))])])]
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
