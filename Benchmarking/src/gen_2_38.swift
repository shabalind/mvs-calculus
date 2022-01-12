  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: Double
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  struct s4 {
    var p0: s0
    var p1: [s1]
  }
  func f9(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p1
    let v7: [[Double]] = v0.p0
    var v1: [[Double]] = v6
    var v2: [[Double]] = v1
    var v5: s0 = v0
    let v4: [Double] = v2[1]
    v2[0] = v4
    let v12: [[Double]] = v0.p1
    v5.p1 = v12
    var v8: s0 = v0
    let v16: [Double] = v12[1]
    var v18: s0 = v5
    let v17: [[Double]] = v18.p0
    v1[0] = v16
    v18.p1 = v6
    let v20: [[Double]] = v8.p1
    v8.p0 = v17
    v18.p1 = v6
    v18.p0 = v17
    v1[1] = v16
    v8.p0 = v7
    v8.p1 = v20
    v8.p1 = v2
    return v8
  }
  func f2(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    let v2: [Double] = v4[0]
    var v7: [[Double]] = v4
    let v5: s0 = f9(v0)
    v7[1] = v2
    let v32: [[Double]] = v5.p0
    let v37: s0 = s0(p0: v32, p1: v7)
    return v37
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: s0, _ v2: s4, _ v3: s2, _ v4: [[s4]], _ v5: Double) -> Double {
    let v13: s0 = f2(v1)
    let v33: [[Double]] = v13.p1
    var v54: s2 = v3
    let v52: s1 = v54.p1
    let v72: Double = v52.p0
    let v57: [Double] = v33[0]
    let v37: Double = v57[0]
    let v106: Double = v37 * v72
    return v106
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [s1(p0: 3.0, p1: s0(p0: [[4.0]], p1: [[5.0], [6.0]])), s1(p0: 7.0, p1: s0(p0: [[8.0]], p1: [[9.0], [10.0]]))]), s4(p0: s0(p0: [[11.0]], p1: [[12.0], [13.0]]), p1: [s1(p0: 14.0, p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]])), s1(p0: 18.0, p1: s0(p0: [[19.0]], p1: [[20.0], [21.0]]))])]
    let v1: s0 = s0(p0: [[22.0]], p1: [[23.0], [24.0]])
    let v2: s4 = s4(p0: s0(p0: [[25.0]], p1: [[26.0], [27.0]]), p1: [s1(p0: 28.0, p1: s0(p0: [[29.0]], p1: [[30.0], [31.0]])), s1(p0: 32.0, p1: s0(p0: [[33.0]], p1: [[34.0], [35.0]]))])
    let v3: s2 = s2(p0: [s0(p0: [[36.0]], p1: [[37.0], [38.0]]), s0(p0: [[39.0]], p1: [[40.0], [41.0]])], p1: s1(p0: 42.0, p1: s0(p0: [[43.0]], p1: [[44.0], [45.0]])))
    let v4: [[s4]] = [[s4(p0: s0(p0: [[46.0]], p1: [[47.0], [48.0]]), p1: [s1(p0: 49.0, p1: s0(p0: [[50.0]], p1: [[51.0], [52.0]])), s1(p0: 53.0, p1: s0(p0: [[54.0]], p1: [[55.0], [56.0]]))])]]
    let v5: Double = 57.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 57.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
