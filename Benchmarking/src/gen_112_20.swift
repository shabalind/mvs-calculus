  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: Double
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  struct s5 {
    var p0: s0
    var p1: s2
  }
  func f35(_ v0: s0, _ v1: s1) -> s0 {
    var v8: s1 = v1
    var v7: s0 = v0
    let v3: s0 = v1.p1
    v8.p1 = v7
    v8.p1 = v0
    let v2: [s1] = [v1, v8, v1, v8, v1, v1]
    let v5: [[s0]] = v8.p0
    let v4: [s0] = v5[1]
    let v6: [s0] = v5[1]
    let v20: [Double] = v7.p0
    let v14: [Double] = v3.p0
    var v10: [[s0]] = v5
    v8.p0 = v10
    let v26: s1 = s1(p0: v10, p1: v7)
    v7.p0 = v20
    v7.p0 = v14
    v10[1] = v4
    let v47: s0 = v26.p1
    v10[1] = v6
    var v85: s0 = v47
    let v48: s1 = v2[2]
    let v46: s0 = v48.p1
    var v70: s0 = v46
    v10[1] = v6
    v85 = v70
    return v85
  }
  func f30(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v2: [Double] = v0.p0
    let v6: [s0] = [v4, v0, v4, v4]
    let v7: [Double] = v0.p0
    let v1: s0 = v6[2]
    v4.p0 = v7
    v4.p0 = v2
    let v5: Double = v4.p1
    let v3: [Double] = v4.p0
    v4.p1 = v5
    var v11: [s0] = v6
    v11[2] = v1
    let v8: Double = v2[1]
    var v10: [s0] = v6
    var v9: s0 = v0
    let v12: Double = v0.p1
    let v16: s0 = v11[1]
    let v14: s0 = v11[2]
    let v23: [Double] = v14.p0
    var v20: [s0] = v6
    var v19: [s0] = v10
    v20[3] = v0
    let v18: Double = v23[1]
    v4.p1 = v12
    v19[1] = v16
    v4.p1 = v18
    let v24: Double = v14.p1
    let v30: [Double] = v1.p0
    var v27: [Double] = v7
    let v34: [Double] = v4.p0
    v20[1] = v0
    let v66: [[s0]] = [v19, v6, v19, v20]
    v4.p0 = v34
    let v38: [s0] = v66[3]
    v9.p1 = v5
    let v54: [s0] = v66[1]
    v9.p1 = v24
    var v39: s0 = v9
    v4.p0 = v27
    let v139: [s0] = v66[1]
    let v59: [Double] = v1.p0
    v4.p1 = v24
    v11[1] = v14
    v20[1] = v4
    v11[2] = v14
    let v52: s0 = v54[3]
    v4.p0 = v23
    v20[2] = v39
    v10 = v38
    v9.p0 = v7
    let v58: s0 = v139[1]
    v9.p1 = v8
    let v162: s0 = v54[0]
    v4.p0 = v30
    v20[3] = v1
    v39.p0 = v59
    var v293: s0 = v162
    let v220: Double = v58.p1
    v9.p0 = v3
    v39.p1 = v220
    v11[2] = v52
    v20[0] = v52
    return v293
  }
  func f26(_ v0: s2) -> s2 {
    var v1: s2 = v0
    let v4: s1 = v0.p1
    v1.p1 = v4
    v1.p1 = v4
    var v5: s2 = v1
    var v2: s2 = v0
    v5.p1 = v4
    let v3: [[s0]] = v4.p0
    var v9: s2 = v0
    v1.p1 = v4
    let v10: s1 = v2.p1
    var v12: s1 = v4
    let v11: [s0] = v3[0]
    v1.p1 = v10
    v5.p1 = v10
    let v22: s0 = v11[0]
    var v14: s2 = v5
    let v28: [s1] = v9.p0
    v1.p0 = v28
    let v34: [s2] = [v2, v14, v9, v0, v2, v5]
    v12.p1 = v22
    v5.p1 = v12
    let v18: s1 = v2.p1
    var v36: [s1] = v28
    var v40: s1 = v18
    v5.p1 = v40
    let v49: s2 = v34[4]
    let v39: [s1] = v2.p0
    let v33: [s1] = v49.p0
    var v69: [s2] = v34
    v5.p0 = v36
    v14.p0 = v39
    let v86: s2 = v69[5]
    var v50: [s1] = v33
    var v101: s2 = v86
    let v84: s1 = v28[0]
    let v52: [[s0]] = v10.p0
    v9.p0 = v36
    v5.p1 = v84
    v12.p0 = v52
    v14.p0 = v50
    v9.p0 = v36
    v14.p0 = v36
    return v101
  }
  func f16(_ v0: s1) -> s1 {
    let v2: [[s0]] = v0.p0
    let v8: [[s0]] = v0.p0
    var v3: [[s0]] = v2
    let v9: s0 = v0.p1
    let v7: s0 = f35(v9, v0)
    var v4: s1 = v0
    let v11: s0 = f30(v9)
    var v10: s0 = v9
    let v6: Double = v7.p1
    let v5: Double = v6 + v6
    let v1: s0 = v0.p1
    let v17: [Double] = v11.p0
    var v12: Double = v5
    let v21: [[s0]] = v0.p0
    let v35: Double = v6 * v12
    let v19: s0 = s0(p0: v17, p1: v35)
    v10.p1 = v35
    v10.p0 = v17
    v12 = v5
    let v37: [s0] = v2[1]
    let v15: [s0] = v8[0]
    v3[0] = v15
    let v48: [s0] = v21[1]
    let v29: [[s0]] = v4.p0
    let v24: Double = v17[1]
    let v31: [s0] = v3[1]
    let v60: Double = v17[0]
    let v52: s0 = f30(v9)
    let v54: s0 = v37[0]
    var v22: [s0] = v37
    v3 = v8
    var v45: Double = v60
    let v65: [Double] = v54.p0
    let v66: s0 = v22[0]
    let v46: [s0] = v3[1]
    v3[1] = v22
    let v121: s0 = f35(v1, v4)
    v4.p0 = v29
    var v71: [s0] = v48
    let v51: [[s0]] = [v46, v22, v31, v71, v31, v71]
    v4.p0 = v8
    let v74: s1 = s1(p0: v21, p1: v10)
    let v41: s0 = f35(v9, v74)
    let v59: [s0] = v51[3]
    v10.p0 = v65
    let v80: s0 = f30(v52)
    v4.p1 = v52
    let v73: [s1] = [v0]
    v4.p1 = v121
    v4.p1 = v19
    v10.p1 = v60
    let v118: [Double] = v19.p0
    var v95: s1 = v74
    v3[1] = v59
    v71[0] = v11
    let v120: s0 = f35(v41, v4)
    v71[0] = v120
    v10.p0 = v118
    v4.p0 = v2
    v22[0] = v66
    v45 = v60
    v95.p0 = v3
    v71[0] = v121
    var v215: [s1] = v73
    let v235: s1 = v215[0]
    var v150: s0 = v80
    v12 = v45
    v10.p1 = v24
    v95.p1 = v120
    v71[0] = v150
    v215[0] = v95
    return v235
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v7: s5 = v0[0]
    let v5: Double = v1 * v1
    let v6: s0 = v7.p0
    let v14: s0 = f30(v6)
    let v3: s2 = v7.p1
    var v9: s2 = v3
    let v11: [s1] = v3.p0
    var v10: s2 = v9
    v9 = v10
    let v25: s2 = f26(v3)
    let v59: s2 = f26(v10)
    v10.p0 = v11
    let v19: s1 = v59.p1
    let v23: Double = v14.p1
    v10.p0 = v11
    let v35: s0 = v19.p1
    let v62: s1 = v11[1]
    v10 = v59
    let v28: s1 = v11[2]
    let v31: [Double] = v35.p0
    v9.p1 = v62
    v9.p0 = v11
    let v43: s1 = f16(v62)
    var v33: [s1] = v11
    v33[2] = v43
    v33[1] = v19
    v33[2] = v28
    v10.p0 = v33
    var v64: [Double] = v31
    v64[1] = v5
    v10.p1 = v28
    v33[2] = v28
    v33[2] = v62
    let v116: s1 = v25.p1
    let v274: Double = v64[0]
    v64[1] = v23
    v33[1] = v116
    return v274
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s0(p0: [0.0, 1.0], p1: 2.0), p1: s2(p0: [s1(p0: [[s0(p0: [3.0, 4.0], p1: 5.0)], [s0(p0: [6.0, 7.0], p1: 8.0)]], p1: s0(p0: [9.0, 10.0], p1: 11.0)), s1(p0: [[s0(p0: [12.0, 13.0], p1: 14.0)], [s0(p0: [15.0, 16.0], p1: 17.0)]], p1: s0(p0: [18.0, 19.0], p1: 20.0)), s1(p0: [[s0(p0: [21.0, 22.0], p1: 23.0)], [s0(p0: [24.0, 25.0], p1: 26.0)]], p1: s0(p0: [27.0, 28.0], p1: 29.0))], p1: s1(p0: [[s0(p0: [30.0, 31.0], p1: 32.0)], [s0(p0: [33.0, 34.0], p1: 35.0)]], p1: s0(p0: [36.0, 37.0], p1: 38.0))))]
    let v1: Double = 39.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 39.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
