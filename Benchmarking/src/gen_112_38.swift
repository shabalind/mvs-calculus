  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f47(_ v0: Double) -> Double {
    let v5: Double = v0 + v0
    var v2: Double = v0
    var v7: Double = v2
    v2 = v0
    let v6: Double = v7 * v5
    var v8: Double = v2
    var v1: Double = v5
    var v9: Double = v6
    var v12: Double = v5
    var v4: Double = v1
    let v20: Double = v9 / v1
    var v13: Double = v1
    var v10: Double = v12
    var v11: Double = v13
    var v30: Double = v11
    let v15: [Double] = [v4, v8, v10, v6]
    var v23: [Double] = v15
    var v27: [Double] = v23
    v27[1] = v0
    var v115: [Double] = v27
    v27[1] = v8
    v23[3] = v20
    v115[3] = v20
    v27[2] = v30
    let v28: Double = v115[1]
    v23[1] = v30
    v115[3] = v28
    return v28
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    var v7: Double = v1
    let v4: Double = f47(v1)
    var v17: Double = v4
    var v16: Double = v17
    var v27: Double = v4
    let v43: Double = f47(v7)
    let v56: Double = v43 * v16
    var v102: Double = v56
    let v120: Double = v102 / v102
    v7 = v27
    v7 = v27
    return v120
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0], [6.0], [7.0]]), p1: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0], [12.0]], p2: [[13.0], [14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0], [20.0]], p2: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0], [28.0]], p2: [[29.0], [30.0], [31.0]])]), s1(p0: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0], [36.0]], p2: [[37.0], [38.0], [39.0]]), p1: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]], p2: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0], [52.0]], p2: [[53.0], [54.0], [55.0]]), s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0], [60.0]], p2: [[61.0], [62.0], [63.0]])]), s1(p0: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0], [68.0]], p2: [[69.0], [70.0], [71.0]]), p1: [s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0], [76.0]], p2: [[77.0], [78.0], [79.0]]), s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0], [84.0]], p2: [[85.0], [86.0], [87.0]]), s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0], [92.0]], p2: [[93.0], [94.0], [95.0]])])]
    let v1: Double = 96.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 96.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
