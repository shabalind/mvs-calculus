  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s5 {
    var p0: [s1]
    var p1: [[s0]]
  }
  struct s9 {
    var p0: s1
  }
  struct s11 {
    var p0: s9
    var p1: s9
  }
  func f86(_ v0: s9, _ v1: Double) -> Double {
    var v5: s9 = v0
    let v3: s1 = v5.p0
    var v9: s9 = v5
    let v8: s0 = v3.p1
    var v14: s9 = v0
    var v7: s0 = v8
    var v4: s0 = v7
    var v12: s1 = v3
    let v11: [s0] = v3.p0
    v5.p0 = v12
    var v18: s9 = v9
    let v40: s11 = s11(p0: v9, p1: v14)
    v5 = v9
    let v27: [[Double]] = v7.p1
    let v15: [[Double]] = v7.p0
    v12.p0 = v11
    v7.p0 = v15
    var v16: Double = v1
    v4.p0 = v15
    v7.p0 = v15
    let v25: s1 = v18.p0
    let v48: [Double] = v15[0]
    v9.p0 = v3
    v4.p1 = v27
    v4.p0 = v15
    v7.p0 = v15
    v14.p0 = v3
    let v110: [[Double]] = v4.p0
    v7.p0 = v110
    let v49: Double = v48[0]
    v9.p0 = v25
    let v56: s9 = v40.p1
    v9.p0 = v12
    v12.p1 = v7
    v18 = v56
    v9.p0 = v12
    let v60: Double = v16 - v49
    return v60
  }
  func f74(_ v0: s9) -> s9 {
    var v7: s9 = v0
    var v2: s9 = v7
    var v5: s9 = v2
    var v136: s9 = v5
    return v136
  }
  func f73(_ v0: s5) -> s5 {
    var v8: s5 = v0
    var v7: s5 = v0
    let v3: [[s0]] = v0.p1
    v8.p1 = v3
    v8.p1 = v3
    let v1: [[s0]] = v0.p1
    let v5: [s1] = v8.p0
    var v13: [[s0]] = v1
    var v2: [s1] = v5
    let v4: [s1] = v0.p0
    var v11: s5 = v7
    v7.p1 = v13
    v11.p1 = v1
    let v12: [[s0]] = v7.p1
    var v9: [[s0]] = v12
    var v14: s5 = v11
    let v10: [s1] = v8.p0
    var v17: [s1] = v2
    let v49: s1 = v4[1]
    let v23: [s0] = v1[1]
    v2[0] = v49
    let v18: s0 = v23[0]
    var v33: s0 = v18
    var v25: s5 = v8
    let v21: [s0] = v3[2]
    var v22: [s0] = v23
    let v30: [s0] = v3[1]
    v14.p1 = v3
    v14.p0 = v17
    var v20: [s1] = v4
    v22[0] = v33
    v2[2] = v49
    v2 = v20
    let v59: [s0] = v1[2]
    v2[2] = v49
    v11 = v0
    let v52: s1 = v5[0]
    v14.p1 = v13
    let v28: s0 = v23[0]
    let v53: [[Double]] = v33.p0
    let v103: [[Double]] = v28.p1
    v13[1] = v30
    var v73: [[Double]] = v53
    v7 = v14
    let v87: s1 = v2[1]
    let v50: s0 = v21[0]
    var v38: [[s0]] = v12
    v20[2] = v87
    v38[0] = v30
    v25.p1 = v9
    var v47: [s1] = v2
    let v84: s1 = v4[0]
    v47[1] = v87
    v2[0] = v87
    let v65: s1 = v47[1]
    let v85: [[s0]] = v7.p1
    var v97: s1 = v52
    v97.p1 = v50
    v20[1] = v65
    v33.p1 = v103
    v11.p1 = v85
    v9[2] = v22
    let v113: [[s0]] = v11.p1
    var v115: s1 = v97
    v33.p0 = v73
    v11.p1 = v38
    v38[2] = v59
    v2[2] = v115
    v38[1] = v21
    v8.p1 = v113
    v2[0] = v84
    v7.p0 = v17
    v14.p0 = v10
    v11.p0 = v20
    v25.p1 = v9
    return v25
  }
  func f69(_ v0: s0, _ v1: s0) -> s0 {
    let v8: [[Double]] = v0.p1
    let v5: [[[Double]]] = [v8, v8, v8, v8, v8, v8, v8]
    var v9: s0 = v0
    let v2: [[Double]] = v9.p0
    v9.p0 = v2
    v9.p0 = v2
    v9.p0 = v2
    let v20: [[Double]] = v0.p1
    v9.p1 = v20
    let v38: [[Double]] = v0.p0
    let v28: [[Double]] = v9.p0
    var v70: s0 = v9
    let v36: [[Double]] = v5[6]
    v9.p0 = v2
    v70.p0 = v2
    v9.p1 = v20
    v9.p1 = v8
    v9.p0 = v38
    v70.p0 = v38
    var v121: s0 = v70
    let v78: [s0] = [v121, v9, v0, v70]
    let v52: [[Double]] = v9.p1
    let v46: [[Double]] = v9.p0
    v70 = v0
    v9.p1 = v52
    v121.p0 = v46
    v70.p0 = v28
    v70.p1 = v36
    let v119: s0 = v78[2]
    return v119
  }
  func f60(_ v0: s1) -> s1 {
    var v7: s1 = v0
    var v2: s1 = v0
    var v3: s1 = v2
    var v5: s1 = v7
    let v10: [s0] = v0.p0
    let v9: s9 = s9(p0: v0)
    let v14: s0 = v10[0]
    let v12: s0 = f69(v14, v14)
    var v8: [s0] = v10
    v8[0] = v12
    var v40: s9 = v9
    var v21: s0 = v12
    let v30: [s9] = [v9, v40]
    v8[0] = v21
    let v36: s9 = v30[0]
    let v31: s9 = f74(v40)
    let v43: s1 = v31.p0
    let v32: s9 = v30[1]
    let v55: s11 = s11(p0: v36, p1: v32)
    var v54: s9 = v31
    v54.p0 = v5
    let v64: s1 = v54.p0
    v40.p0 = v43
    var v103: s11 = v55
    v103.p0 = v40
    v5.p0 = v10
    let v81: s9 = v103.p1
    v7.p0 = v8
    v40.p0 = v3
    let v169: s1 = v81.p0
    let v131: s1 = v54.p0
    v40.p0 = v64
    v40.p0 = v131
    return v169
  }
  func f47(_ v0: s11) -> s11 {
    let v2: s9 = v0.p1
    let v7: s9 = f74(v2)
    let v5: s11 = s11(p0: v2, p1: v2)
    let v3: s9 = v5.p0
    var v12: s9 = v3
    let v4: s9 = f74(v7)
    var v13: s9 = v12
    var v9: s11 = v0
    v9.p0 = v7
    v9.p0 = v3
    let v18: s9 = f74(v13)
    let v20: s1 = v18.p0
    let v36: s9 = f74(v13)
    v9.p1 = v4
    v9.p1 = v36
    v9.p1 = v3
    v13.p0 = v20
    return v9
  }
  func f16(_ v0: s5) -> s5 {
    let v7: s5 = f73(v0)
    var v1: s5 = v0
    let v4: [s1] = v1.p0
    v1.p0 = v4
    let v2: [[s0]] = v0.p1
    var v11: s5 = v7
    v11.p0 = v4
    v1.p1 = v2
    let v5: [s1] = v0.p0
    var v14: s5 = v11
    v14.p0 = v5
    v11 = v0
    v14.p1 = v2
    return v14
  }
  func f11(_ v0: s5) -> s5 {
    var v6: s5 = v0
    let v4: [[s0]] = v0.p1
    var v3: [[s0]] = v4
    let v2: [s0] = v4[2]
    v6.p1 = v4
    let v13: [s0] = v3[1]
    v3[2] = v13
    let v7: [[s0]] = v0.p1
    v3 = v7
    var v9: s5 = v6
    let v10: [s1] = v0.p0
    v6.p1 = v4
    v9.p0 = v10
    let v26: [s0] = v4[1]
    v3[2] = v26
    v3[2] = v13
    v9.p1 = v3
    v3[1] = v2
    return v9
  }
  func f5(_ v0: s11) -> s11 {
    let v3: s11 = f47(v0)
    let v6: s9 = v3.p0
    var v1: s9 = v6
    let v2: s9 = v3.p1
    let v5: s9 = v0.p0
    let v9: s9 = f74(v2)
    let v4: s9 = f74(v9)
    let v21: s9 = f74(v1)
    let v52: s1 = v5.p0
    let v33: s1 = f60(v52)
    let v63: s1 = v4.p0
    var v27: s9 = v21
    let v70: [s9] = [v2, v1, v27]
    let v43: s9 = v70[1]
    v27.p0 = v33
    let v55: s1 = f60(v63)
    v27.p0 = v33
    let v179: s9 = v70[2]
    v1.p0 = v55
    let v86: s11 = s11(p0: v43, p1: v179)
    return v86
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: s0, _ v2: Double) -> Double {
    let v6: s5 = f11(v0)
    let v7: s5 = f16(v6)
    let v8: [s1] = v7.p0
    let v4: s0 = f69(v1, v1)
    let v11: s0 = f69(v1, v4)
    let v12: [[Double]] = v11.p0
    let v14: s1 = v8[1]
    let v39: s1 = f60(v14)
    let v47: s9 = s9(p0: v39)
    let v57: s1 = v47.p0
    let v71: s9 = f74(v47)
    let v49: [Double] = v12[0]
    var v107: s9 = v71
    let v175: Double = v49[0]
    let v116: s11 = s11(p0: v107, p1: v47)
    let v172: s11 = f5(v116)
    let v292: s9 = v172.p0
    let v65: Double = f86(v292, v175)
    v107.p0 = v57
    return v65
  }
  func benchmark() {
    let v0: s5 = s5(p0: [s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], p1: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])), s1(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])), s1(p0: [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], p1: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]))], p1: [[s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])], [s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])], [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])]])
    let v1: s0 = s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])
    let v2: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
