  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s5 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s7 {
    var p0: [s0]
    var p1: [s5]
  }
  func f75(_ v0: s7) -> s7 {
    var v121: s7 = v0
    return v121
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v2: s7 = f75(v0)
    let v3: [s0] = v2.p0
    let v9: s0 = v3[0]
    let v20: [[Double]] = v9.p1
    let v19: [Double] = v20[1]
    let v14: [[Double]] = v9.p1
    let v59: [Double] = v14[1]
    let v54: [Double] = v14[1]
    let v70: [[Double]] = [v59, v59, v54, v59, v19, v59, v19]
    let v132: [Double] = v70[3]
    let v168: Double = v132[0]
    return v168
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], p1: [s5(p0: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])], p1: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])]), s5(p0: [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])], p1: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])])])
    let v1: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
