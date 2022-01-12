  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v7: s1 = v0[1]
    let v3: s1 = v0[0]
    var v5: [s1] = v0
    let v6: s1 = v5[1]
    v5[1] = v3
    var v8: [s1] = v0
    v8[1] = v6
    let v21: s1 = v8[0]
    v8[1] = v7
    v5[1] = v6
    let v12: s1 = v5[1]
    let v17: s0 = v21.p0
    let v10: [Double] = [v1]
    let v27: s1 = v0[0]
    let v20: [[Double]] = v17.p0
    var v25: s1 = v27
    let v29: [[Double]] = v17.p0
    let v32: s0 = v12.p1
    let v36: s0 = v12.p0
    v25.p0 = v36
    var v30: [[Double]] = v29
    let v39: s0 = s0(p0: v30, p1: v30)
    v25.p0 = v39
    let v93: [Double] = v20[1]
    var v59: [[Double]] = v30
    var v84: s1 = v25
    v30[0] = v93
    let v72: [Double] = v59[0]
    v84 = v7
    v84.p0 = v32
    v59[0] = v10
    var v52: [Double] = v72
    v5[1] = v84
    v30[1] = v72
    v30[0] = v93
    let v138: Double = v52[0]
    return v138
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])), s1(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))]
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
