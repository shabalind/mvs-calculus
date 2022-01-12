  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f21(_ v0: s1) -> s1 {
    let v3: s0 = v0.p1
    var v13: s1 = v0
    var v2: s0 = v3
    let v12: [s0] = v13.p0
    v13.p0 = v12
    let v62: s1 = s1(p0: v12, p1: v2)
    var v28: s1 = v62
    return v28
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: s1 = f21(v0)
    let v7: [s0] = v4.p0
    let v14: s0 = v7[1]
    var v10: Double = v1
    let v16: s0 = v7[1]
    let v51: [[Double]] = v16.p0
    let v63: [[Double]] = v14.p0
    let v48: [Double] = [v1, v1, v10, v10]
    let v73: [Double] = v63[1]
    var v69: [Double] = v48
    let v62: [Double] = v51[0]
    let v50: Double = v73[0]
    v69[3] = v50
    let v86: Double = v62[0]
    let v163: Double = v69[2]
    v69[0] = v86
    return v163
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
