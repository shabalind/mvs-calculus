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
    var p0: [[s0]]
    var p1: [s0]
  }
  func f5(_ v0: s1) -> s1 {
    let v1: [s0] = v0.p1
    let v2: s0 = v1[1]
    let v17: [s0] = v0.p1
    let v21: s1 = s1(p0: v2, p1: v17)
    return v21
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: s1, _ v2: [s2], _ v3: Double) -> Double {
    let v7: [s0] = v1.p1
    let v5: s0 = v7[0]
    let v9: [[Double]] = v5.p1
    let v11: [Double] = v9[1]
    let v13: s1 = f5(v1)
    var v8: [Double] = v11
    let v17: s0 = v13.p0
    v8 = v11
    let v23: [[Double]] = v17.p1
    v8[0] = v3
    let v47: [[Double]] = v5.p0
    let v31: [Double] = v23[0]
    let v21: [[Double]] = v5.p0
    var v29: [[Double]] = v21
    var v51: [[Double]] = v47
    let v44: Double = v31[0]
    let v58: [Double] = v29[0]
    v8[0] = v3
    v29 = v51
    let v55: Double = v58[0]
    v8[0] = v44
    let v120: [Double] = v51[0]
    v29[0] = v8
    v29[0] = v11
    var v73: [Double] = v11
    v51[0] = v73
    let v53: Double = v55 - v3
    let v123: Double = v3 - v53
    v51[0] = v120
    v29[0] = v11
    return v123
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])]], p1: [s0(p0: [[9.0]], p1: [[10.0], [11.0]])]), s2(p0: [[s0(p0: [[12.0]], p1: [[13.0], [14.0]])], [s0(p0: [[15.0]], p1: [[16.0], [17.0]])], [s0(p0: [[18.0]], p1: [[19.0], [20.0]])]], p1: [s0(p0: [[21.0]], p1: [[22.0], [23.0]])]), s2(p0: [[s0(p0: [[24.0]], p1: [[25.0], [26.0]])], [s0(p0: [[27.0]], p1: [[28.0], [29.0]])], [s0(p0: [[30.0]], p1: [[31.0], [32.0]])]], p1: [s0(p0: [[33.0]], p1: [[34.0], [35.0]])])]
    let v1: s1 = s1(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0]]), p1: [s0(p0: [[39.0]], p1: [[40.0], [41.0]]), s0(p0: [[42.0]], p1: [[43.0], [44.0]])])
    let v2: [s2] = [s2(p0: [[s0(p0: [[45.0]], p1: [[46.0], [47.0]])], [s0(p0: [[48.0]], p1: [[49.0], [50.0]])], [s0(p0: [[51.0]], p1: [[52.0], [53.0]])]], p1: [s0(p0: [[54.0]], p1: [[55.0], [56.0]])]), s2(p0: [[s0(p0: [[57.0]], p1: [[58.0], [59.0]])], [s0(p0: [[60.0]], p1: [[61.0], [62.0]])], [s0(p0: [[63.0]], p1: [[64.0], [65.0]])]], p1: [s0(p0: [[66.0]], p1: [[67.0], [68.0]])])]
    let v3: Double = 69.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 69.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
