  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s3 {
    var p0: s1
    var p1: [[s1]]
  }
  func f78(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v7: [[Double]] = v4.p0
    let v1: [[Double]] = v4.p1
    v4 = v0
    v4.p1 = v1
    v4.p0 = v7
    let v34: [[Double]] = v4.p0
    let v29: [[Double]] = v0.p1
    let v20: [[Double]] = v0.p0
    v4.p1 = v1
    v4.p0 = v20
    v4.p1 = v29
    v4.p0 = v34
    let v28: [[Double]] = v0.p1
    v4.p1 = v28
    var v83: s0 = v4
    return v83
  }
  func f68(_ v0: [s0]) -> [s0] {
    let v6: s0 = v0[0]
    let v7: [[Double]] = v6.p1
    var v8: [[Double]] = v7
    var v3: s0 = v6
    let v4: [[Double]] = v3.p0
    var v5: [s0] = v0
    v3 = v6
    var v12: [s0] = v5
    let v15: s0 = f78(v6)
    let v19: [Double] = v4[1]
    let v9: [[Double]] = v6.p0
    let v17: s0 = f78(v6)
    v12[0] = v6
    let v14: s0 = v0[0]
    v3.p1 = v7
    var v34: [Double] = v19
    var v16: s0 = v14
    let v30: [[Double]] = v15.p0
    let v21: s0 = v12[0]
    var v33: [[Double]] = v30
    v12[0] = v6
    v33[0] = v34
    v16.p1 = v8
    let v32: [[Double]] = v21.p0
    v8[0] = v34
    v12[0] = v3
    v3.p0 = v32
    v16.p0 = v9
    v12[0] = v21
    v3.p0 = v33
    let v97: [[Double]] = v17.p1
    v3.p0 = v32
    v5[0] = v16
    v16.p1 = v97
    var v169: [s0] = v12
    return v169
  }
  func f33(_ v0: s3, _ v1: s0) -> s0 {
    let v5: s0 = f78(v1)
    var v7: s0 = v1
    let v12: [[Double]] = v1.p1
    v7.p1 = v12
    let v25: [[Double]] = v5.p0
    v7.p1 = v12
    v7.p0 = v25
    return v7
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v5: s3 = v0[0]
    let v3: s1 = v5.p0
    let v12: [[s0]] = v3.p1
    let v8: [s0] = v12[0]
    let v6: s0 = v8[0]
    let v9: [s0] = f68(v8)
    let v16: s0 = v9[0]
    var v11: [s0] = v9
    v11[0] = v16
    let v19: s0 = v11[0]
    v11 = v9
    let v25: [[s0]] = v3.p1
    let v78: [[Double]] = v19.p1
    v11[0] = v6
    let v60: [s0] = v25[0]
    v11 = v60
    let v22: s0 = f33(v5, v19)
    v11[0] = v6
    v11[0] = v19
    var v47: [[Double]] = v78
    v11[0] = v22
    v11[0] = v16
    let v113: [Double] = v47[0]
    let v79: Double = v113[0]
    return v79
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]])], p1: [[s0(p0: [[3.0], [4.0]], p1: [[5.0]])], [s0(p0: [[6.0], [7.0]], p1: [[8.0]])]]), p1: [[s1(p0: [s0(p0: [[9.0], [10.0]], p1: [[11.0]])], p1: [[s0(p0: [[12.0], [13.0]], p1: [[14.0]])], [s0(p0: [[15.0], [16.0]], p1: [[17.0]])]])]])]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
