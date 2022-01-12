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
    var p0: [s0]
    var p1: [[s1]]
  }
  struct s3 {
    var p0: s2
    var p1: [s1]
    var p2: [s0]
  }
  struct s4 {
    var p0: s3
    var p1: [[s1]]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s4, _ v2: Double) -> Double {
    var v8: s1 = v0
    let v4: [[s0]] = v8.p1
    let v11: s3 = v1.p0
    let v30: [s0] = v4[0]
    var v18: [[s0]] = v4
    let v17: s0 = v30[0]
    v8.p1 = v18
    let v46: [[Double]] = v17.p1
    let v34: [s0] = v11.p2
    let v82: [Double] = v46[2]
    let v43: Double = v82[0]
    v18[0] = v34
    v8.p1 = v18
    return v43
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [[s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]])
    let v1: s4 = s4(p0: s3(p0: s2(p0: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: [[s1(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), p1: [[s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]])]]), p1: [s1(p0: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), p1: [[s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]]), s1(p0: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), p1: [[s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])]])], p2: [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]), p1: [[s1(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: [[s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])]])], [s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p1: [[s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])]])]])
    let v2: Double = 56.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 56.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
