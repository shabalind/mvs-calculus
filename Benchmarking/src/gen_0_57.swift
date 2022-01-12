  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: [s2]
  }
  struct s9 {
    var p0: s3
    var p1: [[s1]]
  }
  @inline(never)
  func f0(_ v0: [[s9]], _ v1: Double) -> Double {
    let v7: [s9] = v0[2]
    let v11: s9 = v7[0]
    let v3: [[s1]] = v11.p1
    let v12: [s1] = v3[0]
    let v17: s1 = v12[0]
    let v30: s0 = v17.p1
    let v25: [[Double]] = v30.p0
    let v29: [Double] = v25[2]
    let v36: Double = v29[0]
    let v57: Double = v29[0]
    let v109: Double = v57 - v36
    return v109
  }
  func benchmark() {
    let v0: [[s9]] = [[s9(p0: s3(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0], [6.0]]), p1: [s2(p0: s0(p0: [[7.0], [8.0], [9.0]], p1: [[10.0]], p2: [[11.0], [12.0], [13.0]]), p1: [s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0]], p2: [[18.0], [19.0], [20.0]])]), s2(p0: s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0]], p2: [[25.0], [26.0], [27.0]]), p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]], p2: [[32.0], [33.0], [34.0]])])]), p1: [[s1(p0: [[s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0]], p2: [[39.0], [40.0], [41.0]])]], p1: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0]], p2: [[46.0], [47.0], [48.0]]))]])], [s9(p0: s3(p0: s0(p0: [[49.0], [50.0], [51.0]], p1: [[52.0]], p2: [[53.0], [54.0], [55.0]]), p1: [s2(p0: s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]], p2: [[60.0], [61.0], [62.0]]), p1: [s0(p0: [[63.0], [64.0], [65.0]], p1: [[66.0]], p2: [[67.0], [68.0], [69.0]])]), s2(p0: s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0]], p2: [[74.0], [75.0], [76.0]]), p1: [s0(p0: [[77.0], [78.0], [79.0]], p1: [[80.0]], p2: [[81.0], [82.0], [83.0]])])]), p1: [[s1(p0: [[s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]], p2: [[88.0], [89.0], [90.0]])]], p1: s0(p0: [[91.0], [92.0], [93.0]], p1: [[94.0]], p2: [[95.0], [96.0], [97.0]]))]])], [s9(p0: s3(p0: s0(p0: [[98.0], [99.0], [100.0]], p1: [[101.0]], p2: [[102.0], [103.0], [104.0]]), p1: [s2(p0: s0(p0: [[105.0], [106.0], [107.0]], p1: [[108.0]], p2: [[109.0], [110.0], [111.0]]), p1: [s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]], p2: [[116.0], [117.0], [118.0]])]), s2(p0: s0(p0: [[119.0], [120.0], [121.0]], p1: [[122.0]], p2: [[123.0], [124.0], [125.0]]), p1: [s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0]], p2: [[130.0], [131.0], [132.0]])])]), p1: [[s1(p0: [[s0(p0: [[133.0], [134.0], [135.0]], p1: [[136.0]], p2: [[137.0], [138.0], [139.0]])]], p1: s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0]], p2: [[144.0], [145.0], [146.0]]))]])]]
    let v1: Double = 147.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 147.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
