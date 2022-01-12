  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [Double]
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  struct s6 {
    var p0: s1
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s2], _ v2: s6, _ v3: Double) -> Double {
    let v4: [Double] = [v3]
    let v8: Double = v4[0]
    let v13: [[Double]] = v0.p0
    let v26: [[Double]] = v0.p1
    let v22: [Double] = v26[1]
    let v19: Double = v22[0]
    let v59: Double = v19 - v19
    let v32: [Double] = v13[0]
    let v52: Double = v59 * v3
    let v34: Double = v32[0]
    var v39: Double = v19
    let v61: [Double] = [v3, v34, v8, v39, v8, v52]
    let v196: Double = v61[0]
    return v196
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]])
    let v1: [s2] = [s2(p0: s1(p0: [[s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])]], p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]])), p1: [12.0, 13.0, 14.0]), s2(p0: s1(p0: [[s0(p0: [[15.0]], p1: [[16.0], [17.0]])], [s0(p0: [[18.0]], p1: [[19.0], [20.0]])]], p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]])), p1: [24.0, 25.0, 26.0]), s2(p0: s1(p0: [[s0(p0: [[27.0]], p1: [[28.0], [29.0]])], [s0(p0: [[30.0]], p1: [[31.0], [32.0]])]], p1: s0(p0: [[33.0]], p1: [[34.0], [35.0]])), p1: [36.0, 37.0, 38.0])]
    let v2: s6 = s6(p0: s1(p0: [[s0(p0: [[39.0]], p1: [[40.0], [41.0]])], [s0(p0: [[42.0]], p1: [[43.0], [44.0]])]], p1: s0(p0: [[45.0]], p1: [[46.0], [47.0]])), p1: s3(p0: [s1(p0: [[s0(p0: [[48.0]], p1: [[49.0], [50.0]])], [s0(p0: [[51.0]], p1: [[52.0], [53.0]])]], p1: s0(p0: [[54.0]], p1: [[55.0], [56.0]])), s1(p0: [[s0(p0: [[57.0]], p1: [[58.0], [59.0]])], [s0(p0: [[60.0]], p1: [[61.0], [62.0]])]], p1: s0(p0: [[63.0]], p1: [[64.0], [65.0]])), s1(p0: [[s0(p0: [[66.0]], p1: [[67.0], [68.0]])], [s0(p0: [[69.0]], p1: [[70.0], [71.0]])]], p1: s0(p0: [[72.0]], p1: [[73.0], [74.0]]))], p1: s0(p0: [[75.0]], p1: [[76.0], [77.0]])))
    let v3: Double = 78.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 78.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
