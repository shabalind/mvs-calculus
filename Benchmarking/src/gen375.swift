  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: Double
    var p1: s0
  }
  struct s4 {
    var p0: s0
    var p1: [[s1]]
  }
  struct s5 {
    var p0: s4
    var p1: [s1]
  }
  struct s6 {
    var p0: s0
    var p1: s5
  }
  func f57(_ v0: Double) -> Double {
    var v7: Double = v0
    var v6: Double = v7
    var v4: Double = v7
    var v5: Double = v0
    v5 = v0
    var v10: Double = v0
    let v13: [Double] = [v7, v0, v10, v5]
    let v8: Double = v5 + v4
    let v9: Double = v13[0]
    let v20: Double = v13[0]
    var v29: [Double] = v13
    let v17: [Double] = [v10]
    var v30: [Double] = v17
    let v15: Double = v29[2]
    var v21: [Double] = v29
    v30[0] = v6
    let v27: Double = v13[1]
    var v37: Double = v9
    v30[0] = v8
    var v39: [Double] = v29
    let v45: Double = v21[0]
    var v35: Double = v0
    v21[0] = v6
    let v46: Double = v39[0]
    var v61: [Double] = v13
    var v26: [Double] = v13
    let v40: Double = v13[2]
    var v36: [Double] = v39
    v26[0] = v37
    let v87: Double = v30[0]
    var v73: [Double] = v29
    let v56: Double = v40 - v87
    v29[0] = v37
    let v72: [[Double]] = [v61, v29, v26, v39, v13, v73]
    let v104: [[Double]] = [v36]
    var v147: [[Double]] = v72
    var v55: [[Double]] = v104
    v73[0] = v37
    let v161: [Double] = v147[1]
    let v43: Double = v36[1]
    var v112: [[Double]] = v72
    var v81: [[Double]] = v55
    v36[0] = v43
    v81[0] = v13
    let v75: [Double] = v112[3]
    let v70: [Double] = v72[5]
    var v126: Double = v15
    v36[1] = v126
    v26[0] = v56
    v147[0] = v70
    let v169: [Double] = v72[1]
    let v106: [Double] = v81[0]
    v81[0] = v169
    var v145: [Double] = v106
    let v230: Double = v145[3]
    v30[0] = v46
    v147[0] = v75
    v21[3] = v35
    v81[0] = v161
    v55[0] = v61
    v36[0] = v27
    v21[2] = v20
    v39[0] = v45
    v36[1] = v7
    return v230
  }
  func f3(_ v0: Double) -> Double {
    var v1: Double = v0
    v1 = v0
    var v6: Double = v1
    let v5: Double = f57(v1)
    var v4: Double = v0
    let v7: Double = f57(v5)
    let v10: Double = f57(v7)
    let v8: Double = v0 + v5
    let v15: Double = v7 / v0
    let v9: Double = f57(v7)
    var v11: Double = v7
    let v3: Double = f57(v15)
    var v19: Double = v15
    var v14: Double = v4
    let v21: [Double] = [v6, v6, v6, v3, v9, v0, v14]
    var v16: [Double] = v21
    v16[6] = v11
    var v29: Double = v19
    v16[6] = v29
    v16[6] = v8
    v1 = v14
    v16[5] = v10
    let v32: Double = v16[4]
    return v32
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: [s6], _ v2: Double) -> Double {
    let v5: s6 = v1[2]
    let v10: s0 = v5.p0
    let v4: [[Double]] = v10.p0
    let v9: [Double] = v4[0]
    let v14: Double = v9[0]
    var v27: Double = v2
    let v57: Double = f3(v27)
    v27 = v14
    return v57
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [[s1(p0: 3.0, p1: s0(p0: [[4.0]], p1: [[5.0], [6.0]]))]])]
    let v1: [s6] = [s6(p0: s0(p0: [[7.0]], p1: [[8.0], [9.0]]), p1: s5(p0: s4(p0: s0(p0: [[10.0]], p1: [[11.0], [12.0]]), p1: [[s1(p0: 13.0, p1: s0(p0: [[14.0]], p1: [[15.0], [16.0]]))]]), p1: [s1(p0: 17.0, p1: s0(p0: [[18.0]], p1: [[19.0], [20.0]])), s1(p0: 21.0, p1: s0(p0: [[22.0]], p1: [[23.0], [24.0]])), s1(p0: 25.0, p1: s0(p0: [[26.0]], p1: [[27.0], [28.0]]))])), s6(p0: s0(p0: [[29.0]], p1: [[30.0], [31.0]]), p1: s5(p0: s4(p0: s0(p0: [[32.0]], p1: [[33.0], [34.0]]), p1: [[s1(p0: 35.0, p1: s0(p0: [[36.0]], p1: [[37.0], [38.0]]))]]), p1: [s1(p0: 39.0, p1: s0(p0: [[40.0]], p1: [[41.0], [42.0]])), s1(p0: 43.0, p1: s0(p0: [[44.0]], p1: [[45.0], [46.0]])), s1(p0: 47.0, p1: s0(p0: [[48.0]], p1: [[49.0], [50.0]]))])), s6(p0: s0(p0: [[51.0]], p1: [[52.0], [53.0]]), p1: s5(p0: s4(p0: s0(p0: [[54.0]], p1: [[55.0], [56.0]]), p1: [[s1(p0: 57.0, p1: s0(p0: [[58.0]], p1: [[59.0], [60.0]]))]]), p1: [s1(p0: 61.0, p1: s0(p0: [[62.0]], p1: [[63.0], [64.0]])), s1(p0: 65.0, p1: s0(p0: [[66.0]], p1: [[67.0], [68.0]])), s1(p0: 69.0, p1: s0(p0: [[70.0]], p1: [[71.0], [72.0]]))]))]
    let v2: Double = 73.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 73.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
