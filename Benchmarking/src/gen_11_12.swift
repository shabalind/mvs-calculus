  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f110(_ v0: s1) -> s1 {
    var v5: s1 = v0
    let v1: [s0] = v5.p1
    let v4: s0 = v1[1]
    let v6: [s0] = v0.p1
    let v2: s0 = v1[0]
    v5.p1 = v1
    let v3: s0 = v1[1]
    let v11: s0 = v6[1]
    v5.p1 = v6
    var v9: [s0] = v6
    v5.p0 = v1
    v5.p1 = v1
    let v8: [s0] = v5.p0
    v5.p1 = v1
    var v10: [s0] = v8
    var v18: s1 = v0
    v5.p1 = v10
    let v20: [s0] = v0.p0
    v10[1] = v3
    var v29: s1 = v18
    v9[0] = v4
    let v30: [[Double]] = v11.p2
    v9 = v8
    v5.p0 = v9
    let v24: s1 = s1(p0: v20, p1: v1)
    let v38: s1 = s1(p0: v8, p1: v6)
    v9[0] = v2
    let v45: [s0] = v0.p0
    v5.p0 = v45
    let v57: s0 = v6[1]
    v18.p0 = v8
    let v51: [s0] = v38.p1
    let v60: [s0] = v0.p1
    let v72: [s0] = v18.p0
    v10[1] = v57
    let v37: s0 = v60[0]
    v9[1] = v11
    v10[1] = v37
    v29.p1 = v45
    v29.p0 = v51
    let v119: s0 = v72[0]
    var v55: s0 = v2
    v55 = v57
    v29.p1 = v45
    v55.p2 = v30
    let v144: [s0] = v24.p1
    var v170: s1 = v29
    v10[1] = v55
    v9[1] = v119
    v5.p0 = v144
    v170.p0 = v9
    return v170
  }
  func f107(_ v0: [[Double]]) -> [[Double]] {
    let v1: [Double] = v0[2]
    var v5: [Double] = v1
    var v4: [Double] = v5
    var v6: [[Double]] = v0
    var v2: [Double] = v5
    let v3: [[[Double]]] = [v0, v6, v0]
    let v7: [[Double]] = v3[2]
    var v8: [[Double]] = v7
    var v12: [Double] = v2
    let v13: [[Double]] = v3[1]
    var v11: [[[Double]]] = v3
    v6[2] = v5
    v11[1] = v6
    v6[0] = v4
    v6[2] = v1
    let v19: [[Double]] = v11[2]
    let v16: [[Double]] = v3[0]
    var v9: [Double] = v5
    let v14: [[[Double]]] = [v19, v16, v13, v7, v13, v0, v8]
    let v26: Double = v12[0]
    let v21: Double = v9[0]
    var v45: Double = v21
    v4 = v12
    v12 = v5
    let v27: [Double] = v13[1]
    v12[0] = v26
    v12[0] = v45
    v2[0] = v26
    let v59: [[[[Double]]]] = [v14, v14, v14, v14, v14]
    var v29: [[[[Double]]]] = v59
    v12 = v27
    let v55: Double = v5[0]
    let v74: [[[Double]]] = v29[2]
    var v231: [[[Double]]] = v74
    v9[0] = v55
    let v70: [[Double]] = v231[3]
    v6[2] = v4
    return v70
  }
  func f103(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v1: [[Double]] = v3.p0
    var v11: [[Double]] = v1
    let v4: [[Double]] = v0.p2
    let v2: [[Double]] = f107(v11)
    var v5: [[Double]] = v4
    let v7: [Double] = v4[0]
    var v10: [[Double]] = v5
    v10 = v4
    v3.p1 = v11
    let v17: [[Double]] = f107(v1)
    v10[0] = v7
    v11[0] = v7
    v5[0] = v7
    let v20: [Double] = v2[1]
    v5[0] = v20
    v3.p0 = v11
    var v24: s0 = v0
    v24.p2 = v10
    v24.p0 = v17
    return v24
  }
  func f85(_ v0: s0, _ v1: s0) -> s0 {
    var v7: s0 = v1
    let v5: s0 = f103(v7)
    let v4: [[Double]] = v0.p0
    let v6: [[Double]] = v5.p1
    let v2: [[Double]] = f107(v4)
    let v8: [Double] = v6[1]
    v7.p1 = v2
    let v12: s0 = f103(v1)
    let v25: [Double] = v2[2]
    let v9: [[Double]] = v12.p2
    let v15: [[Double]] = f107(v4)
    let v17: [[Double]] = f107(v15)
    v7.p1 = v17
    let v14: [[Double]] = v5.p0
    let v13: [[Double]] = v5.p2
    v7.p0 = v4
    var v11: s0 = v12
    let v21: [[Double]] = v7.p0
    let v22: Double = v25[0]
    let v26: [Double] = v13[0]
    let v46: s0 = f103(v11)
    var v35: [Double] = v26
    let v37: Double = v8[0]
    v35 = v26
    v7.p2 = v13
    let v42: [[Double]] = v0.p2
    let v24: [[Double]] = f107(v2)
    var v34: [[Double]] = v42
    v35[0] = v22
    v35[0] = v37
    v7.p0 = v4
    var v71: [[Double]] = v24
    var v33: [[Double]] = v34
    let v107: s0 = f103(v5)
    v7.p2 = v13
    let v53: s0 = f103(v107)
    v7.p0 = v21
    v11.p1 = v14
    v7.p2 = v13
    v7.p0 = v71
    v33 = v9
    let v38: s0 = f103(v46)
    v11.p2 = v33
    let v108: [s0] = [v38, v12, v53, v53, v0, v11]
    v33[0] = v8
    v71[0] = v35
    let v56: s0 = v108[0]
    let v187: s0 = f103(v56)
    return v187
  }
  func f66(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v5: s0 = f85(v3, v0)
    var v1: s0 = v3
    var v4: s0 = v0
    var v2: s0 = v4
    let v6: s0 = f103(v2)
    let v12: [[Double]] = v4.p2
    v3.p2 = v12
    let v11: [[Double]] = v4.p0
    v1.p0 = v11
    let v21: [[Double]] = f107(v11)
    v1 = v6
    let v13: [Double] = v21[2]
    var v17: s0 = v2
    let v20: s0 = f103(v5)
    v17.p1 = v11
    let v16: [[Double]] = v1.p2
    v3.p1 = v11
    let v27: s0 = s0(p0: v21, p1: v21, p2: v12)
    var v26: [Double] = v13
    let v25: [[Double]] = v17.p1
    let v29: [[Double]] = v20.p0
    var v42: [[Double]] = v25
    let v33: [[Double]] = v27.p1
    let v23: [[Double]] = v5.p2
    let v56: [Double] = v42[2]
    v1.p2 = v23
    v42[1] = v26
    v4.p2 = v12
    v17.p1 = v33
    var v44: [[Double]] = v12
    var v67: [[Double]] = v29
    v3.p2 = v23
    var v74: [Double] = v13
    var v46: [Double] = v74
    let v35: [[[Double]]] = [v16]
    v4.p0 = v21
    let v144: [[Double]] = v35[0]
    v44[0] = v46
    let v66: [[Double]] = v35[0]
    v1.p2 = v66
    let v48: Double = v56[0]
    v4.p2 = v44
    var v92: [[Double]] = v67
    v1.p0 = v92
    v74[0] = v48
    let v152: s0 = s0(p0: v25, p1: v42, p2: v144)
    v2.p0 = v33
    return v152
  }
  func f55(_ v0: Double) -> Double {
    var v7: Double = v0
    let v1: [Double] = [v0, v7, v0, v7, v0, v7, v7]
    var v5: Double = v7
    let v6: [[Double]] = [v1, v1, v1, v1, v1]
    var v3: [Double] = v1
    v3 = v1
    v3[3] = v7
    var v11: [[Double]] = v6
    v11[1] = v1
    var v10: [[Double]] = v11
    v10[1] = v3
    var v21: [[Double]] = v10
    var v18: [Double] = v1
    v21[2] = v3
    var v40: [[Double]] = v6
    v10[4] = v18
    var v25: [[Double]] = v10
    let v57: [Double] = v40[2]
    v11[3] = v57
    v3[3] = v7
    let v39: [Double] = v25[0]
    v3[4] = v5
    v21[1] = v39
    let v116: [[[Double]]] = [v21]
    let v96: [[Double]] = v116[0]
    let v98: [Double] = v96[4]
    let v53: Double = v98[1]
    return v53
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v3: s1 = v0[0]
    let v2: s1 = v0[1]
    var v4: s1 = v3
    let v5: [s0] = v3.p0
    var v9: s1 = v2
    let v6: [s0] = v9.p1
    let v20: [s0] = v4.p0
    let v10: s1 = s1(p0: v6, p1: v5)
    let v14: [s0] = v2.p1
    let v27: Double = f55(v1)
    let v28: s1 = f110(v9)
    let v32: Double = f55(v27)
    var v21: [s0] = v20
    let v15: [s0] = v2.p0
    var v42: [s0] = v15
    var v26: [s0] = v21
    let v18: s0 = v20[0]
    let v19: s0 = v14[0]
    let v30: s0 = f85(v19, v18)
    v9.p1 = v6
    v21[1] = v30
    let v37: [s0] = v2.p1
    v9 = v28
    let v58: [[Double]] = v30.p0
    let v43: [Double] = v58[2]
    let v38: s0 = f66(v30)
    var v46: Double = v1
    var v85: [Double] = v43
    v9.p0 = v6
    let v69: s0 = v26[1]
    v4.p1 = v42
    v26[0] = v18
    let v56: Double = v32 - v46
    v4.p0 = v6
    let v57: [s0] = v10.p1
    let v115: Double = v85[0]
    v9.p0 = v37
    v85[0] = v56
    var v107: s1 = v3
    let v100: [s0] = v107.p0
    let v132: [s0] = v9.p0
    var v99: Double = v115
    v42[1] = v38
    v107.p1 = v132
    v42[0] = v69
    v85[0] = v56
    v107.p0 = v57
    v9.p0 = v100
    return v99
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]], p2: [[6.0]]), s0(p0: [[7.0], [8.0], [9.0]], p1: [[10.0], [11.0], [12.0]], p2: [[13.0]])], p1: [s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0], [18.0], [19.0]], p2: [[20.0]]), s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0], [25.0], [26.0]], p2: [[27.0]])]), s1(p0: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0], [32.0], [33.0]], p2: [[34.0]]), s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0], [40.0]], p2: [[41.0]])], p1: [s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]], p2: [[48.0]]), s0(p0: [[49.0], [50.0], [51.0]], p1: [[52.0], [53.0], [54.0]], p2: [[55.0]])])]
    let v1: Double = 56.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 56.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
