  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: Double
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
    var p2: s0
    var p3: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s2
  }
  struct s4 {
    var p0: s0
    var p1: s3
  }
  struct s6 {
    var p0: s2
    var p1: s4
  }
  func f11(_ v0: [s6]) -> [s6] {
    let v2: s6 = v0[0]
    var v6: [s6] = v0
    var v4: s6 = v2
    v6[0] = v4
    let v7: s2 = v2.p0
    v4.p0 = v7
    v6[0] = v2
    let v10: s6 = v0[0]
    let v1: s6 = v6[0]
    v6[0] = v10
    v6[0] = v1
    return v6
  }
  func f10(_ v0: s0) -> s0 {
    var v3: s0 = v0
    var v7: s0 = v3
    var v5: s0 = v7
    let v2: [[Double]] = v5.p1
    v7.p1 = v2
    return v7
  }
  func f9(_ v0: s1) -> s1 {
    var v4: s1 = v0
    var v5: s1 = v0
    let v7: [s0] = v0.p1
    let v3: [s0] = v4.p1
    let v1: [[s0]] = [v3, v3, v3, v7, v3, v3, v7]
    let v13: s0 = v5.p0
    let v10: [s0] = v1[6]
    var v16: s0 = v13
    let v15: s0 = f10(v13)
    var v20: s0 = v15
    let v49: [Double] = v16.p0
    let v17: Double = v49[0]
    v5 = v0
    let v19: [Double] = v16.p0
    let v14: Double = v5.p2
    let v40: [Double] = [v17]
    let v22: [s0] = v1[5]
    let v37: Double = v40[0]
    let v23: Double = v49[1]
    var v31: [Double] = v19
    let v24: [Double] = v20.p0
    let v21: [[Double]] = v13.p1
    let v43: s0 = v22[0]
    v4.p1 = v10
    let v50: [[Double]] = v15.p1
    let v87: s0 = f10(v15)
    v4.p2 = v17
    var v57: [[Double]] = v21
    let v44: [Double] = v50[1]
    let v56: [Double] = v43.p0
    let v41: s0 = s0(p0: v56, p1: v57)
    v57[0] = v44
    let v39: Double = v37 - v23
    var v77: Double = v17
    var v84: Double = v14
    let v51: Double = v44[0]
    v31[0] = v39
    let v93: Double = v84 / v51
    let v125: s0 = f10(v41)
    v4.p2 = v93
    let v82: s0 = f10(v87)
    let v106: s0 = f10(v125)
    let v121: s0 = f10(v106)
    let v97: [[Double]] = v20.p1
    var v159: [s0] = v7
    v159[1] = v121
    let v143: [Double] = v97[1]
    v31 = v24
    v57[1] = v143
    v5.p2 = v77
    let v209: s1 = s1(p0: v82, p1: v159, p2: v51)
    v20.p0 = v31
    return v209
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: Double) -> Double {
    let v4: [s6] = v0[0]
    let v7: [s6] = v0[1]
    let v16: [s6] = f11(v4)
    let v27: s6 = v7[0]
    let v39: s6 = v16[0]
    let v53: s4 = v39.p1
    let v23: s3 = v53.p1
    let v93: [s0] = v23.p0
    let v70: s2 = v27.p0
    let v38: s0 = v93[2]
    let v83: [Double] = v38.p0
    var v61: [Double] = v83
    let v59: s1 = v70.p1
    let v151: Double = v61[1]
    let v109: s1 = f9(v59)
    let v120: Double = v109.p2
    v61[1] = v120
    return v151
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: s2(p0: [s0(p0: [0.0, 1.0], p1: [[2.0], [3.0]]), s0(p0: [4.0, 5.0], p1: [[6.0], [7.0]])], p1: s1(p0: s0(p0: [8.0, 9.0], p1: [[10.0], [11.0]]), p1: [s0(p0: [12.0, 13.0], p1: [[14.0], [15.0]]), s0(p0: [16.0, 17.0], p1: [[18.0], [19.0]])], p2: 20.0), p2: s0(p0: [21.0, 22.0], p1: [[23.0], [24.0]]), p3: s0(p0: [25.0, 26.0], p1: [[27.0], [28.0]])), p1: s4(p0: s0(p0: [29.0, 30.0], p1: [[31.0], [32.0]]), p1: s3(p0: [s0(p0: [33.0, 34.0], p1: [[35.0], [36.0]]), s0(p0: [37.0, 38.0], p1: [[39.0], [40.0]]), s0(p0: [41.0, 42.0], p1: [[43.0], [44.0]])], p1: s2(p0: [s0(p0: [45.0, 46.0], p1: [[47.0], [48.0]]), s0(p0: [49.0, 50.0], p1: [[51.0], [52.0]])], p1: s1(p0: s0(p0: [53.0, 54.0], p1: [[55.0], [56.0]]), p1: [s0(p0: [57.0, 58.0], p1: [[59.0], [60.0]]), s0(p0: [61.0, 62.0], p1: [[63.0], [64.0]])], p2: 65.0), p2: s0(p0: [66.0, 67.0], p1: [[68.0], [69.0]]), p3: s0(p0: [70.0, 71.0], p1: [[72.0], [73.0]])))))], [s6(p0: s2(p0: [s0(p0: [74.0, 75.0], p1: [[76.0], [77.0]]), s0(p0: [78.0, 79.0], p1: [[80.0], [81.0]])], p1: s1(p0: s0(p0: [82.0, 83.0], p1: [[84.0], [85.0]]), p1: [s0(p0: [86.0, 87.0], p1: [[88.0], [89.0]]), s0(p0: [90.0, 91.0], p1: [[92.0], [93.0]])], p2: 94.0), p2: s0(p0: [95.0, 96.0], p1: [[97.0], [98.0]]), p3: s0(p0: [99.0, 100.0], p1: [[101.0], [102.0]])), p1: s4(p0: s0(p0: [103.0, 104.0], p1: [[105.0], [106.0]]), p1: s3(p0: [s0(p0: [107.0, 108.0], p1: [[109.0], [110.0]]), s0(p0: [111.0, 112.0], p1: [[113.0], [114.0]]), s0(p0: [115.0, 116.0], p1: [[117.0], [118.0]])], p1: s2(p0: [s0(p0: [119.0, 120.0], p1: [[121.0], [122.0]]), s0(p0: [123.0, 124.0], p1: [[125.0], [126.0]])], p1: s1(p0: s0(p0: [127.0, 128.0], p1: [[129.0], [130.0]]), p1: [s0(p0: [131.0, 132.0], p1: [[133.0], [134.0]]), s0(p0: [135.0, 136.0], p1: [[137.0], [138.0]])], p2: 139.0), p2: s0(p0: [140.0, 141.0], p1: [[142.0], [143.0]]), p3: s0(p0: [144.0, 145.0], p1: [[146.0], [147.0]])))))]]
    let v1: Double = 148.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 148.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
