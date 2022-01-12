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
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: s2
  }
  struct s11 {
    var p0: [[s3]]
    var p1: [[s1]]
  }
  func f7(_ v0: [[s11]], _ v1: Double) -> Double {
    var v26: Double = v1
    var v57: Double = v26
    var v32: Double = v57
    return v32
  }
  @inline(never)
  func f0(_ v0: [[s11]], _ v1: s1, _ v2: Double) -> Double {
    let v7: Double = f7(v0, v2)
    let v6: Double = f7(v0, v7)
    let v9: [s11] = v0[0]
    let v18: Double = f7(v0, v7)
    let v15: Double = f7(v0, v6)
    var v17: [[s11]] = v0
    let v37: Double = f7(v0, v2)
    let v39: Double = f7(v17, v37)
    let v67: Double = f7(v0, v39)
    let v74: Double = f7(v0, v67)
    v17[0] = v9
    let v44: Double = f7(v17, v67)
    let v73: Double = f7(v0, v74)
    let v46: Double = f7(v0, v73)
    let v70: Double = f7(v0, v44)
    let v156: Double = f7(v0, v15)
    let v77: Double = v156 + v37
    let v55: Double = f7(v17, v70)
    let v60: [Double] = [v55, v18, v77, v74, v46]
    let v112: Double = v60[4]
    return v112
  }
  func benchmark() {
    let v0: [[s11]] = [[s11(p0: [[s3(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s2(p0: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])], p1: [s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]])]))]], p1: [[s1(p0: s0(p0: [[10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0]]))], [s1(p0: s0(p0: [[14.0]], p1: [[15.0]]), p1: s0(p0: [[16.0]], p1: [[17.0]]))]])]]
    let v1: s1 = s1(p0: s0(p0: [[18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0]]))
    let v2: Double = 22.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 22.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
