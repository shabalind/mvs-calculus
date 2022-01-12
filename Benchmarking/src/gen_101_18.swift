  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: Double
  }
  func f36(_ v0: s1, _ v1: s1) -> s1 {
    let v4: [s0] = v1.p0
    let v3: [s0] = v1.p0
    var v7: s1 = v0
    let v9: [s0] = v1.p0
    let v6: s0 = v3[0]
    v7.p0 = v3
    let v25: [[Double]] = v6.p0
    let v15: Double = v7.p1
    let v17: [Double] = v25[0]
    let v20: [Double] = [v15, v15, v15, v15]
    let v40: Double = v17[0]
    var v73: [Double] = v20
    v7.p0 = v4
    v7.p1 = v40
    let v24: Double = v40 * v40
    let v28: Double = v20[1]
    let v46: [s0] = v7.p0
    let v37: Double = v24 * v28
    v73[1] = v40
    let v41: Double = v73[1]
    let v36: Double = v41 - v37
    let v34: Double = v0.p1
    v7.p0 = v46
    v7.p0 = v46
    let v80: s1 = s1(p0: v46, p1: v36)
    v7.p0 = v9
    v73[2] = v34
    return v80
  }
  func f27(_ v0: s1) -> s1 {
    let v4: [s0] = v0.p0
    let v2: s1 = f36(v0, v0)
    let v6: s0 = v4[0]
    let v21: [[Double]] = v6.p0
    let v14: [Double] = v21[0]
    var v18: [[Double]] = v21
    v18[0] = v14
    let v43: [Double] = v18[0]
    let v26: Double = v43[0]
    let v69: [s0] = v2.p0
    let v50: s1 = s1(p0: v69, p1: v26)
    return v50
  }
  func f17(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v7: [[Double]] = v0.p1
    let v4: [Double] = v7[1]
    var v2: s0 = v0
    let v5: [[Double]] = v6.p0
    v2.p0 = v5
    let v1: [[Double]] = v2.p1
    var v12: [Double] = v4
    let v13: [[Double]] = v2.p0
    var v15: s0 = v6
    v15.p1 = v1
    v6.p0 = v13
    let v23: [[Double]] = v6.p0
    var v28: [[Double]] = v7
    var v16: [[Double]] = v28
    v2.p1 = v16
    let v22: [[Double]] = v15.p0
    var v27: [[Double]] = v13
    v28[0] = v12
    v15.p0 = v27
    v15.p0 = v23
    var v39: s0 = v6
    let v61: [[Double]] = v6.p0
    var v32: [[Double]] = v22
    v2.p0 = v32
    v15.p0 = v22
    v6.p0 = v61
    return v39
  }
  func f14(_ v0: s1) -> s1 {
    var v4: s1 = v0
    var v7: s1 = v4
    let v2: Double = v4.p1
    let v6: s1 = f27(v7)
    let v3: s1 = f27(v0)
    var v14: s1 = v3
    let v1: [s0] = v7.p0
    let v8: Double = v7.p1
    let v11: Double = v14.p1
    v7.p1 = v2
    let v9: s0 = v1[0]
    let v15: Double = v11 / v8
    var v13: Double = v2
    let v10: s0 = v1[0]
    v7.p1 = v2
    let v16: [[Double]] = v10.p0
    let v20: [s0] = v14.p0
    let v25: Double = v6.p1
    var v29: [s0] = v20
    var v36: [[Double]] = v16
    let v30: [Double] = v36[0]
    v14.p1 = v13
    v4.p0 = v1
    let v24: s0 = v29[0]
    let v23: Double = v30[0]
    v14.p1 = v23
    let v19: [Double] = v36[0]
    v7.p0 = v1
    v29[0] = v24
    let v39: [Double] = v16[0]
    v36[0] = v39
    let v48: s0 = f17(v9)
    v14.p0 = v29
    v4.p0 = v1
    v7.p1 = v25
    v14.p0 = v1
    let v87: s1 = f36(v14, v7)
    v7.p1 = v23
    v36[0] = v19
    v29[0] = v48
    v4.p1 = v15
    v4.p0 = v1
    return v87
  }
  func f9(_ v0: s0, _ v1: [s0]) -> [s0] {
    return v1
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: s0, _ v2: Double) -> Double {
    let v4: [[Double]] = v1.p0
    var v6: Double = v2
    let v5: [s0] = v0[0]
    let v8: [Double] = v4[0]
    var v7: [Double] = v8
    v7[0] = v2
    v6 = v2
    let v14: Double = v7[0]
    let v3: [s0] = f9(v1, v5)
    let v10: s0 = f17(v1)
    let v12: [s0] = f9(v10, v5)
    let v24: [s0] = f9(v1, v3)
    v7[0] = v6
    v7[0] = v2
    let v18: Double = v6 + v6
    var v36: Double = v14
    let v33: Double = v18 + v18
    let v57: s0 = v24[0]
    var v31: [s0] = v5
    v7[0] = v33
    let v60: Double = v8[0]
    let v39: s1 = s1(p0: v12, p1: v33)
    v31[0] = v1
    let v32: s1 = f14(v39)
    let v48: [s0] = f9(v57, v5)
    let v87: s0 = v48[0]
    let v52: Double = v32.p1
    v31[0] = v10
    let v112: s1 = s1(p0: v31, p1: v14)
    v7[0] = v60
    let v261: Double = v112.p1
    let v110: Double = v36 * v261
    v31[0] = v87
    v7[0] = v52
    var v215: Double = v110
    return v215
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])]]
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
