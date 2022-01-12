  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f59(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p1
    let v3: [[Double]] = v0.p1
    let v4: [Double] = v2[0]
    var v7: s0 = v0
    var v9: [[Double]] = v3
    v9[0] = v4
    var v8: [[Double]] = v2
    let v11: [[Double]] = v7.p0
    let v5: [[Double]] = v7.p1
    var v10: [[Double]] = v11
    v7.p0 = v10
    v8[0] = v4
    var v17: [[Double]] = v11
    var v16: [[Double]] = v9
    v7.p0 = v11
    let v21: [Double] = v17[0]
    v8[0] = v21
    let v12: [[Double]] = v7.p0
    let v24: [Double] = v17[1]
    let v27: [[Double]] = v7.p1
    let v50: [Double] = v10[1]
    v17[2] = v21
    v8[0] = v50
    let v37: [Double] = v12[2]
    var v30: s0 = v7
    let v23: [[Double]] = v30.p1
    v16[0] = v4
    var v36: s0 = v0
    var v101: s0 = v36
    let v56: s0 = s0(p0: v10, p1: v16)
    let v67: [[Double]] = v101.p0
    let v63: [[Double]] = v56.p0
    v30.p0 = v67
    v36.p0 = v17
    v17[2] = v37
    let v85: [[Double]] = v56.p0
    v9[0] = v24
    v36.p1 = v23
    let v71: s0 = s0(p0: v67, p1: v5)
    v30 = v0
    v30.p1 = v9
    v8 = v3
    v36.p1 = v27
    v7.p0 = v85
    v101.p1 = v8
    let v137: [[Double]] = v30.p0
    v7.p0 = v63
    v17 = v137
    return v71
  }
  func f4(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v2: s0 = f59(v3)
    var v6: s0 = v0
    let v1: s0 = f59(v3)
    let v4: s0 = f59(v3)
    let v8: s0 = f59(v2)
    var v9: s0 = v4
    let v5: [[Double]] = v1.p0
    let v11: s0 = f59(v8)
    var v15: [[Double]] = v5
    let v17: [[Double]] = v3.p0
    var v10: [[Double]] = v17
    let v21: [[Double]] = v4.p0
    let v18: [Double] = v5[0]
    var v16: s0 = v1
    let v26: [[Double]] = v9.p0
    v3.p0 = v15
    let v22: [Double] = v21[1]
    var v14: [[Double]] = v17
    var v20: [Double] = v18
    var v33: [[Double]] = v14
    let v42: [Double] = v26[1]
    let v24: s0 = f59(v0)
    var v35: [[Double]] = v17
    let v19: [Double] = v10[1]
    let v41: [[Double]] = v24.p0
    var v36: s0 = v11
    let v51: [[Double]] = [v42, v20, v19, v20, v19, v20, v20]
    v33[1] = v22
    v14[1] = v22
    var v37: [Double] = v19
    let v104: s0 = f59(v16)
    v16.p0 = v15
    let v55: Double = v37[0]
    let v49: [[[Double]]] = [v51, v51]
    var v61: Double = v55
    v20[0] = v55
    var v40: s0 = v36
    let v66: s0 = f59(v104)
    v40.p0 = v41
    v37[0] = v55
    v36.p0 = v33
    v3.p0 = v35
    let v72: s0 = f59(v40)
    let v79: s0 = f59(v72)
    let v112: s0 = f59(v66)
    var v70: [[Double]] = v15
    v14[1] = v19
    let v80: [[Double]] = v49[0]
    let v58: [Double] = v80[1]
    let v94: s0 = f59(v79)
    let v97: [[Double]] = v6.p1
    let v82: Double = v61 / v55
    let v87: [Double] = v97[0]
    let v48: [[Double]] = v112.p0
    v14[2] = v58
    v15[2] = v87
    v10[2] = v58
    v9.p0 = v70
    let v177: s0 = f59(v94)
    let v137: s0 = f59(v177)
    v16.p1 = v97
    v37[0] = v82
    v6.p0 = v48
    return v137
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [s1], _ v2: Double) -> Double {
    let v4: Double = v2 / v2
    let v7: s0 = v0.p1
    var v6: s0 = v7
    let v5: s0 = f4(v6)
    let v15: [[Double]] = v6.p0
    let v10: [[Double]] = v5.p0
    let v14: [Double] = v15[1]
    var v21: [[Double]] = v10
    let v26: Double = v14[0]
    v21[1] = v14
    v6.p0 = v21
    let v40: Double = v4 * v26
    v6.p0 = v10
    return v40
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]))
    let v1: [s1] = [s1(p0: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])], p1: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])), s1(p0: [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], p1: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])), s1(p0: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]]), s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])], p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]))]
    let v2: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
