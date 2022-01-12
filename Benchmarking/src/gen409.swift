  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: [[s0]]
  }
  struct s6 {
    var p0: [s0]
    var p1: s0
  }
  func f81(_ v0: s2, _ v1: s2) -> s2 {
    let v7: [[s0]] = v0.p1
    var v6: s2 = v1
    v6 = v0
    let v3: s1 = v0.p0
    let v12: [s0] = v7[0]
    v6.p0 = v3
    var v18: [[s0]] = v7
    let v14: s1 = v6.p0
    v6.p0 = v3
    v6.p1 = v18
    let v40: s2 = s2(p0: v14, p1: v7)
    v18 = v7
    v18[0] = v12
    return v40
  }
  func f77(_ v0: s1) -> s1 {
    let v6: [s1] = [v0, v0, v0, v0, v0, v0]
    let v1: s1 = v6[3]
    let v2: [[s0]] = v1.p1
    let v4: s0 = v0.p0
    let v5: s0 = v0.p0
    let v3: [Double] = v4.p0
    var v12: [[s0]] = v2
    var v10: s0 = v4
    let v7: [[Double]] = v4.p1
    let v9: [s0] = v2[0]
    var v26: [s0] = v9
    let v25: [Double] = v4.p0
    let v11: s1 = s1(p0: v5, p1: v2)
    v26[0] = v5
    let v13: [s0] = v12[1]
    let v15: [Double] = v7[0]
    var v20: [Double] = v3
    var v22: s0 = v10
    v12[0] = v26
    v26[0] = v10
    let v14: s6 = s6(p0: v13, p1: v22)
    let v17: [s0] = v14.p0
    v12[2] = v9
    v12[2] = v13
    v12[0] = v13
    let v24: s0 = v14.p1
    let v18: [s6] = [v14, v14, v14, v14, v14, v14, v14]
    var v60: [Double] = v20
    v12[0] = v26
    v22.p1 = v7
    var v28: [[Double]] = v7
    v26[0] = v24
    v28[2] = v15
    v12[1] = v17
    v22.p0 = v25
    v22.p0 = v20
    let v45: [Double] = v10.p0
    v22.p1 = v7
    v28[1] = v15
    let v37: s6 = v18[2]
    var v38: [[Double]] = v28
    let v29: s0 = v37.p1
    v10.p0 = v45
    let v49: s0 = v26[0]
    let v61: s0 = v13[0]
    let v50: [Double] = v7[1]
    let v41: [Double] = v49.p0
    v10.p1 = v38
    var v169: [s0] = v26
    let v89: [[Double]] = [v60, v60, v41, v25]
    v22.p0 = v25
    var v96: [[Double]] = v38
    v96[0] = v50
    v22.p0 = v60
    let v167: [Double] = v89[3]
    v169[0] = v61
    v28 = v96
    v26[0] = v4
    v12[1] = v169
    var v99: s1 = v11
    let v216: s0 = v169[0]
    var v74: s1 = v99
    v74.p0 = v216
    v10.p1 = v7
    v99.p0 = v29
    v22.p0 = v167
    return v74
  }
  func f76(_ v0: s2) -> s2 {
    let v5: s2 = f81(v0, v0)
    var v4: s2 = v5
    let v7: s1 = v4.p0
    var v6: s2 = v0
    var v8: s2 = v5
    var v3: s2 = v0
    let v9: s1 = f77(v7)
    var v10: s2 = v5
    let v13: s2 = f81(v6, v5)
    var v16: s2 = v13
    var v23: s2 = v16
    let v27: s1 = v16.p0
    let v25: s1 = f77(v27)
    var v12: s2 = v10
    var v15: s2 = v6
    let v19: [[s0]] = v27.p1
    var v17: s1 = v9
    let v40: s2 = f81(v0, v3)
    v6.p0 = v17
    let v26: [[s0]] = v40.p1
    var v32: [[s0]] = v26
    let v24: [s0] = v19[0]
    let v30: [[s0]] = v27.p1
    var v35: [s0] = v24
    let v33: s1 = f77(v9)
    var v31: [s0] = v24
    v32[0] = v24
    var v68: s2 = v4
    let v37: s0 = v33.p0
    v12.p0 = v25
    let v57: s0 = v31[0]
    let v38: [[s0]] = v9.p1
    var v28: s2 = v23
    v28 = v8
    v35[0] = v57
    var v76: s2 = v23
    v15.p1 = v26
    let v41: [s0] = v30[2]
    let v62: [s0] = v38[0]
    v32[0] = v62
    let v191: [[s0]] = v76.p1
    let v51: [[s0]] = v28.p1
    v35[0] = v37
    v32[0] = v35
    let v50: s1 = f77(v27)
    var v42: [[s0]] = v32
    v17 = v7
    let v46: s2 = f81(v6, v12)
    v42[0] = v41
    let v83: s2 = f81(v46, v68)
    v68.p1 = v51
    v23.p1 = v51
    v42[0] = v31
    v76.p0 = v50
    let v118: s2 = f81(v15, v83)
    v4.p1 = v191
    v76.p1 = v42
    return v118
  }
  func f57(_ v0: [[s0]]) -> [[s0]] {
    var v4: [[s0]] = v0
    var v6: [[s0]] = v4
    let v5: [s0] = v6[0]
    var v20: [[s0]] = v0
    v20[0] = v5
    return v20
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [[s1]], _ v2: Double) -> Double {
    let v7: s2 = f76(v0)
    let v6: [[s0]] = v7.p1
    let v3: s1 = v7.p0
    let v8: [[s0]] = f57(v6)
    let v9: [s0] = v8[0]
    let v4: s0 = v9[0]
    let v10: [s1] = v1[0]
    let v15: s0 = v3.p0
    let v18: s1 = v10[0]
    let v12: s0 = v18.p0
    let v94: [s0] = [v12, v15, v12, v4]
    let v69: s0 = v94[2]
    let v82: [Double] = v69.p0
    let v62: Double = v82[1]
    let v120: Double = v2 + v2
    let v126: Double = v120 / v62
    return v126
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [0.0, 1.0, 2.0], p1: [[3.0], [4.0], [5.0]]), p1: [[s0(p0: [6.0, 7.0, 8.0], p1: [[9.0], [10.0], [11.0]])], [s0(p0: [12.0, 13.0, 14.0], p1: [[15.0], [16.0], [17.0]])], [s0(p0: [18.0, 19.0, 20.0], p1: [[21.0], [22.0], [23.0]])]]), p1: [[s0(p0: [24.0, 25.0, 26.0], p1: [[27.0], [28.0], [29.0]])]])
    let v1: [[s1]] = [[s1(p0: s0(p0: [30.0, 31.0, 32.0], p1: [[33.0], [34.0], [35.0]]), p1: [[s0(p0: [36.0, 37.0, 38.0], p1: [[39.0], [40.0], [41.0]])], [s0(p0: [42.0, 43.0, 44.0], p1: [[45.0], [46.0], [47.0]])], [s0(p0: [48.0, 49.0, 50.0], p1: [[51.0], [52.0], [53.0]])]])]]
    let v2: Double = 54.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 54.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
