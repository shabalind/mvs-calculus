  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s1
  }
  struct s3 {
    var p0: s1
    var p1: s1
  }
  func f70(_ v0: s2, _ v1: s3) -> s2 {
    var v6: s2 = v0
    var v2: s3 = v1
    let v3: s1 = v6.p1
    var v4: s1 = v3
    v6.p1 = v4
    let v8: s1 = v2.p1
    var v13: s2 = v0
    v13.p1 = v8
    v6.p1 = v8
    v2.p0 = v3
    v13.p1 = v8
    let v44: s1 = v1.p0
    let v33: [[s0]] = v13.p0
    var v35: [[s0]] = v33
    v2.p1 = v44
    let v117: [s0] = v33[0]
    v6.p0 = v33
    v6.p0 = v35
    v35[1] = v117
    return v13
  }
  func f62(_ v0: [s1]) -> [s1] {
    var v1: [s1] = v0
    v1 = v0
    var v3: [s1] = v1
    var v2: [s1] = v1
    let v5: [[s1]] = [v1, v2, v3]
    let v7: s1 = v2[1]
    let v4: [s1] = v5[0]
    let v6: [s1] = v5[2]
    v3[0] = v7
    v1 = v2
    let v8: s0 = v7.p0
    var v10: s1 = v7
    v2[0] = v7
    let v13: s1 = v2[1]
    let v14: [[Double]] = v7.p1
    v2[1] = v7
    let v11: s0 = v7.p0
    var v15: s0 = v11
    v1[1] = v10
    let v45: s1 = v6[1]
    v10.p0 = v8
    let v12: [[Double]] = v13.p1
    let v27: [[Double]] = v8.p1
    v10.p1 = v12
    let v43: [[Double]] = v11.p1
    var v63: s0 = v15
    v10.p0 = v15
    v15.p1 = v43
    v15.p1 = v43
    let v26: s1 = v0[1]
    v15.p1 = v27
    v2[1] = v10
    v10.p1 = v14
    v3[1] = v26
    v10.p0 = v63
    v10.p0 = v63
    v1[0] = v7
    v2[0] = v45
    return v4
  }
  func f57(_ v0: s2) -> s2 {
    let v5: [[s0]] = v0.p0
    var v4: [[s0]] = v5
    let v1: [s0] = v5[1]
    let v6: s1 = v0.p1
    let v8: [[s0]] = v0.p0
    let v9: s1 = v0.p1
    let v19: s0 = v9.p0
    let v13: [[Double]] = v19.p0
    var v15: s1 = v9
    v4[1] = v1
    let v12: [[Double]] = v19.p1
    var v20: s0 = v19
    let v47: [[Double]] = v15.p1
    var v28: [[Double]] = v12
    v20.p1 = v12
    v20.p1 = v12
    v20.p1 = v28
    v20.p0 = v13
    var v67: s2 = v0
    var v36: s2 = v67
    let v25: [[Double]] = v6.p1
    v20.p0 = v13
    var v71: s1 = v9
    v71 = v15
    v20.p1 = v12
    v4 = v5
    let v54: [Double] = v47[0]
    v28[0] = v54
    let v33: [s0] = v5[0]
    v15.p1 = v47
    let v32: [[Double]] = v15.p1
    let v44: [s0] = v8[0]
    v36 = v0
    let v52: s3 = s3(p0: v71, p1: v71)
    let v73: s1 = v67.p1
    v36.p0 = v4
    let v85: [Double] = v47[1]
    var v58: s3 = v52
    let v74: s2 = f70(v36, v52)
    let v53: s2 = f70(v74, v58)
    let v43: s0 = v44[0]
    var v91: s3 = v58
    v15.p0 = v43
    var v98: s3 = v52
    v4[1] = v1
    v91.p1 = v9
    v4[1] = v33
    v36.p1 = v9
    let v170: s2 = f70(v67, v52)
    var v141: [[Double]] = v25
    let v59: s2 = f70(v53, v91)
    let v110: s1 = v91.p1
    v67.p1 = v6
    v98.p1 = v9
    v71.p1 = v32
    v28[0] = v85
    v98.p1 = v110
    var v163: s3 = v98
    let v181: s2 = f70(v170, v163)
    v67 = v181
    v36.p1 = v73
    v15.p0 = v20
    v71.p1 = v141
    let v145: s2 = f70(v59, v91)
    v4[1] = v33
    return v145
  }
  func f49(_ v0: s0) -> s0 {
    return v0
  }
  func f45(_ v0: s1) -> s1 {
    var v6: s1 = v0
    let v5: [s1] = [v6, v6, v6, v0, v0]
    let v3: s0 = v0.p0
    let v1: s0 = f49(v3)
    v6.p0 = v1
    v6 = v0
    let v30: s0 = f49(v1)
    let v48: [[Double]] = v6.p1
    let v98: s0 = f49(v3)
    v6.p1 = v48
    let v93: s0 = f49(v98)
    v6.p0 = v30
    v6.p0 = v93
    let v119: s1 = v5[2]
    return v119
  }
  func f37(_ v0: s2) -> s2 {
    var v5: s2 = v0
    let v3: s1 = v0.p1
    var v6: s2 = v5
    v5 = v0
    var v8: s1 = v3
    let v9: [[s0]] = v5.p0
    var v4: s2 = v5
    var v14: s1 = v3
    let v7: [s1] = [v8, v3]
    var v2: s1 = v8
    var v10: [s1] = v7
    let v12: [s1] = f62(v10)
    v10[1] = v3
    let v1: [s0] = v9[1]
    let v15: s0 = v14.p0
    let v20: s2 = s2(p0: v9, p1: v3)
    v6.p1 = v2
    let v11: s1 = v7[0]
    let v19: s0 = v1[0]
    let v26: s1 = v6.p1
    v10[1] = v8
    v10[0] = v26
    let v16: [s1] = f62(v12)
    v10[1] = v2
    let v42: s1 = v12[1]
    let v17: s1 = v12[1]
    let v25: s1 = f45(v42)
    v10[0] = v11
    v6 = v5
    let v28: s3 = s3(p0: v42, p1: v17)
    v6.p0 = v9
    v4.p1 = v25
    v10[1] = v11
    v4 = v20
    var v46: s3 = v28
    v2.p0 = v19
    v10[1] = v17
    let v37: [s0] = v9[1]
    v14.p0 = v19
    let v40: s2 = f70(v4, v46)
    let v57: s0 = v37[0]
    let v51: [s3] = [v28, v46, v46, v46, v46]
    let v58: [[s0]] = v40.p0
    v14.p0 = v57
    let v43: [[Double]] = v19.p1
    let v29: [[Double]] = v15.p0
    let v71: [[s0]] = v6.p0
    let v79: s2 = f70(v40, v28)
    let v99: s1 = v16[0]
    let v73: [[Double]] = v3.p1
    var v54: [[s0]] = v71
    let v53: s0 = s0(p0: v29, p1: v43)
    let v68: s3 = v51[3]
    v2.p0 = v53
    v8.p1 = v73
    v6.p0 = v71
    v4.p0 = v71
    let v212: s1 = v68.p1
    v6.p0 = v54
    v4.p0 = v54
    v4.p1 = v212
    v4.p0 = v58
    v5.p1 = v99
    return v79
  }
  func f32(_ v0: [s0]) -> [s0] {
    let v7: s0 = v0[0]
    var v8: [s0] = v0
    let v11: s0 = f49(v7)
    v8 = v0
    var v105: [s0] = v8
    let v237: s0 = f49(v11)
    v8[0] = v237
    var v138: [s0] = v105
    var v252: [s0] = v138
    return v252
  }
  func f20(_ v0: s2) -> s2 {
    let v2: [[s0]] = v0.p0
    let v4: s2 = f57(v0)
    var v7: [[s0]] = v2
    var v6: s2 = v0
    v6.p0 = v7
    let v3: s1 = v4.p1
    let v1: s2 = f57(v6)
    let v5: s1 = f45(v3)
    let v11: s1 = f45(v3)
    let v10: [s0] = v2[0]
    let v17: s1 = v1.p1
    let v20: s3 = s3(p0: v3, p1: v11)
    v6.p1 = v5
    let v39: [s0] = v2[0]
    v7[0] = v10
    let v28: s2 = f37(v0)
    var v33: [[s0]] = v2
    let v34: [s0] = v7[0]
    let v37: [s0] = v2[1]
    v33[1] = v34
    v7[1] = v34
    var v61: [[s0]] = v2
    let v32: s1 = v28.p1
    var v41: [[s0]] = v7
    v6.p0 = v61
    var v102: [[s0]] = v61
    let v86: s3 = s3(p0: v32, p1: v17)
    v61[0] = v37
    v6.p0 = v102
    v41[1] = v37
    var v99: [[s0]] = v33
    v6.p1 = v11
    v99[1] = v10
    v41[0] = v39
    let v85: s1 = v20.p0
    let v94: s2 = s2(p0: v41, p1: v85)
    v6.p0 = v99
    let v195: s2 = f70(v94, v86)
    return v195
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v2: s2 = f57(v0)
    let v5: s1 = v2.p1
    let v8: s2 = f20(v2)
    let v9: s0 = v5.p0
    let v4: [[s0]] = v8.p0
    var v11: s0 = v9
    let v13: [[Double]] = v11.p1
    let v16: [Double] = v13[0]
    let v23: [[Double]] = v11.p0
    let v21: s0 = f49(v11)
    let v35: [Double] = v23[0]
    let v17: Double = v35[0]
    v11.p0 = v23
    let v34: [s0] = v4[0]
    let v27: [[Double]] = v5.p1
    var v41: [[Double]] = v23
    var v43: [[Double]] = v27
    let v72: [s0] = f32(v34)
    let v53: s0 = v72[0]
    let v67: Double = v17 * v1
    v43[0] = v16
    let v81: [[Double]] = v21.p0
    let v50: [[Double]] = v53.p0
    v43[0] = v35
    v11.p1 = v13
    let v78: [[[Double]]] = [v81, v23, v50, v41, v50, v41, v41]
    let v111: [Double] = v43[1]
    let v150: [[Double]] = v78[1]
    let v58: [Double] = v150[1]
    var v55: [[Double]] = v150
    v55[0] = v111
    v11.p0 = v81
    var v125: [[Double]] = v55
    v11.p0 = v125
    v41[0] = v58
    let v193: Double = v67 + v67
    let v203: Double = v67 - v193
    var v96: Double = v203
    return v96
  }
  func benchmark() {
    let v0: s2 = s2(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])]], p1: s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: [[9.0], [10.0], [11.0]]))
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
