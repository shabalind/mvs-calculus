  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: [[s1]]
    var p2: [[s0]]
  }
  struct s4 {
    var p0: [s2]
    var p1: s2
    var p2: s0
    var p3: s0
  }
  func f4(_ v0: Double) -> Double {
    var v7: Double = v0
    var v6: Double = v7
    var v5: Double = v6
    var v1: Double = v6
    var v2: Double = v7
    var v4: Double = v0
    var v9: Double = v7
    var v3: Double = v2
    var v12: Double = v9
    var v20: Double = v2
    var v15: Double = v9
    var v13: Double = v1
    v2 = v13
    var v30: Double = v1
    var v29: Double = v12
    var v32: Double = v15
    var v23: Double = v6
    var v49: Double = v29
    let v25: Double = v29 + v2
    var v27: Double = v49
    var v58: Double = v20
    var v69: Double = v4
    var v57: Double = v5
    var v42: Double = v49
    let v59: [Double] = [v69, v58, v25]
    let v70: Double = v59[0]
    var v74: [Double] = v59
    v74[0] = v42
    let v68: [Double] = [v32, v30, v12, v3, v69, v70, v23]
    let v102: Double = v68[1]
    let v89: Double = v68[1]
    var v48: [Double] = v74
    let v62: Double = v74[0]
    let v85: Double = v68[6]
    let v61: Double = v85 / v7
    var v92: [Double] = v68
    v74[1] = v23
    v48[1] = v85
    v48[2] = v57
    let v125: Double = v48[2]
    var v117: [Double] = v92
    var v90: Double = v125
    v74[1] = v1
    var v149: Double = v90
    v117[5] = v62
    var v170: [Double] = v117
    v48[0] = v6
    v74[0] = v102
    v74[2] = v149
    v29 = v61
    var v358: [Double] = v170
    let v253: Double = v358[6]
    v74[2] = v89
    v74[1] = v27
    return v253
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: [s1], _ v2: Double) -> Double {
    let v12: Double = f4(v2)
    var v11: Double = v12
    let v10: Double = f4(v2)
    let v72: Double = v10 / v11
    let v54: Double = f4(v11)
    let v49: Double = v54 / v72
    let v120: Double = f4(v49)
    return v120
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s2(p0: [s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]])], p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]])), s1(p0: [s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]]))], p1: [[s1(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0]])], p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]]))], [s1(p0: [s0(p0: [[18.0]], p1: [[19.0], [20.0]])], p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]]))]], p2: [[s0(p0: [[24.0]], p1: [[25.0], [26.0]])], [s0(p0: [[27.0]], p1: [[28.0], [29.0]])], [s0(p0: [[30.0]], p1: [[31.0], [32.0]])]]), s2(p0: [s1(p0: [s0(p0: [[33.0]], p1: [[34.0], [35.0]])], p1: s0(p0: [[36.0]], p1: [[37.0], [38.0]])), s1(p0: [s0(p0: [[39.0]], p1: [[40.0], [41.0]])], p1: s0(p0: [[42.0]], p1: [[43.0], [44.0]]))], p1: [[s1(p0: [s0(p0: [[45.0]], p1: [[46.0], [47.0]])], p1: s0(p0: [[48.0]], p1: [[49.0], [50.0]]))], [s1(p0: [s0(p0: [[51.0]], p1: [[52.0], [53.0]])], p1: s0(p0: [[54.0]], p1: [[55.0], [56.0]]))]], p2: [[s0(p0: [[57.0]], p1: [[58.0], [59.0]])], [s0(p0: [[60.0]], p1: [[61.0], [62.0]])], [s0(p0: [[63.0]], p1: [[64.0], [65.0]])]])], p1: s2(p0: [s1(p0: [s0(p0: [[66.0]], p1: [[67.0], [68.0]])], p1: s0(p0: [[69.0]], p1: [[70.0], [71.0]])), s1(p0: [s0(p0: [[72.0]], p1: [[73.0], [74.0]])], p1: s0(p0: [[75.0]], p1: [[76.0], [77.0]]))], p1: [[s1(p0: [s0(p0: [[78.0]], p1: [[79.0], [80.0]])], p1: s0(p0: [[81.0]], p1: [[82.0], [83.0]]))], [s1(p0: [s0(p0: [[84.0]], p1: [[85.0], [86.0]])], p1: s0(p0: [[87.0]], p1: [[88.0], [89.0]]))]], p2: [[s0(p0: [[90.0]], p1: [[91.0], [92.0]])], [s0(p0: [[93.0]], p1: [[94.0], [95.0]])], [s0(p0: [[96.0]], p1: [[97.0], [98.0]])]]), p2: s0(p0: [[99.0]], p1: [[100.0], [101.0]]), p3: s0(p0: [[102.0]], p1: [[103.0], [104.0]]))
    let v1: [s1] = [s1(p0: [s0(p0: [[105.0]], p1: [[106.0], [107.0]])], p1: s0(p0: [[108.0]], p1: [[109.0], [110.0]])), s1(p0: [s0(p0: [[111.0]], p1: [[112.0], [113.0]])], p1: s0(p0: [[114.0]], p1: [[115.0], [116.0]]))]
    let v2: Double = 117.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 117.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
