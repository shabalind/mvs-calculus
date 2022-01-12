  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  struct s5 {
    var p0: s1
    var p1: s1
  }
  func f52(_ v0: s5) -> s5 {
    let v7: s1 = v0.p1
    var v9: s1 = v7
    var v14: s1 = v9
    let v47: s1 = v0.p1
    let v159: s5 = s5(p0: v14, p1: v47)
    return v159
  }
  func f49(_ v0: s2) -> s2 {
    var v6: s2 = v0
    let v3: [s0] = v0.p0
    let v27: [s1] = v6.p1
    v6.p1 = v27
    v6.p0 = v3
    return v6
  }
  func f46(_ v0: [s1]) -> [s1] {
    return v0
  }
  func f43(_ v0: s3) -> s3 {
    let v5: s2 = v0.p1
    var v4: s2 = v5
    let v3: s3 = s3(p0: v4, p1: v5)
    var v68: s3 = v3
    return v68
  }
  func f35(_ v0: s3) -> s3 {
    let v1: s3 = f43(v0)
    var v35: s3 = v1
    return v35
  }
  func f29(_ v0: s3) -> s3 {
    var v6: s3 = v0
    var v5: s3 = v0
    let v7: s3 = f35(v6)
    var v1: s3 = v7
    let v4: s3 = f43(v1)
    let v2: s2 = v0.p1
    v1.p1 = v2
    let v8: s3 = f43(v7)
    let v10: s2 = f49(v2)
    v6.p0 = v2
    let v11: [s0] = v2.p0
    let v12: s3 = f43(v5)
    var v9: s2 = v10
    var v14: s2 = v9
    let v25: s2 = v1.p0
    let v16: s2 = f49(v10)
    let v21: [s2] = [v14, v16, v9, v25, v2]
    let v30: s2 = v4.p1
    let v36: s2 = f49(v9)
    v5 = v8
    let v31: s3 = f43(v12)
    v6.p0 = v36
    let v33: [s1] = v14.p1
    let v19: s2 = v21[0]
    let v26: s2 = v21[3]
    let v43: s2 = v7.p1
    v14.p1 = v33
    let v27: [s1] = f46(v33)
    let v35: [s1] = f46(v27)
    v9.p0 = v11
    let v39: s2 = v31.p0
    v6.p1 = v39
    let v54: s2 = v21[3]
    let v40: [s0] = v30.p0
    v6.p1 = v26
    let v87: s2 = v31.p1
    let v47: [s0] = v87.p0
    let v58: s2 = v31.p0
    v14.p0 = v47
    let v62: s2 = f49(v2)
    v1.p0 = v62
    v5.p1 = v30
    v9.p1 = v35
    v5.p1 = v54
    let v98: s2 = f49(v87)
    v1.p0 = v58
    v1.p1 = v62
    v5.p0 = v98
    let v66: s3 = s3(p0: v43, p1: v19)
    v9.p0 = v40
    let v182: s3 = f43(v66)
    v1.p0 = v2
    return v182
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v3: Double = v1
    let v5: s3 = f29(v0)
    var v9: s3 = v5
    let v2: s2 = v9.p1
    let v13: [s1] = v2.p1
    v9.p0 = v2
    var v28: [s1] = v13
    let v20: s1 = v28[2]
    let v34: s1 = v28[0]
    var v26: s1 = v34
    let v33: s0 = v20.p0
    var v23: s1 = v34
    let v47: [Double] = v33.p1
    let v60: Double = v47[1]
    v28[0] = v34
    v23 = v20
    let v44: s5 = s5(p0: v26, p1: v20)
    let v30: Double = v60 + v3
    let v86: s5 = f52(v44)
    let v70: Double = v30 - v60
    let v61: s1 = v86.p0
    v28[1] = v23
    v28[0] = v61
    return v70
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [s0(p0: [[0.0], [1.0]], p1: [2.0, 3.0, 4.0], p2: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [10.0, 11.0, 12.0], p2: [[13.0], [14.0], [15.0]])], p1: [s1(p0: s0(p0: [[16.0], [17.0]], p1: [18.0, 19.0, 20.0], p2: [[21.0], [22.0], [23.0]]), p1: s0(p0: [[24.0], [25.0]], p1: [26.0, 27.0, 28.0], p2: [[29.0], [30.0], [31.0]])), s1(p0: s0(p0: [[32.0], [33.0]], p1: [34.0, 35.0, 36.0], p2: [[37.0], [38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0]], p1: [42.0, 43.0, 44.0], p2: [[45.0], [46.0], [47.0]])), s1(p0: s0(p0: [[48.0], [49.0]], p1: [50.0, 51.0, 52.0], p2: [[53.0], [54.0], [55.0]]), p1: s0(p0: [[56.0], [57.0]], p1: [58.0, 59.0, 60.0], p2: [[61.0], [62.0], [63.0]]))]), p1: s2(p0: [s0(p0: [[64.0], [65.0]], p1: [66.0, 67.0, 68.0], p2: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0], [73.0]], p1: [74.0, 75.0, 76.0], p2: [[77.0], [78.0], [79.0]])], p1: [s1(p0: s0(p0: [[80.0], [81.0]], p1: [82.0, 83.0, 84.0], p2: [[85.0], [86.0], [87.0]]), p1: s0(p0: [[88.0], [89.0]], p1: [90.0, 91.0, 92.0], p2: [[93.0], [94.0], [95.0]])), s1(p0: s0(p0: [[96.0], [97.0]], p1: [98.0, 99.0, 100.0], p2: [[101.0], [102.0], [103.0]]), p1: s0(p0: [[104.0], [105.0]], p1: [106.0, 107.0, 108.0], p2: [[109.0], [110.0], [111.0]])), s1(p0: s0(p0: [[112.0], [113.0]], p1: [114.0, 115.0, 116.0], p2: [[117.0], [118.0], [119.0]]), p1: s0(p0: [[120.0], [121.0]], p1: [122.0, 123.0, 124.0], p2: [[125.0], [126.0], [127.0]]))]))
    let v1: Double = 128.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 128.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
