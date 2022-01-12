  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  func f1(_ v0: s2) -> s2 {
    let v4: s0 = v0.p1
    var v1: s0 = v4
    let v2: [[Double]] = v4.p1
    var v6: [[Double]] = v2
    v1.p1 = v6
    let v5: [Double] = v6[2]
    let v12: s0 = v0.p0
    v6[0] = v5
    let v21: [[Double]] = v12.p1
    v6[2] = v5
    let v18: s0 = v0.p1
    var v11: s2 = v0
    v11.p0 = v4
    let v17: s0 = v11.p0
    v11.p1 = v12
    let v15: s0 = v11.p1
    var v30: [[Double]] = v21
    v11.p0 = v1
    var v28: s0 = v18
    v11.p0 = v15
    let v48: [s2] = [v0, v11]
    let v74: s2 = v48[0]
    v11.p1 = v28
    v11.p1 = v17
    v28.p1 = v30
    return v74
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s2], _ v2: Double) -> Double {
    let v6: s2 = f1(v0)
    let v14: s0 = v6.p1
    let v24: [[Double]] = v14.p1
    let v26: [Double] = v24[2]
    let v69: Double = v26[0]
    return v69
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))
    let v1: [s2] = [s2(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])), s2(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))]
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
