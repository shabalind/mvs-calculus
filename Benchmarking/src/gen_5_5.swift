  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f48(_ v0: Double) -> Double {
    var v4: Double = v0
    var v6: Double = v0
    var v7: Double = v0
    var v3: Double = v6
    var v11: Double = v6
    var v1: Double = v7
    var v15: Double = v4
    v11 = v4
    var v2: Double = v3
    v11 = v3
    let v25: [Double] = [v0, v0, v4, v7]
    var v5: [Double] = v25
    var v16: [Double] = v5
    let v14: Double = v4 - v15
    v5[1] = v6
    var v32: Double = v7
    let v10: Double = v25[1]
    v16[3] = v14
    let v8: Double = v25[1]
    let v19: Double = v16[2]
    v16[2] = v32
    var v18: [Double] = v16
    v18[0] = v1
    var v22: [Double] = v25
    var v35: [Double] = v25
    v5[0] = v8
    v22[1] = v3
    var v31: [Double] = v35
    var v40: [Double] = v16
    let v34: Double = v31[1]
    var v49: Double = v11
    v22[1] = v2
    let v46: Double = v22[0]
    v22[1] = v11
    let v138: Double = v25[3]
    var v57: Double = v4
    let v37: Double = v40[3]
    let v48: Double = v31[0]
    v22[2] = v8
    var v50: Double = v0
    v16[1] = v49
    v22[3] = v57
    v22[3] = v6
    v31[2] = v19
    v22[2] = v50
    var v58: Double = v138
    v16[2] = v14
    let v38: Double = v18[0]
    v18[0] = v1
    let v55: [Double] = [v6, v46, v10, v34, v37, v48]
    var v54: [Double] = v55
    var v97: [Double] = v54
    v97[2] = v58
    let v85: Double = v97[0]
    v35[3] = v85
    v31[1] = v50
    v31[1] = v14
    v16[0] = v57
    v5[3] = v11
    var v71: [Double] = v97
    v5[0] = v4
    v22[2] = v38
    var v183: [Double] = v71
    var v96: [Double] = v183
    v96[5] = v32
    let v134: Double = v96[2]
    return v134
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: [s0] = v0.p0
    let v5: s0 = v4[1]
    let v11: [Double] = [v1, v1, v1, v1, v1]
    let v6: Double = f48(v1)
    let v24: Double = v11[0]
    var v15: [Double] = v11
    let v17: [[Double]] = v5.p1
    let v16: Double = v24 + v1
    var v13: s0 = v5
    v13.p1 = v17
    let v21: [[Double]] = v13.p0
    let v43: Double = v1 / v1
    v15[3] = v6
    v15[3] = v24
    let v33: [Double] = v21[0]
    let v55: Double = v15[2]
    v15[4] = v16
    var v35: Double = v1
    let v27: Double = v33[0]
    v15[4] = v43
    let v19: Double = f48(v35)
    v15[1] = v19
    v15[4] = v27
    return v55
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]))
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
