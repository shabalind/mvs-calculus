  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f54(_ v0: s1) -> s1 {
    let v7: s0 = v0.p1
    let v2: s0 = v0.p1
    let v6: [s1] = [v0, v0, v0, v0, v0, v0]
    let v9: s1 = s1(p0: v2, p1: v2)
    var v10: [s1] = v6
    let v1: s1 = s1(p0: v7, p1: v7)
    let v24: s0 = v9.p0
    v10[2] = v1
    let v21: s1 = s1(p0: v24, p1: v24)
    var v18: [s1] = v10
    let v16: s1 = v18[2]
    let v39: s0 = v16.p0
    var v35: s1 = v9
    v35.p0 = v39
    v10[5] = v21
    return v35
  }
  func f39(_ v0: s1) -> s1 {
    let v4: s1 = f54(v0)
    let v2: s0 = v4.p0
    let v3: s1 = s1(p0: v2, p1: v2)
    let v12: s0 = v3.p1
    let v9: s1 = s1(p0: v12, p1: v2)
    return v9
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: s1 = f39(v0)
    let v3: s0 = v4.p1
    let v5: [[Double]] = v3.p1
    let v7: [Double] = v5[0]
    let v13: Double = v7[0]
    var v36: Double = v1
    let v38: [Double] = [v13, v36, v13, v1, v1, v36, v13]
    let v62: Double = v38[2]
    var v86: Double = v62
    return v86
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
