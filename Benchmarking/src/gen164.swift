  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: Double
    var p1: s1
  }
  func f55(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v6: [[Double]] = v4.p0
    var v1: s0 = v4
    v1.p0 = v6
    let v10: [[Double]] = v1.p0
    v1 = v4
    let v5: [[Double]] = v4.p1
    let v15: [[Double]] = v1.p0
    v1.p1 = v5
    let v24: [s0] = [v0, v0, v1, v1, v1, v1, v1]
    let v23: s0 = v24[6]
    let v25: [[s0]] = [v24]
    let v22: [[Double]] = v0.p0
    v1.p0 = v22
    v4.p1 = v6
    let v47: [s0] = v25[0]
    v4.p0 = v6
    let v34: [[Double]] = v1.p1
    let v68: [[[s0]]] = [v25, v25, v25]
    var v45: [s0] = v47
    var v48: [s0] = v45
    let v33: [[s0]] = v68[0]
    var v43: [[s0]] = v33
    v4.p1 = v10
    v1.p0 = v15
    var v82: s0 = v23
    v45[4] = v82
    let v60: [[Double]] = v82.p0
    v43[0] = v48
    var v93: [[s0]] = v43
    v82.p0 = v60
    let v66: [s0] = v93[0]
    v1.p0 = v34
    let v89: s0 = v66[1]
    v4.p0 = v34
    return v89
  }
  func f17(_ v0: s0) -> s0 {
    let v8: s0 = f55(v0)
    let v12: s0 = f55(v8)
    let v13: [s0] = [v12, v12, v0, v0, v12, v8, v12]
    let v22: s0 = v13[1]
    let v18: s0 = v13[1]
    let v50: s0 = v13[4]
    let v21: [s0] = [v12, v0, v50, v22, v18]
    let v83: s0 = v21[1]
    return v83
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: s4, _ v3: s4, _ v4: Double) -> Double {
    let v5: s0 = f17(v0)
    let v8: Double = v2.p0
    let v9: Double = v4 - v8
    let v16: [[Double]] = v5.p1
    let v14: [Double] = v16[2]
    var v69: [Double] = v14
    let v52: Double = v69[0]
    let v137: Double = v52 + v9
    return v137
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
    let v1: s0 = s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])
    let v2: s4 = s4(p0: 12.0, p1: s1(p0: [s0(p0: [[13.0], [14.0], [15.0]], p1: [[16.0], [17.0], [18.0]]), s0(p0: [[19.0], [20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0], [30.0]])], p1: s0(p0: [[31.0], [32.0], [33.0]], p1: [[34.0], [35.0], [36.0]])))
    let v3: s4 = s4(p0: 37.0, p1: s1(p0: [s0(p0: [[38.0], [39.0], [40.0]], p1: [[41.0], [42.0], [43.0]]), s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0], [55.0]])], p1: s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0], [60.0], [61.0]])))
    let v4: Double = 62.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 62.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
