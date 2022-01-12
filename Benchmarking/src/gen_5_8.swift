  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  func f38(_ v0: Double) -> Double {
    var v4: Double = v0
    var v7: Double = v4
    var v8: Double = v4
    let v6: Double = v0 + v8
    var v5: Double = v4
    var v2: Double = v5
    let v3: [Double] = [v4, v2, v7, v4]
    let v1: Double = v3[2]
    let v10: Double = v3[0]
    let v9: Double = v0 / v4
    let v46: Double = v0 - v1
    v5 = v1
    var v11: [Double] = v3
    var v18: Double = v0
    var v12: Double = v7
    let v14: [[Double]] = [v11]
    let v21: Double = v9 - v4
    let v17: [Double] = v14[0]
    var v29: Double = v6
    var v34: Double = v18
    v11[3] = v34
    let v24: Double = v17[2]
    let v35: Double = v11[3]
    let v45: [Double] = [v24, v4, v29, v35, v10, v46, v4]
    var v31: [Double] = v45
    var v41: Double = v5
    let v57: Double = v9 / v12
    v31[6] = v29
    var v87: [Double] = v17
    v11[3] = v6
    let v70: Double = v87[3]
    v11[3] = v41
    v11[0] = v57
    let v49: Double = v45[6]
    var v80: [Double] = v31
    v80[4] = v49
    let v82: Double = v80[0]
    v12 = v70
    v11[1] = v21
    return v82
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: [s0], _ v3: [s1], _ v4: [[s0]], _ v5: [s1], _ v6: [[s1]], _ v7: Double) -> Double {
    let v8: Double = f38(v7)
    let v30: Double = f38(v7)
    let v32: Double = v8 + v7
    let v56: Double = v32 / v30
    let v34: [Double] = [v56, v56]
    let v58: Double = v8 - v30
    let v98: Double = v34[0]
    let v119: Double = v98 + v58
    return v119
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])]
    let v1: [s0] = [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]
    let v2: [s0] = [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])]
    let v3: [s1] = [s1(p0: [[s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])]], p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])])]
    let v4: [[s0]] = [[s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])], [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])]]
    let v5: [s1] = [s1(p0: [[s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])]], p1: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]), s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]])]), s1(p0: [[s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])]], p1: [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]]), s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]]), s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]])])]
    let v6: [[s1]] = [[s1(p0: [[s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]])]], p1: [s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]), s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]]), s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]])])], [s1(p0: [[s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]])]], p1: [s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]]), s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]]), s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]])])], [s1(p0: [[s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0]])]], p1: [s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]]), s0(p0: [[124.0], [125.0], [126.0]], p1: [[127.0]]), s0(p0: [[128.0], [129.0], [130.0]], p1: [[131.0]])])]]
    let v7: Double = 132.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 132.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
