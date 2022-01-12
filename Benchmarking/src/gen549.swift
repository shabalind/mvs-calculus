  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s1
  }
  func f93(_ v0: [Double]) -> [Double] {
    let v6: Double = v0[0]
    let v4: Double = v6 * v6
    var v5: [Double] = v0
    v5[0] = v4
    return v5
  }
  func f89(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    var v6: [[Double]] = v5
    let v2: [[Double]] = v0.p0
    let v7: [Double] = v5[1]
    let v4: Double = v7[0]
    var v10: [[Double]] = v2
    v10[0] = v7
    v10[1] = v7
    v10[0] = v7
    v6[1] = v7
    var v18: [Double] = v7
    let v3: [Double] = v0.p1
    v10[0] = v18
    v18[0] = v4
    let v13: [Double] = f93(v18)
    let v31: [Double] = f93(v13)
    let v26: [Double] = v6[0]
    let v51: Double = v26[0]
    v18[0] = v51
    let v65: s0 = s0(p0: v10, p1: v3)
    v10[1] = v31
    return v65
  }
  func f6(_ v0: Double) -> Double {
    var v2: Double = v0
    var v5: Double = v0
    var v3: Double = v0
    var v9: Double = v5
    var v1: Double = v3
    var v6: Double = v0
    var v8: Double = v6
    let v18: Double = v8 * v2
    var v14: Double = v1
    let v17: [Double] = [v2, v2, v18, v14, v9]
    var v16: [Double] = v17
    v16[4] = v9
    var v25: [Double] = v17
    let v40: Double = v17[1]
    let v12: Double = v25[1]
    var v31: [Double] = v17
    let v22: [[Double]] = [v17, v17, v31, v25]
    var v41: [[Double]] = v22
    v16[4] = v6
    var v27: Double = v5
    v41[3] = v16
    let v26: [Double] = v41[3]
    let v60: [Double] = v41[2]
    var v38: [Double] = v60
    v38[1] = v0
    var v28: [[Double]] = v41
    var v47: [[Double]] = v22
    let v65: [Double] = v47[0]
    let v43: Double = v38[3]
    let v52: [Double] = v28[0]
    var v34: Double = v12
    var v51: [Double] = v16
    var v56: [Double] = v60
    let v121: Double = v52[4]
    var v54: Double = v40
    v25[3] = v43
    v51[1] = v34
    v25[3] = v27
    v41[0] = v65
    v56[2] = v18
    var v61: Double = v40
    v41[0] = v26
    let v106: Double = v121 + v27
    v25[4] = v12
    v16[0] = v54
    v47[3] = v51
    v28[2] = v38
    v41[3] = v56
    v25[4] = v61
    return v106
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: [[s2]], _ v2: [[s2]], _ v3: s0, _ v4: Double) -> Double {
    let v6: [s0] = [v3, v3, v3, v3, v3, v3]
    let v7: Double = f6(v4)
    let v13: s0 = f89(v3)
    let v10: s0 = v6[4]
    let v28: s0 = f89(v13)
    let v37: [[Double]] = v28.p0
    let v31: [Double] = v37[1]
    let v25: [Double] = v10.p1
    var v23: [Double] = v31
    let v59: Double = v7 - v4
    v23[0] = v4
    let v41: Double = v23[0]
    let v55: Double = v25[1]
    var v108: Double = v55
    let v102: Double = v59 - v108
    v108 = v41
    v23[0] = v102
    let v467: Double = v55 - v102
    return v467
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [2.0, 3.0, 4.0])], [s0(p0: [[5.0], [6.0]], p1: [7.0, 8.0, 9.0])], [s0(p0: [[10.0], [11.0]], p1: [12.0, 13.0, 14.0])]], p1: s0(p0: [[15.0], [16.0]], p1: [17.0, 18.0, 19.0])), s1(p0: [[s0(p0: [[20.0], [21.0]], p1: [22.0, 23.0, 24.0])], [s0(p0: [[25.0], [26.0]], p1: [27.0, 28.0, 29.0])], [s0(p0: [[30.0], [31.0]], p1: [32.0, 33.0, 34.0])]], p1: s0(p0: [[35.0], [36.0]], p1: [37.0, 38.0, 39.0]))], p1: s1(p0: [[s0(p0: [[40.0], [41.0]], p1: [42.0, 43.0, 44.0])], [s0(p0: [[45.0], [46.0]], p1: [47.0, 48.0, 49.0])], [s0(p0: [[50.0], [51.0]], p1: [52.0, 53.0, 54.0])]], p1: s0(p0: [[55.0], [56.0]], p1: [57.0, 58.0, 59.0])))]]
    let v1: [[s2]] = [[s2(p0: [s0(p0: [[60.0], [61.0]], p1: [62.0, 63.0, 64.0]), s0(p0: [[65.0], [66.0]], p1: [67.0, 68.0, 69.0])], p1: s0(p0: [[70.0], [71.0]], p1: [72.0, 73.0, 74.0]))], [s2(p0: [s0(p0: [[75.0], [76.0]], p1: [77.0, 78.0, 79.0]), s0(p0: [[80.0], [81.0]], p1: [82.0, 83.0, 84.0])], p1: s0(p0: [[85.0], [86.0]], p1: [87.0, 88.0, 89.0]))]]
    let v2: [[s2]] = [[s2(p0: [s0(p0: [[90.0], [91.0]], p1: [92.0, 93.0, 94.0]), s0(p0: [[95.0], [96.0]], p1: [97.0, 98.0, 99.0])], p1: s0(p0: [[100.0], [101.0]], p1: [102.0, 103.0, 104.0]))], [s2(p0: [s0(p0: [[105.0], [106.0]], p1: [107.0, 108.0, 109.0]), s0(p0: [[110.0], [111.0]], p1: [112.0, 113.0, 114.0])], p1: s0(p0: [[115.0], [116.0]], p1: [117.0, 118.0, 119.0]))], [s2(p0: [s0(p0: [[120.0], [121.0]], p1: [122.0, 123.0, 124.0]), s0(p0: [[125.0], [126.0]], p1: [127.0, 128.0, 129.0])], p1: s0(p0: [[130.0], [131.0]], p1: [132.0, 133.0, 134.0]))]]
    let v3: s0 = s0(p0: [[135.0], [136.0]], p1: [137.0, 138.0, 139.0])
    let v4: Double = 140.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 140.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
