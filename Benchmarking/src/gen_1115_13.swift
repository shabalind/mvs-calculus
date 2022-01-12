  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s1
  }
  struct s7 {
    var p0: s2
    var p1: [[s1]]
  }
  func f25(_ v0: s0) -> s0 {
    var v2: s0 = v0
    v2 = v0
    var v6: s0 = v0
    var v5: s0 = v2
    var v1: s0 = v6
    v6 = v1
    let v4: [[Double]] = v5.p1
    let v3: [Double] = v4[0]
    let v8: Double = v3[0]
    let v15: [Double] = v4[0]
    var v7: [Double] = v3
    let v10: Double = v15[0]
    v7[0] = v10
    v7[0] = v8
    let v23: [Double] = v4[0]
    v7[0] = v10
    var v9: [[Double]] = v4
    v9[0] = v23
    let v13: [[Double]] = v5.p0
    var v22: s0 = v1
    var v17: s0 = v2
    v9[0] = v15
    v9[0] = v15
    var v31: [[Double]] = v13
    v22.p0 = v31
    let v42: [[Double]] = v22.p1
    var v18: s0 = v17
    var v14: [[Double]] = v31
    let v37: [Double] = v42[0]
    v31[0] = v7
    v9[0] = v7
    v9[0] = v7
    v18.p0 = v14
    v31[1] = v37
    v17.p1 = v9
    return v18
  }
  func f24(_ v0: s0) -> s0 {
    let v2: s0 = f25(v0)
    let v3: [[Double]] = v2.p1
    let v7: [[Double]] = v2.p1
    let v5: [Double] = v3[0]
    let v6: s0 = f25(v2)
    var v11: [[Double]] = v7
    let v10: [Double] = v7[0]
    var v14: [[Double]] = v7
    v14[0] = v10
    let v43: [Double] = v3[0]
    let v52: s0 = f25(v2)
    v11[0] = v10
    var v13: [[Double]] = v11
    let v36: [[Double]] = v0.p1
    var v23: [Double] = v43
    var v22: [[Double]] = v14
    let v99: s0 = f25(v6)
    var v26: [Double] = v10
    let v25: s0 = f25(v52)
    let v18: [[Double]] = v99.p0
    let v40: [[Double]] = v0.p0
    var v50: s0 = v0
    v50.p0 = v18
    let v30: [Double] = v18[1]
    v50.p1 = v36
    v11[0] = v5
    v13[0] = v23
    v50.p0 = v40
    let v27: [[Double]] = v2.p1
    v50.p1 = v13
    let v77: s0 = f25(v25)
    let v87: s0 = f25(v77)
    v50.p1 = v7
    v22[0] = v30
    let v37: [[Double]] = v87.p1
    let v67: s0 = f25(v50)
    let v49: [[Double]] = v77.p1
    let v101: s0 = f25(v67)
    v50.p1 = v36
    v50.p1 = v27
    v11[0] = v5
    v14[0] = v5
    v50.p1 = v13
    v50.p1 = v49
    var v85: s0 = v101
    v14[0] = v23
    v22[0] = v5
    let v125: s0 = f25(v85)
    let v65: Double = v10[0]
    let v100: [[Double]] = v25.p0
    v26[0] = v65
    v50.p1 = v37
    v85.p1 = v22
    v13[0] = v26
    v50.p0 = v100
    return v125
  }
  func f16(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v5: [[Double]] = v0.p0
    let v6: s0 = f25(v0)
    v3.p0 = v5
    let v18: s0 = f25(v0)
    let v11: [[Double]] = v3.p1
    var v25: s0 = v6
    let v14: s0 = f24(v25)
    let v17: [[Double]] = v18.p0
    v3.p0 = v17
    var v34: s0 = v3
    let v72: s0 = f24(v14)
    let v40: s0 = f24(v14)
    v34.p1 = v11
    let v41: [[Double]] = v72.p0
    v34.p1 = v11
    v3.p0 = v41
    let v28: [[Double]] = v6.p1
    v3.p1 = v28
    let v24: [[Double]] = v40.p1
    v25.p1 = v28
    v25.p1 = v24
    return v34
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: s0, _ v2: Double) -> Double {
    let v4: [[Double]] = v1.p1
    let v6: [Double] = v4[0]
    let v10: s0 = f16(v1)
    let v15: [Double] = v4[0]
    let v80: [Double] = v4[0]
    let v41: Double = v15[0]
    var v38: [Double] = v6
    let v30: [[Double]] = v10.p0
    let v54: Double = v38[0]
    var v52: [[Double]] = v30
    var v81: Double = v2
    let v177: [Double] = v52[0]
    v52[1] = v38
    var v116: [Double] = v38
    v38 = v116
    v52[1] = v80
    v38[0] = v54
    let v144: [Double] = [v2, v41, v54, v81]
    let v270: Double = v144[2]
    v38 = v177
    return v270
  }
  func benchmark() {
    let v0: s7 = s7(p0: s2(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])]], p1: s1(p0: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])], p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0]])])), p1: [[s1(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])], p1: [s0(p0: [[21.0], [22.0]], p1: [[23.0]])])], [s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]])], p1: [s0(p0: [[30.0], [31.0]], p1: [[32.0]])])], [s1(p0: [s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]])], p1: [s0(p0: [[39.0], [40.0]], p1: [[41.0]])])]])
    let v1: s0 = s0(p0: [[42.0], [43.0]], p1: [[44.0]])
    let v2: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
