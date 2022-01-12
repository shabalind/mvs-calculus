  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f45(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v6: s0 = v4
    var v2: s0 = v0
    var v1: s0 = v2
    let v8: [[Double]] = v1.p0
    let v3: [[Double]] = v6.p1
    let v7: [[Double]] = v6.p1
    v4.p1 = v7
    var v13: s0 = v6
    v4 = v1
    var v17: [[Double]] = v8
    v13.p0 = v8
    v4 = v13
    var v32: [[Double]] = v8
    v1.p0 = v32
    v2.p1 = v3
    v2.p0 = v32
    v2.p0 = v17
    return v1
  }
  func f43(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v8: [[Double]] = v7.p1
    let v6: s0 = f45(v0)
    let v12: s0 = f45(v7)
    let v13: s0 = f45(v6)
    let v14: [[[Double]]] = [v8, v8, v8]
    let v31: [[Double]] = v12.p0
    let v16: [[Double]] = v12.p1
    let v23: [[[Double]]] = [v31]
    let v27: [[Double]] = v23[0]
    var v25: [[[Double]]] = v23
    var v33: [[Double]] = v16
    let v29: [[Double]] = v14[2]
    let v30: s0 = f45(v12)
    v7 = v13
    let v47: s0 = f45(v30)
    v7.p1 = v29
    v25 = v23
    var v70: s0 = v47
    v70.p1 = v33
    let v86: [[Double]] = v25[0]
    v7.p0 = v27
    v7.p0 = v86
    return v70
  }
  func f21(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p1
    let v9: [[Double]] = v0.p0
    let v1: s0 = f45(v0)
    let v8: [[Double]] = v1.p1
    let v16: [Double] = v8[2]
    let v11: [[[Double]]] = [v6, v8, v8, v8, v8, v6, v6]
    var v42: [[Double]] = v9
    v42[0] = v16
    var v63: [[[Double]]] = v11
    let v72: [[Double]] = v63[5]
    v63[2] = v6
    let v57: s0 = s0(p0: v42, p1: v72)
    return v57
  }
  func f5(_ v0: s0) -> s0 {
    let v5: s0 = f21(v0)
    let v7: s0 = f45(v5)
    var v4: s0 = v0
    let v1: s0 = f43(v7)
    var v11: s0 = v5
    var v6: s0 = v11
    let v8: [[Double]] = v7.p0
    v6.p0 = v8
    var v13: s0 = v5
    let v10: [[Double]] = v6.p1
    let v15: [[Double]] = v5.p0
    v13.p1 = v10
    let v9: s0 = f21(v6)
    let v14: [Double] = v8[1]
    let v34: s0 = f21(v0)
    let v17: [[Double]] = v1.p1
    let v16: [Double] = v17[2]
    var v24: [[Double]] = v17
    let v28: s0 = f45(v9)
    let v30: [Double] = v15[0]
    var v21: [[Double]] = v15
    v21[0] = v16
    v4 = v0
    var v19: [[Double]] = v8
    let v42: s0 = s0(p0: v21, p1: v10)
    v13.p1 = v24
    v4.p1 = v17
    let v31: [[Double]] = v5.p1
    let v43: s0 = f43(v28)
    v6 = v43
    var v41: [[Double]] = v17
    let v57: s0 = f43(v34)
    v4.p1 = v41
    v6.p1 = v24
    let v61: s0 = f43(v57)
    v21[0] = v30
    let v35: s0 = f43(v13)
    v6.p0 = v19
    let v80: [s0] = [v61]
    v24[0] = v30
    let v53: s0 = f21(v4)
    var v50: [s0] = v80
    let v32: s0 = f45(v35)
    let v70: [[Double]] = v1.p1
    let v121: [[Double]] = v42.p1
    let v131: [[Double]] = v61.p0
    var v58: s0 = v11
    v24[2] = v14
    v11.p1 = v70
    let v47: s0 = f21(v53)
    let v44: [Double] = v10[1]
    v13 = v7
    v4.p0 = v19
    let v339: s0 = v50[0]
    v13.p0 = v19
    let v193: [[Double]] = v53.p0
    v58.p1 = v121
    v6.p1 = v31
    var v139: [[Double]] = v41
    let v126: s0 = f43(v339)
    let v101: s0 = f43(v126)
    let v66: [[Double]] = v35.p0
    v6.p0 = v66
    let v163: [[Double]] = v32.p0
    let v177: s0 = f45(v58)
    let v114: s0 = f43(v101)
    v13.p1 = v139
    let v115: [s0] = [v114, v47, v101, v1, v177]
    v13.p0 = v193
    v58.p1 = v139
    let v100: s0 = v115[1]
    v4.p0 = v163
    v11.p0 = v131
    v139[0] = v44
    v6.p0 = v19
    return v100
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v3: [s0] = v0.p0
    let v4: s0 = v3[1]
    let v11: s0 = f21(v4)
    let v12: s0 = f5(v11)
    var v10: s0 = v12
    let v8: [[Double]] = v10.p1
    var v36: [[Double]] = v8
    let v19: [Double] = v36[0]
    v36[0] = v19
    let v25: [[Double]] = v12.p0
    v10.p0 = v25
    let v57: Double = v19[0]
    var v112: Double = v57
    return v112
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
