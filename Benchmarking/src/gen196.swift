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
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    var v6: [s2] = v0
    v6 = v0
    let v9: s2 = v6[0]
    let v24: s0 = v9.p0
    let v16: [[Double]] = v24.p1
    var v35: Double = v1
    let v85: [Double] = v16[1]
    var v34: [Double] = v85
    let v56: Double = v34[0]
    v34[0] = v35
    return v56
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: [s1(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p1: [[s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])]]), s1(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), p1: [[s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])], [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])]])]), s2(p0: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), p1: [s1(p0: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), p1: [[s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])], [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])]]), s1(p0: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), p1: [[s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])], [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])]])])]
    let v1: Double = 56.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 56.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
