  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  func f21(_ v0: Double) -> Double {
    var v6: Double = v0
    var v3: Double = v0
    var v7: Double = v6
    var v1: Double = v7
    var v8: Double = v6
    var v5: Double = v1
    var v2: Double = v5
    var v15: Double = v2
    let v17: Double = v5 + v8
    var v10: Double = v0
    var v13: Double = v2
    var v4: Double = v5
    v5 = v1
    v6 = v7
    var v14: Double = v1
    v7 = v4
    v1 = v14
    var v22: Double = v10
    var v144: Double = v17
    var v59: Double = v15
    let v47: [Double] = [v144, v13, v22, v3]
    var v64: [Double] = v47
    var v132: [Double] = v64
    v132[1] = v59
    v64[1] = v4
    let v104: Double = v132[3]
    return v104
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v9: Double = f21(v1)
    var v3: Double = v1
    let v101: Double = v3 * v9
    let v207: Double = v1 + v101
    return v207
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [[s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])], [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]]), p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])]), s2(p0: s1(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]), p1: [[s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])], [s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])], [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])]]), p1: [s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]]), s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]])]), s2(p0: s1(p0: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]]), p1: [[s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0], [95.0]])], [s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0], [100.0], [101.0]])], [s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0], [107.0]])]]), p1: [s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0], [112.0], [113.0]]), s0(p0: [[114.0], [115.0], [116.0]], p1: [[117.0], [118.0], [119.0]]), s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0], [125.0]])])]
    let v1: Double = 126.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 126.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
