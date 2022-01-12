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
    var p0: [s0]
    var p1: [Double]
  }
  struct s4 {
    var p0: s2
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [[s1]], _ v2: [s4], _ v3: [[s0]], _ v4: Double) -> Double {
    var v6: Double = v4
    let v5: s4 = v2[1]
    let v18: s2 = v5.p1
    let v38: [Double] = v18.p1
    var v109: Double = v4
    let v49: Double = v38[0]
    var v71: Double = v109
    let v85: Double = v49 * v6
    let v107: Double = v85 + v6
    let v54: Double = v71 * v85
    let v86: Double = v54 + v107
    return v86
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))
    let v1: [[s1]] = [[s1(p0: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]))]]
    let v2: [s4] = [s4(p0: s2(p0: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])], p1: [24.0, 25.0]), p1: s2(p0: [s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0]])], p1: [34.0, 35.0])), s4(p0: s2(p0: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], p1: [44.0, 45.0]), p1: s2(p0: [s0(p0: [[46.0], [47.0], [48.0]], p1: [[49.0]]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0]])], p1: [54.0, 55.0]))]
    let v3: [[s0]] = [[s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])], [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])]]
    let v4: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
