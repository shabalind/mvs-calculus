  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s4 {
    var p0: [s1]
    var p1: [[s1]]
  }
  struct s5 {
    var p0: [s3]
    var p1: s1
  }
  func f108(_ v0: Double) -> Double {
    var v1: Double = v0
    var v2: Double = v1
    var v5: Double = v2
    var v7: Double = v0
    var v10: Double = v0
    var v8: Double = v2
    var v4: Double = v2
    var v6: Double = v4
    var v11: Double = v8
    var v12: Double = v1
    var v13: Double = v10
    var v9: Double = v1
    var v19: Double = v6
    var v18: Double = v19
    var v17: Double = v11
    var v23: Double = v7
    v18 = v0
    var v27: Double = v6
    var v28: Double = v6
    var v61: Double = v7
    v7 = v0
    var v36: Double = v61
    var v16: Double = v0
    var v53: Double = v9
    var v33: Double = v23
    var v46: Double = v27
    var v31: Double = v46
    var v39: Double = v18
    var v40: Double = v5
    var v64: Double = v0
    var v34: Double = v16
    var v50: Double = v17
    var v63: Double = v13
    var v49: Double = v64
    let v41: Double = v61 + v31
    var v48: Double = v41
    var v77: Double = v34
    v19 = v48
    v6 = v39
    v49 = v28
    var v74: Double = v53
    v46 = v31
    var v51: Double = v33
    var v174: Double = v40
    v13 = v5
    let v258: Double = v1 * v50
    let v204: [Double] = [v77, v51, v49, v174, v258]
    let v59: [[Double]] = [v204, v204]
    let v88: [Double] = v59[1]
    var v161: [[Double]] = v59
    var v120: [[Double]] = v161
    v6 = v36
    v120[1] = v88
    v120[1] = v204
    var v70: [[Double]] = v120
    var v97: [[Double]] = v161
    let v131: [Double] = v97[0]
    let v114: [Double] = v120[1]
    let v109: [Double] = v70[1]
    v70[1] = v131
    v161[1] = v88
    v120[0] = v114
    v97[1] = v109
    var v87: [Double] = v204
    v87[1] = v12
    v87[4] = v63
    v70[1] = v87
    v87[4] = v74
    let v302: Double = v109[2]
    return v302
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: s0, _ v2: s4, _ v3: Double) -> Double {
    let v7: Double = f108(v3)
    let v16: Double = f108(v7)
    var v27: Double = v16
    return v27
  }
  func benchmark() {
    let v0: s5 = s5(p0: [s3(p0: [s0(p0: [0.0, 1.0], p1: [[2.0], [3.0], [4.0]]), s0(p0: [5.0, 6.0], p1: [[7.0], [8.0], [9.0]]), s0(p0: [10.0, 11.0], p1: [[12.0], [13.0], [14.0]])], p1: [s1(p0: s0(p0: [15.0, 16.0], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [20.0, 21.0], p1: [[22.0], [23.0], [24.0]])), s1(p0: s0(p0: [25.0, 26.0], p1: [[27.0], [28.0], [29.0]]), p1: s0(p0: [30.0, 31.0], p1: [[32.0], [33.0], [34.0]]))]), s3(p0: [s0(p0: [35.0, 36.0], p1: [[37.0], [38.0], [39.0]]), s0(p0: [40.0, 41.0], p1: [[42.0], [43.0], [44.0]]), s0(p0: [45.0, 46.0], p1: [[47.0], [48.0], [49.0]])], p1: [s1(p0: s0(p0: [50.0, 51.0], p1: [[52.0], [53.0], [54.0]]), p1: s0(p0: [55.0, 56.0], p1: [[57.0], [58.0], [59.0]])), s1(p0: s0(p0: [60.0, 61.0], p1: [[62.0], [63.0], [64.0]]), p1: s0(p0: [65.0, 66.0], p1: [[67.0], [68.0], [69.0]]))]), s3(p0: [s0(p0: [70.0, 71.0], p1: [[72.0], [73.0], [74.0]]), s0(p0: [75.0, 76.0], p1: [[77.0], [78.0], [79.0]]), s0(p0: [80.0, 81.0], p1: [[82.0], [83.0], [84.0]])], p1: [s1(p0: s0(p0: [85.0, 86.0], p1: [[87.0], [88.0], [89.0]]), p1: s0(p0: [90.0, 91.0], p1: [[92.0], [93.0], [94.0]])), s1(p0: s0(p0: [95.0, 96.0], p1: [[97.0], [98.0], [99.0]]), p1: s0(p0: [100.0, 101.0], p1: [[102.0], [103.0], [104.0]]))])], p1: s1(p0: s0(p0: [105.0, 106.0], p1: [[107.0], [108.0], [109.0]]), p1: s0(p0: [110.0, 111.0], p1: [[112.0], [113.0], [114.0]])))
    let v1: s0 = s0(p0: [115.0, 116.0], p1: [[117.0], [118.0], [119.0]])
    let v2: s4 = s4(p0: [s1(p0: s0(p0: [120.0, 121.0], p1: [[122.0], [123.0], [124.0]]), p1: s0(p0: [125.0, 126.0], p1: [[127.0], [128.0], [129.0]]))], p1: [[s1(p0: s0(p0: [130.0, 131.0], p1: [[132.0], [133.0], [134.0]]), p1: s0(p0: [135.0, 136.0], p1: [[137.0], [138.0], [139.0]]))], [s1(p0: s0(p0: [140.0, 141.0], p1: [[142.0], [143.0], [144.0]]), p1: s0(p0: [145.0, 146.0], p1: [[147.0], [148.0], [149.0]]))], [s1(p0: s0(p0: [150.0, 151.0], p1: [[152.0], [153.0], [154.0]]), p1: s0(p0: [155.0, 156.0], p1: [[157.0], [158.0], [159.0]]))]])
    let v3: Double = 160.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 160.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
