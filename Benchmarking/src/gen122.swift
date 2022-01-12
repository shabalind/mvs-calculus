  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  func f1(_ v0: s1, _ v1: s3, _ v2: s1) -> s1 {
    var v6: s3 = v1
    let v7: [s3] = [v6, v1, v6]
    v6.p1 = v2
    let v8: s3 = v7[1]
    let v4: [s3] = [v1]
    let v3: s1 = v8.p1
    let v13: s3 = v4[0]
    let v17: s2 = v13.p0
    let v19: [s1] = v17.p1
    var v100: [s1] = v19
    v100[0] = v3
    let v138: s1 = v100[0]
    return v138
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: [s2], _ v2: Double) -> Double {
    let v6: s2 = v1[1]
    var v10: [s1] = v0
    let v7: s2 = v1[1]
    var v4: s2 = v6
    let v13: [s1] = v4.p1
    let v12: s1 = v13[1]
    let v8: s1 = v0[0]
    v4.p1 = v13
    let v9: [[s0]] = v8.p1
    let v17: [s1] = v7.p1
    let v3: s0 = v8.p0
    v10[1] = v12
    let v15: s1 = v10[1]
    var v19: s1 = v12
    let v22: [s1] = [v19, v15, v12]
    v4.p1 = v17
    v10[0] = v15
    let v11: s3 = s3(p0: v4, p1: v15)
    v4.p1 = v17
    v10[0] = v12
    v4.p1 = v22
    let v24: s1 = v17[2]
    let v14: s1 = v11.p1
    let v16: s1 = f1(v24, v11, v19)
    let v34: s1 = f1(v15, v11, v14)
    v19.p1 = v9
    v19.p2 = v3
    v10[1] = v34
    v10[1] = v16
    let v39: [s0] = v4.p0
    let v73: s1 = f1(v19, v11, v19)
    let v63: s0 = v39[1]
    v10[1] = v73
    let v98: [[Double]] = v63.p1
    let v101: [Double] = v98[1]
    v19.p2 = v3
    let v108: Double = v101[0]
    return v108
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [[s0(p0: [[3.0]], p1: [[4.0], [5.0]])]], p2: s0(p0: [[6.0]], p1: [[7.0], [8.0]])), s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: [[s0(p0: [[12.0]], p1: [[13.0], [14.0]])]], p2: s0(p0: [[15.0]], p1: [[16.0], [17.0]]))]
    let v1: [s2] = [s2(p0: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]])], p1: [s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: [[s0(p0: [[27.0]], p1: [[28.0], [29.0]])]], p2: s0(p0: [[30.0]], p1: [[31.0], [32.0]])), s1(p0: s0(p0: [[33.0]], p1: [[34.0], [35.0]]), p1: [[s0(p0: [[36.0]], p1: [[37.0], [38.0]])]], p2: s0(p0: [[39.0]], p1: [[40.0], [41.0]])), s1(p0: s0(p0: [[42.0]], p1: [[43.0], [44.0]]), p1: [[s0(p0: [[45.0]], p1: [[46.0], [47.0]])]], p2: s0(p0: [[48.0]], p1: [[49.0], [50.0]]))]), s2(p0: [s0(p0: [[51.0]], p1: [[52.0], [53.0]]), s0(p0: [[54.0]], p1: [[55.0], [56.0]])], p1: [s1(p0: s0(p0: [[57.0]], p1: [[58.0], [59.0]]), p1: [[s0(p0: [[60.0]], p1: [[61.0], [62.0]])]], p2: s0(p0: [[63.0]], p1: [[64.0], [65.0]])), s1(p0: s0(p0: [[66.0]], p1: [[67.0], [68.0]]), p1: [[s0(p0: [[69.0]], p1: [[70.0], [71.0]])]], p2: s0(p0: [[72.0]], p1: [[73.0], [74.0]])), s1(p0: s0(p0: [[75.0]], p1: [[76.0], [77.0]]), p1: [[s0(p0: [[78.0]], p1: [[79.0], [80.0]])]], p2: s0(p0: [[81.0]], p1: [[82.0], [83.0]]))])]
    let v2: Double = 84.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 84.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
