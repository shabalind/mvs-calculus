  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s4 {
    var p0: [s1]
    var p1: [[s0]]
  }
  struct s7 {
    var p0: s3
    var p1: s4
  }
  struct s8 {
    var p0: s2
    var p1: s2
  }
  struct s9 {
    var p0: [[s0]]
    var p1: s3
  }
  func f8(_ v0: s2) -> s2 {
    var v6: s2 = v0
    let v5: s0 = v6.p1
    let v3: [s0] = v6.p0
    var v7: [s0] = v3
    var v4: s2 = v0
    let v12: s2 = s2(p0: v3, p1: v5)
    var v2: s0 = v5
    v4 = v6
    let v11: s0 = v3[0]
    var v15: s0 = v2
    v4.p1 = v5
    let v10: s0 = v7[0]
    let v9: s0 = v3[1]
    let v18: s0 = v4.p1
    let v21: [[Double]] = v11.p1
    v4.p1 = v2
    v6.p1 = v10
    var v13: s2 = v6
    v2 = v11
    var v27: [s0] = v7
    v4.p1 = v18
    var v16: s0 = v10
    let v30: [[Double]] = v2.p1
    let v90: [[Double]] = v10.p0
    v7[1] = v15
    let v67: s0 = s0(p0: v90, p1: v21)
    v6.p1 = v11
    var v86: s2 = v6
    let v44: s0 = v12.p1
    let v40: [Double] = v30[0]
    let v50: [[Double]] = v18.p1
    v6 = v86
    let v64: [s0] = v13.p0
    let v71: [[Double]] = v9.p1
    v7[1] = v44
    let v82: [s0] = v12.p0
    v6.p0 = v27
    let v52: s0 = v64[0]
    v16.p1 = v50
    v6.p0 = v82
    v15.p0 = v71
    var v47: [[Double]] = v90
    let v73: [[Double]] = v52.p0
    v47[1] = v40
    let v53: [[Double]] = v16.p1
    v4 = v86
    v27[0] = v67
    v2.p1 = v47
    var v144: [s0] = v7
    let v216: [Double] = v73[1]
    v2.p0 = v53
    v16.p1 = v30
    v47[0] = v216
    v15.p0 = v30
    v15.p1 = v50
    v15.p1 = v73
    v86.p0 = v144
    return v12
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: s2, _ v2: s7, _ v3: Double) -> Double {
    let v10: s2 = f8(v1)
    let v16: s8 = s8(p0: v1, p1: v10)
    let v22: s2 = v16.p1
    let v220: [s0] = v22.p0
    let v67: s0 = v220[0]
    let v53: [[Double]] = v67.p0
    let v79: [Double] = v53[1]
    var v206: [Double] = v79
    let v231: Double = v206[0]
    return v231
  }
  func benchmark() {
    let v0: s9 = s9(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])]], p1: s3(p0: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: [s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), p1: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])), s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]))]))
    let v1: s2 = s2(p0: [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])], p1: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]))
    let v2: s7 = s7(p0: s3(p0: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])], p1: [s1(p0: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]), p1: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])), s1(p0: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]), p1: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]))]), p1: s4(p0: [s1(p0: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]]), p1: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]))], p1: [[s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]])], [s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]])]]))
    let v3: Double = 80.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 80.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
