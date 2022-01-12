  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: [[s0]]
  }
  struct s6 {
    var p0: s0
    var p1: Double
  }
  struct s7 {
    var p0: [s2]
    var p1: [s6]
  }
  func f14(_ v0: s0) -> s0 {
    let v6: [s0] = [v0, v0]
    let v4: s0 = v6[0]
    let v7: [[Double]] = v4.p0
    var v3: [[Double]] = v7
    let v1: [[Double]] = v4.p1
    let v2: s0 = v6[0]
    let v9: [Double] = v7[0]
    let v8: [Double] = v1[0]
    let v15: s0 = v6[0]
    v3[0] = v8
    let v11: [[Double]] = v4.p1
    var v47: [s0] = v6
    let v32: [[Double]] = v2.p1
    var v24: [s0] = v47
    let v33: s0 = v24[0]
    var v42: [[Double]] = v3
    var v40: s0 = v33
    let v59: [[Double]] = v33.p0
    let v28: [[Double]] = v15.p1
    var v72: [Double] = v9
    let v46: [[Double]] = v33.p1
    let v67: s0 = v6[0]
    v3[0] = v72
    v40.p1 = v42
    v47[0] = v67
    let v71: [Double] = v46[0]
    v40.p0 = v42
    v40.p0 = v11
    v40.p0 = v59
    v72 = v71
    v40.p0 = v32
    v40.p0 = v28
    return v40
  }
  func f4(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p1
    let v1: s0 = f14(v0)
    let v7: [[Double]] = v1.p1
    let v3: [Double] = v7[0]
    let v8: [Double] = v2[0]
    let v6: Double = v3[0]
    let v4: Double = v8[0]
    let v52: s0 = f14(v0)
    let v33: s6 = s6(p0: v52, p1: v6)
    var v83: s6 = v33
    v83.p1 = v4
    let v160: s0 = v83.p0
    return v160
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s7, _ v2: Double) -> Double {
    let v6: s0 = f4(v0)
    var v11: Double = v2
    let v13: [Double] = [v11, v11, v11]
    let v16: [[Double]] = v6.p1
    let v12: [Double] = v16[0]
    let v30: Double = v12[0]
    let v21: Double = v13[0]
    let v166: Double = v21 / v30
    let v57: Double = v12[0]
    let v328: Double = v57 * v166
    return v328
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: s7 = s7(p0: [s2(p0: s1(p0: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])], p1: [[s0(p0: [[6.0]], p1: [[7.0]])], [s0(p0: [[8.0]], p1: [[9.0]])], [s0(p0: [[10.0]], p1: [[11.0]])]]), p1: [[s0(p0: [[12.0]], p1: [[13.0]])]]), s2(p0: s1(p0: [s0(p0: [[14.0]], p1: [[15.0]]), s0(p0: [[16.0]], p1: [[17.0]])], p1: [[s0(p0: [[18.0]], p1: [[19.0]])], [s0(p0: [[20.0]], p1: [[21.0]])], [s0(p0: [[22.0]], p1: [[23.0]])]]), p1: [[s0(p0: [[24.0]], p1: [[25.0]])]])], p1: [s6(p0: s0(p0: [[26.0]], p1: [[27.0]]), p1: 28.0), s6(p0: s0(p0: [[29.0]], p1: [[30.0]]), p1: 31.0)])
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
