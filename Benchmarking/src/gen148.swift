  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  func f11(_ v0: s0, _ v1: s0) -> s0 {
    let v10: [Double] = v1.p1
    let v8: [[Double]] = v1.p0
    var v16: [Double] = v10
    var v42: s0 = v0
    let v12: [[Double]] = v42.p0
    v42.p0 = v8
    let v47: s0 = s0(p0: v12, p1: v16)
    return v47
  }
  func f8(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v5: s0 = f11(v0, v0)
    var v7: s0 = v1
    let v3: s0 = f11(v7, v1)
    var v6: s0 = v1
    let v9: s0 = f11(v3, v0)
    var v8: s0 = v5
    let v16: [s0] = [v0, v3, v8, v3, v9, v7]
    let v12: [[Double]] = v1.p0
    let v4: s0 = f11(v8, v9)
    v1 = v3
    let v2: [Double] = v3.p1
    v1.p1 = v2
    let v11: s0 = f11(v0, v6)
    let v15: s0 = f11(v5, v6)
    var v18: [s0] = v16
    var v21: [[Double]] = v12
    let v13: [[Double]] = v5.p0
    let v10: s0 = f11(v11, v7)
    let v17: s0 = v16[5]
    var v23: [s0] = v16
    var v27: [[Double]] = v21
    v18[1] = v17
    let v14: [[Double]] = v0.p0
    let v22: [Double] = v10.p1
    let v19: Double = v2[1]
    v23[4] = v5
    v8.p1 = v22
    v23 = v18
    let v42: s0 = f11(v6, v4)
    let v40: s0 = f11(v9, v8)
    let v58: s0 = f11(v3, v0)
    let v52: s0 = s0(p0: v14, p1: v22)
    v23[2] = v58
    v18 = v23
    let v35: [Double] = v7.p1
    var v72: [s0] = v23
    var v46: [[Double]] = v27
    v7.p0 = v46
    let v82: s0 = f11(v6, v42)
    v6.p0 = v14
    v7.p1 = v35
    var v26: s0 = v7
    v72[0] = v26
    let v38: [[Double]] = v26.p0
    v6.p0 = v38
    let v39: s0 = f11(v8, v1)
    let v44: s0 = f11(v0, v52)
    let v65: s0 = f11(v15, v52)
    v23 = v16
    let v32: [[Double]] = v9.p0
    v23[5] = v7
    v18 = v16
    let v60: [[Double]] = v39.p0
    let v98: [Double] = v13[0]
    let v66: [[Double]] = v3.p0
    v27[0] = v98
    v8 = v40
    let v86: [Double] = v66[0]
    v8.p0 = v60
    v23[0] = v44
    v1.p0 = v14
    var v57: Double = v19
    let v92: [Double] = v4.p1
    v23[4] = v17
    v27[0] = v98
    let v96: [[Double]] = v39.p0
    v26.p0 = v96
    v8 = v65
    v27[0] = v86
    let v64: [Double] = v39.p1
    v8.p0 = v66
    var v205: [Double] = v98
    v27[0] = v205
    let v70: s0 = f11(v1, v11)
    let v147: [Double] = v6.p1
    v18[0] = v82
    v205[0] = v57
    v6.p1 = v64
    let v187: s0 = v72[2]
    let v284: [Double] = v70.p1
    v8.p1 = v284
    let v362: s0 = f11(v4, v187)
    v7.p1 = v147
    v6.p1 = v92
    v6.p0 = v32
    return v362
  }
  func f6(_ v0: s0, _ v1: s0) -> s0 {
    let v2: [[Double]] = v1.p0
    let v5: s0 = f8(v0)
    let v6: [Double] = v2[0]
    let v3: [Double] = v0.p1
    var v11: s0 = v1
    v11.p1 = v3
    let v12: s0 = f8(v11)
    let v8: s0 = f11(v5, v5)
    let v4: s0 = s0(p0: v2, p1: v3)
    let v9: [[Double]] = v4.p0
    let v13: s0 = s0(p0: v2, p1: v3)
    var v16: [[Double]] = v9
    v16[0] = v6
    let v17: s0 = f11(v4, v8)
    let v15: s0 = f8(v17)
    v16[0] = v6
    v11.p1 = v3
    let v42: s0 = f11(v15, v13)
    v11.p0 = v16
    let v32: s0 = f11(v12, v42)
    let v47: [[Double]] = v1.p0
    let v72: s0 = f11(v32, v17)
    let v86: s0 = f8(v72)
    var v104: [[Double]] = v47
    v11.p0 = v104
    let v126: s0 = f8(v86)
    let v114: s0 = f8(v126)
    return v114
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: s0 = f8(v0)
    var v6: s0 = v0
    let v4: [Double] = v0.p1
    let v2: s0 = f11(v6, v6)
    let v7: [[Double]] = v3.p0
    let v10: s0 = f11(v6, v0)
    var v18: s0 = v6
    var v8: [[Double]] = v7
    let v11: s0 = s0(p0: v8, p1: v4)
    let v23: [[Double]] = v3.p0
    let v15: [[Double]] = v2.p0
    var v19: s0 = v18
    let v12: s0 = f8(v2)
    let v17: [Double] = v8[0]
    v18.p1 = v4
    let v20: [Double] = v7[0]
    let v24: [Double] = v11.p1
    var v39: [[Double]] = v7
    let v21: [[Double]] = v12.p0
    let v31: [[Double]] = v18.p0
    let v41: [Double] = v39[0]
    let v29: s0 = f8(v19)
    var v33: [Double] = v20
    var v26: [[Double]] = v39
    let v30: Double = v33[0]
    v33[0] = v1
    var v32: [Double] = v24
    v32[1] = v30
    v19.p0 = v23
    let v46: [Double] = v21[0]
    v18.p0 = v15
    v6.p1 = v24
    v6.p1 = v32
    v18.p0 = v8
    let v99: [[Double]] = v10.p0
    let v59: s0 = f6(v3, v3)
    let v68: Double = v4[1]
    let v71: Double = v68 + v1
    let v53: s0 = f6(v2, v59)
    v33[0] = v71
    let v50: [Double] = v11.p1
    v18.p0 = v7
    var v63: [Double] = v17
    let v45: [Double] = v11.p1
    v6.p0 = v39
    v39[0] = v63
    v18.p0 = v23
    let v113: Double = v46[0]
    let v90: Double = v17[0]
    v6.p1 = v45
    v6.p0 = v31
    let v47: s0 = s0(p0: v99, p1: v45)
    let v137: s0 = f11(v53, v29)
    v26 = v99
    let v66: [[Double]] = v47.p0
    v18.p1 = v45
    let v92: s0 = f6(v137, v3)
    v33[0] = v90
    v6.p0 = v39
    let v139: [Double] = v92.p1
    v63 = v41
    let v143: [Double] = v26[0]
    v19.p0 = v8
    v8 = v66
    v6.p1 = v139
    v8[0] = v33
    v6.p1 = v45
    v19.p1 = v50
    v8[0] = v143
    return v113
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [1.0, 2.0])
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
