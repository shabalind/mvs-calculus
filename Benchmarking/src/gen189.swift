  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s7 {
    var p0: [[s0]]
    var p1: s1
  }
  func f40(_ v0: s7) -> s7 {
    let v1: [s7] = [v0, v0, v0]
    var v7: [s7] = v1
    v7 = v1
    let v10: s7 = v7[0]
    v7[1] = v10
    let v6: s7 = v7[2]
    return v6
  }
  func f38(_ v0: [s0]) -> [s0] {
    var v3: [s0] = v0
    var v8: [s0] = v0
    var v4: [s0] = v3
    let v6: s0 = v4[0]
    let v7: [[Double]] = v6.p1
    let v5: [[Double]] = v6.p0
    v3[1] = v6
    let v1: s1 = s1(p0: v6, p1: v3)
    var v2: [[Double]] = v7
    let v9: [Double] = v7[0]
    var v13: s0 = v6
    var v14: s0 = v6
    v14.p1 = v2
    let v17: [[Double]] = v14.p0
    v14.p1 = v2
    var v20: s1 = v1
    v20.p1 = v4
    v13.p1 = v5
    v13.p0 = v17
    let v19: s0 = v4[0]
    v8[0] = v19
    let v16: s0 = v20.p0
    let v42: [[Double]] = v16.p1
    let v18: [Double] = v17[0]
    let v23: [[Double]] = v16.p1
    let v37: s0 = v20.p0
    v14.p1 = v23
    v2[0] = v18
    let v31: s0 = v1.p0
    let v28: [[Double]] = v16.p1
    var v34: s1 = v20
    v20.p1 = v4
    let v48: [s0] = v20.p1
    v14.p1 = v28
    var v39: s1 = v34
    v8[1] = v16
    let v79: [[Double]] = v19.p1
    v14.p1 = v2
    v20.p1 = v8
    let v71: [[Double]] = v19.p1
    let v67: [s0] = v1.p1
    v13.p0 = v2
    v20.p0 = v31
    v3[1] = v13
    var v196: [[Double]] = v5
    v2[0] = v9
    v39.p0 = v14
    v14.p1 = v28
    let v69: [[[Double]]] = [v79, v71, v79, v196]
    let v165: [[Double]] = v69[2]
    let v166: [s0] = v34.p1
    v14.p0 = v17
    var v126: [[[Double]]] = v69
    v39.p1 = v48
    v20.p0 = v37
    let v93: [s0] = v39.p1
    let v98: s0 = v20.p0
    let v178: [[Double]] = v126[1]
    v14.p1 = v42
    let v161: [[s0]] = [v93, v67, v166]
    v14.p1 = v165
    let v124: [s0] = v161[1]
    v20.p0 = v98
    var v231: [s0] = v124
    v14.p1 = v178
    return v231
  }
  func f36(_ v0: s0) -> s0 {
    var v2: s0 = v0
    let v5: [[Double]] = v2.p1
    let v1: [Double] = v5[0]
    var v7: s0 = v2
    let v11: [Double] = v5[0]
    let v10: [[Double]] = v0.p0
    let v14: [[Double]] = v7.p0
    let v16: [[Double]] = v0.p0
    let v17: [[Double]] = v2.p0
    var v9: [[Double]] = v17
    let v18: [[Double]] = v2.p1
    let v15: [[Double]] = v7.p0
    let v20: [[Double]] = v0.p0
    let v47: [[Double]] = v0.p1
    v2.p0 = v15
    let v23: [[Double]] = v0.p1
    var v30: s0 = v0
    v2.p0 = v5
    v7.p0 = v17
    v2.p0 = v23
    v7 = v30
    let v58: [Double] = v16[0]
    let v63: [Double] = v47[0]
    let v40: s0 = s0(p0: v17, p1: v18)
    let v69: [Double] = v47[0]
    let v54: [[Double]] = v30.p0
    let v53: [[Double]] = v7.p0
    v9[0] = v69
    v9[0] = v69
    var v87: [[Double]] = v9
    var v103: s0 = v2
    let v96: [[Double]] = v40.p1
    v103.p0 = v10
    let v37: [[Double]] = v103.p1
    v103.p0 = v20
    v103.p0 = v14
    v87[0] = v1
    v87[0] = v58
    var v114: [[Double]] = v37
    v114 = v20
    v114[0] = v11
    v9 = v53
    v7.p1 = v54
    v2.p0 = v96
    var v95: [Double] = v63
    v2.p0 = v87
    v103.p0 = v114
    v114[0] = v95
    return v103
  }
  func f28(_ v0: [s7]) -> [s7] {
    let v7: s7 = v0[0]
    let v3: s7 = f40(v7)
    var v2: [s7] = v0
    var v11: [s7] = v2
    let v8: s1 = v7.p1
    v2[0] = v3
    v2 = v11
    var v6: s7 = v7
    let v12: [s7] = [v3, v7, v7, v7, v6, v6]
    let v10: s7 = v12[5]
    let v19: [s1] = [v8]
    v2[0] = v3
    let v20: s1 = v6.p1
    let v14: s7 = f40(v3)
    v6.p1 = v20
    v2[0] = v10
    v2[0] = v14
    let v79: s1 = v19[0]
    v6.p1 = v79
    v6.p1 = v79
    return v2
  }
  func f26(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v5: [[Double]] = v0.p0
    v1.p1 = v5
    let v15: [[Double]] = v0.p1
    let v8: s0 = s0(p0: v5, p1: v15)
    let v24: s0 = f36(v8)
    let v17: [[Double]] = v8.p0
    let v18: [[Double]] = v1.p1
    let v19: [[[Double]]] = [v18, v18, v18, v15]
    let v38: [[Double]] = v1.p1
    let v50: [[Double]] = v8.p0
    v1.p0 = v5
    var v27: [[[Double]]] = v19
    let v39: [[Double]] = v0.p1
    var v79: s0 = v24
    let v42: s0 = f36(v1)
    let v33: s0 = f36(v42)
    let v52: s0 = f36(v33)
    let v89: s0 = f36(v79)
    v79.p1 = v50
    var v46: [[[Double]]] = v27
    let v75: [[Double]] = v52.p1
    let v71: [[Double]] = v89.p1
    let v63: [[Double]] = v1.p1
    let v77: [[Double]] = v46[3]
    v79.p0 = v17
    let v125: s0 = s0(p0: v38, p1: v77)
    v27[2] = v39
    v46[1] = v63
    let v105: s0 = f36(v125)
    v27[2] = v71
    v1.p0 = v75
    return v105
  }
  func f24(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v3: s0 = f36(v7)
    let v2: [[Double]] = v3.p0
    let v14: s0 = s0(p0: v2, p1: v2)
    let v20: s0 = f36(v14)
    return v20
  }
  @inline(never)
  func f0(_ v0: [[s7]], _ v1: Double) -> Double {
    let v8: [s7] = v0[0]
    var v6: [s7] = v8
    let v3: [s7] = f28(v6)
    let v11: [s7] = v0[0]
    var v12: [s7] = v3
    let v18: [s7] = f28(v11)
    let v13: [s7] = v0[0]
    let v23: s7 = v12[0]
    let v15: s1 = v23.p1
    let v20: s7 = f40(v23)
    v12[0] = v20
    var v17: s1 = v15
    let v14: s7 = v18[0]
    v12[0] = v20
    let v21: s1 = v23.p1
    var v19: s7 = v23
    let v41: [[s0]] = v23.p0
    let v28: s7 = v13[0]
    v19 = v14
    var v39: s7 = v28
    let v43: [[s0]] = v39.p0
    let v34: [s0] = v17.p1
    var v58: s7 = v19
    let v27: [s0] = f38(v34)
    let v42: s7 = v11[0]
    let v50: s1 = v23.p1
    let v25: s0 = v27[1]
    let v47: s0 = f24(v25)
    v58.p1 = v21
    v39.p1 = v15
    let v31: [s0] = f38(v27)
    v39.p1 = v17
    let v61: s0 = f36(v47)
    let v33: s0 = f26(v47)
    let v120: s0 = f24(v25)
    v58.p0 = v41
    let v84: s1 = v58.p1
    v39.p0 = v43
    v39.p0 = v43
    v39.p0 = v43
    v17.p0 = v120
    v39.p1 = v84
    var v52: s1 = v50
    v17.p0 = v61
    v39.p0 = v41
    var v112: s7 = v42
    v58.p1 = v15
    v12[0] = v42
    let v48: [[Double]] = v33.p0
    let v115: s1 = v14.p1
    var v117: [[Double]] = v48
    v12[0] = v112
    var v90: s7 = v39
    let v138: [Double] = v117[0]
    var v219: [Double] = v138
    v112.p1 = v52
    let v236: Double = v219[0]
    v19.p1 = v115
    v12[0] = v90
    v52.p1 = v31
    return v236
  }
  func benchmark() {
    let v0: [[s7]] = [[s7(p0: [[s0(p0: [[0.0]], p1: [[1.0]])]], p1: s1(p0: s0(p0: [[2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])]))]]
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
