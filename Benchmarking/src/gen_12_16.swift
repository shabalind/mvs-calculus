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
    var p1: [s1]
  }
  struct s8 {
    var p0: s2
    var p1: [s2]
  }
  struct s9 {
    var p0: [s0]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: s8, _ v2: Double) -> Double {
    let v5: s2 = v1.p0
    let v4: [s0] = v0.p1
    let v7: s0 = v4[0]
    var v3: s0 = v7
    let v10: [s0] = v0.p1
    let v8: [[Double]] = v3.p0
    let v23: s0 = v10[0]
    v3.p0 = v8
    let v12: [Double] = v8[1]
    let v14: [s0] = v5.p0
    let v15: [s0] = v0.p1
    var v21: [s0] = v14
    v3.p0 = v8
    v21[0] = v7
    v21[0] = v3
    v21[0] = v23
    v21[0] = v3
    let v29: [[Double]] = v7.p0
    let v68: s0 = v15[0]
    let v44: s0 = v21[0]
    v21[0] = v7
    let v57: [[Double]] = v7.p0
    let v37: [s0] = [v23, v23]
    v3.p1 = v29
    let v116: [[Double]] = v44.p0
    v21[0] = v68
    let v154: Double = v12[0]
    v3.p1 = v8
    var v89: [s0] = v37
    v3.p0 = v116
    let v135: s0 = v89[0]
    let v218: [[Double]] = v135.p0
    v3.p1 = v57
    v3.p1 = v218
    return v154
  }
  func benchmark() {
    let v0: s9 = s9(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])])
    let v1: s8 = s8(p0: s2(p0: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], p1: [s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])), s1(p0: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), p1: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]))]), p1: [s2(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])], p1: [s1(p0: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), p1: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])), s1(p0: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]), p1: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]))]), s2(p0: [s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]])], p1: [s1(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]), p1: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])), s1(p0: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]), p1: s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]))])])
    let v2: Double = 76.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 76.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
