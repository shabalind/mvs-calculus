  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
    var p2: s0
    var p3: [[s1]]
  }
  struct s3 {
    var p0: s1
    var p1: [[s2]]
  }
  func f19(_ v0: s0) -> s0 {
    return v0
  }
  func f16(_ v0: [[Double]]) -> [[Double]] {
    let v4: [Double] = v0[0]
    let v6: [[[Double]]] = [v0, v0]
    let v9: [Double] = v0[1]
    var v5: [Double] = v4
    var v1: [[[Double]]] = v6
    var v3: [Double] = v5
    var v8: [[Double]] = v0
    var v2: [[[Double]]] = v1
    let v7: [[Double]] = v2[1]
    let v11: [[[[Double]]]] = [v2, v6, v6, v2, v6]
    v8[0] = v3
    var v14: [[[[Double]]]] = v11
    var v30: [[[[Double]]]] = v11
    var v13: [Double] = v9
    v30[4] = v2
    v1[1] = v8
    let v18: [[[Double]]] = v14[4]
    let v19: [Double] = v8[1]
    let v15: [[[Double]]] = v30[2]
    v2[0] = v7
    var v23: [[Double]] = v8
    let v10: [Double] = v23[0]
    var v24: [[Double]] = v8
    var v81: [[Double]] = v7
    let v21: [[Double]] = v18[1]
    let v35: Double = v3[0]
    v81[1] = v10
    v13[0] = v35
    v8 = v7
    v14[4] = v15
    var v61: [[[Double]]] = v2
    var v58: [Double] = v3
    let v32: [[Double]] = v1[1]
    v81[1] = v13
    v61[0] = v24
    v23 = v81
    let v29: Double = v3[0]
    v3[0] = v35
    let v85: [[[Double]]] = v30[3]
    v5[0] = v35
    let v38: [Double] = v81[0]
    v3[0] = v29
    var v33: [Double] = v58
    v58[0] = v35
    let v51: [[[Double]]] = [v81, v21, v32, v8, v21]
    var v69: Double = v35
    v33[0] = v29
    let v98: [[Double]] = v51[3]
    var v87: [[[Double]]] = v51
    v30[0] = v61
    let v39: [[Double]] = v85[0]
    v8[0] = v13
    let v111: Double = v29 + v35
    let v158: [[[Double]]] = [v23, v8]
    let v103: [[[[Double]]]] = [v87]
    let v94: [[[Double]]] = v103[0]
    var v170: Double = v111
    v87[1] = v8
    v8[1] = v33
    v14[0] = v158
    v8[0] = v38
    let v102: [[Double]] = v94[4]
    v2[0] = v39
    v1[0] = v98
    v13 = v3
    v8[1] = v19
    v3[0] = v170
    v3[0] = v69
    return v102
  }
  func f9(_ v0: s1) -> s1 {
    let v4: s0 = v0.p1
    var v7: s1 = v0
    var v6: s1 = v7
    let v34: s0 = f19(v4)
    let v22: s0 = f19(v34)
    let v35: s0 = f19(v34)
    let v26: s0 = v6.p1
    var v32: s1 = v7
    v7.p1 = v22
    v32.p1 = v26
    v7.p1 = v35
    return v32
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v5: s1 = v0.p0
    let v7: s1 = v0.p0
    let v6: s0 = v5.p1
    var v4: s0 = v6
    var v2: s3 = v0
    let v3: s0 = f19(v4)
    let v11: [[Double]] = v3.p0
    v2.p0 = v7
    var v18: [[Double]] = v11
    var v8: Double = v1
    let v10: Double = v8 / v1
    let v14: [Double] = v18[1]
    v18[1] = v14
    var v12: [Double] = v14
    let v24: s1 = v2.p0
    let v15: s1 = f9(v24)
    let v32: [[Double]] = f16(v18)
    v2.p0 = v7
    v12[0] = v10
    v12[0] = v1
    v12[0] = v8
    var v26: s1 = v24
    let v42: Double = v12[0]
    let v29: s1 = f9(v26)
    v12[0] = v42
    let v22: [Double] = v11[0]
    v18[1] = v22
    var v54: [Double] = v12
    let v40: [[s2]] = v2.p1
    let v51: Double = v12[0]
    v2.p1 = v40
    v18[0] = v54
    let v41: s0 = v29.p1
    let v101: Double = v22[0]
    v54[0] = v10
    v2.p0 = v15
    let v91: Double = v101 + v51
    v54[0] = v10
    v4 = v41
    v4.p0 = v32
    return v91
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]])), p1: [[s2(p0: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: s1(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])], p1: s0(p0: [[21.0], [22.0]], p1: [[23.0]])), p2: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p3: [[s1(p0: [s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]])], p1: s0(p0: [[33.0], [34.0]], p1: [[35.0]]))], [s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]])], p1: s0(p0: [[42.0], [43.0]], p1: [[44.0]]))]])], [s2(p0: [s0(p0: [[45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0]])], p1: s1(p0: [s0(p0: [[51.0], [52.0]], p1: [[53.0]]), s0(p0: [[54.0], [55.0]], p1: [[56.0]])], p1: s0(p0: [[57.0], [58.0]], p1: [[59.0]])), p2: s0(p0: [[60.0], [61.0]], p1: [[62.0]]), p3: [[s1(p0: [s0(p0: [[63.0], [64.0]], p1: [[65.0]]), s0(p0: [[66.0], [67.0]], p1: [[68.0]])], p1: s0(p0: [[69.0], [70.0]], p1: [[71.0]]))], [s1(p0: [s0(p0: [[72.0], [73.0]], p1: [[74.0]]), s0(p0: [[75.0], [76.0]], p1: [[77.0]])], p1: s0(p0: [[78.0], [79.0]], p1: [[80.0]]))]])], [s2(p0: [s0(p0: [[81.0], [82.0]], p1: [[83.0]]), s0(p0: [[84.0], [85.0]], p1: [[86.0]])], p1: s1(p0: [s0(p0: [[87.0], [88.0]], p1: [[89.0]]), s0(p0: [[90.0], [91.0]], p1: [[92.0]])], p1: s0(p0: [[93.0], [94.0]], p1: [[95.0]])), p2: s0(p0: [[96.0], [97.0]], p1: [[98.0]]), p3: [[s1(p0: [s0(p0: [[99.0], [100.0]], p1: [[101.0]]), s0(p0: [[102.0], [103.0]], p1: [[104.0]])], p1: s0(p0: [[105.0], [106.0]], p1: [[107.0]]))], [s1(p0: [s0(p0: [[108.0], [109.0]], p1: [[110.0]]), s0(p0: [[111.0], [112.0]], p1: [[113.0]])], p1: s0(p0: [[114.0], [115.0]], p1: [[116.0]]))]])]])
    let v1: Double = 117.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 117.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
