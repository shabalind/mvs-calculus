  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [s4], _ v2: s4, _ v3: Double) -> Double {
    let v4: [s0] = v2.p1
    let v12: s0 = v4[1]
    let v15: [[Double]] = v12.p1
    let v17: [Double] = v15[0]
    let v36: Double = v17[0]
    var v29: Double = v3
    let v60: Double = v29 - v3
    let v51: [Double] = [v36, v3, v60, v3]
    var v215: [Double] = v51
    let v149: Double = v215[1]
    return v149
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]]))
    let v1: [s4] = [s4(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])]), s4(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0]]), p1: [s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]])])]
    let v2: s4 = s4(p0: s0(p0: [[33.0], [34.0]], p1: [[35.0]]), p1: [s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]])])
    let v3: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
