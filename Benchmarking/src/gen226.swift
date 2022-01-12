  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f12(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v8: [[Double]] = v6.p1
    let v2: [[Double]] = v0.p0
    let v3: [[Double]] = v0.p1
    let v5: [[Double]] = v6.p0
    let v7: [Double] = v2[1]
    let v1: [[Double]] = v0.p1
    var v12: [[Double]] = v5
    let v16: [[Double]] = v6.p0
    let v11: [[Double]] = v6.p1
    let v13: [Double] = v1[0]
    var v14: [Double] = v7
    let v9: [[Double]] = v6.p0
    v12[1] = v13
    var v10: s0 = v0
    v10.p1 = v8
    var v15: [[Double]] = v3
    let v28: [Double] = v5[0]
    v12 = v16
    v12[1] = v14
    var v21: [[Double]] = v2
    v10.p1 = v15
    v10.p0 = v9
    v6.p1 = v1
    v12[1] = v28
    var v35: s0 = v10
    v10.p0 = v12
    v35.p1 = v3
    v10.p0 = v21
    v21[1] = v7
    let v37: [[Double]] = v35.p0
    v35.p1 = v11
    let v54: [[Double]] = v0.p1
    let v36: [[Double]] = v10.p1
    let v109: s0 = s0(p0: v37, p1: v54)
    v35.p1 = v11
    v10.p1 = v36
    return v109
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: s1, _ v2: [[s1]], _ v3: s0, _ v4: Double) -> Double {
    let v9: [[Double]] = v3.p0
    let v10: s0 = v1.p0
    var v5: s0 = v3
    let v7: s0 = f12(v5)
    v5.p0 = v9
    let v23: [[Double]] = v10.p1
    let v14: s0 = v1.p0
    var v30: s0 = v5
    let v25: [[Double]] = v30.p1
    let v37: [[Double]] = v14.p1
    v5.p0 = v9
    let v59: s0 = v1.p0
    v5.p1 = v37
    let v41: s0 = s0(p0: v9, p1: v37)
    let v64: [[Double]] = v10.p1
    let v73: [[Double]] = v59.p1
    v5.p0 = v9
    let v49: [[[Double]]] = [v73, v23, v37, v23, v23, v64, v73]
    let v67: [[Double]] = v49[2]
    v5 = v7
    var v110: [[Double]] = v37
    v30.p1 = v67
    let v173: [[Double]] = v41.p0
    let v235: [Double] = v25[2]
    v110[0] = v235
    let v231: Double = v235[0]
    v5.p0 = v173
    v30.p0 = v9
    v5.p1 = v110
    return v231
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])]]
    let v1: s1 = s1(p0: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), p1: [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])])
    let v2: [[s1]] = [[s1(p0: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])])], [s1(p0: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]), p1: [s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]])])], [s1(p0: s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]]), p1: [s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]]), s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]]), s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0], [84.0]])])]]
    let v3: s0 = s0(p0: [[85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])
    let v4: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
