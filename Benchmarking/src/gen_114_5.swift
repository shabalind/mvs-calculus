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
    var p0: s0
    var p1: s1
  }
  struct s4 {
    var p0: [s1]
    var p1: s1
  }
  struct s5 {
    var p0: s1
    var p1: [[s0]]
    var p2: s2
  }
  struct s6 {
    var p0: [s1]
    var p1: s4
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: s6, _ v2: [[s0]], _ v3: Double) -> Double {
    var v14: [[s0]] = v2
    var v41: Double = v3
    let v26: [s0] = v14[0]
    let v28: Double = v41 - v41
    let v20: Double = v28 + v28
    v14[1] = v26
    let v52: [s0] = v14[1]
    let v49: s0 = v52[0]
    let v104: [[Double]] = v49.p1
    let v95: [Double] = v104[0]
    let v113: Double = v95[0]
    let v60: Double = v113 + v20
    v14[1] = v26
    return v60
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])), p1: [[s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])]], p2: s2(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]))))]
    let v1: s6 = s6(p0: [s1(p0: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), p1: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])), s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])), s1(p0: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), p1: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]))], p1: s4(p0: [s1(p0: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]), p1: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]])), s1(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]), p1: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])), s1(p0: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]), p1: s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]))], p1: s1(p0: s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]]), p1: s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]]))))
    let v2: [[s0]] = [[s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]])], [s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]])]]
    let v3: Double = 92.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 92.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
