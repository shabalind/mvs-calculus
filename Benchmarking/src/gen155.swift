  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  func f76(_ v0: s0, _ v1: s0, _ v2: s0, _ v3: s0, _ v4: s0) -> s0 {
    let v7: [[Double]] = v3.p1
    let v5: [[Double]] = v1.p1
    let v10: [[Double]] = v4.p1
    var v12: s0 = v2
    var v16: s0 = v2
    v16.p1 = v7
    v16.p2 = v10
    let v53: [[Double]] = v4.p0
    let v26: [[Double]] = v12.p1
    let v18: [[Double]] = v4.p0
    v16.p2 = v18
    var v17: s0 = v1
    let v40: [[Double]] = v3.p1
    v17.p2 = v7
    let v64: [[Double]] = v17.p1
    let v23: s0 = s0(p0: v10, p1: v18, p2: v53)
    v16.p1 = v64
    var v44: s0 = v17
    let v41: [[Double]] = v2.p2
    let v39: [s0] = [v44, v17, v0, v2, v16]
    v12 = v17
    let v28: s0 = s0(p0: v53, p1: v40, p2: v64)
    v17.p1 = v5
    var v42: [s0] = v39
    v17.p1 = v41
    let v32: [[Double]] = v16.p0
    v17.p2 = v26
    let v56: [[Double]] = v23.p1
    v42[3] = v28
    v42[4] = v17
    let v58: s0 = v42[0]
    v42[3] = v2
    v12.p0 = v40
    v12.p2 = v53
    v16.p2 = v56
    v16.p1 = v32
    return v58
  }
  func f72(_ v0: s0) -> s0 {
    let v2: s0 = f76(v0, v0, v0, v0, v0)
    var v5: s0 = v2
    let v7: s0 = f76(v0, v5, v0, v5, v2)
    let v8: s0 = f76(v7, v5, v5, v0, v5)
    var v6: s0 = v5
    let v1: [[Double]] = v0.p2
    let v3: [[Double]] = v2.p1
    let v4: s0 = f76(v2, v6, v5, v6, v0)
    let v12: s0 = f76(v2, v4, v5, v8, v0)
    v5.p1 = v3
    let v16: s0 = f76(v6, v2, v12, v8, v5)
    let v19: s0 = s0(p0: v1, p1: v1, p2: v1)
    let v13: s0 = f76(v5, v19, v2, v7, v0)
    let v28: s0 = f76(v12, v0, v13, v16, v13)
    var v56: s0 = v28
    return v56
  }
  func f71(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p1
    var v4: [[Double]] = v6
    var v1: [[Double]] = v6
    var v5: s0 = v0
    var v2: [[Double]] = v6
    var v8: [[Double]] = v6
    let v10: s0 = s0(p0: v6, p1: v4, p2: v1)
    v5.p1 = v8
    v5.p0 = v4
    var v7: s0 = v10
    let v17: s0 = f72(v5)
    v5.p0 = v2
    let v11: s0 = f76(v5, v5, v5, v7, v5)
    v2 = v8
    let v13: s0 = f76(v5, v11, v17, v11, v17)
    return v13
  }
  func f70(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v6: s0 = v4
    let v7: s0 = f72(v0)
    let v5: s0 = f72(v7)
    let v10: s0 = f71(v6)
    let v2: s0 = f71(v0)
    let v3: [[Double]] = v7.p2
    let v8: s0 = f72(v2)
    let v18: [[Double]] = v8.p1
    let v24: s0 = f76(v2, v5, v4, v0, v7)
    v4 = v10
    let v12: [[Double]] = v4.p2
    let v11: [[Double]] = v24.p2
    v6 = v24
    v6.p1 = v12
    let v29: [Double] = v18[0]
    v6.p0 = v18
    let v16: [s0] = [v6, v24, v8, v2, v2]
    let v34: [[Double]] = v10.p2
    v6.p0 = v3
    v4.p0 = v11
    v6.p1 = v34
    var v59: [[Double]] = v11
    v6.p1 = v59
    v59[1] = v29
    let v32: s0 = v16[0]
    return v32
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v4: [[Double]] = v0.p2
    let v5: s0 = f70(v1)
    let v3: [[Double]] = v5.p2
    var v6: [[Double]] = v3
    let v11: [Double] = v4[2]
    var v26: [Double] = v11
    v6[2] = v11
    v6[0] = v11
    let v28: [Double] = v6[2]
    v26[0] = v2
    let v25: Double = v26[0]
    v6[1] = v28
    var v39: Double = v2
    let v32: Double = v26[0]
    v26[0] = v2
    v26[0] = v32
    v26 = v28
    var v44: Double = v39
    v26[0] = v44
    return v25
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]], p2: [[6.0], [7.0], [8.0]])
    let v1: s0 = s0(p0: [[9.0], [10.0], [11.0]], p1: [[12.0], [13.0], [14.0]], p2: [[15.0], [16.0], [17.0]])
    let v2: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
