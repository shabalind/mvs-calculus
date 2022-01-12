  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
    var p2: [[s0]]
    var p3: s0
  }
  struct s3 {
    var p0: [[Double]]
    var p1: s1
  }
  struct s6 {
    var p0: [s3]
    var p1: s0
  }
  func f41(_ v0: Double, _ v1: s6) -> Double {
    var v4: s6 = v1
    let v6: [s3] = v4.p0
    var v3: s6 = v1
    v4 = v3
    let v2: s0 = v1.p1
    let v9: s3 = v6[0]
    let v11: [[Double]] = v9.p0
    let v37: [Double] = v11[1]
    v4.p0 = v6
    let v16: s6 = s6(p0: v6, p1: v2)
    v3.p1 = v2
    let v19: Double = v37[0]
    v3.p1 = v2
    v4.p0 = v6
    v4.p0 = v6
    let v38: [s3] = v16.p0
    v3.p1 = v2
    v4.p0 = v6
    v3.p0 = v6
    v3.p1 = v2
    v4.p0 = v38
    return v19
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s6, _ v2: Double) -> Double {
    var v7: s6 = v1
    var v6: s6 = v1
    let v9: [s3] = v6.p0
    let v8: s3 = v9[0]
    v7.p0 = v9
    let v12: s3 = v9[2]
    v6.p0 = v9
    let v19: s1 = v12.p1
    let v17: Double = f41(v2, v7)
    v7.p0 = v9
    v6.p0 = v9
    let v30: [s0] = v19.p0
    let v21: s0 = v30[0]
    v6.p0 = v9
    let v26: [[Double]] = v8.p0
    v6.p0 = v9
    v6.p1 = v21
    v6.p0 = v9
    let v59: [Double] = v26[1]
    let v85: Double = v59[0]
    v6.p0 = v9
    let v80: Double = v17 / v85
    v6.p0 = v9
    var v253: Double = v80
    return v253
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[0.0], [1.0]], p1: s1(p0: [s0(p0: [[2.0]], p1: [[3.0], [4.0], [5.0]])], p1: [[s0(p0: [[6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0]], p1: [[11.0], [12.0], [13.0]])]], p2: [[s0(p0: [[14.0]], p1: [[15.0], [16.0], [17.0]])]], p3: s0(p0: [[18.0]], p1: [[19.0], [20.0], [21.0]])))
    let v1: s6 = s6(p0: [s3(p0: [[22.0], [23.0]], p1: s1(p0: [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])], p1: [[s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])]], p2: [[s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]], p3: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]))), s3(p0: [[44.0], [45.0]], p1: s1(p0: [s0(p0: [[46.0]], p1: [[47.0], [48.0], [49.0]])], p1: [[s0(p0: [[50.0]], p1: [[51.0], [52.0], [53.0]])], [s0(p0: [[54.0]], p1: [[55.0], [56.0], [57.0]])]], p2: [[s0(p0: [[58.0]], p1: [[59.0], [60.0], [61.0]])]], p3: s0(p0: [[62.0]], p1: [[63.0], [64.0], [65.0]]))), s3(p0: [[66.0], [67.0]], p1: s1(p0: [s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])], p1: [[s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])], [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])]], p2: [[s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]])]], p3: s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]])))], p1: s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]]))
    let v2: Double = 92.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 92.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
