  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s7 {
    var p0: s1
    var p1: [s2]
  }
  @inline(never)
  func f0(_ v0: [[s7]], _ v1: Double) -> Double {
    let v7: [s7] = v0[1]
    let v5: [[s7]] = [v7, v7, v7, v7, v7]
    let v2: [s7] = v5[2]
    let v18: s7 = v2[0]
    let v12: s1 = v18.p0
    let v10: [s0] = v12.p1
    let v11: s0 = v10[0]
    let v33: [[Double]] = v11.p0
    var v28: [[Double]] = v33
    let v47: [Double] = v28[1]
    let v49: Double = v47[0]
    return v49
  }
  func benchmark() {
    let v0: [[s7]] = [[s7(p0: s1(p0: s0(p0: [[0.0], [1.0]]), p1: [s0(p0: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]]), s0(p0: [[6.0], [7.0]])]), p1: [s2(p0: [s0(p0: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0]])], p1: [s1(p0: s0(p0: [[12.0], [13.0]]), p1: [s0(p0: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]]), s0(p0: [[18.0], [19.0]])]), s1(p0: s0(p0: [[20.0], [21.0]]), p1: [s0(p0: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]]), s0(p0: [[26.0], [27.0]])])]), s2(p0: [s0(p0: [[28.0], [29.0]]), s0(p0: [[30.0], [31.0]])], p1: [s1(p0: s0(p0: [[32.0], [33.0]]), p1: [s0(p0: [[34.0], [35.0]]), s0(p0: [[36.0], [37.0]]), s0(p0: [[38.0], [39.0]])]), s1(p0: s0(p0: [[40.0], [41.0]]), p1: [s0(p0: [[42.0], [43.0]]), s0(p0: [[44.0], [45.0]]), s0(p0: [[46.0], [47.0]])])]), s2(p0: [s0(p0: [[48.0], [49.0]]), s0(p0: [[50.0], [51.0]])], p1: [s1(p0: s0(p0: [[52.0], [53.0]]), p1: [s0(p0: [[54.0], [55.0]]), s0(p0: [[56.0], [57.0]]), s0(p0: [[58.0], [59.0]])]), s1(p0: s0(p0: [[60.0], [61.0]]), p1: [s0(p0: [[62.0], [63.0]]), s0(p0: [[64.0], [65.0]]), s0(p0: [[66.0], [67.0]])])])])], [s7(p0: s1(p0: s0(p0: [[68.0], [69.0]]), p1: [s0(p0: [[70.0], [71.0]]), s0(p0: [[72.0], [73.0]]), s0(p0: [[74.0], [75.0]])]), p1: [s2(p0: [s0(p0: [[76.0], [77.0]]), s0(p0: [[78.0], [79.0]])], p1: [s1(p0: s0(p0: [[80.0], [81.0]]), p1: [s0(p0: [[82.0], [83.0]]), s0(p0: [[84.0], [85.0]]), s0(p0: [[86.0], [87.0]])]), s1(p0: s0(p0: [[88.0], [89.0]]), p1: [s0(p0: [[90.0], [91.0]]), s0(p0: [[92.0], [93.0]]), s0(p0: [[94.0], [95.0]])])]), s2(p0: [s0(p0: [[96.0], [97.0]]), s0(p0: [[98.0], [99.0]])], p1: [s1(p0: s0(p0: [[100.0], [101.0]]), p1: [s0(p0: [[102.0], [103.0]]), s0(p0: [[104.0], [105.0]]), s0(p0: [[106.0], [107.0]])]), s1(p0: s0(p0: [[108.0], [109.0]]), p1: [s0(p0: [[110.0], [111.0]]), s0(p0: [[112.0], [113.0]]), s0(p0: [[114.0], [115.0]])])]), s2(p0: [s0(p0: [[116.0], [117.0]]), s0(p0: [[118.0], [119.0]])], p1: [s1(p0: s0(p0: [[120.0], [121.0]]), p1: [s0(p0: [[122.0], [123.0]]), s0(p0: [[124.0], [125.0]]), s0(p0: [[126.0], [127.0]])]), s1(p0: s0(p0: [[128.0], [129.0]]), p1: [s0(p0: [[130.0], [131.0]]), s0(p0: [[132.0], [133.0]]), s0(p0: [[134.0], [135.0]])])])])]]
    let v1: Double = 136.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 136.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
