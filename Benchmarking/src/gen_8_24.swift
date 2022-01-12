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
    var p0: [[s1]]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s2, _ v2: Double) -> Double {
    let v7: [s1] = v1.p1
    let v6: s1 = v7[1]
    let v8: s0 = v6.p1
    let v32: [[Double]] = v8.p1
    let v17: Double = v2 * v2
    let v18: [Double] = v32[1]
    let v19: Double = v2 * v17
    let v37: Double = v18[0]
    let v57: Double = v19 / v37
    var v119: Double = v57
    return v119
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])), s1(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])), s1(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]))]
    let v1: s2 = s2(p0: [[s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]))], [s1(p0: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), p1: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]))]], p1: [s1(p0: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), p1: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])), s1(p0: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]), p1: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])), s1(p0: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]), p1: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]))])
    let v2: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
