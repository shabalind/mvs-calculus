  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: Double
    var p2: s0
    var p3: [s1]
  }
  struct s3 {
    var p0: [s0]
    var p1: s2
  }
  struct s4 {
    var p0: [[Double]]
    var p1: s3
  }
  struct s6 {
    var p0: s3
    var p1: [s1]
  }
  struct s7 {
    var p0: s0
    var p1: s6
  }
  func f23(_ v0: Double) -> Double {
    var v4: Double = v0
    var v5: Double = v4
    var v6: Double = v5
    var v2: Double = v5
    var v10: Double = v2
    let v1: Double = v6 + v6
    var v12: Double = v2
    var v11: Double = v12
    var v14: Double = v12
    var v9: Double = v14
    var v20: Double = v6
    var v13: Double = v11
    var v15: Double = v9
    var v46: Double = v15
    let v23: [Double] = [v46]
    let v30: Double = v23[0]
    var v60: Double = v20
    var v32: Double = v1
    let v39: [Double] = [v32, v13, v30, v11]
    var v65: [Double] = v39
    v65[1] = v11
    v65[0] = v32
    let v55: Double = v65[2]
    v65[1] = v60
    v65[2] = v10
    return v55
  }
  func f6(_ v0: Double) -> Double {
    var v4: Double = v0
    var v7: Double = v4
    let v1: Double = f23(v7)
    let v3: Double = f23(v1)
    let v9: Double = f23(v0)
    var v10: Double = v9
    var v14: Double = v4
    let v11: Double = f23(v14)
    let v15: Double = f23(v7)
    var v22: Double = v1
    var v33: Double = v11
    var v12: Double = v33
    var v16: Double = v22
    var v30: Double = v10
    var v20: Double = v22
    let v24: Double = f23(v3)
    let v21: Double = f23(v9)
    v30 = v20
    let v31: Double = f23(v12)
    let v44: Double = f23(v16)
    var v49: Double = v24
    var v72: Double = v10
    v7 = v31
    let v41: Double = v11 - v15
    var v57: Double = v3
    v57 = v72
    let v78: [Double] = [v21, v57]
    var v87: [Double] = v78
    var v83: Double = v41
    v87[0] = v83
    v87[1] = v7
    v22 = v49
    var v76: [Double] = v87
    var v130: [Double] = v76
    v130[1] = v44
    var v111: [Double] = v130
    let v180: Double = v111[0]
    v76[1] = v30
    return v180
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: [s4], _ v2: [Double], _ v3: [s7], _ v4: Double) -> Double {
    let v39: Double = f6(v4)
    var v38: [Double] = v2
    let v26: Double = v38[0]
    let v40: Double = f6(v39)
    v38[1] = v40
    return v26
  }
  func benchmark() {
    let v0: s6 = s6(p0: s3(p0: [s0(p0: [0.0], p1: [[1.0], [2.0]])], p1: s2(p0: [s0(p0: [3.0], p1: [[4.0], [5.0]])], p1: 6.0, p2: s0(p0: [7.0], p1: [[8.0], [9.0]]), p3: [s1(p0: s0(p0: [10.0], p1: [[11.0], [12.0]]), p1: s0(p0: [13.0], p1: [[14.0], [15.0]]))])), p1: [s1(p0: s0(p0: [16.0], p1: [[17.0], [18.0]]), p1: s0(p0: [19.0], p1: [[20.0], [21.0]])), s1(p0: s0(p0: [22.0], p1: [[23.0], [24.0]]), p1: s0(p0: [25.0], p1: [[26.0], [27.0]]))])
    let v1: [s4] = [s4(p0: [[28.0], [29.0]], p1: s3(p0: [s0(p0: [30.0], p1: [[31.0], [32.0]])], p1: s2(p0: [s0(p0: [33.0], p1: [[34.0], [35.0]])], p1: 36.0, p2: s0(p0: [37.0], p1: [[38.0], [39.0]]), p3: [s1(p0: s0(p0: [40.0], p1: [[41.0], [42.0]]), p1: s0(p0: [43.0], p1: [[44.0], [45.0]]))]))), s4(p0: [[46.0], [47.0]], p1: s3(p0: [s0(p0: [48.0], p1: [[49.0], [50.0]])], p1: s2(p0: [s0(p0: [51.0], p1: [[52.0], [53.0]])], p1: 54.0, p2: s0(p0: [55.0], p1: [[56.0], [57.0]]), p3: [s1(p0: s0(p0: [58.0], p1: [[59.0], [60.0]]), p1: s0(p0: [61.0], p1: [[62.0], [63.0]]))])))]
    let v2: [Double] = [64.0, 65.0]
    let v3: [s7] = [s7(p0: s0(p0: [66.0], p1: [[67.0], [68.0]]), p1: s6(p0: s3(p0: [s0(p0: [69.0], p1: [[70.0], [71.0]])], p1: s2(p0: [s0(p0: [72.0], p1: [[73.0], [74.0]])], p1: 75.0, p2: s0(p0: [76.0], p1: [[77.0], [78.0]]), p3: [s1(p0: s0(p0: [79.0], p1: [[80.0], [81.0]]), p1: s0(p0: [82.0], p1: [[83.0], [84.0]]))])), p1: [s1(p0: s0(p0: [85.0], p1: [[86.0], [87.0]]), p1: s0(p0: [88.0], p1: [[89.0], [90.0]])), s1(p0: s0(p0: [91.0], p1: [[92.0], [93.0]]), p1: s0(p0: [94.0], p1: [[95.0], [96.0]]))])), s7(p0: s0(p0: [97.0], p1: [[98.0], [99.0]]), p1: s6(p0: s3(p0: [s0(p0: [100.0], p1: [[101.0], [102.0]])], p1: s2(p0: [s0(p0: [103.0], p1: [[104.0], [105.0]])], p1: 106.0, p2: s0(p0: [107.0], p1: [[108.0], [109.0]]), p3: [s1(p0: s0(p0: [110.0], p1: [[111.0], [112.0]]), p1: s0(p0: [113.0], p1: [[114.0], [115.0]]))])), p1: [s1(p0: s0(p0: [116.0], p1: [[117.0], [118.0]]), p1: s0(p0: [119.0], p1: [[120.0], [121.0]])), s1(p0: s0(p0: [122.0], p1: [[123.0], [124.0]]), p1: s0(p0: [125.0], p1: [[126.0], [127.0]]))])), s7(p0: s0(p0: [128.0], p1: [[129.0], [130.0]]), p1: s6(p0: s3(p0: [s0(p0: [131.0], p1: [[132.0], [133.0]])], p1: s2(p0: [s0(p0: [134.0], p1: [[135.0], [136.0]])], p1: 137.0, p2: s0(p0: [138.0], p1: [[139.0], [140.0]]), p3: [s1(p0: s0(p0: [141.0], p1: [[142.0], [143.0]]), p1: s0(p0: [144.0], p1: [[145.0], [146.0]]))])), p1: [s1(p0: s0(p0: [147.0], p1: [[148.0], [149.0]]), p1: s0(p0: [150.0], p1: [[151.0], [152.0]])), s1(p0: s0(p0: [153.0], p1: [[154.0], [155.0]]), p1: s0(p0: [156.0], p1: [[157.0], [158.0]]))]))]
    let v4: Double = 159.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 159.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
