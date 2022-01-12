  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  struct s3 {
    var p0: [[s2]]
    var p1: s2
  }
  struct s4 {
    var p0: s1
    var p1: [s0]
  }
  func f5(_ v0: s4) -> s4 {
    let v4: [s0] = v0.p1
    var v7: s4 = v0
    var v2: [s0] = v4
    let v1: s0 = v2[0]
    let v9: s0 = v2[0]
    v7.p1 = v2
    let v3: [[Double]] = v1.p0
    v7.p1 = v2
    var v11: s0 = v1
    let v13: s0 = v2[0]
    v7.p1 = v2
    let v6: [[Double]] = v11.p0
    let v10: Double = v9.p1
    let v18: [Double] = v6[1]
    let v24: [Double] = v6[0]
    var v16: s0 = v11
    let v21: Double = v24[0]
    let v15: Double = v10 + v10
    v11.p1 = v10
    let v23: [[Double]] = v16.p0
    var v27: s0 = v13
    let v14: [Double] = v3[0]
    v27.p0 = v3
    var v42: s4 = v0
    v2[0] = v11
    var v20: s4 = v42
    let v22: s1 = v0.p0
    let v32: s1 = v7.p0
    var v53: [[Double]] = v3
    let v28: s1 = v7.p0
    let v85: s0 = v4[0]
    var v31: [[Double]] = v23
    let v30: [[s0]] = v22.p0
    v31[0] = v18
    v16.p0 = v53
    let v25: Double = v14[0]
    var v59: s4 = v7
    v42.p0 = v28
    var v92: [Double] = v18
    var v50: [[Double]] = v23
    let v54: [s0] = v30[0]
    v20 = v0
    let v83: s1 = v20.p0
    v59.p0 = v32
    let v52: s0 = v28.p1
    let v58: [[Double]] = v85.p0
    v7.p0 = v83
    var v72: s1 = v28
    let v97: [s0] = [v85, v27, v27, v85]
    let v45: s0 = v97[2]
    v50 = v31
    v92[0] = v15
    let v113: Double = v21 - v25
    v59.p1 = v54
    let v44: [s0] = v30[0]
    v72.p1 = v45
    let v73: Double = v52.p1
    let v74: s0 = v44[0]
    let v108: [[s0]] = v72.p0
    v50[0] = v24
    let v105: s1 = s1(p0: v108, p1: v11)
    let v185: [Double] = v23[0]
    v11.p1 = v73
    v27 = v16
    v53[1] = v185
    let v84: [Double] = v58[1]
    v20.p0 = v105
    let v143: s0 = v72.p1
    v16.p1 = v113
    v27.p0 = v50
    v31[0] = v92
    v50[1] = v92
    v72.p1 = v74
    v2[0] = v143
    v72.p1 = v85
    v50[1] = v84
    return v59
  }
  func f4(_ v0: [s2], _ v1: s4) -> s4 {
    let v3: s4 = f5(v1)
    var v4: s4 = v3
    var v8: s4 = v4
    let v2: s2 = v0[0]
    let v10: s4 = f5(v8)
    let v16: s4 = f5(v10)
    let v27: [s0] = v16.p1
    var v37: [s0] = v27
    let v28: s1 = v2.p1
    let v56: [s0] = v16.p1
    v4.p1 = v37
    v4.p1 = v27
    v4.p0 = v28
    var v122: s4 = v4
    v8.p1 = v37
    v122.p1 = v56
    v8.p1 = v37
    return v122
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [[s3]], _ v2: [s4], _ v3: Double) -> Double {
    var v6: Double = v3
    var v8: Double = v3
    var v7: [s4] = v2
    v7 = v2
    let v16: [[s2]] = v0.p0
    let v26: [s2] = v16[0]
    var v15: [s4] = v7
    let v59: s4 = v7[2]
    var v25: [s4] = v2
    let v24: s4 = f4(v26, v59)
    v25[0] = v24
    let v35: [s0] = v24.p1
    v7 = v15
    let v49: s0 = v35[0]
    let v85: Double = v49.p1
    v7 = v25
    let v188: Double = v8 * v85
    let v54: Double = v188 / v6
    v15[0] = v59
    return v54
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s2(p0: [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: 2.0)]], p1: s0(p0: [[3.0], [4.0]], p1: 5.0)), s1(p0: [[s0(p0: [[6.0], [7.0]], p1: 8.0)]], p1: s0(p0: [[9.0], [10.0]], p1: 11.0))], p1: s1(p0: [[s0(p0: [[12.0], [13.0]], p1: 14.0)]], p1: s0(p0: [[15.0], [16.0]], p1: 17.0)))], [s2(p0: [s1(p0: [[s0(p0: [[18.0], [19.0]], p1: 20.0)]], p1: s0(p0: [[21.0], [22.0]], p1: 23.0)), s1(p0: [[s0(p0: [[24.0], [25.0]], p1: 26.0)]], p1: s0(p0: [[27.0], [28.0]], p1: 29.0))], p1: s1(p0: [[s0(p0: [[30.0], [31.0]], p1: 32.0)]], p1: s0(p0: [[33.0], [34.0]], p1: 35.0)))]], p1: s2(p0: [s1(p0: [[s0(p0: [[36.0], [37.0]], p1: 38.0)]], p1: s0(p0: [[39.0], [40.0]], p1: 41.0)), s1(p0: [[s0(p0: [[42.0], [43.0]], p1: 44.0)]], p1: s0(p0: [[45.0], [46.0]], p1: 47.0))], p1: s1(p0: [[s0(p0: [[48.0], [49.0]], p1: 50.0)]], p1: s0(p0: [[51.0], [52.0]], p1: 53.0))))
    let v1: [[s3]] = [[s3(p0: [[s2(p0: [s1(p0: [[s0(p0: [[54.0], [55.0]], p1: 56.0)]], p1: s0(p0: [[57.0], [58.0]], p1: 59.0)), s1(p0: [[s0(p0: [[60.0], [61.0]], p1: 62.0)]], p1: s0(p0: [[63.0], [64.0]], p1: 65.0))], p1: s1(p0: [[s0(p0: [[66.0], [67.0]], p1: 68.0)]], p1: s0(p0: [[69.0], [70.0]], p1: 71.0)))], [s2(p0: [s1(p0: [[s0(p0: [[72.0], [73.0]], p1: 74.0)]], p1: s0(p0: [[75.0], [76.0]], p1: 77.0)), s1(p0: [[s0(p0: [[78.0], [79.0]], p1: 80.0)]], p1: s0(p0: [[81.0], [82.0]], p1: 83.0))], p1: s1(p0: [[s0(p0: [[84.0], [85.0]], p1: 86.0)]], p1: s0(p0: [[87.0], [88.0]], p1: 89.0)))]], p1: s2(p0: [s1(p0: [[s0(p0: [[90.0], [91.0]], p1: 92.0)]], p1: s0(p0: [[93.0], [94.0]], p1: 95.0)), s1(p0: [[s0(p0: [[96.0], [97.0]], p1: 98.0)]], p1: s0(p0: [[99.0], [100.0]], p1: 101.0))], p1: s1(p0: [[s0(p0: [[102.0], [103.0]], p1: 104.0)]], p1: s0(p0: [[105.0], [106.0]], p1: 107.0))))]]
    let v2: [s4] = [s4(p0: s1(p0: [[s0(p0: [[108.0], [109.0]], p1: 110.0)]], p1: s0(p0: [[111.0], [112.0]], p1: 113.0)), p1: [s0(p0: [[114.0], [115.0]], p1: 116.0)]), s4(p0: s1(p0: [[s0(p0: [[117.0], [118.0]], p1: 119.0)]], p1: s0(p0: [[120.0], [121.0]], p1: 122.0)), p1: [s0(p0: [[123.0], [124.0]], p1: 125.0)]), s4(p0: s1(p0: [[s0(p0: [[126.0], [127.0]], p1: 128.0)]], p1: s0(p0: [[129.0], [130.0]], p1: 131.0)), p1: [s0(p0: [[132.0], [133.0]], p1: 134.0)])]
    let v3: Double = 135.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 135.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
