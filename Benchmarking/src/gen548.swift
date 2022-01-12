  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: [s0]
  }
  struct s5 {
    var p0: [[Double]]
    var p1: s1
  }
  struct s8 {
    var p0: s5
    var p1: [[s4]]
  }
  func f101(_ v0: Double) -> Double {
    var v3: Double = v0
    var v2: Double = v0
    var v6: Double = v3
    let v4: Double = v3 + v6
    var v1: Double = v6
    var v9: Double = v3
    let v8: [Double] = [v0, v9, v3, v2, v1, v6, v4]
    let v17: Double = v8[1]
    var v12: Double = v1
    let v34: Double = v8[4]
    let v20: [Double] = [v17, v17, v12, v34]
    let v41: [[Double]] = [v20]
    let v48: [Double] = v41[0]
    let v39: Double = v48[2]
    return v39
  }
  func f88(_ v0: Double) -> Double {
    let v4: Double = f101(v0)
    var v3: Double = v4
    let v2: [Double] = [v0]
    let v1: Double = v2[0]
    var v5: [Double] = v2
    var v10: [Double] = v2
    v10[0] = v0
    let v9: Double = f101(v0)
    v5[0] = v0
    let v15: Double = v5[0]
    let v13: Double = v10[0]
    var v21: [Double] = v2
    var v19: Double = v3
    v21 = v10
    v10[0] = v19
    let v34: Double = f101(v1)
    let v38: Double = v34 * v15
    let v24: Double = v21[0]
    v21[0] = v13
    v10[0] = v9
    v21[0] = v38
    return v24
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: Double) -> Double {
    let v16: Double = v1 / v1
    let v68: Double = v16 - v1
    let v121: Double = f88(v16)
    let v105: Double = v68 * v121
    return v105
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: s5(p0: [[0.0]], p1: s1(p0: [s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0]])], p1: s0(p0: [[11.0], [12.0], [13.0]], p1: [[14.0], [15.0]]))), p1: [[s4(p0: s1(p0: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0], [25.0]])], p1: s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0], [30.0]])), p1: [s0(p0: [[31.0], [32.0], [33.0]], p1: [[34.0], [35.0]])])], [s4(p0: s1(p0: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0]]), s0(p0: [[41.0], [42.0], [43.0]], p1: [[44.0], [45.0]])], p1: s0(p0: [[46.0], [47.0], [48.0]], p1: [[49.0], [50.0]])), p1: [s0(p0: [[51.0], [52.0], [53.0]], p1: [[54.0], [55.0]])])], [s4(p0: s1(p0: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0], [60.0]]), s0(p0: [[61.0], [62.0], [63.0]], p1: [[64.0], [65.0]])], p1: s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0]])), p1: [s0(p0: [[71.0], [72.0], [73.0]], p1: [[74.0], [75.0]])])]]), s8(p0: s5(p0: [[76.0]], p1: s1(p0: [s0(p0: [[77.0], [78.0], [79.0]], p1: [[80.0], [81.0]]), s0(p0: [[82.0], [83.0], [84.0]], p1: [[85.0], [86.0]])], p1: s0(p0: [[87.0], [88.0], [89.0]], p1: [[90.0], [91.0]]))), p1: [[s4(p0: s1(p0: [s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0], [96.0]]), s0(p0: [[97.0], [98.0], [99.0]], p1: [[100.0], [101.0]])], p1: s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0]])), p1: [s0(p0: [[107.0], [108.0], [109.0]], p1: [[110.0], [111.0]])])], [s4(p0: s1(p0: [s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0], [116.0]]), s0(p0: [[117.0], [118.0], [119.0]], p1: [[120.0], [121.0]])], p1: s0(p0: [[122.0], [123.0], [124.0]], p1: [[125.0], [126.0]])), p1: [s0(p0: [[127.0], [128.0], [129.0]], p1: [[130.0], [131.0]])])], [s4(p0: s1(p0: [s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0], [136.0]]), s0(p0: [[137.0], [138.0], [139.0]], p1: [[140.0], [141.0]])], p1: s0(p0: [[142.0], [143.0], [144.0]], p1: [[145.0], [146.0]])), p1: [s0(p0: [[147.0], [148.0], [149.0]], p1: [[150.0], [151.0]])])]])]
    let v1: Double = 152.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 152.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
