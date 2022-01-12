  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
    var p2: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: [[s1]]
  }
  func f72(_ v0: s0) -> s0 {
    let v3: [s0] = [v0]
    let v1: s0 = v3[0]
    let v7: s0 = v3[0]
    let v4: [[Double]] = v1.p0
    let v11: [[Double]] = v1.p1
    var v5: [[Double]] = v4
    let v2: [[Double]] = v0.p0
    var v23: s0 = v7
    v23.p1 = v11
    v23.p0 = v5
    v23.p0 = v4
    v23.p0 = v5
    v23.p0 = v4
    let v30: [[Double]] = v23.p1
    let v18: s0 = s0(p0: v4, p1: v30)
    v23.p0 = v4
    let v32: [[Double]] = v18.p0
    v23.p0 = v2
    var v89: s0 = v18
    v23.p0 = v32
    return v89
  }
  func f70(_ v0: s0) -> s0 {
    let v1: s0 = f72(v0)
    let v6: [[Double]] = v0.p1
    var v3: [[Double]] = v6
    let v8: [[Double]] = v0.p1
    var v7: s0 = v1
    v7.p1 = v8
    var v21: [[Double]] = v8
    let v12: [[Double]] = v7.p0
    var v15: [[Double]] = v12
    let v17: [Double] = v3[0]
    var v11: [[Double]] = v21
    var v10: [Double] = v17
    let v14: [Double] = v11[0]
    v21[0] = v14
    let v34: [Double] = v12[0]
    let v35: s0 = s0(p0: v15, p1: v3)
    let v42: Double = v10[0]
    v7.p1 = v11
    v21[0] = v10
    var v20: Double = v42
    let v74: Double = v20 * v42
    v11[0] = v34
    let v94: s0 = f72(v35)
    v3[0] = v14
    v10[0] = v74
    return v94
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s3, _ v2: Double) -> Double {
    let v6: s0 = f70(v0)
    let v19: [[Double]] = v6.p1
    let v11: [Double] = v19[0]
    let v16: Double = v11[0]
    let v26: Double = v2 + v16
    return v26
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
    let v1: s3 = s3(p0: [s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [[s1(p0: [s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])], p2: s0(p0: [[18.0], [19.0]], p1: [[20.0]]))]])
    let v2: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
