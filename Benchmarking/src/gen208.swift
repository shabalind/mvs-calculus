  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s1
  }
  func f84(_ v0: s3) -> s3 {
    var v5: s3 = v0
    let v4: s1 = v0.p1
    var v8: s1 = v4
    var v7: s3 = v5
    var v3: s3 = v0
    let v9: s0 = v8.p1
    v3.p1 = v4
    let v11: [[Double]] = v9.p0
    var v10: s1 = v4
    var v14: s0 = v9
    let v13: s0 = v8.p0
    let v21: [[Double]] = v14.p1
    var v12: s3 = v0
    v10.p1 = v9
    v8.p0 = v14
    v3 = v7
    var v19: s3 = v7
    v14.p0 = v11
    var v24: s1 = v4
    v8.p1 = v13
    let v36: [[Double]] = v9.p0
    var v25: s0 = v9
    let v17: s1 = v12.p1
    let v56: s1 = s1(p0: v25, p1: v13)
    let v34: s0 = s0(p0: v11, p1: v21)
    v25.p0 = v11
    var v64: s3 = v12
    v64.p1 = v4
    v10.p0 = v13
    v5.p1 = v56
    v14.p0 = v36
    v25.p1 = v21
    v7 = v3
    let v85: [s0] = v12.p0
    v19.p1 = v10
    v3.p0 = v85
    let v118: [s0] = v64.p0
    let v97: s1 = v3.p1
    v7.p1 = v24
    v7.p1 = v97
    let v179: s0 = v17.p0
    v19 = v0
    v8.p0 = v25
    v24.p0 = v34
    v12.p0 = v118
    v24.p0 = v179
    return v19
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v2: s3 = f84(v0)
    let v26: [s0] = v2.p0
    let v19: s0 = v26[1]
    let v50: [[Double]] = v19.p0
    let v78: [Double] = v50[2]
    let v112: Double = v78[0]
    return v112
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p1: s1(p0: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])))
    let v1: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
