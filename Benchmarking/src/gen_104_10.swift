  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: s0
  }
  struct s4 {
    var p0: [s3]
    var p1: Double
  }
  struct s5 {
    var p0: [s4]
    var p1: [[s3]]
  }
  func f111(_ v0: s4) -> s4 {
    var v4: s4 = v0
    var v3: s4 = v4
    var v6: s4 = v0
    let v8: Double = v3.p1
    var v12: s4 = v3
    let v7: Double = v3.p1
    var v1: s4 = v4
    let v9: [s3] = v3.p0
    v6.p1 = v8
    let v13: [s3] = v6.p0
    let v11: s4 = s4(p0: v13, p1: v8)
    v3.p1 = v7
    let v2: s3 = v9[2]
    var v10: Double = v7
    var v25: [s3] = v13
    var v15: s4 = v11
    var v16: Double = v7
    v4.p1 = v10
    let v20: [s3] = v12.p0
    v4.p0 = v20
    var v17: s3 = v2
    v15.p0 = v25
    v25[2] = v2
    v12.p1 = v16
    v3.p0 = v13
    v25[2] = v17
    let v50: s0 = v17.p0
    v1.p0 = v9
    let v56: Double = v4.p1
    v17.p0 = v50
    v4.p1 = v56
    let v55: [s3] = v1.p0
    v15.p1 = v56
    let v116: Double = v11.p1
    v3.p1 = v116
    v15.p0 = v55
    v3 = v6
    let v97: Double = v15.p1
    v3.p1 = v97
    return v15
  }
  func f83(_ v0: s4) -> s4 {
    var v5: s4 = v0
    let v2: s4 = f111(v5)
    let v7: [s4] = [v0, v0, v0, v0, v0, v0, v5]
    let v6: [[s4]] = [v7, v7, v7, v7, v7]
    let v3: [s3] = v2.p0
    let v4: [s4] = v6[2]
    v5.p0 = v3
    let v15: s4 = v4[3]
    v5.p0 = v3
    let v75: s4 = f111(v2)
    let v34: s4 = f111(v75)
    var v39: s4 = v34
    v5 = v39
    var v74: s4 = v15
    return v74
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v4: s5 = v0[0]
    let v3: [s4] = v4.p0
    let v12: s4 = v3[2]
    let v5: Double = v12.p1
    let v14: s4 = f83(v12)
    let v13: s4 = v3[2]
    let v16: [Double] = [v5]
    var v19: s4 = v14
    let v10: Double = v16[0]
    v19 = v13
    let v44: Double = v19.p1
    var v62: Double = v44
    var v73: Double = v10
    v19.p1 = v73
    return v62
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: [s4(p0: [s3(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])), s3(p0: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])), s3(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]))], p1: 15.0), s4(p0: [s3(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0], [20.0]])), s3(p0: s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0], [25.0]])), s3(p0: s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0], [30.0]]))], p1: 31.0), s4(p0: [s3(p0: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0], [36.0]])), s3(p0: s0(p0: [[37.0], [38.0], [39.0]], p1: [[40.0], [41.0]])), s3(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0]]))], p1: 47.0)], p1: [[s3(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0]]))], [s3(p0: s0(p0: [[53.0], [54.0], [55.0]], p1: [[56.0], [57.0]]))]]), s5(p0: [s4(p0: [s3(p0: s0(p0: [[58.0], [59.0], [60.0]], p1: [[61.0], [62.0]])), s3(p0: s0(p0: [[63.0], [64.0], [65.0]], p1: [[66.0], [67.0]])), s3(p0: s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0], [72.0]]))], p1: 73.0), s4(p0: [s3(p0: s0(p0: [[74.0], [75.0], [76.0]], p1: [[77.0], [78.0]])), s3(p0: s0(p0: [[79.0], [80.0], [81.0]], p1: [[82.0], [83.0]])), s3(p0: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0]]))], p1: 89.0), s4(p0: [s3(p0: s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]])), s3(p0: s0(p0: [[95.0], [96.0], [97.0]], p1: [[98.0], [99.0]])), s3(p0: s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0], [104.0]]))], p1: 105.0)], p1: [[s3(p0: s0(p0: [[106.0], [107.0], [108.0]], p1: [[109.0], [110.0]]))], [s3(p0: s0(p0: [[111.0], [112.0], [113.0]], p1: [[114.0], [115.0]]))]])]
    let v1: Double = 116.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 116.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
