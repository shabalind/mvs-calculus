  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s0
  }
  func f17(_ v0: s0) -> s0 {
    var v6: s0 = v0
    v6 = v0
    let v7: [s0] = [v0, v6, v6, v6, v0, v6, v0]
    var v9: [s0] = v7
    let v4: s0 = v7[4]
    let v8: [[Double]] = v4.p0
    var v2: s0 = v0
    v9[2] = v2
    let v1: [[Double]] = v0.p1
    var v11: s0 = v4
    v11 = v4
    var v13: s0 = v4
    v6 = v13
    let v21: s0 = s0(p0: v1, p1: v1)
    var v14: s0 = v11
    let v25: [[s0]] = [v7, v9, v7, v7]
    v9[5] = v11
    var v17: [[s0]] = v25
    v9[1] = v21
    let v18: [s0] = v17[3]
    var v30: [[Double]] = v8
    let v22: [Double] = v1[0]
    let v36: [[Double]] = v6.p1
    v2.p1 = v30
    let v67: [[Double]] = v2.p0
    v6.p0 = v1
    v13.p0 = v67
    v9 = v7
    let v20: [[Double]] = v21.p1
    let v43: [[Double]] = v14.p0
    v9[0] = v13
    var v51: [s0] = v18
    let v23: s0 = v51[3]
    var v35: [[Double]] = v8
    let v74: [[Double]] = v4.p1
    v2.p0 = v43
    v35[1] = v22
    let v54: [[Double]] = v4.p1
    v11.p1 = v35
    var v86: s0 = v23
    let v77: s0 = s0(p0: v74, p1: v54)
    v86.p1 = v36
    var v94: [s0] = v51
    v6.p0 = v20
    v86.p1 = v35
    v17[2] = v94
    v6 = v77
    return v86
  }
  func f12(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p1
    let v5: [Double] = v3[2]
    let v8: s0 = f17(v0)
    let v4: [[Double]] = v8.p0
    var v6: s0 = v0
    v6.p1 = v4
    let v12: [Double] = v3[1]
    let v1: s0 = f17(v0)
    let v7: s0 = f17(v1)
    let v13: s0 = f17(v6)
    let v27: [Double] = v4[2]
    v6.p1 = v4
    let v11: Double = v5[0]
    let v24: [[Double]] = v1.p1
    var v18: [Double] = v12
    let v30: [[Double]] = v8.p0
    let v21: [Double] = v30[0]
    let v29: s0 = f17(v7)
    var v50: s0 = v1
    let v15: [[Double]] = v8.p1
    let v34: [[Double]] = v29.p1
    let v37: [Double] = v4[1]
    v6.p1 = v24
    var v47: [[Double]] = v34
    v6.p1 = v24
    v50.p1 = v47
    v47[2] = v5
    v50.p0 = v47
    v6.p0 = v15
    var v53: s0 = v13
    let v41: [[Double]] = v53.p0
    v18[0] = v11
    var v70: [[Double]] = v30
    let v36: [Double] = v70[2]
    let v49: [Double] = v4[0]
    v50.p0 = v30
    let v63: [[Double]] = [v21, v37, v5, v18, v21, v12, v36]
    let v197: [Double] = v63[4]
    let v124: s0 = f17(v50)
    v47[1] = v197
    let v69: [[Double]] = v1.p1
    let v77: s0 = f17(v6)
    v47[1] = v5
    v47[1] = v27
    v53.p0 = v34
    let v148: [[Double]] = v77.p1
    let v156: s0 = f17(v124)
    let v242: [[Double]] = v156.p0
    let v108: s0 = s0(p0: v242, p1: v41)
    v53.p0 = v148
    v6.p1 = v69
    v70[2] = v49
    return v108
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v6: s2 = v0[1]
    let v4: s2 = v0[1]
    let v5: s0 = v4.p1
    let v14: Double = v1 / v1
    let v7: s0 = v6.p1
    var v19: s0 = v5
    let v29: [[Double]] = v7.p0
    let v12: s0 = f17(v19)
    let v70: s0 = f12(v19)
    let v33: [[Double]] = v70.p0
    let v39: s2 = v0[0]
    var v45: [[Double]] = v29
    let v52: [Double] = v33[0]
    var v41: [Double] = v52
    v19.p1 = v45
    let v74: s0 = v39.p1
    let v47: [[Double]] = v74.p0
    var v99: [Double] = v41
    v41[0] = v14
    var v62: s0 = v19
    v19.p0 = v45
    let v122: [[Double]] = v12.p0
    v62.p0 = v122
    let v87: Double = v41[0]
    v62.p1 = v47
    let v148: [Double] = [v87, v14]
    v45[2] = v99
    let v108: Double = v148[1]
    v19 = v62
    return v108
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])), s2(p0: [[s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]))]
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
