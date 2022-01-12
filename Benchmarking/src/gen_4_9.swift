  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: [[s0]]
  }
  func f74(_ v0: [[s0]]) -> [[s0]] {
    var v8: [[s0]] = v0
    let v1: [s0] = v8[1]
    var v3: [[s0]] = v0
    v3[0] = v1
    let v5: [s0] = v0[1]
    v8[0] = v1
    v3[0] = v1
    v8[0] = v5
    v3[1] = v1
    v3 = v8
    var v6: [s0] = v1
    var v13: [[s0]] = v0
    let v9: [s0] = v3[2]
    v3[1] = v9
    let v19: [s0] = v8[1]
    let v22: s0 = v9[0]
    v8[1] = v19
    var v18: [[s0]] = v3
    v18 = v13
    v6[0] = v22
    v18[2] = v6
    return v18
  }
  func f57(_ v0: s3, _ v1: [[s0]]) -> [[s0]] {
    let v3: [[s0]] = f74(v1)
    let v6: [[s0]] = f74(v3)
    let v17: [[s0]] = f74(v6)
    return v17
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: s3, _ v2: Double) -> Double {
    let v5: [[s0]] = f57(v1, v0)
    let v8: [s0] = v5[2]
    let v13: s0 = v8[0]
    let v16: [[Double]] = v13.p1
    let v84: [Double] = v16[0]
    let v81: Double = v84[0]
    var v110: Double = v81
    return v110
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]]
    let v1: s3 = s3(p0: s2(p0: s1(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], p1: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])), p1: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]), p1: [[s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])]])
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
