  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s7 {
    var p0: s2
    var p1: [s0]
  }
  func f28(_ v0: s0) -> s0 {
    return v0
  }
  func f19(_ v0: s0) -> s0 {
    let v3: s0 = f28(v0)
    var v4: s0 = v3
    v4 = v3
    let v8: [[Double]] = v4.p1
    v4.p1 = v8
    v4.p0 = v8
    return v4
  }
  func f2(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v7: [Double] = v6[0]
    let v3: s0 = f19(v0)
    let v5: [[Double]] = v3.p1
    let v4: [Double] = v5[0]
    let v9: s0 = f28(v0)
    var v12: [[Double]] = v5
    v12[0] = v4
    let v31: Double = v7[0]
    var v40: [Double] = v7
    v40 = v4
    v12[0] = v40
    v12[0] = v4
    v40[0] = v31
    v12[0] = v4
    v40 = v7
    let v44: [[Double]] = v9.p1
    let v85: s0 = s0(p0: v12, p1: v44)
    return v85
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s0], _ v2: [s7], _ v3: Double) -> Double {
    var v5: Double = v3
    let v4: s0 = v1[0]
    let v11: s0 = f2(v4)
    let v9: [[Double]] = v11.p1
    var v8: [[Double]] = v9
    var v17: [[Double]] = v9
    let v19: [Double] = v17[0]
    v17[0] = v19
    let v31: [Double] = v8[0]
    v17[0] = v19
    let v24: [Double] = v8[0]
    v17[0] = v31
    let v46: [Double] = v17[0]
    v8[0] = v19
    let v112: Double = v24[0]
    let v72: Double = v5 - v112
    v17[0] = v24
    v8[0] = v46
    let v186: Double = v3 / v72
    v8[0] = v24
    return v186
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: [s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: [s0(p0: [[6.0]], p1: [[7.0]])]), s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [s0(p0: [[10.0]], p1: [[11.0]])])])
    let v1: [s0] = [s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]]), s0(p0: [[16.0]], p1: [[17.0]])]
    let v2: [s7] = [s7(p0: s2(p0: [s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]])], p1: [s1(p0: s0(p0: [[22.0]], p1: [[23.0]]), p1: [s0(p0: [[24.0]], p1: [[25.0]])]), s1(p0: s0(p0: [[26.0]], p1: [[27.0]]), p1: [s0(p0: [[28.0]], p1: [[29.0]])])]), p1: [s0(p0: [[30.0]], p1: [[31.0]]), s0(p0: [[32.0]], p1: [[33.0]])]), s7(p0: s2(p0: [s0(p0: [[34.0]], p1: [[35.0]]), s0(p0: [[36.0]], p1: [[37.0]])], p1: [s1(p0: s0(p0: [[38.0]], p1: [[39.0]]), p1: [s0(p0: [[40.0]], p1: [[41.0]])]), s1(p0: s0(p0: [[42.0]], p1: [[43.0]]), p1: [s0(p0: [[44.0]], p1: [[45.0]])])]), p1: [s0(p0: [[46.0]], p1: [[47.0]]), s0(p0: [[48.0]], p1: [[49.0]])])]
    let v3: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
