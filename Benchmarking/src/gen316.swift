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
    var p0: [Double]
  }
  struct s3 {
    var p0: s2
    var p1: s0
  }
  struct s4 {
    var p0: s2
    var p1: [s2]
  }
  struct s5 {
    var p0: s0
    var p1: s0
    var p2: [s2]
    var p3: s1
    var p4: [s2]
  }
  func f31(_ v0: [s3]) -> [s3] {
    var v2: [s3] = v0
    let v7: [[s3]] = [v2, v2]
    let v5: [s3] = v7[1]
    var v21: [s3] = v5
    v21 = v0
    v21 = v2
    v2 = v0
    let v81: s3 = v2[2]
    v21[1] = v81
    return v21
  }
  func f29(_ v0: [s1]) -> [s1] {
    var v7: [s1] = v0
    let v10: [[s1]] = [v7, v7, v0]
    v7 = v0
    let v44: [s1] = v10[2]
    return v44
  }
  func f25(_ v0: s3) -> s3 {
    let v6: [s3] = [v0, v0, v0, v0, v0, v0, v0]
    var v2: s3 = v0
    let v5: s2 = v2.p0
    let v9: [Double] = v5.p0
    let v7: s3 = v6[1]
    let v13: Double = v9[1]
    let v14: s0 = v2.p1
    v2.p1 = v14
    let v4: Double = v9[1]
    var v25: [Double] = v9
    var v17: Double = v4
    let v35: Double = v9[1]
    let v15: Double = v9[0]
    var v18: s2 = v5
    var v36: Double = v35
    v25[0] = v36
    var v41: [Double] = v25
    var v12: s3 = v7
    let v16: s3 = v6[2]
    v18.p0 = v25
    v25[1] = v13
    let v21: Double = v41[0]
    v41[1] = v17
    v2 = v16
    v12.p0 = v18
    v2.p1 = v14
    v25[1] = v21
    v41[1] = v15
    v18.p0 = v9
    return v12
  }
  func f16(_ v0: s1) -> s1 {
    var v1: s1 = v0
    var v5: s1 = v1
    v5 = v1
    let v3: s0 = v0.p1
    v5.p1 = v3
    var v2: s1 = v5
    return v2
  }
  func f5(_ v0: Double, _ v1: s3) -> Double {
    let v2: s2 = v1.p0
    let v3: [Double] = v2.p0
    let v11: [[Double]] = [v3, v3, v3, v3, v3, v3]
    let v16: [Double] = v11[4]
    var v14: [[Double]] = v11
    v14[4] = v16
    let v22: [Double] = v14[5]
    let v15: [Double] = v14[1]
    let v44: Double = v22[1]
    let v119: [Double] = v14[0]
    v14[0] = v15
    v14[3] = v16
    var v184: [Double] = v119
    v14[5] = v184
    v14[0] = v3
    return v44
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: [[s4]], _ v2: [s5], _ v3: Double) -> Double {
    let v6: s5 = v2[0]
    let v4: s3 = v0[1]
    let v5: s1 = v6.p3
    var v11: s3 = v4
    let v18: [s1] = [v5, v5]
    let v14: [s1] = f29(v18)
    let v32: [s3] = f31(v0)
    let v29: s3 = f25(v11)
    let v59: s5 = v2[0]
    let v47: s1 = v14[0]
    let v33: Double = f5(v3, v29)
    let v60: s3 = v32[1]
    let v85: s0 = v59.p1
    let v70: s1 = f16(v47)
    v11.p1 = v85
    let v74: s3 = f25(v60)
    let v174: Double = f5(v33, v74)
    let v165: s0 = v70.p1
    v11.p1 = v165
    return v174
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s2(p0: [0.0, 1.0]), p1: s0(p0: [[2.0], [3.0], [4.0]], p1: [[5.0]])), s3(p0: s2(p0: [6.0, 7.0]), p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])), s3(p0: s2(p0: [12.0, 13.0]), p1: s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0]]))]
    let v1: [[s4]] = [[s4(p0: s2(p0: [18.0, 19.0]), p1: [s2(p0: [20.0, 21.0]), s2(p0: [22.0, 23.0]), s2(p0: [24.0, 25.0])])], [s4(p0: s2(p0: [26.0, 27.0]), p1: [s2(p0: [28.0, 29.0]), s2(p0: [30.0, 31.0]), s2(p0: [32.0, 33.0])])]]
    let v2: [s5] = [s5(p0: s0(p0: [[34.0], [35.0], [36.0]], p1: [[37.0]]), p1: s0(p0: [[38.0], [39.0], [40.0]], p1: [[41.0]]), p2: [s2(p0: [42.0, 43.0]), s2(p0: [44.0, 45.0])], p3: s1(p0: [s0(p0: [[46.0], [47.0], [48.0]], p1: [[49.0]]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0]])], p1: s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0]])), p4: [s2(p0: [58.0, 59.0]), s2(p0: [60.0, 61.0]), s2(p0: [62.0, 63.0])])]
    let v3: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
