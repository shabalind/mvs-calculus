  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  struct s7 {
    var p0: [s0]
    var p1: s1
  }
  func f34(_ v0: Double, _ v1: [[s7]]) -> Double {
    var v7: Double = v0
    return v7
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: s3, _ v2: Double) -> Double {
    let v10: s7 = v0[0]
    let v7: [s0] = v10.p0
    let v29: Double = v2 / v2
    var v43: Double = v29
    var v32: [s7] = v0
    let v33: s0 = v7[0]
    let v45: [[Double]] = v33.p0
    let v52: [Double] = v45[1]
    let v39: [[s7]] = [v32]
    var v74: [[s7]] = v39
    let v101: Double = v52[0]
    var v182: [[s7]] = v74
    let v150: Double = f34(v43, v182)
    let v158: Double = v101 / v150
    return v158
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], p1: s1(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]))]
    let v1: s3 = s3(p0: s2(p0: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])], p1: s1(p0: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), p1: [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])])), p1: s2(p0: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])], p1: s1(p0: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]), p1: [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]), s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]])])))
    let v2: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
