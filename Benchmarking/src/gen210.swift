  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f35(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    var v6: s0 = v0
    v6.p1 = v4
    var v1: s0 = v0
    let v2: [[Double]] = v0.p1
    let v9: [[Double]] = v6.p1
    let v5: [Double] = v4[2]
    v6.p1 = v9
    let v8: [[Double]] = v0.p0
    let v16: [Double] = v9[1]
    var v12: [Double] = v16
    let v14: [[Double]] = v0.p1
    let v34: [[Double]] = v1.p0
    var v15: [[Double]] = v8
    var v24: [[Double]] = v2
    var v18: [[Double]] = v8
    let v19: [[Double]] = v0.p0
    let v40: [Double] = v19[1]
    v6.p0 = v8
    var v22: [[Double]] = v14
    v18[0] = v12
    let v27: [Double] = v15[0]
    let v36: Double = v40[0]
    v1.p1 = v9
    v1.p1 = v9
    var v37: s0 = v6
    let v30: Double = v27[0]
    var v54: [[Double]] = v18
    let v38: [[Double]] = v37.p0
    v12[0] = v36
    v22[0] = v5
    v6.p0 = v15
    let v119: [[Double]] = v6.p1
    v1.p1 = v119
    v1.p1 = v9
    v54[1] = v40
    var v108: [[Double]] = v14
    let v46: [Double] = v34[1]
    v1.p0 = v19
    let v65: [Double] = v22[0]
    let v56: [[Double]] = v37.p0
    let v49: [[Double]] = v37.p1
    let v73: [Double] = v34[1]
    v15 = v8
    let v155: [Double] = v108[1]
    v24[0] = v73
    let v78: [[Double]] = v6.p0
    v1.p0 = v15
    v37.p1 = v24
    v6.p0 = v34
    let v106: s0 = s0(p0: v38, p1: v49)
    let v68: [Double] = v54[0]
    v12[0] = v30
    v6.p0 = v19
    v24[0] = v68
    v108[0] = v65
    v1.p0 = v38
    v37.p1 = v22
    v54[1] = v46
    v37.p0 = v78
    v6.p0 = v56
    v18[0] = v155
    return v106
  }
  func f32(_ v0: s0, _ v1: s0, _ v2: s0, _ v3: s0) -> s0 {
    var v6: s0 = v2
    let v4: [[Double]] = v0.p0
    let v5: [[Double]] = v3.p0
    let v8: [Double] = v5[0]
    v6.p0 = v5
    var v14: [[Double]] = v5
    v6.p0 = v4
    v6.p0 = v14
    v6.p0 = v14
    v14[1] = v8
    return v6
  }
  func f26(_ v0: s0) -> s0 {
    let v2: s0 = f35(v0)
    let v1: s0 = f35(v0)
    let v14: s0 = f32(v0, v2, v2, v2)
    let v35: s0 = f32(v2, v2, v0, v0)
    let v21: s0 = f32(v1, v35, v14, v2)
    let v17: s0 = f32(v1, v21, v0, v14)
    let v18: s0 = f32(v2, v1, v1, v17)
    let v15: s0 = f32(v1, v14, v18, v35)
    let v28: [[Double]] = v35.p0
    let v42: s0 = f35(v17)
    let v53: s0 = f35(v14)
    let v29: s0 = f32(v0, v15, v21, v0)
    let v36: s0 = f32(v53, v42, v29, v29)
    let v43: [[Double]] = v35.p0
    var v70: s0 = v36
    v70.p0 = v28
    let v46: s0 = f35(v70)
    let v73: [[Double]] = v46.p1
    let v133: s0 = s0(p0: v43, p1: v73)
    return v133
  }
  func f25(_ v0: s0) -> s0 {
    let v3: s0 = f26(v0)
    let v5: [[Double]] = v0.p1
    let v7: [[Double]] = v0.p0
    var v1: [[Double]] = v5
    let v4: s0 = f32(v3, v3, v3, v0)
    let v2: s0 = f35(v4)
    let v8: [Double] = v7[0]
    let v11: Double = v8[0]
    var v10: [Double] = v8
    var v12: [[Double]] = v1
    var v16: [[Double]] = v12
    v12[2] = v10
    let v29: s0 = f26(v2)
    v12[0] = v8
    let v24: s0 = f32(v4, v3, v4, v2)
    let v19: [Double] = v7[0]
    let v22: [Double] = v5[1]
    let v38: Double = v22[0]
    let v41: s0 = f26(v29)
    let v42: s0 = f35(v29)
    v12[1] = v19
    let v59: Double = v38 * v11
    let v44: [[Double]] = v4.p0
    v12 = v1
    let v115: [[Double]] = v24.p1
    var v80: s0 = v0
    var v112: [[Double]] = v44
    let v82: s0 = f35(v80)
    v80.p0 = v44
    v80.p1 = v115
    let v125: s0 = f32(v42, v82, v80, v80)
    let v120: [[Double]] = v125.p1
    let v67: [[Double]] = v125.p0
    let v101: [[Double]] = v0.p1
    v80.p0 = v67
    var v93: s0 = v2
    v80.p1 = v16
    let v87: [[Double]] = v93.p0
    v80.p1 = v101
    let v131: s0 = s0(p0: v87, p1: v120)
    let v78: [[Double]] = v41.p1
    let v148: [Double] = v78[1]
    let v150: s0 = f32(v42, v131, v2, v2)
    v10[0] = v59
    let v178: s0 = f26(v150)
    v93.p0 = v112
    v16[0] = v148
    return v178
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v7: s0 = v0[0]
    let v3: s0 = f25(v7)
    let v6: [[Double]] = v3.p0
    var v2: Double = v1
    let v40: [Double] = v6[1]
    let v130: Double = v40[0]
    let v76: Double = v130 - v2
    var v195: Double = v76
    return v195
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
