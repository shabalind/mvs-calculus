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
    var p0: s1
    var p1: s1
  }
  struct s8 {
    var p0: s0
  }
  struct s9 {
    var p0: [s1]
    var p1: s2
  }
  func f56(_ v0: s1) -> s1 {
    let v5: [s1] = [v0]
    let v6: s1 = v5[0]
    let v7: s1 = v5[0]
    var v8: [s1] = v5
    var v4: s1 = v7
    v8 = v5
    let v3: s1 = v5[0]
    v8[0] = v7
    var v12: s1 = v7
    let v11: s0 = v3.p0
    let v15: [[Double]] = v11.p1
    v12 = v6
    var v18: [[Double]] = v15
    var v33: [s1] = v8
    var v51: [s1] = v33
    let v27: s1 = v51[0]
    v51[0] = v4
    var v22: [[Double]] = v18
    let v26: s0 = v6.p0
    v12.p0 = v11
    var v28: s0 = v11
    let v43: [[Double]] = v28.p0
    let v39: s0 = v12.p0
    let v57: s8 = s8(p0: v11)
    v4.p0 = v39
    v12.p0 = v28
    v28.p1 = v22
    v51[0] = v3
    v12.p0 = v39
    let v52: s0 = v57.p0
    v12.p0 = v11
    v28.p0 = v43
    v12.p0 = v52
    v12.p0 = v26
    return v27
  }
  func f41(_ v0: s9) -> s9 {
    let v1: [s1] = v0.p0
    let v7: [s1] = v0.p0
    var v6: s9 = v0
    let v2: s1 = v1[1]
    var v4: s1 = v2
    var v5: s1 = v4
    var v9: s9 = v0
    let v11: s1 = f56(v5)
    let v8: [s0] = v2.p1
    v9.p0 = v7
    v6.p0 = v7
    var v23: [s1] = v7
    var v10: [s0] = v8
    v23 = v7
    let v20: s1 = f56(v4)
    let v21: s2 = s2(p0: v20, p1: v5)
    var v17: s2 = v21
    let v16: s2 = v6.p1
    v9.p0 = v1
    let v19: s1 = v23[1]
    v17.p1 = v2
    v23[2] = v11
    let v22: s2 = v9.p1
    let v18: s0 = v19.p0
    var v36: s0 = v18
    v10[1] = v36
    v9.p1 = v16
    let v13: [s1] = v6.p0
    let v28: s0 = v8[1]
    v6.p1 = v16
    var v24: [s0] = v10
    var v31: s0 = v28
    v9.p1 = v17
    var v33: s0 = v31
    let v37: s8 = s8(p0: v36)
    let v84: [[Double]] = v33.p1
    let v64: s0 = v37.p0
    v33.p1 = v84
    v10[0] = v36
    v10[1] = v64
    v36.p1 = v84
    v10[1] = v31
    let v41: s1 = s1(p0: v64, p1: v10)
    v23[1] = v19
    let v88: s0 = v8[0]
    let v54: s9 = s9(p0: v13, p1: v21)
    v23[0] = v41
    v10[1] = v33
    let v59: s0 = v37.p0
    let v48: s0 = v37.p0
    v10[1] = v48
    let v47: [[Double]] = v59.p0
    v36.p0 = v47
    let v71: [s1] = v54.p0
    v23[0] = v20
    let v45: s9 = s9(p0: v71, p1: v22)
    v23 = v71
    v4.p0 = v88
    v24[2] = v48
    v9.p0 = v7
    v31.p1 = v84
    v4.p1 = v24
    v10[1] = v59
    v9.p0 = v1
    return v45
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    let v5: s9 = f41(v0)
    let v6: s2 = v5.p1
    let v11: s1 = v6.p1
    let v4: s1 = f56(v11)
    let v28: s0 = v4.p0
    var v73: s0 = v28
    var v30: s0 = v73
    let v23: [[Double]] = v30.p1
    let v39: [Double] = v23[0]
    let v51: Double = v39[0]
    return v51
  }
  func benchmark() {
    let v0: s9 = s9(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])]), s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])]), s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: [s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]), s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])])], p1: s2(p0: s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]]), p1: [s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]]), s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]]), s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]])]), p1: s1(p0: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]]), p1: [s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]]), s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]]), s0(p0: [[95.0], [96.0], [97.0]], p1: [[98.0], [99.0]])])))
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
