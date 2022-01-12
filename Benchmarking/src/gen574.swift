  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
    var p2: s0
    var p3: [s0]
  }
  func f70(_ v0: [s0], _ v1: [s0]) -> [s0] {
    let v3: s0 = v0[0]
    var v4: s0 = v3
    let v2: [[Double]] = v4.p0
    let v7: [[Double]] = v3.p1
    var v9: [[Double]] = v7
    var v11: [[Double]] = v7
    let v5: [Double] = v9[2]
    let v6: [Double] = v11[1]
    let v19: [Double] = v2[1]
    v9[2] = v19
    let v8: [[Double]] = v3.p0
    let v13: [[Double]] = v3.p0
    v11[2] = v6
    v4.p1 = v9
    var v14: [s0] = v0
    var v21: [[Double]] = v11
    var v10: [[Double]] = v21
    v4.p0 = v2
    v9[2] = v19
    var v18: s0 = v4
    let v49: [[Double]] = v3.p1
    v21[0] = v6
    let v20: [Double] = v8[1]
    v14[0] = v18
    let v34: [[Double]] = v3.p1
    let v30: [[Double]] = v3.p1
    var v24: s0 = v18
    v21 = v10
    let v43: [[Double]] = v4.p0
    let v26: [Double] = v13[1]
    let v80: [Double] = v30[1]
    v9[2] = v80
    v24.p1 = v21
    let v38: [Double] = v34[0]
    let v36: [[Double]] = v3.p1
    v10[0] = v38
    let v46: [[Double]] = v18.p0
    let v90: [Double] = v43[0]
    v24.p0 = v43
    v14[0] = v24
    let v73: [[Double]] = v18.p1
    v14[0] = v18
    let v50: s0 = s0(p0: v8, p1: v73)
    v11[1] = v20
    var v63: [s0] = v14
    let v54: [[Double]] = v50.p1
    var v103: [[Double]] = v46
    v18.p0 = v103
    v9[2] = v26
    v4.p1 = v49
    v18.p1 = v9
    v21[2] = v90
    v24.p1 = v54
    v14 = v0
    v24.p1 = v36
    v24.p1 = v7
    v21[0] = v5
    return v63
  }
  func f22(_ v0: [s0]) -> [s0] {
    let v1: [s0] = f70(v0, v0)
    let v7: [s0] = f70(v1, v0)
    return v7
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    var v2: [[s0]] = v0
    let v3: [s0] = v2[2]
    var v5: [s0] = v3
    v2[0] = v3
    let v7: [s0] = f70(v3, v5)
    var v9: [[s0]] = v0
    v2[1] = v7
    let v13: [s0] = v2[0]
    v2[2] = v5
    let v10: s0 = v13[0]
    let v17: s1 = s1(p0: v9, p1: v10, p2: v10, p3: v13)
    v9[2] = v3
    let v16: s0 = v17.p2
    let v14: [s0] = f22(v3)
    let v23: s1 = s1(p0: v9, p1: v16, p2: v10, p3: v13)
    var v21: s0 = v16
    v9[0] = v7
    let v30: [s0] = v23.p3
    let v19: [[Double]] = v21.p1
    let v33: [Double] = v19[1]
    v21.p1 = v19
    v5[0] = v10
    let v46: s0 = v13[0]
    v2[0] = v3
    let v92: [[Double]] = v21.p1
    let v41: [s0] = f22(v14)
    v9[0] = v30
    v21.p1 = v92
    v2[2] = v3
    v9[0] = v41
    v21 = v46
    let v96: Double = v33[0]
    return v96
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
