  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: [s1]
    var p1: s2
  }
  func f22(_ v0: Double) -> Double {
    let v6: Double = v0 + v0
    var v5: Double = v6
    var v1: Double = v0
    v1 = v5
    var v3: Double = v1
    var v8: Double = v6
    var v11: Double = v8
    var v12: Double = v5
    var v4: Double = v8
    v3 = v4
    var v17: Double = v12
    var v14: Double = v3
    var v2: Double = v11
    var v15: Double = v14
    var v10: Double = v14
    let v27: [Double] = [v15, v10, v17]
    let v30: [[Double]] = [v27, v27, v27, v27, v27, v27]
    let v20: Double = v11 + v17
    v14 = v2
    let v46: [Double] = v30[0]
    let v23: [Double] = v30[0]
    let v16: Double = v5 + v4
    var v24: [Double] = v46
    var v13: [Double] = v46
    v13[1] = v20
    v24[1] = v20
    var v34: [[Double]] = v30
    v13[2] = v14
    v13[0] = v8
    v13[1] = v1
    var v41: [Double] = v27
    let v60: [Double] = v34[1]
    let v32: [Double] = v30[4]
    v15 = v3
    var v53: [Double] = v13
    v13[2] = v3
    var v56: [Double] = v32
    var v35: [Double] = v60
    v24[2] = v3
    v35[2] = v16
    v24[1] = v1
    v34[4] = v56
    let v96: Double = v35[0]
    var v52: [Double] = v53
    let v65: Double = v52[1]
    let v117: Double = v41[1]
    v41[0] = v20
    v52[1] = v117
    let v105: [Double] = [v8, v96, v1, v20, v96, v65]
    var v115: [Double] = v105
    v41[1] = v96
    let v148: Double = v115[5]
    v52[1] = v4
    let v79: Double = v24[0]
    v34[0] = v23
    v35[2] = v79
    var v94: Double = v148
    return v94
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [[s2]], _ v2: Double) -> Double {
    let v16: Double = v2 / v2
    let v19: [Double] = [v16, v16, v16, v16, v16, v2, v2]
    let v36: Double = f22(v2)
    let v77: Double = v19[2]
    let v60: Double = f22(v77)
    let v123: Double = f22(v60)
    let v232: Double = v123 * v36
    return v232
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [[s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]])], p1: s2(p0: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])], p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])]))
    let v1: [[s2]] = [[s2(p0: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])], p1: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])])], [s2(p0: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])], p1: [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])])]]
    let v2: Double = 56.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 56.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
