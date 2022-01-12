  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  func f67(_ v0: s2) -> s2 {
    let v5: s1 = v0.p0
    let v2: [s2] = [v0, v0, v0, v0, v0, v0]
    let v7: [s0] = v5.p1
    let v4: s0 = v7[0]
    let v8: s0 = v5.p0
    var v1: s1 = v5
    var v3: [s0] = v7
    let v11: s0 = v3[0]
    v3[0] = v8
    var v10: [s2] = v2
    var v17: s0 = v4
    v3[0] = v17
    v1.p0 = v11
    let v19: s1 = v0.p1
    let v23: s2 = v10[1]
    let v27: s2 = s2(p0: v19, p1: v1)
    v10[1] = v27
    return v23
  }
  func f62(_ v0: s2) -> s2 {
    var v4: s2 = v0
    var v7: s2 = v0
    var v9: s2 = v0
    var v11: s2 = v7
    let v2: s2 = f67(v4)
    var v6: s2 = v7
    var v3: s2 = v9
    let v13: s2 = f67(v0)
    var v5: s2 = v11
    let v23: s1 = v13.p0
    let v15: s2 = f67(v6)
    v11.p0 = v23
    var v1: s1 = v23
    let v21: s1 = v15.p0
    let v38: s2 = f67(v6)
    v3.p1 = v21
    v6.p0 = v1
    v6 = v3
    let v44: s1 = v5.p0
    let v91: s2 = f67(v2)
    let v112: s1 = v91.p1
    let v110: s1 = v91.p0
    let v249: [s2] = [v38]
    let v82: [s0] = v112.p1
    let v114: s1 = v0.p1
    let v102: [[s2]] = [v249, v249, v249, v249, v249, v249]
    let v68: [s1] = [v44, v114, v44]
    let v85: s1 = v68[1]
    let v106: s1 = v91.p1
    v9.p0 = v110
    let v59: [s2] = v102[3]
    v11.p0 = v21
    v1.p1 = v82
    v11.p1 = v85
    v3.p1 = v44
    let v201: s2 = v59[0]
    let v126: s2 = f67(v201)
    v11.p0 = v106
    return v126
  }
  func f52(_ v0: s0) -> s0 {
    return v0
  }
  func f48(_ v0: s1) -> s1 {
    let v4: [s1] = [v0, v0]
    let v1: s0 = v0.p0
    let v2: s0 = f52(v1)
    let v8: [[s1]] = [v4, v4, v4]
    let v6: s0 = f52(v2)
    var v24: [[s1]] = v8
    let v19: [s1] = v24[2]
    let v14: [s1] = v8[2]
    let v43: [s0] = v0.p1
    var v39: s1 = v0
    var v26: s1 = v39
    v39.p0 = v6
    v24[1] = v14
    var v61: [s1] = v19
    let v76: s1 = v61[0]
    let v38: s1 = v61[0]
    v39.p1 = v43
    var v62: [s0] = v43
    v39.p1 = v62
    v26.p1 = v43
    let v247: s0 = v39.p0
    v39.p0 = v247
    v61[0] = v26
    v61[0] = v76
    return v38
  }
  func f47(_ v0: s2) -> s2 {
    let v8: s1 = v0.p1
    let v4: s1 = f48(v8)
    var v5: s1 = v4
    var v9: s2 = v0
    var v6: s2 = v9
    v9.p1 = v5
    let v12: s2 = f67(v6)
    v6.p0 = v5
    return v12
  }
  func f45(_ v0: s1) -> s1 {
    var v2: s1 = v0
    var v4: s1 = v2
    var v5: s1 = v4
    return v5
  }
  func f40(_ v0: s1, _ v1: s2) -> s1 {
    let v2: [s0] = v0.p1
    let v9: s0 = v2[0]
    var v16: [s0] = v2
    v16[0] = v9
    let v20: s1 = s1(p0: v9, p1: v16)
    let v51: s1 = f45(v20)
    return v51
  }
  func f27(_ v0: s2) -> s2 {
    var v3: s2 = v0
    v3 = v0
    var v6: s2 = v0
    var v5: s2 = v3
    var v2: s2 = v3
    let v9: s1 = v6.p1
    v3.p0 = v9
    let v7: s2 = f67(v5)
    v6.p1 = v9
    let v15: s1 = v6.p0
    v2.p1 = v9
    var v4: s2 = v0
    var v10: s2 = v0
    let v8: s1 = v5.p0
    var v17: s1 = v9
    v6 = v5
    v5.p1 = v17
    let v28: s1 = f40(v8, v5)
    let v21: s1 = v4.p1
    var v18: s2 = v7
    var v30: s2 = v2
    let v19: s1 = f48(v8)
    let v37: s1 = f40(v19, v30)
    let v27: s1 = f48(v28)
    v5 = v7
    let v51: s1 = f40(v9, v10)
    let v59: s1 = f48(v27)
    let v34: s1 = f40(v51, v18)
    v2.p0 = v59
    v4.p1 = v17
    v2.p1 = v17
    let v87: s1 = f48(v19)
    var v35: s2 = v10
    v3.p1 = v87
    v2.p0 = v21
    let v54: s1 = f48(v17)
    v6.p0 = v51
    v18.p0 = v17
    v10.p1 = v15
    v5.p0 = v21
    let v109: s1 = f48(v54)
    v2 = v3
    v4.p1 = v17
    v35.p0 = v34
    v18.p0 = v27
    v35.p1 = v17
    v30.p0 = v51
    let v205: s1 = f48(v109)
    v6.p0 = v37
    v2.p0 = v205
    return v35
  }
  func f21(_ v0: s2) -> s2 {
    var v7: s2 = v0
    let v6: s2 = f27(v0)
    let v2: s1 = v0.p0
    let v13: s2 = f47(v7)
    var v1: s1 = v2
    let v5: s1 = v13.p0
    let v12: s0 = v2.p0
    let v15: s0 = v1.p0
    let v10: s0 = f52(v15)
    let v23: s2 = f67(v7)
    var v32: s0 = v12
    v32 = v12
    v32 = v15
    var v14: s1 = v5
    let v11: s2 = f27(v6)
    v32 = v10
    let v17: [s0] = v14.p1
    let v46: s1 = s1(p0: v15, p1: v17)
    var v31: s1 = v14
    v31 = v5
    v7.p1 = v46
    let v27: s2 = f62(v0)
    v31.p0 = v32
    let v26: s2 = f67(v27)
    v7.p0 = v31
    var v71: s0 = v15
    var v48: s2 = v26
    let v70: [s2] = [v6, v11, v48, v23]
    let v68: s2 = v70[3]
    v14.p1 = v17
    var v95: s2 = v68
    v95.p1 = v5
    v31.p0 = v71
    return v95
  }
  func f10(_ v0: s1) -> s1 {
    let v1: s1 = f45(v0)
    let v2: s1 = f45(v0)
    var v6: s1 = v0
    let v7: s1 = f45(v1)
    var v3: s1 = v2
    let v19: s0 = v7.p0
    var v12: s1 = v3
    v3 = v6
    let v43: s0 = v0.p0
    v6.p0 = v19
    v12.p0 = v43
    return v12
  }
  func f5(_ v0: s1) -> s1 {
    let v4: [s0] = v0.p1
    let v5: s2 = s2(p0: v0, p1: v0)
    let v3: s2 = f21(v5)
    let v13: s1 = v5.p1
    let v30: s1 = v3.p0
    let v14: s2 = f62(v5)
    let v23: s2 = s2(p0: v0, p1: v13)
    let v19: s2 = f62(v23)
    let v26: [s0] = v0.p1
    let v17: s0 = v26[0]
    let v38: s2 = f67(v23)
    let v87: s1 = v5.p1
    var v27: s2 = v19
    let v33: s2 = f21(v14)
    v27.p1 = v30
    var v50: s1 = v87
    let v59: s1 = v33.p0
    let v61: s1 = f45(v50)
    v50.p1 = v4
    let v46: s1 = f40(v50, v38)
    v27.p1 = v61
    let v83: s1 = v14.p0
    let v116: s1 = f40(v83, v3)
    v27.p0 = v46
    v50.p0 = v17
    let v45: s1 = f40(v59, v27)
    v27.p1 = v116
    let v101: s1 = v19.p0
    v50 = v101
    return v45
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v5: s0 = v0.p0
    let v4: s1 = f5(v0)
    var v7: s0 = v5
    let v10: [[Double]] = v7.p0
    let v9: [Double] = v10[0]
    let v6: [[Double]] = v5.p0
    let v20: Double = v9[0]
    let v11: s1 = f10(v4)
    var v12: s0 = v7
    var v27: [[Double]] = v10
    let v15: [Double] = v27[0]
    v7.p0 = v27
    v7.p0 = v10
    v27 = v6
    let v22: Double = v15[0]
    v27[0] = v15
    var v16: Double = v20
    let v35: Double = v15[0]
    let v23: s1 = f10(v11)
    let v26: [Double] = [v35, v35, v22, v22, v16, v35]
    let v30: [Double] = v10[0]
    let v24: [[Double]] = v12.p1
    let v95: Double = v30[0]
    let v46: [Double] = v27[0]
    v27[0] = v46
    let v59: [Double] = v24[1]
    let v84: Double = v15[0]
    let v66: Double = v26[4]
    let v176: s0 = v23.p0
    let v141: [[Double]] = v176.p1
    v12.p1 = v141
    v12.p1 = v141
    v16 = v84
    v27[0] = v59
    v16 = v95
    return v66
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [s0(p0: [[3.0]], p1: [[4.0], [5.0]])])
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
