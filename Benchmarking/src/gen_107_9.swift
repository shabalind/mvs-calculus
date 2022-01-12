  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  func f17(_ v0: Double) -> Double {
    var v5: Double = v0
    var v6: Double = v0
    v5 = v6
    var v3: Double = v5
    var v1: Double = v3
    let v2: [Double] = [v1]
    v5 = v3
    let v4: Double = v2[0]
    let v10: [Double] = [v3, v4, v3, v4, v4, v3]
    let v9: Double = v2[0]
    let v17: Double = v2[0]
    let v16: Double = v10[4]
    let v28: Double = v10[5]
    let v41: [Double] = [v16, v4]
    var v26: [Double] = v41
    let v48: Double = v26[0]
    v26[1] = v17
    let v22: [Double] = [v48, v9, v5, v16, v1, v1, v4]
    var v29: [Double] = v22
    let v33: Double = v29[2]
    var v53: [Double] = v10
    v53[3] = v33
    let v124: [[Double]] = [v10]
    var v63: [[Double]] = v124
    v26[1] = v28
    v53[4] = v28
    var v88: [[Double]] = v63
    var v45: [[Double]] = v88
    let v80: [Double] = v45[0]
    var v169: [Double] = v80
    let v123: [Double] = v88[0]
    v63[0] = v123
    v88[0] = v53
    let v203: Double = v169[0]
    return v203
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s1, _ v2: s0, _ v3: Double) -> Double {
    var v6: Double = v3
    let v11: [[Double]] = v2.p0
    let v13: [Double] = v11[0]
    let v10: Double = f17(v6)
    let v41: Double = v13[0]
    var v34: Double = v10
    let v81: [Double] = v11[2]
    let v51: Double = v81[0]
    let v107: Double = v13[0]
    let v114: Double = v41 + v34
    let v164: [Double] = [v107, v3, v114, v10, v51, v107]
    let v104: Double = v164[1]
    return v104
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], p1: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])]]), s1(p0: [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])], p1: [[s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])]])]
    let v1: s1 = s1(p0: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])], p1: [[s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])], [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]])]])
    let v2: s0 = s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])
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
