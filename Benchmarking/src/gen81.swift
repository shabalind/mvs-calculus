  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f87(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p0
    let v5: s1 = s1(p0: v0, p1: v0)
    var v2: s1 = v5
    let v7: s0 = v5.p0
    var v4: s0 = v0
    v4 = v7
    var v10: s0 = v4
    var v8: s0 = v7
    let v13: s1 = s1(p0: v8, p1: v10)
    var v11: s1 = v13
    var v9: s0 = v0
    let v17: [[Double]] = v9.p0
    var v14: s1 = v2
    var v12: s0 = v0
    let v15: [[Double]] = v7.p0
    let v29: s0 = v5.p0
    let v26: s0 = v11.p0
    let v16: [[Double]] = v8.p0
    v2.p0 = v7
    let v18: [[Double]] = v0.p0
    let v24: [[[Double]]] = [v15, v18, v16, v1, v15, v17, v18]
    v11.p1 = v8
    let v36: [[Double]] = v9.p1
    v10.p1 = v36
    v2.p1 = v29
    let v41: [[Double]] = v24[6]
    v2.p1 = v10
    let v39: [[Double]] = v4.p0
    v2.p1 = v7
    v10.p0 = v39
    let v74: [s0] = [v26, v12, v0, v10, v0]
    v11 = v14
    var v67: [s0] = v74
    let v107: s0 = v67[0]
    v14.p0 = v4
    v4.p0 = v41
    return v107
  }
  func f86(_ v0: s1) -> s1 {
    let v4: s0 = v0.p0
    var v2: s0 = v4
    let v7: s0 = v0.p0
    let v6: s0 = f87(v7)
    var v12: s1 = v0
    let v11: s0 = f87(v2)
    let v10: [[Double]] = v7.p1
    let v1: s0 = f87(v6)
    let v8: s1 = s1(p0: v1, p1: v4)
    v2.p1 = v10
    var v22: s1 = v8
    let v19: s0 = f87(v11)
    let v33: s0 = f87(v7)
    var v47: s1 = v12
    let v51: s0 = v22.p1
    v47.p1 = v2
    var v60: s0 = v51
    v22.p1 = v33
    v47.p1 = v19
    v47.p0 = v60
    return v47
  }
  func f85(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v4: s0 = f87(v1)
    v1 = v0
    let v6: s0 = f87(v4)
    v1 = v6
    let v5: s0 = f87(v4)
    let v11: [[Double]] = v1.p1
    let v7: s0 = f87(v1)
    let v17: [[Double]] = v5.p1
    let v14: [[Double]] = v5.p0
    v1.p1 = v11
    v1.p0 = v14
    v1.p1 = v17
    let v13: s0 = f87(v7)
    let v43: s0 = f87(v4)
    let v66: s0 = f87(v0)
    let v35: s1 = s1(p0: v0, p1: v66)
    let v70: s0 = v35.p1
    var v38: s1 = v35
    v38.p1 = v70
    let v100: [s1] = [v38, v35]
    v38.p1 = v13
    var v58: [s1] = v100
    let v91: s1 = v58[0]
    v38.p1 = v43
    let v229: s0 = v91.p1
    v58[1] = v38
    return v229
  }
  func f81(_ v0: s0) -> s0 {
    let v5: s0 = f87(v0)
    let v6: [[Double]] = v5.p0
    let v7: [Double] = v6[1]
    var v1: s0 = v5
    let v10: [[Double]] = v1.p1
    var v16: [[Double]] = v6
    var v14: s0 = v1
    let v23: [[Double]] = v0.p1
    v16[1] = v7
    let v79: [Double] = v23[1]
    v14.p1 = v10
    let v37: s0 = f85(v14)
    v1.p0 = v16
    v16[0] = v79
    v16[1] = v79
    v16[1] = v7
    var v56: [[Double]] = v6
    v14.p0 = v56
    return v37
  }
  func f78(_ v0: s0) -> s0 {
    let v3: s0 = f87(v0)
    var v2: s0 = v0
    let v1: [[Double]] = v2.p0
    let v5: s0 = f81(v0)
    let v7: [[Double]] = v2.p1
    let v13: [[Double]] = v3.p0
    let v8: [Double] = v13[2]
    let v6: [Double] = v13[0]
    let v4: [[Double]] = [v8, v8, v8, v8, v8, v6, v8]
    let v11: s0 = f85(v2)
    v2.p1 = v7
    v2.p0 = v1
    var v23: s0 = v11
    let v9: [[Double]] = v0.p1
    v2.p0 = v13
    v23.p0 = v13
    let v19: [[Double]] = v23.p1
    v23.p0 = v13
    let v22: [[Double]] = v3.p0
    v2 = v3
    let v40: s0 = f85(v0)
    let v21: s0 = f81(v40)
    var v27: [[Double]] = v13
    v2.p0 = v1
    let v28: [[Double]] = v23.p1
    let v46: [[Double]] = v23.p0
    let v25: [[Double]] = v2.p1
    let v49: [[Double]] = v3.p0
    let v43: [[Double]] = v21.p1
    v2.p0 = v27
    let v36: s0 = f87(v11)
    let v31: s0 = f81(v5)
    let v55: s0 = f81(v36)
    let v34: [Double] = v27[2]
    let v76: s0 = f85(v3)
    v2.p1 = v19
    v27[2] = v34
    v2 = v76
    let v58: [[Double]] = v55.p1
    let v53: s0 = f81(v5)
    let v95: [[[Double]]] = [v25, v9, v58]
    let v84: [Double] = v4[4]
    let v37: [[Double]] = v95[2]
    let v80: [[Double]] = v53.p0
    v2.p1 = v43
    let v41: [[Double]] = v95[0]
    let v180: s0 = f87(v53)
    let v142: [[Double]] = v31.p0
    v23.p0 = v46
    v23.p1 = v7
    v2.p0 = v1
    let v93: [[Double]] = v5.p1
    let v94: [Double] = v4[0]
    v2.p1 = v93
    v27[1] = v84
    v2.p0 = v1
    v2.p0 = v49
    v2.p0 = v46
    let v202: s0 = s0(p0: v46, p1: v41)
    v23.p1 = v28
    v23.p1 = v7
    var v247: [[Double]] = v37
    v27[0] = v94
    v23.p1 = v247
    let v136: [[Double]] = v95[2]
    let v353: [[Double]] = v180.p1
    v23.p1 = v353
    v2.p0 = v80
    v2.p0 = v46
    v23.p0 = v22
    v23.p1 = v136
    v2.p0 = v142
    return v202
  }
  func f71(_ v0: s0, _ v1: s0) -> s0 {
    let v7: s0 = f78(v1)
    let v2: [[Double]] = v1.p0
    let v4: [[Double]] = v1.p0
    let v13: [Double] = v4[0]
    var v11: [[Double]] = v4
    v11[1] = v13
    let v10: s0 = f81(v7)
    let v6: [[Double]] = v1.p0
    let v9: s0 = f87(v1)
    var v23: s0 = v9
    let v15: [[Double]] = v7.p1
    v23.p1 = v15
    let v25: s0 = f87(v9)
    let v17: [[Double]] = v10.p1
    let v27: s1 = s1(p0: v23, p1: v1)
    let v18: s0 = f81(v23)
    v23.p1 = v17
    let v37: [[Double]] = v10.p1
    v23.p0 = v11
    v23.p1 = v15
    v23.p1 = v37
    let v81: s1 = f86(v27)
    let v83: s1 = f86(v27)
    let v111: s1 = f86(v83)
    v23.p1 = v17
    let v72: s0 = f85(v18)
    let v75: s0 = v81.p0
    let v127: s0 = v111.p1
    v23.p0 = v6
    let v45: s0 = v111.p1
    v23.p0 = v2
    let v82: [s0] = [v25, v72, v45, v75, v9, v127]
    var v97: [s0] = v82
    let v110: s0 = v97[1]
    return v110
  }
  func f4(_ v0: [s0]) -> [s0] {
    let v1: s0 = v0[0]
    var v4: [s0] = v0
    let v6: [[s0]] = [v0, v4, v4, v0]
    v4[0] = v1
    v4[0] = v1
    v4[0] = v1
    let v44: [s0] = v6[2]
    var v98: [[s0]] = v6
    let v104: [s0] = v98[0]
    v98[0] = v44
    return v104
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v7: [s0] = v0[0]
    var v3: [[s0]] = v0
    let v10: [s0] = f4(v7)
    let v13: s0 = v10[0]
    v3[0] = v10
    let v15: [s0] = v3[0]
    let v12: s0 = v15[0]
    let v23: s0 = f71(v13, v12)
    let v25: [[Double]] = v23.p0
    var v27: [[Double]] = v25
    let v45: [Double] = v27[0]
    var v127: [Double] = v45
    let v94: Double = v127[0]
    return v94
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])]]
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
