  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s4 {
    var p0: [s0]
    var p1: s2
  }
  struct s8 {
    var p0: [s2]
    var p1: s4
  }
  func f101(_ v0: s2) -> s2 {
    return v0
  }
  func f85(_ v0: s2) -> s2 {
    let v14: s2 = f101(v0)
    let v19: s2 = f101(v14)
    let v12: s2 = f101(v19)
    return v12
  }
  func f81(_ v0: s8) -> s8 {
    let v1: [s2] = v0.p0
    let v7: s2 = v1[0]
    var v8: [s2] = v1
    var v3: [s2] = v1
    let v4: s2 = f101(v7)
    var v2: [s2] = v3
    let v12: s2 = f85(v7)
    v3 = v8
    v8[0] = v7
    var v43: s8 = v0
    v2[0] = v4
    let v28: s2 = f101(v12)
    v43.p0 = v2
    let v75: s2 = f85(v28)
    let v69: s4 = v43.p1
    v43.p1 = v69
    v3[0] = v75
    return v43
  }
  func f76(_ v0: s8) -> s8 {
    let v7: [s2] = v0.p0
    var v1: [s2] = v7
    let v6: s8 = f81(v0)
    let v3: s2 = v7[0]
    let v4: s2 = v7[0]
    let v9: s2 = v7[0]
    var v10: s2 = v3
    var v8: s8 = v6
    var v2: [s2] = v7
    let v24: s2 = f85(v10)
    let v29: s2 = f101(v10)
    v8.p0 = v2
    var v12: s8 = v8
    let v18: s2 = f85(v9)
    let v32: s2 = v7[0]
    let v15: [s0] = v24.p1
    var v33: [s2] = v7
    v10.p1 = v15
    let v17: s4 = v12.p1
    v33[0] = v18
    v8.p1 = v17
    let v59: [s0] = v17.p0
    var v28: s4 = v17
    v12.p0 = v33
    v8 = v0
    var v65: [s0] = v59
    let v19: s2 = f85(v3)
    v33[0] = v3
    let v69: s2 = f101(v32)
    let v37: [s0] = v4.p0
    v28.p1 = v29
    var v137: [s2] = v2
    v33[0] = v29
    var v58: [s2] = v137
    var v48: [s2] = v58
    let v74: s2 = v58[0]
    v28.p0 = v65
    v8.p0 = v1
    var v86: [s0] = v37
    v2[0] = v29
    v58[0] = v19
    v28.p1 = v3
    v137 = v58
    v1[0] = v69
    v2[0] = v18
    v12 = v8
    let v191: s8 = s8(p0: v48, p1: v28)
    v10.p0 = v86
    v33[0] = v74
    return v191
  }
  func f44(_ v0: s8) -> s8 {
    let v1: s8 = f81(v0)
    let v4: [s2] = v0.p0
    let v5: s8 = f76(v1)
    let v3: s2 = v4[0]
    let v8: [s0] = v3.p1
    var v17: s2 = v3
    var v2: [s2] = v4
    let v9: s0 = v8[1]
    var v23: s0 = v9
    var v10: s2 = v17
    var v15: s2 = v10
    let v13: s2 = v2[0]
    let v12: s2 = v4[0]
    var v11: s2 = v12
    v11 = v15
    v10.p1 = v8
    var v18: s0 = v23
    let v21: s0 = v8[1]
    v2[0] = v13
    var v41: s8 = v5
    v15.p1 = v8
    v2[0] = v11
    v11.p1 = v8
    let v28: s2 = v2[0]
    v41.p0 = v2
    let v36: s0 = v8[0]
    var v51: [s0] = v8
    let v54: [[Double]] = v21.p0
    let v25: s0 = v8[1]
    var v34: [s0] = v8
    var v38: [[Double]] = v54
    let v40: s0 = v51[2]
    var v30: s0 = v36
    let v47: s0 = v51[2]
    let v52: s4 = v1.p1
    v34[1] = v30
    let v89: [Double] = v54[1]
    v34[1] = v36
    var v102: [s0] = v34
    v51[2] = v40
    var v77: s0 = v18
    v102[1] = v47
    v10.p1 = v102
    var v114: s4 = v52
    v102[1] = v25
    v2[0] = v10
    v23.p0 = v54
    v38[0] = v89
    v102[2] = v25
    v30.p0 = v38
    v34[0] = v77
    var v190: s0 = v30
    var v104: s4 = v114
    v15.p1 = v51
    var v234: s8 = v41
    v34[2] = v9
    v51[2] = v190
    v234.p1 = v104
    v17.p1 = v102
    v114.p1 = v28
    let v250: [s0] = v15.p0
    v11.p0 = v250
    return v234
  }
  func f24(_ v0: s8) -> s8 {
    let v5: [s2] = v0.p0
    var v8: [s2] = v5
    var v1: [s2] = v5
    let v6: [s2] = v0.p0
    let v2: s2 = v6[0]
    var v14: s8 = v0
    v14.p0 = v1
    let v3: s2 = f85(v2)
    let v11: s4 = v14.p1
    let v25: s8 = f44(v14)
    var v10: s4 = v11
    var v18: s8 = v25
    v8[0] = v3
    v14.p0 = v6
    let v12: s2 = v11.p1
    let v63: s2 = v8[0]
    v10 = v11
    v1[0] = v12
    let v43: [s0] = v10.p0
    let v87: s8 = f44(v14)
    v10.p0 = v43
    v18.p1 = v11
    v1[0] = v63
    v18.p1 = v11
    v14.p1 = v10
    let v46: s4 = v87.p1
    let v118: s2 = v8[0]
    let v117: s4 = v0.p1
    v1[0] = v118
    v18.p1 = v10
    v14.p1 = v46
    v1[0] = v2
    v18.p1 = v117
    return v18
  }
  func f15(_ v0: s4, _ v1: s8) -> s4 {
    let v32: [s0] = v0.p0
    let v46: s4 = v1.p1
    var v139: s4 = v46
    v139.p0 = v32
    return v139
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: Double) -> Double {
    let v7: [Double] = [v1, v1, v1, v1, v1, v1]
    var v3: [s8] = v0
    let v9: s8 = v3[1]
    let v6: Double = v7[2]
    let v8: s4 = v9.p1
    v3 = v0
    var v11: [s8] = v0
    v3 = v0
    v11[0] = v9
    let v5: s4 = f15(v8, v9)
    v11[0] = v9
    let v17: s8 = v0[0]
    let v34: s8 = f24(v9)
    let v21: [s2] = v17.p0
    let v32: s8 = f24(v34)
    v3[0] = v34
    var v38: s8 = v32
    let v39: [s2] = v32.p0
    v11[1] = v9
    let v60: s4 = v38.p1
    let v41: s8 = v0[0]
    v11[1] = v34
    v11[0] = v32
    let v50: s8 = v11[0]
    v38.p1 = v5
    v38.p1 = v60
    let v69: [s0] = v5.p0
    v3[0] = v17
    v3[0] = v50
    let v90: s0 = v69[0]
    var v56: [s2] = v21
    let v63: s8 = f24(v34)
    let v101: [[Double]] = v90.p0
    v38.p1 = v8
    v11[1] = v41
    v11[1] = v50
    let v87: [Double] = v101[0]
    v38.p0 = v39
    v11[0] = v38
    v11[1] = v63
    v38.p0 = v56
    let v107: Double = v87[0]
    let v296: Double = v107 * v6
    v3[1] = v32
    return v296
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: [s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])])], p1: s4(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0]])], p1: s2(p0: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])], p1: [s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]])]))), s8(p0: [s2(p0: [s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]])], p1: [s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]]), s0(p0: [[45.0], [46.0]], p1: [[47.0]])])], p1: s4(p0: [s0(p0: [[48.0], [49.0]], p1: [[50.0]])], p1: s2(p0: [s0(p0: [[51.0], [52.0]], p1: [[53.0]]), s0(p0: [[54.0], [55.0]], p1: [[56.0]])], p1: [s0(p0: [[57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0]]), s0(p0: [[63.0], [64.0]], p1: [[65.0]])])))]
    let v1: Double = 66.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 66.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
