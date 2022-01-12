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
    var p1: [Double]
  }
  struct s3 {
    var p0: [s2]
    var p1: s2
  }
  func f51(_ v0: s2) -> s2 {
    var v4: s2 = v0
    var v2: s2 = v0
    let v8: [Double] = v4.p1
    let v12: [s1] = v0.p0
    v4.p1 = v8
    let v3: [Double] = v4.p1
    v2.p1 = v3
    v2.p1 = v8
    let v7: s1 = v12[1]
    v4.p1 = v8
    let v11: [Double] = v4.p1
    let v18: [Double] = v0.p1
    let v10: [s1] = v4.p0
    v2.p1 = v18
    let v17: [Double] = v4.p1
    v2.p1 = v3
    let v20: Double = v11[1]
    v2.p0 = v10
    v2.p1 = v3
    let v22: [s1] = v2.p0
    v4.p1 = v11
    var v35: Double = v20
    let v24: s1 = v10[1]
    v4.p1 = v3
    let v60: Double = v35 / v35
    v4.p0 = v12
    v2.p1 = v17
    v2.p1 = v11
    let v42: [Double] = v4.p1
    v4.p0 = v22
    var v37: [s1] = v22
    var v25: [Double] = v8
    let v49: s2 = s2(p0: v37, p1: v11)
    v2.p1 = v42
    v4.p1 = v25
    v37[0] = v24
    v4 = v49
    v2.p1 = v18
    let v46: [s1] = v0.p0
    v25[0] = v60
    v2.p0 = v46
    v4.p0 = v46
    v4.p1 = v18
    v37[1] = v7
    v4.p1 = v17
    return v2
  }
  func f40(_ v0: s3) -> s3 {
    let v4: s2 = v0.p1
    var v3: s2 = v4
    let v1: s2 = f51(v4)
    var v7: s3 = v0
    var v6: s2 = v4
    var v2: s3 = v7
    v7.p1 = v6
    let v9: s2 = f51(v1)
    let v15: [Double] = v9.p1
    var v18: s3 = v2
    v18.p1 = v3
    v3.p1 = v15
    v7 = v18
    return v7
  }
  func f36(_ v0: s2) -> s2 {
    let v7: s2 = f51(v0)
    let v6: s2 = f51(v0)
    var v1: s2 = v0
    let v2: [s1] = v1.p0
    let v8: s2 = f51(v1)
    let v4: s2 = f51(v6)
    let v10: [Double] = v7.p1
    var v3: [Double] = v10
    let v5: [s1] = v6.p0
    let v9: [Double] = v7.p1
    var v12: [s1] = v2
    v1.p0 = v12
    let v13: Double = v10[1]
    var v18: Double = v13
    v3[1] = v18
    v1.p1 = v9
    let v17: s2 = f51(v8)
    v3[0] = v13
    v1.p0 = v5
    v1.p0 = v2
    let v15: s2 = f51(v17)
    v3[1] = v13
    v1.p0 = v5
    var v34: [Double] = v3
    v1.p1 = v3
    var v29: s2 = v4
    v29 = v15
    let v30: [Double] = v17.p1
    v29.p1 = v30
    v1.p1 = v34
    v1.p0 = v2
    return v29
  }
  func f29(_ v0: s3) -> s3 {
    var v1: s3 = v0
    let v8: s3 = f40(v0)
    let v6: s3 = f40(v8)
    let v3: [s2] = v8.p0
    let v2: [s2] = v6.p0
    let v4: s2 = v2[0]
    let v10: s2 = f36(v4)
    let v20: s2 = f36(v10)
    var v33: s3 = v1
    v33.p1 = v20
    v33.p1 = v4
    v33.p0 = v3
    return v33
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v4: s3 = f29(v0)
    let v7: s2 = v4.p1
    let v11: [Double] = v7.p1
    let v19: [[Double]] = [v11, v11, v11, v11, v11, v11]
    let v57: [Double] = v19[1]
    var v28: [[Double]] = v19
    let v46: [Double] = v28[3]
    v28[4] = v57
    let v108: Double = v46[0]
    return v108
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]), s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])])], p1: [24.0, 25.0])], p1: s2(p0: [s1(p0: s0(p0: [[26.0], [27.0]], p1: [[28.0]]), p1: [s0(p0: [[29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0]], p1: [[34.0]]), s0(p0: [[35.0], [36.0]], p1: [[37.0]])]), s1(p0: s0(p0: [[38.0], [39.0]], p1: [[40.0]]), p1: [s0(p0: [[41.0], [42.0]], p1: [[43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0]]), s0(p0: [[47.0], [48.0]], p1: [[49.0]])])], p1: [50.0, 51.0]))
    let v1: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
