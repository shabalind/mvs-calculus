  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: s0
    var p3: s0
    var p4: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s5 {
    var p0: s0
    var p1: s0
  }
  func f61(_ v0: [[Double]]) -> [[Double]] {
    let v4: [Double] = v0[1]
    let v3: Double = v4[0]
    var v1: Double = v3
    var v11: [Double] = v4
    let v7: [Double] = v0[1]
    v11[0] = v1
    v11[0] = v3
    let v12: Double = v7[0]
    let v10: [Double] = v0[1]
    var v9: [[Double]] = v0
    var v14: [Double] = v10
    v14[0] = v3
    v11[0] = v12
    let v29: [[[Double]]] = [v9]
    let v35: s0 = s0(p0: v0)
    let v58: [[Double]] = v35.p0
    var v21: [[[Double]]] = v29
    let v51: [[Double]] = v35.p0
    let v34: s0 = s0(p0: v58)
    let v104: [[Double]] = v34.p0
    let v56: [[Double]] = v35.p0
    v9[1] = v14
    let v71: [[Double]] = v34.p0
    var v82: [[[Double]]] = v21
    v9[1] = v11
    var v52: s0 = v35
    let v75: [[Double]] = v52.p0
    let v28: [[Double]] = v34.p0
    let v64: [[Double]] = v34.p0
    v52.p0 = v75
    let v95: [[Double]] = v34.p0
    let v114: [s0] = [v52, v52, v34, v52, v34, v52]
    let v93: [[Double]] = v52.p0
    let v91: s0 = v114[4]
    let v132: [[Double]] = v34.p0
    let v118: [[Double]] = v91.p0
    var v76: [[[Double]]] = v29
    v52.p0 = v28
    v76[0] = v104
    let v74: s5 = s5(p0: v91, p1: v35)
    v52.p0 = v118
    let v205: s0 = v114[5]
    let v133: [[Double]] = v82[0]
    v14[0] = v3
    let v213: s0 = v74.p1
    v52.p0 = v56
    v21[0] = v64
    let v137: s0 = v74.p0
    let v149: [[Double]] = v76[0]
    v52.p0 = v95
    v52.p0 = v56
    v21[0] = v149
    v52.p0 = v71
    v52.p0 = v133
    v76[0] = v51
    v52.p0 = v132
    let v240: [[Double]] = v213.p0
    let v83: [[Double]] = v205.p0
    v52.p0 = v83
    v82[0] = v93
    v52.p0 = v240
    let v174: [[Double]] = v137.p0
    return v174
  }
  func f46(_ v0: s0, _ v1: s2) -> s0 {
    var v6: s0 = v0
    var v4: s0 = v6
    var v7: s0 = v6
    let v8: [[Double]] = v0.p0
    let v34: [[Double]] = v4.p0
    let v25: [[Double]] = f61(v8)
    let v13: [[Double]] = v6.p0
    v6.p0 = v25
    let v14: s5 = s5(p0: v7, p1: v6)
    v6.p0 = v34
    v4.p0 = v8
    var v46: s5 = v14
    let v39: [[Double]] = f61(v13)
    v6.p0 = v8
    let v47: [[Double]] = f61(v39)
    v6.p0 = v47
    let v58: s0 = v46.p1
    return v58
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    let v3: [s2] = v0[2]
    let v7: s2 = v3[0]
    let v9: s1 = v7.p1
    let v10: [s2] = v0[2]
    let v13: s2 = v10[0]
    let v21: s0 = v9.p2
    let v26: s0 = f46(v21, v13)
    let v58: [[Double]] = v26.p0
    let v133: [Double] = v58[1]
    let v103: Double = v133[0]
    return v103
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]]), p1: s0(p0: [[3.0], [4.0], [5.0]]), p2: s0(p0: [[6.0], [7.0], [8.0]]), p3: s0(p0: [[9.0], [10.0], [11.0]]), p4: [s0(p0: [[12.0], [13.0], [14.0]]), s0(p0: [[15.0], [16.0], [17.0]])]), p1: s1(p0: s0(p0: [[18.0], [19.0], [20.0]]), p1: s0(p0: [[21.0], [22.0], [23.0]]), p2: s0(p0: [[24.0], [25.0], [26.0]]), p3: s0(p0: [[27.0], [28.0], [29.0]]), p4: [s0(p0: [[30.0], [31.0], [32.0]]), s0(p0: [[33.0], [34.0], [35.0]])]))], [s2(p0: s1(p0: s0(p0: [[36.0], [37.0], [38.0]]), p1: s0(p0: [[39.0], [40.0], [41.0]]), p2: s0(p0: [[42.0], [43.0], [44.0]]), p3: s0(p0: [[45.0], [46.0], [47.0]]), p4: [s0(p0: [[48.0], [49.0], [50.0]]), s0(p0: [[51.0], [52.0], [53.0]])]), p1: s1(p0: s0(p0: [[54.0], [55.0], [56.0]]), p1: s0(p0: [[57.0], [58.0], [59.0]]), p2: s0(p0: [[60.0], [61.0], [62.0]]), p3: s0(p0: [[63.0], [64.0], [65.0]]), p4: [s0(p0: [[66.0], [67.0], [68.0]]), s0(p0: [[69.0], [70.0], [71.0]])]))], [s2(p0: s1(p0: s0(p0: [[72.0], [73.0], [74.0]]), p1: s0(p0: [[75.0], [76.0], [77.0]]), p2: s0(p0: [[78.0], [79.0], [80.0]]), p3: s0(p0: [[81.0], [82.0], [83.0]]), p4: [s0(p0: [[84.0], [85.0], [86.0]]), s0(p0: [[87.0], [88.0], [89.0]])]), p1: s1(p0: s0(p0: [[90.0], [91.0], [92.0]]), p1: s0(p0: [[93.0], [94.0], [95.0]]), p2: s0(p0: [[96.0], [97.0], [98.0]]), p3: s0(p0: [[99.0], [100.0], [101.0]]), p4: [s0(p0: [[102.0], [103.0], [104.0]]), s0(p0: [[105.0], [106.0], [107.0]])]))]]
    let v1: Double = 108.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 108.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
