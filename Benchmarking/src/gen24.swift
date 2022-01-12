  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s3 {
    var p0: [[s2]]
    var p1: Double
    var p2: [s0]
  }
  struct s8 {
    var p0: [s1]
    var p1: [s3]
  }
  func f37(_ v0: s3) -> s3 {
    let v6: [s0] = v0.p2
    let v2: [s0] = v0.p2
    var v16: s3 = v0
    v16.p2 = v6
    v16.p2 = v2
    v16.p2 = v2
    var v49: s3 = v0
    v16 = v49
    var v45: s3 = v16
    return v45
  }
  func f36(_ v0: s3) -> s3 {
    let v3: Double = v0.p1
    var v5: s3 = v0
    let v2: s3 = f37(v5)
    let v4: [[s2]] = v5.p0
    v5 = v0
    v5.p1 = v3
    var v7: Double = v3
    let v6: [s2] = v4[0]
    var v12: [s2] = v6
    let v9: [[s2]] = v5.p0
    let v17: [s2] = v4[0]
    var v13: [[s2]] = v9
    v13[0] = v12
    let v15: [s0] = v5.p2
    v13[0] = v12
    let v22: [s2] = v9[0]
    let v18: Double = v2.p1
    v5.p1 = v18
    v13[0] = v22
    let v55: s3 = s3(p0: v4, p1: v7, p2: v15)
    var v37: [s2] = v12
    v13[0] = v12
    let v100: s3 = f37(v55)
    v13[0] = v37
    let v50: s2 = v17[0]
    v12[0] = v50
    v5.p0 = v13
    v13[0] = v6
    return v100
  }
  func f34(_ v0: s3) -> s3 {
    let v7: s3 = f37(v0)
    var v1: s3 = v7
    let v6: Double = v1.p1
    var v4: s3 = v1
    let v5: Double = v1.p1
    var v11: Double = v6
    let v15: [s0] = v0.p2
    v4.p2 = v15
    v1.p1 = v11
    v1.p2 = v15
    let v13: s3 = f37(v0)
    v4.p1 = v5
    let v47: Double = v7.p1
    let v18: s3 = f36(v1)
    let v30: s3 = f36(v4)
    let v25: [s0] = v18.p2
    v1 = v13
    v4.p2 = v25
    let v20: [s0] = v4.p2
    v1.p1 = v47
    let v35: Double = v6 + v47
    v1.p1 = v35
    v1.p2 = v20
    v1.p2 = v15
    let v163: s3 = f37(v30)
    let v170: s3 = f37(v163)
    return v170
  }
  func f25(_ v0: s3) -> s3 {
    var v1: s3 = v0
    let v5: s3 = f36(v0)
    let v8: [[s2]] = v1.p0
    let v2: [s2] = v8[0]
    let v13: Double = v5.p1
    var v6: Double = v13
    var v10: Double = v6
    let v11: s3 = f37(v1)
    var v14: [s2] = v2
    v1.p1 = v10
    var v21: [[s2]] = v8
    v21[0] = v14
    v1.p0 = v21
    v1.p1 = v6
    return v11
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: s1, _ v2: Double) -> Double {
    let v3: s8 = v0[0]
    let v39: [s3] = v3.p1
    let v50: s3 = v39[0]
    let v69: s3 = f25(v50)
    let v72: s3 = f34(v69)
    let v149: s3 = f36(v72)
    let v136: s3 = f34(v149)
    let v93: s3 = f34(v136)
    let v83: Double = v93.p1
    return v83
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0]], p3: [[4.0]]), p1: s0(p0: [[5.0]], p1: [[6.0], [7.0]], p2: [[8.0]], p3: [[9.0]])), s1(p0: s0(p0: [[10.0]], p1: [[11.0], [12.0]], p2: [[13.0]], p3: [[14.0]]), p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]], p2: [[18.0]], p3: [[19.0]])), s1(p0: s0(p0: [[20.0]], p1: [[21.0], [22.0]], p2: [[23.0]], p3: [[24.0]]), p1: s0(p0: [[25.0]], p1: [[26.0], [27.0]], p2: [[28.0]], p3: [[29.0]]))], p1: [s3(p0: [[s2(p0: s0(p0: [[30.0]], p1: [[31.0], [32.0]], p2: [[33.0]], p3: [[34.0]]), p1: s1(p0: s0(p0: [[35.0]], p1: [[36.0], [37.0]], p2: [[38.0]], p3: [[39.0]]), p1: s0(p0: [[40.0]], p1: [[41.0], [42.0]], p2: [[43.0]], p3: [[44.0]])))]], p1: 45.0, p2: [s0(p0: [[46.0]], p1: [[47.0], [48.0]], p2: [[49.0]], p3: [[50.0]]), s0(p0: [[51.0]], p1: [[52.0], [53.0]], p2: [[54.0]], p3: [[55.0]]), s0(p0: [[56.0]], p1: [[57.0], [58.0]], p2: [[59.0]], p3: [[60.0]])])])]
    let v1: s1 = s1(p0: s0(p0: [[61.0]], p1: [[62.0], [63.0]], p2: [[64.0]], p3: [[65.0]]), p1: s0(p0: [[66.0]], p1: [[67.0], [68.0]], p2: [[69.0]], p3: [[70.0]]))
    let v2: Double = 71.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 71.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
