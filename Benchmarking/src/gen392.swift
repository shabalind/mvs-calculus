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
    var p1: s1
  }
  func f110(_ v0: s1, _ v1: s1) -> s1 {
    var v6: s1 = v0
    var v3: s1 = v6
    var v7: s1 = v1
    let v8: s0 = v3.p1
    let v11: s0 = v7.p1
    let v4: [s1] = [v6, v6, v7, v3, v0]
    var v10: s0 = v8
    v6.p1 = v11
    var v18: [s1] = v4
    let v13: s1 = v18[2]
    let v20: [[Double]] = v8.p1
    v6.p1 = v8
    v10.p1 = v20
    v3.p1 = v11
    v6.p1 = v10
    v10.p0 = v20
    v18[1] = v6
    return v13
  }
  func f104(_ v0: s1) -> s1 {
    let v7: s0 = v0.p1
    var v1: s1 = v0
    let v6: s1 = f110(v1, v0)
    v1.p1 = v7
    var v3: s1 = v6
    let v11: s1 = f110(v3, v0)
    let v9: s1 = f110(v6, v0)
    let v22: s1 = f110(v1, v9)
    let v20: s1 = f110(v22, v9)
    let v38: s1 = f110(v20, v9)
    var v23: s1 = v11
    let v61: s1 = f110(v23, v38)
    return v61
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s2], _ v2: Double) -> Double {
    let v7: s1 = v0.p1
    let v6: s1 = f104(v7)
    let v9: s0 = v6.p0
    let v10: [[Double]] = v9.p0
    var v17: [[Double]] = v10
    let v22: [Double] = v10[0]
    let v20: [Double] = v17[1]
    v17[0] = v20
    var v56: [[Double]] = v17
    v17[1] = v22
    let v37: Double = v20[0]
    var v67: [Double] = v22
    v56[0] = v20
    v17 = v56
    v56[0] = v67
    let v104: Double = v37 / v37
    return v104
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), p1: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])))
    let v1: [s2] = [s2(p0: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])], p1: s1(p0: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), p1: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]))), s2(p0: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])], p1: s1(p0: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]), p1: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]))), s2(p0: [s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]), s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]]), s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]])], p1: s1(p0: s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]), p1: s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]])))]
    let v2: Double = 80.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 80.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
