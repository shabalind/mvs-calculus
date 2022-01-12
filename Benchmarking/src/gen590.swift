  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s4 {
    var p0: s1
    var p1: [s1]
  }
  struct s5 {
    var p0: [s2]
    var p1: s0
  }
  func f60(_ v0: Double) -> Double {
    var v6: Double = v0
    var v1: Double = v6
    var v4: Double = v6
    var v3: Double = v6
    v3 = v6
    let v21: Double = v4 - v6
    var v7: Double = v4
    let v5: [Double] = [v4]
    var v17: [Double] = v5
    var v16: [Double] = v5
    v17 = v5
    var v10: Double = v7
    let v19: Double = v17[0]
    let v11: [[Double]] = [v16, v5, v16, v17]
    let v18: Double = v5[0]
    v17[0] = v3
    v17[0] = v21
    var v45: [[Double]] = v11
    v17[0] = v7
    v17[0] = v6
    v7 = v19
    v16[0] = v19
    let v41: [Double] = v45[3]
    v45[1] = v17
    var v24: Double = v10
    var v32: [[Double]] = v45
    var v28: [Double] = v5
    let v38: [Double] = v45[0]
    var v26: [[Double]] = v32
    let v39: Double = v16[0]
    v17[0] = v4
    var v30: [[Double]] = v26
    v26[2] = v38
    v16[0] = v4
    let v31: Double = v18 / v1
    v17 = v28
    let v27: Double = v31 + v24
    v17[0] = v18
    v6 = v24
    var v40: [Double] = v41
    let v81: [Double] = v30[2]
    v4 = v27
    v28[0] = v39
    v32[1] = v40
    let v90: Double = v81[0]
    return v90
  }
  func f18(_ v0: Double) -> Double {
    let v5: Double = f60(v0)
    var v1: Double = v0
    var v2: Double = v5
    v1 = v5
    let v3: Double = v5 + v5
    var v4: Double = v2
    let v8: Double = f60(v4)
    let v11: [Double] = [v2, v5, v8, v1, v4, v3]
    let v9: Double = v11[5]
    let v13: Double = f60(v9)
    var v32: [Double] = v11
    v32[0] = v13
    let v39: [[Double]] = [v32, v11, v32, v32, v11, v11]
    var v33: [[Double]] = v39
    let v43: [Double] = v39[1]
    var v38: [[Double]] = v33
    let v125: [Double] = v38[2]
    var v57: [Double] = v125
    let v124: Double = v57[1]
    v32 = v43
    v57 = v11
    let v130: Double = f60(v124)
    return v130
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: [s5], _ v2: s1, _ v3: s5, _ v4: s4, _ v5: [s0], _ v6: [s0], _ v7: Double) -> Double {
    let v12: s0 = v6[1]
    let v9: [[Double]] = v12.p1
    let v10: [Double] = v9[1]
    let v57: Double = v10[0]
    let v134: Double = f18(v57)
    var v180: Double = v134
    return v180
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: [s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])])], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0]])), s5(p0: [s2(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]])])], p1: s0(p0: [[27.0]], p1: [[28.0], [29.0]]))]
    let v1: [s5] = [s5(p0: [s2(p0: s0(p0: [[30.0]], p1: [[31.0], [32.0]]), p1: [s0(p0: [[33.0]], p1: [[34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0]]), s0(p0: [[39.0]], p1: [[40.0], [41.0]])])], p1: s0(p0: [[42.0]], p1: [[43.0], [44.0]])), s5(p0: [s2(p0: s0(p0: [[45.0]], p1: [[46.0], [47.0]]), p1: [s0(p0: [[48.0]], p1: [[49.0], [50.0]]), s0(p0: [[51.0]], p1: [[52.0], [53.0]]), s0(p0: [[54.0]], p1: [[55.0], [56.0]])])], p1: s0(p0: [[57.0]], p1: [[58.0], [59.0]])), s5(p0: [s2(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0]]), p1: [s0(p0: [[63.0]], p1: [[64.0], [65.0]]), s0(p0: [[66.0]], p1: [[67.0], [68.0]]), s0(p0: [[69.0]], p1: [[70.0], [71.0]])])], p1: s0(p0: [[72.0]], p1: [[73.0], [74.0]]))]
    let v2: s1 = s1(p0: [[s0(p0: [[75.0]], p1: [[76.0], [77.0]])], [s0(p0: [[78.0]], p1: [[79.0], [80.0]])]], p1: s0(p0: [[81.0]], p1: [[82.0], [83.0]]))
    let v3: s5 = s5(p0: [s2(p0: s0(p0: [[84.0]], p1: [[85.0], [86.0]]), p1: [s0(p0: [[87.0]], p1: [[88.0], [89.0]]), s0(p0: [[90.0]], p1: [[91.0], [92.0]]), s0(p0: [[93.0]], p1: [[94.0], [95.0]])])], p1: s0(p0: [[96.0]], p1: [[97.0], [98.0]]))
    let v4: s4 = s4(p0: s1(p0: [[s0(p0: [[99.0]], p1: [[100.0], [101.0]])], [s0(p0: [[102.0]], p1: [[103.0], [104.0]])]], p1: s0(p0: [[105.0]], p1: [[106.0], [107.0]])), p1: [s1(p0: [[s0(p0: [[108.0]], p1: [[109.0], [110.0]])], [s0(p0: [[111.0]], p1: [[112.0], [113.0]])]], p1: s0(p0: [[114.0]], p1: [[115.0], [116.0]]))])
    let v5: [s0] = [s0(p0: [[117.0]], p1: [[118.0], [119.0]]), s0(p0: [[120.0]], p1: [[121.0], [122.0]])]
    let v6: [s0] = [s0(p0: [[123.0]], p1: [[124.0], [125.0]]), s0(p0: [[126.0]], p1: [[127.0], [128.0]])]
    let v7: Double = 129.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 129.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
