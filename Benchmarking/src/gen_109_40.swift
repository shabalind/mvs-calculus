  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s1]]
    var p1: s0
  }
  func f44(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v4: [[Double]] = v5.p0
    let v6: [[Double]] = v5.p1
    v5.p0 = v4
    var v11: s0 = v0
    v5.p0 = v4
    v11.p1 = v6
    let v12: [[Double]] = v11.p1
    var v14: [[Double]] = v12
    let v29: [Double] = v6[0]
    let v17: s0 = s0(p0: v4, p1: v12)
    v14[1] = v29
    let v16: [[Double]] = v0.p1
    let v21: [[Double]] = v17.p0
    let v35: [Double] = v16[0]
    v11.p0 = v4
    let v19: [[Double]] = v11.p1
    var v32: [[Double]] = v4
    let v44: s0 = s0(p0: v32, p1: v14)
    let v70: [[Double]] = v44.p0
    let v25: [[Double]] = v11.p1
    let v39: [Double] = v25[0]
    var v47: [[Double]] = v21
    let v54: [Double] = v19[1]
    v47[0] = v39
    v11.p1 = v14
    var v66: [[Double]] = v47
    v32[0] = v54
    v14[1] = v54
    let v76: [Double] = v4[2]
    let v125: [[[Double]]] = [v70, v66]
    v11.p0 = v66
    let v60: [[Double]] = v125[0]
    let v78: [[Double]] = v17.p0
    v14[0] = v76
    var v42: s0 = v0
    v11.p0 = v21
    let v91: [[Double]] = v5.p1
    v66[1] = v35
    let v145: s0 = s0(p0: v60, p1: v91)
    v11.p0 = v21
    v5 = v42
    v11.p0 = v70
    v42.p0 = v21
    v42.p0 = v78
    return v145
  }
  func f40(_ v0: s1) -> s1 {
    return v0
  }
  func f39(_ v0: s1) -> s1 {
    let v6: [s0] = v0.p1
    let v5: s0 = v6[0]
    let v4: s1 = f40(v0)
    let v14: s1 = f40(v4)
    let v1: [s0] = v4.p1
    let v31: s1 = s1(p0: v5, p1: v6)
    let v12: s1 = f40(v31)
    let v28: s1 = f40(v12)
    var v100: s1 = v14
    v100.p1 = v1
    v100.p1 = v6
    v100 = v28
    return v100
  }
  func f38(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v6: [[Double]] = v0.p1
    let v5: [[Double]] = v0.p0
    var v9: s0 = v0
    let v7: s0 = f44(v3)
    var v2: [[Double]] = v5
    let v4: [Double] = v2[0]
    var v8: [[Double]] = v6
    let v11: [Double] = v8[0]
    let v12: [Double] = v8[0]
    let v13: [Double] = v5[1]
    var v17: [[Double]] = v8
    v3.p0 = v5
    v17[0] = v11
    v9.p1 = v17
    v2[0] = v13
    let v15: s0 = f44(v9)
    let v10: [Double] = v8[1]
    let v14: [[Double]] = v7.p0
    v17[1] = v12
    v3.p1 = v17
    let v18: [[Double]] = v15.p1
    v2[2] = v4
    let v28: [[Double]] = v7.p0
    let v33: [[Double]] = v3.p0
    let v50: [Double] = v33[1]
    var v58: [[Double]] = v6
    v17[1] = v4
    var v19: [[Double]] = v2
    let v38: [[Double]] = v0.p0
    let v23: s0 = f44(v3)
    v8[1] = v10
    v3.p0 = v28
    var v69: s0 = v23
    v69.p0 = v28
    v9.p0 = v38
    v19[2] = v10
    v58[1] = v4
    v2[0] = v50
    v69.p0 = v14
    v69.p1 = v18
    let v68: s0 = f44(v15)
    let v76: [Double] = v58[1]
    v2[1] = v76
    let v67: [[Double]] = v68.p1
    v8[0] = v12
    v3.p0 = v19
    var v96: s0 = v69
    v9.p1 = v67
    return v96
  }
  func f25(_ v0: s1) -> s1 {
    let v6: s0 = v0.p0
    let v3: s0 = f38(v6)
    var v17: s1 = v0
    let v94: s1 = f39(v17)
    var v53: s1 = v94
    let v131: [s0] = v53.p1
    let v114: s1 = s1(p0: v3, p1: v131)
    return v114
  }
  func f18(_ v0: s1, _ v1: s1) -> s1 {
    let v9: s0 = v0.p0
    let v13: s1 = f39(v0)
    var v18: s1 = v13
    var v36: s1 = v13
    v36 = v18
    let v39: s1 = f25(v36)
    v36.p0 = v9
    let v422: s1 = f39(v39)
    return v422
  }
  func f15(_ v0: s1) -> s1 {
    var v5: s1 = v0
    var v6: s1 = v0
    let v7: s0 = v6.p0
    let v11: s0 = f44(v7)
    v6 = v0
    var v13: s1 = v5
    let v2: [s0] = v6.p1
    v13.p0 = v7
    v6.p1 = v2
    let v54: s1 = f40(v13)
    v13.p0 = v11
    return v54
  }
  func f13(_ v0: s1, _ v1: s1) -> s1 {
    let v4: s1 = f15(v1)
    let v19: s1 = f18(v4, v4)
    return v19
  }
  func f10(_ v0: s1) -> s1 {
    var v6: s1 = v0
    let v3: [s0] = v6.p1
    v6.p1 = v3
    let v7: [s0] = v0.p1
    let v5: s0 = v7[2]
    var v2: s0 = v5
    let v4: s0 = v3[2]
    var v1: [s0] = v7
    v6.p1 = v3
    let v11: s1 = f15(v0)
    var v14: s0 = v2
    let v12: s0 = v11.p0
    v1[1] = v14
    let v17: s1 = f40(v6)
    let v28: s1 = f39(v6)
    let v22: s0 = v1[0]
    let v46: s1 = f18(v28, v17)
    let v27: s0 = f38(v2)
    let v19: [[Double]] = v4.p1
    let v36: [[[Double]]] = [v19, v19, v19]
    let v60: [[Double]] = v36[1]
    v6.p0 = v5
    var v37: s0 = v27
    v37.p1 = v60
    var v70: s0 = v12
    let v48: [[Double]] = v36[1]
    v1[2] = v70
    let v39: s1 = f15(v46)
    v6.p0 = v27
    v6.p0 = v37
    v70.p1 = v60
    var v84: [[Double]] = v48
    let v184: s1 = f13(v39, v46)
    v6.p0 = v22
    let v127: s1 = f15(v184)
    v14.p1 = v84
    return v127
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: [[s2]], _ v2: Double) -> Double {
    let v3: [s2] = v1[0]
    let v14: s2 = v3[0]
    let v9: [[s1]] = v14.p0
    let v20: [s1] = v9[2]
    let v19: s1 = v20[0]
    let v17: s1 = f10(v19)
    let v18: [s0] = v17.p1
    let v31: s0 = v18[0]
    let v41: [[Double]] = v31.p1
    var v32: [[Double]] = v41
    let v83: [Double] = v32[0]
    v32[1] = v83
    let v99: [[Double]] = v31.p1
    v32[0] = v83
    var v103: [Double] = v83
    let v69: Double = v103[0]
    v32 = v99
    var v71: [[Double]] = v41
    let v112: [Double] = v71[0]
    let v134: Double = v112[0]
    var v169: Double = v2
    let v132: Double = v134 + v169
    let v215: Double = v132 - v69
    return v215
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])])], [s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])])]]
    let v1: [[s2]] = [[s2(p0: [[s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: [s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]), s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])])], [s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]]), p1: [s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]]), s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]]), s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]])])], [s1(p0: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]]), p1: [s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]]), s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]]), s0(p0: [[95.0], [96.0], [97.0]], p1: [[98.0], [99.0]])])]], p1: s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0], [104.0]]))]]
    let v2: Double = 105.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 105.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
