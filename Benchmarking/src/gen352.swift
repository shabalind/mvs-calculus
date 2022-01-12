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
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: [[s2]]
    var p1: [[s0]]
  }
  func f83(_ v0: Double) -> Double {
    var v1: Double = v0
    var v7: Double = v0
    var v3: Double = v0
    let v4: [Double] = [v3, v0, v7, v3, v1, v3, v0]
    let v6: Double = v4[6]
    let v2: Double = v4[1]
    let v11: Double = v6 / v2
    let v8: Double = v4[0]
    v3 = v1
    let v10: Double = v4[1]
    var v13: [Double] = v4
    var v19: [Double] = v4
    v13[4] = v8
    v19[1] = v11
    v19[6] = v11
    let v51: Double = v19[4]
    let v35: Double = v13[1]
    v19[6] = v1
    var v33: Double = v6
    v19[1] = v6
    v19[5] = v1
    var v62: Double = v10
    v19[2] = v62
    let v61: [Double] = [v33, v0, v51]
    var v50: [Double] = v61
    var v37: [Double] = v50
    v19[6] = v35
    var v69: [Double] = v37
    let v88: Double = v69[2]
    return v88
  }
  func f60(_ v0: Double) -> Double {
    let v7: Double = f83(v0)
    let v3: Double = f83(v7)
    let v1: Double = f83(v0)
    let v12: Double = f83(v0)
    let v4: Double = f83(v3)
    let v8: Double = f83(v7)
    let v6: Double = f83(v8)
    let v5: Double = f83(v3)
    let v19: Double = v12 + v8
    var v11: Double = v5
    var v22: Double = v1
    let v21: Double = f83(v22)
    var v37: Double = v11
    let v61: [Double] = [v37]
    let v30: Double = v61[0]
    let v73: Double = f83(v0)
    let v29: Double = f83(v73)
    var v79: Double = v4
    var v55: [Double] = v61
    var v58: [Double] = v55
    v58[0] = v37
    v58[0] = v6
    var v51: [Double] = v58
    v58[0] = v29
    v58[0] = v19
    var v78: [Double] = v51
    v78[0] = v21
    v58[0] = v79
    v78[0] = v73
    let v70: [[Double]] = [v61, v78]
    var v99: [[Double]] = v70
    let v173: [Double] = v99[0]
    let v140: Double = v173[0]
    v51[0] = v30
    return v140
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s3, _ v2: s0, _ v3: [s3], _ v4: [[s0]], _ v5: Double) -> Double {
    var v6: s0 = v2
    let v13: [[Double]] = v6.p0
    var v20: [[Double]] = v13
    let v23: [Double] = v20[0]
    let v24: Double = v23[0]
    let v27: Double = v23[0]
    v20[0] = v23
    let v80: Double = v5 + v24
    let v76: Double = v80 - v27
    let v376: Double = f60(v76)
    return v376
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s2(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])), s1(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])), s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]))], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]))]], p1: [[s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])], [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]])], [s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])]])
    let v1: s3 = s3(p0: [[s2(p0: [s1(p0: s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]), p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])), s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]]), p1: s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]])), s1(p0: s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]]), p1: s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]]))], p1: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]]))]], p1: [[s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]])], [s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]])], [s0(p0: [[95.0], [96.0], [97.0]], p1: [[98.0], [99.0]])]])
    let v2: s0 = s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0], [104.0]])
    let v3: [s3] = [s3(p0: [[s2(p0: [s1(p0: s0(p0: [[105.0], [106.0], [107.0]], p1: [[108.0], [109.0]]), p1: s0(p0: [[110.0], [111.0], [112.0]], p1: [[113.0], [114.0]])), s1(p0: s0(p0: [[115.0], [116.0], [117.0]], p1: [[118.0], [119.0]]), p1: s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0]])), s1(p0: s0(p0: [[125.0], [126.0], [127.0]], p1: [[128.0], [129.0]]), p1: s0(p0: [[130.0], [131.0], [132.0]], p1: [[133.0], [134.0]]))], p1: s0(p0: [[135.0], [136.0], [137.0]], p1: [[138.0], [139.0]]))]], p1: [[s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0], [144.0]])], [s0(p0: [[145.0], [146.0], [147.0]], p1: [[148.0], [149.0]])], [s0(p0: [[150.0], [151.0], [152.0]], p1: [[153.0], [154.0]])]])]
    let v4: [[s0]] = [[s0(p0: [[155.0], [156.0], [157.0]], p1: [[158.0], [159.0]])], [s0(p0: [[160.0], [161.0], [162.0]], p1: [[163.0], [164.0]])], [s0(p0: [[165.0], [166.0], [167.0]], p1: [[168.0], [169.0]])]]
    let v5: Double = 170.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 170.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
