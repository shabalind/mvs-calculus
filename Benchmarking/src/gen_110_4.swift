  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [Double]
    var p1: Double
  }
  struct s3 {
    var p0: s2
    var p1: s0
  }
  struct s6 {
    var p0: [s3]
    var p1: s2
  }
  func f6(_ v0: s3) -> s3 {
    var v4: s3 = v0
    var v5: s3 = v4
    var v2: s3 = v5
    var v7: s3 = v0
    let v1: s0 = v7.p1
    v4.p1 = v1
    var v10: s0 = v1
    let v8: [[Double]] = v10.p0
    v5.p1 = v1
    let v12: [[Double]] = v1.p1
    let v11: s2 = v5.p0
    var v6: s0 = v10
    v4.p1 = v6
    let v14: [Double] = v12[0]
    let v3: [[Double]] = v1.p1
    var v26: [[Double]] = v12
    v6.p1 = v12
    v5.p0 = v11
    var v20: [[Double]] = v8
    v6.p1 = v12
    let v15: [Double] = v26[0]
    let v24: [[Double]] = v10.p1
    let v28: [Double] = v8[1]
    var v16: s3 = v4
    v6.p0 = v20
    v26[0] = v28
    let v9: [Double] = v8[0]
    let v27: [[[Double]]] = [v12, v3, v26, v26]
    let v21: [[Double]] = v6.p1
    v20[1] = v15
    let v38: s2 = v5.p0
    let v37: s2 = v0.p0
    let v35: [Double] = v37.p0
    var v36: s3 = v5
    let v39: [Double] = v37.p0
    v5.p0 = v38
    v20[1] = v35
    v4.p1 = v10
    let v63: [[Double]] = v27[3]
    v26[0] = v28
    let v133: [[Double]] = v27[3]
    v7.p1 = v6
    v36.p1 = v1
    let v75: [Double] = v20[1]
    v20[1] = v9
    v7 = v2
    let v52: [[[Double]]] = [v8, v20, v8, v20, v20, v20]
    let v49: [[Double]] = v10.p0
    var v124: s0 = v1
    let v76: [[Double]] = v52[1]
    var v60: [[Double]] = v24
    v124.p0 = v76
    v20[1] = v35
    var v176: s0 = v6
    v60[0] = v75
    v124.p1 = v133
    v10.p1 = v60
    v4.p1 = v176
    v124.p1 = v63
    var v122: [[[Double]]] = v52
    v124.p0 = v49
    let v123: [[Double]] = v10.p0
    v6.p1 = v60
    v26[0] = v39
    v10.p1 = v21
    let v116: s2 = v16.p0
    let v97: [[Double]] = v122[5]
    v122[3] = v123
    v36.p1 = v124
    v20[1] = v14
    v7.p0 = v37
    let v200: s2 = v7.p0
    v2.p0 = v200
    v7.p1 = v176
    v2.p0 = v116
    v6.p0 = v97
    return v36
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v6: s3 = v0[1]
    let v7: s3 = f6(v6)
    var v20: [s3] = v0
    let v30: s2 = v7.p0
    v20[1] = v6
    v20 = v0
    let v23: s6 = s6(p0: v20, p1: v30)
    let v141: [s6] = [v23, v23, v23, v23, v23, v23, v23]
    let v87: s6 = v141[2]
    let v108: s2 = v87.p1
    let v139: Double = v108.p1
    return v139
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s2(p0: [0.0], p1: 1.0), p1: s0(p0: [[2.0], [3.0]], p1: [[4.0]])), s3(p0: s2(p0: [5.0], p1: 6.0), p1: s0(p0: [[7.0], [8.0]], p1: [[9.0]])), s3(p0: s2(p0: [10.0], p1: 11.0), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0]]))]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
