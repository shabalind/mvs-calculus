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
    var p1: s0
  }
  struct s4 {
    var p0: [[s2]]
    var p1: s2
  }
  func f121(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v1: s1 = s1(p0: v0, p1: v0)
    let v9: [Double] = v6[2]
    let v4: [[Double]] = v0.p1
    let v3: [Double] = v6[0]
    let v14: [Double] = v4[1]
    let v11: s0 = s0(p0: v6, p1: v4)
    let v23: [[Double]] = v11.p0
    let v24: [[Double]] = [v3, v14, v3, v3, v14, v9]
    let v20: s0 = v1.p0
    var v17: s1 = v1
    let v33: [[Double]] = v11.p0
    let v19: [[Double]] = v11.p0
    var v41: s0 = v11
    let v43: s0 = v17.p1
    var v59: s0 = v41
    let v52: s0 = v17.p1
    var v54: [[Double]] = v24
    let v27: s0 = v1.p1
    let v32: [[Double]] = v11.p1
    v17.p1 = v41
    var v77: [[Double]] = v23
    let v58: s1 = s1(p0: v27, p1: v20)
    let v22: [Double] = v54[2]
    var v56: [[Double]] = v33
    v17 = v1
    v17.p0 = v52
    v41.p1 = v32
    v41.p0 = v56
    var v45: s1 = v58
    v45.p1 = v59
    let v97: s0 = s0(p0: v77, p1: v32)
    let v71: s0 = v45.p0
    v45.p0 = v0
    v45.p0 = v43
    v45.p0 = v97
    v17.p1 = v59
    v41.p1 = v32
    v41.p0 = v19
    v77[1] = v22
    return v71
  }
  func f6(_ v0: s0) -> s0 {
    var v6: s0 = v0
    var v3: s0 = v6
    let v4: [[Double]] = v3.p1
    v3.p1 = v4
    var v9: s0 = v3
    let v10: [[Double]] = v3.p1
    v6.p1 = v4
    v9.p1 = v10
    v9 = v3
    let v60: s0 = f121(v9)
    return v60
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v2: s4 = v0[0]
    let v4: s2 = v2.p1
    let v10: s0 = v4.p1
    var v18: s0 = v10
    let v12: s0 = f6(v18)
    let v29: s0 = f6(v12)
    let v24: [[Double]] = v12.p1
    v18.p1 = v24
    let v36: [[Double]] = v29.p1
    let v66: [Double] = v36[1]
    let v61: Double = v66[0]
    return v61
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [[s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]))], [s2(p0: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]))], [s2(p0: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]))]], p1: s2(p0: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])], p1: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]))), s4(p0: [[s2(p0: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]])], p1: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]))], [s2(p0: [s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])], p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]]))], [s2(p0: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]])], p1: s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]]))]], p1: s2(p0: [s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]])], p1: s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]]))), s4(p0: [[s2(p0: [s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]])], p1: s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]]))], [s2(p0: [s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]])], p1: s0(p0: [[95.0], [96.0], [97.0]], p1: [[98.0], [99.0]]))], [s2(p0: [s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0], [104.0]])], p1: s0(p0: [[105.0], [106.0], [107.0]], p1: [[108.0], [109.0]]))]], p1: s2(p0: [s0(p0: [[110.0], [111.0], [112.0]], p1: [[113.0], [114.0]])], p1: s0(p0: [[115.0], [116.0], [117.0]], p1: [[118.0], [119.0]])))]
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
