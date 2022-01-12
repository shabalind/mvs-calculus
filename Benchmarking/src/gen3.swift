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
    var p0: [s0]
    var p1: s1
  }
  func f16(_ v0: [Double]) -> [Double] {
    let v5: Double = v0[0]
    let v4: Double = v0[0]
    var v6: Double = v5
    let v11: Double = v0[0]
    v6 = v11
    var v9: [Double] = v0
    let v2: Double = v9[0]
    let v10: Double = v0[0]
    v9[0] = v6
    var v18: [Double] = v0
    let v12: Double = v9[0]
    var v13: [Double] = v18
    var v17: [Double] = v18
    let v16: Double = v17[0]
    let v23: Double = v18[0]
    var v43: Double = v12
    var v28: [Double] = v13
    let v38: Double = v17[0]
    let v26: Double = v2 - v6
    v18[0] = v4
    v9[0] = v26
    let v37: Double = v17[0]
    var v34: [Double] = v17
    let v30: Double = v28[0]
    v17[0] = v6
    v13[0] = v38
    v9[0] = v30
    v17[0] = v43
    var v82: [Double] = v9
    var v31: Double = v10
    v28[0] = v37
    v18[0] = v23
    v82[0] = v16
    v9[0] = v23
    let v68: Double = v82[0]
    var v77: [Double] = v34
    v13[0] = v31
    var v84: Double = v6
    var v69: [Double] = v77
    v34[0] = v26
    v18[0] = v6
    v9[0] = v68
    v18[0] = v68
    v34[0] = v84
    return v69
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [[s3]], _ v2: Double) -> Double {
    var v5: s1 = v0
    let v10: [s0] = v5.p0
    let v7: s0 = v10[0]
    v5.p1 = v7
    v5.p0 = v10
    let v28: [[Double]] = v7.p0
    var v26: [[Double]] = v28
    let v38: [Double] = v26[0]
    var v46: [Double] = v38
    let v32: [Double] = f16(v46)
    var v77: Double = v2
    v26[0] = v32
    let v138: Double = v38[0]
    v46 = v38
    let v63: Double = v138 + v138
    v26[0] = v38
    let v136: Double = v77 * v63
    return v136
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))
    let v1: [[s3]] = [[s3(p0: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s1(p0: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], p1: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])))]]
    let v2: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
