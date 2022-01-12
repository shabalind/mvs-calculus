  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [s1], _ v2: Double) -> Double {
    let v4: s1 = v1[0]
    let v9: [s0] = v4.p1
    let v6: s1 = v1[0]
    let v5: s0 = v6.p0
    let v12: s0 = v9[2]
    let v25: [[Double]] = v5.p1
    var v29: s0 = v12
    var v21: Double = v2
    v29.p1 = v25
    let v36: [[Double]] = v29.p0
    let v140: [Double] = v36[0]
    let v95: Double = v140[0]
    let v124: Double = v95 / v21
    let v168: [[Double]] = v29.p0
    v29.p1 = v168
    return v124
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])]), p1: s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]])])), s2(p0: s1(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: [s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]]), s0(p0: [[22.0]], p1: [[23.0]])]), p1: s1(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: [s0(p0: [[26.0]], p1: [[27.0]]), s0(p0: [[28.0]], p1: [[29.0]]), s0(p0: [[30.0]], p1: [[31.0]])]))]
    let v1: [s1] = [s1(p0: s0(p0: [[32.0]], p1: [[33.0]]), p1: [s0(p0: [[34.0]], p1: [[35.0]]), s0(p0: [[36.0]], p1: [[37.0]]), s0(p0: [[38.0]], p1: [[39.0]])])]
    let v2: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
