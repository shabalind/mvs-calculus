  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: s3
  }
  func f102(_ v0: [s0]) -> [s0] {
    let v7: s0 = v0[2]
    let v5: s0 = v0[1]
    var v1: [s0] = v0
    let v8: s3 = s3(p0: v0, p1: v7)
    var v2: [s0] = v1
    let v9: [[Double]] = v5.p0
    let v10: s0 = v8.p1
    let v16: [Double] = v10.p1
    let v12: s0 = s0(p0: v9, p1: v16)
    v2[0] = v12
    let v32: [[s0]] = [v2, v1, v1, v0, v0]
    var v34: [[s0]] = v32
    v34[0] = v1
    v34[4] = v1
    let v150: [s0] = v34[4]
    return v150
  }
  func f91(_ v0: s4) -> s4 {
    let v6: s3 = v0.p1
    let v3: s0 = v6.p1
    let v4: [s0] = [v3, v3, v3]
    let v9: s0 = v4[2]
    let v2: [s0] = f102(v4)
    var v1: s0 = v3
    let v7: s0 = v4[0]
    let v8: s0 = v2[1]
    let v10: s0 = v4[1]
    let v18: [[Double]] = v10.p0
    var v42: s0 = v8
    v42.p0 = v18
    let v41: s1 = s1(p0: v1, p1: v7)
    let v112: s4 = s4(p0: v41, p1: v6)
    let v48: [Double] = v9.p1
    let v69: [Double] = v3.p1
    let v75: [s0] = f102(v4)
    let v113: [s0] = f102(v75)
    v1.p1 = v69
    var v121: [Double] = v48
    v1.p1 = v121
    let v184: [Double] = v42.p1
    var v124: s4 = v112
    v1.p1 = v184
    v124 = v0
    var v156: s4 = v124
    let v155: s0 = v113[1]
    v1 = v155
    return v156
  }
  func f70(_ v0: s1, _ v1: s1) -> s1 {
    var v3: s1 = v1
    var v2: s1 = v3
    let v4: s0 = v1.p0
    let v9: s0 = v1.p1
    let v7: [[Double]] = v9.p0
    let v13: s0 = v0.p1
    v2 = v3
    let v8: [s1] = [v0, v2, v3, v0]
    v2 = v0
    var v24: s0 = v4
    var v46: s0 = v13
    v46.p0 = v7
    let v59: s1 = v8[1]
    v3.p1 = v24
    v24 = v46
    return v59
  }
  func f48(_ v0: s1) -> s1 {
    var v1: s1 = v0
    let v5: s0 = v0.p1
    let v2: s0 = v0.p1
    let v4: s1 = f70(v1, v1)
    let v8: s1 = f70(v4, v0)
    var v7: s0 = v5
    let v6: s0 = v0.p0
    var v3: s1 = v0
    let v9: s1 = f70(v0, v8)
    let v11: s1 = f70(v1, v0)
    v3.p0 = v7
    v3.p0 = v2
    v1.p0 = v6
    v1.p0 = v5
    v1.p0 = v6
    let v15: s1 = f70(v1, v4)
    var v10: s0 = v2
    v3.p0 = v2
    var v13: s0 = v5
    v3.p0 = v13
    let v18: s0 = v9.p0
    let v50: s0 = v3.p1
    let v17: s1 = f70(v11, v11)
    var v51: s1 = v17
    let v48: s1 = f70(v51, v4)
    let v58: [[Double]] = v50.p0
    var v45: [[Double]] = v58
    let v46: [[Double]] = v6.p0
    let v37: [[[Double]]] = [v58, v46, v45, v46, v46]
    v7 = v18
    let v40: [Double] = v18.p1
    let v32: [Double] = v6.p1
    var v75: [[[Double]]] = v37
    v3.p1 = v2
    let v42: s0 = v11.p1
    v10.p1 = v40
    v51.p0 = v7
    let v73: s1 = f70(v1, v17)
    let v63: s1 = s1(p0: v5, p1: v18)
    let v66: [Double] = v2.p1
    v75[3] = v58
    let v161: s1 = f70(v17, v15)
    v10.p1 = v66
    let v61: s1 = f70(v48, v63)
    var v112: s0 = v42
    var v55: s0 = v13
    let v197: [[Double]] = v37[4]
    v1.p1 = v50
    let v177: s1 = s1(p0: v112, p1: v42)
    let v119: [[Double]] = v75[3]
    var v78: s1 = v17
    var v142: s0 = v18
    v112.p0 = v119
    let v111: s1 = f70(v161, v177)
    let v144: s0 = v61.p1
    v1.p0 = v10
    let v350: s0 = v73.p0
    let v113: [Double] = v144.p1
    v1.p1 = v144
    let v123: [[Double]] = v142.p0
    v55.p1 = v113
    v55.p0 = v123
    v51.p0 = v350
    let v82: s0 = v1.p0
    v75[3] = v197
    v7.p0 = v197
    var v201: s1 = v63
    let v221: s1 = f70(v111, v177)
    let v390: s1 = f70(v221, v48)
    v3.p0 = v82
    v51.p0 = v55
    let v302: s1 = f70(v201, v390)
    let v137: s1 = f70(v302, v78)
    v112.p1 = v32
    return v137
  }
  func f45(_ v0: s1) -> s1 {
    let v1: s0 = v0.p1
    let v2: [Double] = v1.p1
    let v5: [Double] = v1.p1
    let v3: Double = v5[0]
    let v9: [Double] = v1.p1
    let v8: [[Double]] = [v2, v5, v2, v9, v9, v2, v2]
    var v4: [Double] = v2
    var v7: s0 = v1
    let v10: s1 = f70(v0, v0)
    var v15: Double = v3
    let v11: s1 = f70(v0, v10)
    v7.p1 = v4
    let v16: [[Double]] = v1.p0
    let v24: s1 = f70(v11, v0)
    let v32: [Double] = v8[1]
    let v29: s1 = f48(v24)
    let v27: [s0] = [v7, v7]
    v4[0] = v15
    v7.p1 = v9
    v7.p0 = v16
    v7.p0 = v16
    v4[0] = v3
    v7.p0 = v16
    let v34: s0 = v29.p0
    let v33: Double = v2[2]
    let v73: [[Double]] = v34.p0
    v15 = v33
    let v87: s1 = f48(v10)
    v7.p1 = v32
    var v59: [s0] = v27
    v4[2] = v33
    v7.p1 = v32
    v7.p0 = v73
    let v97: s0 = v59[1]
    var v161: s1 = v10
    v161.p0 = v97
    let v166: s1 = f70(v87, v161)
    return v166
  }
  func f34(_ v0: Double) -> Double {
    var v6: Double = v0
    var v1: Double = v6
    let v2: Double = v1 * v6
    var v3: Double = v1
    var v7: Double = v2
    var v8: Double = v3
    v1 = v7
    var v15: Double = v8
    let v13: Double = v8 + v15
    var v14: Double = v2
    var v17: Double = v2
    var v35: Double = v3
    v35 = v17
    v1 = v13
    let v36: [Double] = [v3, v35, v0, v0, v14]
    let v23: Double = v36[2]
    var v53: [Double] = v36
    var v43: [Double] = v53
    var v58: [Double] = v43
    v58[4] = v23
    var v47: [Double] = v58
    let v62: Double = v47[4]
    v43[3] = v62
    let v71: Double = v47[2]
    return v71
  }
  func f21(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v7: [[Double]] = v3.p0
    let v2: [Double] = v0.p1
    var v4: [Double] = v2
    v4 = v2
    let v9: [Double] = v0.p1
    let v13: Double = v4[2]
    v3.p1 = v9
    var v12: s0 = v0
    var v10: [[Double]] = v7
    let v26: Double = f34(v13)
    let v16: s0 = s0(p0: v7, p1: v9)
    v12.p1 = v4
    v4[0] = v26
    let v22: [[Double]] = v3.p0
    let v18: [s0] = [v16]
    var v21: [s0] = v18
    let v79: [[Double]] = v16.p0
    var v30: [s0] = v18
    let v32: Double = v9[0]
    let v44: [Double] = v3.p1
    v12.p0 = v10
    let v17: s0 = v30[0]
    v3.p1 = v44
    v30 = v21
    v4[2] = v32
    v21[0] = v17
    var v70: [s0] = v30
    v70[0] = v16
    v70[0] = v16
    let v73: [Double] = v12.p1
    v70[0] = v3
    v3.p0 = v22
    v3.p0 = v79
    let v60: s0 = v70[0]
    v3.p1 = v73
    return v60
  }
  func f18(_ v0: s1) -> s1 {
    let v1: s1 = f48(v0)
    var v2: s1 = v0
    var v4: s1 = v1
    v4 = v2
    let v8: s0 = v4.p1
    var v7: s0 = v8
    var v3: s0 = v7
    v3 = v7
    let v6: s0 = v4.p1
    let v14: s1 = s1(p0: v3, p1: v8)
    var v20: s1 = v14
    let v11: s0 = v0.p1
    let v16: s1 = f45(v20)
    let v29: [s0] = [v11, v6, v7, v3, v6, v8]
    let v40: s0 = v29[0]
    v4.p1 = v8
    v2.p0 = v8
    let v27: s1 = f70(v16, v20)
    let v37: s0 = v29[4]
    v2.p0 = v3
    v2 = v27
    let v62: s1 = s1(p0: v37, p1: v40)
    return v62
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v4: s1 = v0.p0
    let v6: s4 = f91(v0)
    let v7: s1 = v6.p0
    let v3: s1 = f18(v4)
    var v5: Double = v1
    var v9: s1 = v3
    let v8: s0 = v9.p1
    var v10: s4 = v6
    let v19: s0 = v7.p1
    let v14: s0 = f21(v19)
    let v13: s0 = f21(v8)
    let v16: [Double] = v13.p1
    let v34: s3 = v10.p1
    let v23: [s0] = v34.p0
    let v47: Double = v16[0]
    let v28: Double = v16[2]
    let v32: Double = v16[2]
    var v37: [Double] = v16
    let v43: s3 = s3(p0: v23, p1: v13)
    v37[1] = v5
    v37[2] = v47
    v5 = v32
    var v30: [Double] = v37
    let v49: s1 = f45(v4)
    let v48: s0 = v43.p1
    v30[1] = v28
    v37[0] = v32
    let v59: s3 = v0.p1
    v10.p1 = v59
    v10.p0 = v49
    v30[1] = v32
    v9.p0 = v14
    v30[0] = v32
    v9.p0 = v48
    let v88: Double = v30[1]
    v37[0] = v32
    return v88
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [2.0, 3.0, 4.0]), p1: s0(p0: [[5.0], [6.0]], p1: [7.0, 8.0, 9.0])), p1: s3(p0: [s0(p0: [[10.0], [11.0]], p1: [12.0, 13.0, 14.0]), s0(p0: [[15.0], [16.0]], p1: [17.0, 18.0, 19.0]), s0(p0: [[20.0], [21.0]], p1: [22.0, 23.0, 24.0])], p1: s0(p0: [[25.0], [26.0]], p1: [27.0, 28.0, 29.0])))
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
