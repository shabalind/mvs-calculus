  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s2
    var p1: [s2]
  }
  struct s5 {
    var p0: [[s2]]
    var p1: s2
    var p2: s0
  }
  struct s6 {
    var p0: s5
    var p1: Double
  }
  struct s9 {
    var p0: s3
    var p1: s6
  }
  func f5(_ v0: s6) -> s6 {
    var v1: s6 = v0
    let v6: [s6] = [v0, v0]
    let v4: s6 = v6[0]
    let v2: Double = v0.p1
    let v8: s6 = v6[0]
    v1.p1 = v2
    let v7: Double = v8.p1
    let v3: Double = v1.p1
    v1.p1 = v3
    let v12: s6 = v6[0]
    v1.p1 = v7
    let v5: s6 = v6[0]
    let v11: s5 = v5.p0
    v1.p0 = v11
    v1.p1 = v2
    let v15: s5 = v12.p0
    let v17: Double = v4.p1
    let v35: s6 = v6[0]
    var v18: s6 = v0
    let v34: Double = v18.p1
    let v64: Double = v35.p1
    v1.p1 = v64
    let v32: [s5] = [v11, v11, v11, v15]
    let v53: Double = v17 + v3
    var v29: Double = v53
    v18.p1 = v34
    var v56: Double = v34
    v18.p1 = v56
    v18.p1 = v64
    v18.p1 = v3
    v18.p1 = v29
    let v84: s5 = v32[0]
    let v184: s6 = s6(p0: v84, p1: v56)
    return v184
  }
  @inline(never)
  func f0(_ v0: [[s9]], _ v1: Double) -> Double {
    let v4: [s9] = v0[0]
    var v5: [s9] = v4
    let v3: [s9] = v0[0]
    let v11: s9 = v5[0]
    let v7: s3 = v11.p0
    let v6: s2 = v7.p0
    let v10: s0 = v6.p0
    v5[0] = v11
    let v2: Double = v1 * v1
    let v22: s9 = v4[0]
    let v8: Double = v1 / v1
    var v15: Double = v2
    var v18: Double = v1
    let v14: s9 = v3[0]
    var v43: s9 = v22
    v5[0] = v43
    v43.p0 = v7
    var v17: Double = v15
    let v29: s6 = v14.p1
    let v39: [s6] = [v29, v29]
    v43.p0 = v7
    let v37: [[Double]] = v10.p1
    let v135: s6 = v39[0]
    let v55: s6 = f5(v135)
    let v75: Double = v55.p1
    let v46: [Double] = v37[1]
    v17 = v8
    let v82: Double = v46[0]
    let v116: [Double] = [v8, v17, v75, v18, v75, v82, v2]
    let v96: Double = v116[4]
    return v96
  }
  func benchmark() {
    let v0: [[s9]] = [[s9(p0: s3(p0: s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]])), p1: [s2(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]])), s2(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]])), s2(p0: s0(p0: [[18.0]], p1: [[19.0], [20.0]]), p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]]))]), p1: s6(p0: s5(p0: [[s2(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: s0(p0: [[27.0]], p1: [[28.0], [29.0]]))]], p1: s2(p0: s0(p0: [[30.0]], p1: [[31.0], [32.0]]), p1: s0(p0: [[33.0]], p1: [[34.0], [35.0]])), p2: s0(p0: [[36.0]], p1: [[37.0], [38.0]])), p1: 39.0))]]
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
