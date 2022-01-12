  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: s2
    var p1: [[s0]]
  }
  struct s4 {
    var p0: [s3]
    var p1: s1
  }
  func f106(_ v0: s0) -> s0 {
    var v6: s0 = v0
    var v1: s0 = v0
    var v3: s0 = v1
    let v8: [[Double]] = v6.p1
    let v12: [[Double]] = v1.p0
    v3.p0 = v12
    v1.p1 = v8
    let v39: [[Double]] = v3.p1
    var v32: s0 = v3
    v3.p1 = v39
    return v32
  }
  func f105(_ v0: s2) -> s2 {
    let v1: s1 = v0.p1
    let v8: s0 = v1.p1
    let v4: [s0] = v1.p0
    var v5: s1 = v1
    let v7: [s0] = v5.p0
    v5.p1 = v8
    var v18: s2 = v0
    v5 = v1
    v18 = v0
    let v13: [s0] = v1.p0
    let v14: s0 = v7[0]
    v5.p1 = v14
    let v24: [s0] = v1.p0
    let v16: s1 = v0.p0
    v5.p0 = v4
    let v22: s1 = v18.p0
    v18.p1 = v16
    var v44: s1 = v5
    v5.p0 = v13
    var v32: s1 = v1
    v32.p0 = v4
    var v40: s2 = v0
    v40.p1 = v44
    var v30: s2 = v40
    var v29: s1 = v22
    var v59: s1 = v29
    let v57: s2 = s2(p0: v44, p1: v44)
    let v58: [s0] = v32.p0
    let v64: s1 = v18.p1
    v18.p1 = v1
    let v63: s1 = v57.p1
    var v94: s2 = v18
    let v73: s1 = v30.p0
    var v100: s2 = v30
    v59.p0 = v24
    v18.p0 = v64
    v94.p1 = v1
    var v143: s2 = v57
    v143.p0 = v59
    let v138: [s2] = [v30, v100, v0, v143, v40, v94, v143]
    v29.p0 = v58
    v143.p0 = v63
    v100.p1 = v73
    let v152: s2 = v138[1]
    return v152
  }
  func f86(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v1: s0 = v0
    var v2: s0 = v1
    let v4: [[Double]] = v1.p0
    v1.p0 = v4
    v2.p0 = v4
    let v8: [[Double]] = v1.p0
    v2.p0 = v4
    let v13: [[Double]] = v1.p1
    let v6: s0 = f106(v0)
    let v12: s0 = f106(v7)
    v7.p1 = v13
    v1.p0 = v4
    v2 = v12
    var v15: [[Double]] = v4
    var v26: [[Double]] = v4
    let v41: s0 = f106(v0)
    var v46: [[Double]] = v15
    v7.p1 = v13
    let v62: [[Double]] = v6.p0
    let v23: s0 = f106(v41)
    v46 = v8
    let v35: s0 = f106(v2)
    let v25: s0 = f106(v2)
    let v54: s0 = f106(v35)
    let v100: s0 = f106(v23)
    v2.p0 = v46
    let v36: [s0] = [v2, v23, v54, v25, v100]
    v1.p1 = v13
    let v34: [[Double]] = v7.p1
    var v85: [s0] = v36
    v7.p0 = v62
    v2.p1 = v34
    v1.p0 = v8
    var v135: [s0] = v85
    let v88: [[Double]] = v0.p0
    var v149: [[Double]] = v88
    var v53: [[Double]] = v26
    v7.p0 = v149
    v1.p0 = v53
    let v268: s0 = v135[2]
    let v167: s0 = f106(v268)
    return v167
  }
  func f72(_ v0: s1) -> s1 {
    let v6: [s0] = v0.p0
    let v2: s0 = v6[0]
    var v5: s0 = v2
    let v8: s0 = v6[0]
    var v3: s1 = v0
    let v10: s0 = v3.p1
    v3.p1 = v5
    let v11: s0 = f86(v10)
    v3.p1 = v2
    let v9: [[Double]] = v11.p1
    v5.p1 = v9
    v3 = v0
    let v16: s0 = f106(v8)
    let v12: s0 = f106(v16)
    let v81: [[Double]] = v16.p0
    v5 = v12
    v5.p0 = v81
    return v3
  }
  func f67(_ v0: s0) -> s0 {
    let v15: s0 = f86(v0)
    let v34: [[Double]] = v15.p0
    let v22: s0 = f86(v0)
    var v30: s0 = v22
    v30.p0 = v34
    return v30
  }
  func f61(_ v0: s1) -> s1 {
    var v1: s1 = v0
    var v2: s1 = v1
    let v7: s0 = v1.p1
    v1 = v2
    let v4: s0 = f67(v7)
    let v9: s2 = s2(p0: v1, p1: v1)
    let v21: s1 = v9.p1
    var v14: s1 = v0
    let v15: s2 = s2(p0: v14, p1: v0)
    v1.p1 = v4
    let v28: s1 = f72(v1)
    let v22: s0 = v28.p1
    let v20: s1 = v15.p0
    let v42: [s0] = v0.p0
    var v52: [s0] = v42
    v52[0] = v22
    v1.p0 = v52
    var v32: s2 = v15
    v32 = v9
    let v39: s0 = v52[0]
    v2.p1 = v39
    let v46: s2 = f105(v32)
    v32.p0 = v21
    let v47: s0 = f67(v4)
    v32.p1 = v28
    var v54: [s0] = v52
    let v110: s1 = f72(v20)
    let v176: s2 = f105(v46)
    let v113: s0 = f86(v7)
    v54[0] = v113
    var v58: s0 = v47
    v54[0] = v4
    let v77: s0 = v54[0]
    let v68: s0 = f67(v77)
    v32.p1 = v14
    v54[0] = v58
    v32.p1 = v110
    let v169: s0 = f106(v22)
    v52[0] = v68
    let v150: s2 = f105(v176)
    let v163: s1 = v150.p0
    v1.p1 = v169
    return v163
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [[s4]], _ v2: Double) -> Double {
    let v4: s1 = f72(v0)
    var v7: Double = v2
    let v3: s1 = f61(v4)
    let v8: s0 = v3.p1
    let v20: s0 = f106(v8)
    let v25: [[Double]] = v20.p0
    let v36: [Double] = v25[2]
    let v68: Double = v2 / v7
    let v76: Double = v36[0]
    let v117: Double = v76 - v68
    return v117
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))
    let v1: [[s4]] = [[s4(p0: [s3(p0: s2(p0: s1(p0: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])), p1: s1(p0: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])], p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]))), p1: [[s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])]]), s3(p0: s2(p0: s1(p0: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])], p1: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])), p1: s1(p0: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])], p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]))), p1: [[s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])]])], p1: s1(p0: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])], p1: s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])))], [s4(p0: [s3(p0: s2(p0: s1(p0: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])], p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])), p1: s1(p0: [s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]])], p1: s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]]))), p1: [[s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]])]]), s3(p0: s2(p0: s1(p0: [s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]])], p1: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]])), p1: s1(p0: [s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]])], p1: s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]))), p1: [[s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]])]])], p1: s1(p0: [s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]])], p1: s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]])))]]
    let v2: Double = 104.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 104.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
