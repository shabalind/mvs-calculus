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
    var p0: [s0]
    var p1: s1
  }
  struct s4 {
    var p0: s2
    var p1: [s0]
    var p2: s2
    var p3: [s1]
  }
  func f89(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    let v4: [s0] = [v0, v0, v0, v0]
    let v1: [[Double]] = v0.p0
    var v5: s0 = v0
    v5.p0 = v3
    let v2: [Double] = v1[0]
    var v8: [s0] = v4
    v5.p0 = v3
    let v13: [[Double]] = v5.p1
    let v10: [[[Double]]] = [v3, v3, v1, v1, v1]
    let v9: [[Double]] = v0.p1
    let v19: [[Double]] = v10[3]
    v5.p1 = v13
    v5.p0 = v1
    var v21: [[Double]] = v19
    v5.p0 = v19
    let v31: [[Double]] = v5.p1
    let v15: [[Double]] = v5.p1
    var v28: [[Double]] = v31
    let v16: [[Double]] = v5.p0
    let v39: [[Double]] = v0.p0
    v5.p0 = v39
    let v50: [[Double]] = v0.p1
    let v29: s0 = v8[3]
    let v27: [[[Double]]] = [v28, v50, v28, v9, v28, v28]
    let v20: [Double] = v9[0]
    v5.p0 = v21
    var v44: [[Double]] = v50
    let v17: [[Double]] = v29.p1
    var v49: s0 = v0
    let v71: s0 = v4[0]
    var v83: s0 = v49
    let v37: [[Double]] = v27[1]
    v21[0] = v2
    let v72: [[Double]] = v5.p0
    let v38: [Double] = v16[0]
    let v74: [[Double]] = v49.p1
    var v119: s0 = v83
    v83.p0 = v19
    v83.p0 = v16
    v119.p1 = v15
    v83.p0 = v72
    v119.p1 = v17
    v83.p1 = v31
    var v56: [Double] = v20
    v49.p1 = v31
    v49.p1 = v74
    v21[0] = v38
    v28[0] = v56
    var v58: s0 = v119
    v119.p1 = v37
    v83.p1 = v31
    v28[0] = v56
    v119.p0 = v19
    v49.p1 = v44
    v49 = v71
    v8[3] = v71
    return v58
  }
  func f12(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v4: s0 = f89(v6)
    let v10: s0 = f89(v4)
    var v12: s0 = v10
    return v12
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [[s4]], _ v2: [s1], _ v3: Double) -> Double {
    var v8: s0 = v0
    v8 = v0
    let v11: [[Double]] = v8.p1
    let v12: [Double] = v11[0]
    v8.p1 = v11
    let v19: [[Double]] = v8.p0
    let v20: s0 = f12(v8)
    var v16: s0 = v20
    v8.p0 = v19
    let v29: [[Double]] = v20.p0
    v16.p1 = v11
    let v51: Double = v12[0]
    let v50: s0 = f89(v16)
    let v95: Double = v51 - v3
    let v99: [[Double]] = v50.p1
    var v192: Double = v95
    v16.p0 = v29
    v8.p1 = v99
    v16.p1 = v99
    return v192
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]])
    let v1: [[s4]] = [[s4(p0: s2(p0: [s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: [[s0(p0: [[12.0]], p1: [[13.0], [14.0]])], [s0(p0: [[15.0]], p1: [[16.0], [17.0]])], [s0(p0: [[18.0]], p1: [[19.0], [20.0]])]])), p1: [s0(p0: [[21.0]], p1: [[22.0], [23.0]])], p2: s2(p0: [s0(p0: [[24.0]], p1: [[25.0], [26.0]]), s0(p0: [[27.0]], p1: [[28.0], [29.0]])], p1: s1(p0: s0(p0: [[30.0]], p1: [[31.0], [32.0]]), p1: [[s0(p0: [[33.0]], p1: [[34.0], [35.0]])], [s0(p0: [[36.0]], p1: [[37.0], [38.0]])], [s0(p0: [[39.0]], p1: [[40.0], [41.0]])]])), p3: [s1(p0: s0(p0: [[42.0]], p1: [[43.0], [44.0]]), p1: [[s0(p0: [[45.0]], p1: [[46.0], [47.0]])], [s0(p0: [[48.0]], p1: [[49.0], [50.0]])], [s0(p0: [[51.0]], p1: [[52.0], [53.0]])]])])], [s4(p0: s2(p0: [s0(p0: [[54.0]], p1: [[55.0], [56.0]]), s0(p0: [[57.0]], p1: [[58.0], [59.0]])], p1: s1(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0]]), p1: [[s0(p0: [[63.0]], p1: [[64.0], [65.0]])], [s0(p0: [[66.0]], p1: [[67.0], [68.0]])], [s0(p0: [[69.0]], p1: [[70.0], [71.0]])]])), p1: [s0(p0: [[72.0]], p1: [[73.0], [74.0]])], p2: s2(p0: [s0(p0: [[75.0]], p1: [[76.0], [77.0]]), s0(p0: [[78.0]], p1: [[79.0], [80.0]])], p1: s1(p0: s0(p0: [[81.0]], p1: [[82.0], [83.0]]), p1: [[s0(p0: [[84.0]], p1: [[85.0], [86.0]])], [s0(p0: [[87.0]], p1: [[88.0], [89.0]])], [s0(p0: [[90.0]], p1: [[91.0], [92.0]])]])), p3: [s1(p0: s0(p0: [[93.0]], p1: [[94.0], [95.0]]), p1: [[s0(p0: [[96.0]], p1: [[97.0], [98.0]])], [s0(p0: [[99.0]], p1: [[100.0], [101.0]])], [s0(p0: [[102.0]], p1: [[103.0], [104.0]])]])])]]
    let v2: [s1] = [s1(p0: s0(p0: [[105.0]], p1: [[106.0], [107.0]]), p1: [[s0(p0: [[108.0]], p1: [[109.0], [110.0]])], [s0(p0: [[111.0]], p1: [[112.0], [113.0]])], [s0(p0: [[114.0]], p1: [[115.0], [116.0]])]])]
    let v3: Double = 117.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 117.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
