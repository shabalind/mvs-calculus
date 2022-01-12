  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  func f80(_ v0: s0) -> s0 {
    let v2: [s0] = [v0, v0, v0, v0]
    var v6: [s0] = v2
    let v9: s0 = v6[0]
    v6[3] = v0
    v6[1] = v0
    v6[3] = v0
    v6[1] = v0
    v6[0] = v0
    var v12: [s0] = v6
    let v21: s0 = v12[1]
    v6[1] = v0
    let v17: s1 = s1(p0: v9, p1: v21)
    let v33: s0 = v2[3]
    v6[0] = v21
    var v44: s1 = v17
    v44.p0 = v9
    v44.p1 = v0
    v6[2] = v33
    v44.p0 = v0
    v44.p1 = v33
    v44.p1 = v0
    let v40: s0 = v44.p1
    v44.p1 = v9
    return v40
  }
  func f76(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v6: [[Double]] = v0.p1
    let v3: [[Double]] = v4.p0
    let v5: [[Double]] = v0.p1
    let v8: s0 = f80(v4)
    v4 = v8
    let v11: [[Double]] = v8.p0
    v4 = v8
    let v13: s0 = s0(p0: v11, p1: v6)
    v4.p0 = v11
    v4.p1 = v5
    let v14: s0 = f80(v0)
    let v49: s0 = f80(v4)
    let v27: s0 = f80(v13)
    v4.p0 = v3
    let v38: [[Double]] = v49.p0
    v4.p0 = v38
    v4.p0 = v38
    let v23: [[Double]] = v0.p1
    var v36: s0 = v27
    v36.p1 = v23
    let v39: [[Double]] = v14.p1
    v4.p1 = v39
    let v42: s0 = f80(v36)
    v36 = v27
    v36.p1 = v23
    return v42
  }
  func f54(_ v0: s0) -> s0 {
    let v5: s0 = f80(v0)
    let v3: [s0] = [v5]
    let v4: s0 = f76(v5)
    let v10: s0 = v3[0]
    var v15: s0 = v5
    let v30: s0 = f80(v4)
    var v18: [s0] = v3
    v18 = v3
    v18[0] = v0
    let v71: s0 = f80(v10)
    v18[0] = v10
    let v40: s0 = v18[0]
    let v32: [[Double]] = v30.p1
    v15.p1 = v32
    let v69: s1 = s1(p0: v40, p1: v71)
    let v76: s0 = v69.p1
    v18[0] = v15
    return v76
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s0, _ v2: Double) -> Double {
    let v3: s0 = f54(v1)
    let v7: [[Double]] = v3.p1
    let v29: [Double] = v7[1]
    var v22: Double = v2
    let v28: Double = v29[0]
    var v183: Double = v28
    let v151: Double = v183 + v22
    let v189: Double = v151 - v151
    var v133: Double = v189
    return v133
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])])
    let v1: s0 = s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])
    let v2: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
