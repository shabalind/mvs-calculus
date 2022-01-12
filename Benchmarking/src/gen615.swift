  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: [Double]
  }
  struct s4 {
    var p0: [s2]
    var p1: s2
  }
  struct s7 {
    var p0: s0
    var p1: [s4]
  }
  struct s8 {
    var p0: s7
    var p1: s1
  }
  struct s10 {
    var p0: [s1]
    var p1: s0
  }
  struct s11 {
    var p0: [s10]
    var p1: s0
  }
  func f57(_ v0: Double) -> Double {
    let v6: [Double] = [v0, v0, v0, v0]
    var v3: [Double] = v6
    v3 = v6
    let v5: Double = v0 + v0
    var v4: Double = v5
    let v9: Double = v3[1]
    var v7: Double = v4
    let v1: Double = v3[0]
    v4 = v5
    v3[2] = v4
    var v23: Double = v7
    let v11: Double = v9 * v1
    var v22: Double = v1
    var v8: [Double] = v6
    let v10: Double = v0 / v23
    let v14: Double = v8[1]
    var v19: Double = v4
    var v21: Double = v10
    v22 = v19
    var v38: Double = v11
    let v32: [Double] = [v5, v4]
    var v51: [Double] = v32
    v8[0] = v22
    var v24: [Double] = v51
    let v41: Double = v32[0]
    let v37: Double = v32[0]
    let v55: [Double] = [v0, v21, v41]
    var v73: [Double] = v32
    var v31: [Double] = v55
    var v46: [Double] = v51
    v24[0] = v37
    let v147: [[Double]] = [v46, v73, v24, v73]
    let v84: [Double] = v147[1]
    var v74: [[Double]] = v147
    var v63: Double = v38
    var v61: [Double] = v55
    let v54: [Double] = v74[3]
    v51[1] = v63
    let v103: Double = v54[0]
    v46[0] = v14
    let v80: Double = v61[0]
    v19 = v37
    let v151: Double = v8[0]
    let v133: Double = v31[2]
    let v93: Double = v80 / v103
    v73 = v84
    v46[1] = v37
    v8[2] = v151
    v4 = v133
    return v93
  }
  @inline(never)
  func f0(_ v0: [[s8]], _ v1: s11, _ v2: s1, _ v3: Double) -> Double {
    var v11: Double = v3
    var v18: Double = v11
    let v25: Double = f57(v18)
    return v25
  }
  func benchmark() {
    let v0: [[s8]] = [[s8(p0: s7(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [s4(p0: [s2(p0: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), p1: [10.0, 11.0])], p1: s2(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0]]), p1: [17.0, 18.0])), s4(p0: [s2(p0: s0(p0: [[19.0], [20.0], [21.0]], p1: [[22.0], [23.0]]), p1: [24.0, 25.0])], p1: s2(p0: s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0], [30.0]]), p1: [31.0, 32.0])), s4(p0: [s2(p0: s0(p0: [[33.0], [34.0], [35.0]], p1: [[36.0], [37.0]]), p1: [38.0, 39.0])], p1: s2(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: [45.0, 46.0]))]), p1: s1(p0: [s0(p0: [[47.0], [48.0], [49.0]], p1: [[50.0], [51.0]])], p1: [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0], [56.0]])]))]]
    let v1: s11 = s11(p0: [s10(p0: [s1(p0: [s0(p0: [[57.0], [58.0], [59.0]], p1: [[60.0], [61.0]])], p1: [s0(p0: [[62.0], [63.0], [64.0]], p1: [[65.0], [66.0]])]), s1(p0: [s0(p0: [[67.0], [68.0], [69.0]], p1: [[70.0], [71.0]])], p1: [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0]])])], p1: s0(p0: [[77.0], [78.0], [79.0]], p1: [[80.0], [81.0]])), s10(p0: [s1(p0: [s0(p0: [[82.0], [83.0], [84.0]], p1: [[85.0], [86.0]])], p1: [s0(p0: [[87.0], [88.0], [89.0]], p1: [[90.0], [91.0]])]), s1(p0: [s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0], [96.0]])], p1: [s0(p0: [[97.0], [98.0], [99.0]], p1: [[100.0], [101.0]])])], p1: s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0]])), s10(p0: [s1(p0: [s0(p0: [[107.0], [108.0], [109.0]], p1: [[110.0], [111.0]])], p1: [s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0], [116.0]])]), s1(p0: [s0(p0: [[117.0], [118.0], [119.0]], p1: [[120.0], [121.0]])], p1: [s0(p0: [[122.0], [123.0], [124.0]], p1: [[125.0], [126.0]])])], p1: s0(p0: [[127.0], [128.0], [129.0]], p1: [[130.0], [131.0]]))], p1: s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0], [136.0]]))
    let v2: s1 = s1(p0: [s0(p0: [[137.0], [138.0], [139.0]], p1: [[140.0], [141.0]])], p1: [s0(p0: [[142.0], [143.0], [144.0]], p1: [[145.0], [146.0]])])
    let v3: Double = 147.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 147.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
