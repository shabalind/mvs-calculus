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
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v7: s2 = v0[0]
    let v3: [s1] = v7.p1
    let v5: s1 = v3[2]
    var v10: s1 = v5
    let v8: s0 = v10.p1
    v10.p1 = v8
    var v16: s0 = v8
    let v9: [[Double]] = v16.p1
    let v24: [Double] = v9[0]
    v10.p1 = v8
    let v43: Double = v24[0]
    return v43
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])), p1: [s1(p0: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])], p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])), s1(p0: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])], p1: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])), s1(p0: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], p1: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]))]), s2(p0: s1(p0: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])], p1: s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])), p1: [s1(p0: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]), s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]])], p1: s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])), s1(p0: [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]]), s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]])], p1: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]])), s1(p0: [s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]]), s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]])], p1: s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]]))]), s2(p0: s1(p0: [s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]]), s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]])], p1: s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]])), p1: [s1(p0: [s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]]), s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]])], p1: s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0]])), s1(p0: [s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]]), s0(p0: [[124.0], [125.0], [126.0]], p1: [[127.0]])], p1: s0(p0: [[128.0], [129.0], [130.0]], p1: [[131.0]])), s1(p0: [s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0]]), s0(p0: [[136.0], [137.0], [138.0]], p1: [[139.0]])], p1: s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0]]))])]
    let v1: Double = 144.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 144.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
