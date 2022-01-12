  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
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
  @inline(never)
  func f0(_ v0: s4, _ v1: s1, _ v2: Double) -> Double {
    var v4: Double = v2
    let v11: [s0] = v1.p0
    let v9: s0 = v11[2]
    let v35: [[Double]] = v9.p1
    let v10: [Double] = v35[0]
    let v26: Double = v10[0]
    let v68: Double = v2 * v4
    v4 = v68
    let v86: Double = v4 + v4
    let v90: Double = v86 / v26
    return v90
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0], [9.0]], p2: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]], p2: [[16.0], [17.0]])], p1: s0(p0: [[18.0]], p1: [[19.0], [20.0], [21.0]], p2: [[22.0], [23.0]])), p1: s2(p0: s1(p0: [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]], p2: [[28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0], [32.0], [33.0]], p2: [[34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]], p2: [[40.0], [41.0]])], p1: s0(p0: [[42.0]], p1: [[43.0], [44.0], [45.0]], p2: [[46.0], [47.0]])), p1: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]], p2: [[52.0], [53.0]])))
    let v1: s1 = s1(p0: [s0(p0: [[54.0]], p1: [[55.0], [56.0], [57.0]], p2: [[58.0], [59.0]]), s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]], p2: [[64.0], [65.0]]), s0(p0: [[66.0]], p1: [[67.0], [68.0], [69.0]], p2: [[70.0], [71.0]])], p1: s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]], p2: [[76.0], [77.0]]))
    let v2: Double = 78.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 78.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
