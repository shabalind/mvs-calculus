  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: [[s1]]
    var p1: [s2]
  }
  struct s4 {
    var p0: s1
    var p1: [[s1]]
    var p2: s3
    var p3: s3
  }
  func f53(_ v0: Double) -> Double {
    var v4: Double = v0
    var v1: Double = v4
    var v8: Double = v1
    return v8
  }
  func f27(_ v0: Double) -> Double {
    let v4: Double = v0 / v0
    let v6: [Double] = [v4, v0, v0, v0, v4, v4, v4]
    let v1: Double = v6[1]
    let v5: Double = f53(v1)
    let v8: Double = v6[1]
    var v7: [Double] = v6
    var v9: [Double] = v7
    var v13: Double = v1
    v9[0] = v13
    let v12: Double = f53(v13)
    var v22: Double = v4
    let v18: Double = f53(v8)
    var v15: Double = v4
    let v34: Double = f53(v18)
    let v17: Double = v6[4]
    var v16: Double = v22
    v9[1] = v17
    v7[6] = v12
    v7[0] = v16
    v9[5] = v15
    let v25: Double = f53(v34)
    var v38: Double = v5
    v9[0] = v25
    let v69: Double = f53(v38)
    let v46: Double = v9[6]
    var v32: [Double] = v9
    let v44: Double = v6[4]
    let v39: Double = v32[2]
    v32[4] = v69
    v9[0] = v44
    v9[4] = v17
    v32[1] = v1
    let v142: Double = v46 + v39
    return v142
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    var v7: Double = v1
    let v9: Double = f53(v7)
    var v6: Double = v9
    v7 = v6
    let v8: [Double] = [v6, v7, v9, v6]
    let v11: Double = v8[0]
    let v12: Double = v8[0]
    v7 = v12
    let v59: Double = f27(v11)
    return v59
  }
  func benchmark() {
    let v0: s4 = s4(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), p1: [[s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))], [s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))], [s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]))]], p2: s3(p0: [[s1(p0: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p1: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]))], [s1(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]))]], p1: [s2(p0: [s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p1: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])), s1(p0: s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), p1: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])), s1(p0: s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), p1: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]]))], p1: s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]]))]), p3: s3(p0: [[s1(p0: s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]]), p1: s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]]))], [s1(p0: s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]]), p1: s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]]))]], p1: [s2(p0: [s1(p0: s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]]), p1: s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]])), s1(p0: s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]]), p1: s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]])), s1(p0: s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]]), p1: s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]]))], p1: s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]]))]))
    let v1: Double = 120.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 120.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
