  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  struct s3 {
    var p0: s0
    var p1: [[s0]]
    var p2: s2
  }
  struct s4 {
    var p0: [[s3]]
    var p1: [s3]
  }
  struct s5 {
    var p0: s4
    var p1: s1
  }
  func f3(_ v0: Double) -> Double {
    var v3: Double = v0
    var v6: Double = v3
    var v1: Double = v6
    var v9: Double = v6
    var v4: Double = v9
    var v7: Double = v9
    var v8: Double = v9
    var v14: Double = v6
    var v12: Double = v9
    let v10: Double = v4 * v7
    var v2: Double = v7
    var v5: Double = v12
    let v20: Double = v12 * v2
    var v19: Double = v4
    v7 = v20
    var v13: Double = v8
    var v25: Double = v8
    let v18: [Double] = [v25, v0, v19, v10, v19, v5]
    var v15: Double = v19
    let v24: Double = v15 - v7
    v25 = v10
    let v23: Double = v18[4]
    v19 = v0
    let v22: Double = v1 + v1
    var v30: [Double] = v18
    v30[3] = v20
    v30[4] = v24
    let v17: Double = v30[2]
    let v21: Double = v30[4]
    var v65: Double = v19
    v30[3] = v17
    let v47: [Double] = [v14, v21, v23, v12]
    var v54: [Double] = v47
    var v76: [Double] = v47
    let v55: Double = v54[1]
    v5 = v65
    let v123: Double = v76[1]
    var v93: [Double] = v47
    v30[5] = v123
    let v125: [[Double]] = [v93, v47, v76, v76, v93, v54, v76]
    var v120: [[Double]] = v125
    var v85: Double = v20
    v120[4] = v76
    v76[2] = v23
    let v86: [Double] = v120[2]
    v120[6] = v86
    let v56: [Double] = v120[1]
    let v91: Double = v56[0]
    v93[3] = v19
    var v112: Double = v91
    v30[1] = v85
    v76[1] = v55
    v120[4] = v86
    v30[3] = v13
    v9 = v22
    return v112
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v21: Double = f3(v1)
    let v180: Double = v1 / v21
    var v146: Double = v180
    let v207: Double = v146 * v1
    let v116: Double = f3(v180)
    let v295: Double = v116 / v207
    return v295
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s4(p0: [[s3(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])]], p2: s2(p0: [s1(p0: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])]), s1(p0: [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])]), s1(p0: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])])], p1: s1(p0: [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])])))]], p1: [s3(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: [[s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])], [s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])], [s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])]], p2: s2(p0: [s1(p0: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]])]), s1(p0: [s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]])]), s1(p0: [s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]])])], p1: s1(p0: [s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]])])))]), p1: s1(p0: [s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]])])), s5(p0: s4(p0: [[s3(p0: s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]]), p1: [[s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]])], [s0(p0: [[95.0], [96.0], [97.0]], p1: [[98.0], [99.0]])], [s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0], [104.0]])]], p2: s2(p0: [s1(p0: [s0(p0: [[105.0], [106.0], [107.0]], p1: [[108.0], [109.0]])]), s1(p0: [s0(p0: [[110.0], [111.0], [112.0]], p1: [[113.0], [114.0]])]), s1(p0: [s0(p0: [[115.0], [116.0], [117.0]], p1: [[118.0], [119.0]])])], p1: s1(p0: [s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0]])])))]], p1: [s3(p0: s0(p0: [[125.0], [126.0], [127.0]], p1: [[128.0], [129.0]]), p1: [[s0(p0: [[130.0], [131.0], [132.0]], p1: [[133.0], [134.0]])], [s0(p0: [[135.0], [136.0], [137.0]], p1: [[138.0], [139.0]])], [s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0], [144.0]])]], p2: s2(p0: [s1(p0: [s0(p0: [[145.0], [146.0], [147.0]], p1: [[148.0], [149.0]])]), s1(p0: [s0(p0: [[150.0], [151.0], [152.0]], p1: [[153.0], [154.0]])]), s1(p0: [s0(p0: [[155.0], [156.0], [157.0]], p1: [[158.0], [159.0]])])], p1: s1(p0: [s0(p0: [[160.0], [161.0], [162.0]], p1: [[163.0], [164.0]])])))]), p1: s1(p0: [s0(p0: [[165.0], [166.0], [167.0]], p1: [[168.0], [169.0]])]))]
    let v1: Double = 170.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 170.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
