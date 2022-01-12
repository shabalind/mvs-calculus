  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [s1]
    var p1: s1
  }
  func f46(_ v0: s1) -> s1 {
    let v7: [[s0]] = v0.p0
    let v1: [[[s0]]] = [v7, v7, v7, v7]
    let v2: [[[[s0]]]] = [v1, v1, v1, v1, v1, v1]
    let v5: [[s0]] = v0.p0
    var v6: s1 = v0
    var v8: s1 = v6
    let v4: [[s0]] = v6.p1
    var v10: [[s0]] = v4
    var v14: [[[s0]]] = v1
    let v3: [[[s0]]] = v2[4]
    let v9: [[s0]] = v8.p1
    var v20: [[[[s0]]]] = v2
    v20[3] = v3
    var v12: [[s0]] = v5
    let v11: [[[s0]]] = v20[1]
    v20[5] = v14
    v20[0] = v14
    v6.p0 = v5
    let v18: [[s0]] = v8.p0
    let v16: [[s0]] = v6.p0
    let v13: [s0] = v10[2]
    let v23: s0 = v13[0]
    v14[1] = v9
    v10[0] = v13
    let v30: s0 = v13[0]
    v8.p0 = v10
    v8.p1 = v7
    let v46: [[s0]] = v11[3]
    let v15: [[s0]] = v0.p0
    let v26: [[s0]] = v6.p1
    v14[0] = v18
    v6.p0 = v15
    let v21: [s0] = v10[2]
    let v25: [[s0]] = v8.p0
    v6.p1 = v16
    var v29: [[[s0]]] = v11
    v8.p1 = v26
    var v57: s1 = v0
    var v48: [s0] = v13
    v10[2] = v13
    let v68: [[s0]] = v8.p0
    var v51: s1 = v6
    v20[2] = v29
    let v37: [[s0]] = v8.p1
    v29[2] = v18
    let v45: [[s0]] = v51.p0
    v57.p1 = v46
    let v53: [[s0]] = v51.p0
    let v36: [[s0]] = v0.p1
    v29[2] = v12
    var v84: [s0] = v21
    v8.p0 = v37
    v12[1] = v48
    v57.p0 = v45
    let v61: [[s0]] = v51.p1
    v6.p0 = v53
    v6.p1 = v10
    v8.p1 = v4
    v20[4] = v3
    v84 = v48
    v84[0] = v30
    let v54: [[s0]] = v51.p0
    v8.p0 = v9
    v8.p0 = v18
    v20 = v2
    v51.p0 = v15
    v29[0] = v36
    let v157: [s0] = v53[0]
    v6.p1 = v15
    var v113: s1 = v6
    v12 = v54
    v10[0] = v157
    v113.p0 = v25
    v57.p0 = v7
    v12[1] = v84
    v57.p0 = v61
    v84[0] = v23
    let v102: [[s0]] = v113.p1
    v6.p1 = v9
    v51 = v113
    v51.p1 = v54
    v113.p0 = v102
    v57.p1 = v68
    return v57
  }
  func f29(_ v0: s3) -> s3 {
    var v1: s3 = v0
    let v6: s1 = v1.p1
    let v5: s1 = f46(v6)
    let v7: [s1] = v0.p0
    v1.p0 = v7
    var v2: s3 = v0
    let v10: [s1] = v2.p0
    var v16: [s1] = v10
    let v9: [[s1]] = [v16]
    v16[0] = v6
    var v4: s1 = v5
    v16[0] = v4
    let v17: [s1] = v9[0]
    let v21: s1 = f46(v5)
    v16[0] = v6
    let v15: [s1] = v1.p0
    let v26: [[s0]] = v21.p1
    v4.p1 = v26
    let v41: [[s0]] = v4.p1
    let v22: s1 = f46(v6)
    v1.p0 = v10
    let v25: s1 = f46(v6)
    let v40: [[s0]] = v25.p0
    var v62: [[s0]] = v40
    v2.p1 = v4
    let v109: [s1] = v9[0]
    v4.p1 = v26
    v4.p0 = v41
    let v66: s1 = v109[1]
    v16[1] = v22
    var v68: s3 = v2
    v4.p1 = v62
    v1.p1 = v4
    let v84: [[s0]] = v25.p0
    v68.p0 = v17
    v4.p1 = v84
    v1.p0 = v15
    var v123: s3 = v68
    v68.p1 = v66
    return v123
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v6: s3 = f29(v0)
    let v7: s1 = v6.p1
    let v22: [[s0]] = v7.p0
    var v20: Double = v1
    let v38: [s0] = v22[1]
    let v82: s0 = v38[0]
    let v101: [[Double]] = v82.p1
    let v91: [Double] = v101[2]
    let v85: Double = v91[0]
    let v132: Double = v85 + v20
    return v132
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]], p1: [[s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]]), s1(p0: [[s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])], [s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])], [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])]], p1: [[s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])], [s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]])], [s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]])], p1: s1(p0: [[s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]])], [s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]])], [s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]])]], p1: [[s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]])], [s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0], [84.0]])], [s0(p0: [[85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])]]))
    let v1: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
