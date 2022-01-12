  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: [[s2]]
    var p1: s2
  }
  struct s6 {
    var p0: [[s4]]
    var p1: s0
  }
  func f8(_ v0: s6) -> s6 {
    let v5: [[s4]] = v0.p0
    let v3: [s4] = v5[0]
    let v7: s4 = v3[0]
    let v18: s2 = v7.p1
    let v54: s0 = v18.p1
    let v87: s6 = s6(p0: v5, p1: v54)
    return v87
  }
  func f1(_ v0: s6) -> s6 {
    let v3: s6 = f8(v0)
    var v2: s6 = v3
    let v6: s0 = v2.p1
    var v4: s0 = v6
    var v13: s6 = v0
    let v9: s0 = v3.p1
    var v8: s0 = v9
    var v12: s6 = v13
    v12.p1 = v8
    v12.p1 = v4
    return v12
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s6, _ v2: Double) -> Double {
    let v5: [Double] = [v2, v2, v2, v2, v2]
    let v8: Double = v5[3]
    var v4: s0 = v0
    let v17: [Double] = v4.p1
    let v19: Double = v17[0]
    let v18: [Double] = v4.p1
    let v33: Double = v8 + v19
    let v30: Double = v18[0]
    let v37: s6 = f1(v1)
    let v22: s0 = v37.p1
    let v32: [[Double]] = v22.p0
    let v34: [Double] = v32[2]
    let v49: Double = v34[0]
    let v86: [Double] = [v33, v49, v2, v2, v30]
    let v95: Double = v86[1]
    return v95
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0, 4.0], p2: [[5.0]])
    let v1: s6 = s6(p0: [[s4(p0: [[s2(p0: [s0(p0: [[6.0], [7.0], [8.0]], p1: [9.0, 10.0], p2: [[11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [15.0, 16.0], p2: [[17.0]]))], [s2(p0: [s0(p0: [[18.0], [19.0], [20.0]], p1: [21.0, 22.0], p2: [[23.0]])], p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [27.0, 28.0], p2: [[29.0]]))], [s2(p0: [s0(p0: [[30.0], [31.0], [32.0]], p1: [33.0, 34.0], p2: [[35.0]])], p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [39.0, 40.0], p2: [[41.0]]))]], p1: s2(p0: [s0(p0: [[42.0], [43.0], [44.0]], p1: [45.0, 46.0], p2: [[47.0]])], p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [51.0, 52.0], p2: [[53.0]])))], [s4(p0: [[s2(p0: [s0(p0: [[54.0], [55.0], [56.0]], p1: [57.0, 58.0], p2: [[59.0]])], p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [63.0, 64.0], p2: [[65.0]]))], [s2(p0: [s0(p0: [[66.0], [67.0], [68.0]], p1: [69.0, 70.0], p2: [[71.0]])], p1: s0(p0: [[72.0], [73.0], [74.0]], p1: [75.0, 76.0], p2: [[77.0]]))], [s2(p0: [s0(p0: [[78.0], [79.0], [80.0]], p1: [81.0, 82.0], p2: [[83.0]])], p1: s0(p0: [[84.0], [85.0], [86.0]], p1: [87.0, 88.0], p2: [[89.0]]))]], p1: s2(p0: [s0(p0: [[90.0], [91.0], [92.0]], p1: [93.0, 94.0], p2: [[95.0]])], p1: s0(p0: [[96.0], [97.0], [98.0]], p1: [99.0, 100.0], p2: [[101.0]])))]], p1: s0(p0: [[102.0], [103.0], [104.0]], p1: [105.0, 106.0], p2: [[107.0]]))
    let v2: Double = 108.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 108.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
