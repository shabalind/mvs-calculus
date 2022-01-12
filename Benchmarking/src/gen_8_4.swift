  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: [[s1]]
  }
  func f11(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v2: s0 = v4
    var v3: s0 = v4
    let v11: [[Double]] = v3.p0
    v2.p0 = v11
    let v6: [Double] = v11[0]
    let v5: [[Double]] = v4.p0
    let v8: [Double] = v5[1]
    let v9: [[Double]] = v2.p0
    var v10: [Double] = v6
    let v7: [[Double]] = v0.p0
    var v24: [[Double]] = v9
    let v16: [[Double]] = v2.p0
    let v28: Double = v8[0]
    v2.p0 = v7
    var v17: Double = v28
    v4.p0 = v11
    v24[1] = v10
    v4.p0 = v16
    var v26: Double = v17
    v10[0] = v28
    v24[0] = v8
    let v22: s0 = s0(p0: v24, p1: v24)
    v4 = v22
    v10[0] = v26
    v10[0] = v28
    return v22
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v6: s2 = v0
    let v10: [[s1]] = v6.p1
    let v7: [[s1]] = v0.p1
    let v9: [s1] = v10[0]
    let v15: [s1] = v10[1]
    v6.p1 = v7
    let v5: s1 = v9[0]
    var v30: s2 = v0
    let v11: [s2] = [v6, v6, v30, v6, v30, v30]
    let v36: s2 = v11[3]
    var v22: s1 = v5
    let v18: [[s1]] = v6.p1
    let v23: [s0] = v22.p0
    let v34: [[s1]] = v36.p1
    let v20: [s1] = v34[2]
    let v38: s1 = v9[0]
    v22.p0 = v23
    let v53: s0 = v23[1]
    let v51: [[Double]] = v53.p0
    let v54: s0 = v23[1]
    var v28: s1 = v22
    v22 = v28
    v28 = v22
    let v24: [Double] = v51[1]
    let v37: s0 = v5.p1
    let v55: [s0] = v5.p0
    let v103: s0 = f11(v37)
    let v65: s0 = f11(v54)
    v6.p0 = v20
    var v40: [s0] = v55
    v30.p1 = v18
    let v57: s0 = f11(v37)
    v6.p1 = v34
    let v71: s0 = f11(v65)
    v28.p0 = v40
    v40[1] = v57
    let v73: s0 = f11(v103)
    v6.p1 = v10
    var v44: s1 = v38
    v40[0] = v103
    v28.p1 = v71
    let v80: [s0] = v44.p0
    v28.p0 = v80
    let v56: s1 = v15[0]
    v22.p1 = v71
    let v116: s0 = v56.p1
    v40[0] = v73
    let v157: Double = v24[0]
    v22.p1 = v116
    return v157
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))], p1: [[s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]))], [s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])], p1: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]))], [s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])], p1: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]))]])
    let v1: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
