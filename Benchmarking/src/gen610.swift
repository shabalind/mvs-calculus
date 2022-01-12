  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  func f37(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p3
    let v1: [[Double]] = v0.p0
    var v6: s0 = v0
    let v4: [[Double]] = v6.p2
    let v3: [[Double]] = v6.p3
    let v5: [Double] = v7[0]
    v6.p3 = v3
    v6.p1 = v5
    var v15: [[Double]] = v4
    v6 = v0
    let v10: [[Double]] = v6.p3
    let v21: [Double] = v4[0]
    v6 = v0
    let v31: [Double] = v15[1]
    v6.p1 = v31
    let v22: [s0] = [v6, v6, v0]
    v6.p1 = v21
    let v56: [[Double]] = v0.p0
    let v28: s0 = v22[2]
    var v79: [[Double]] = v10
    v6.p0 = v79
    v6.p0 = v1
    v6.p0 = v56
    return v28
  }
  func f27(_ v0: s1) -> s1 {
    var v5: s1 = v0
    let v1: s0 = v0.p0
    let v6: s0 = f37(v1)
    let v4: s0 = f37(v6)
    v5.p0 = v4
    var v7: s0 = v4
    v7 = v4
    var v8: s0 = v6
    var v14: s1 = v0
    v5.p0 = v8
    let v11: [Double] = v7.p1
    let v2: [[Double]] = v1.p3
    v8.p1 = v11
    v7.p0 = v2
    let v21: [Double] = v2[0]
    let v36: Double = v21[0]
    let v18: [[s0]] = v14.p1
    let v20: [[Double]] = v4.p0
    let v51: s0 = f37(v1)
    var v41: s0 = v1
    let v30: [s0] = v18[2]
    let v42: s0 = v0.p0
    let v32: s0 = v30[0]
    v7 = v6
    let v46: [[s0]] = v0.p1
    var v57: [Double] = v21
    let v141: [[Double]] = v7.p3
    let v61: [[Double]] = v41.p2
    let v26: [[s0]] = v5.p1
    let v59: [Double] = v61[0]
    var v44: s1 = v14
    let v83: s0 = v44.p0
    let v27: Double = v59[0]
    v14.p1 = v26
    v41.p2 = v61
    let v39: [[s0]] = v44.p1
    let v80: s0 = f37(v83)
    v41 = v51
    let v94: s0 = f37(v4)
    v44.p0 = v94
    let v78: [Double] = v61[1]
    v7.p1 = v78
    let v47: [[s0]] = v14.p1
    var v50: s1 = v44
    v50.p0 = v6
    v44.p0 = v80
    let v85: s0 = v50.p0
    let v99: [[s0]] = v5.p1
    let v53: [[s0]] = v50.p1
    let v91: [s1] = [v44, v50, v50, v5, v14, v14]
    let v102: s0 = f37(v8)
    let v137: s1 = v91[5]
    var v205: [[Double]] = v61
    let v132: s0 = v137.p0
    v7 = v85
    v8.p3 = v20
    v50.p0 = v80
    v44.p0 = v32
    v57[0] = v36
    let v100: [Double] = v61[1]
    let v281: s0 = v50.p0
    v14.p0 = v281
    v57[0] = v27
    v14.p0 = v102
    v5.p1 = v46
    v5.p1 = v53
    v8.p1 = v57
    v205[1] = v100
    v5.p0 = v42
    var v114: [[s0]] = v99
    v8.p3 = v141
    v44.p1 = v39
    v7.p2 = v205
    v5.p0 = v85
    v44.p0 = v132
    v14.p1 = v47
    v7.p0 = v20
    v44.p1 = v114
    var v164: s1 = v14
    var v177: s1 = v137
    v164.p1 = v46
    v177 = v164
    return v177
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v7: s1 = f27(v0)
    let v8: s1 = f27(v7)
    let v6: s1 = f27(v0)
    let v10: s1 = f27(v6)
    let v4: [[s0]] = v8.p1
    var v9: [[s0]] = v4
    let v49: [s0] = v9[0]
    let v39: s0 = v10.p0
    let v53: Double = v1 * v1
    var v65: [s0] = v49
    v9[1] = v65
    let v63: s0 = f37(v39)
    var v55: s0 = v63
    let v59: [[Double]] = v55.p0
    var v57: [[Double]] = v59
    let v136: [[[Double]]] = [v57, v57]
    var v81: [[[Double]]] = v136
    let v31: [[Double]] = v136[1]
    v55.p0 = v31
    let v62: s0 = v49[0]
    v81 = v136
    let v54: [Double] = v59[0]
    let v122: [[Double]] = v62.p3
    var v86: [[Double]] = v122
    let v95: Double = v1 / v53
    let v88: [[Double]] = v81[0]
    let v93: [Double] = v86[0]
    var v165: [Double] = v54
    v55.p0 = v88
    v165 = v93
    v86[0] = v93
    v9[1] = v65
    v86[0] = v165
    v86[0] = v54
    v165[0] = v95
    let v77: Double = v165[0]
    return v77
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [1.0], p2: [[2.0], [3.0]], p3: [[4.0]]), p1: [[s0(p0: [[5.0]], p1: [6.0], p2: [[7.0], [8.0]], p3: [[9.0]])], [s0(p0: [[10.0]], p1: [11.0], p2: [[12.0], [13.0]], p3: [[14.0]])], [s0(p0: [[15.0]], p1: [16.0], p2: [[17.0], [18.0]], p3: [[19.0]])]])
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
