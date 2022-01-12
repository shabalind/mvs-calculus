  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: [[s1]]
  }
  struct s3 {
    var p0: s2
    var p1: [s0]
  }
  func f71(_ v0: [Double]) -> [Double] {
    let v6: Double = v0[0]
    var v7: Double = v6
    var v4: [Double] = v0
    v4[0] = v6
    let v1: Double = v4[0]
    let v10: Double = v4[0]
    v4[0] = v10
    var v8: [Double] = v4
    var v5: [Double] = v8
    let v2: [Double] = [v10, v10, v1, v1]
    let v9: Double = v7 * v1
    let v12: Double = v8[0]
    var v15: [Double] = v4
    let v16: Double = v5[0]
    let v24: Double = v2[0]
    let v22: Double = v2[2]
    let v36: Double = v2[1]
    var v21: [Double] = v0
    var v29: [Double] = v4
    v8[0] = v24
    v4[0] = v7
    let v46: Double = v21[0]
    let v26: [Double] = [v16, v36, v7, v46]
    let v54: Double = v26[3]
    v5[0] = v24
    v29[0] = v36
    v4[0] = v54
    v21[0] = v22
    var v53: Double = v54
    let v30: Double = v2[1]
    var v34: [Double] = v26
    var v55: [Double] = v26
    var v39: [Double] = v55
    let v49: Double = v4[0]
    v55[0] = v49
    let v76: Double = v15[0]
    let v40: Double = v30 * v22
    let v47: [[Double]] = [v2, v2, v34, v39, v55, v39]
    v8[0] = v40
    var v35: [Double] = v21
    v34[2] = v12
    let v59: [Double] = v47[5]
    var v92: [Double] = v29
    v8[0] = v53
    v35[0] = v53
    let v72: Double = v59[3]
    v92[0] = v72
    v4[0] = v9
    v92[0] = v76
    var v135: [Double] = v92
    v35 = v135
    v15[0] = v46
    return v35
  }
  func f49(_ v0: [Double]) -> [Double] {
    var v8: [Double] = v0
    var v2: [Double] = v0
    let v6: Double = v2[2]
    let v1: Double = v2[0]
    v2[1] = v6
    var v18: [Double] = v8
    var v15: Double = v1
    let v14: Double = v8[1]
    v8[0] = v14
    v8[2] = v15
    var v22: [Double] = v18
    var v17: [Double] = v22
    v17[2] = v1
    return v17
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v2: Double = v1
    let v4: [s0] = v0.p1
    let v7: Double = v1 * v1
    let v9: [Double] = [v2, v1, v7]
    let v6: [Double] = f49(v9)
    var v3: [Double] = v9
    let v14: s0 = v4[0]
    let v10: [[Double]] = v14.p0
    v3[0] = v2
    let v19: [Double] = v10[0]
    v3 = v6
    let v24: Double = v19[0]
    let v33: Double = v3[2]
    let v54: [Double] = f49(v3)
    var v57: [Double] = v19
    let v25: [Double] = f71(v57)
    v3[2] = v7
    let v175: [Double] = f71(v25)
    v57[0] = v33
    var v63: Double = v7
    let v60: Double = v54[2]
    let v120: Double = v24 / v60
    v57[0] = v63
    let v52: Double = v175[0]
    v3[2] = v7
    let v133: Double = v120 / v52
    return v133
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [s0(p0: [[0.0], [1.0]])], p1: [[s1(p0: [s0(p0: [[2.0], [3.0]])], p1: [s0(p0: [[4.0], [5.0]])])], [s1(p0: [s0(p0: [[6.0], [7.0]])], p1: [s0(p0: [[8.0], [9.0]])])], [s1(p0: [s0(p0: [[10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0]])])]]), p1: [s0(p0: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]])])
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
