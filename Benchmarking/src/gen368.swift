  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: [[s0]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s4 {
    var p0: [s2]
    var p1: [[s0]]
  }
  struct s5 {
    var p0: s4
    var p1: s3
    var p2: [s0]
  }
  struct s6 {
    var p0: s0
  }
  func f16(_ v0: s6) -> s6 {
    let v2: [s6] = [v0, v0, v0, v0, v0, v0, v0]
    let v11: s0 = v0.p0
    var v26: [s6] = v2
    let v23: s6 = v26[3]
    let v31: s6 = v2[6]
    var v43: [s6] = v2
    var v57: [s6] = v43
    v57[3] = v23
    let v74: s6 = v43[0]
    let v69: s6 = v26[0]
    v26[3] = v31
    let v58: s6 = v2[1]
    let v53: s6 = s6(p0: v11)
    let v101: s6 = v57[1]
    v26[4] = v69
    v43[2] = v53
    v26[3] = v74
    v43[1] = v58
    return v101
  }
  func f5(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    var v5: s0 = v0
    let v2: [[Double]] = v0.p0
    var v3: [[Double]] = v2
    var v1: s0 = v5
    let v7: [[Double]] = v5.p1
    v1.p1 = v7
    var v9: [[Double]] = v6
    let v18: s6 = s6(p0: v0)
    let v30: [Double] = v7[0]
    let v10: s6 = f16(v18)
    let v11: [s6] = [v18, v10, v18, v10, v18, v18]
    let v41: s0 = v10.p0
    let v47: s6 = v11[4]
    let v25: s6 = v11[4]
    var v17: s0 = v0
    v5.p0 = v2
    let v36: [[[Double]]] = [v3, v2, v2, v6, v6, v9]
    let v29: [Double] = v6[0]
    v3[1] = v29
    v3[2] = v30
    v9[2] = v29
    let v22: s0 = v25.p0
    let v67: s0 = v47.p0
    let v37: [Double] = v7[0]
    v17.p0 = v9
    let v59: [[Double]] = v17.p1
    v9[0] = v29
    var v52: s0 = v67
    v3[2] = v37
    let v124: [[Double]] = v36[3]
    let v87: [Double] = v59[0]
    v52.p0 = v124
    let v106: [s0] = [v0, v1, v22, v41, v17, v52, v22]
    v3[2] = v30
    let v79: s0 = v106[4]
    v52.p0 = v9
    var v120: s0 = v79
    v3[1] = v87
    return v120
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: [s3], _ v2: s1, _ v3: Double) -> Double {
    let v9: [s0] = v2.p0
    var v11: [s0] = v9
    let v20: s0 = v11[0]
    let v16: s0 = f5(v20)
    let v15: [[Double]] = v16.p1
    let v23: [Double] = v15[0]
    v11[0] = v16
    let v47: Double = v23[0]
    var v51: [Double] = v23
    let v77: Double = v51[0]
    v51[0] = v47
    return v77
  }
  func benchmark() {
    let v0: s5 = s5(p0: s4(p0: [s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))], p1: [[s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])], [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])]]), p1: s3(p0: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])], p1: [[s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])]]), p2: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])])
    let v1: [s3] = [s3(p0: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])], p1: [[s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])]]), s3(p0: [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])], p1: [[s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])]]), s3(p0: [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])], p1: [[s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])]])]
    let v2: s1 = s1(p0: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])], p1: s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]]), p2: [[s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])]])
    let v3: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
