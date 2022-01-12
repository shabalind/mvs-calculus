  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: [s1]
  }
  struct s4 {
    var p0: [s1]
    var p1: [[s0]]
  }
  struct s5 {
    var p0: [[s2]]
    var p1: s2
  }
  struct s6 {
    var p0: s2
    var p1: s4
  }
  func f20(_ v0: Double) -> Double {
    var v6: Double = v0
    v6 = v0
    let v2: [Double] = [v0, v6, v0]
    let v3: Double = v2[1]
    var v1: Double = v6
    var v13: Double = v3
    let v9: Double = v6 - v6
    var v11: [Double] = v2
    let v8: Double = v1 + v13
    let v5: Double = v11[1]
    let v4: Double = v2[1]
    var v17: [Double] = v11
    var v23: [Double] = v2
    v11 = v17
    v11[1] = v8
    let v20: Double = v11[2]
    let v21: Double = v23[0]
    var v31: [Double] = v11
    v11[1] = v21
    let v28: Double = v31[1]
    let v16: Double = v23[2]
    v23[2] = v5
    var v26: [Double] = v11
    var v45: [Double] = v23
    var v33: Double = v4
    let v22: Double = v31[1]
    let v32: Double = v45[2]
    v23[2] = v28
    let v44: Double = v17[1]
    let v46: Double = v26[0]
    v45[2] = v28
    v11[1] = v44
    var v40: [Double] = v2
    v40[1] = v22
    v26[2] = v4
    v45[1] = v1
    let v50: Double = v0 / v1
    v45 = v17
    var v39: [Double] = v40
    let v35: Double = v23[0]
    var v64: Double = v0
    v45[1] = v20
    v6 = v16
    var v103: Double = v64
    var v57: Double = v9
    v45[2] = v35
    v1 = v33
    var v188: Double = v46
    v26[0] = v50
    v11[2] = v57
    v23[1] = v16
    v23[0] = v188
    var v86: [Double] = v39
    v39[0] = v103
    v17 = v86
    return v32
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: s5, _ v2: Double) -> Double {
    var v7: Double = v2
    let v16: Double = v7 / v7
    let v14: Double = f20(v16)
    return v14
  }
  func benchmark() {
    let v0: s6 = s6(p0: s2(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]]), p1: [s0(p0: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]])]), s1(p0: s0(p0: [[9.0], [10.0], [11.0]]), p1: [s0(p0: [[12.0], [13.0], [14.0]]), s0(p0: [[15.0], [16.0], [17.0]])])], p1: [s1(p0: s0(p0: [[18.0], [19.0], [20.0]]), p1: [s0(p0: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0], [25.0], [26.0]])]), s1(p0: s0(p0: [[27.0], [28.0], [29.0]]), p1: [s0(p0: [[30.0], [31.0], [32.0]]), s0(p0: [[33.0], [34.0], [35.0]])]), s1(p0: s0(p0: [[36.0], [37.0], [38.0]]), p1: [s0(p0: [[39.0], [40.0], [41.0]]), s0(p0: [[42.0], [43.0], [44.0]])])]), p1: s4(p0: [s1(p0: s0(p0: [[45.0], [46.0], [47.0]]), p1: [s0(p0: [[48.0], [49.0], [50.0]]), s0(p0: [[51.0], [52.0], [53.0]])])], p1: [[s0(p0: [[54.0], [55.0], [56.0]])], [s0(p0: [[57.0], [58.0], [59.0]])]]))
    let v1: s5 = s5(p0: [[s2(p0: [s1(p0: s0(p0: [[60.0], [61.0], [62.0]]), p1: [s0(p0: [[63.0], [64.0], [65.0]]), s0(p0: [[66.0], [67.0], [68.0]])]), s1(p0: s0(p0: [[69.0], [70.0], [71.0]]), p1: [s0(p0: [[72.0], [73.0], [74.0]]), s0(p0: [[75.0], [76.0], [77.0]])])], p1: [s1(p0: s0(p0: [[78.0], [79.0], [80.0]]), p1: [s0(p0: [[81.0], [82.0], [83.0]]), s0(p0: [[84.0], [85.0], [86.0]])]), s1(p0: s0(p0: [[87.0], [88.0], [89.0]]), p1: [s0(p0: [[90.0], [91.0], [92.0]]), s0(p0: [[93.0], [94.0], [95.0]])]), s1(p0: s0(p0: [[96.0], [97.0], [98.0]]), p1: [s0(p0: [[99.0], [100.0], [101.0]]), s0(p0: [[102.0], [103.0], [104.0]])])])]], p1: s2(p0: [s1(p0: s0(p0: [[105.0], [106.0], [107.0]]), p1: [s0(p0: [[108.0], [109.0], [110.0]]), s0(p0: [[111.0], [112.0], [113.0]])]), s1(p0: s0(p0: [[114.0], [115.0], [116.0]]), p1: [s0(p0: [[117.0], [118.0], [119.0]]), s0(p0: [[120.0], [121.0], [122.0]])])], p1: [s1(p0: s0(p0: [[123.0], [124.0], [125.0]]), p1: [s0(p0: [[126.0], [127.0], [128.0]]), s0(p0: [[129.0], [130.0], [131.0]])]), s1(p0: s0(p0: [[132.0], [133.0], [134.0]]), p1: [s0(p0: [[135.0], [136.0], [137.0]]), s0(p0: [[138.0], [139.0], [140.0]])]), s1(p0: s0(p0: [[141.0], [142.0], [143.0]]), p1: [s0(p0: [[144.0], [145.0], [146.0]]), s0(p0: [[147.0], [148.0], [149.0]])])]))
    let v2: Double = 150.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 150.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
