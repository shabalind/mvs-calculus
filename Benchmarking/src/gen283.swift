  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f32(_ v0: [Double]) -> [Double] {
    let v5: Double = v0[0]
    var v1: Double = v5
    var v2: Double = v1
    var v4: [Double] = v0
    var v6: [Double] = v0
    var v7: Double = v1
    let v8: Double = v2 + v7
    v6[0] = v5
    var v11: [Double] = v0
    var v12: [Double] = v6
    v12[0] = v7
    v4[0] = v8
    var v14: Double = v8
    var v13: [Double] = v4
    var v18: [Double] = v12
    let v19: Double = v11[0]
    let v49: Double = v4[0]
    let v16: Double = v6[0]
    let v38: Double = v13[0]
    let v25: Double = v18[0]
    var v53: Double = v14
    let v20: [[Double]] = [v12]
    let v29: [Double] = v20[0]
    let v31: [Double] = v20[0]
    var v30: [[Double]] = v20
    var v60: [Double] = v18
    var v44: [[Double]] = v30
    var v34: [[Double]] = v44
    v18[0] = v38
    var v58: [[Double]] = v30
    v2 = v19
    var v28: [[Double]] = v58
    v60[0] = v49
    v30[0] = v4
    let v50: [Double] = v28[0]
    let v43: [Double] = v44[0]
    v11[0] = v25
    let v46: [Double] = v34[0]
    var v68: [[Double]] = v34
    var v77: [Double] = v50
    v34[0] = v77
    let v103: [Double] = v68[0]
    v34[0] = v46
    v6[0] = v2
    v60[0] = v49
    let v112: [Double] = v58[0]
    let v136: Double = v103[0]
    let v41: Double = v112[0]
    v58[0] = v46
    let v96: Double = v60[0]
    v18[0] = v96
    v12[0] = v41
    let v100: [[Double]] = [v46, v12, v31, v6, v29, v11]
    var v80: [[Double]] = v100
    v30[0] = v29
    v80[1] = v43
    v80[4] = v13
    let v94: [Double] = v80[0]
    v12[0] = v16
    v18[0] = v5
    v53 = v136
    var v79: [Double] = v46
    v4[0] = v53
    v79 = v94
    return v79
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v3: [Double] = [v1, v1, v1, v1, v1]
    let v5: s0 = v0[1]
    let v7: [[Double]] = v5.p0
    let v2: [Double] = v7[0]
    var v8: [Double] = v2
    let v21: Double = v2[0]
    var v11: Double = v21
    var v10: [Double] = v8
    var v13: Double = v11
    v10[0] = v11
    let v17: Double = v3[1]
    let v28: [Double] = f32(v10)
    v8[0] = v17
    v8[0] = v11
    var v58: Double = v1
    let v40: Double = v13 + v58
    v8[0] = v40
    let v62: [Double] = f32(v28)
    let v55: Double = v62[0]
    v8 = v28
    return v55
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
