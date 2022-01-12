  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
    var p2: s0
  }
  struct s4 {
    var p0: s2
    var p1: [Double]
  }
  struct s5 {
    var p0: s4
    var p1: s2
  }
  struct s7 {
    var p0: [s2]
    var p1: s5
  }
  func f46(_ v0: s1, _ v1: s4) -> s4 {
    var v12: s4 = v1
    let v31: s2 = v12.p0
    v12.p0 = v31
    return v12
  }
  func f41(_ v0: [s2]) -> [s2] {
    let v5: s2 = v0[2]
    var v3: [s2] = v0
    let v6: s2 = v3[0]
    v3[2] = v6
    var v8: [s2] = v3
    v3[0] = v5
    v8[2] = v6
    return v8
  }
  func f39(_ v0: s2) -> s2 {
    var v4: s2 = v0
    var v1: s2 = v4
    let v3: [s2] = [v1]
    let v5: s2 = v3[0]
    var v7: [s2] = v3
    let v2: s2 = v7[0]
    let v6: s2 = v7[0]
    let v9: [s0] = v6.p0
    v7[0] = v1
    let v13: [s0] = v4.p1
    let v10: s0 = v4.p2
    v1 = v0
    var v8: [s0] = v13
    let v15: [s0] = v5.p1
    let v14: s0 = v9[0]
    let v20: [s2] = [v5, v0, v1, v1, v1]
    v8[0] = v14
    var v18: [s0] = v9
    v4 = v0
    let v11: [s2] = [v1, v1, v4]
    v7[0] = v0
    v7[0] = v0
    v7[0] = v0
    var v19: s2 = v2
    var v37: [s0] = v18
    v18[0] = v10
    let v57: s0 = v0.p2
    v7[0] = v19
    let v39: [s2] = f41(v11)
    var v49: [s2] = v39
    let v35: [s0] = v1.p0
    v19.p0 = v9
    v4.p0 = v35
    let v53: [s2] = f41(v11)
    let v81: s0 = v13[1]
    v8[0] = v57
    let v51: [s0] = v6.p0
    let v65: s2 = v53[1]
    let v143: s2 = v49[1]
    v37[0] = v81
    v7[0] = v143
    let v76: [[s2]] = [v20, v20, v20, v20]
    v1.p0 = v51
    let v149: [s2] = v76[2]
    v19.p0 = v35
    let v136: s2 = v149[2]
    var v87: [s0] = v15
    v19.p1 = v87
    v4.p1 = v8
    v49[0] = v65
    v4.p0 = v37
    v19.p2 = v57
    v19.p1 = v13
    return v136
  }
  func f33(_ v0: s0, _ v1: s2) -> s2 {
    var v4: s2 = v1
    let v5: s2 = f39(v4)
    v4.p2 = v0
    v4.p2 = v0
    return v5
  }
  func f23(_ v0: s2) -> s2 {
    let v6: s2 = f39(v0)
    let v3: [s0] = v6.p0
    var v5: s2 = v0
    v5.p0 = v3
    v5.p0 = v3
    var v4: [s0] = v3
    let v1: [s0] = v0.p1
    var v13: s2 = v5
    let v11: s0 = v3[0]
    let v17: s0 = v1[1]
    v4[0] = v17
    v13.p1 = v1
    let v60: [[Double]] = v11.p0
    var v25: [[Double]] = v60
    v5.p2 = v17
    let v23: s0 = v1[0]
    var v18: s0 = v17
    let v10: s2 = f33(v18, v13)
    v13.p1 = v1
    v13.p0 = v4
    v25 = v60
    let v38: s2 = f33(v23, v10)
    v18.p0 = v25
    v13.p0 = v3
    v25 = v60
    v4[0] = v23
    let v94: s2 = f33(v23, v38)
    return v94
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v3: [s7] = [v0, v0, v0, v0]
    let v13: s7 = v3[3]
    let v11: s5 = v13.p1
    let v9: s4 = v11.p0
    let v15: s2 = v11.p1
    var v23: s4 = v9
    let v28: s2 = f23(v15)
    v23.p0 = v15
    var v29: s4 = v23
    let v38: s2 = f23(v28)
    v23.p0 = v38
    let v31: s2 = f23(v28)
    let v32: [s0] = v15.p1
    let v60: s2 = f23(v15)
    let v22: s2 = f23(v60)
    let v50: s2 = f23(v31)
    v29.p0 = v22
    let v155: s0 = v32[0]
    let v39: s1 = s1(p0: v155, p1: v155)
    let v94: s4 = f46(v39, v29)
    v29.p0 = v22
    let v85: s2 = v23.p0
    let v117: s2 = f33(v155, v50)
    v23 = v94
    let v79: s2 = f39(v85)
    let v103: s0 = v79.p2
    let v70: [[Double]] = v103.p0
    let v72: s2 = f23(v117)
    v29.p0 = v72
    v29 = v9
    let v224: [Double] = v70[0]
    var v161: [Double] = v224
    let v286: Double = v161[0]
    return v286
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]])], p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p2: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))], p1: s5(p0: s4(p0: s2(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])], p2: s0(p0: [[21.0], [22.0]], p1: [[23.0]])), p1: [24.0, 25.0]), p1: s2(p0: [s0(p0: [[26.0], [27.0]], p1: [[28.0]])], p1: [s0(p0: [[29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0]], p1: [[34.0]])], p2: s0(p0: [[35.0], [36.0]], p1: [[37.0]]))))
    let v1: Double = 38.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 38.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
