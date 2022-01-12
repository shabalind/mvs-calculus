  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s4 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s8 {
    var p0: s0
    var p1: s4
  }
  func f19(_ v0: s0, _ v1: s8) -> s8 {
    var v6: s8 = v1
    return v6
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    var v5: s8 = v0
    let v3: s0 = v5.p0
    let v6: s8 = f19(v3, v5)
    v5.p0 = v3
    v5 = v0
    v5.p0 = v3
    let v4: s0 = v6.p0
    var v13: s0 = v4
    let v11: [[Double]] = v3.p1
    let v9: s4 = v0.p1
    v13.p1 = v11
    var v2: [[Double]] = v11
    let v7: [Double] = v2[0]
    let v20: s8 = f19(v13, v6)
    var v8: [Double] = v7
    let v24: [[Double]] = v3.p0
    v8 = v7
    v5.p0 = v3
    let v23: s8 = f19(v3, v20)
    let v36: [[Double]] = v4.p1
    let v26: Double = v7[0]
    v2[0] = v7
    let v22: Double = v26 / v26
    let v35: s0 = s0(p0: v24, p1: v2)
    let v48: [[Double]] = v13.p0
    var v30: [Double] = v8
    v2[0] = v7
    let v56: [[Double]] = v35.p0
    let v37: [Double] = v56[1]
    v2[0] = v37
    v8[0] = v26
    v8[0] = v22
    let v33: Double = v8[0]
    v30[0] = v26
    v13 = v35
    v5.p1 = v9
    let v109: s0 = v23.p0
    v5.p0 = v109
    v2[0] = v30
    v30 = v8
    v13.p1 = v36
    let v92: s0 = s0(p0: v48, p1: v36)
    v13.p0 = v56
    v5.p0 = v92
    v5.p1 = v9
    return v33
  }
  func benchmark() {
    let v0: s8 = s8(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s4(p0: [[s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]], p1: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]))
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
