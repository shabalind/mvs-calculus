  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
    var p2: [[Double]]
    var p3: Double
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s5 {
    var p0: s0
    var p1: [s0]
  }
  struct s8 {
    var p0: [[Double]]
    var p1: s1
    var p2: s0
  }
  struct s11 {
    var p0: [s8]
    var p1: [s5]
  }
  func f15(_ v0: s0) -> s0 {
    let v3: Double = v0.p1
    var v8: s0 = v0
    var v6: s0 = v0
    var v1: Double = v3
    v8.p1 = v3
    let v9: Double = v8.p1
    let v5: [[Double]] = v8.p2
    var v2: [[Double]] = v5
    let v14: [[Double]] = v8.p0
    let v11: [Double] = v2[1]
    let v25: [[Double]] = v6.p2
    v6.p3 = v9
    let v10: [[Double]] = v6.p2
    v2[0] = v11
    let v26: [Double] = v25[0]
    let v18: Double = v26[0]
    let v19: [[Double]] = v0.p0
    let v22: Double = v11[0]
    let v24: [Double] = v19[1]
    v2[1] = v24
    v8.p0 = v14
    v6.p0 = v2
    var v30: s0 = v0
    let v45: [[Double]] = v6.p2
    let v49: Double = v30.p1
    v8.p0 = v45
    v6.p0 = v10
    v30.p2 = v19
    v30.p1 = v49
    let v73: [s0] = [v0, v0, v30, v8, v0, v6, v0]
    let v40: s0 = v73[4]
    v6.p3 = v1
    let v78: Double = v6.p3
    let v62: [[Double]] = v40.p0
    v30.p1 = v22
    v6.p3 = v18
    var v74: [s0] = v73
    v6.p2 = v62
    let v90: s0 = v74[3]
    v6.p3 = v78
    v30.p0 = v62
    return v90
  }
  @inline(never)
  func f0(_ v0: s11, _ v1: Double) -> Double {
    let v2: [s8] = v0.p0
    let v9: s8 = v2[1]
    var v8: Double = v1
    let v6: [Double] = [v1, v8, v8, v1, v1, v1]
    var v10: [Double] = v6
    let v12: s0 = v9.p2
    var v15: Double = v1
    v10[1] = v15
    v10[1] = v15
    var v18: [Double] = v10
    var v39: Double = v15
    let v73: s0 = f15(v12)
    v10[2] = v39
    let v70: Double = v18[5]
    let v47: Double = v73.p1
    v8 = v1
    v10[1] = v47
    return v70
  }
  func benchmark() {
    let v0: s11 = s11(p0: [s8(p0: [[0.0], [1.0], [2.0]], p1: s1(p0: [s0(p0: [[3.0], [4.0]], p1: 5.0, p2: [[6.0], [7.0]], p3: 8.0), s0(p0: [[9.0], [10.0]], p1: 11.0, p2: [[12.0], [13.0]], p3: 14.0)], p1: [s0(p0: [[15.0], [16.0]], p1: 17.0, p2: [[18.0], [19.0]], p3: 20.0)]), p2: s0(p0: [[21.0], [22.0]], p1: 23.0, p2: [[24.0], [25.0]], p3: 26.0)), s8(p0: [[27.0], [28.0], [29.0]], p1: s1(p0: [s0(p0: [[30.0], [31.0]], p1: 32.0, p2: [[33.0], [34.0]], p3: 35.0), s0(p0: [[36.0], [37.0]], p1: 38.0, p2: [[39.0], [40.0]], p3: 41.0)], p1: [s0(p0: [[42.0], [43.0]], p1: 44.0, p2: [[45.0], [46.0]], p3: 47.0)]), p2: s0(p0: [[48.0], [49.0]], p1: 50.0, p2: [[51.0], [52.0]], p3: 53.0))], p1: [s5(p0: s0(p0: [[54.0], [55.0]], p1: 56.0, p2: [[57.0], [58.0]], p3: 59.0), p1: [s0(p0: [[60.0], [61.0]], p1: 62.0, p2: [[63.0], [64.0]], p3: 65.0), s0(p0: [[66.0], [67.0]], p1: 68.0, p2: [[69.0], [70.0]], p3: 71.0), s0(p0: [[72.0], [73.0]], p1: 74.0, p2: [[75.0], [76.0]], p3: 77.0)]), s5(p0: s0(p0: [[78.0], [79.0]], p1: 80.0, p2: [[81.0], [82.0]], p3: 83.0), p1: [s0(p0: [[84.0], [85.0]], p1: 86.0, p2: [[87.0], [88.0]], p3: 89.0), s0(p0: [[90.0], [91.0]], p1: 92.0, p2: [[93.0], [94.0]], p3: 95.0), s0(p0: [[96.0], [97.0]], p1: 98.0, p2: [[99.0], [100.0]], p3: 101.0)])])
    let v1: Double = 102.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 102.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
