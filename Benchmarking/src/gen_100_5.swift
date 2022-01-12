  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f60(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p0
    let v2: [[Double]] = v0.p0
    var v5: s0 = v0
    v5.p0 = v4
    let v6: [[Double]] = v5.p1
    let v1: [[Double]] = v5.p1
    var v22: s0 = v5
    v5.p0 = v2
    var v29: s0 = v22
    let v31: [[Double]] = v5.p1
    v5.p1 = v31
    var v16: s0 = v29
    v22.p1 = v1
    v16.p1 = v6
    return v16
  }
  func f59(_ v0: [Double], _ v1: s0) -> s0 {
    var v5: s0 = v1
    let v4: Double = v0[0]
    let v6: s0 = f60(v1)
    var v2: [Double] = v0
    v2[0] = v4
    v5 = v6
    let v10: s0 = f60(v1)
    let v9: [[Double]] = v1.p0
    let v8: s0 = f60(v1)
    let v13: [[Double]] = v1.p0
    let v15: [[Double]] = v8.p0
    var v21: [[Double]] = v15
    v5.p0 = v13
    v2[0] = v4
    let v12: s0 = f60(v10)
    let v14: Double = v0[0]
    var v11: [Double] = v2
    let v22: s0 = f60(v6)
    let v24: [[Double]] = v22.p1
    let v32: s0 = f60(v5)
    let v31: [Double] = [v14, v14, v4, v14, v14]
    let v26: [[Double]] = v22.p1
    var v41: [[Double]] = v24
    let v55: Double = v31[2]
    let v19: s0 = f60(v32)
    let v25: s0 = f60(v12)
    v2[0] = v4
    let v47: [[Double]] = v32.p0
    v5.p0 = v13
    let v59: [[Double]] = v25.p1
    var v106: [[Double]] = v26
    let v37: s0 = f60(v32)
    var v50: [[Double]] = v24
    let v45: s0 = s0(p0: v9, p1: v106)
    let v68: [[Double]] = v37.p0
    v5.p1 = v41
    v106[0] = v2
    var v56: [[Double]] = v15
    let v125: [Double] = v26[0]
    v56[1] = v2
    v5.p0 = v56
    var v96: [[Double]] = v21
    let v116: [Double] = v59[0]
    v50[0] = v116
    let v63: [Double] = v68[0]
    v5 = v19
    v5.p1 = v24
    v11[0] = v55
    v21[1] = v116
    v5.p0 = v47
    let v79: [Double] = v96[1]
    v41[0] = v11
    v96[1] = v63
    var v61: [Double] = v0
    v50[0] = v0
    v106[0] = v79
    v5.p1 = v41
    v5.p1 = v50
    v56[0] = v125
    v106[0] = v11
    v96[1] = v2
    v2 = v61
    return v45
  }
  func f52(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v3: [[Double]] = v0.p0
    var v8: s0 = v7
    v7.p0 = v3
    var v1: [[Double]] = v3
    var v2: s0 = v0
    var v11: [[Double]] = v1
    let v4: [[Double]] = v8.p0
    let v23: [Double] = v4[0]
    let v13: Double = v23[0]
    let v38: [[Double]] = v0.p0
    let v41: s0 = f60(v7)
    let v17: [Double] = v1[0]
    var v16: Double = v13
    let v49: s0 = f59(v23, v2)
    v2.p0 = v3
    v8.p0 = v11
    let v27: [[Double]] = v0.p1
    var v24: [Double] = v17
    v2.p1 = v27
    v24[0] = v16
    let v50: s0 = f59(v24, v49)
    let v42: s0 = f60(v41)
    v2.p0 = v38
    v8 = v42
    return v50
  }
  func f22(_ v0: s0) -> s0 {
    let v4: s0 = f60(v0)
    let v1: s0 = f52(v4)
    let v11: s0 = f60(v4)
    let v3: [[Double]] = v11.p1
    let v16: [Double] = v3[0]
    let v28: s0 = f59(v16, v1)
    return v28
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s1, _ v2: s0, _ v3: [s0], _ v4: Double) -> Double {
    let v23: s0 = v3[1]
    let v77: s0 = f22(v23)
    let v73: [[Double]] = v77.p1
    let v132: [Double] = v73[0]
    let v66: Double = v132[0]
    return v66
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])])
    let v1: s1 = s1(p0: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0]])], p1: [s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]]), s0(p0: [[33.0], [34.0]], p1: [[35.0]])])
    let v2: s0 = s0(p0: [[36.0], [37.0]], p1: [[38.0]])
    let v3: [s0] = [s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]])]
    let v4: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
