  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f70(_ v0: s1) -> s1 {
    let v4: s0 = v0.p1
    let v7: s0 = v0.p1
    let v5: [[Double]] = v7.p0
    let v6: [Double] = v5[0]
    var v2: s0 = v7
    let v10: [[Double]] = v7.p1
    var v8: s1 = v0
    let v13: [Double] = v10[1]
    let v3: [[Double]] = v4.p1
    let v9: s0 = s0(p0: v5, p1: v10, p2: v5, p3: v5)
    var v11: [[Double]] = v3
    var v15: s1 = v0
    let v18: Double = v6[0]
    var v36: [Double] = v13
    var v17: Double = v18
    v2.p0 = v5
    v11[1] = v13
    v11[1] = v13
    v11[0] = v13
    let v117: [Double] = v5[0]
    let v41: [Double] = v10[0]
    let v14: Double = v17 + v17
    let v26: [Double] = v5[0]
    let v23: Double = v6[0]
    v36[0] = v14
    let v29: [Double] = v3[1]
    v36 = v26
    let v27: s0 = v15.p1
    v11[1] = v13
    var v35: [Double] = v41
    v2.p2 = v5
    let v58: [[Double]] = [v117, v35, v29, v35, v35]
    let v32: s0 = v15.p1
    var v44: [[Double]] = v5
    var v53: [[Double]] = v5
    let v28: [Double] = v44[0]
    let v37: [Double] = v44[0]
    v53[0] = v29
    v15.p0 = v32
    var v48: s1 = v8
    let v73: [Double] = v58[2]
    let v79: s0 = v48.p0
    let v71: [[Double]] = v7.p0
    v48.p0 = v9
    v35[0] = v23
    let v67: s1 = s1(p0: v27, p1: v2)
    var v50: s1 = v0
    v44[0] = v36
    v50.p1 = v32
    var v42: Double = v14
    let v47: s0 = v48.p1
    v36[0] = v14
    v44[0] = v73
    v11[0] = v73
    var v61: [[Double]] = v53
    v2 = v7
    let v65: [[Double]] = v32.p2
    let v51: [Double] = v11[0]
    v44[0] = v117
    v61[0] = v37
    v2.p2 = v61
    v50.p1 = v7
    let v60: s0 = v50.p1
    let v75: [[Double]] = v60.p1
    let v178: s0 = v50.p1
    let v70: s0 = v48.p1
    let v84: [Double] = v58[2]
    v36[0] = v42
    v48.p1 = v70
    v44[0] = v84
    let v121: s0 = v0.p0
    v15.p1 = v60
    let v43: [[Double]] = v47.p0
    let v96: [Double] = v58[2]
    var v191: s1 = v67
    v50 = v8
    let v78: [[Double]] = v121.p0
    v61[0] = v51
    v36[0] = v18
    v61 = v43
    v2.p3 = v71
    v36 = v28
    v2.p0 = v43
    v191.p0 = v178
    v35[0] = v18
    v11[0] = v96
    v15.p0 = v79
    v191.p1 = v178
    v50.p1 = v32
    let v243: s0 = s0(p0: v78, p1: v75, p2: v61, p3: v65)
    v8.p0 = v243
    return v191
  }
  func f68(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v5: [[Double]] = v3.p2
    let v6: s1 = s1(p0: v3, p1: v3)
    let v1: s1 = f70(v6)
    var v12: s1 = v6
    var v14: s1 = v1
    let v7: [Double] = v5[0]
    let v8: s1 = f70(v1)
    let v11: s1 = f70(v12)
    var v4: [[Double]] = v5
    v14.p0 = v0
    v12.p1 = v3
    var v17: [Double] = v7
    let v15: s1 = f70(v11)
    let v28: [[Double]] = v0.p3
    let v23: s1 = f70(v8)
    v4[0] = v17
    var v20: [[Double]] = v4
    let v18: s0 = v23.p0
    let v31: s1 = f70(v14)
    let v19: [[Double]] = v3.p1
    var v30: s0 = v18
    let v16: s0 = v31.p1
    let v32: s1 = f70(v23)
    let v34: s1 = f70(v23)
    var v29: [[Double]] = v19
    let v40: s0 = v32.p1
    let v35: [Double] = v28[0]
    let v52: [s1] = [v15, v15, v11]
    let v21: Double = v17[0]
    v29[1] = v35
    let v39: Double = v21 / v21
    var v123: [[Double]] = v5
    let v48: [Double] = v123[0]
    let v38: [Double] = v19[0]
    v12.p1 = v16
    v14.p1 = v40
    let v36: s1 = f70(v34)
    v30.p0 = v123
    v123[0] = v17
    let v103: s1 = v52[2]
    let v102: [Double] = v20[0]
    v12 = v36
    let v97: s1 = v52[1]
    let v109: Double = v21 - v39
    v17[0] = v109
    v14.p0 = v16
    let v160: s1 = f70(v103)
    let v107: s0 = v160.p0
    v14.p0 = v16
    v29[1] = v48
    v29[1] = v38
    v12.p1 = v107
    v3.p1 = v29
    v123[0] = v102
    let v427: s0 = v97.p0
    v12.p0 = v30
    var v79: s0 = v427
    return v79
  }
  func f65(_ v0: s1) -> s1 {
    let v5: [s1] = [v0]
    let v4: s1 = v5[0]
    var v6: s1 = v4
    let v15: s1 = v5[0]
    let v16: s0 = v15.p1
    v6.p0 = v16
    return v6
  }
  func f64(_ v0: s0, _ v1: s1) -> s0 {
    var v8: s0 = v0
    let v20: s0 = f68(v8)
    var v11: s0 = v20
    var v32: s0 = v11
    let v41: s0 = f68(v32)
    let v42: [[Double]] = v41.p0
    v11.p3 = v42
    return v32
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: Double) -> Double {
    let v4: Double = v2 / v2
    let v7: [[Double]] = v1.p2
    let v8: s1 = s1(p0: v1, p1: v1)
    let v16: [Double] = v7[0]
    let v15: s1 = f70(v8)
    let v18: s0 = f64(v1, v15)
    var v17: Double = v4
    var v29: [Double] = v16
    var v19: [[Double]] = v7
    let v26: s1 = f65(v8)
    v29[0] = v17
    v19 = v7
    let v47: s0 = v26.p1
    let v35: [Double] = v19[0]
    let v20: [Double] = v19[0]
    let v58: [[Double]] = v47.p1
    v29[0] = v17
    let v65: [[Double]] = v18.p2
    let v69: [Double] = v58[1]
    let v93: [Double] = v58[1]
    v29 = v35
    v19[0] = v20
    let v77: Double = v69[0]
    v29[0] = v77
    v19[0] = v29
    var v60: [[Double]] = v65
    var v136: [[Double]] = v60
    v19[0] = v93
    v136[0] = v29
    v60[0] = v69
    let v64: [Double] = v136[0]
    var v131: [[Double]] = v19
    let v166: Double = v29[0]
    v60 = v131
    v19[0] = v64
    return v166
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0]], p3: [[4.0]])]
    let v1: s0 = s0(p0: [[5.0]], p1: [[6.0], [7.0]], p2: [[8.0]], p3: [[9.0]])
    let v2: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
