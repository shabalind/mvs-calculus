  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: s0
    var p3: [s0]
  }
  struct s3 {
    var p0: [s1]
    var p1: s1
  }
  struct s6 {
    var p0: s3
    var p1: [s3]
  }
  func f31(_ v0: Double) -> Double {
    let v6: [Double] = [v0, v0, v0]
    var v4: [Double] = v6
    let v3: Double = v6[1]
    v4[2] = v3
    var v2: Double = v3
    v4[2] = v0
    let v5: Double = v4[2]
    var v7: [Double] = v4
    var v1: [Double] = v7
    var v12: Double = v2
    let v13: [Double] = [v5]
    var v14: [Double] = v13
    var v8: [Double] = v1
    let v17: Double = v4[0]
    let v36: Double = v13[0]
    v14 = v13
    var v26: [Double] = v8
    v1 = v6
    v4[2] = v17
    var v10: [Double] = v14
    let v33: Double = v10[0]
    v7[1] = v3
    v8[2] = v36
    var v37: [Double] = v8
    var v42: [Double] = v13
    let v19: Double = v14[0]
    let v21: Double = v26[2]
    v4[0] = v19
    let v61: Double = v8[2]
    let v44: Double = v42[0]
    v26[0] = v36
    var v49: Double = v61
    let v27: Double = v4[1]
    v10[0] = v33
    let v83: Double = v37[0]
    v8[1] = v12
    v7[1] = v61
    v1[2] = v44
    v37[0] = v49
    var v86: Double = v33
    let v57: Double = v2 + v21
    var v130: Double = v83
    let v164: Double = v44 / v33
    v4[1] = v36
    let v102: [Double] = [v3, v164, v57, v130]
    v1[0] = v27
    var v111: [Double] = v102
    v4[1] = v86
    var v156: [Double] = v111
    let v139: Double = v156[1]
    return v139
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    let v7: Double = f31(v1)
    var v2: Double = v7
    var v5: Double = v2
    var v35: Double = v5
    let v33: Double = f31(v5)
    var v60: Double = v35
    v5 = v33
    return v60
  }
  func benchmark() {
    let v0: s6 = s6(p0: s3(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [[s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]], p2: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p3: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])]), s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: [[s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])], [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])]], p2: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), p3: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])]), s1(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), p1: [[s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])], [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])]], p2: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]), p3: [s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]]), s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])])], p1: s1(p0: s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]]), p1: [[s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]])], [s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]])]], p2: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]]), p3: [s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]), s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]])])), p1: [s3(p0: [s1(p0: s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]]), p1: [[s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]])], [s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]])]], p2: s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]]), p3: [s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]]), s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0]])]), s1(p0: s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]]), p1: [[s0(p0: [[124.0], [125.0], [126.0]], p1: [[127.0]])], [s0(p0: [[128.0], [129.0], [130.0]], p1: [[131.0]])]], p2: s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0]]), p3: [s0(p0: [[136.0], [137.0], [138.0]], p1: [[139.0]]), s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0]])]), s1(p0: s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0]]), p1: [[s0(p0: [[148.0], [149.0], [150.0]], p1: [[151.0]])], [s0(p0: [[152.0], [153.0], [154.0]], p1: [[155.0]])]], p2: s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0]]), p3: [s0(p0: [[160.0], [161.0], [162.0]], p1: [[163.0]]), s0(p0: [[164.0], [165.0], [166.0]], p1: [[167.0]])])], p1: s1(p0: s0(p0: [[168.0], [169.0], [170.0]], p1: [[171.0]]), p1: [[s0(p0: [[172.0], [173.0], [174.0]], p1: [[175.0]])], [s0(p0: [[176.0], [177.0], [178.0]], p1: [[179.0]])]], p2: s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0]]), p3: [s0(p0: [[184.0], [185.0], [186.0]], p1: [[187.0]]), s0(p0: [[188.0], [189.0], [190.0]], p1: [[191.0]])])), s3(p0: [s1(p0: s0(p0: [[192.0], [193.0], [194.0]], p1: [[195.0]]), p1: [[s0(p0: [[196.0], [197.0], [198.0]], p1: [[199.0]])], [s0(p0: [[200.0], [201.0], [202.0]], p1: [[203.0]])]], p2: s0(p0: [[204.0], [205.0], [206.0]], p1: [[207.0]]), p3: [s0(p0: [[208.0], [209.0], [210.0]], p1: [[211.0]]), s0(p0: [[212.0], [213.0], [214.0]], p1: [[215.0]])]), s1(p0: s0(p0: [[216.0], [217.0], [218.0]], p1: [[219.0]]), p1: [[s0(p0: [[220.0], [221.0], [222.0]], p1: [[223.0]])], [s0(p0: [[224.0], [225.0], [226.0]], p1: [[227.0]])]], p2: s0(p0: [[228.0], [229.0], [230.0]], p1: [[231.0]]), p3: [s0(p0: [[232.0], [233.0], [234.0]], p1: [[235.0]]), s0(p0: [[236.0], [237.0], [238.0]], p1: [[239.0]])]), s1(p0: s0(p0: [[240.0], [241.0], [242.0]], p1: [[243.0]]), p1: [[s0(p0: [[244.0], [245.0], [246.0]], p1: [[247.0]])], [s0(p0: [[248.0], [249.0], [250.0]], p1: [[251.0]])]], p2: s0(p0: [[252.0], [253.0], [254.0]], p1: [[255.0]]), p3: [s0(p0: [[256.0], [257.0], [258.0]], p1: [[259.0]]), s0(p0: [[260.0], [261.0], [262.0]], p1: [[263.0]])])], p1: s1(p0: s0(p0: [[264.0], [265.0], [266.0]], p1: [[267.0]]), p1: [[s0(p0: [[268.0], [269.0], [270.0]], p1: [[271.0]])], [s0(p0: [[272.0], [273.0], [274.0]], p1: [[275.0]])]], p2: s0(p0: [[276.0], [277.0], [278.0]], p1: [[279.0]]), p3: [s0(p0: [[280.0], [281.0], [282.0]], p1: [[283.0]]), s0(p0: [[284.0], [285.0], [286.0]], p1: [[287.0]])]))])
    let v1: Double = 288.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 288.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
