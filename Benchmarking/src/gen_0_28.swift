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
    var p0: [s0]
    var p1: [s2]
  }
  struct s5 {
    var p0: [s2]
    var p1: s2
    var p2: [s3]
    var p3: s2
  }
  struct s6 {
    var p0: [[s5]]
    var p1: s1
  }
  struct s7 {
    var p0: s6
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v6: s6 = v0.p0
    var v7: s6 = v6
    let v5: s1 = v7.p1
    let v8: s6 = v0.p0
    var v10: s1 = v5
    let v13: [[s5]] = v6.p0
    let v9: [s5] = v13[0]
    let v18: [s5] = v13[0]
    let v16: s5 = v18[0]
    let v23: s5 = v9[0]
    let v14: [[s5]] = v8.p0
    var v41: s5 = v16
    let v29: s2 = v41.p1
    let v40: [s3] = v16.p2
    let v22: s2 = v23.p3
    let v21: [s3] = v23.p2
    let v26: s0 = v10.p1
    let v48: [[Double]] = v26.p1
    v7.p1 = v5
    v7.p0 = v13
    v7.p1 = v10
    var v67: [s3] = v21
    let v44: s5 = v9[0]
    let v49: [Double] = v48[0]
    v41 = v16
    let v25: s3 = v21[0]
    v67[0] = v25
    let v80: s3 = v40[0]
    let v32: [[Double]] = [v49, v49, v49, v49, v49, v49]
    v7.p0 = v13
    let v37: [Double] = v32[2]
    v67[0] = v80
    let v34: [s0] = v29.p0
    let v94: s0 = v34[0]
    let v66: s0 = v34[0]
    v41 = v44
    let v39: [s2] = v80.p1
    v67[0] = v80
    v10.p0 = v94
    let v72: s0 = v34[0]
    v41.p1 = v22
    v41.p2 = v67
    v7.p0 = v14
    let v62: s2 = v39[0]
    var v165: [[s5]] = v14
    v41.p3 = v62
    v10.p1 = v72
    let v91: Double = v37[0]
    v10.p0 = v66
    v7.p1 = v5
    v7.p0 = v165
    return v91
  }
  func benchmark() {
    let v0: s7 = s7(p0: s6(p0: [[s5(p0: [s2(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]])], p1: [s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])])], p1: s2(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0]])], p1: [s0(p0: [[15.0]], p1: [[16.0], [17.0]]), s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]])]), p2: [s3(p0: [s0(p0: [[24.0]], p1: [[25.0], [26.0]]), s0(p0: [[27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0], [32.0]])], p1: [s2(p0: [s0(p0: [[33.0]], p1: [[34.0], [35.0]])], p1: [s0(p0: [[36.0]], p1: [[37.0], [38.0]]), s0(p0: [[39.0]], p1: [[40.0], [41.0]]), s0(p0: [[42.0]], p1: [[43.0], [44.0]])])])], p3: s2(p0: [s0(p0: [[45.0]], p1: [[46.0], [47.0]])], p1: [s0(p0: [[48.0]], p1: [[49.0], [50.0]]), s0(p0: [[51.0]], p1: [[52.0], [53.0]]), s0(p0: [[54.0]], p1: [[55.0], [56.0]])]))]], p1: s1(p0: s0(p0: [[57.0]], p1: [[58.0], [59.0]]), p1: s0(p0: [[60.0]], p1: [[61.0], [62.0]]))), p1: s2(p0: [s0(p0: [[63.0]], p1: [[64.0], [65.0]])], p1: [s0(p0: [[66.0]], p1: [[67.0], [68.0]]), s0(p0: [[69.0]], p1: [[70.0], [71.0]]), s0(p0: [[72.0]], p1: [[73.0], [74.0]])]))
    let v1: Double = 75.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 75.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
