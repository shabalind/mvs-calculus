  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
    var p1: [s2]
  }
  struct s5 {
    var p0: s3
    var p1: [s0]
  }
  func f14(_ v0: Double) -> Double {
    var v7: Double = v0
    var v6: Double = v7
    var v4: Double = v7
    var v5: Double = v0
    v5 = v4
    v4 = v6
    var v11: Double = v5
    var v3: Double = v11
    v4 = v7
    var v9: Double = v7
    var v15: Double = v9
    let v16: Double = v6 * v15
    var v1: Double = v11
    v9 = v3
    let v31: [Double] = [v1]
    v11 = v16
    var v58: [Double] = v31
    v58[0] = v15
    let v36: Double = v58[0]
    let v42: Double = v58[0]
    v58[0] = v3
    v58[0] = v36
    v58[0] = v7
    v58[0] = v9
    var v38: [Double] = v58
    var v81: Double = v42
    let v69: [[Double]] = [v38]
    var v79: [[Double]] = v69
    v38[0] = v81
    var v138: [[Double]] = v79
    let v68: [Double] = v79[0]
    v38[0] = v36
    v138[0] = v68
    let v108: [Double] = v138[0]
    let v176: Double = v108[0]
    return v176
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: [s0], _ v2: [s2], _ v3: Double) -> Double {
    let v5: Double = f14(v3)
    var v13: [s2] = v2
    let v16: s2 = v13[0]
    v13[1] = v16
    let v17: s0 = v16.p1
    let v10: s0 = v16.p1
    let v14: s2 = s2(p0: v17, p1: v17)
    v13[0] = v14
    let v26: [[Double]] = v10.p0
    let v19: [Double] = v26[1]
    v13[0] = v16
    let v31: Double = v19[0]
    let v49: Double = v5 + v31
    return v49
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s3(p0: [s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]))], p1: [s2(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]))]), p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])]), s5(p0: s3(p0: [s2(p0: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]))], p1: [s2(p0: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]), p1: s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]))]), p1: [s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]]), s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]])]), s5(p0: s3(p0: [s2(p0: s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]]), p1: s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]]))], p1: [s2(p0: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]]), p1: s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]]))]), p1: [s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]]), s0(p0: [[95.0], [96.0], [97.0]], p1: [[98.0], [99.0]]), s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0], [104.0]])])]
    let v1: [s0] = [s0(p0: [[105.0], [106.0], [107.0]], p1: [[108.0], [109.0]]), s0(p0: [[110.0], [111.0], [112.0]], p1: [[113.0], [114.0]])]
    let v2: [s2] = [s2(p0: s0(p0: [[115.0], [116.0], [117.0]], p1: [[118.0], [119.0]]), p1: s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0]])), s2(p0: s0(p0: [[125.0], [126.0], [127.0]], p1: [[128.0], [129.0]]), p1: s0(p0: [[130.0], [131.0], [132.0]], p1: [[133.0], [134.0]]))]
    let v3: Double = 135.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 135.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
