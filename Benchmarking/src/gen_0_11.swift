  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  struct s7 {
    var p0: s1
    var p1: s3
  }
  struct s11 {
    var p0: Double
    var p1: s3
  }
  func f89(_ v0: s1) -> s1 {
    let v6: [s0] = v0.p1
    let v2: [s0] = v0.p0
    var v8: [s0] = v2
    let v4: [s0] = v0.p0
    let v13: s0 = v6[2]
    let v12: [[Double]] = v13.p0
    let v7: [[Double]] = v13.p0
    let v9: [[Double]] = v13.p0
    let v14: [[Double]] = v13.p1
    var v20: s0 = v13
    let v15: [[Double]] = v20.p0
    var v19: [[Double]] = v14
    v20.p1 = v14
    let v37: [[Double]] = v13.p0
    var v48: s1 = v0
    v8[1] = v20
    v8 = v6
    let v60: [s0] = v0.p1
    let v38: [[[Double]]] = [v37, v15, v9, v7, v37]
    v8 = v4
    v48.p0 = v60
    let v26: [[Double]] = v38[3]
    let v42: [[Double]] = v20.p0
    v20.p0 = v42
    let v67: s0 = s0(p0: v12, p1: v19)
    v48.p1 = v8
    v48.p1 = v8
    v8[1] = v67
    v20.p0 = v26
    return v48
  }
  func f68(_ v0: s7) -> s7 {
    return v0
  }
  func f61(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p0
    let v1: [Double] = v4[2]
    let v2: [[Double]] = v0.p1
    let v8: [[[Double]]] = [v4, v4, v4]
    let v7: [[Double]] = v8[1]
    let v3: [Double] = v4[0]
    let v9: [[Double]] = v0.p0
    let v13: [[Double]] = v0.p0
    var v6: [[Double]] = v2
    var v16: [[[Double]]] = v8
    let v14: s0 = s0(p0: v4, p1: v2)
    let v15: [Double] = v13[2]
    var v18: [[Double]] = v6
    var v19: [[Double]] = v6
    let v28: [[Double]] = v0.p1
    var v17: [[Double]] = v4
    let v23: s0 = s0(p0: v9, p1: v2)
    let v51: [Double] = v28[0]
    let v30: [[Double]] = v14.p0
    let v48: [[Double]] = v23.p1
    v17[0] = v1
    v16[2] = v13
    v18 = v19
    let v47: [Double] = v48[0]
    let v74: [[Double]] = v14.p1
    v17[2] = v1
    v17[2] = v47
    let v50: s0 = s0(p0: v30, p1: v6)
    v19[0] = v51
    v17[2] = v3
    var v27: [[Double]] = v74
    let v39: [[Double]] = v23.p0
    let v42: [[Double]] = v50.p0
    v17 = v7
    var v33: s0 = v14
    let v60: [Double] = v6[0]
    v33.p0 = v9
    v33.p1 = v6
    v33.p1 = v18
    let v32: [[Double]] = v33.p0
    let v72: [Double] = v32[1]
    v16[0] = v17
    v16[1] = v39
    v33.p0 = v42
    v19[0] = v3
    v27[0] = v60
    v19[0] = v1
    v19[0] = v72
    let v91: [[Double]] = v16[2]
    v16[1] = v9
    v18[0] = v15
    v33.p1 = v74
    v33.p0 = v17
    v17[1] = v1
    let v258: s0 = s0(p0: v32, p1: v27)
    v17 = v91
    return v258
  }
  func f27(_ v0: s1, _ v1: s7) -> s7 {
    let v6: s1 = v1.p0
    let v4: s7 = f68(v1)
    let v7: s1 = v1.p0
    let v9: s7 = f68(v4)
    var v2: s7 = v4
    var v12: s1 = v7
    let v11: s1 = f89(v12)
    let v14: [s0] = v6.p0
    v12.p0 = v14
    let v10: s1 = f89(v11)
    let v16: s0 = v14[2]
    let v22: s0 = f61(v16)
    var v17: s1 = v10
    let v27: s0 = v14[2]
    v12.p1 = v14
    let v20: s0 = v14[0]
    var v18: s0 = v16
    let v13: s0 = v14[1]
    let v26: s1 = v2.p0
    var v28: [s0] = v14
    let v43: s0 = f61(v18)
    let v50: s0 = f61(v43)
    let v19: [[Double]] = v43.p1
    let v71: s0 = v28[1]
    var v29: s0 = v50
    var v30: s7 = v2
    v28[1] = v50
    let v35: s3 = v1.p1
    v29.p1 = v19
    v28[1] = v13
    v17.p1 = v14
    v28[0] = v18
    var v48: s3 = v35
    v17.p1 = v28
    let v102: s3 = v2.p1
    v30.p0 = v17
    var v32: s0 = v71
    v28[1] = v29
    v28[0] = v43
    v32.p1 = v19
    v28[0] = v22
    v28[0] = v20
    v30.p1 = v48
    v28[0] = v16
    v18.p1 = v19
    v28[1] = v27
    v28[2] = v20
    v12.p1 = v14
    v28[2] = v32
    let v91: [s0] = v26.p1
    v17.p0 = v28
    v17.p1 = v14
    v30.p0 = v17
    v17.p1 = v91
    v2.p1 = v102
    v30 = v9
    return v30
  }
  func f12(_ v0: Double, _ v1: s11) -> s11 {
    let v7: Double = v1.p0
    var v6: s11 = v1
    v6.p0 = v0
    v6.p0 = v0
    v6.p0 = v7
    let v4: s3 = v6.p1
    v6.p1 = v4
    let v3: [Double] = [v0, v0, v0, v0]
    v6 = v1
    let v11: Double = v3[2]
    let v26: Double = v3[2]
    var v16: s11 = v6
    v16.p0 = v11
    v6.p0 = v26
    let v85: s11 = s11(p0: v0, p1: v4)
    var v61: s3 = v4
    v16 = v85
    v6.p0 = v7
    v6.p0 = v7
    v16.p1 = v61
    return v16
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [s7], _ v2: Double) -> Double {
    let v4: s7 = v1[0]
    let v6: Double = v2 + v2
    let v11: s7 = f68(v4)
    var v12: s1 = v0
    let v29: s7 = f27(v12, v11)
    let v25: s3 = v29.p1
    let v36: s11 = s11(p0: v6, p1: v25)
    let v43: s11 = f12(v6, v36)
    let v39: Double = v43.p0
    let v45: Double = v39 + v2
    let v35: Double = v45 + v39
    return v35
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])])
    let v1: [s7] = [s7(p0: s1(p0: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])], p1: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])]), p1: s3(p0: s2(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), p1: [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])]), p1: s2(p0: s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]]), p1: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])]))), s7(p0: s1(p0: [s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]]), s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]]), s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]])], p1: [s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]]), s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]]), s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]])]), p1: s3(p0: s2(p0: s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]), p1: [s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]])]), p1: s2(p0: s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]]), p1: [s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]])]))), s7(p0: s1(p0: [s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]]), s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]]), s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]])], p1: [s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0]]), s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]]), s0(p0: [[124.0], [125.0], [126.0]], p1: [[127.0]])]), p1: s3(p0: s2(p0: s0(p0: [[128.0], [129.0], [130.0]], p1: [[131.0]]), p1: [s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0]])]), p1: s2(p0: s0(p0: [[136.0], [137.0], [138.0]], p1: [[139.0]]), p1: [s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0]])])))]
    let v2: Double = 144.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 144.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
