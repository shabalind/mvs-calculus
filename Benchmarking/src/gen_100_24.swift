  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: [[s1]]
  }
  struct s4 {
    var p0: s1
    var p1: s3
  }
  func f49(_ v0: s4) -> s4 {
    var v44: s4 = v0
    var v73: s4 = v44
    return v73
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    var v7: Double = v1
    let v2: s4 = f49(v0)
    let v3: s3 = v2.p1
    let v9: [s0] = v3.p0
    let v6: s0 = v9[1]
    let v35: [[Double]] = v6.p2
    let v26: [Double] = v35[0]
    let v31: Double = v26[0]
    let v82: Double = v31 - v7
    return v82
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0]])], p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0]], p2: [[9.0]]), p2: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0]], p2: [[14.0]])), p1: s3(p0: [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0]], p2: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]], p2: [[24.0]])], p1: [[s1(p0: [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0]], p2: [[29.0]])], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0]], p2: [[34.0]]), p2: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0]], p2: [[39.0]]))]]))
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
