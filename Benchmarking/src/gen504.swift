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
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  struct s4 {
    var p0: [s2]
    var p1: [s3]
  }
  struct s5 {
    var p0: s4
  }
  struct s6 {
    var p0: s2
    var p1: s1
  }
  func f59(_ v0: s0) -> s0 {
    let v7: [s0] = [v0]
    let v3: s0 = v7[0]
    let v15: [[Double]] = v0.p0
    let v18: [[Double]] = v3.p1
    let v17: s0 = s0(p0: v15, p1: v18)
    return v17
  }
  func f22(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p1
    var v7: s0 = v0
    let v3: [[Double]] = v0.p0
    var v1: [[Double]] = v5
    let v11: [[Double]] = v7.p0
    let v2: [Double] = v3[0]
    let v10: s0 = f59(v7)
    let v9: [[Double]] = v10.p1
    let v4: [Double] = v5[1]
    let v13: [Double] = v1[1]
    let v8: s0 = f59(v7)
    var v15: [[Double]] = v3
    var v16: [[Double]] = v1
    let v19: [[[Double]]] = [v16, v5, v16, v9, v1, v16, v5]
    var v14: [[[Double]]] = v19
    let v24: s0 = f59(v8)
    let v18: s0 = f59(v7)
    let v20: [Double] = v11[0]
    let v22: [[Double]] = v24.p1
    let v26: s0 = f59(v8)
    v7.p0 = v15
    let v34: [[Double]] = v18.p0
    let v51: [[Double]] = v24.p1
    let v56: [[Double]] = v8.p1
    var v65: [[[Double]]] = v14
    let v43: [[Double]] = v0.p1
    v7.p0 = v3
    v7.p1 = v43
    let v55: s0 = f59(v26)
    v65[0] = v51
    v7.p0 = v3
    v15[0] = v4
    let v69: [[Double]] = v65[4]
    let v149: [[Double]] = v8.p0
    let v47: s0 = f59(v7)
    v1[0] = v20
    let v42: [[Double]] = v47.p0
    v7.p0 = v149
    var v50: [[Double]] = v34
    let v113: s0 = f59(v8)
    v1[0] = v13
    v7.p0 = v50
    var v70: s0 = v10
    v7.p1 = v69
    v70.p0 = v42
    let v152: [[Double]] = v55.p1
    let v63: [[Double]] = v113.p0
    let v219: [[Double]] = v14[4]
    let v141: [[Double]] = v26.p0
    v14[5] = v9
    v50[0] = v2
    v70.p0 = v63
    v7.p1 = v56
    v14[0] = v22
    v70.p0 = v141
    v65[2] = v152
    v70.p1 = v69
    v70.p1 = v219
    return v70
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: [s6], _ v2: s5, _ v3: Double) -> Double {
    let v4: [s3] = v0[0]
    let v7: s3 = v4[0]
    let v8: s0 = v7.p0
    let v16: s0 = f22(v8)
    let v17: s0 = f59(v16)
    let v47: [[Double]] = v17.p0
    let v55: [Double] = v47[0]
    let v82: Double = v55[0]
    return v82
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s1(p0: s0(p0: [[3.0]], p1: [[4.0], [5.0]]), p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])]))]]
    let v1: [s6] = [s6(p0: s2(p0: s1(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0]]), p1: [s0(p0: [[15.0]], p1: [[16.0], [17.0]]), s0(p0: [[18.0]], p1: [[19.0], [20.0]])]), p1: s1(p0: s0(p0: [[21.0]], p1: [[22.0], [23.0]]), p1: [s0(p0: [[24.0]], p1: [[25.0], [26.0]]), s0(p0: [[27.0]], p1: [[28.0], [29.0]])])), p1: s1(p0: s0(p0: [[30.0]], p1: [[31.0], [32.0]]), p1: [s0(p0: [[33.0]], p1: [[34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0]])])), s6(p0: s2(p0: s1(p0: s0(p0: [[39.0]], p1: [[40.0], [41.0]]), p1: [s0(p0: [[42.0]], p1: [[43.0], [44.0]]), s0(p0: [[45.0]], p1: [[46.0], [47.0]])]), p1: s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0]]), p1: [s0(p0: [[51.0]], p1: [[52.0], [53.0]]), s0(p0: [[54.0]], p1: [[55.0], [56.0]])])), p1: s1(p0: s0(p0: [[57.0]], p1: [[58.0], [59.0]]), p1: [s0(p0: [[60.0]], p1: [[61.0], [62.0]]), s0(p0: [[63.0]], p1: [[64.0], [65.0]])])), s6(p0: s2(p0: s1(p0: s0(p0: [[66.0]], p1: [[67.0], [68.0]]), p1: [s0(p0: [[69.0]], p1: [[70.0], [71.0]]), s0(p0: [[72.0]], p1: [[73.0], [74.0]])]), p1: s1(p0: s0(p0: [[75.0]], p1: [[76.0], [77.0]]), p1: [s0(p0: [[78.0]], p1: [[79.0], [80.0]]), s0(p0: [[81.0]], p1: [[82.0], [83.0]])])), p1: s1(p0: s0(p0: [[84.0]], p1: [[85.0], [86.0]]), p1: [s0(p0: [[87.0]], p1: [[88.0], [89.0]]), s0(p0: [[90.0]], p1: [[91.0], [92.0]])]))]
    let v2: s5 = s5(p0: s4(p0: [s2(p0: s1(p0: s0(p0: [[93.0]], p1: [[94.0], [95.0]]), p1: [s0(p0: [[96.0]], p1: [[97.0], [98.0]]), s0(p0: [[99.0]], p1: [[100.0], [101.0]])]), p1: s1(p0: s0(p0: [[102.0]], p1: [[103.0], [104.0]]), p1: [s0(p0: [[105.0]], p1: [[106.0], [107.0]]), s0(p0: [[108.0]], p1: [[109.0], [110.0]])]))], p1: [s3(p0: s0(p0: [[111.0]], p1: [[112.0], [113.0]]), p1: s1(p0: s0(p0: [[114.0]], p1: [[115.0], [116.0]]), p1: [s0(p0: [[117.0]], p1: [[118.0], [119.0]]), s0(p0: [[120.0]], p1: [[121.0], [122.0]])]))]))
    let v3: Double = 123.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 123.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
