  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
    var p2: s0
    var p3: [s0]
    var p4: [[s0]]
    var p5: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  func f51(_ v0: [Double]) -> [Double] {
    var v5: [Double] = v0
    let v1: Double = v0[0]
    var v7: Double = v1
    var v2: [Double] = v5
    var v23: [Double] = v2
    var v17: [Double] = v0
    let v13: Double = v23[0]
    var v15: Double = v7
    var v22: [Double] = v2
    let v47: Double = v23[1]
    v5[1] = v15
    var v27: [Double] = v22
    var v70: [Double] = v0
    v22[0] = v13
    var v33: Double = v47
    v5 = v70
    v5[1] = v33
    v5 = v17
    v22[1] = v15
    return v27
  }
  func f48(_ v0: s0, _ v1: s0) -> s0 {
    return v1
  }
  func f31(_ v0: [[Double]], _ v1: s0) -> [[Double]] {
    let v6: [[Double]] = v1.p1
    let v19: [Double] = v1.p0
    let v17: s0 = s0(p0: v19, p1: v6)
    let v14: s0 = f48(v17, v17)
    let v22: [[Double]] = v14.p1
    return v22
  }
  func f22(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p1
    let v4: [Double] = v2[2]
    var v9: s0 = v0
    var v7: [[Double]] = v2
    var v6: [[Double]] = v7
    let v3: [[Double]] = f31(v7, v0)
    let v1: s0 = f48(v0, v0)
    let v13: [Double] = v9.p0
    let v17: s0 = s0(p0: v13, p1: v6)
    v6[0] = v4
    let v27: [Double] = f51(v13)
    v7[0] = v4
    let v11: [Double] = v9.p0
    let v14: s0 = f48(v9, v1)
    let v24: [Double] = f51(v11)
    var v29: [Double] = v27
    var v40: [Double] = v24
    v9.p1 = v3
    v9.p0 = v40
    v9.p1 = v6
    let v46: [[Double]] = v14.p1
    v9.p0 = v29
    v6 = v46
    let v30: s0 = f48(v9, v17)
    return v30
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    var v2: [s2] = v0
    let v6: s2 = v2[2]
    let v10: s1 = v6.p0
    let v13: [[s0]] = v10.p5
    let v23: s2 = v2[0]
    let v12: s1 = v23.p0
    let v18: [s0] = v13[0]
    let v24: [[s0]] = v12.p4
    var v29: [[s0]] = v24
    let v27: [s0] = v29[1]
    v2[1] = v23
    v29[1] = v18
    let v73: s0 = v27[0]
    let v59: [s0] = v13[0]
    let v123: s0 = f22(v73)
    v29[1] = v59
    let v248: [[Double]] = v123.p1
    let v126: [Double] = v248[2]
    let v214: Double = v126[0]
    return v214
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: [s0(p0: [0.0, 1.0], p1: [[2.0], [3.0], [4.0]]), s0(p0: [5.0, 6.0], p1: [[7.0], [8.0], [9.0]])], p1: [[s0(p0: [10.0, 11.0], p1: [[12.0], [13.0], [14.0]])]], p2: s0(p0: [15.0, 16.0], p1: [[17.0], [18.0], [19.0]]), p3: [s0(p0: [20.0, 21.0], p1: [[22.0], [23.0], [24.0]]), s0(p0: [25.0, 26.0], p1: [[27.0], [28.0], [29.0]]), s0(p0: [30.0, 31.0], p1: [[32.0], [33.0], [34.0]])], p4: [[s0(p0: [35.0, 36.0], p1: [[37.0], [38.0], [39.0]])], [s0(p0: [40.0, 41.0], p1: [[42.0], [43.0], [44.0]])]], p5: [[s0(p0: [45.0, 46.0], p1: [[47.0], [48.0], [49.0]])]]), p1: s0(p0: [50.0, 51.0], p1: [[52.0], [53.0], [54.0]])), s2(p0: s1(p0: [s0(p0: [55.0, 56.0], p1: [[57.0], [58.0], [59.0]]), s0(p0: [60.0, 61.0], p1: [[62.0], [63.0], [64.0]])], p1: [[s0(p0: [65.0, 66.0], p1: [[67.0], [68.0], [69.0]])]], p2: s0(p0: [70.0, 71.0], p1: [[72.0], [73.0], [74.0]]), p3: [s0(p0: [75.0, 76.0], p1: [[77.0], [78.0], [79.0]]), s0(p0: [80.0, 81.0], p1: [[82.0], [83.0], [84.0]]), s0(p0: [85.0, 86.0], p1: [[87.0], [88.0], [89.0]])], p4: [[s0(p0: [90.0, 91.0], p1: [[92.0], [93.0], [94.0]])], [s0(p0: [95.0, 96.0], p1: [[97.0], [98.0], [99.0]])]], p5: [[s0(p0: [100.0, 101.0], p1: [[102.0], [103.0], [104.0]])]]), p1: s0(p0: [105.0, 106.0], p1: [[107.0], [108.0], [109.0]])), s2(p0: s1(p0: [s0(p0: [110.0, 111.0], p1: [[112.0], [113.0], [114.0]]), s0(p0: [115.0, 116.0], p1: [[117.0], [118.0], [119.0]])], p1: [[s0(p0: [120.0, 121.0], p1: [[122.0], [123.0], [124.0]])]], p2: s0(p0: [125.0, 126.0], p1: [[127.0], [128.0], [129.0]]), p3: [s0(p0: [130.0, 131.0], p1: [[132.0], [133.0], [134.0]]), s0(p0: [135.0, 136.0], p1: [[137.0], [138.0], [139.0]]), s0(p0: [140.0, 141.0], p1: [[142.0], [143.0], [144.0]])], p4: [[s0(p0: [145.0, 146.0], p1: [[147.0], [148.0], [149.0]])], [s0(p0: [150.0, 151.0], p1: [[152.0], [153.0], [154.0]])]], p5: [[s0(p0: [155.0, 156.0], p1: [[157.0], [158.0], [159.0]])]]), p1: s0(p0: [160.0, 161.0], p1: [[162.0], [163.0], [164.0]]))]
    let v1: Double = 165.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 165.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
