  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  func f14(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    var v1: [[Double]] = v6
    var v3: s0 = v0
    v3.p0 = v6
    let v4: [[Double]] = v0.p1
    v3.p0 = v6
    var v17: s0 = v3
    let v8: [[Double]] = v17.p1
    let v11: [[Double]] = v0.p0
    let v5: [Double] = v11[0]
    var v18: s0 = v3
    v18.p1 = v8
    let v10: [Double] = v8[1]
    let v22: s0 = s0(p0: v6, p1: v8)
    v18.p0 = v11
    var v15: s0 = v0
    let v12: [[Double]] = v18.p0
    var v20: [[Double]] = v8
    let v19: [Double] = v8[0]
    v17.p0 = v1
    let v25: [[[Double]]] = [v4, v20, v20, v8]
    v1[0] = v10
    var v16: [Double] = v10
    let v21: [[Double]] = v22.p0
    var v52: [Double] = v5
    var v40: [[Double]] = v4
    let v26: [Double] = v12[0]
    let v38: [[Double]] = [v16, v52, v16, v26, v26, v5]
    var v29: s0 = v22
    let v27: [[Double]] = v17.p0
    var v36: s0 = v0
    var v81: [[[Double]]] = v25
    let v39: [Double] = v38[3]
    var v46: s0 = v0
    v15.p0 = v1
    v36.p1 = v40
    v40[1] = v39
    let v37: [Double] = v40[1]
    v81[0] = v20
    let v90: [[Double]] = v46.p1
    let v102: [[Double]] = v36.p1
    let v60: [[Double]] = v29.p0
    let v69: [[Double]] = v25[3]
    let v47: [[Double]] = v0.p1
    v52 = v39
    v18.p0 = v27
    let v63: [[Double]] = v15.p1
    var v105: [[[Double]]] = v81
    let v76: Double = v37[0]
    var v54: Double = v76
    v15.p0 = v27
    v29.p0 = v60
    let v89: [Double] = v47[1]
    var v172: Double = v76
    let v122: [Double] = v69[1]
    let v119: [[Double]] = v105[2]
    v20[1] = v89
    let v80: Double = v19[0]
    v105[3] = v90
    v17.p1 = v102
    v20[0] = v89
    v81[1] = v63
    v52[0] = v80
    var v104: Double = v172
    v52[0] = v54
    var v127: s0 = v29
    let v124: [Double] = v119[0]
    v17.p1 = v47
    let v107: Double = v122[0]
    v127.p1 = v119
    v16[0] = v104
    var v430: [Double] = v124
    v20[0] = v430
    v16[0] = v107
    v29.p0 = v21
    v36.p1 = v63
    return v127
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s0, _ v2: Double) -> Double {
    let v11: s0 = f14(v1)
    var v5: s0 = v11
    let v8: [[Double]] = v5.p1
    let v16: [Double] = v8[0]
    let v14: [[Double]] = v5.p0
    var v22: [Double] = v16
    var v63: [[Double]] = v14
    v5.p0 = v63
    v63[0] = v16
    v22[0] = v2
    let v55: Double = v22[0]
    return v55
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])]], p1: s0(p0: [[6.0]], p1: [[7.0], [8.0]]))
    let v1: s0 = s0(p0: [[9.0]], p1: [[10.0], [11.0]])
    let v2: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
