  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  struct s3 {
    var p0: s2
    var p1: s0
  }
  func f97(_ v0: s2) -> s2 {
    let v8: [s2] = [v0, v0]
    let v11: s2 = v8[0]
    return v11
  }
  func f92(_ v0: s2) -> s2 {
    let v6: s2 = f97(v0)
    let v15: s2 = f97(v6)
    let v46: [s2] = [v15, v15]
    let v44: s2 = v46[1]
    let v83: s2 = f97(v44)
    let v136: s2 = f97(v83)
    return v136
  }
  func f68(_ v0: Double) -> Double {
    let v7: Double = v0 / v0
    var v4: Double = v0
    let v6: [Double] = [v7]
    var v2: [Double] = v6
    let v1: Double = v6[0]
    let v5: Double = v2[0]
    v2[0] = v4
    let v9: Double = v2[0]
    let v8: [Double] = [v5, v0]
    v2[0] = v7
    let v18: Double = v2[0]
    v2[0] = v1
    var v10: [Double] = v8
    v10[1] = v9
    let v16: Double = v10[0]
    v4 = v5
    v2[0] = v18
    var v42: Double = v16
    return v42
  }
  func f48(_ v0: s2) -> s2 {
    let v1: [s1] = v0.p0
    let v5: s1 = v0.p1
    let v7: s2 = s2(p0: v1, p1: v5)
    var v6: [s1] = v1
    let v3: s1 = v1[0]
    var v4: s2 = v7
    v4.p0 = v6
    let v22: s1 = v1[0]
    var v14: s1 = v22
    v6[0] = v22
    let v18: s1 = v1[0]
    let v15: [[s1]] = [v1]
    v6[0] = v14
    let v16: s0 = v18.p0
    let v28: [s1] = v15[0]
    let v20: [s1] = v4.p0
    v4.p1 = v3
    let v38: s1 = v28[0]
    v6 = v20
    let v40: s2 = s2(p0: v6, p1: v38)
    v14.p0 = v16
    let v37: s0 = v22.p0
    v6[0] = v18
    let v81: s3 = s3(p0: v40, p1: v37)
    let v148: s2 = v81.p0
    let v91: s2 = f92(v148)
    return v91
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v6: [s1] = v0.p0
    var v4: [s1] = v6
    let v5: s1 = v4[1]
    var v3: s2 = v0
    v3.p1 = v5
    let v8: s1 = v0.p1
    let v9: [s1] = v3.p0
    let v2: s2 = f48(v0)
    let v17: s2 = f97(v0)
    v4[0] = v5
    let v11: s1 = v2.p1
    v4[0] = v11
    let v19: [s1] = v17.p0
    v3.p1 = v5
    v4 = v19
    let v27: [s0] = v5.p1
    let v36: s0 = v27[2]
    let v23: [[Double]] = v36.p1
    v3.p1 = v5
    v3.p1 = v8
    v3 = v17
    v3.p0 = v9
    let v76: [Double] = v23[0]
    v4 = v9
    v4 = v6
    let v211: Double = v76[0]
    var v98: Double = v211
    v4[0] = v11
    let v191: Double = f68(v98)
    return v191
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]), s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])])], p1: s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p1: [s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]]), s0(p0: [[33.0], [34.0]], p1: [[35.0]])]))
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
