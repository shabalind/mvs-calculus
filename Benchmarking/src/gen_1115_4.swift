  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: [s1]
    var p2: s1
    var p3: s1
    var p4: s0
    var p5: [s0]
  }
  struct s4 {
    var p0: s2
    var p1: [s0]
  }
  func f103(_ v0: s0) -> s0 {
    return v0
  }
  func f97(_ v0: s2) -> s2 {
    var v2: s2 = v0
    let v4: [s1] = v0.p1
    v2.p1 = v4
    var v8: [s1] = v4
    var v3: s2 = v2
    let v7: [[s1]] = v2.p0
    var v9: [s1] = v4
    let v5: s1 = v3.p3
    v2.p0 = v7
    let v6: s1 = v8[0]
    v2.p1 = v9
    var v10: s2 = v3
    v9[0] = v6
    var v23: [[s1]] = v7
    v3.p0 = v23
    let v20: s1 = v8[0]
    var v11: [[s1]] = v23
    let v14: s0 = v5.p0
    var v25: [[s1]] = v11
    let v26: [s1] = v23[0]
    v11[0] = v9
    v3.p3 = v5
    let v28: s0 = v10.p4
    var v40: s0 = v14
    let v16: s1 = s1(p0: v14, p1: v40)
    v25[0] = v26
    v9[0] = v6
    let v32: [s1] = v25[0]
    let v27: [s0] = v3.p5
    v9[0] = v5
    let v44: s2 = s2(p0: v25, p1: v8, p2: v5, p3: v16, p4: v28, p5: v27)
    v9[0] = v20
    v23[0] = v4
    v23[0] = v32
    return v44
  }
  func f89(_ v0: [s1]) -> [s1] {
    var v5: [s1] = v0
    let v3: [[s1]] = [v5, v5, v5, v5, v0, v0, v5]
    var v8: [[s1]] = v3
    v8[0] = v5
    var v6: [[s1]] = v8
    let v21: [s1] = v6[5]
    return v21
  }
  func f81(_ v0: s2) -> s2 {
    let v2: s2 = f97(v0)
    let v3: s2 = f97(v0)
    let v10: s2 = f97(v0)
    let v17: s2 = f97(v0)
    let v21: [s2] = [v10, v10, v3, v2, v0, v2, v17]
    var v51: [s2] = v21
    let v53: s2 = v51[5]
    let v66: s2 = f97(v53)
    return v66
  }
  func f79(_ v0: s2, _ v1: s4) -> s2 {
    var v2: s2 = v0
    let v3: s1 = v0.p3
    let v4: [s2] = [v0, v2]
    var v5: [s2] = v4
    let v11: s0 = v3.p1
    var v7: [s2] = v4
    v2.p4 = v11
    v7[0] = v2
    let v8: s2 = v5[1]
    v7[0] = v0
    var v27: s1 = v3
    v2.p2 = v27
    let v118: s2 = v7[0]
    v7[0] = v8
    let v50: s2 = v4[1]
    v7[1] = v50
    return v118
  }
  func f77(_ v0: s1, _ v1: s2) -> s2 {
    let v18: s2 = f97(v1)
    let v20: s2 = f97(v1)
    let v26: [s0] = v20.p5
    var v47: s2 = v18
    v47.p5 = v26
    return v47
  }
  func f76(_ v0: s0) -> s0 {
    let v5: s0 = f103(v0)
    let v2: s0 = f103(v0)
    let v21: s0 = f103(v2)
    let v13: s0 = f103(v0)
    let v14: s0 = f103(v5)
    let v12: [[Double]] = v14.p0
    let v11: s0 = f103(v21)
    let v20: [[Double]] = v13.p0
    let v30: s1 = s1(p0: v2, p1: v2)
    let v41: s0 = v30.p0
    let v26: s0 = f103(v21)
    var v32: s0 = v41
    let v25: s0 = f103(v26)
    let v31: s0 = f103(v5)
    let v38: [s1] = [v30, v30, v30, v30, v30]
    let v19: s1 = v38[1]
    let v45: [[Double]] = v31.p1
    v32.p1 = v45
    var v61: [[Double]] = v45
    let v46: [[[Double]]] = [v61, v61, v61, v61, v45, v61, v45]
    v32 = v25
    let v48: s0 = v19.p0
    let v124: s0 = f103(v32)
    v32.p0 = v12
    v32.p1 = v45
    let v82: [[Double]] = v46[4]
    let v57: s0 = f103(v11)
    v32.p1 = v82
    var v100: s1 = v19
    v100.p0 = v57
    v100.p1 = v124
    v100.p0 = v48
    v32.p0 = v20
    let v151: s0 = v100.p1
    return v151
  }
  func f74(_ v0: s4) -> s4 {
    let v5: [s0] = v0.p1
    let v3: s0 = v5[0]
    let v8: s0 = f103(v3)
    let v13: [s0] = v0.p1
    var v23: [s0] = v13
    let v40: s0 = f76(v8)
    v23[1] = v40
    v23[1] = v8
    let v126: s2 = v0.p0
    let v101: s4 = s4(p0: v126, p1: v23)
    return v101
  }
  func f69(_ v0: [s0]) -> [s0] {
    let v4: s0 = v0[0]
    let v5: s0 = v0[0]
    var v7: s0 = v4
    var v6: [s0] = v0
    var v1: [s0] = v6
    var v2: s0 = v7
    let v3: s0 = f76(v4)
    let v10: [[s0]] = [v6, v6]
    v6[1] = v4
    var v14: [[s0]] = v10
    let v21: [[Double]] = v5.p0
    let v11: s0 = v1[0]
    v6[1] = v2
    v6[0] = v4
    v14[0] = v6
    v2.p0 = v21
    v7.p0 = v21
    let v16: [s0] = v14[0]
    let v20: s0 = v16[0]
    let v27: s1 = s1(p0: v3, p1: v20)
    v14[1] = v1
    v14[0] = v1
    let v28: [[s0]] = [v0, v1, v16, v6, v0, v6]
    let v26: s0 = v27.p0
    let v22: s0 = f103(v11)
    v6[1] = v22
    let v41: [[Double]] = v20.p1
    let v46: s0 = f103(v26)
    let v55: [[Double]] = v46.p1
    let v121: [s0] = v28[0]
    v2.p1 = v41
    v2.p1 = v55
    return v121
  }
  func f65(_ v0: s2, _ v1: s0) -> s2 {
    let v4: s2 = f97(v0)
    var v2: s2 = v0
    let v6: [[s1]] = v0.p0
    v2.p4 = v1
    var v13: [[s1]] = v6
    let v5: [s1] = v13[0]
    let v7: [[s1]] = v4.p0
    let v17: s1 = v5[0]
    v2.p1 = v5
    let v8: s1 = v5[0]
    let v11: s2 = f97(v2)
    let v10: s1 = v5[0]
    v2.p2 = v8
    v13 = v6
    let v9: [s1] = v6[0]
    let v15: s1 = v9[0]
    let v18: [[[s1]]] = [v6, v7, v13, v7]
    let v14: [s1] = f89(v5)
    var v35: [[[s1]]] = v18
    var v43: [[[s1]]] = v35
    let v26: [[s1]] = v43[1]
    v13[0] = v5
    let v82: s2 = f77(v17, v11)
    var v38: [[[s1]]] = v43
    v2.p0 = v26
    v2 = v4
    v35[0] = v26
    v35 = v38
    let v44: s2 = f77(v17, v82)
    v2.p1 = v14
    v43[3] = v13
    v35[2] = v13
    let v54: [s1] = [v15, v15, v8, v10]
    v35[0] = v7
    let v71: s1 = v54[1]
    let v97: s0 = v71.p0
    v2.p4 = v97
    let v157: s2 = f97(v44)
    return v157
  }
  func f57(_ v0: s4) -> s4 {
    var v6: s4 = v0
    let v1: s4 = f74(v0)
    let v11: [s0] = v0.p1
    let v5: s0 = v11[1]
    let v2: s2 = v1.p0
    var v10: [s0] = v11
    let v3: [s0] = f69(v10)
    var v4: s2 = v2
    let v8: s0 = v3[0]
    var v7: [s0] = v3
    v10 = v11
    let v16: s1 = s1(p0: v5, p1: v5)
    v4.p3 = v16
    var v13: [s0] = v10
    let v14: [s0] = v4.p5
    v6.p1 = v11
    v7[1] = v8
    v10[1] = v8
    v6 = v0
    v7 = v14
    var v35: s4 = v1
    let v24: s0 = v13[1]
    v35.p1 = v3
    v6 = v0
    var v22: [s0] = v3
    let v25: s2 = f79(v4, v35)
    let v26: s0 = v16.p0
    v6.p0 = v25
    v35.p0 = v25
    let v27: [s0] = f69(v11)
    v10[1] = v26
    v35.p1 = v3
    var v19: [s0] = v11
    v4.p5 = v19
    let v50: s0 = v27[1]
    let v45: s0 = v7[1]
    let v78: [s4] = [v6, v0, v1, v35, v1]
    let v42: s0 = v22[0]
    let v68: s1 = s1(p0: v45, p1: v24)
    v7[0] = v8
    v4.p3 = v68
    let v124: s4 = v78[3]
    v6.p1 = v11
    let v72: s2 = f65(v4, v42)
    v19[0] = v45
    v7[0] = v8
    var v167: s4 = v124
    let v129: s2 = v35.p0
    v6.p0 = v72
    v167.p0 = v129
    v4.p4 = v50
    return v167
  }
  func f45(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v2: s0 = v7
    let v1: s0 = f76(v2)
    var v4: s0 = v1
    let v9: [[Double]] = v4.p0
    let v3: [[Double]] = v0.p1
    v2.p0 = v9
    var v15: [[Double]] = v9
    v4.p1 = v3
    v2.p0 = v15
    let v13: s0 = s0(p0: v15, p1: v3)
    let v17: s0 = f76(v13)
    v4.p0 = v9
    v2.p1 = v3
    let v42: [Double] = v9[0]
    v15[0] = v42
    v4.p1 = v3
    let v20: [Double] = v9[0]
    let v33: [Double] = v9[0]
    v15[0] = v20
    let v73: s0 = f103(v17)
    v15[0] = v33
    v4.p0 = v15
    return v73
  }
  func f40(_ v0: s0, _ v1: s2) -> s2 {
    let v2: s0 = f45(v0)
    let v6: s0 = f103(v2)
    let v9: s2 = f65(v1, v6)
    let v8: [s0] = v9.p5
    let v12: [s0] = v9.p5
    let v3: s0 = v8[0]
    var v10: s2 = v1
    let v17: s0 = v8[1]
    let v19: [s1] = v9.p1
    let v15: s0 = v12[0]
    var v20: [s1] = v19
    let v13: [s0] = f69(v12)
    v10.p1 = v20
    var v29: s2 = v1
    v29 = v10
    let v47: s1 = v29.p3
    let v48: [s1] = f89(v19)
    let v123: s1 = v20[0]
    let v49: s2 = f65(v9, v17)
    var v83: [s1] = v48
    let v84: [s0] = f69(v13)
    v29 = v49
    v10.p2 = v47
    let v67: s2 = f97(v29)
    let v57: [s1] = v67.p1
    var v115: s2 = v49
    let v295: [[s1]] = v9.p0
    v29.p1 = v57
    v83[0] = v47
    var v134: s1 = v123
    v83[0] = v47
    let v151: s0 = v9.p4
    var v99: [[s1]] = v295
    v10.p1 = v83
    let v85: s1 = v115.p2
    var v64: s1 = v85
    let v178: s4 = s4(p0: v115, p1: v13)
    let v314: s2 = s2(p0: v99, p1: v57, p2: v64, p3: v134, p4: v151, p5: v84)
    v29.p1 = v48
    v29.p4 = v15
    let v131: s2 = f65(v29, v3)
    v64.p1 = v151
    v29.p1 = v83
    let v180: s1 = v314.p3
    let v210: s2 = f79(v131, v178)
    v10.p3 = v180
    return v210
  }
  func f22(_ v0: s2, _ v1: s0, _ v2: s2) -> s0 {
    let v7: [[Double]] = v1.p0
    var v9: s2 = v2
    v9.p4 = v1
    let v5: s0 = f103(v1)
    let v3: s2 = f40(v1, v0)
    v9.p4 = v5
    let v12: s0 = f76(v1)
    let v16: [s0] = v9.p5
    let v18: s2 = f65(v3, v12)
    let v34: s4 = s4(p0: v2, p1: v16)
    let v24: s1 = v18.p2
    let v27: s0 = v24.p1
    let v40: s2 = v34.p0
    var v38: s1 = v24
    let v21: s0 = v38.p0
    var v37: s1 = v24
    var v23: s0 = v27
    let v56: s4 = f57(v34)
    let v47: s2 = f65(v2, v21)
    v38.p1 = v5
    let v68: s2 = f79(v0, v56)
    let v35: s0 = v2.p4
    let v94: s2 = v34.p0
    let v107: [s2] = [v0, v40, v94, v68]
    v37.p0 = v23
    let v103: s2 = f40(v21, v47)
    let v81: s2 = v107[0]
    var v42: s0 = v35
    v37.p1 = v1
    v23.p0 = v7
    let v99: s1 = v103.p3
    let v89: [s0] = v81.p5
    var v146: s0 = v35
    let v98: s0 = v99.p0
    let v160: s0 = v89[1]
    v38.p0 = v42
    v9.p3 = v37
    v37.p0 = v146
    v37.p0 = v98
    let v221: s0 = f103(v160)
    v23.p0 = v7
    return v221
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v2: s4 = v0[0]
    let v5: [s0] = v2.p1
    var v11: [s4] = v0
    let v3: s0 = v5[1]
    v11[0] = v2
    let v9: s0 = f103(v3)
    let v12: s4 = v11[0]
    var v22: s0 = v9
    let v20: [s0] = f69(v5)
    let v51: [[Double]] = v22.p0
    let v65: s2 = v12.p0
    let v47: s2 = f81(v65)
    var v23: [[Double]] = v51
    let v37: s0 = f76(v9)
    var v40: s0 = v37
    let v26: s0 = v20[0]
    v22.p0 = v23
    let v64: s0 = f22(v65, v26, v47)
    v22 = v40
    let v252: [Double] = v23[0]
    let v52: [[Double]] = v64.p1
    v22.p0 = v23
    let v155: Double = v252[0]
    v40.p1 = v52
    return v155
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s2(p0: [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))]], p1: [s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))], p2: s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])), p3: s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])), p4: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p5: [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])]), p1: [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])])]
    let v1: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
