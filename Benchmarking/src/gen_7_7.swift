  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f13(_ v0: s1) -> s1 {
    let v2: [s0] = v0.p0
    var v1: [s0] = v2
    var v3: s1 = v0
    v3.p0 = v2
    v3.p0 = v1
    var v7: [s0] = v2
    var v6: s1 = v0
    var v4: s1 = v6
    var v5: [s0] = v1
    let v12: s0 = v1[1]
    let v8: [[Double]] = v12.p1
    var v9: s1 = v4
    var v15: [[Double]] = v8
    var v10: s0 = v12
    let v34: [s0] = v9.p0
    v3.p0 = v5
    var v81: s1 = v3
    v81.p1 = v10
    v1[1] = v12
    v3.p0 = v2
    v81.p1 = v10
    v3.p0 = v34
    v4.p0 = v7
    v1[1] = v12
    v10.p1 = v15
    v5[0] = v10
    return v81
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v7: s1 = v0[1]
    let v6: s1 = v0[2]
    let v3: s1 = f13(v6)
    let v8: s1 = f13(v6)
    let v23: [s0] = v7.p0
    var v10: s1 = v3
    let v13: [s0] = v7.p0
    var v25: [s0] = v13
    v10.p0 = v13
    let v9: s0 = v25[1]
    let v24: s1 = f13(v8)
    v10.p0 = v23
    let v56: [[Double]] = v9.p0
    v10.p1 = v9
    let v43: [Double] = v56[0]
    let v47: s0 = v24.p1
    let v44: s0 = v10.p1
    let v42: Double = v43[0]
    v25[1] = v44
    v25[0] = v47
    return v42
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]])), s1(p0: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]])), s1(p0: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])], p1: s0(p0: [[24.0], [25.0]], p1: [[26.0]]))]
    let v1: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
