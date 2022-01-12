  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: s0
    var p1: [s0]
  }
  func f2(_ v0: s3) -> s3 {
    var v5: s3 = v0
    var v3: s3 = v5
    let v4: [s0] = v3.p1
    let v6: s0 = v5.p0
    let v10: [[Double]] = v6.p0
    var v8: s3 = v3
    v3.p1 = v4
    let v7: s0 = v4[0]
    v3.p1 = v4
    var v2: s3 = v8
    let v1: s0 = v4[1]
    v2.p0 = v1
    let v13: [[Double]] = v7.p0
    var v15: [[Double]] = v10
    var v22: s0 = v7
    v15 = v13
    let v19: [s0] = v3.p1
    let v17: [s0] = v5.p1
    let v18: s0 = v8.p0
    let v12: [Double] = v13[1]
    let v14: [Double] = v13[0]
    v3.p0 = v18
    v22.p0 = v15
    let v20: [Double] = v10[0]
    v15[0] = v14
    v15[1] = v20
    v15[0] = v14
    v3.p1 = v17
    v15[0] = v14
    v2.p0 = v22
    v15[1] = v12
    v15[1] = v12
    let v44: [s0] = v3.p1
    let v50: s0 = v19[1]
    v22.p0 = v15
    v8.p1 = v44
    v8.p0 = v50
    return v2
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s3], _ v2: Double) -> Double {
    let v5: s3 = v1[0]
    let v7: s3 = f2(v0)
    var v4: s3 = v7
    let v9: s3 = f2(v4)
    var v6: s3 = v0
    var v13: [s3] = v1
    let v18: [s0] = v5.p1
    v6.p1 = v18
    let v12: s3 = f2(v9)
    v4.p1 = v18
    let v27: s3 = v13[0]
    v13[0] = v4
    var v14: s3 = v0
    v13[0] = v0
    let v22: s3 = f2(v7)
    let v38: [s0] = v6.p1
    let v11: [s0] = v12.p1
    let v20: s0 = v9.p0
    let v28: [[Double]] = v20.p0
    let v35: s0 = v11[1]
    let v25: s3 = f2(v14)
    let v23: s0 = v14.p0
    let v48: s0 = v38[0]
    v14.p0 = v48
    v13[0] = v6
    v6.p0 = v23
    v4.p1 = v38
    let v33: s3 = f2(v22)
    let v30: [s0] = v25.p1
    let v26: s3 = f2(v6)
    let v41: s3 = f2(v26)
    let v139: [Double] = v28[1]
    let v64: [s0] = v27.p1
    let v49: [s0] = v0.p1
    v4.p0 = v48
    let v88: s3 = f2(v41)
    v6.p1 = v30
    let v62: Double = v139[0]
    let v81: s3 = f2(v33)
    v4.p1 = v49
    let v148: s3 = f2(v88)
    v6.p0 = v35
    v13[0] = v9
    var v122: s3 = v81
    v4.p1 = v64
    v13[0] = v122
    v13[0] = v148
    v6.p0 = v35
    return v62
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])])
    let v1: [s3] = [s3(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])])]
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
