  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
  }
  struct s4 {
    var p0: [[s0]]
    var p1: s1
  }
  struct s5 {
    var p0: s2
    var p1: [s0]
  }
  struct s6 {
    var p0: s2
    var p1: s5
    var p2: s4
    var p3: s4
    var p4: [s0]
  }
  func f81(_ v0: Double) -> Double {
    var v2: Double = v0
    var v1: Double = v0
    var v8: Double = v0
    var v3: Double = v2
    var v6: Double = v3
    v3 = v0
    v1 = v3
    let v5: Double = v2 * v1
    let v14: [Double] = [v1, v1, v3, v6, v5, v2, v8]
    let v36: Double = v14[5]
    v3 = v1
    let v50: Double = v36 + v6
    return v50
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    var v2: Double = v1
    let v25: Double = f81(v2)
    return v25
  }
  func benchmark() {
    let v0: s6 = s6(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [[s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]])), p1: s5(p0: s2(p0: s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: [[s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])], [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])], [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])]])), p1: [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])]), p2: s4(p0: [[s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])]], p1: s1(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), p1: [[s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])], [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])], [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])]])), p3: s4(p0: [[s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]])], [s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])]], p1: s1(p0: s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]]), p1: [[s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]])], [s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]])], [s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]])]])), p4: [s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]), s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]]), s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]])])
    let v1: Double = 100.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 100.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
