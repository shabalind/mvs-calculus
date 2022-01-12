  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
  }
  func f55(_ v0: s1) -> s1 {
    let v6: [s0] = v0.p1
    let v1: s0 = v6[2]
    var v4: s0 = v1
    var v3: s0 = v4
    let v2: s0 = v6[2]
    let v7: s0 = v6[0]
    var v9: s1 = v0
    var v8: [s0] = v6
    v8[1] = v3
    v8 = v6
    v9.p1 = v8
    v9.p1 = v8
    v8[1] = v7
    let v11: s0 = v8[0]
    var v15: [s0] = v6
    let v22: [[s0]] = v9.p0
    var v10: s1 = v0
    v8[2] = v2
    let v27: [[s0]] = v10.p0
    let v19: [s0] = v0.p1
    v9.p1 = v15
    var v33: s1 = v0
    v8[2] = v1
    var v30: [[s0]] = v22
    var v17: [[s0]] = v30
    v10.p0 = v27
    v15[2] = v11
    v9.p1 = v19
    let v43: [[s0]] = v10.p0
    let v56: [s0] = v9.p1
    var v54: s1 = v33
    v10.p0 = v30
    let v93: [s0] = v54.p1
    v9 = v10
    v10.p1 = v15
    var v58: [[s0]] = v22
    var v128: s1 = v33
    var v100: s1 = v128
    let v92: [s0] = v0.p1
    var v95: [s0] = v93
    var v82: s1 = v100
    v8 = v92
    v100.p0 = v58
    v58 = v17
    v128.p1 = v56
    v95[1] = v2
    v10.p1 = v95
    v9.p0 = v43
    var v187: [[s0]] = v30
    v54.p0 = v187
    return v82
  }
  func f40(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    var v1: s0 = v0
    v1.p0 = v5
    var v3: s0 = v0
    var v8: s0 = v3
    v3.p1 = v5
    let v4: [[Double]] = v3.p0
    v8.p0 = v4
    let v16: [[Double]] = v3.p0
    let v12: [s0] = [v0, v0, v1, v3, v8, v3]
    let v20: [[Double]] = v8.p0
    let v13: [s0] = [v3, v1]
    let v22: [[Double]] = v3.p1
    var v23: [s0] = v13
    let v21: [[Double]] = v3.p0
    v1.p0 = v16
    v3.p1 = v22
    let v31: [[Double]] = v1.p0
    v23[1] = v8
    v23[1] = v0
    var v36: [[Double]] = v31
    v8.p1 = v22
    var v33: [s0] = v12
    let v58: s0 = v23[0]
    v8.p1 = v21
    v3 = v58
    var v60: s0 = v8
    v1.p1 = v36
    var v70: [s0] = v33
    let v83: [[Double]] = v60.p0
    v1.p0 = v83
    let v85: s0 = v70[2]
    v3.p1 = v20
    return v85
  }
  func f25(_ v0: s1) -> s1 {
    let v3: s1 = f55(v0)
    var v8: s1 = v0
    let v10: [s0] = v3.p1
    v8.p1 = v10
    v8.p1 = v10
    v8.p1 = v10
    let v17: s1 = f55(v8)
    return v17
  }
  func f2(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p1
    let v4: [[Double]] = v0.p1
    let v5: [Double] = v4[1]
    let v14: s0 = f40(v0)
    let v6: s0 = f40(v14)
    var v1: s0 = v0
    let v8: [[Double]] = v0.p1
    let v11: [[Double]] = v0.p0
    let v16: s0 = f40(v1)
    let v15: [[Double]] = v14.p1
    v1 = v14
    var v22: [[Double]] = v7
    let v21: [[Double]] = v14.p1
    v1.p1 = v8
    let v45: s0 = f40(v1)
    v22 = v15
    let v25: s0 = f40(v16)
    let v39: [[Double]] = v1.p0
    let v33: [[Double]] = v0.p0
    var v53: [[Double]] = v39
    v53[2] = v5
    let v42: s0 = f40(v25)
    let v68: s0 = f40(v42)
    var v37: s0 = v68
    let v80: [Double] = v33[0]
    let v51: [[Double]] = v1.p1
    v53[1] = v80
    v1.p0 = v33
    let v49: [[Double]] = v45.p0
    let v81: [[Double]] = v16.p1
    let v230: [[Double]] = v6.p1
    v22[0] = v5
    v1.p1 = v15
    v1.p0 = v33
    v1.p1 = v11
    v37.p0 = v22
    v37.p1 = v49
    v1.p0 = v53
    v37.p1 = v22
    v37.p0 = v81
    v1.p1 = v230
    v1.p0 = v51
    v37.p1 = v81
    var v108: [[Double]] = v21
    v37.p1 = v108
    let v106: s0 = f40(v37)
    v37.p0 = v4
    v37.p0 = v39
    return v106
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v4: s1 = v0.p0
    let v5: s1 = f25(v4)
    let v12: [s0] = v5.p1
    var v3: [s0] = v12
    let v18: s0 = v3[1]
    let v17: s0 = f2(v18)
    v3[0] = v17
    let v25: [[Double]] = v17.p0
    let v15: [[Double]] = v18.p1
    let v24: s0 = v12[0]
    let v30: s0 = s0(p0: v25, p1: v15)
    let v29: [Double] = v25[1]
    v3[2] = v24
    let v77: [[Double]] = v30.p0
    let v99: [Double] = v77[0]
    let v165: Double = v29[0]
    let v196: Double = v99[0]
    let v97: Double = v165 * v1
    var v154: Double = v97
    let v80: Double = v1 + v196
    let v173: Double = v80 / v154
    return v173
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])]], p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]))
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
