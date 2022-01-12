  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  func f4(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p1
    let v2: [Double] = v6[1]
    var v8: s0 = v0
    let v1: [[Double]] = v8.p1
    let v4: [[Double]] = v0.p1
    var v5: [[Double]] = v6
    v8.p1 = v5
    let v3: [[[Double]]] = [v1, v1]
    v8.p1 = v4
    v5[1] = v2
    let v7: [[[Double]]] = [v1, v6]
    var v13: [Double] = v2
    let v11: [[Double]] = v8.p0
    let v16: [[Double]] = v8.p0
    let v9: [[Double]] = v0.p1
    v5[0] = v13
    let v10: [[Double]] = v0.p1
    let v12: [[Double]] = v0.p1
    let v23: Double = v13[0]
    v8.p0 = v11
    var v24: Double = v23
    var v22: [Double] = v2
    let v21: [[Double]] = v8.p0
    let v20: [[Double]] = v3[1]
    let v25: [Double] = v16[0]
    let v14: s0 = s0(p0: v11, p1: v9)
    v5[1] = v25
    var v32: [[Double]] = v16
    let v49: [Double] = v20[0]
    v32[0] = v22
    var v39: [Double] = v49
    v5[1] = v13
    var v35: [[[Double]]] = v3
    let v38: [[Double]] = v8.p1
    let v41: Double = v24 * v24
    let v45: [[Double]] = v14.p1
    let v30: s0 = s0(p0: v16, p1: v5)
    let v58: [Double] = v10[1]
    let v57: s0 = s0(p0: v21, p1: v1)
    v8.p0 = v32
    v8.p1 = v4
    v8.p1 = v12
    let v43: [s0] = [v30, v14, v57, v57, v30, v14]
    var v72: [s0] = v43
    v8.p1 = v4
    var v33: [[Double]] = v1
    v33[0] = v25
    var v85: [[[Double]]] = v3
    v8.p1 = v38
    let v65: s0 = v72[1]
    let v67: [[[[Double]]]] = [v35, v7]
    v35[1] = v45
    let v122: [[Double]] = v65.p1
    let v83: [[[Double]]] = v67[1]
    var v75: [[[Double]]] = v85
    v35 = v75
    var v81: s0 = v65
    v39[0] = v24
    var v103: [[[Double]]] = v83
    let v131: Double = v13[0]
    v33[1] = v39
    v22[0] = v41
    v33[1] = v58
    v22[0] = v131
    let v272: [[Double]] = v75[1]
    v8.p1 = v272
    v81.p0 = v16
    v75 = v103
    v81.p1 = v33
    v103[0] = v122
    return v81
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v7: [s0] = v0.p1
    let v6: s0 = v7[1]
    let v5: s0 = v7[2]
    let v12: s0 = v7[0]
    var v14: s0 = v5
    let v9: [[Double]] = v6.p1
    v14.p1 = v9
    let v16: s0 = f4(v14)
    let v21: [[Double]] = v16.p1
    var v20: s0 = v5
    let v19: [Double] = v21[1]
    v20.p1 = v21
    let v38: [[Double]] = v20.p0
    let v41: [[Double]] = v12.p0
    var v55: [Double] = v19
    var v79: [Double] = v55
    v14.p0 = v41
    v14.p0 = v38
    v20.p1 = v9
    let v116: Double = v79[0]
    v20.p0 = v41
    return v116
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])]], p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]])])
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
