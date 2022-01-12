  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[Double]]
    var p1: s0
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s3 {
    var p0: [s1]
    var p1: s2
  }
  func f88(_ v0: s2) -> s2 {
    let v2: [[s0]] = v0.p0
    var v12: s2 = v0
    v12.p0 = v2
    var v72: s2 = v12
    return v72
  }
  func f86(_ v0: [[s0]]) -> [[s0]] {
    let v5: [s0] = v0[1]
    var v7: [[s0]] = v0
    v7 = v0
    v7[2] = v5
    var v3: [s0] = v5
    v7[1] = v5
    v7[1] = v5
    v7[0] = v5
    v7[0] = v3
    v7[1] = v3
    var v109: [[s0]] = v7
    var v116: [[s0]] = v109
    return v116
  }
  func f77(_ v0: s2) -> s2 {
    var v7: s2 = v0
    var v6: s2 = v0
    let v4: [[s0]] = v6.p0
    let v8: [[s0]] = v7.p0
    let v3: [s0] = v4[0]
    v6.p0 = v8
    v7.p0 = v8
    v7.p0 = v8
    let v1: [[s0]] = v6.p0
    let v10: s2 = f88(v6)
    var v9: [s0] = v3
    var v18: s2 = v6
    let v16: [s0] = v18.p1
    v6.p0 = v1
    var v22: s2 = v6
    v6 = v10
    var v25: [s0] = v16
    v6.p1 = v25
    let v21: s0 = v9[0]
    let v23: [s0] = v18.p1
    v25[0] = v21
    var v17: [s0] = v16
    v22.p1 = v23
    v22.p1 = v17
    v22.p1 = v17
    return v22
  }
  func f63(_ v0: [[s0]]) -> [[s0]] {
    let v6: [[s0]] = f86(v0)
    let v1: [[s0]] = f86(v0)
    let v3: [s0] = v0[2]
    var v11: [[s0]] = v1
    var v12: [s0] = v3
    v11[2] = v12
    let v17: [[s0]] = f86(v11)
    let v15: [s0] = v6[2]
    v11[2] = v12
    let v48: [[s0]] = f86(v17)
    let v155: [[s0]] = f86(v48)
    v11[2] = v15
    return v155
  }
  func f52(_ v0: s2) -> s2 {
    var v5: s2 = v0
    let v1: [[s0]] = v0.p0
    var v3: [[s0]] = v1
    let v9: s2 = f77(v5)
    let v6: [s0] = v9.p1
    let v7: s2 = s2(p0: v3, p1: v6)
    var v14: [[s0]] = v1
    let v11: s2 = f77(v7)
    let v16: [[s0]] = f63(v14)
    v5.p0 = v14
    v5.p0 = v16
    return v11
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s3], _ v2: s3, _ v3: Double) -> Double {
    let v5: s2 = v0.p1
    let v4: s2 = f88(v5)
    let v16: s2 = f52(v4)
    let v58: [s0] = v16.p1
    let v46: s0 = v58[1]
    var v40: s0 = v46
    let v18: [[Double]] = v40.p1
    let v31: [Double] = v18[0]
    let v50: Double = v31[0]
    v40 = v46
    return v50
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s1(p0: [[0.0], [1.0]], p1: s0(p0: [[2.0], [3.0], [4.0]], p1: [[5.0]])), s1(p0: [[6.0], [7.0]], p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]))], p1: s2(p0: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])], [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])], [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])]], p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])]))
    let v1: [s3] = [s3(p0: [s1(p0: [[32.0], [33.0]], p1: s0(p0: [[34.0], [35.0], [36.0]], p1: [[37.0]])), s1(p0: [[38.0], [39.0]], p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]))], p1: s2(p0: [[s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])], [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])], [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])]], p1: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])]))]
    let v2: s3 = s3(p0: [s1(p0: [[64.0], [65.0]], p1: s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0]])), s1(p0: [[70.0], [71.0]], p1: s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]]))], p1: s2(p0: [[s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]])], [s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]])], [s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]])]], p1: [s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]), s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]])]))
    let v3: Double = 96.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 96.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
