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
    var p0: s1
    var p1: s0
  }
  func f47(_ v0: s1) -> s1 {
    let v5: [s0] = v0.p1
    var v9: s1 = v0
    let v1: [s0] = v0.p1
    var v15: s1 = v9
    let v11: [s1] = [v0, v15, v15, v15]
    var v18: [s1] = v11
    v15.p1 = v5
    v18[3] = v9
    v9.p1 = v5
    let v23: s1 = v11[0]
    var v19: [s0] = v1
    let v16: s1 = v18[0]
    let v28: s0 = v19[2]
    v9 = v16
    v9.p0 = v28
    return v23
  }
  func f29(_ v0: s2, _ v1: s0) -> s0 {
    var v3: s0 = v1
    let v2: [[Double]] = v1.p1
    let v7: s1 = v0.p0
    let v6: [Double] = v2[2]
    let v9: s1 = f47(v7)
    let v10: Double = v6[0]
    let v13: [Double] = v2[2]
    let v14: [Double] = v2[1]
    var v41: Double = v10
    let v22: s0 = v9.p0
    let v27: Double = v41 + v10
    let v19: [[Double]] = v22.p0
    v3.p0 = v2
    let v33: [[Double]] = v3.p1
    let v26: [Double] = v33[2]
    var v59: [Double] = v26
    var v45: [[Double]] = v19
    let v44: [Double] = v33[1]
    v45[1] = v44
    v45[1] = v44
    v59[0] = v41
    let v61: [Double] = v19[1]
    var v38: [[Double]] = v2
    v3.p0 = v19
    v59[0] = v27
    v45[1] = v59
    let v47: Double = v6[0]
    v38[2] = v44
    v45[1] = v14
    v38[0] = v26
    v45[1] = v44
    let v144: s0 = s0(p0: v38, p1: v38)
    v38[2] = v59
    v38[1] = v26
    v45[1] = v61
    v59[0] = v47
    v3.p1 = v45
    v38[1] = v44
    v45[0] = v13
    v59[0] = v41
    return v144
  }
  func f24(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v6: s0 = v0
    let v5: [[Double]] = v0.p0
    let v7: [[Double]] = v0.p1
    v1.p1 = v7
    let v4: [[Double]] = v1.p0
    v6.p1 = v4
    let v8: [Double] = v4[2]
    var v3: [[Double]] = v4
    let v12: Double = v8[0]
    let v11: s0 = s0(p0: v4, p1: v3)
    v6.p1 = v7
    v1.p0 = v7
    var v24: s0 = v0
    var v15: [[Double]] = v7
    let v10: [[Double]] = v24.p1
    v15 = v10
    var v14: Double = v12
    var v13: [[Double]] = v5
    var v16: [Double] = v8
    var v18: [[Double]] = v5
    let v19: Double = v8[0]
    var v28: s0 = v0
    v18[2] = v16
    let v27: [Double] = v7[2]
    var v35: Double = v19
    let v46: [[Double]] = v11.p1
    let v30: [[Double]] = v28.p0
    v3[0] = v8
    let v21: [[Double]] = v1.p1
    let v34: [[Double]] = v28.p0
    v13[2] = v16
    let v44: [[Double]] = v11.p0
    let v51: [[[Double]]] = [v15]
    v15[1] = v16
    v6.p0 = v5
    let v20: Double = v14 * v35
    var v29: [[[Double]]] = v51
    v16[0] = v20
    v35 = v14
    var v47: Double = v35
    v6.p1 = v13
    let v36: [[Double]] = v6.p0
    v13[2] = v27
    var v31: [[Double]] = v36
    v3[1] = v27
    v29[0] = v46
    v1.p1 = v21
    let v57: [[Double]] = v28.p0
    let v59: s0 = s0(p0: v31, p1: v18)
    v6.p1 = v57
    v35 = v47
    let v63: [[Double]] = v0.p0
    v6.p1 = v44
    var v54: s0 = v6
    let v65: [[Double]] = v29[0]
    let v45: [Double] = v63[0]
    let v72: [Double] = v4[0]
    let v73: [[Double]] = v59.p1
    let v95: [[Double]] = v59.p1
    v31[1] = v8
    v28.p1 = v63
    var v140: [Double] = v45
    v28.p1 = v95
    v18[1] = v45
    v1.p0 = v4
    let v70: [[Double]] = v54.p0
    v31[1] = v72
    v28.p0 = v10
    v6.p1 = v34
    v31[0] = v72
    v13[1] = v45
    v24.p0 = v30
    let v101: [[Double]] = v11.p1
    let v69: [[Double]] = v54.p0
    var v112: [Double] = v16
    v18[1] = v112
    v54.p0 = v69
    var v122: s0 = v59
    v28.p1 = v65
    v122.p1 = v70
    v24.p0 = v7
    v1.p0 = v101
    v28.p1 = v44
    var v251: s0 = v122
    var v156: s0 = v251
    v24.p0 = v73
    v31[0] = v27
    v112 = v140
    return v156
  }
  func f14(_ v0: s2) -> s2 {
    let v4: s0 = v0.p1
    var v3: s2 = v0
    let v1: s0 = f24(v4)
    v3.p1 = v1
    let v5: s0 = f29(v0, v4)
    var v2: s2 = v0
    v2.p1 = v4
    v2.p1 = v1
    let v9: s0 = v2.p1
    let v7: s0 = f29(v2, v9)
    let v11: s1 = v0.p0
    var v18: s1 = v11
    let v12: s0 = v2.p1
    var v6: s0 = v5
    let v35: s1 = f47(v11)
    let v17: s0 = v18.p0
    let v14: s0 = f24(v12)
    let v28: s1 = v2.p0
    var v29: s2 = v2
    let v32: s2 = s2(p0: v35, p1: v14)
    v6 = v12
    let v34: s1 = f47(v28)
    let v19: s2 = s2(p0: v34, p1: v9)
    v2 = v3
    let v26: s0 = f29(v32, v17)
    v29.p0 = v18
    let v50: s1 = f47(v28)
    var v47: s1 = v35
    var v41: s2 = v29
    let v39: [s2] = [v0, v29, v2, v41, v0]
    v3.p1 = v12
    let v21: s0 = v2.p1
    v47.p0 = v6
    let v59: s2 = v39[0]
    v3.p0 = v18
    let v40: [s2] = [v3, v19, v0, v29, v2, v32]
    let v114: s0 = f29(v3, v26)
    var v64: [s2] = v39
    let v124: s2 = v40[5]
    let v77: s1 = f47(v28)
    v47.p0 = v114
    v47.p0 = v7
    let v80: s2 = v64[4]
    v29.p0 = v47
    var v60: [s2] = v40
    let v63: s2 = v60[5]
    let v177: s2 = v39[0]
    v60[2] = v124
    v64[1] = v177
    v2.p1 = v21
    let v99: s0 = v77.p0
    let v94: s0 = f24(v99)
    v64[1] = v63
    v18.p0 = v17
    let v176: [s2] = [v41, v32, v177, v80, v0, v3, v63]
    v64[2] = v59
    v41.p0 = v50
    let v106: s2 = v176[2]
    v29.p1 = v94
    return v106
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v6: Double = v1
    let v5: s2 = f14(v0)
    let v3: s1 = v5.p0
    var v4: Double = v1
    var v9: Double = v6
    let v8: s1 = f47(v3)
    let v23: [s0] = v8.p1
    let v17: s0 = v23[1]
    var v16: Double = v6
    let v47: [[Double]] = v17.p0
    var v41: Double = v9
    let v31: [Double] = v47[2]
    var v26: [Double] = v31
    v26[0] = v16
    v26[0] = v16
    var v64: Double = v41
    v26[0] = v16
    v26[0] = v6
    v26[0] = v16
    var v53: [Double] = v26
    v53[0] = v64
    v53[0] = v4
    let v102: Double = v53[0]
    v53[0] = v64
    v53[0] = v4
    return v102
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]), p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]))
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
