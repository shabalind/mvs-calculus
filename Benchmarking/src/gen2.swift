  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  func f80(_ v0: s0) -> s0 {
    let v5: [Double] = v0.p0
    let v2: [[Double]] = v0.p1
    let v3: [Double] = v0.p0
    var v11: s0 = v0
    let v1: [[[Double]]] = [v2, v2, v2, v2, v2, v2]
    var v10: [[[Double]]] = v1
    v10[5] = v2
    var v12: [[[Double]]] = v1
    let v17: [[Double]] = v11.p1
    v11.p0 = v3
    let v19: [[Double]] = v0.p1
    v11.p1 = v2
    let v42: s0 = s0(p0: v3, p1: v17)
    let v14: [Double] = v11.p0
    let v16: [[Double]] = v0.p1
    var v45: [[[Double]]] = v10
    v12[0] = v16
    let v23: [Double] = v11.p0
    let v26: [[Double]] = v45[5]
    v11.p1 = v17
    v11.p0 = v5
    v10 = v45
    v45 = v1
    let v24: [[Double]] = v12[2]
    v12[4] = v2
    v10[2] = v16
    v11.p0 = v3
    v12[0] = v2
    v12[0] = v17
    let v35: [Double] = v42.p0
    let v43: [[Double]] = v45[4]
    v11.p0 = v23
    let v41: [[Double]] = v11.p1
    let v50: [[Double]] = v42.p1
    v11.p0 = v5
    var v74: [[Double]] = v17
    var v32: s0 = v42
    v11.p0 = v23
    let v34: s0 = s0(p0: v35, p1: v74)
    let v48: [[Double]] = v11.p1
    v11.p1 = v50
    v10[5] = v43
    v11.p1 = v41
    v32.p1 = v19
    let v37: [s0] = [v11, v42, v34, v34, v34, v0, v0]
    v32.p0 = v14
    v10[4] = v26
    let v47: [[Double]] = v32.p1
    v45[3] = v47
    let v85: s0 = v37[3]
    let v55: [Double] = v85.p0
    var v76: [s0] = v37
    let v49: [[Double]] = v42.p1
    v11.p0 = v55
    v32.p1 = v24
    var v160: [s0] = v76
    v11.p1 = v49
    v11.p1 = v48
    let v150: s0 = v160[4]
    let v62: [Double] = v150.p0
    v11.p1 = v26
    v76[6] = v11
    let v177: s0 = s0(p0: v62, p1: v26)
    return v177
  }
  func f79(_ v0: s1, _ v1: s0) -> s1 {
    var v3: s1 = v0
    var v2: s1 = v3
    let v7: [[s0]] = v3.p0
    let v21: [s0] = [v1, v1]
    let v11: s0 = f80(v1)
    let v18: s0 = v21[1]
    var v10: s1 = v0
    let v14: [[s0]] = v0.p0
    let v17: s0 = f80(v11)
    let v12: s0 = f80(v17)
    v3 = v10
    v3.p0 = v14
    var v20: [s0] = v21
    v3.p1 = v18
    v20[1] = v1
    v2.p0 = v7
    let v38: [[s0]] = v10.p0
    let v44: s0 = f80(v12)
    v20[1] = v17
    v2.p0 = v38
    v2.p0 = v14
    let v53: s0 = f80(v44)
    v20[0] = v17
    v10.p0 = v14
    let v106: s0 = v20[1]
    v10.p1 = v106
    let v133: s0 = f80(v18)
    v2.p1 = v133
    v20[1] = v53
    v20[1] = v1
    return v2
  }
  func f66(_ v0: [s0]) -> [s0] {
    let v6: s0 = v0[0]
    let v1: s0 = f80(v6)
    var v3: [s0] = v0
    let v5: s0 = v3[0]
    let v11: [[s0]] = [v0]
    v3[0] = v6
    v3[0] = v6
    let v7: s0 = v3[0]
    let v9: s0 = f80(v1)
    let v17: [[Double]] = v9.p1
    let v24: [Double] = v9.p0
    let v31: s0 = f80(v5)
    let v20: [s0] = v11[0]
    v3[0] = v7
    let v18: s0 = s0(p0: v24, p1: v17)
    var v33: [s0] = v20
    let v68: s0 = f80(v6)
    v33[0] = v18
    v3[0] = v31
    v33[0] = v31
    v3[0] = v9
    v33[0] = v68
    v3[0] = v6
    return v33
  }
  func f65(_ v0: s1, _ v1: [s1]) -> s1 {
    let v7: s1 = v1[0]
    let v2: s1 = v1[0]
    var v9: s1 = v7
    let v13: [[s0]] = v2.p0
    var v15: [[s0]] = v13
    var v20: [[s0]] = v15
    var v19: s1 = v7
    v19.p0 = v20
    let v39: [[s0]] = v9.p0
    let v30: [s0] = v13[0]
    let v38: [s0] = v39[2]
    let v56: s0 = v7.p1
    let v18: [s0] = v39[2]
    let v33: [s0] = f66(v18)
    let v29: s0 = v30[0]
    v15[0] = v33
    var v27: [[s0]] = v15
    v27[2] = v38
    let v28: [s0] = [v29, v56, v29, v29]
    let v86: s0 = v28[0]
    let v26: s0 = v19.p1
    v19.p0 = v20
    v19.p0 = v27
    var v88: [[s0]] = v15
    v9.p1 = v86
    let v98: [s0] = f66(v33)
    let v59: s1 = s1(p0: v88, p1: v26)
    let v72: s0 = v18[0]
    v88[0] = v98
    let v69: s1 = f79(v59, v72)
    return v69
  }
  func f54(_ v0: s1, _ v1: Double, _ v2: Double) -> Double {
    return v2
  }
  func f27(_ v0: Double) -> Double {
    let v7: [Double] = [v0, v0, v0, v0, v0, v0, v0]
    var v6: [Double] = v7
    let v9: [Double] = [v0, v0, v0, v0, v0]
    var v8: [Double] = v9
    let v1: Double = v8[4]
    let v5: Double = v6[3]
    let v12: Double = v6[5]
    v6[2] = v0
    let v10: Double = v5 * v12
    v6[4] = v10
    v8[1] = v0
    v6[3] = v1
    return v10
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s1, _ v2: Double) -> Double {
    let v7: s0 = v1.p1
    let v6: Double = f54(v1, v2, v2)
    var v9: [s1] = v0
    var v4: Double = v6
    v9[0] = v1
    var v34: Double = v2
    var v17: Double = v34
    let v53: s1 = f65(v1, v9)
    let v19: s1 = f65(v1, v0)
    let v16: [[Double]] = v7.p1
    var v38: [[Double]] = v16
    v17 = v34
    var v57: [s1] = v0
    let v69: s1 = f65(v19, v57)
    v57[0] = v69
    let v81: [Double] = v38[0]
    let v54: Double = f27(v4)
    let v146: Double = v17 / v54
    let v77: Double = v81[0]
    let v106: Double = v77 + v34
    let v88: Double = f54(v53, v146, v34)
    v9[0] = v69
    v4 = v6
    let v177: [Double] = [v6, v88, v106, v77, v106]
    let v279: Double = v177[3]
    return v279
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: [0.0, 1.0], p1: [[2.0], [3.0]])], [s0(p0: [4.0, 5.0], p1: [[6.0], [7.0]])], [s0(p0: [8.0, 9.0], p1: [[10.0], [11.0]])]], p1: s0(p0: [12.0, 13.0], p1: [[14.0], [15.0]]))]
    let v1: s1 = s1(p0: [[s0(p0: [16.0, 17.0], p1: [[18.0], [19.0]])], [s0(p0: [20.0, 21.0], p1: [[22.0], [23.0]])], [s0(p0: [24.0, 25.0], p1: [[26.0], [27.0]])]], p1: s0(p0: [28.0, 29.0], p1: [[30.0], [31.0]]))
    let v2: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
