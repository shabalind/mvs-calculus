  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s7 {
    var p0: [s0]
    var p1: [s1]
  }
  func f13(_ v0: Double) -> Double {
    var v1: Double = v0
    var v6: Double = v1
    var v7: Double = v6
    var v4: Double = v7
    let v5: Double = v4 / v4
    var v2: Double = v6
    var v8: Double = v6
    var v9: Double = v2
    let v13: Double = v4 + v2
    var v11: Double = v13
    let v15: Double = v11 / v11
    var v12: Double = v9
    var v14: Double = v9
    let v28: [Double] = [v14, v8, v13]
    var v24: [Double] = v28
    var v22: [Double] = v24
    let v26: Double = v9 * v15
    var v45: Double = v6
    v24[2] = v5
    let v35: Double = v24[2]
    let v49: Double = v22[1]
    let v53: [Double] = [v26, v12, v5, v49, v45, v12]
    var v36: [Double] = v53
    let v86: Double = v53[5]
    var v68: [Double] = v53
    var v61: [Double] = v68
    v68[2] = v86
    let v124: Double = v53[5]
    v68[0] = v9
    let v66: Double = v22[1]
    let v59: Double = v61[0]
    let v48: Double = v68[4]
    let v37: Double = v66 * v59
    let v30: Double = v36[1]
    var v60: Double = v35
    let v64: [Double] = [v60, v48]
    v68 = v61
    let v73: Double = v64[0]
    let v77: Double = v64[1]
    v22[1] = v77
    v36[2] = v124
    v61[1] = v49
    v45 = v73
    v24[1] = v30
    var v293: Double = v37
    return v293
  }
  @inline(never)
  func f0(_ v0: [[s7]], _ v1: Double) -> Double {
    var v5: Double = v1
    let v6: Double = f13(v1)
    let v2: Double = f13(v1)
    var v7: Double = v5
    v5 = v2
    var v8: Double = v6
    var v34: Double = v7
    v34 = v8
    let v87: Double = v34 / v5
    return v87
  }
  func benchmark() {
    let v0: [[s7]] = [[s7(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], p1: [s1(p0: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])])])], [s7(p0: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])], p1: [s1(p0: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])], p1: [s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]]), s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])])])], [s7(p0: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])], p1: [s1(p0: [s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]])], p1: [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]]), s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]]), s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])])])]]
    let v1: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
