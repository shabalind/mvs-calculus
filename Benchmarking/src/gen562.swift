  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[s0]]
  }
  struct s3 {
    var p0: s2
    var p1: [[Double]]
  }
  func f53(_ v0: s3) -> s3 {
    return v0
  }
  func f51(_ v0: Double) -> Double {
    var v5: Double = v0
    var v1: Double = v5
    v1 = v5
    var v6: Double = v0
    var v3: Double = v1
    var v2: Double = v6
    var v9: Double = v6
    var v10: Double = v2
    let v18: [Double] = [v2, v0, v10, v3]
    let v13: [[Double]] = [v18, v18, v18, v18, v18, v18]
    let v21: [Double] = v13[2]
    v1 = v9
    let v58: Double = v21[3]
    v9 = v2
    return v58
  }
  func f41(_ v0: s2) -> s2 {
    let v5: s1 = v0.p0
    var v4: s2 = v0
    let v2: [[s0]] = v0.p1
    v4.p0 = v5
    let v7: [s0] = v2[2]
    let v13: s0 = v5.p1
    v4.p0 = v5
    let v1: [s0] = v2[2]
    let v9: [[s0]] = v4.p1
    let v11: s0 = v5.p1
    var v6: [[s0]] = v2
    let v8: [s0] = v6[2]
    v4.p1 = v6
    v6[2] = v8
    v6 = v9
    let v17: [[s0]] = v4.p1
    let v31: [[s0]] = v0.p1
    v4.p1 = v31
    v6[1] = v7
    var v18: s0 = v11
    let v102: s1 = v0.p0
    var v104: s1 = v102
    v104.p0 = v13
    let v95: s2 = s2(p0: v104, p1: v17)
    v104.p1 = v18
    v6[0] = v1
    let v149: [[Double]] = v18.p0
    v18.p0 = v149
    return v95
  }
  func f39(_ v0: s3, _ v1: s2) -> s3 {
    let v4: s2 = f41(v1)
    let v10: s2 = f41(v4)
    let v8: [[s0]] = v10.p1
    let v13: [s0] = v8[1]
    let v16: s0 = v13[0]
    let v42: s3 = f53(v0)
    let v77: [[Double]] = v16.p0
    var v51: s3 = v42
    let v119: s3 = f53(v51)
    v51.p1 = v77
    return v119
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s3], _ v2: Double) -> Double {
    let v8: s3 = v1[1]
    let v6: s3 = v1[1]
    let v7: s3 = f39(v6, v0)
    let v9: s3 = f39(v7, v0)
    var v12: s3 = v8
    let v16: s3 = f39(v12, v0)
    let v23: [[Double]] = v16.p1
    v12.p1 = v23
    let v25: [Double] = v23[0]
    let v18: Double = f51(v2)
    let v37: Double = v25[0]
    var v40: [Double] = v25
    let v36: [[Double]] = v9.p1
    let v85: Double = v40[0]
    v12.p1 = v36
    let v122: Double = v37 / v85
    v40[0] = v18
    return v122
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [[0.0]], p1: [1.0, 2.0]), p1: s0(p0: [[3.0]], p1: [4.0, 5.0])), p1: [[s0(p0: [[6.0]], p1: [7.0, 8.0])], [s0(p0: [[9.0]], p1: [10.0, 11.0])], [s0(p0: [[12.0]], p1: [13.0, 14.0])]])
    let v1: [s3] = [s3(p0: s2(p0: s1(p0: s0(p0: [[15.0]], p1: [16.0, 17.0]), p1: s0(p0: [[18.0]], p1: [19.0, 20.0])), p1: [[s0(p0: [[21.0]], p1: [22.0, 23.0])], [s0(p0: [[24.0]], p1: [25.0, 26.0])], [s0(p0: [[27.0]], p1: [28.0, 29.0])]]), p1: [[30.0]]), s3(p0: s2(p0: s1(p0: s0(p0: [[31.0]], p1: [32.0, 33.0]), p1: s0(p0: [[34.0]], p1: [35.0, 36.0])), p1: [[s0(p0: [[37.0]], p1: [38.0, 39.0])], [s0(p0: [[40.0]], p1: [41.0, 42.0])], [s0(p0: [[43.0]], p1: [44.0, 45.0])]]), p1: [[46.0]])]
    let v2: Double = 47.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 47.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
