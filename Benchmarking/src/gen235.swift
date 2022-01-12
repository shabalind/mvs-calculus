  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: [[s1]]
  }
  struct s4 {
    var p0: [s1]
    var p1: s3
  }
  struct s6 {
    var p0: s4
    var p1: s3
  }
  func f21(_ v0: Double) -> Double {
    var v3: Double = v0
    var v1: Double = v3
    var v2: Double = v1
    var v5: Double = v0
    let v10: Double = v5 - v2
    return v10
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    let v5: Double = f21(v1)
    let v8: Double = f21(v5)
    let v10: s4 = v0.p0
    var v9: s4 = v10
    let v19: [s1] = v9.p0
    let v15: s1 = v19[0]
    var v46: Double = v8
    let v20: s0 = v15.p0
    let v16: [[Double]] = v20.p0
    let v89: [Double] = v16[1]
    var v58: [Double] = v89
    let v176: Double = v58[0]
    v58[0] = v46
    return v176
  }
  func benchmark() {
    let v0: s6 = s6(p0: s4(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])])], p1: s3(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]), p1: [[s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])])]])), p1: s3(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]), p1: [[s1(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]]), p1: [s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])])]]))
    let v1: Double = 66.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 66.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
