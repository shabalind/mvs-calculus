  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [s1]
  }
  struct s3 {
    var p0: s0
    var p1: [s0]
  }
  struct s4 {
    var p0: [s3]
    var p1: s2
  }
  func f11(_ v0: s0) -> s0 {
    let v3: s1 = s1(p0: v0)
    let v7: s0 = v3.p0
    let v11: [[Double]] = v0.p0
    var v13: [[Double]] = v11
    let v1: [Double] = v13[0]
    v13[0] = v1
    let v9: Double = v1[0]
    var v6: Double = v9
    v13[0] = v1
    let v16: [Double] = v7.p1
    v13[0] = v1
    v13[0] = v1
    v13 = v11
    var v31: [Double] = v1
    var v69: [Double] = v31
    var v24: [Double] = v16
    let v45: s0 = s0(p0: v13, p1: v24)
    v13[0] = v69
    v69[0] = v6
    return v45
  }
  func f10(_ v0: [[s0]]) -> [[s0]] {
    var v6: [[s0]] = v0
    let v4: [[[s0]]] = [v6, v6, v6, v6, v6, v0]
    let v8: [[s0]] = v4[2]
    let v9: [s0] = v0[1]
    var v3: [[[s0]]] = v4
    v3[0] = v8
    v6[1] = v9
    let v111: [[s0]] = v3[5]
    let v51: [s0] = v8[0]
    var v128: [[s0]] = v111
    v128[1] = v51
    return v128
  }
  func f6(_ v0: [s0]) -> [s0] {
    let v5: [[s0]] = [v0]
    var v4: [[s0]] = v5
    v4[0] = v0
    let v3: [s0] = v4[0]
    let v2: [s0] = v5[0]
    let v14: [[[s0]]] = [v4, v4, v4, v5, v4, v5, v4]
    v4[0] = v3
    let v49: [s0] = v5[0]
    let v41: [s0] = v5[0]
    let v29: [[s0]] = [v2, v3, v2, v49, v3, v49, v41]
    let v31: [[s0]] = v14[5]
    let v47: [s0] = v29[1]
    v4 = v31
    return v47
  }
  func f3(_ v0: s3, _ v1: s0, _ v2: [[s0]]) -> s0 {
    let v6: [[s0]] = f10(v2)
    let v7: [s0] = v6[0]
    let v4: s0 = f11(v1)
    var v9: s3 = v0
    v9.p0 = v4
    let v13: s0 = v7[0]
    let v10: [Double] = v4.p1
    let v14: s0 = f11(v13)
    var v39: [[s0]] = v6
    let v20: [s0] = v2[1]
    let v43: s0 = v9.p0
    var v46: s0 = v43
    let v36: [s0] = v2[0]
    var v40: [[s0]] = v39
    v46.p1 = v10
    v9.p0 = v14
    let v33: [[Double]] = v43.p0
    let v42: [s0] = v40[1]
    v39[0] = v20
    let v65: [Double] = v46.p1
    let v107: s1 = s1(p0: v14)
    var v35: [s0] = v36
    let v60: s0 = v107.p0
    v40[0] = v36
    v39[1] = v35
    let v76: s0 = v42[0]
    var v97: s0 = v76
    var v51: [Double] = v65
    var v93: [Double] = v51
    v9.p0 = v60
    v97.p1 = v65
    let v127: [s0] = v9.p1
    v97.p1 = v93
    v97.p0 = v33
    v9.p1 = v127
    return v97
  }
  @inline(never)
  func f0(_ v0: [[s4]], _ v1: Double) -> Double {
    let v7: [s4] = v0[2]
    let v2: s4 = v7[0]
    let v12: s2 = v2.p1
    let v9: [[s0]] = v12.p0
    let v10: [s3] = v2.p0
    let v18: s3 = v10[1]
    var v25: [[s0]] = v9
    v25 = v9
    let v49: [s0] = v18.p1
    var v71: s3 = v18
    let v36: [s0] = f6(v49)
    let v27: s0 = v36[1]
    v71.p0 = v27
    let v61: s0 = f3(v71, v27, v25)
    v71.p1 = v36
    let v62: [s0] = f6(v49)
    let v57: [s0] = f6(v62)
    v71.p1 = v36
    let v195: [[Double]] = v61.p0
    let v102: [[s0]] = f10(v25)
    v71.p1 = v36
    let v133: [s0] = f6(v57)
    let v206: [s0] = v102[1]
    v25[1] = v206
    let v122: [Double] = v195[0]
    v71.p1 = v133
    let v132: Double = v122[0]
    return v132
  }
  func benchmark() {
    let v0: [[s4]] = [[s4(p0: [s3(p0: s0(p0: [[0.0]], p1: [1.0, 2.0]), p1: [s0(p0: [[3.0]], p1: [4.0, 5.0]), s0(p0: [[6.0]], p1: [7.0, 8.0])]), s3(p0: s0(p0: [[9.0]], p1: [10.0, 11.0]), p1: [s0(p0: [[12.0]], p1: [13.0, 14.0]), s0(p0: [[15.0]], p1: [16.0, 17.0])])], p1: s2(p0: [[s0(p0: [[18.0]], p1: [19.0, 20.0])], [s0(p0: [[21.0]], p1: [22.0, 23.0])]], p1: [s1(p0: s0(p0: [[24.0]], p1: [25.0, 26.0])), s1(p0: s0(p0: [[27.0]], p1: [28.0, 29.0])), s1(p0: s0(p0: [[30.0]], p1: [31.0, 32.0]))]))], [s4(p0: [s3(p0: s0(p0: [[33.0]], p1: [34.0, 35.0]), p1: [s0(p0: [[36.0]], p1: [37.0, 38.0]), s0(p0: [[39.0]], p1: [40.0, 41.0])]), s3(p0: s0(p0: [[42.0]], p1: [43.0, 44.0]), p1: [s0(p0: [[45.0]], p1: [46.0, 47.0]), s0(p0: [[48.0]], p1: [49.0, 50.0])])], p1: s2(p0: [[s0(p0: [[51.0]], p1: [52.0, 53.0])], [s0(p0: [[54.0]], p1: [55.0, 56.0])]], p1: [s1(p0: s0(p0: [[57.0]], p1: [58.0, 59.0])), s1(p0: s0(p0: [[60.0]], p1: [61.0, 62.0])), s1(p0: s0(p0: [[63.0]], p1: [64.0, 65.0]))]))], [s4(p0: [s3(p0: s0(p0: [[66.0]], p1: [67.0, 68.0]), p1: [s0(p0: [[69.0]], p1: [70.0, 71.0]), s0(p0: [[72.0]], p1: [73.0, 74.0])]), s3(p0: s0(p0: [[75.0]], p1: [76.0, 77.0]), p1: [s0(p0: [[78.0]], p1: [79.0, 80.0]), s0(p0: [[81.0]], p1: [82.0, 83.0])])], p1: s2(p0: [[s0(p0: [[84.0]], p1: [85.0, 86.0])], [s0(p0: [[87.0]], p1: [88.0, 89.0])]], p1: [s1(p0: s0(p0: [[90.0]], p1: [91.0, 92.0])), s1(p0: s0(p0: [[93.0]], p1: [94.0, 95.0])), s1(p0: s0(p0: [[96.0]], p1: [97.0, 98.0]))]))]]
    let v1: Double = 99.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 99.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
