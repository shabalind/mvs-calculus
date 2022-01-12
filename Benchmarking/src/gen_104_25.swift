  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s0, _ v2: s1, _ v3: Double) -> Double {
    let v6: s1 = v0[0]
    let v4: [[Double]] = v1.p0
    let v9: [s0] = v6.p1
    let v10: s0 = v9[1]
    let v12: [[Double]] = v10.p0
    let v15: [Double] = v12[1]
    let v78: [Double] = v4[1]
    let v47: Double = v15[0]
    let v23: Double = v78[0]
    let v53: Double = v78[0]
    var v91: Double = v23
    let v75: [Double] = [v23, v23, v47, v53, v23, v47, v91]
    var v96: [Double] = v75
    let v296: Double = v96[0]
    return v296
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]], p2: [[6.0], [7.0], [8.0]]), p1: [s0(p0: [[9.0], [10.0], [11.0]], p1: [[12.0], [13.0], [14.0]], p2: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]], p2: [[24.0], [25.0], [26.0]])]), s1(p0: s0(p0: [[27.0], [28.0], [29.0]], p1: [[30.0], [31.0], [32.0]], p2: [[33.0], [34.0], [35.0]]), p1: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]], p2: [[42.0], [43.0], [44.0]]), s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0], [50.0]], p2: [[51.0], [52.0], [53.0]])])]
    let v1: s0 = s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]], p2: [[60.0], [61.0], [62.0]])
    let v2: s1 = s1(p0: s0(p0: [[63.0], [64.0], [65.0]], p1: [[66.0], [67.0], [68.0]], p2: [[69.0], [70.0], [71.0]]), p1: [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]], p2: [[78.0], [79.0], [80.0]]), s0(p0: [[81.0], [82.0], [83.0]], p1: [[84.0], [85.0], [86.0]], p2: [[87.0], [88.0], [89.0]])])
    let v3: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
