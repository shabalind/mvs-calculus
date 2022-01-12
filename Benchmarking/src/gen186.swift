  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [s0]
  }
  func f17(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p0
    let v6: [s0] = [v0, v0, v0, v0, v0]
    let v5: [Double] = v4[1]
    let v7: [[Double]] = v0.p1
    var v2: [s0] = v6
    let v8: s0 = s0(p0: v4, p1: v7)
    let v1: Double = v5[0]
    v2[1] = v8
    var v3: [[Double]] = v7
    let v16: s0 = v2[2]
    let v12: [[Double]] = v0.p1
    var v10: [[Double]] = v3
    let v33: [[Double]] = v0.p0
    let v13: [Double] = v10[0]
    let v21: [[Double]] = v8.p0
    var v19: [Double] = v13
    var v15: Double = v1
    let v24: Double = v1 - v15
    let v27: [[[Double]]] = [v3, v3, v7, v7]
    let v39: [[Double]] = v8.p1
    let v25: [[Double]] = v0.p1
    let v50: s0 = s0(p0: v33, p1: v25)
    let v23: [[Double]] = v50.p1
    let v34: [[Double]] = v27[1]
    var v26: [Double] = v5
    v19[0] = v24
    v10 = v12
    let v44: [[Double]] = v0.p0
    v19[0] = v1
    let v35: [[Double]] = v8.p1
    var v41: [[[Double]]] = v27
    var v36: s0 = v16
    v36.p1 = v23
    v36.p1 = v35
    v3[0] = v5
    v36.p0 = v44
    let v52: [[Double]] = v36.p0
    v3[0] = v19
    v2[0] = v0
    let v57: s0 = s0(p0: v52, p1: v23)
    v3[0] = v26
    v26[0] = v15
    let v108: [[Double]] = v41[1]
    v41[1] = v108
    let v69: Double = v19[0]
    v26[0] = v69
    v36.p1 = v34
    let v111: [[Double]] = v27[3]
    let v112: s0 = s0(p0: v21, p1: v39)
    let v89: [[Double]] = v112.p1
    v36.p1 = v108
    v36.p1 = v7
    v36.p1 = v89
    v36.p0 = v52
    v36.p1 = v10
    v36.p1 = v111
    return v57
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v2: s1 = v0[1]
    var v6: s1 = v2
    let v3: s0 = v6.p0
    v6.p0 = v3
    let v5: [[Double]] = v3.p1
    let v7: s0 = v2.p0
    v6.p0 = v7
    let v13: [Double] = v5[0]
    v6.p1 = v3
    let v9: [s0] = v6.p2
    var v19: [s0] = v9
    var v10: s0 = v3
    v6.p0 = v7
    let v12: s0 = v9[0]
    let v15: s0 = v19[1]
    v6.p2 = v19
    let v23: s1 = v0[0]
    var v29: s1 = v2
    var v21: [[Double]] = v5
    var v24: s1 = v23
    var v40: [s0] = v19
    var v34: s1 = v29
    v34.p1 = v12
    v34.p1 = v7
    v10.p1 = v21
    v34.p2 = v9
    let v26: s0 = v34.p0
    let v35: s0 = v24.p1
    let v83: s0 = v23.p1
    v6.p2 = v40
    v40 = v19
    v6.p2 = v9
    let v73: s0 = f17(v26)
    let v17: s0 = f17(v83)
    let v51: Double = v13[0]
    let v66: s0 = f17(v83)
    v29.p0 = v17
    let v63: [[Double]] = v66.p1
    v6.p1 = v10
    v34.p0 = v12
    v34.p2 = v40
    v34.p2 = v9
    v24.p2 = v19
    v10.p1 = v63
    let v107: [[Double]] = v73.p0
    v10.p0 = v107
    v40[1] = v15
    v29.p1 = v35
    return v51
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), p2: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]), s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), p2: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])])]
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
