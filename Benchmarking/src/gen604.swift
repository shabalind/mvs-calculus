  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [Double]
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s2
  }
  struct s4 {
    var p0: s2
    var p1: [s3]
  }
  struct s6 {
    var p0: s2
    var p1: s2
  }
  func f57(_ v0: s4) -> s4 {
    return v0
  }
  func f10(_ v0: s4, _ v1: s4) -> s4 {
    let v7: s2 = v0.p0
    var v3: s2 = v7
    let v9: s2 = v1.p0
    var v5: s2 = v3
    let v4: s4 = f57(v0)
    v3 = v9
    var v19: s4 = v4
    var v17: s4 = v19
    let v44: [s3] = v1.p1
    v19.p0 = v3
    v17.p1 = v44
    let v22: s0 = v5.p1
    var v23: s0 = v22
    var v40: s0 = v22
    let v55: [[Double]] = v22.p0
    let v36: [[Double]] = v23.p1
    v17.p0 = v5
    v5.p1 = v40
    v40.p0 = v55
    let v74: s4 = f57(v17)
    v40.p1 = v36
    return v74
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: s4, _ v2: Double) -> Double {
    var v7: s4 = v1
    let v10: s4 = f10(v1, v7)
    var v8: s4 = v10
    let v5: s2 = v8.p0
    let v13: s2 = v10.p0
    let v23: s0 = v5.p1
    v7.p0 = v5
    let v28: [[Double]] = v23.p0
    var v39: [[Double]] = v28
    v7.p0 = v13
    v8.p0 = v13
    v7.p0 = v5
    let v29: [Double] = v39[1]
    v8.p0 = v5
    v7.p0 = v5
    let v41: Double = v29[0]
    v39[1] = v29
    return v41
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: s2(p0: [0.0, 1.0], p1: s0(p0: [[2.0], [3.0]], p1: [[4.0], [5.0], [6.0]])), p1: s2(p0: [7.0, 8.0], p1: s0(p0: [[9.0], [10.0]], p1: [[11.0], [12.0], [13.0]])))]]
    let v1: s4 = s4(p0: s2(p0: [14.0, 15.0], p1: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0], [20.0]])), p1: [s3(p0: [s0(p0: [[21.0], [22.0]], p1: [[23.0], [24.0], [25.0]]), s0(p0: [[26.0], [27.0]], p1: [[28.0], [29.0], [30.0]]), s0(p0: [[31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])], p1: s2(p0: [36.0, 37.0], p1: s0(p0: [[38.0], [39.0]], p1: [[40.0], [41.0], [42.0]]))), s3(p0: [s0(p0: [[43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0], [52.0]]), s0(p0: [[53.0], [54.0]], p1: [[55.0], [56.0], [57.0]])], p1: s2(p0: [58.0, 59.0], p1: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]]))), s3(p0: [s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]]), s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]]), s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]])], p1: s2(p0: [80.0, 81.0], p1: s0(p0: [[82.0], [83.0]], p1: [[84.0], [85.0], [86.0]])))])
    let v2: Double = 87.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 87.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
