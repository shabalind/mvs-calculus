  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  struct s4 {
    var p0: s2
    var p1: s0
  }
  func f74(_ v0: [s0]) -> [s0] {
    let v7: s0 = v0[1]
    let v5: [[Double]] = v7.p1
    let v4: [[Double]] = v7.p0
    let v2: s0 = v0[1]
    var v10: s0 = v7
    let v17: s0 = v0[0]
    let v12: [[Double]] = v10.p0
    var v8: s0 = v10
    var v11: [s0] = v0
    v8.p0 = v4
    let v21: [[Double]] = v17.p0
    let v27: s0 = v11[1]
    let v32: [[Double]] = v8.p0
    let v19: [[Double]] = v7.p1
    v10.p1 = v5
    v8.p1 = v19
    let v18: s0 = v11[1]
    let v36: [[Double]] = v2.p1
    v10.p0 = v32
    v10.p0 = v21
    let v24: s1 = s1(p0: v0, p1: v11)
    let v56: [[Double]] = v10.p0
    let v51: [[s0]] = [v0, v0, v11, v11]
    v11[0] = v10
    let v40: [s0] = v24.p1
    v10.p0 = v4
    v8.p0 = v12
    let v35: s1 = s1(p0: v11, p1: v40)
    let v43: [[Double]] = v18.p1
    v8.p1 = v36
    var v77: [[s0]] = v51
    var v50: s1 = v24
    v50 = v35
    v8.p1 = v36
    let v92: [[[s0]]] = [v51, v77]
    var v54: [[[s0]]] = v92
    let v82: [[Double]] = v27.p1
    v8.p0 = v56
    v50.p1 = v40
    let v87: [[s0]] = v54[0]
    v10.p1 = v82
    let v155: [s0] = v87[3]
    let v125: [s0] = v24.p0
    let v118: [[s0]] = v92[1]
    v50.p1 = v0
    v8.p0 = v12
    v77[2] = v155
    v8.p0 = v4
    v10.p0 = v4
    v54[0] = v87
    v8.p1 = v43
    let v136: [s0] = v50.p0
    v54[1] = v118
    v50.p0 = v125
    v50.p0 = v155
    v8.p0 = v4
    return v136
  }
  func f70(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p1
    var v2: [[Double]] = v7
    let v6: [[Double]] = v0.p0
    let v10: [Double] = v7[1]
    v2[2] = v10
    var v9: [Double] = v10
    let v4: Double = v9[0]
    let v1: [Double] = v2[0]
    v2[1] = v9
    v2[2] = v10
    v9[0] = v4
    let v8: [Double] = v6[0]
    v2[1] = v1
    let v28: [[Double]] = v0.p0
    let v35: [Double] = v7[1]
    v2 = v7
    let v31: [[Double]] = v0.p0
    var v19: [[Double]] = v31
    let v29: [[Double]] = v0.p1
    v19[1] = v1
    let v21: [Double] = v28[0]
    var v25: [[Double]] = v31
    var v46: s0 = v0
    var v45: [Double] = v8
    var v43: [[Double]] = v25
    var v53: [[Double]] = v43
    let v58: [Double] = v28[0]
    let v67: [[[Double]]] = [v29]
    v46.p1 = v29
    var v40: [[[Double]]] = v67
    v43[0] = v21
    v46.p0 = v28
    v46.p0 = v19
    var v206: [[[Double]]] = v40
    v40 = v67
    v2[2] = v58
    var v77: [[Double]] = v2
    let v55: Double = v35[0]
    v45[0] = v55
    v46.p1 = v77
    v46.p1 = v29
    v25[1] = v45
    let v100: [[Double]] = v206[0]
    v46.p0 = v53
    v46.p1 = v100
    return v46
  }
  func f61(_ v0: [s2]) -> [s2] {
    var v1: [s2] = v0
    var v5: [s2] = v0
    var v7: [s2] = v1
    v7 = v5
    return v7
  }
  func f44(_ v0: s1) -> s1 {
    var v7: s1 = v0
    let v2: [s1] = [v7, v7, v7, v7, v0]
    v7 = v0
    let v6: [s0] = v0.p0
    var v8: [s1] = v2
    v7 = v0
    v8[3] = v7
    v8[1] = v7
    let v4: [s0] = v0.p1
    v8[0] = v7
    var v10: [s1] = v2
    let v14: [s0] = v0.p1
    var v3: [s1] = v10
    let v12: s1 = v8[2]
    let v25: [s0] = f74(v6)
    v7.p1 = v4
    var v17: [s0] = v14
    v3[0] = v12
    v10[3] = v12
    v10 = v2
    v3[1] = v7
    v17 = v6
    var v35: [s1] = v3
    let v36: s1 = v35[2]
    var v40: [s1] = v2
    var v82: s1 = v36
    v82.p1 = v17
    let v46: s1 = v40[3]
    v3 = v8
    v3[2] = v46
    v7.p1 = v25
    return v82
  }
  func f1(_ v0: s2) -> s2 {
    let v6: s1 = v0.p1
    let v5: s1 = f44(v6)
    let v4: s1 = f44(v5)
    let v9: [s0] = v4.p0
    var v2: [s0] = v9
    let v3: s0 = v9[1]
    var v8: s1 = v5
    let v11: [s0] = v8.p1
    let v15: s0 = v11[0]
    let v10: s2 = s2(p0: v11, p1: v8)
    let v13: [s0] = f74(v2)
    var v24: s2 = v10
    v8.p0 = v11
    v8.p0 = v11
    v8.p1 = v11
    v2[1] = v15
    let v20: s0 = v9[0]
    v2[0] = v20
    v2[1] = v3
    v24.p0 = v9
    v24.p0 = v13
    return v24
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    var v6: [[s2]] = v0
    var v4: [[s2]] = v6
    let v3: [s2] = v4[0]
    let v2: [s2] = f61(v3)
    let v10: [s2] = f61(v2)
    let v5: s2 = v2[0]
    let v13: s2 = f1(v5)
    let v15: s2 = f1(v13)
    v6[0] = v3
    let v11: [s2] = v4[1]
    let v30: [s0] = v5.p0
    v6[1] = v10
    v6[1] = v11
    let v21: [s0] = v5.p0
    let v14: s1 = s1(p0: v21, p1: v21)
    var v17: [s0] = v30
    let v16: s0 = v17[0]
    let v18: s4 = s4(p0: v15, p1: v16)
    let v20: s0 = f70(v16)
    let v22: [[Double]] = v20.p1
    let v34: s2 = v18.p0
    let v19: [s0] = v14.p0
    let v23: [s2] = v4[0]
    var v35: [s2] = v23
    v17[1] = v20
    v4[0] = v35
    v35 = v3
    let v44: [[Double]] = v16.p0
    let v67: [Double] = v22[1]
    var v93: [s0] = v19
    let v62: [Double] = v44[0]
    let v82: Double = v67[0]
    v93[1] = v16
    let v73: s0 = v93[0]
    v6 = v4
    v4[1] = v11
    let v149: Double = v62[0]
    let v101: Double = v149 * v82
    v35[0] = v5
    v35[0] = v34
    v17[1] = v73
    return v101
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], p1: s1(p0: [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])], p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]))], [s2(p0: [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])], p1: s1(p0: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]), s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])], p1: [s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]))]]
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
