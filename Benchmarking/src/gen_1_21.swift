  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [[s0]]
    var p1: [s0]
    var p2: [s0]
  }
  struct s4 {
    var p0: s3
    var p1: s0
  }
  struct s7 {
    var p0: s1
    var p1: s4
  }
  struct s8 {
    var p0: [s7]
    var p1: s7
  }
  func f22(_ v0: Double) -> Double {
    var v5: Double = v0
    var v1: Double = v5
    var v2: Double = v5
    let v7: Double = v2 - v0
    var v6: Double = v7
    var v3: Double = v5
    var v11: Double = v2
    var v27: Double = v2
    let v18: [Double] = [v3, v2, v27, v0]
    var v15: [Double] = v18
    v15[3] = v7
    v15[0] = v6
    v15[0] = v27
    var v52: [Double] = v15
    v52[0] = v11
    v27 = v5
    v52[0] = v5
    v52[2] = v1
    let v76: Double = v52[2]
    return v76
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    var v8: Double = v1
    let v2: Double = f22(v8)
    let v23: Double = f22(v2)
    let v17: Double = f22(v8)
    let v22: Double = f22(v1)
    let v27: Double = v23 + v17
    var v24: Double = v1
    let v33: Double = f22(v17)
    let v53: Double = v24 + v33
    v8 = v23
    let v75: Double = f22(v22)
    let v100: Double = v53 / v75
    let v309: Double = v27 - v100
    return v309
  }
  func benchmark() {
    let v0: s8 = s8(p0: [s7(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])), p1: s4(p0: s3(p0: [[s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]], p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])], p2: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])]), p1: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]))), s7(p0: s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])], p1: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])), p1: s4(p0: s3(p0: [[s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])]], p1: [s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]])], p2: [s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]), s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])]), p1: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]))), s7(p0: s1(p0: [s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]), s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]]), s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]])], p1: s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]])), p1: s4(p0: s3(p0: [[s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]])]], p1: [s0(p0: [[92.0], [93.0]], p1: [[94.0], [95.0]])], p2: [s0(p0: [[96.0], [97.0]], p1: [[98.0], [99.0]]), s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0]])]), p1: s0(p0: [[104.0], [105.0]], p1: [[106.0], [107.0]])))], p1: s7(p0: s1(p0: [s0(p0: [[108.0], [109.0]], p1: [[110.0], [111.0]]), s0(p0: [[112.0], [113.0]], p1: [[114.0], [115.0]]), s0(p0: [[116.0], [117.0]], p1: [[118.0], [119.0]])], p1: s0(p0: [[120.0], [121.0]], p1: [[122.0], [123.0]])), p1: s4(p0: s3(p0: [[s0(p0: [[124.0], [125.0]], p1: [[126.0], [127.0]])]], p1: [s0(p0: [[128.0], [129.0]], p1: [[130.0], [131.0]])], p2: [s0(p0: [[132.0], [133.0]], p1: [[134.0], [135.0]]), s0(p0: [[136.0], [137.0]], p1: [[138.0], [139.0]])]), p1: s0(p0: [[140.0], [141.0]], p1: [[142.0], [143.0]]))))
    let v1: Double = 144.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 144.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
