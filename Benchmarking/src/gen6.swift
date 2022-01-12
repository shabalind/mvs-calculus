  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
    var p2: s0
  }
  struct s2 {
    var p0: s1
  }
  func f102(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    let v6: [[Double]] = v0.p1
    let v8: [[Double]] = v0.p1
    var v15: s0 = v0
    let v7: [[Double]] = v15.p1
    v15.p0 = v6
    v15.p1 = v4
    let v2: [[Double]] = v15.p0
    v15.p0 = v2
    let v12: [[Double]] = v15.p0
    v15.p0 = v12
    let v13: [[Double]] = v0.p1
    var v21: s0 = v0
    let v9: [[Double]] = v15.p0
    v21.p0 = v4
    let v18: [Double] = v9[0]
    var v20: s0 = v15
    v21.p0 = v6
    var v33: [[Double]] = v4
    v33[0] = v18
    v33[0] = v18
    v15.p0 = v33
    v15 = v21
    let v32: [[Double]] = v21.p0
    let v41: [[Double]] = v21.p0
    v15.p1 = v8
    v15.p0 = v41
    v15.p0 = v7
    v21.p0 = v8
    let v49: [[Double]] = v20.p1
    let v104: [Double] = v32[0]
    let v46: [[Double]] = v15.p1
    v21.p0 = v6
    v15.p0 = v49
    var v34: s0 = v0
    let v95: [[Double]] = v20.p0
    v21.p0 = v13
    v34.p1 = v46
    let v77: [[Double]] = v15.p0
    v33[0] = v104
    v15.p1 = v41
    v20.p0 = v95
    v15.p1 = v77
    return v34
  }
  func f89(_ v0: s0) -> s0 {
    var v2: s0 = v0
    let v5: s0 = f102(v2)
    return v5
  }
  func f74(_ v0: s0) -> s0 {
    let v8: s0 = f89(v0)
    let v1: s0 = f102(v8)
    let v5: s0 = f102(v1)
    let v3: s0 = f102(v5)
    let v10: [[Double]] = v8.p0
    let v14: s0 = f102(v3)
    var v25: s0 = v14
    v25.p1 = v10
    let v36: [[Double]] = v3.p1
    v25.p1 = v36
    return v25
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s2, _ v2: Double) -> Double {
    let v3: s0 = v0.p2
    let v11: s0 = f74(v3)
    let v49: Double = v2 / v2
    let v36: [[Double]] = v11.p1
    var v59: Double = v49
    let v71: [Double] = v36[0]
    var v137: [Double] = v71
    v137[0] = v59
    v137[0] = v2
    let v177: Double = v137[0]
    return v177
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0]], p1: [[1.0]])], [s0(p0: [[2.0]], p1: [[3.0]])], [s0(p0: [[4.0]], p1: [[5.0]])]], p1: s0(p0: [[6.0]], p1: [[7.0]]), p2: s0(p0: [[8.0]], p1: [[9.0]]))
    let v1: s2 = s2(p0: s1(p0: [[s0(p0: [[10.0]], p1: [[11.0]])], [s0(p0: [[12.0]], p1: [[13.0]])], [s0(p0: [[14.0]], p1: [[15.0]])]], p1: s0(p0: [[16.0]], p1: [[17.0]]), p2: s0(p0: [[18.0]], p1: [[19.0]])))
    let v2: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
