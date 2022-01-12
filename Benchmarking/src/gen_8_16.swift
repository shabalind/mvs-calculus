  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  func f1(_ v0: Double) -> Double {
    var v6: Double = v0
    var v3: Double = v6
    var v11: Double = v0
    let v4: [Double] = [v11]
    let v15: Double = v4[0]
    var v2: [Double] = v4
    v11 = v3
    var v10: [Double] = v2
    v2[0] = v15
    let v30: Double = v2[0]
    var v28: [Double] = v10
    v2[0] = v30
    let v13: Double = v28[0]
    v10 = v4
    return v13
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s2], _ v2: Double) -> Double {
    var v5: Double = v2
    let v8: [s0] = v0.p1
    let v7: Double = v5 * v5
    v5 = v2
    let v46: s0 = v8[0]
    let v23: [[Double]] = v46.p0
    let v44: Double = f1(v7)
    let v33: [Double] = v23[0]
    var v38: [Double] = v33
    let v26: Double = v38[0]
    v38[0] = v44
    return v26
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], p1: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])])
    let v1: [s2] = [s2(p0: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])]), s2(p0: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])]), s2(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])], p1: [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])])]
    let v2: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
