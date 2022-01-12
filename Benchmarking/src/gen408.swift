  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f23(_ v0: s0, _ v1: s0) -> s0 {
    var v7: s0 = v1
    let v4: [[Double]] = v0.p0
    let v3: [Double] = v4[1]
    v7.p0 = v4
    let v13: [[Double]] = v7.p0
    let v8: Double = v3[0]
    v7.p0 = v13
    var v12: [Double] = v3
    v7.p0 = v13
    let v20: [[Double]] = v0.p1
    let v27: [[Double]] = v7.p1
    let v14: [Double] = v4[1]
    v12 = v14
    let v23: [[Double]] = v7.p1
    let v9: [[Double]] = v0.p0
    let v16: [Double] = v20[1]
    var v18: [[Double]] = v9
    v18[1] = v16
    v7.p0 = v9
    var v35: [[Double]] = v27
    let v24: [Double] = v13[1]
    v12[0] = v8
    var v28: s0 = v0
    var v49: s0 = v0
    var v26: s0 = v1
    v26.p1 = v23
    v28 = v26
    let v25: [Double] = v20[1]
    var v43: [[Double]] = v27
    v49.p0 = v9
    v49 = v26
    v28.p1 = v27
    v43[1] = v12
    let v50: [Double] = v18[2]
    v35[1] = v25
    let v46: [[Double]] = v1.p0
    var v31: [[Double]] = v46
    let v40: [Double] = v43[1]
    v28.p0 = v31
    v31[1] = v40
    v43[0] = v50
    v7.p1 = v35
    v49.p1 = v27
    let v95: [s0] = [v26, v1, v28, v26, v49]
    let v114: s0 = v95[0]
    v31[0] = v24
    return v114
  }
  func f14(_ v0: s0) -> s0 {
    var v3: s0 = v0
    var v4: s0 = v3
    var v7: s0 = v0
    v7 = v0
    let v5: [s0] = [v0, v4, v7, v3, v0, v4]
    let v2: s0 = v5[4]
    let v9: s0 = v5[5]
    let v1: s0 = v5[0]
    let v8: s0 = v5[1]
    let v10: [[Double]] = v8.p0
    let v15: s0 = f23(v2, v0)
    let v6: s0 = f23(v15, v15)
    v3.p0 = v10
    let v14: s0 = f23(v2, v9)
    let v12: s0 = f23(v15, v4)
    let v20: [[Double]] = v6.p1
    let v13: [[Double]] = v1.p1
    let v21: s0 = f23(v0, v3)
    let v26: s0 = f23(v8, v21)
    v4.p0 = v10
    var v30: [s0] = v5
    let v33: s0 = f23(v8, v21)
    let v22: s0 = f23(v6, v7)
    let v24: s0 = f23(v14, v1)
    let v47: s0 = f23(v6, v7)
    var v19: [[Double]] = v20
    var v37: [[Double]] = v13
    let v45: s0 = f23(v22, v3)
    let v38: [[Double]] = v45.p0
    let v29: s0 = f23(v7, v33)
    v3.p1 = v13
    v4.p1 = v13
    let v25: [[Double]] = v7.p0
    let v44: s0 = f23(v26, v15)
    let v40: [[Double]] = v22.p1
    let v80: s0 = s0(p0: v10, p1: v40)
    v3.p0 = v10
    let v53: s0 = f23(v47, v12)
    let v52: s0 = f23(v47, v4)
    let v50: [[Double]] = v53.p1
    let v42: [[Double]] = v2.p1
    v4.p1 = v19
    v7.p0 = v25
    let v61: [Double] = v10[0]
    v4.p1 = v50
    v4.p1 = v42
    let v109: [[Double]] = v21.p0
    let v69: s0 = f23(v1, v29)
    let v96: [[Double]] = v6.p0
    let v66: [[Double]] = v52.p1
    let v74: [[Double]] = v44.p0
    v7.p0 = v74
    let v122: [[Double]] = v80.p0
    let v78: s0 = f23(v24, v80)
    v7.p1 = v37
    let v104: [[Double]] = v15.p1
    let v111: s0 = v30[2]
    v3.p1 = v37
    let v128: s0 = f23(v21, v26)
    v7.p0 = v96
    v4.p0 = v38
    let v212: [[Double]] = v45.p1
    v3.p0 = v122
    v19[0] = v61
    let v87: s0 = f23(v78, v69)
    let v90: s0 = f23(v87, v128)
    v7.p1 = v66
    v4.p1 = v212
    let v164: s0 = f23(v111, v90)
    v7.p1 = v212
    v4.p1 = v104
    v4.p0 = v109
    v3.p1 = v212
    v7.p0 = v10
    return v164
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v2: s1 = v0[1]
    let v19: [s0] = v2.p1
    let v15: s0 = v19[0]
    let v18: [[s0]] = [v19]
    var v11: s0 = v15
    let v28: [[Double]] = v11.p0
    v11 = v15
    let v43: [s0] = v18[0]
    let v69: s0 = f14(v15)
    let v16: [[Double]] = v69.p0
    v11.p0 = v28
    let v61: [s0] = v18[0]
    v11.p0 = v16
    let v25: s0 = v61[1]
    let v42: [[[Double]]] = [v28, v16, v16, v28]
    v11.p0 = v16
    let v93: [[Double]] = v42[2]
    let v97: [Double] = v93[1]
    v11.p0 = v16
    let v104: Double = v97[0]
    let v68: s0 = v43[0]
    v11.p0 = v16
    let v81: [[Double]] = v25.p1
    v11.p1 = v81
    let v143: [[Double]] = v25.p1
    let v58: [[Double]] = v15.p0
    v11.p1 = v143
    let v180: [[Double]] = v68.p0
    v11.p0 = v28
    v11.p0 = v180
    v11.p0 = v58
    return v104
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], p1: [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])]), s1(p0: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], p1: [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])])]
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
