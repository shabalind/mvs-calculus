  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  func f120(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v5: [[Double]] = v0.p0
    var v1: [[Double]] = v5
    let v6: [Double] = v1[1]
    let v2: [[Double]] = v0.p2
    v4.p0 = v5
    let v3: [[Double]] = v4.p2
    var v7: [[Double]] = v3
    var v11: [Double] = v6
    v4.p0 = v1
    let v18: [Double] = v1[1]
    let v12: [[Double]] = v0.p1
    v7[2] = v11
    v4.p1 = v12
    v4.p1 = v12
    let v45: [[Double]] = v0.p0
    var v16: s0 = v4
    v16.p0 = v1
    var v24: [[Double]] = v3
    let v13: [[Double]] = v16.p0
    v1[1] = v18
    v16.p2 = v3
    v16.p0 = v45
    let v29: [[[Double]]] = [v12, v12]
    var v34: s0 = v0
    v24[2] = v11
    let v23: [[Double]] = v29[1]
    let v22: [Double] = v7[1]
    let v41: s0 = s0(p0: v5, p1: v12, p2: v24)
    var v44: [[[Double]]] = v29
    v16.p2 = v24
    let v40: s0 = s0(p0: v13, p1: v23, p2: v7)
    let v35: [[Double]] = v34.p1
    var v28: [[Double]] = v23
    v4.p1 = v12
    let v30: [[Double]] = v40.p1
    v4.p0 = v1
    let v69: s0 = s0(p0: v5, p1: v28, p2: v24)
    let v27: [[Double]] = v40.p1
    var v36: s0 = v41
    v28 = v27
    let v58: [[Double]] = v40.p1
    v36.p2 = v2
    var v64: s0 = v41
    v4.p1 = v35
    let v80: [[Double]] = v69.p0
    let v56: [[Double]] = v0.p1
    let v98: [[Double]] = v64.p0
    let v63: [[Double]] = v36.p1
    v64.p1 = v58
    v16 = v41
    v64.p1 = v35
    v36.p0 = v45
    v16.p0 = v98
    var v81: [[Double]] = v63
    let v173: [[Double]] = v44[0]
    v34.p0 = v80
    v4.p1 = v173
    v36.p2 = v7
    v4.p1 = v56
    v44[1] = v30
    v28[0] = v22
    v34.p1 = v81
    return v64
  }
  func f71(_ v0: [s2]) -> [s2] {
    return v0
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    let v4: [s2] = v0[2]
    let v3: [s2] = f71(v4)
    var v5: [[s2]] = v0
    var v12: [s2] = v3
    var v13: [[s2]] = v5
    v13[2] = v4
    let v10: [s2] = v13[0]
    let v9: s2 = v10[0]
    let v28: s0 = v9.p1
    let v18: s0 = f120(v28)
    let v24: [[Double]] = v18.p1
    v5[0] = v10
    v13[2] = v10
    let v29: [Double] = v24[0]
    var v33: [s2] = v12
    v13[1] = v33
    let v72: Double = v29[0]
    return v72
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]], p2: [[3.0], [4.0], [5.0]]), p1: [[s0(p0: [[6.0], [7.0]], p1: [[8.0]], p2: [[9.0], [10.0], [11.0]])], [s0(p0: [[12.0], [13.0]], p1: [[14.0]], p2: [[15.0], [16.0], [17.0]])]])], p1: s0(p0: [[18.0], [19.0]], p1: [[20.0]], p2: [[21.0], [22.0], [23.0]]))], [s2(p0: [s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]], p2: [[27.0], [28.0], [29.0]]), p1: [[s0(p0: [[30.0], [31.0]], p1: [[32.0]], p2: [[33.0], [34.0], [35.0]])], [s0(p0: [[36.0], [37.0]], p1: [[38.0]], p2: [[39.0], [40.0], [41.0]])]])], p1: s0(p0: [[42.0], [43.0]], p1: [[44.0]], p2: [[45.0], [46.0], [47.0]]))], [s2(p0: [s1(p0: s0(p0: [[48.0], [49.0]], p1: [[50.0]], p2: [[51.0], [52.0], [53.0]]), p1: [[s0(p0: [[54.0], [55.0]], p1: [[56.0]], p2: [[57.0], [58.0], [59.0]])], [s0(p0: [[60.0], [61.0]], p1: [[62.0]], p2: [[63.0], [64.0], [65.0]])]])], p1: s0(p0: [[66.0], [67.0]], p1: [[68.0]], p2: [[69.0], [70.0], [71.0]]))]]
    let v1: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
