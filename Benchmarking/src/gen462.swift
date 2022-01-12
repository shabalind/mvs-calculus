  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f80(_ v0: Double) -> Double {
    var v2: Double = v0
    let v7: [Double] = [v0, v2]
    var v6: [Double] = v7
    let v3: Double = v7[1]
    var v1: [Double] = v7
    v1[0] = v3
    var v15: Double = v0
    let v14: Double = v7[0]
    var v5: Double = v2
    let v9: Double = v1[0]
    var v10: Double = v2
    var v8: [Double] = v7
    let v11: [[Double]] = [v7, v8, v8, v8, v6, v6]
    var v13: Double = v15
    let v16: [Double] = v11[2]
    var v31: Double = v15
    var v25: [Double] = v8
    let v28: Double = v25[1]
    let v32: Double = v14 - v10
    var v21: Double = v32
    var v18: [Double] = v1
    var v23: Double = v28
    let v39: Double = v25[0]
    let v35: Double = v16[1]
    v15 = v10
    v5 = v13
    v8[0] = v14
    let v27: Double = v18[1]
    var v76: [[Double]] = v11
    let v46: [Double] = [v15, v9, v0, v27, v27, v32, v39]
    var v59: [Double] = v46
    let v74: Double = v8[1]
    let v83: Double = v31 - v2
    var v71: Double = v14
    var v54: Double = v35
    v1[0] = v9
    var v112: Double = v74
    let v82: Double = v59[4]
    v8[0] = v54
    v8[0] = v83
    let v136: [Double] = [v32, v21, v112, v5, v27, v23, v82]
    let v149: Double = v136[4]
    v25[1] = v71
    let v109: [Double] = v76[5]
    v18 = v109
    return v149
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v5: Double = f80(v1)
    let v18: Double = v1 * v5
    var v22: Double = v18
    let v61: [Double] = [v1, v5, v18, v22, v1, v18, v18]
    var v233: [Double] = v61
    var v154: [Double] = v233
    let v136: Double = v154[6]
    return v136
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]))], [s1(p0: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])], p1: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]))], [s1(p0: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])], p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]]))]]
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
