  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [[s1]]
  }
  struct s3 {
    var p0: s2
    var p1: s0
  }
  struct s4 {
    var p0: [[s0]]
    var p1: s3
  }
  struct s5 {
    var p0: [s3]
  }
  struct s6 {
    var p0: [s4]
    var p1: s5
  }
  func f25(_ v0: [s0]) -> [s0] {
    var v20: [s0] = v0
    let v30: s0 = v20[0]
    var v72: [s0] = v20
    v72[1] = v30
    var v188: [s0] = v72
    return v188
  }
  func f19(_ v0: s0) -> s0 {
    let v5: Double = v0.p1
    let v2: [[Double]] = v0.p0
    var v11: s0 = v0
    let v14: [[Double]] = v11.p0
    v11.p0 = v14
    v11.p0 = v2
    let v92: s0 = s0(p0: v14, p1: v5)
    return v92
  }
  func f12(_ v0: s0) -> s0 {
    let v4: [s0] = [v0, v0]
    let v1: Double = v0.p1
    let v2: Double = v1 / v1
    let v6: s0 = v4[0]
    let v3: Double = v6.p1
    let v7: Double = v1 + v2
    let v8: s0 = v4[1]
    var v9: [s0] = v4
    let v10: [[Double]] = v8.p0
    let v13: [[Double]] = v6.p0
    let v11: [Double] = v10[1]
    let v14: [s0] = f25(v9)
    var v5: [Double] = v11
    v9 = v14
    var v19: s0 = v8
    v19.p0 = v13
    let v49: Double = v6.p1
    let v29: Double = v5[0]
    let v31: [Double] = v13[0]
    v19.p1 = v29
    v19.p1 = v49
    var v16: s0 = v0
    v9[1] = v16
    let v50: s0 = f19(v0)
    v9[1] = v50
    v16.p0 = v13
    let v23: [[Double]] = v8.p0
    var v33: [Double] = v31
    v19.p1 = v7
    v33[0] = v3
    let v27: Double = v5[0]
    let v35: [Double] = v10[0]
    var v43: [s0] = v4
    let v39: [[Double]] = [v11, v11, v33, v33, v33, v5]
    var v48: [[Double]] = v13
    let v46: s0 = s0(p0: v48, p1: v1)
    var v26: [[Double]] = v23
    let v51: [Double] = v39[1]
    let v80: s0 = s0(p0: v48, p1: v27)
    let v65: s0 = f19(v80)
    let v85: Double = v6.p1
    let v56: s0 = f19(v19)
    let v41: [[Double]] = v65.p0
    v16.p1 = v29
    let v58: s0 = v9[1]
    var v73: [s0] = v43
    v16.p0 = v10
    let v70: s0 = v4[0]
    v73[1] = v58
    v5[0] = v2
    v33[0] = v85
    v9[0] = v46
    let v97: Double = v70.p1
    v16.p0 = v26
    let v83: s0 = f19(v80)
    v43[0] = v83
    let v118: [[Double]] = v56.p0
    v16.p1 = v97
    v73[0] = v65
    v48[0] = v51
    let v145: Double = v35[0]
    v16.p0 = v41
    let v91: s0 = f19(v70)
    v33[0] = v145
    v19 = v91
    let v194: s0 = v73[1]
    v16.p0 = v118
    return v194
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: [s6], _ v2: [s0], _ v3: s4, _ v4: Double) -> Double {
    let v7: s6 = v1[0]
    let v13: s5 = v7.p1
    let v24: [s3] = v13.p0
    let v32: s3 = v24[0]
    let v40: s0 = v32.p1
    let v49: s0 = f12(v40)
    let v58: s0 = f12(v49)
    let v77: Double = v58.p1
    return v77
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: 3.0)], [s0(p0: [[4.0], [5.0], [6.0]], p1: 7.0)]], p1: [[s1(p0: s0(p0: [[8.0], [9.0], [10.0]], p1: 11.0), p1: [[s0(p0: [[12.0], [13.0], [14.0]], p1: 15.0)]])]])], [s2(p0: [[s0(p0: [[16.0], [17.0], [18.0]], p1: 19.0)], [s0(p0: [[20.0], [21.0], [22.0]], p1: 23.0)]], p1: [[s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: 27.0), p1: [[s0(p0: [[28.0], [29.0], [30.0]], p1: 31.0)]])]])], [s2(p0: [[s0(p0: [[32.0], [33.0], [34.0]], p1: 35.0)], [s0(p0: [[36.0], [37.0], [38.0]], p1: 39.0)]], p1: [[s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: 43.0), p1: [[s0(p0: [[44.0], [45.0], [46.0]], p1: 47.0)]])]])]]
    let v1: [s6] = [s6(p0: [s4(p0: [[s0(p0: [[48.0], [49.0], [50.0]], p1: 51.0)]], p1: s3(p0: s2(p0: [[s0(p0: [[52.0], [53.0], [54.0]], p1: 55.0)], [s0(p0: [[56.0], [57.0], [58.0]], p1: 59.0)]], p1: [[s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: 63.0), p1: [[s0(p0: [[64.0], [65.0], [66.0]], p1: 67.0)]])]]), p1: s0(p0: [[68.0], [69.0], [70.0]], p1: 71.0))), s4(p0: [[s0(p0: [[72.0], [73.0], [74.0]], p1: 75.0)]], p1: s3(p0: s2(p0: [[s0(p0: [[76.0], [77.0], [78.0]], p1: 79.0)], [s0(p0: [[80.0], [81.0], [82.0]], p1: 83.0)]], p1: [[s1(p0: s0(p0: [[84.0], [85.0], [86.0]], p1: 87.0), p1: [[s0(p0: [[88.0], [89.0], [90.0]], p1: 91.0)]])]]), p1: s0(p0: [[92.0], [93.0], [94.0]], p1: 95.0))), s4(p0: [[s0(p0: [[96.0], [97.0], [98.0]], p1: 99.0)]], p1: s3(p0: s2(p0: [[s0(p0: [[100.0], [101.0], [102.0]], p1: 103.0)], [s0(p0: [[104.0], [105.0], [106.0]], p1: 107.0)]], p1: [[s1(p0: s0(p0: [[108.0], [109.0], [110.0]], p1: 111.0), p1: [[s0(p0: [[112.0], [113.0], [114.0]], p1: 115.0)]])]]), p1: s0(p0: [[116.0], [117.0], [118.0]], p1: 119.0)))], p1: s5(p0: [s3(p0: s2(p0: [[s0(p0: [[120.0], [121.0], [122.0]], p1: 123.0)], [s0(p0: [[124.0], [125.0], [126.0]], p1: 127.0)]], p1: [[s1(p0: s0(p0: [[128.0], [129.0], [130.0]], p1: 131.0), p1: [[s0(p0: [[132.0], [133.0], [134.0]], p1: 135.0)]])]]), p1: s0(p0: [[136.0], [137.0], [138.0]], p1: 139.0))]))]
    let v2: [s0] = [s0(p0: [[140.0], [141.0], [142.0]], p1: 143.0)]
    let v3: s4 = s4(p0: [[s0(p0: [[144.0], [145.0], [146.0]], p1: 147.0)]], p1: s3(p0: s2(p0: [[s0(p0: [[148.0], [149.0], [150.0]], p1: 151.0)], [s0(p0: [[152.0], [153.0], [154.0]], p1: 155.0)]], p1: [[s1(p0: s0(p0: [[156.0], [157.0], [158.0]], p1: 159.0), p1: [[s0(p0: [[160.0], [161.0], [162.0]], p1: 163.0)]])]]), p1: s0(p0: [[164.0], [165.0], [166.0]], p1: 167.0)))
    let v4: Double = 168.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 168.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
