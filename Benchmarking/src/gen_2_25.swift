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
    var p0: [[s1]]
    var p1: [[s1]]
  }
  func f66(_ v0: s3) -> s3 {
    return v0
  }
  func f58(_ v0: s3) -> s3 {
    var v3: s3 = v0
    let v4: s3 = f66(v3)
    let v13: [[s1]] = v0.p1
    v3.p1 = v13
    var v17: s3 = v4
    let v10: s3 = f66(v17)
    return v10
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v3: s3 = f58(v0)
    let v2: [[s1]] = v3.p0
    let v4: [s1] = v2[0]
    let v7: s1 = v4[0]
    let v10: s0 = v7.p1
    let v21: [[Double]] = v10.p0
    let v18: [Double] = v21[0]
    let v67: Double = v18[0]
    return v67
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]))], [s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0]]))], [s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: s0(p0: [[10.0]], p1: [[11.0]]))]], p1: [[s1(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: s0(p0: [[14.0]], p1: [[15.0]]))], [s1(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: s0(p0: [[18.0]], p1: [[19.0]]))]])
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
