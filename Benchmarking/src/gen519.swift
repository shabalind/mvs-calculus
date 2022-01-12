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
    var p0: s1
    var p1: s1
  }
  func f9(_ v0: s3) -> s3 {
    let v7: s1 = v0.p1
    var v3: s3 = v0
    let v1: [s0] = v7.p0
    var v10: s3 = v3
    var v24: [s0] = v1
    var v12: s1 = v7
    v10.p0 = v7
    let v16: s1 = v10.p0
    let v22: s0 = v24[1]
    v10.p1 = v16
    v24[1] = v22
    v10.p0 = v12
    v12.p0 = v24
    v10 = v3
    return v10
  }
  func f4(_ v0: s0, _ v1: s3) -> s0 {
    let v2: s3 = f9(v1)
    var v3: s3 = v2
    let v6: [[Double]] = v0.p0
    let v8: [[[Double]]] = [v6]
    let v7: [[Double]] = v0.p1
    let v15: s3 = f9(v2)
    let v10: s1 = v3.p0
    let v12: s3 = f9(v15)
    let v9: s0 = v10.p1
    let v25: [[Double]] = v9.p1
    let v19: s1 = v1.p0
    let v27: [[Double]] = v8[0]
    let v30: s1 = v12.p1
    v3.p0 = v19
    var v42: [[Double]] = v25
    v3.p1 = v10
    let v22: [s0] = [v9, v9, v0, v0]
    var v58: [s0] = v22
    let v70: s0 = v10.p1
    v3.p0 = v30
    v3.p0 = v10
    var v59: s1 = v30
    let v81: s0 = s0(p0: v27, p1: v42)
    let v29: [s0] = v10.p0
    v3.p0 = v59
    var v44: [s0] = v29
    v59.p1 = v70
    v59.p0 = v29
    v59.p0 = v44
    v3.p1 = v10
    v42 = v7
    let v83: s0 = v58[3]
    v58[2] = v81
    v44[2] = v9
    v59.p1 = v0
    return v83
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    var v7: Double = v1
    let v6: [s1] = v0[0]
    let v4: s1 = v6[0]
    var v15: Double = v1
    let v11: s0 = v4.p1
    let v29: s3 = s3(p0: v4, p1: v4)
    let v14: s0 = f4(v11, v29)
    let v16: [[Double]] = v14.p0
    let v17: Double = v7 - v15
    let v26: [Double] = v16[0]
    let v25: Double = v26[0]
    let v48: Double = v17 * v25
    return v48
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0]], p1: [[7.0]]))], [s1(p0: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]])], p1: s0(p0: [[14.0]], p1: [[15.0]]))], [s1(p0: [s0(p0: [[16.0]], p1: [[17.0]]), s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]])], p1: s0(p0: [[22.0]], p1: [[23.0]]))]]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
