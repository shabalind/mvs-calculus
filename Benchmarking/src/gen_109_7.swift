  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f14(_ v0: [s1]) -> [s1] {
    var v2: [s1] = v0
    let v6: s1 = v2[0]
    v2[0] = v6
    var v7: s1 = v6
    v2[0] = v7
    v2[0] = v7
    let v8: s1 = v2[0]
    let v3: s1 = v2[0]
    var v13: [s1] = v0
    var v4: [s1] = v2
    v4[0] = v7
    let v9: s0 = v8.p0
    let v5: [[s1]] = [v4, v13, v4]
    let v11: s0 = v6.p0
    var v14: s0 = v9
    let v15: [s1] = v5[2]
    var v10: s0 = v11
    let v22: s1 = v2[0]
    var v18: [s1] = v4
    let v16: [[Double]] = v10.p2
    v2[0] = v22
    let v12: s0 = v22.p0
    var v17: [[s1]] = v5
    var v52: s0 = v11
    v10.p2 = v16
    v4[0] = v6
    v7.p1 = v9
    let v28: [[Double]] = v11.p0
    v7.p1 = v9
    let v20: [s1] = v17[0]
    let v19: s0 = v6.p0
    var v27: [[s1]] = v17
    let v23: s0 = v7.p1
    let v49: [[Double]] = v23.p4
    v10.p0 = v49
    v52.p1 = v49
    var v43: [s1] = v18
    let v34: s0 = v8.p0
    var v37: [[Double]] = v16
    v10.p0 = v28
    v43 = v15
    var v21: [[Double]] = v28
    v52.p1 = v28
    let v101: s1 = s1(p0: v34, p1: v19)
    var v75: [s1] = v43
    v75[0] = v3
    let v100: s1 = v20[0]
    let v40: [s1] = v5[0]
    v2[0] = v22
    let v41: s1 = s1(p0: v52, p1: v19)
    v7.p0 = v14
    v2 = v18
    let v66: s1 = v40[0]
    v43[0] = v7
    v14.p2 = v37
    let v108: [[Double]] = v9.p3
    let v119: s0 = v8.p0
    v17[0] = v75
    v43[0] = v41
    let v46: s0 = v101.p0
    var v83: [[Double]] = v108
    var v55: s0 = v23
    v52.p2 = v37
    v10.p3 = v83
    let v127: s0 = v66.p1
    v7.p1 = v127
    var v62: [[s1]] = v17
    let v103: [[Double]] = v46.p3
    let v134: s1 = v13[0]
    let v71: [[Double]] = v11.p4
    let v74: [[[s1]]] = [v27, v62, v27, v27, v27]
    v14.p0 = v71
    v7.p1 = v12
    v4[0] = v3
    let v181: [[Double]] = v23.p2
    v10.p0 = v21
    let v94: [Double] = v37[0]
    let v150: [[s1]] = v74[0]
    v4[0] = v134
    v55.p3 = v103
    let v178: [s1] = v150[2]
    v7.p0 = v119
    let v254: s0 = v100.p0
    v7.p1 = v254
    let v230: [s1] = v150[1]
    v7.p1 = v55
    v27[2] = v178
    v62[1] = v230
    v21[0] = v94
    v52.p4 = v28
    v14.p2 = v181
    return v230
  }
  func f6(_ v0: [s1]) -> [s1] {
    var v2: [s1] = v0
    let v7: [s1] = f14(v0)
    var v1: [s1] = v7
    let v5: s1 = v7[0]
    let v4: [[s1]] = [v2, v2, v2, v7, v2, v1, v1]
    let v6: [s1] = v4[0]
    v1[0] = v5
    let v3: [s1] = v4[5]
    var v15: [[s1]] = v4
    let v18: [s1] = v15[5]
    let v12: [s1] = f14(v0)
    let v29: s1 = v3[0]
    v1[0] = v29
    var v23: [[s1]] = v15
    var v112: [[s1]] = v23
    let v142: [s1] = v112[1]
    let v80: [s1] = f14(v1)
    v23[4] = v80
    v23[2] = v12
    v15[6] = v6
    var v198: [s1] = v3
    v112[6] = v18
    v15[5] = v198
    return v142
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v4: [s1] = v0[0]
    let v5: [s1] = f6(v4)
    var v8: [[s1]] = v0
    v8[0] = v5
    let v3: [s1] = v8[0]
    let v2: [s1] = f14(v3)
    v8[0] = v2
    var v9: [s1] = v5
    v8[0] = v3
    let v11: [s1] = f14(v4)
    let v20: s1 = v5[0]
    let v13: s1 = v9[0]
    let v15: s1 = v11[0]
    var v19: [s1] = v4
    let v17: s0 = v20.p1
    var v24: s0 = v17
    let v10: [[Double]] = v17.p1
    let v12: s1 = v5[0]
    v9[0] = v12
    let v22: [s1] = f6(v9)
    v8[0] = v11
    let v16: [s1] = f14(v11)
    let v25: [s1] = f14(v16)
    let v35: s0 = v13.p1
    var v51: s0 = v24
    var v31: s1 = v13
    let v29: [s1] = f14(v11)
    var v42: s1 = v15
    v8[0] = v19
    v31 = v13
    let v33: [[[s1]]] = [v8]
    let v27: s0 = v42.p1
    let v41: [[s1]] = v33[0]
    let v56: [s1] = f6(v2)
    let v68: [[Double]] = v27.p2
    let v37: s1 = v56[0]
    var v46: [s1] = v29
    let v49: s1 = v29[0]
    let v47: [s1] = f6(v46)
    v24.p1 = v10
    v9[0] = v49
    let v59: s1 = v22[0]
    v8[0] = v25
    let v61: s0 = v42.p0
    v42.p0 = v51
    v31.p0 = v61
    let v53: s0 = v31.p1
    let v58: [[Double]] = v35.p3
    let v170: [[Double]] = v51.p1
    v19[0] = v59
    v24.p3 = v58
    v42.p0 = v53
    v42.p0 = v61
    let v99: [s1] = v41[0]
    v8[0] = v29
    v8[0] = v99
    v31 = v37
    let v89: [Double] = v68[1]
    v46[0] = v12
    let v191: Double = v89[0]
    v24.p0 = v170
    v8[0] = v47
    return v191
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]], p2: [[6.0], [7.0]], p3: [[8.0]], p4: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]], p2: [[18.0], [19.0]], p3: [[20.0]], p4: [[21.0], [22.0], [23.0]]))]]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
