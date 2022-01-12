  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: s2
  }
  struct s12 {
    var p0: [s4]
    var p1: s2
  }
  func f15(_ v0: Double) -> Double {
    let v6: Double = v0 * v0
    var v3: Double = v6
    var v5: Double = v0
    var v4: Double = v0
    var v1: Double = v3
    var v8: Double = v4
    let v10: [Double] = [v6, v6, v0, v1]
    let v25: [[Double]] = [v10, v10, v10, v10, v10]
    let v12: [Double] = v25[4]
    let v18: [Double] = v25[4]
    var v14: [[Double]] = v25
    var v17: [[Double]] = v14
    v17[3] = v10
    var v37: [Double] = v12
    let v26: [Double] = v17[3]
    v37[1] = v0
    v14[1] = v18
    let v57: Double = v8 + v5
    let v41: Double = v12[0]
    v17[3] = v37
    v14[4] = v12
    var v24: [Double] = v26
    v14[0] = v26
    let v48: Double = v24[3]
    v24[0] = v1
    v24[3] = v57
    v37[2] = v3
    var v61: Double = v48
    let v63: Double = v61 * v41
    return v63
  }
  @inline(never)
  func f0(_ v0: [s12], _ v1: Double) -> Double {
    var v5: Double = v1
    let v4: Double = f15(v1)
    let v3: Double = f15(v4)
    v5 = v3
    var v23: Double = v5
    let v32: Double = f15(v23)
    v23 = v32
    return v32
  }
  func benchmark() {
    let v0: [s12] = [s12(p0: [s4(p0: s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])), p1: s2(p0: s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]))), s4(p0: s1(p0: [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])], p1: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])), p1: s2(p0: s1(p0: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])], p1: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])), p1: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])))], p1: s2(p0: s1(p0: [s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]])], p1: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])), p1: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]])))]
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
