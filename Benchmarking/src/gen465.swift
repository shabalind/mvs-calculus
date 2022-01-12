  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s5 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s8 {
    var p0: s5
    var p1: [s5]
  }
  func f116(_ v0: s0) -> s0 {
    var v7: s0 = v0
    v7 = v0
    var v5: s0 = v7
    let v2: [[Double]] = v5.p1
    v5.p1 = v2
    let v1: [Double] = v2[1]
    let v6: [[Double]] = v7.p0
    let v4: [Double] = v2[0]
    let v10: [[Double]] = v0.p0
    var v15: [[Double]] = v2
    let v13: [Double] = v6[2]
    var v12: [[Double]] = v6
    v12[2] = v4
    var v42: [[Double]] = v15
    v7 = v0
    var v21: [[Double]] = v15
    v12[2] = v4
    v15[1] = v13
    let v22: [Double] = v2[1]
    let v44: s0 = s0(p0: v10, p1: v42)
    v5.p0 = v6
    let v31: [Double] = v10[0]
    v42 = v21
    v15[1] = v1
    let v50: [Double] = v6[2]
    v7.p0 = v12
    v12[2] = v31
    let v64: Double = v22[0]
    v15[0] = v50
    var v81: [Double] = v13
    v81[0] = v64
    var v61: [[Double]] = v6
    v21[0] = v81
    v5.p0 = v61
    return v44
  }
  func f90(_ v0: s0, _ v1: [s5]) -> [s5] {
    var v8: [s5] = v1
    let v9: s5 = v8[0]
    v8 = v1
    v8[0] = v9
    let v7: s5 = v1[0]
    var v10: [s5] = v1
    v8 = v1
    let v12: s5 = v10[0]
    v10[0] = v12
    let v20: s5 = v8[0]
    v10[0] = v7
    v10[0] = v20
    v8 = v10
    return v10
  }
  func f83(_ v0: [Double]) -> [Double] {
    let v4: Double = v0[0]
    var v2: [Double] = v0
    let v9: Double = v0[0]
    v2[0] = v9
    let v5: Double = v2[0]
    v2[0] = v4
    let v6: Double = v2[0]
    var v13: Double = v6
    let v11: Double = v2[0]
    let v24: Double = v0[0]
    let v18: Double = v0[0]
    v2[0] = v11
    v2[0] = v18
    let v10: Double = v0[0]
    var v8: [Double] = v0
    let v12: [Double] = [v6]
    var v14: [Double] = v2
    let v21: Double = v8[0]
    let v15: Double = v8[0]
    let v23: Double = v14[0]
    let v17: Double = v0[0]
    let v19: [Double] = [v10, v11, v24, v15, v23, v17, v17]
    let v51: [[Double]] = [v19, v19, v19, v19, v19]
    let v26: [Double] = v51[2]
    v14[0] = v6
    v14[0] = v18
    v8[0] = v5
    var v33: [Double] = v12
    let v37: Double = v0[0]
    v33[0] = v37
    v2[0] = v4
    v33[0] = v21
    v14[0] = v13
    let v44: Double = v8[0]
    var v38: [Double] = v33
    v14 = v38
    v14[0] = v10
    v33[0] = v21
    let v60: Double = v44 - v10
    let v48: Double = v26[5]
    v33[0] = v48
    v2 = v33
    v33[0] = v60
    v2 = v12
    return v38
  }
  func f75(_ v0: s5) -> s5 {
    let v3: [[s0]] = v0.p1
    let v2: s0 = v0.p0
    var v7: s0 = v2
    var v8: s0 = v7
    let v1: [s5] = [v0]
    var v6: [s5] = v1
    let v10: [s0] = v3[0]
    var v11: [[s0]] = v3
    let v5: [[Double]] = v7.p1
    let v12: [[s0]] = v0.p1
    var v35: s5 = v0
    v11[1] = v10
    var v19: s0 = v2
    let v17: s5 = v6[0]
    let v14: [[s0]] = v35.p1
    let v18: [[Double]] = v7.p1
    var v13: s5 = v17
    let v30: [Double] = v18[1]
    v8.p1 = v18
    let v23: [[s5]] = [v6]
    let v46: s0 = f116(v8)
    var v16: [s0] = v10
    v13.p0 = v46
    let v44: s0 = v16[0]
    v6[0] = v17
    let v58: s5 = s5(p0: v7, p1: v11)
    let v24: s0 = f116(v7)
    let v39: [s0] = v11[2]
    let v29: [s5] = v23[0]
    let v31: [[Double]] = v19.p0
    v13.p1 = v14
    v11[0] = v16
    let v47: s0 = v13.p0
    let v33: s0 = f116(v24)
    let v53: s0 = v0.p0
    v6[0] = v13
    v16[0] = v53
    v8.p1 = v5
    let v55: [[Double]] = v33.p1
    v7.p0 = v31
    let v62: [Double] = f83(v30)
    let v56: [[Double]] = v44.p1
    v11[1] = v16
    let v40: s0 = f116(v19)
    v19.p0 = v31
    let v69: s0 = v10[0]
    let v60: s0 = f116(v2)
    v7 = v60
    let v78: [[Double]] = v8.p1
    v13.p1 = v11
    v6[0] = v13
    v13.p0 = v44
    v35.p1 = v12
    let v94: [s5] = f90(v53, v29)
    v19.p0 = v31
    v7 = v2
    let v66: [[s0]] = v58.p1
    let v83: s5 = s5(p0: v47, p1: v66)
    v19.p1 = v56
    let v45: [[Double]] = v44.p1
    let v96: [[Double]] = v40.p1
    var v132: [[Double]] = v96
    v19.p1 = v45
    v8.p1 = v78
    v8.p0 = v31
    v6[0] = v83
    v8.p1 = v55
    v16[0] = v46
    v13.p0 = v69
    var v70: [[Double]] = v132
    let v116: s0 = v39[0]
    v132[1] = v62
    let v85: [[Double]] = v53.p0
    let v191: s5 = v94[0]
    let v242: s0 = v17.p0
    v8.p1 = v56
    v8 = v242
    v13 = v0
    v16[0] = v116
    v8.p1 = v78
    v8.p0 = v85
    v6[0] = v58
    v7.p1 = v70
    v6[0] = v191
    return v83
  }
  func f44(_ v0: s8) -> s8 {
    let v2: s5 = v0.p0
    let v5: s5 = v0.p0
    let v1: [s5] = [v2, v2, v5, v2, v2]
    let v7: s5 = v1[2]
    let v10: [s5] = v0.p1
    let v21: [[s5]] = [v10, v10, v10, v10]
    let v69: [s5] = v21[2]
    let v95: s8 = s8(p0: v7, p1: v69)
    var v37: s8 = v95
    return v37
  }
  func f8(_ v0: s8) -> s8 {
    let v4: [s5] = v0.p1
    let v7: s5 = v4[1]
    var v6: s8 = v0
    let v3: s5 = f75(v7)
    var v2: [s5] = v4
    let v5: s5 = v2[2]
    v6.p0 = v5
    v6.p0 = v3
    let v27: s8 = f44(v6)
    return v27
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    let v4: s8 = f8(v0)
    let v6: s8 = f44(v4)
    let v3: s5 = v6.p0
    let v8: s0 = v3.p0
    let v9: [[Double]] = v8.p1
    let v13: [Double] = v9[1]
    let v17: Double = v13[0]
    return v17
  }
  func benchmark() {
    let v0: s8 = s8(p0: s5(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])]]), p1: [s5(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: [[s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])], [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])], [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])]]), s5(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: [[s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])], [s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])], [s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])]]), s5(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]]), p1: [[s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]])], [s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]])], [s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]])]])])
    let v1: Double = 80.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 80.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
