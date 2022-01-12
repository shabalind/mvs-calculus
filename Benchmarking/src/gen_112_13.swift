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
    var p0: s0
    var p1: [s1]
  }
  struct s4 {
    var p0: [s0]
    var p1: [s0]
  }
  func f3(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v4: [[Double]] = v0.p0
    v5.p0 = v4
    let v1: [[Double]] = v5.p1
    var v2: s0 = v0
    let v17: [[Double]] = v0.p0
    let v34: [[Double]] = v5.p1
    let v14: [[Double]] = v5.p1
    v5.p1 = v1
    v2.p0 = v17
    let v30: [[Double]] = v0.p1
    v5.p1 = v14
    v2.p1 = v30
    v2.p1 = v1
    v5.p1 = v34
    v5.p1 = v30
    let v54: [s0] = [v5, v2]
    v2.p0 = v4
    let v97: s0 = v54[0]
    return v97
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s4, _ v2: Double) -> Double {
    let v9: [s0] = v1.p0
    let v4: s0 = v9[2]
    let v10: s0 = f3(v4)
    let v16: [[Double]] = v10.p1
    let v28: [Double] = v16[1]
    let v58: Double = v28[0]
    let v56: Double = v28[0]
    let v64: Double = v56 * v58
    let v137: Double = v64 / v64
    return v137
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [s1(p0: s0(p0: [[3.0]], p1: [[4.0], [5.0]]), p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]])]), s1(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]])]), s1(p0: s0(p0: [[27.0]], p1: [[28.0], [29.0]]), p1: [s0(p0: [[30.0]], p1: [[31.0], [32.0]]), s0(p0: [[33.0]], p1: [[34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0]])])])
    let v1: s4 = s4(p0: [s0(p0: [[39.0]], p1: [[40.0], [41.0]]), s0(p0: [[42.0]], p1: [[43.0], [44.0]]), s0(p0: [[45.0]], p1: [[46.0], [47.0]])], p1: [s0(p0: [[48.0]], p1: [[49.0], [50.0]]), s0(p0: [[51.0]], p1: [[52.0], [53.0]]), s0(p0: [[54.0]], p1: [[55.0], [56.0]])])
    let v2: Double = 57.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 57.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
