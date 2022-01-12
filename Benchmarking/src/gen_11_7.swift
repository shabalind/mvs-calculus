  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: [[s0]]
    var p1: s2
  }
  func f41(_ v0: s0, _ v1: [s0]) -> s0 {
    var v6: [s0] = v1
    let v7: s0 = v1[0]
    var v3: [s0] = v6
    let v15: s2 = s2(p0: v7, p1: v3)
    let v13: s0 = v6[2]
    v3[0] = v13
    let v30: [s0] = v15.p1
    var v45: [s0] = v30
    let v34: s0 = v3[1]
    v45[2] = v34
    let v37: s0 = v45[1]
    return v37
  }
  func f28(_ v0: s3) -> s3 {
    let v3: s2 = v0.p1
    var v7: s3 = v0
    var v5: s2 = v3
    let v1: [s2] = [v5, v3, v5, v5, v5, v3]
    v7.p1 = v5
    var v2: s2 = v3
    var v9: s2 = v2
    v7.p1 = v9
    var v8: [s2] = v1
    let v13: s0 = v5.p0
    let v17: s2 = v8[5]
    let v6: [[Double]] = v13.p1
    var v11: s3 = v0
    var v12: s3 = v11
    v9.p0 = v13
    let v44: s2 = v8[4]
    v8[4] = v44
    let v54: s0 = v17.p0
    var v34: s0 = v54
    v5.p0 = v34
    v2.p0 = v13
    let v31: [s0] = v3.p1
    let v28: s2 = v8[4]
    v5.p0 = v54
    v7 = v12
    let v79: s0 = f41(v54, v31)
    let v49: [Double] = v54.p0
    let v73: s2 = v12.p1
    v8[0] = v9
    var v126: [s0] = v31
    let v42: s2 = v7.p1
    v34.p0 = v49
    v11.p1 = v73
    v126[1] = v13
    let v146: [[Double]] = v79.p1
    v9.p1 = v126
    v12.p1 = v9
    v7.p1 = v28
    let v105: [s0] = v42.p1
    v8[2] = v42
    v34.p1 = v146
    v2.p1 = v105
    v34.p1 = v6
    return v12
  }
  func f25(_ v0: [s0]) -> [s0] {
    return v0
  }
  func f17(_ v0: s3) -> s3 {
    let v6: s3 = f28(v0)
    var v5: s3 = v0
    var v7: s3 = v6
    let v2: s2 = v6.p1
    v7.p1 = v2
    let v4: [[s0]] = v5.p0
    let v9: [[s0]] = v7.p0
    v5.p0 = v9
    let v12: [s0] = v9[2]
    var v21: s2 = v2
    let v30: s0 = v12[0]
    let v29: [s0] = v2.p1
    v5.p0 = v4
    let v24: [s0] = f25(v12)
    v7.p1 = v2
    var v35: [s0] = v29
    let v23: [[s0]] = v6.p0
    let v19: s3 = s3(p0: v23, p1: v21)
    let v27: s0 = v35[2]
    let v53: s0 = v24[0]
    let v32: s3 = f28(v19)
    var v80: [s0] = v29
    let v95: s0 = v12[0]
    var v58: [[s0]] = v4
    let v87: s0 = f41(v95, v29)
    let v42: s2 = v19.p1
    let v142: [s0] = v42.p1
    let v68: s1 = s1(p0: v58, p1: v87)
    let v79: [[s0]] = v68.p0
    v21.p1 = v29
    v21.p1 = v80
    var v110: [[s0]] = v79
    v35[0] = v30
    v21.p0 = v53
    v80[0] = v27
    v21.p1 = v142
    v7.p0 = v110
    return v32
  }
  func f4(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    var v2: [[Double]] = v4
    let v6: [Double] = v4[2]
    v2[0] = v6
    v2[0] = v6
    var v32: [[Double]] = v4
    let v12: [[[Double]]] = [v32, v4, v2, v4]
    let v9: [Double] = v2[2]
    let v14: [[Double]] = v12[1]
    v32[1] = v6
    var v34: s0 = v0
    let v45: [Double] = v34.p0
    v32[2] = v9
    let v39: s0 = s0(p0: v45, p1: v14)
    v34.p1 = v4
    return v39
  }
  func f1(_ v0: s2) -> s2 {
    var v3: s2 = v0
    var v2: s2 = v3
    var v4: s2 = v0
    var v5: s2 = v4
    let v6: s0 = v5.p0
    let v1: s0 = v5.p0
    var v7: s2 = v0
    v2.p0 = v1
    var v13: s0 = v6
    let v9: [Double] = v13.p0
    let v14: s0 = f4(v6)
    var v8: s2 = v5
    let v12: [s0] = v0.p1
    v3.p1 = v12
    v3.p0 = v6
    v7.p1 = v12
    v13.p0 = v9
    var v15: s2 = v2
    let v24: s0 = v12[0]
    v8 = v3
    let v20: s0 = v12[1]
    v4.p1 = v12
    let v31: s0 = f41(v24, v12)
    let v16: s0 = v12[1]
    let v30: s0 = f4(v20)
    let v23: [[Double]] = v20.p1
    var v27: [s0] = v12
    v27[0] = v20
    var v81: s0 = v13
    v27[2] = v31
    v5.p0 = v16
    v27[1] = v81
    var v57: [s0] = v12
    let v33: s0 = f41(v24, v57)
    let v67: [s0] = v7.p1
    v27[1] = v16
    let v42: s0 = v15.p0
    v3.p1 = v12
    v27[1] = v42
    v81.p1 = v23
    v57[2] = v1
    let v95: s0 = v67[2]
    v57[2] = v1
    v57[0] = v95
    let v83: [Double] = v13.p0
    let v103: s0 = v8.p0
    let v72: s0 = f4(v30)
    v5.p1 = v12
    let v64: s2 = s2(p0: v33, p1: v27)
    let v77: s0 = f41(v30, v57)
    v8.p0 = v72
    v27[1] = v103
    v13.p0 = v83
    v7.p0 = v77
    v27[1] = v14
    return v64
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v4: s3 = v0
    let v3: s2 = v4.p1
    let v6: s3 = f28(v0)
    let v5: s3 = f17(v0)
    let v15: s0 = v3.p0
    let v14: s2 = v6.p1
    let v12: s0 = f4(v15)
    let v23: s2 = f1(v14)
    v4.p1 = v23
    let v27: [[s0]] = v5.p0
    let v21: [Double] = v12.p0
    v4.p0 = v27
    let v73: [[Double]] = [v21, v21, v21, v21, v21, v21]
    let v139: [Double] = v73[4]
    v4 = v6
    let v140: Double = v139[0]
    let v253: Double = v1 * v140
    return v253
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s0(p0: [0.0, 1.0], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [5.0, 6.0], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [10.0, 11.0], p1: [[12.0], [13.0], [14.0]])]], p1: s2(p0: s0(p0: [15.0, 16.0], p1: [[17.0], [18.0], [19.0]]), p1: [s0(p0: [20.0, 21.0], p1: [[22.0], [23.0], [24.0]]), s0(p0: [25.0, 26.0], p1: [[27.0], [28.0], [29.0]]), s0(p0: [30.0, 31.0], p1: [[32.0], [33.0], [34.0]])]))
    let v1: Double = 35.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 35.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
