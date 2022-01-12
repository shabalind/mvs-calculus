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
    var p0: s0
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [s2]
    var p1: s2
  }
  struct s4 {
    var p0: s3
    var p1: s0
  }
  struct s5 {
    var p0: s1
    var p1: s1
  }
  struct s7 {
    var p0: s5
    var p1: s5
  }
  struct s8 {
    var p0: s4
    var p1: s7
  }
  func f48(_ v0: s8) -> s8 {
    return v0
  }
  func f47(_ v0: Double, _ v1: s8) -> Double {
    var v31: Double = v0
    return v31
  }
  func f37(_ v0: s7) -> s7 {
    var v2: s7 = v0
    var v4: s7 = v2
    let v8: s5 = v2.p0
    v4.p0 = v8
    let v6: [s5] = [v8, v8, v8, v8, v8]
    v2.p0 = v8
    v4.p0 = v8
    var v3: s7 = v4
    let v11: s5 = v6[4]
    v3.p0 = v11
    return v3
  }
  func f12(_ v0: s8, _ v1: s8) -> s8 {
    let v6: s8 = f48(v1)
    let v4: s7 = v1.p1
    let v8: s7 = f37(v4)
    let v9: s8 = f48(v6)
    let v11: s8 = f48(v9)
    let v14: s8 = f48(v11)
    var v17: s8 = v11
    v17.p1 = v8
    let v40: s7 = v0.p1
    v17 = v14
    v17.p1 = v40
    return v17
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    let v5: s8 = f12(v0, v0)
    let v8: Double = f47(v1, v5)
    let v13: Double = f47(v1, v5)
    let v19: Double = v13 * v13
    var v17: Double = v8
    let v52: Double = v19 - v17
    return v52
  }
  func benchmark() {
    let v0: s8 = s8(p0: s4(p0: s3(p0: [s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]]), s2(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), p1: [[s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]])], p1: s2(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), p1: [[s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])], [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])]])), p1: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])), p1: s7(p0: s5(p0: s1(p0: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), p1: [s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]])]), p1: s1(p0: s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]]), p1: [s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]]), s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]])])), p1: s5(p0: s1(p0: s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0], [84.0]]), p1: [s0(p0: [[85.0], [86.0]], p1: [[87.0], [88.0], [89.0]]), s0(p0: [[90.0], [91.0]], p1: [[92.0], [93.0], [94.0]])]), p1: s1(p0: s0(p0: [[95.0], [96.0]], p1: [[97.0], [98.0], [99.0]]), p1: [s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0], [104.0]]), s0(p0: [[105.0], [106.0]], p1: [[107.0], [108.0], [109.0]])]))))
    let v1: Double = 110.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 110.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
