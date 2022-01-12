  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
    var p2: [s0]
  }
  struct s3 {
    var p0: [[s0]]
    var p1: s1
    var p2: [s0]
  }
  struct s4 {
    var p0: [s3]
    var p1: [[s1]]
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v4: [[s1]] = v0.p1
    let v6: [s1] = v4[1]
    let v2: Double = v1 + v1
    var v7: [[s1]] = v4
    let v3: [s1] = v7[2]
    v7[1] = v3
    let v11: [s1] = v7[1]
    v7[2] = v11
    let v17: s1 = v11[0]
    let v30: Double = v2 * v1
    let v81: [s0] = v17.p0
    let v25: s0 = v81[0]
    let v51: [[Double]] = v25.p0
    v7[0] = v6
    let v66: [Double] = v51[0]
    let v109: Double = v66[0]
    let v183: Double = v30 * v109
    let v150: Double = v30 * v183
    return v150
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s3(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])]], p1: s1(p0: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], p1: [[s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]], p2: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]), p2: [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])]), s3(p0: [[s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])]], p1: s1(p0: [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])], p1: [[s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])], [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])], [s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])]], p2: [s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])]), p2: [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])]), s3(p0: [[s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])]], p1: s1(p0: [s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])], p1: [[s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])], [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])], [s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]])]], p2: [s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]])]), p2: [s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]]), s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]])])], p1: [[s1(p0: [s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]])], p1: [[s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]])], [s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]])], [s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]])]], p2: [s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]])])], [s1(p0: [s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]])], p1: [[s0(p0: [[120.0]], p1: [[121.0], [122.0], [123.0]])], [s0(p0: [[124.0]], p1: [[125.0], [126.0], [127.0]])], [s0(p0: [[128.0]], p1: [[129.0], [130.0], [131.0]])]], p2: [s0(p0: [[132.0]], p1: [[133.0], [134.0], [135.0]])])], [s1(p0: [s0(p0: [[136.0]], p1: [[137.0], [138.0], [139.0]])], p1: [[s0(p0: [[140.0]], p1: [[141.0], [142.0], [143.0]])], [s0(p0: [[144.0]], p1: [[145.0], [146.0], [147.0]])], [s0(p0: [[148.0]], p1: [[149.0], [150.0], [151.0]])]], p2: [s0(p0: [[152.0]], p1: [[153.0], [154.0], [155.0]])])]])
    let v1: Double = 156.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 156.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
