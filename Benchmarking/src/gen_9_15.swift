  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f13(_ v0: s0, _ v1: s0, _ v2: s0) -> s0 {
    let v7: [s0] = [v0, v1]
    var v4: [s0] = v7
    var v8: [s0] = v4
    v8 = v7
    v8[1] = v1
    let v74: s0 = v8[0]
    return v74
  }
  func f7(_ v0: s0, _ v1: s0) -> s0 {
    var v7: s0 = v0
    let v6: s0 = f13(v0, v7, v7)
    let v4: [[Double]] = v6.p1
    v7 = v1
    var v2: s0 = v7
    var v5: [[Double]] = v4
    v7.p1 = v5
    let v10: [Double] = v4[0]
    var v9: s0 = v7
    let v12: s0 = f13(v2, v6, v9)
    let v30: [[Double]] = [v10]
    v2.p1 = v30
    v5[0] = v10
    let v15: [Double] = v4[0]
    v5[0] = v10
    v5[0] = v10
    v5[0] = v15
    v2 = v0
    v7.p1 = v30
    v5[0] = v10
    v5[0] = v10
    return v12
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [[s1]], _ v2: Double) -> Double {
    let v6: s0 = f13(v0, v0, v0)
    var v4: s0 = v6
    let v7: [[Double]] = v4.p1
    var v3: Double = v2
    var v10: [[Double]] = v7
    var v11: s0 = v0
    let v8: [[Double]] = v11.p0
    let v9: [Double] = v10[0]
    let v16: Double = v9[0]
    let v15: s0 = f13(v11, v0, v4)
    let v12: [[Double]] = v4.p1
    v10[0] = v9
    let v43: [[Double]] = v15.p1
    let v14: s0 = s0(p0: v8, p1: v43)
    v4.p0 = v8
    let v24: s0 = f7(v0, v4)
    let v40: [[Double]] = v14.p0
    let v51: [Double] = [v3]
    var v29: Double = v16
    let v23: [Double] = v10[0]
    v4.p0 = v8
    let v18: [[Double]] = v14.p0
    v10[0] = v23
    v4.p0 = v40
    v10[0] = v51
    var v56: [[Double]] = v8
    let v31: [[Double]] = v24.p1
    let v36: Double = v16 + v16
    let v48: [Double] = v18[1]
    v4.p0 = v56
    v11.p1 = v12
    let v117: [Double] = v31[0]
    v56[0] = v23
    v56[2] = v117
    v56[1] = v48
    v10[0] = v48
    let v318: Double = v29 / v36
    return v318
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
    let v1: [[s1]] = [[s1(p0: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])])], [s1(p0: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])], p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])])], [s1(p0: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], p1: [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])])]]
    let v2: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
