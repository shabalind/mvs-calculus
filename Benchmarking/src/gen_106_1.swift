  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f22(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v1: [[Double]] = v0.p0
    let v6: [[Double]] = v5.p0
    let v9: [[Double]] = v5.p1
    let v4: [Double] = v9[0]
    var v2: s0 = v0
    let v20: [Double] = v6[0]
    let v12: [[Double]] = v0.p0
    var v11: [[Double]] = v9
    var v27: s0 = v2
    v27.p1 = v11
    let v13: [Double] = v1[0]
    v11[0] = v20
    let v22: [[Double]] = v0.p1
    v11[0] = v13
    v11[0] = v13
    var v31: s0 = v0
    var v21: s0 = v27
    var v43: s0 = v31
    v21.p0 = v12
    let v63: [[Double]] = v21.p0
    let v73: [[Double]] = v0.p0
    let v131: [s0] = [v27, v43, v2, v31, v27, v27]
    v11[0] = v4
    v43 = v31
    v2.p0 = v63
    var v118: [[Double]] = v1
    v11[0] = v4
    v43.p1 = v22
    v31.p0 = v118
    let v111: s0 = v131[2]
    v43.p1 = v9
    v27.p0 = v73
    return v111
  }
  func f12(_ v0: s0) -> s0 {
    let v4: s0 = f22(v0)
    var v3: s0 = v4
    var v6: s0 = v4
    var v8: s0 = v3
    var v2: s0 = v6
    let v11: [[Double]] = v3.p0
    var v7: [[Double]] = v11
    v2.p0 = v11
    let v9: s0 = f22(v2)
    var v21: s0 = v4
    let v1: [[Double]] = v3.p1
    v21 = v8
    let v18: [[[Double]]] = [v1, v1, v1, v1, v1, v1, v1]
    let v20: [[Double]] = v4.p1
    var v19: [[Double]] = v20
    v8.p1 = v19
    v3.p1 = v19
    let v28: s0 = f22(v3)
    v8 = v28
    let v33: [[Double]] = v18[3]
    let v25: [[Double]] = v9.p0
    var v42: [[Double]] = v1
    let v41: [[Double]] = v21.p0
    let v43: [Double] = v42[0]
    v7[0] = v43
    let v27: [[Double]] = v8.p0
    let v37: [[Double]] = v2.p0
    let v87: s0 = s0(p0: v37, p1: v33)
    let v85: [Double] = v1[0]
    v42[0] = v43
    v19[0] = v85
    let v59: s0 = f22(v87)
    v42[0] = v85
    v21.p0 = v25
    let v47: s0 = f22(v59)
    var v46: [[Double]] = v27
    var v120: s0 = v47
    v3.p0 = v25
    v2.p0 = v46
    v8.p1 = v20
    v6.p0 = v7
    v2.p0 = v41
    let v258: s0 = f22(v120)
    return v258
  }
  func f3(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v4: [[Double]] = v5.p0
    v5.p0 = v4
    let v7: s0 = f22(v5)
    let v8: s0 = f22(v7)
    v5.p0 = v4
    let v6: [Double] = v4[0]
    let v9: s0 = f22(v0)
    var v1: [[Double]] = v4
    var v10: [Double] = v6
    let v3: s0 = f12(v0)
    let v15: [Double] = v4[0]
    v1[1] = v15
    let v11: Double = v15[0]
    v5.p0 = v1
    let v12: [[Double]] = v3.p0
    v1[0] = v15
    let v13: s0 = f22(v7)
    v5.p0 = v12
    let v16: [[Double]] = v13.p0
    var v20: [Double] = v15
    v10 = v20
    var v28: [[Double]] = v16
    let v29: [[Double]] = v0.p1
    var v26: [[Double]] = v28
    v5.p0 = v4
    let v34: [[Double]] = v9.p0
    let v18: [Double] = v26[1]
    let v23: [[Double]] = v5.p1
    let v37: s0 = f22(v0)
    let v54: Double = v18[0]
    var v19: Double = v11
    let v32: [Double] = v23[0]
    v5.p0 = v12
    v28[0] = v6
    v5.p1 = v23
    v20[0] = v54
    let v22: [[Double]] = v8.p1
    var v25: [Double] = v32
    v26[0] = v10
    let v47: [Double] = v22[0]
    let v35: [[Double]] = v8.p0
    let v36: Double = v10[0]
    let v64: [Double] = v35[1]
    v1[0] = v25
    let v44: [[Double]] = v5.p0
    let v60: s0 = f22(v37)
    var v50: s0 = v60
    v10[0] = v36
    v10[0] = v19
    v50.p1 = v29
    v50.p0 = v26
    v28 = v44
    v10[0] = v11
    v26[1] = v64
    v26[1] = v47
    v25 = v10
    v50.p0 = v34
    return v50
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v3: s0 = v0
    let v9: [[Double]] = v0.p0
    var v7: Double = v1
    var v4: [[Double]] = v9
    let v6: [Double] = v4[0]
    v3.p0 = v9
    let v12: [Double] = v9[0]
    let v8: Double = v7 - v7
    let v5: s0 = f3(v3)
    v4[0] = v6
    let v10: [[Double]] = v5.p1
    v4[1] = v12
    v3.p0 = v4
    let v2: s0 = f22(v3)
    v3.p1 = v10
    let v19: [Double] = v10[0]
    let v29: [[Double]] = v2.p1
    var v16: Double = v1
    v4[1] = v19
    var v25: [Double] = v12
    let v22: [Double] = v29[0]
    v3.p0 = v4
    v4[0] = v25
    v25[0] = v8
    var v40: [[Double]] = v10
    let v53: Double = v19[0]
    let v26: Double = v53 - v16
    v40[0] = v6
    v40[0] = v22
    let v42: [Double] = v40[0]
    let v60: Double = v42[0]
    v25[0] = v60
    v25[0] = v16
    return v26
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
