  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  func f47(_ v0: [s0]) -> [s0] {
    var v1: [s0] = v0
    let v3: s0 = v0[0]
    let v2: s0 = v1[1]
    let v4: [[Double]] = v3.p0
    v1[1] = v2
    v1[0] = v2
    v1 = v0
    v1 = v0
    var v5: [s0] = v0
    let v10: [[Double]] = v3.p1
    v1[0] = v2
    v5[0] = v3
    let v18: [[Double]] = v3.p0
    let v16: [[Double]] = v3.p1
    let v22: [[Double]] = v2.p0
    v5[1] = v3
    var v20: s0 = v2
    v20.p0 = v18
    v5[0] = v20
    let v46: [[Double]] = v3.p1
    v20.p1 = v4
    v20.p1 = v10
    v1[0] = v3
    v20.p1 = v10
    v20.p0 = v22
    v20.p0 = v46
    let v34: [[Double]] = v3.p1
    v1[1] = v20
    v20.p0 = v34
    var v41: s0 = v3
    v41.p0 = v22
    v1 = v5
    var v78: s0 = v20
    v41.p0 = v16
    var v53: [s0] = v1
    v53[1] = v78
    v53[0] = v41
    return v53
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v7: s3 = v0[0]
    let v2: s1 = v7.p0
    let v9: [s0] = v2.p0
    let v21: s0 = v9[0]
    let v12: [s0] = f47(v9)
    var v22: [s0] = v12
    v22[1] = v21
    let v56: s0 = v22[0]
    let v44: [s0] = v2.p0
    v22 = v44
    let v47: [[Double]] = v56.p1
    var v63: [[Double]] = v47
    let v80: [Double] = v63[0]
    let v146: Double = v80[0]
    return v146
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: [s0(p0: [[4.0]], p1: [[5.0]])]), p1: s0(p0: [[6.0]], p1: [[7.0]])), s3(p0: s1(p0: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])], p1: [s0(p0: [[12.0]], p1: [[13.0]])]), p1: s0(p0: [[14.0]], p1: [[15.0]]))]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
