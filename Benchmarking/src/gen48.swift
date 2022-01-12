  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f107(_ v0: [s0]) -> [s0] {
    var v1: [s0] = v0
    let v5: s0 = v0[2]
    var v3: [s0] = v0
    let v7: s0 = v3[0]
    let v6: s0 = v1[0]
    let v9: [[s0]] = [v3, v1, v0, v0, v3, v1, v0]
    let v8: s0 = v3[0]
    v3[0] = v8
    v1 = v3
    let v16: [s0] = v9[4]
    let v12: s0 = v16[1]
    v1[1] = v8
    v3[2] = v7
    var v25: [s0] = v16
    var v28: [s0] = v25
    v1[2] = v12
    v3[0] = v5
    v3[2] = v5
    v1[1] = v7
    let v26: s1 = s1(p0: v28, p1: v6)
    v28[1] = v12
    v25[2] = v12
    let v37: s0 = v26.p1
    let v100: [s0] = v26.p0
    v28[0] = v37
    v1[0] = v5
    v25 = v28
    v28[0] = v7
    var v113: [s0] = v100
    v28[1] = v7
    return v113
  }
  func f106(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p2
    let v8: [[Double]] = v0.p2
    let v4: [Double] = v8[0]
    let v1: [[Double]] = v0.p0
    let v11: [[Double]] = v0.p2
    var v6: s0 = v0
    v6.p0 = v1
    var v22: [[Double]] = v11
    var v15: s0 = v6
    let v14: [[Double]] = v6.p0
    v6.p0 = v1
    v6.p0 = v14
    var v69: [[Double]] = v1
    let v24: [Double] = v3[1]
    let v17: [[Double]] = v6.p0
    v15.p0 = v17
    v6 = v0
    v22[0] = v24
    v22[1] = v4
    v6.p0 = v1
    var v40: s0 = v15
    v40.p0 = v69
    v15.p2 = v3
    v40.p1 = v22
    let v61: [[Double]] = v40.p1
    let v38: [[Double]] = v15.p0
    v69[0] = v24
    v15.p1 = v22
    let v96: s0 = s0(p0: v38, p1: v61, p2: v8)
    return v96
  }
  func f105(_ v0: s0) -> s0 {
    var v6: s0 = v0
    var v2: s0 = v0
    let v4: s0 = f106(v6)
    let v12: [[Double]] = v2.p1
    let v5: [Double] = v12[0]
    var v11: s0 = v2
    var v10: [[Double]] = v12
    v6.p2 = v12
    v10 = v12
    v10[0] = v5
    v2.p1 = v10
    var v14: [[Double]] = v12
    v11.p2 = v14
    let v17: s0 = f106(v4)
    let v13: [[Double]] = v17.p2
    let v19: [[Double]] = v17.p0
    var v31: [[Double]] = v19
    v31[1] = v5
    let v20: [Double] = v19[0]
    let v22: [[[Double]]] = [v13, v12]
    let v23: [[Double]] = v11.p2
    let v29: s0 = s0(p0: v31, p1: v23, p2: v13)
    v31[1] = v5
    let v33: [[Double]] = v22[0]
    v11.p1 = v14
    var v93: [Double] = v20
    v11.p0 = v19
    let v51: [[Double]] = v29.p1
    let v110: s0 = f106(v29)
    v14[1] = v93
    let v205: [[Double]] = v110.p0
    v11.p2 = v33
    v6.p0 = v205
    v11.p2 = v51
    return v110
  }
  func f101(_ v0: s1) -> s1 {
    var v2: s1 = v0
    var v5: s1 = v2
    let v3: s0 = v0.p1
    let v8: s0 = f106(v3)
    v2.p1 = v8
    var v4: s0 = v3
    v5 = v2
    v2.p1 = v4
    return v5
  }
  func f98(_ v0: s1) -> s1 {
    let v1: s1 = f101(v0)
    let v7: [s0] = v1.p0
    let v3: [s0] = f107(v7)
    var v9: s1 = v0
    v9.p0 = v3
    var v5: s1 = v1
    let v8: s0 = v7[1]
    var v10: s0 = v8
    v5.p0 = v7
    let v11: s0 = f106(v10)
    let v22: s0 = f106(v11)
    let v14: [s0] = v1.p0
    v5.p0 = v14
    let v20: [s0] = v9.p0
    let v18: s1 = s1(p0: v3, p1: v10)
    let v31: s1 = f101(v18)
    let v46: [[Double]] = v22.p2
    v5.p0 = v20
    var v32: s1 = v31
    v10.p2 = v46
    let v56: [s0] = v5.p0
    v32.p0 = v56
    return v32
  }
  func f97(_ v0: s0, _ v1: s1) -> s0 {
    let v5: [s0] = v1.p0
    var v8: [s0] = v5
    let v6: s1 = s1(p0: v8, p1: v0)
    let v2: s1 = f101(v6)
    var v4: s0 = v0
    let v3: [s0] = f107(v5)
    let v15: s0 = v3[2]
    v4 = v15
    let v11: s0 = v2.p1
    var v22: s0 = v11
    let v12: [[Double]] = v0.p2
    let v23: s0 = f106(v4)
    v4.p2 = v12
    v8[1] = v23
    v4.p2 = v12
    let v29: s0 = v5[2]
    let v70: [[Double]] = v29.p1
    v22.p2 = v70
    return v22
  }
  func f93(_ v0: s1) -> s1 {
    let v4: [s0] = v0.p0
    let v18: s1 = f98(v0)
    let v14: s0 = v18.p1
    let v29: s1 = s1(p0: v4, p1: v14)
    return v29
  }
  func f92(_ v0: [s0], _ v1: s0) -> s0 {
    let v7: s0 = v0[0]
    let v6: s0 = f105(v7)
    let v2: s0 = v0[1]
    var v9: [s0] = v0
    v9[2] = v1
    let v5: s0 = v0[1]
    let v4: [[Double]] = v7.p2
    let v8: [s0] = f107(v0)
    let v24: s0 = v8[2]
    let v12: s1 = s1(p0: v8, p1: v6)
    let v19: s0 = f106(v5)
    v9 = v0
    let v11: s0 = v12.p1
    let v43: s0 = v12.p1
    let v18: [s0] = f107(v9)
    v9[2] = v7
    var v30: s1 = v12
    v9[0] = v11
    v9[0] = v24
    v9[2] = v43
    var v15: s1 = v30
    var v23: [s0] = v18
    let v50: s0 = v15.p1
    v15.p1 = v6
    let v25: s0 = v8[2]
    v23[1] = v24
    v15.p0 = v8
    let v29: s0 = f106(v19)
    v30.p0 = v9
    let v27: s0 = f97(v6, v15)
    v9[0] = v50
    var v32: [[Double]] = v4
    v9[1] = v2
    v15.p0 = v9
    v23[2] = v29
    let v68: s0 = v12.p1
    v30.p0 = v23
    v30.p1 = v5
    v15.p1 = v25
    v30.p1 = v68
    var v112: s0 = v25
    v30.p1 = v112
    v112.p1 = v4
    v112.p2 = v32
    return v27
  }
  func f91(_ v0: s1) -> s1 {
    let v5: [s0] = v0.p0
    var v7: [s0] = v5
    let v3: s1 = f93(v0)
    let v2: s0 = v5[2]
    var v8: s0 = v2
    v7[0] = v8
    var v6: s0 = v8
    let v11: s1 = f93(v3)
    var v10: s0 = v2
    let v17: [[Double]] = v8.p2
    let v1: s0 = f97(v6, v11)
    let v9: s0 = v0.p1
    var v4: s1 = v11
    let v20: [[Double]] = v6.p1
    let v12: s0 = v5[1]
    let v13: [s0] = v4.p0
    var v18: s0 = v9
    var v19: [s0] = v7
    v18 = v2
    var v15: s1 = v4
    let v30: [[Double]] = v18.p2
    v19[2] = v12
    let v25: s0 = f97(v12, v11)
    let v16: [[Double]] = v18.p0
    let v29: s0 = v13[1]
    let v27: [[Double]] = v25.p2
    let v21: s0 = v19[2]
    v4.p0 = v13
    var v42: [[Double]] = v30
    v7[1] = v6
    var v43: [[Double]] = v16
    let v37: [Double] = v17[1]
    var v67: [[Double]] = v43
    let v31: s0 = f105(v2)
    let v52: s0 = v15.p1
    var v32: [Double] = v37
    var v82: s0 = v1
    let v53: [[Double]] = v52.p1
    v43 = v67
    let v73: [s0] = f107(v7)
    v6.p2 = v20
    v10.p0 = v67
    v6.p0 = v43
    let v56: [[Double]] = v82.p1
    v82.p1 = v53
    v10.p0 = v67
    let v47: s1 = s1(p0: v7, p1: v21)
    let v79: [[Double]] = v21.p0
    v19[0] = v25
    v18.p2 = v42
    let v118: [Double] = v27[1]
    let v81: [[Double]] = v8.p0
    v18 = v31
    v18.p1 = v56
    v42[0] = v32
    v4.p1 = v29
    let v71: [Double] = v79[0]
    let v101: s1 = f93(v47)
    v42[0] = v71
    v4.p1 = v10
    v15.p0 = v73
    v67[2] = v118
    v82.p0 = v81
    v42[1] = v118
    v6.p2 = v17
    return v101
  }
  func f89(_ v0: s1) -> s1 {
    var v6: s1 = v0
    let v7: s1 = f91(v6)
    var v2: s1 = v7
    let v4: [s0] = v2.p0
    let v13: [s0] = v6.p0
    var v3: [s0] = v13
    let v10: s0 = v4[1]
    var v9: s0 = v10
    v3[1] = v10
    v3[1] = v9
    v3[2] = v10
    let v15: s0 = v3[1]
    let v24: [s0] = v6.p0
    let v14: s0 = f92(v24, v15)
    var v19: s0 = v14
    let v23: s1 = s1(p0: v4, p1: v15)
    let v20: [s0] = f107(v3)
    var v59: s1 = v23
    var v79: [s0] = v20
    v3[0] = v19
    let v60: s0 = v59.p1
    v79[1] = v60
    v6.p0 = v79
    return v59
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: Double) -> Double {
    let v6: s1 = f101(v1)
    let v5: s1 = f89(v6)
    let v12: s0 = v5.p1
    let v9: Double = v2 * v2
    let v21: [[Double]] = v12.p1
    let v26: [Double] = v21[1]
    var v37: [Double] = v26
    let v104: Double = v37[0]
    let v80: Double = v104 * v2
    let v122: Double = v80 - v9
    return v122
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0]]), s0(p0: [[7.0], [8.0], [9.0]], p1: [[10.0], [11.0]], p2: [[12.0], [13.0]])]
    let v1: s1 = s1(p0: [s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0], [18.0]], p2: [[19.0], [20.0]]), s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0], [25.0]], p2: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0], [32.0]], p2: [[33.0], [34.0]])], p1: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]], p2: [[40.0], [41.0]]))
    let v2: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
