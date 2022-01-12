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
    var p0: [s0]
    var p1: [s1]
  }
  struct s4 {
    var p0: s2
    var p1: s0
    var p2: s0
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: [s2], _ v2: [s1], _ v3: s2, _ v4: Double) -> Double {
    let v6: s4 = v0[0]
    let v9: s2 = v6.p0
    let v8: [s0] = v9.p0
    let v22: s0 = v8[0]
    let v19: [[Double]] = v22.p0
    let v37: [Double] = v19[0]
    var v39: [[Double]] = v19
    let v50: [Double] = v39[0]
    let v84: Double = v37[0]
    let v167: [Double] = v19[0]
    let v70: Double = v167[0]
    var v107: [Double] = v50
    let v156: Double = v107[0]
    v39[1] = v50
    v107[0] = v84
    v107[0] = v70
    return v156
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], p1: [s1(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), p2: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])), s4(p0: s2(p0: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])], p1: [s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]))]), p1: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), p2: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]))]
    let v1: [s2] = [s2(p0: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])], p1: [s1(p0: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), p1: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]))]), s2(p0: [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])], p1: [s1(p0: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]), p1: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]))]), s2(p0: [s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])], p1: [s1(p0: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]), p1: s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]))])]
    let v2: [s1] = [s1(p0: s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]]), p1: s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]])), s1(p0: s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]]), p1: s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]])), s1(p0: s0(p0: [[92.0], [93.0]], p1: [[94.0], [95.0]]), p1: s0(p0: [[96.0], [97.0]], p1: [[98.0], [99.0]]))]
    let v3: s2 = s2(p0: [s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0]])], p1: [s1(p0: s0(p0: [[104.0], [105.0]], p1: [[106.0], [107.0]]), p1: s0(p0: [[108.0], [109.0]], p1: [[110.0], [111.0]]))])
    let v4: Double = 112.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 112.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
