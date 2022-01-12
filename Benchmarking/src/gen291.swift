  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s4 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s5 {
    var p0: s4
    var p1: s1
  }
  func f57(_ v0: Double) -> Double {
    let v6: [Double] = [v0, v0, v0, v0, v0, v0]
    var v1: [Double] = v6
    let v9: Double = v6[4]
    v1[4] = v9
    let v4: Double = v1[5]
    var v2: Double = v4
    v1[3] = v2
    var v3: Double = v0
    v1[4] = v3
    var v13: [Double] = v6
    v13[2] = v2
    var v5: [Double] = v13
    v5[5] = v4
    let v11: Double = v6[1]
    let v7: Double = v6[3]
    let v16: Double = v6[5]
    var v25: Double = v9
    var v23: [Double] = v6
    v1[5] = v25
    v23[5] = v7
    var v21: Double = v16
    var v27: [Double] = v1
    var v17: [Double] = v5
    let v19: Double = v13[0]
    v5[1] = v3
    var v37: [Double] = v27
    let v22: Double = v37[4]
    let v46: Double = v17[4]
    let v50: Double = v6[5]
    var v43: Double = v50
    v13[4] = v22
    var v26: Double = v21
    var v24: [Double] = v23
    var v29: [Double] = v5
    let v52: Double = v13[2]
    v5[2] = v43
    let v70: Double = v24[3]
    var v41: Double = v21
    var v55: Double = v22
    v24 = v27
    var v61: Double = v55
    v37[1] = v21
    let v33: Double = v29[1]
    var v59: [Double] = v29
    var v42: [Double] = v1
    v42[3] = v0
    v37[2] = v4
    let v32: [[Double]] = [v42, v17, v27]
    var v77: [[Double]] = v32
    v5[4] = v21
    let v68: [[[Double]]] = [v77, v32, v77, v77, v77, v32]
    v23[1] = v16
    let v80: [Double] = v77[1]
    v13[3] = v11
    var v86: [Double] = v42
    let v89: [[Double]] = v68[0]
    v77 = v89
    v29[2] = v3
    v29[0] = v26
    v5[0] = v0
    v24[4] = v61
    v5[4] = v19
    v17[5] = v50
    let v62: Double = v80[3]
    var v157: [Double] = v86
    v27[1] = v46
    v17[5] = v50
    v23 = v59
    v42[3] = v70
    let v159: [Double] = [v41, v50]
    let v91: Double = v159[0]
    v157 = v42
    var v174: [Double] = v159
    let v127: Double = v52 * v33
    v174[0] = v11
    v23[0] = v91
    v17[4] = v127
    v1[3] = v46
    let v253: Double = v174[1]
    v13[1] = v21
    v13[5] = v253
    v77[0] = v157
    return v62
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v8: Double = f57(v1)
    let v64: Double = f57(v1)
    let v59: Double = v8 - v64
    return v59
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s4(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], p1: [s1(p0: [[s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])], [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]], p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])]), s1(p0: [[s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])], [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])], [s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]], p1: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]]), s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]])]), s1(p0: [[s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]])], [s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])], [s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0], [95.0]])]], p1: [s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0], [100.0], [101.0]]), s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0], [107.0]]), s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0], [112.0], [113.0]])])]), p1: s1(p0: [[s0(p0: [[114.0], [115.0], [116.0]], p1: [[117.0], [118.0], [119.0]])], [s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0], [125.0]])], [s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0], [130.0], [131.0]])]], p1: [s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0], [136.0], [137.0]]), s0(p0: [[138.0], [139.0], [140.0]], p1: [[141.0], [142.0], [143.0]]), s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0], [148.0], [149.0]])]))]
    let v1: Double = 150.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 150.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
