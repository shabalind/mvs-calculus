  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [[Double]]
    var p6: [[Double]]
    var p7: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f84(_ v0: s1) -> s1 {
    var v5: s1 = v0
    let v7: [s0] = v5.p0
    var v4: s1 = v0
    let v12: s0 = v5.p1
    var v3: s0 = v12
    let v11: s0 = v0.p1
    let v2: s0 = v7[1]
    let v8: [s0] = v4.p0
    let v16: s0 = v4.p1
    var v10: s1 = v4
    var v25: s0 = v16
    var v20: s1 = v5
    let v14: [s0] = v4.p0
    let v18: [s0] = v20.p0
    let v13: s1 = s1(p0: v18, p1: v25)
    let v26: [[Double]] = v25.p4
    v4.p1 = v2
    var v29: [[Double]] = v26
    let v23: [[Double]] = v3.p4
    var v37: s1 = v4
    let v45: s0 = v10.p1
    var v28: [[Double]] = v23
    v10.p1 = v11
    v10.p0 = v8
    let v55: s0 = v0.p1
    v5.p1 = v45
    let v60: s0 = v14[1]
    v3.p4 = v29
    let v31: s0 = v13.p1
    let v39: [s1] = [v4, v0, v13, v37, v20, v13, v10]
    v37.p1 = v55
    let v63: s1 = v39[0]
    v4.p0 = v7
    v25.p4 = v28
    let v83: [Double] = v23[0]
    let v64: [s1] = [v13, v0, v63, v10]
    var v163: [s1] = v64
    v163[3] = v37
    v37.p1 = v31
    v3.p6 = v23
    v4.p0 = v8
    let v96: s1 = v39[2]
    let v178: s1 = v163[3]
    v28[0] = v83
    v10.p1 = v60
    v163[0] = v96
    return v178
  }
  func f79(_ v0: [Double]) -> [Double] {
    var v5: [Double] = v0
    var v6: [Double] = v0
    let v4: Double = v5[0]
    var v3: Double = v4
    var v9: Double = v4
    var v1: Double = v3
    let v2: Double = v0[0]
    let v10: Double = v6[0]
    v5[0] = v2
    v6[0] = v9
    var v14: [Double] = v5
    let v17: Double = v5[0]
    let v30: Double = v5[0]
    v5[0] = v9
    var v12: [Double] = v6
    v12 = v6
    v12[0] = v2
    var v16: [Double] = v14
    let v20: Double = v12[0]
    v16[0] = v1
    let v35: Double = v6[0]
    let v13: [Double] = [v9, v9, v4, v35, v10, v30, v35]
    v16[0] = v17
    var v47: [Double] = v13
    let v22: Double = v47[4]
    let v42: Double = v47[3]
    v6[0] = v22
    var v50: [Double] = v16
    v50 = v6
    v6[0] = v42
    v47[3] = v20
    return v50
  }
  func f70(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p6
    let v4: [Double] = v5[0]
    var v12: s0 = v0
    let v6: [Double] = f79(v4)
    v12.p6 = v5
    let v8: [[Double]] = v12.p0
    var v16: [[Double]] = v8
    v12 = v0
    v16[0] = v6
    v16[0] = v6
    let v22: [[Double]] = v0.p7
    v12.p3 = v16
    v12.p0 = v16
    v12.p7 = v22
    return v12
  }
  func f60(_ v0: s1) -> s1 {
    let v4: [s1] = [v0, v0, v0, v0, v0, v0]
    let v2: s1 = v4[3]
    let v7: s1 = f84(v0)
    let v3: [s0] = v7.p0
    let v19: s0 = v3[0]
    let v13: s1 = s1(p0: v3, p1: v19)
    let v41: s0 = f70(v19)
    var v24: [s0] = v3
    var v78: s1 = v13
    v24[1] = v41
    v78 = v2
    v78.p0 = v24
    return v78
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [[s1]], _ v2: Double) -> Double {
    let v5: [s1] = v1[0]
    let v6: Double = v2 - v2
    var v7: [s1] = v5
    let v13: s1 = v7[0]
    let v20: Double = v2 * v2
    let v17: s0 = v13.p1
    let v18: s1 = f84(v13)
    let v40: [[Double]] = v17.p4
    var v34: [[Double]] = v40
    var v42: Double = v20
    let v68: [Double] = v34[0]
    var v67: [Double] = v68
    let v45: s1 = f60(v18)
    var v32: [Double] = v68
    let v80: Double = v6 / v42
    v32 = v67
    v7[0] = v45
    var v94: [Double] = v32
    let v76: Double = v94[0]
    v32[0] = v80
    let v140: Double = v67[0]
    let v208: Double = v140 * v76
    return v208
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: 1.0, p2: [[2.0], [3.0]], p3: [[4.0]], p4: [[5.0]], p5: [[6.0], [7.0]], p6: [[8.0]], p7: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: 13.0, p2: [[14.0], [15.0]], p3: [[16.0]], p4: [[17.0]], p5: [[18.0], [19.0]], p6: [[20.0]], p7: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: 25.0, p2: [[26.0], [27.0]], p3: [[28.0]], p4: [[29.0]], p5: [[30.0], [31.0]], p6: [[32.0]], p7: [[33.0], [34.0], [35.0]])]
    let v1: [[s1]] = [[s1(p0: [s0(p0: [[36.0]], p1: 37.0, p2: [[38.0], [39.0]], p3: [[40.0]], p4: [[41.0]], p5: [[42.0], [43.0]], p6: [[44.0]], p7: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: 49.0, p2: [[50.0], [51.0]], p3: [[52.0]], p4: [[53.0]], p5: [[54.0], [55.0]], p6: [[56.0]], p7: [[57.0], [58.0], [59.0]])], p1: s0(p0: [[60.0]], p1: 61.0, p2: [[62.0], [63.0]], p3: [[64.0]], p4: [[65.0]], p5: [[66.0], [67.0]], p6: [[68.0]], p7: [[69.0], [70.0], [71.0]]))], [s1(p0: [s0(p0: [[72.0]], p1: 73.0, p2: [[74.0], [75.0]], p3: [[76.0]], p4: [[77.0]], p5: [[78.0], [79.0]], p6: [[80.0]], p7: [[81.0], [82.0], [83.0]]), s0(p0: [[84.0]], p1: 85.0, p2: [[86.0], [87.0]], p3: [[88.0]], p4: [[89.0]], p5: [[90.0], [91.0]], p6: [[92.0]], p7: [[93.0], [94.0], [95.0]])], p1: s0(p0: [[96.0]], p1: 97.0, p2: [[98.0], [99.0]], p3: [[100.0]], p4: [[101.0]], p5: [[102.0], [103.0]], p6: [[104.0]], p7: [[105.0], [106.0], [107.0]]))], [s1(p0: [s0(p0: [[108.0]], p1: 109.0, p2: [[110.0], [111.0]], p3: [[112.0]], p4: [[113.0]], p5: [[114.0], [115.0]], p6: [[116.0]], p7: [[117.0], [118.0], [119.0]]), s0(p0: [[120.0]], p1: 121.0, p2: [[122.0], [123.0]], p3: [[124.0]], p4: [[125.0]], p5: [[126.0], [127.0]], p6: [[128.0]], p7: [[129.0], [130.0], [131.0]])], p1: s0(p0: [[132.0]], p1: 133.0, p2: [[134.0], [135.0]], p3: [[136.0]], p4: [[137.0]], p5: [[138.0], [139.0]], p6: [[140.0]], p7: [[141.0], [142.0], [143.0]]))]]
    let v2: Double = 144.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 144.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
