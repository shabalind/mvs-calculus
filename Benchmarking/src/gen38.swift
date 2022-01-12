  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [Double]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [Double]
  }
  struct s3 {
    var p0: s1
    var p1: s2
  }
  func f59(_ v0: s3) -> s3 {
    var v4: s3 = v0
    var v6: s3 = v0
    let v1: s2 = v6.p1
    var v3: s2 = v1
    let v7: s1 = v3.p0
    v6 = v4
    v3.p0 = v7
    var v8: s2 = v1
    v3.p0 = v7
    let v11: [Double] = v1.p1
    var v18: s3 = v0
    v8.p1 = v11
    v6.p0 = v7
    v3.p1 = v11
    var v15: s2 = v8
    let v17: s1 = v15.p0
    v3.p0 = v7
    v6.p0 = v17
    v15.p0 = v17
    let v28: [Double] = v8.p1
    v18.p0 = v17
    v8.p1 = v28
    v15.p1 = v11
    v8 = v3
    let v26: s2 = v0.p1
    let v38: s2 = v6.p1
    v18.p0 = v7
    v18.p0 = v17
    let v56: s1 = v1.p0
    v4.p1 = v38
    v4.p1 = v3
    v6.p0 = v17
    v3.p0 = v7
    v4.p1 = v26
    var v145: s3 = v18
    v6.p0 = v56
    v6.p1 = v3
    return v145
  }
  func f48(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v4: [Double] = v0.p2
    let v1: Double = v4[0]
    let v2: [Double] = v0.p2
    let v7: Double = v2[0]
    var v6: [Double] = v4
    var v13: [Double] = v6
    let v5: [Double] = v0.p2
    let v10: [[Double]] = v3.p3
    var v11: Double = v1
    let v8: Double = v2[2]
    var v9: [[Double]] = v10
    let v17: [[Double]] = v0.p0
    let v15: [Double] = v10[0]
    v3.p3 = v9
    let v30: [Double] = v9[0]
    v13[2] = v1
    let v25: [Double] = v10[0]
    let v14: s0 = s0(p0: v17, p1: v17, p2: v5, p3: v10)
    v13[2] = v8
    var v22: [[Double]] = v17
    let v20: Double = v13[2]
    v3.p2 = v5
    v22[0] = v25
    let v18: [Double] = v22[0]
    v6[0] = v20
    v3.p3 = v9
    var v38: Double = v7
    let v21: [[Double]] = v14.p0
    v3.p1 = v21
    let v12: [Double] = v14.p2
    v9[0] = v15
    v3.p2 = v12
    let v61: [[Double]] = v0.p0
    let v36: [[Double]] = v14.p3
    v3.p1 = v17
    v6[0] = v11
    let v55: [[Double]] = v3.p1
    v3.p0 = v21
    var v42: [Double] = v5
    v3.p1 = v17
    v13[1] = v38
    v6[1] = v8
    v3.p3 = v36
    let v47: [Double] = v22[0]
    v22[1] = v47
    v22[1] = v47
    v42[1] = v20
    v22 = v55
    let v43: [[Double]] = v3.p3
    let v161: s0 = s0(p0: v21, p1: v61, p2: v42, p3: v43)
    v9[0] = v30
    v3.p3 = v10
    v22[0] = v15
    v9[0] = v18
    return v161
  }
  func f40(_ v0: s1) -> s1 {
    return v0
  }
  func f26(_ v0: s3) -> s3 {
    let v3: [s3] = [v0, v0]
    let v8: s1 = v0.p0
    let v4: s3 = f59(v0)
    var v10: s1 = v8
    var v7: s3 = v4
    let v1: s3 = f59(v7)
    v7.p0 = v10
    var v5: [s3] = v3
    let v9: s3 = v5[1]
    let v14: [s0] = v10.p1
    v10.p1 = v14
    v5[0] = v9
    let v18: s3 = f59(v9)
    var v11: s1 = v10
    let v17: [s0] = v11.p1
    let v35: s3 = f59(v0)
    let v13: s3 = v5[0]
    var v28: [s3] = v5
    let v53: s0 = v17[1]
    let v70: s3 = v5[0]
    v28[1] = v18
    let v40: s2 = v1.p1
    v28[0] = v7
    let v34: s3 = f59(v35)
    v28[1] = v0
    let v77: s3 = v28[1]
    v10.p0 = v53
    let v54: s0 = f48(v53)
    v11.p0 = v54
    v7.p1 = v40
    var v56: [s3] = v3
    let v81: s3 = f59(v13)
    v56[1] = v81
    let v143: s3 = f59(v77)
    let v144: s2 = v34.p1
    v56[0] = v70
    let v227: s3 = v56[0]
    v28[1] = v227
    v7.p1 = v144
    v5[1] = v0
    return v143
  }
  func f1(_ v0: s3) -> s3 {
    let v8: s3 = f26(v0)
    let v2: s2 = v0.p1
    let v4: s2 = v8.p1
    var v5: s2 = v2
    let v3: s3 = f26(v8)
    var v13: s3 = v3
    v13.p1 = v2
    v13.p1 = v5
    v13.p1 = v5
    let v16: s1 = v4.p0
    var v23: s1 = v16
    v5.p0 = v16
    var v25: s1 = v23
    v5.p0 = v25
    let v30: [s0] = v16.p1
    v5.p0 = v23
    let v39: s1 = f40(v25)
    let v54: s3 = f26(v13)
    let v63: s3 = f26(v54)
    v25.p1 = v30
    let v99: s1 = f40(v39)
    v13.p0 = v99
    let v118: s3 = f26(v63)
    return v118
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s1], _ v2: Double) -> Double {
    let v5: s1 = v1[1]
    let v12: s1 = v1[0]
    var v9: s3 = v0
    let v4: s1 = v1[0]
    let v7: s1 = v1[1]
    v9.p0 = v5
    var v16: [s1] = v1
    let v11: s1 = v16[0]
    let v22: s3 = f26(v9)
    v9.p0 = v7
    let v25: [s0] = v7.p1
    v16[1] = v12
    let v21: s1 = v22.p0
    let v28: s1 = v16[1]
    let v15: s0 = v25[0]
    v9.p0 = v12
    let v19: s0 = f48(v15)
    let v33: s1 = s1(p0: v15, p1: v25)
    v16[0] = v21
    v9.p0 = v33
    let v49: s3 = f1(v9)
    v9.p0 = v11
    v9.p0 = v21
    v16[1] = v28
    let v44: s2 = v49.p1
    var v65: Double = v2
    let v54: [[Double]] = v19.p1
    let v71: [Double] = v54[0]
    let v164: [Double] = v44.p1
    let v52: Double = v71[0]
    let v66: Double = v52 - v65
    let v92: Double = v164[0]
    let v220: Double = v92 - v66
    v16[0] = v4
    return v220
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: [4.0, 5.0, 6.0], p3: [[7.0]]), p1: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]], p2: [12.0, 13.0, 14.0], p3: [[15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]], p2: [20.0, 21.0, 22.0], p3: [[23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]], p2: [28.0, 29.0, 30.0], p3: [[31.0]])]), p1: s2(p0: s1(p0: s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]], p2: [36.0, 37.0, 38.0], p3: [[39.0]]), p1: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]], p2: [44.0, 45.0, 46.0], p3: [[47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]], p2: [52.0, 53.0, 54.0], p3: [[55.0]]), s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]], p2: [60.0, 61.0, 62.0], p3: [[63.0]])]), p1: [64.0, 65.0, 66.0]))
    let v1: [s1] = [s1(p0: s0(p0: [[67.0], [68.0]], p1: [[69.0], [70.0]], p2: [71.0, 72.0, 73.0], p3: [[74.0]]), p1: [s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0]], p2: [79.0, 80.0, 81.0], p3: [[82.0]]), s0(p0: [[83.0], [84.0]], p1: [[85.0], [86.0]], p2: [87.0, 88.0, 89.0], p3: [[90.0]]), s0(p0: [[91.0], [92.0]], p1: [[93.0], [94.0]], p2: [95.0, 96.0, 97.0], p3: [[98.0]])]), s1(p0: s0(p0: [[99.0], [100.0]], p1: [[101.0], [102.0]], p2: [103.0, 104.0, 105.0], p3: [[106.0]]), p1: [s0(p0: [[107.0], [108.0]], p1: [[109.0], [110.0]], p2: [111.0, 112.0, 113.0], p3: [[114.0]]), s0(p0: [[115.0], [116.0]], p1: [[117.0], [118.0]], p2: [119.0, 120.0, 121.0], p3: [[122.0]]), s0(p0: [[123.0], [124.0]], p1: [[125.0], [126.0]], p2: [127.0, 128.0, 129.0], p3: [[130.0]])])]
    let v2: Double = 131.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 131.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
