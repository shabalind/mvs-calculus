  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f81(_ v0: s0, _ v1: s0) -> s0 {
    return v0
  }
  func f74(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    var v2: [[Double]] = v4
    let v1: [[Double]] = v0.p1
    let v3: s0 = f81(v0, v0)
    let v6: s0 = f81(v3, v0)
    var v5: [[Double]] = v2
    var v11: s0 = v3
    v11.p0 = v5
    let v8: [Double] = v4[2]
    v11.p1 = v5
    v11.p0 = v5
    let v15: [Double] = v1[2]
    let v18: [[Double]] = v3.p1
    let v19: [Double] = v5[2]
    let v9: s0 = f81(v6, v6)
    v5[1] = v15
    let v21: [[Double]] = v6.p0
    v11.p1 = v5
    v2[2] = v8
    var v14: s0 = v6
    v2[1] = v19
    let v22: s0 = f81(v14, v0)
    v11.p1 = v5
    let v17: [Double] = v18[0]
    var v29: s0 = v22
    v29.p0 = v5
    v11.p0 = v21
    v5[2] = v17
    let v26: s0 = f81(v0, v9)
    let v33: s0 = f81(v9, v0)
    let v103: [[Double]] = v26.p0
    let v78: s0 = f81(v22, v11)
    v29.p1 = v1
    v14 = v33
    let v60: s0 = f81(v78, v26)
    var v66: s0 = v22
    let v48: [[Double]] = v29.p0
    v29.p0 = v1
    let v129: [[Double]] = v60.p1
    var v67: s0 = v66
    var v79: [Double] = v8
    var v95: s0 = v60
    v11.p0 = v48
    v66.p1 = v103
    let v57: s0 = f81(v0, v6)
    var v153: s0 = v6
    v67.p0 = v48
    let v115: s0 = f81(v153, v95)
    var v137: [[Double]] = v129
    v66.p1 = v18
    let v91: [[Double]] = v57.p1
    v67.p1 = v21
    v95.p0 = v91
    let v121: s0 = f81(v67, v6)
    let v139: s0 = f81(v121, v115)
    v137[1] = v79
    v66.p0 = v137
    return v139
  }
  func f67(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v6: [s0] = [v3]
    var v1: s0 = v0
    let v4: s0 = f74(v1)
    let v12: [[Double]] = v4.p0
    v3.p0 = v12
    var v5: [[Double]] = v12
    let v11: [Double] = v5[1]
    var v10: s0 = v3
    v3.p0 = v5
    let v24: [[Double]] = v10.p0
    let v19: s0 = v6[0]
    v5[1] = v11
    v3.p0 = v24
    return v19
  }
  func f56(_ v0: s0) -> s0 {
    let v4: s0 = f67(v0)
    let v11: s0 = f67(v0)
    let v26: s0 = f74(v4)
    let v25: s0 = f74(v11)
    let v20: s0 = f74(v11)
    let v114: s0 = f74(v4)
    let v79: s0 = f81(v25, v26)
    let v140: [[Double]] = v114.p1
    let v93: s0 = f81(v79, v20)
    let v249: [[Double]] = v93.p0
    let v175: s0 = s0(p0: v140, p1: v249)
    return v175
  }
  func f50(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v3: s0 = f74(v0)
    let v2: [[Double]] = v3.p0
    let v7: s0 = f56(v4)
    let v8: s0 = f56(v0)
    let v15: s0 = f81(v0, v8)
    let v10: [s0] = [v3, v7]
    let v20: [s0] = [v15, v4]
    let v19: s0 = v20[0]
    v4.p0 = v2
    let v50: s0 = v10[1]
    let v64: s0 = f67(v50)
    let v58: s0 = f81(v19, v64)
    return v58
  }
  func f45(_ v0: s0) -> s0 {
    let v8: s0 = f67(v0)
    let v19: s0 = f50(v0)
    let v15: s0 = f50(v19)
    let v25: [s0] = [v19, v19, v15, v0, v8, v19]
    var v30: [s0] = v25
    let v104: s0 = v30[5]
    return v104
  }
  func f9(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p1
    let v3: s0 = f81(v0, v0)
    var v2: s0 = v3
    let v4: [[Double]] = v2.p1
    let v11: [[Double]] = v2.p1
    let v10: [Double] = v4[2]
    var v17: [[Double]] = v4
    let v21: [[Double]] = v3.p1
    v2.p0 = v6
    v17[0] = v10
    v2.p0 = v4
    var v18: s0 = v3
    v18.p0 = v11
    let v20: [Double] = v11[1]
    v2.p0 = v17
    v17[1] = v10
    v17[1] = v20
    var v31: s0 = v18
    v31.p0 = v21
    return v31
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s1], _ v2: Double) -> Double {
    let v5: s0 = f9(v0)
    let v8: s0 = f45(v0)
    var v3: Double = v2
    let v17: [[Double]] = v8.p1
    let v15: [Double] = v17[2]
    let v9: [[Double]] = v5.p0
    var v13: [Double] = v15
    let v20: [Double] = v9[1]
    let v21: [[Double]] = v8.p0
    let v14: [Double] = v21[2]
    let v26: Double = v13[0]
    v13[0] = v3
    let v32: Double = v20[0]
    v13[0] = v32
    let v23: Double = v14[0]
    let v112: Double = v26 / v23
    v13[0] = v112
    return v112
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
    let v1: [s1] = [s1(p0: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]), s1(p0: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], p1: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])])]
    let v2: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
