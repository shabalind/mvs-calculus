  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: s0
    var p3: s0
  }
  struct s4 {
    var p0: s1
    var p1: s1
  }
  func f93(_ v0: s4) -> s4 {
    var v3: s4 = v0
    var v1: s4 = v0
    var v9: s4 = v3
    var v4: s4 = v3
    let v13: s1 = v9.p1
    var v2: s4 = v1
    var v12: s1 = v13
    var v14: s1 = v13
    let v6: s1 = v2.p0
    let v11: [s1] = [v6, v6, v14, v6]
    var v8: s1 = v12
    let v17: s0 = v6.p3
    let v16: s1 = v4.p1
    let v10: s1 = v11[3]
    v3.p0 = v16
    var v18: s4 = v4
    let v25: s1 = v11[0]
    v14.p1 = v17
    let v36: s1 = v11[0]
    v8.p1 = v17
    v4.p1 = v8
    v18.p1 = v25
    v2.p1 = v10
    v1.p0 = v36
    return v18
  }
  func f89(_ v0: s1) -> s1 {
    let v4: s0 = v0.p3
    var v1: s1 = v0
    v1.p2 = v4
    v1.p2 = v4
    var v2: s1 = v1
    return v2
  }
  func f82(_ v0: s1) -> s1 {
    let v5: s1 = f89(v0)
    var v25: s1 = v5
    return v25
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v7: s4 = f93(v0)
    var v6: s4 = v0
    let v3: s1 = v6.p0
    v6 = v7
    var v2: s4 = v7
    let v5: s0 = v3.p1
    let v15: s0 = v3.p3
    v2.p0 = v3
    var v12: s4 = v7
    let v10: s0 = v3.p0
    var v13: s1 = v3
    v6.p1 = v13
    var v24: s0 = v10
    let v17: [[Double]] = v24.p2
    var v20: Double = v1
    let v18: [[Double]] = v10.p2
    v24.p2 = v18
    let v14: s1 = v2.p0
    let v32: [[Double]] = v15.p0
    let v25: s1 = f89(v14)
    let v34: [Double] = v32[0]
    var v29: s0 = v5
    v13.p1 = v29
    var v31: [Double] = v34
    let v30: Double = v1 + v20
    let v53: s1 = v12.p0
    v31[0] = v30
    let v119: s1 = f82(v13)
    var v44: s1 = v119
    let v70: Double = v31[0]
    v12.p0 = v44
    v13.p3 = v24
    v24.p2 = v17
    v6.p0 = v25
    v6.p0 = v53
    v2.p1 = v53
    return v70
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0]], p2: [[2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0]], p2: [[6.0], [7.0]]), p2: s0(p0: [[8.0]], p1: [[9.0]], p2: [[10.0], [11.0]]), p3: s0(p0: [[12.0]], p1: [[13.0]], p2: [[14.0], [15.0]])), p1: s1(p0: s0(p0: [[16.0]], p1: [[17.0]], p2: [[18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0]], p2: [[22.0], [23.0]]), p2: s0(p0: [[24.0]], p1: [[25.0]], p2: [[26.0], [27.0]]), p3: s0(p0: [[28.0]], p1: [[29.0]], p2: [[30.0], [31.0]])))
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
