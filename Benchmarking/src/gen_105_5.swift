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
  @inline(never)
  func f0(_ v0: s1, _ v1: [s2], _ v2: s2, _ v3: s1, _ v4: Double) -> Double {
    let v8: s0 = v3.p1
    var v5: s0 = v8
    var v7: s0 = v5
    let v31: [[Double]] = v7.p1
    v5.p1 = v31
    var v33: [[Double]] = v31
    var v46: [[Double]] = v31
    let v53: [Double] = v33[0]
    v46[0] = v53
    let v23: [Double] = v46[0]
    v33[0] = v23
    var v90: [[Double]] = v33
    v90[0] = v53
    v90[0] = v53
    var v96: [[Double]] = v90
    v33[0] = v53
    v5.p1 = v31
    let v87: [Double] = v96[0]
    v46[0] = v53
    let v171: Double = v87[0]
    return v171
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]]))
    let v1: [s2] = [s2(p0: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])], p1: [s0(p0: [[12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0]], p1: [[16.0], [17.0]])]), s2(p0: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]])], p1: [s0(p0: [[24.0]], p1: [[25.0], [26.0]]), s0(p0: [[27.0]], p1: [[28.0], [29.0]])]), s2(p0: [s0(p0: [[30.0]], p1: [[31.0], [32.0]]), s0(p0: [[33.0]], p1: [[34.0], [35.0]])], p1: [s0(p0: [[36.0]], p1: [[37.0], [38.0]]), s0(p0: [[39.0]], p1: [[40.0], [41.0]])])]
    let v2: s2 = s2(p0: [s0(p0: [[42.0]], p1: [[43.0], [44.0]]), s0(p0: [[45.0]], p1: [[46.0], [47.0]])], p1: [s0(p0: [[48.0]], p1: [[49.0], [50.0]]), s0(p0: [[51.0]], p1: [[52.0], [53.0]])])
    let v3: s1 = s1(p0: s0(p0: [[54.0]], p1: [[55.0], [56.0]]), p1: s0(p0: [[57.0]], p1: [[58.0], [59.0]]))
    let v4: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
