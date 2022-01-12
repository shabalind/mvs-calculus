  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s8 {
    var p0: s2
    var p1: s2
  }
  func f20(_ v0: Double) -> Double {
    var v6: Double = v0
    v6 = v0
    var v1: Double = v0
    var v4: Double = v6
    var v7: Double = v1
    var v18: Double = v7
    var v14: Double = v4
    var v10: Double = v7
    var v13: Double = v10
    v1 = v14
    v10 = v18
    var v19: Double = v13
    return v19
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: [s1], _ v2: s1, _ v3: Double) -> Double {
    let v11: Double = f20(v3)
    let v35: Double = v11 / v11
    let v87: Double = f20(v35)
    return v87
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]), p1: s2(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p1: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])])), s8(p0: s2(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])]), p1: s2(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), p1: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])]))]
    let v1: [s1] = [s1(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), p1: s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]]), p2: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])]), s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]), p1: s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]]), p2: [s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])]), s1(p0: s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]]), p1: s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]]), p2: [s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]])])]
    let v2: s1 = s1(p0: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]]), p1: s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]), p2: [s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]])])
    let v3: Double = 96.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 96.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
