  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
    var p2: [s1]
    var p3: s0
    var p4: [s0]
  }
  struct s4 {
    var p0: s2
    var p1: [s2]
    var p2: [s0]
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v5: s2 = v0.p0
    var v13: s4 = v0
    let v10: [s0] = v13.p2
    v13.p0 = v5
    let v15: s0 = v10[1]
    var v46: s0 = v15
    v13.p2 = v10
    let v25: [[Double]] = v46.p1
    let v12: [Double] = v25[0]
    var v26: Double = v1
    let v43: Double = v12[0]
    let v69: Double = v26 - v43
    return v69
  }
  func benchmark() {
    let v0: s4 = s4(p0: s2(p0: [s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]], p1: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])])], p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), p2: [s1(p0: [[s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])], [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])]], p1: [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])]), s1(p0: [[s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])], [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])]], p1: [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]]), s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])])], p3: s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]]), p4: [s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])]), p1: [s2(p0: [s1(p0: [[s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]])], [s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]])]], p1: [s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]]), s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]]), s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]])])], p1: s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]]), p2: [s1(p0: [[s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]])], [s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]])]], p1: [s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]]), s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]]), s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]])]), s1(p0: [[s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0]])], [s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]])]], p1: [s0(p0: [[124.0], [125.0], [126.0]], p1: [[127.0]]), s0(p0: [[128.0], [129.0], [130.0]], p1: [[131.0]]), s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0]])])], p3: s0(p0: [[136.0], [137.0], [138.0]], p1: [[139.0]]), p4: [s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0]])]), s2(p0: [s1(p0: [[s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0]])], [s0(p0: [[148.0], [149.0], [150.0]], p1: [[151.0]])]], p1: [s0(p0: [[152.0], [153.0], [154.0]], p1: [[155.0]]), s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0]]), s0(p0: [[160.0], [161.0], [162.0]], p1: [[163.0]])])], p1: s0(p0: [[164.0], [165.0], [166.0]], p1: [[167.0]]), p2: [s1(p0: [[s0(p0: [[168.0], [169.0], [170.0]], p1: [[171.0]])], [s0(p0: [[172.0], [173.0], [174.0]], p1: [[175.0]])]], p1: [s0(p0: [[176.0], [177.0], [178.0]], p1: [[179.0]]), s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0]]), s0(p0: [[184.0], [185.0], [186.0]], p1: [[187.0]])]), s1(p0: [[s0(p0: [[188.0], [189.0], [190.0]], p1: [[191.0]])], [s0(p0: [[192.0], [193.0], [194.0]], p1: [[195.0]])]], p1: [s0(p0: [[196.0], [197.0], [198.0]], p1: [[199.0]]), s0(p0: [[200.0], [201.0], [202.0]], p1: [[203.0]]), s0(p0: [[204.0], [205.0], [206.0]], p1: [[207.0]])])], p3: s0(p0: [[208.0], [209.0], [210.0]], p1: [[211.0]]), p4: [s0(p0: [[212.0], [213.0], [214.0]], p1: [[215.0]])])], p2: [s0(p0: [[216.0], [217.0], [218.0]], p1: [[219.0]]), s0(p0: [[220.0], [221.0], [222.0]], p1: [[223.0]])])
    let v1: Double = 224.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 224.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
