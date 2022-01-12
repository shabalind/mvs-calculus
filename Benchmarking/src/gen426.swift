  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  func f90(_ v0: s0) -> s0 {
    var v6: s0 = v0
    var v1: s0 = v0
    let v4: [[Double]] = v6.p0
    let v2: [[Double]] = v1.p0
    var v3: [[Double]] = v2
    v1.p0 = v3
    v6.p0 = v4
    let v11: [[Double]] = v0.p0
    v1.p0 = v2
    v6.p0 = v2
    let v39: [[Double]] = v6.p0
    v1 = v6
    let v29: [[Double]] = v1.p0
    v1.p0 = v11
    let v35: [[Double]] = v6.p0
    var v43: s0 = v1
    var v30: s0 = v43
    let v47: [s0] = [v30, v30, v43, v6, v0, v43, v43]
    let v66: s0 = v47[2]
    let v61: s0 = v47[0]
    v6.p0 = v4
    var v46: [s0] = v47
    var v70: [s0] = v46
    let v60: [[Double]] = v66.p0
    v6.p0 = v29
    let v63: s0 = v70[4]
    v6 = v30
    var v52: s0 = v43
    let v62: [[Double]] = v52.p0
    v30.p0 = v4
    let v201: [[Double]] = v1.p0
    v30.p0 = v62
    let v128: [[Double]] = v63.p0
    v52.p0 = v39
    var v99: s0 = v61
    v99.p0 = v60
    v6.p0 = v201
    v43.p0 = v35
    v1.p0 = v128
    return v99
  }
  func f53(_ v0: [s0]) -> [s0] {
    let v5: [[s0]] = [v0, v0, v0, v0, v0, v0]
    let v3: [[[s0]]] = [v5]
    let v7: s0 = v0[0]
    let v2: s0 = v0[1]
    let v9: s0 = f90(v7)
    let v8: s0 = v0[1]
    var v6: [s0] = v0
    v6[1] = v9
    var v17: [s0] = v0
    let v10: [[s0]] = v3[0]
    let v20: [s0] = v10[2]
    v6[0] = v8
    var v24: [s0] = v20
    v24[1] = v2
    var v32: [s0] = v20
    let v33: s0 = v6[1]
    let v40: [[s0]] = [v24, v0, v32, v20]
    let v79: s0 = v17[1]
    var v51: [[s0]] = v40
    let v41: [s0] = v51[3]
    v32[0] = v33
    v24[1] = v79
    return v41
  }
  func f49(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v8: s0 = f90(v0)
    let v18: s0 = f90(v0)
    let v12: s0 = f90(v8)
    let v67: s0 = f90(v18)
    var v45: s0 = v12
    let v81: s0 = f90(v45)
    v45.p0 = v6
    let v87: [[Double]] = v81.p0
    v45.p0 = v87
    v45 = v67
    return v45
  }
  func f18(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v1: [[Double]] = v5.p0
    let v4: [[Double]] = v0.p0
    let v6: [[Double]] = v0.p0
    v5.p0 = v1
    let v12: s0 = f49(v0)
    let v7: [Double] = v6[0]
    let v9: [Double] = v1[0]
    let v13: s0 = f90(v0)
    var v11: [[Double]] = v6
    let v8: [[Double]] = v13.p0
    v5 = v12
    let v15: [[Double]] = v13.p0
    let v10: [[Double]] = v13.p0
    v5.p0 = v4
    v5.p0 = v11
    let v23: [[Double]] = v13.p0
    let v30: s0 = s0(p0: v15)
    v11[0] = v9
    let v29: [Double] = v6[0]
    var v24: [[Double]] = v8
    var v39: [[Double]] = v8
    let v16: [Double] = v1[0]
    let v38: [[[Double]]] = [v24, v8, v11, v4, v11, v10]
    v24[0] = v9
    let v48: [[Double]] = v30.p0
    let v27: [[Double]] = v5.p0
    let v73: [Double] = v11[0]
    v24[0] = v29
    v11[0] = v73
    v5.p0 = v39
    var v41: [[[Double]]] = v38
    var v43: [[Double]] = v23
    var v63: [[Double]] = v43
    let v53: [[Double]] = [v16, v29, v9, v73, v73, v7]
    v41 = v38
    var v67: [[Double]] = v53
    let v70: [Double] = v67[5]
    var v113: [[Double]] = v27
    let v110: [Double] = v63[0]
    v113[0] = v29
    let v85: s0 = f90(v0)
    v24[0] = v110
    var v111: [[Double]] = v67
    v43[0] = v73
    v43[0] = v7
    v41[5] = v113
    let v211: [[Double]] = v41[4]
    var v112: [Double] = v16
    let v248: [[Double]] = v85.p0
    v111[3] = v70
    v41[3] = v48
    v43[0] = v7
    let v88: s0 = s0(p0: v211)
    v111 = v53
    let v170: [Double] = v111[2]
    v111[2] = v112
    v24 = v248
    v11[0] = v170
    return v88
  }
  func f5(_ v0: [s0]) -> [s0] {
    let v3: [s0] = f53(v0)
    let v4: [s0] = f53(v0)
    let v5: s0 = v3[0]
    var v15: [s0] = v0
    var v20: [s0] = v15
    let v18: s0 = f18(v5)
    var v13: [s0] = v20
    let v42: s0 = f18(v18)
    let v35: [[s0]] = [v0, v3, v20, v13, v0]
    let v29: [s0] = v35[3]
    let v51: s0 = f49(v18)
    let v44: s0 = v4[1]
    v20[0] = v44
    v13[1] = v42
    v15[0] = v51
    return v29
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s2, _ v2: Double) -> Double {
    var v3: Double = v2
    let v6: Double = v3 / v3
    var v5: [s0] = v0
    var v4: Double = v6
    let v9: s0 = v5[1]
    let v10: [s0] = f5(v0)
    let v7: s1 = v1.p0
    v5[0] = v9
    let v12: s3 = s3(p0: v7, p1: v9)
    let v18: s0 = v12.p1
    v5[1] = v9
    let v16: [[Double]] = v18.p0
    v3 = v4
    let v69: s0 = v10[0]
    let v61: s0 = f90(v69)
    let v46: [Double] = v16[0]
    v5[1] = v18
    let v43: [Double] = v16[0]
    let v45: Double = v46[0]
    var v59: [Double] = v43
    let v37: Double = v59[0]
    v5[1] = v61
    var v109: Double = v3
    v109 = v37
    v3 = v4
    let v152: Double = v3 + v45
    let v179: Double = v109 + v152
    return v179
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]]), s0(p0: [[1.0]])]
    let v1: s2 = s2(p0: s1(p0: [s0(p0: [[2.0]]), s0(p0: [[3.0]]), s0(p0: [[4.0]])], p1: [[s0(p0: [[5.0]])], [s0(p0: [[6.0]])], [s0(p0: [[7.0]])]]))
    let v2: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
