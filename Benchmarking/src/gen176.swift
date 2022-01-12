  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  func f108(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    var v6: s0 = v0
    v6.p0 = v2
    var v1: s0 = v0
    var v5: s0 = v6
    let v3: [[Double]] = v1.p2
    let v7: [[Double]] = v1.p2
    let v12: [[Double]] = v6.p0
    let v13: [[Double]] = v0.p1
    let v9: s0 = s0(p0: v12, p1: v7, p2: v3)
    v5.p2 = v13
    v1.p2 = v7
    v1.p1 = v7
    var v18: s0 = v1
    let v38: [[Double]] = v0.p0
    let v16: [[Double]] = v1.p1
    var v17: [[Double]] = v7
    let v31: [[Double]] = v9.p1
    let v25: [[Double]] = v18.p0
    let v37: [[Double]] = v18.p0
    v6.p2 = v7
    v18.p2 = v16
    v6.p2 = v3
    v6.p0 = v37
    let v58: [[Double]] = v6.p0
    v1.p0 = v25
    v6.p2 = v17
    let v32: s1 = s1(p0: v9, p1: v18)
    v6.p0 = v38
    v6 = v5
    v1.p0 = v58
    v6.p1 = v31
    var v125: s1 = v32
    var v151: s1 = v125
    let v99: s0 = v151.p0
    return v99
  }
  func f102(_ v0: s2) -> s2 {
    var v2: s2 = v0
    v2 = v0
    var v6: s2 = v2
    let v4: s1 = v6.p0
    var v8: s2 = v0
    v8.p0 = v4
    let v7: s0 = v4.p0
    let v5: s0 = f108(v7)
    let v11: [[Double]] = v5.p1
    var v10: s0 = v7
    v2 = v8
    var v20: s1 = v4
    v10.p1 = v11
    let v18: s0 = f108(v5)
    v8.p0 = v20
    let v34: s0 = f108(v18)
    v6.p1 = v10
    let v37: s2 = s2(p0: v20, p1: v5)
    v20.p1 = v10
    v2.p1 = v10
    v2.p0 = v20
    v20.p0 = v34
    return v37
  }
  func f100(_ v0: s1, _ v1: s0) -> s0 {
    var v9: s1 = v0
    let v21: s0 = v0.p0
    var v4: s1 = v9
    v4.p0 = v21
    v4 = v0
    let v12: s0 = v4.p0
    return v12
  }
  func f97(_ v0: s0) -> s0 {
    let v6: s0 = f108(v0)
    let v3: s0 = f108(v6)
    let v12: s0 = f108(v3)
    let v29: [[Double]] = v6.p0
    let v17: s0 = f108(v12)
    var v31: s0 = v17
    v31.p0 = v29
    let v83: s0 = f108(v31)
    return v83
  }
  func f86(_ v0: s1) -> s1 {
    var v3: s1 = v0
    let v2: s0 = v3.p1
    let v5: s0 = f108(v2)
    let v1: s0 = f108(v5)
    let v11: s0 = f100(v0, v5)
    let v42: s0 = f97(v11)
    let v54: s0 = f97(v1)
    var v35: s1 = v3
    let v41: s0 = v35.p1
    v3.p0 = v54
    v35.p0 = v41
    let v108: s0 = v35.p0
    let v58: s0 = f100(v0, v2)
    let v33: s0 = f108(v42)
    v3.p1 = v108
    v3.p1 = v33
    let v100: s0 = f108(v58)
    v3 = v35
    v3.p0 = v5
    let v117: s0 = f108(v33)
    v35 = v3
    let v140: s1 = s1(p0: v100, p1: v58)
    v3.p0 = v117
    return v140
  }
  func f48(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v12: s0 = v1
    return v12
  }
  func f41(_ v0: s0) -> s0 {
    let v2: s0 = f48(v0)
    let v1: s0 = f48(v0)
    let v3: s0 = f108(v2)
    var v10: s0 = v2
    let v13: [[Double]] = v1.p1
    let v14: [[Double]] = v1.p0
    let v25: [[Double]] = v10.p0
    var v16: [[Double]] = v13
    let v42: s0 = s0(p0: v25, p1: v16, p2: v13)
    let v109: [Double] = v25[0]
    v10.p2 = v13
    let v43: [[Double]] = v0.p0
    let v27: [[Double]] = v0.p2
    v10.p1 = v27
    let v38: [[Double]] = v42.p1
    let v71: [Double] = v16[0]
    v10.p0 = v43
    let v121: [Double] = v25[0]
    let v99: [[Double]] = v3.p2
    v16[0] = v109
    v16 = v99
    let v63: [Double] = v14[0]
    v16 = v99
    v16[0] = v71
    v16[0] = v121
    let v98: s0 = s0(p0: v14, p1: v13, p2: v38)
    var v92: s0 = v98
    v16[0] = v63
    v92.p0 = v25
    return v92
  }
  func f29(_ v0: [s1], _ v1: s2) -> s2 {
    let v6: s0 = v1.p1
    let v3: [[Double]] = v6.p2
    var v7: s0 = v6
    var v10: [[Double]] = v3
    let v2: s1 = v0[0]
    var v12: s0 = v7
    let v8: [Double] = v3[0]
    v12 = v6
    v7.p1 = v3
    let v4: s0 = v2.p0
    let v13: [Double] = v10[0]
    v10[0] = v13
    var v14: [[Double]] = v10
    var v33: [[Double]] = v3
    v33[0] = v8
    let v19: s0 = f108(v12)
    let v23: s0 = f97(v19)
    let v26: [[Double]] = v6.p2
    let v39: [Double] = v10[0]
    var v36: s0 = v23
    let v35: s2 = f102(v1)
    v36.p2 = v26
    v10[0] = v8
    v33[0] = v39
    v36.p2 = v14
    let v38: s1 = v35.p0
    v12.p1 = v33
    let v59: [Double] = v10[0]
    let v52: [[Double]] = v4.p0
    var v91: [[Double]] = v3
    let v29: Double = v59[0]
    let v48: [[[Double]]] = [v14, v3, v33, v26]
    let v79: Double = v59[0]
    v7.p0 = v52
    let v98: [Double] = v14[0]
    v7.p2 = v10
    var v43: [[[Double]]] = v48
    let v61: [[Double]] = v4.p0
    v36.p0 = v61
    v10[0] = v13
    var v71: [[[Double]]] = v43
    var v72: [Double] = v8
    v43[3] = v91
    let v90: s2 = s2(p0: v38, p1: v36)
    var v193: [Double] = v59
    let v83: Double = v29 + v79
    v14[0] = v193
    v193[0] = v83
    v10[0] = v72
    let v97: [[Double]] = v43[2]
    let v104: [[Double]] = v71[0]
    v12.p1 = v10
    let v148: [[Double]] = v43[3]
    v14[0] = v98
    v12.p2 = v97
    v43[0] = v97
    v43[3] = v148
    v36.p2 = v14
    v7.p1 = v104
    return v90
  }
  func f24(_ v0: s1) -> s1 {
    let v3: s1 = f86(v0)
    let v2: s1 = f86(v3)
    let v4: s1 = f86(v3)
    let v1: [s1] = [v4, v3]
    let v7: s0 = v2.p1
    var v15: [s1] = v1
    let v24: s0 = f41(v7)
    let v21: s0 = v4.p0
    let v26: s0 = f41(v21)
    v15[1] = v4
    let v88: s1 = s1(p0: v26, p1: v21)
    let v54: s0 = f97(v24)
    let v52: s2 = s2(p0: v88, p1: v54)
    let v80: s2 = f102(v52)
    let v85: s2 = f29(v15, v80)
    let v77: s1 = v85.p0
    return v77
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v6: s1 = s1(p0: v0, p1: v0)
    let v3: s1 = f24(v6)
    let v9: s0 = v3.p1
    let v4: s1 = s1(p0: v9, p1: v9)
    let v11: s0 = v4.p1
    let v16: [[Double]] = v11.p0
    var v33: Double = v1
    let v23: [Double] = v16[2]
    let v24: Double = v23[0]
    let v32: [Double] = v16[2]
    let v22: Double = v32[0]
    var v38: [Double] = v32
    v38[0] = v22
    var v34: Double = v24
    v38[0] = v33
    let v99: Double = v32[0]
    v38[0] = v99
    var v66: [Double] = v38
    v66[0] = v34
    let v88: Double = v66[0]
    return v88
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0]])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
