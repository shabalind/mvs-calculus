  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s7 {
    var p0: s1
    var p1: [s2]
  }
  struct s8 {
    var p0: s0
    var p1: s2
    var p2: [[s7]]
    var p3: [[s0]]
    var p4: [s7]
  }
  func f60(_ v0: s2) -> s2 {
    let v4: s0 = v0.p1
    var v1: s0 = v4
    var v7: s2 = v0
    v7.p0 = v1
    var v3: s0 = v1
    let v6: s0 = v0.p1
    var v10: s2 = v7
    v10.p0 = v3
    let v9: s0 = v10.p0
    let v14: s0 = v7.p1
    var v17: s2 = v0
    v10.p0 = v4
    let v2: s0 = v7.p1
    let v20: s0 = v10.p1
    var v16: s0 = v9
    let v23: s0 = v7.p0
    let v30: s0 = v17.p0
    v7.p0 = v23
    let v12: [[Double]] = v3.p1
    let v35: s0 = v7.p0
    v10.p0 = v30
    let v28: [[Double]] = v2.p1
    v17.p1 = v6
    var v18: s0 = v16
    v18.p1 = v12
    v10 = v17
    let v80: s0 = v17.p0
    var v52: s0 = v30
    v7.p0 = v35
    let v64: s2 = s2(p0: v4, p1: v80)
    var v31: s2 = v64
    v1.p1 = v28
    let v44: [[Double]] = v52.p0
    v17.p1 = v52
    v10.p0 = v23
    v3.p0 = v44
    v52 = v35
    v7.p0 = v16
    v10.p0 = v20
    v10.p0 = v18
    v3 = v16
    v7.p1 = v14
    let v271: [[Double]] = v52.p0
    v16.p0 = v271
    return v31
  }
  func f31(_ v0: s2) -> s2 {
    let v1: s2 = f60(v0)
    let v7: s2 = f60(v0)
    let v14: s2 = f60(v1)
    let v18: [s2] = [v1, v7, v14]
    let v29: s2 = v18[1]
    return v29
  }
  func f28(_ v0: s2) -> s2 {
    var v5: s2 = v0
    var v3: s2 = v5
    var v32: s2 = v3
    let v73: s2 = f31(v32)
    return v73
  }
  func f1(_ v0: s8) -> s8 {
    var v2: s8 = v0
    let v6: s2 = v0.p1
    var v4: s8 = v2
    v2.p1 = v6
    let v8: s2 = f31(v6)
    v2.p1 = v8
    v4.p1 = v8
    var v9: s8 = v4
    var v10: s8 = v4
    let v16: s2 = f28(v6)
    var v30: s8 = v4
    var v12: s2 = v16
    v30 = v0
    v30 = v10
    let v61: s0 = v6.p1
    let v53: [[s7]] = v9.p2
    v30.p1 = v12
    v30.p2 = v53
    v30.p2 = v53
    v2.p0 = v61
    return v30
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    let v7: s8 = f1(v0)
    let v6: [s7] = v7.p4
    let v11: s7 = v6[1]
    let v18: [s2] = v11.p1
    let v17: s2 = v18[0]
    var v34: s2 = v17
    let v26: s2 = f28(v34)
    let v43: s0 = v26.p1
    let v45: [[Double]] = v43.p0
    var v46: [[Double]] = v45
    let v56: [Double] = v46[1]
    v46 = v45
    v46[0] = v56
    let v96: Double = v56[0]
    return v96
  }
  func benchmark() {
    let v0: s8 = s8(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s2(p0: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), p1: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])), p2: [[s7(p0: s1(p0: [[s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]], p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])]), p1: [s2(p0: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])), s2(p0: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]))])]], p3: [[s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])], [s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]])], [s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]], p4: [s7(p0: s1(p0: [[s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]])]], p1: [s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]])]), p1: [s2(p0: s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]]), p1: s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]])), s2(p0: s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0], [84.0]]), p1: s0(p0: [[85.0], [86.0]], p1: [[87.0], [88.0], [89.0]]))]), s7(p0: s1(p0: [[s0(p0: [[90.0], [91.0]], p1: [[92.0], [93.0], [94.0]])]], p1: [s0(p0: [[95.0], [96.0]], p1: [[97.0], [98.0], [99.0]])]), p1: [s2(p0: s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0], [104.0]]), p1: s0(p0: [[105.0], [106.0]], p1: [[107.0], [108.0], [109.0]])), s2(p0: s0(p0: [[110.0], [111.0]], p1: [[112.0], [113.0], [114.0]]), p1: s0(p0: [[115.0], [116.0]], p1: [[117.0], [118.0], [119.0]]))])])
    let v1: Double = 120.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 120.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
