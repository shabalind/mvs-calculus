  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [[s0]]
    var p2: s0
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  struct s7 {
    var p0: [s2]
    var p1: s3
    var p2: s0
  }
  func f109(_ v0: [s1]) -> [s1] {
    var v7: [s1] = v0
    var v3: [s1] = v7
    let v2: s1 = v0[0]
    v3[0] = v2
    var v1: [s1] = v3
    return v1
  }
  func f77(_ v0: [s1], _ v1: Double) -> Double {
    let v7: s1 = v0[1]
    let v6: s0 = v7.p1
    var v18: s1 = v7
    v18.p1 = v6
    let v31: s0 = v18.p1
    v18.p1 = v6
    v18.p1 = v6
    v18.p1 = v6
    let v17: [s0] = [v6, v31, v31, v31, v31]
    let v47: s0 = v17[4]
    let v34: s0 = v17[4]
    let v41: [[s0]] = v18.p0
    var v72: [s0] = v17
    v18.p1 = v34
    let v59: [s0] = v41[1]
    v18.p1 = v34
    v18.p1 = v47
    let v93: s0 = v72[0]
    v72[3] = v47
    v18.p1 = v31
    v18.p0 = v41
    let v159: [[s0]] = v18.p0
    v18.p0 = v159
    let v163: s0 = v59[0]
    v18.p0 = v41
    let v126: [Double] = v93.p1
    v18.p1 = v163
    let v195: Double = v126[1]
    v18.p1 = v34
    return v195
  }
  func f53(_ v0: [[s0]]) -> [[s0]] {
    var v3: [[s0]] = v0
    let v5: [s0] = v3[1]
    let v4: [s0] = v3[1]
    var v12: [s0] = v4
    v3[0] = v12
    var v6: [[s0]] = v3
    v3[0] = v4
    let v10: s0 = v4[0]
    v3[0] = v5
    let v18: [s0] = v6[1]
    v3[0] = v12
    v12[0] = v10
    var v29: [[s0]] = v0
    v29[1] = v18
    v12 = v5
    return v29
  }
  func f52(_ v0: s0, _ v1: s1) -> s1 {
    let v4: [s1] = [v1, v1, v1, v1, v1, v1, v1]
    let v5: s1 = v4[3]
    let v7: [[Double]] = v0.p0
    let v2: [[Double]] = v0.p0
    var v14: s1 = v5
    v14.p1 = v0
    let v12: [Double] = v0.p1
    let v15: [Double] = v0.p1
    let v18: Double = v15[0]
    var v17: s0 = v0
    let v10: [[s0]] = v5.p0
    let v31: [[s0]] = f53(v10)
    var v30: [Double] = v12
    let v20: [[s0]] = f53(v31)
    v14.p1 = v17
    let v23: [Double] = v2[1]
    v30[1] = v18
    var v27: [[s0]] = v20
    let v33: Double = v23[0]
    let v36: [[s0]] = f53(v27)
    let v54: Double = v33 / v18
    var v48: s0 = v17
    var v47: [Double] = v15
    let v91: [[Double]] = v48.p0
    v30[1] = v18
    v30[0] = v54
    let v49: [s0] = v10[0]
    let v129: s0 = v49[0]
    var v51: s0 = v17
    v17 = v51
    let v73: [[s0]] = f53(v10)
    let v41: [[s0]] = f53(v36)
    v47[1] = v54
    var v110: [[Double]] = v91
    let v106: [Double] = v48.p1
    var v140: [Double] = v30
    let v125: s0 = v14.p1
    v14.p1 = v129
    v17.p1 = v140
    v14.p1 = v51
    let v112: [[Double]] = v125.p0
    v17.p0 = v110
    v48.p0 = v112
    let v234: [[s0]] = f53(v73)
    v48.p1 = v106
    v14.p0 = v41
    v17.p1 = v47
    v51.p0 = v7
    v14.p0 = v234
    return v14
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s3, _ v2: [s7], _ v3: Double) -> Double {
    let v5: [s0] = v1.p1
    let v6: s0 = v5[2]
    let v8: [s0] = v1.p1
    let v15: s0 = v8[2]
    let v16: s1 = f52(v15, v0)
    let v19: [Double] = v6.p1
    let v32: s0 = v8[2]
    let v18: Double = v19[1]
    let v33: Double = v18 / v3
    var v22: [Double] = v19
    let v17: [[s0]] = v0.p0
    let v56: Double = v19[1]
    var v24: s1 = v0
    let v35: [[s0]] = f53(v17)
    let v64: [s1] = [v0, v16, v24]
    let v59: s0 = v5[1]
    v22[1] = v56
    let v50: s1 = v64[0]
    let v37: [s1] = f109(v64)
    let v58: s1 = s1(p0: v17, p1: v59)
    let v63: [[s0]] = v58.p0
    var v85: [[s0]] = v63
    v24.p0 = v35
    v24 = v50
    let v91: Double = f77(v37, v33)
    v24.p0 = v85
    v24.p1 = v32
    var v77: [Double] = v22
    v77[1] = v91
    let v163: Double = v77[0]
    v77[0] = v56
    return v163
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0, 4.0])], [s0(p0: [[5.0], [6.0], [7.0]], p1: [8.0, 9.0])]], p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [13.0, 14.0]))
    let v1: s3 = s3(p0: s1(p0: [[s0(p0: [[15.0], [16.0], [17.0]], p1: [18.0, 19.0])], [s0(p0: [[20.0], [21.0], [22.0]], p1: [23.0, 24.0])]], p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [28.0, 29.0])), p1: [s0(p0: [[30.0], [31.0], [32.0]], p1: [33.0, 34.0]), s0(p0: [[35.0], [36.0], [37.0]], p1: [38.0, 39.0]), s0(p0: [[40.0], [41.0], [42.0]], p1: [43.0, 44.0])])
    let v2: [s7] = [s7(p0: [s2(p0: s0(p0: [[45.0], [46.0], [47.0]], p1: [48.0, 49.0]), p1: [[s0(p0: [[50.0], [51.0], [52.0]], p1: [53.0, 54.0])]], p2: s0(p0: [[55.0], [56.0], [57.0]], p1: [58.0, 59.0])), s2(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [63.0, 64.0]), p1: [[s0(p0: [[65.0], [66.0], [67.0]], p1: [68.0, 69.0])]], p2: s0(p0: [[70.0], [71.0], [72.0]], p1: [73.0, 74.0])), s2(p0: s0(p0: [[75.0], [76.0], [77.0]], p1: [78.0, 79.0]), p1: [[s0(p0: [[80.0], [81.0], [82.0]], p1: [83.0, 84.0])]], p2: s0(p0: [[85.0], [86.0], [87.0]], p1: [88.0, 89.0]))], p1: s3(p0: s1(p0: [[s0(p0: [[90.0], [91.0], [92.0]], p1: [93.0, 94.0])], [s0(p0: [[95.0], [96.0], [97.0]], p1: [98.0, 99.0])]], p1: s0(p0: [[100.0], [101.0], [102.0]], p1: [103.0, 104.0])), p1: [s0(p0: [[105.0], [106.0], [107.0]], p1: [108.0, 109.0]), s0(p0: [[110.0], [111.0], [112.0]], p1: [113.0, 114.0]), s0(p0: [[115.0], [116.0], [117.0]], p1: [118.0, 119.0])]), p2: s0(p0: [[120.0], [121.0], [122.0]], p1: [123.0, 124.0]))]
    let v3: Double = 125.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 125.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
