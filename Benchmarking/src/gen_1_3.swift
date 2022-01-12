  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: s1
  }
  struct s5 {
    var p0: s1
    var p1: s2
  }
  func f94(_ v0: Double) -> Double {
    let v4: [Double] = [v0]
    let v3: Double = v4[0]
    let v5: Double = v4[0]
    var v1: [Double] = v4
    v1[0] = v3
    var v8: [Double] = v4
    let v21: Double = v4[0]
    v1[0] = v5
    var v16: [Double] = v1
    let v25: Double = v16[0]
    let v45: [[Double]] = [v16, v4, v8, v16]
    v8[0] = v25
    var v69: Double = v21
    let v26: [Double] = v45[3]
    v1[0] = v69
    let v73: Double = v26[0]
    return v73
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: s5, _ v2: Double) -> Double {
    var v4: Double = v2
    let v9: Double = f94(v4)
    let v50: Double = v2 * v4
    let v113: [Double] = [v2, v2, v2, v50, v9, v4]
    let v145: Double = v113[0]
    let v179: Double = v50 * v145
    return v179
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p2: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))], [s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])], p1: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), p2: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]))]]
    let v1: s5 = s5(p0: s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])], p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), p2: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])), p1: s2(p0: [[s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])], p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), p2: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]))], [s1(p0: [s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])], p1: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]), p2: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]))]], p1: s1(p0: [s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]])], p1: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]]), p2: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]))))
    let v2: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
