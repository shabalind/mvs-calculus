  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  func f55(_ v0: s3) -> s3 {
    let v2: s1 = v0.p1
    let v6: s0 = v0.p0
    var v15: s0 = v6
    var v5: s3 = v0
    let v1: s0 = v5.p0
    let v7: [[Double]] = v1.p1
    v15.p0 = v7
    v5.p0 = v6
    var v9: s0 = v15
    v5.p1 = v2
    let v18: s0 = v0.p0
    var v11: s1 = v2
    var v25: s1 = v11
    let v23: s0 = v11.p1
    let v16: [s0] = v25.p0
    let v13: [s0] = [v23, v15]
    let v29: s0 = v13[1]
    v15 = v9
    let v27: [[s0]] = [v16, v16, v16, v16]
    let v37: [s0] = v27[1]
    v11.p1 = v18
    v11.p0 = v37
    v5.p1 = v25
    v5.p0 = v29
    return v5
  }
  func f31(_ v0: s3, _ v1: s3) -> s3 {
    let v7: s3 = f55(v1)
    let v5: s1 = v0.p1
    var v19: s1 = v5
    var v24: s3 = v7
    v24.p1 = v19
    return v24
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v3: s3 = f31(v0, v0)
    let v6: s1 = v3.p1
    let v11: s0 = v6.p1
    let v22: [[Double]] = v11.p1
    var v35: [[Double]] = v22
    let v62: [Double] = v35[0]
    let v72: Double = v62[0]
    v35[1] = v62
    return v72
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s1(p0: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])))
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
