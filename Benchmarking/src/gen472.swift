  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  struct s4 {
    var p0: [Double]
    var p1: [s2]
  }
  func f78(_ v0: s4) -> s4 {
    var v1: s4 = v0
    let v5: [Double] = v0.p0
    v1.p0 = v5
    let v9: [s2] = v1.p1
    let v2: [s4] = [v1]
    let v13: s4 = v2[0]
    v1.p1 = v9
    return v13
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: [s3], _ v2: Double) -> Double {
    let v6: s4 = f78(v0)
    let v17: s4 = f78(v6)
    let v16: [Double] = v17.p0
    let v25: Double = v16[2]
    let v50: Double = v16[2]
    let v60: Double = v50 * v25
    let v101: Double = v60 * v25
    var v87: Double = v101
    var v103: Double = v87
    return v103
  }
  func benchmark() {
    let v0: s4 = s4(p0: [0.0, 1.0, 2.0], p1: [s2(p0: s1(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]])), s2(p0: s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]])), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0]]))])
    let v1: [s3] = [s3(p0: s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]])), p1: s0(p0: [[18.0], [19.0]], p1: [[20.0]])), s3(p0: s1(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0]])), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0]]))]
    let v2: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
