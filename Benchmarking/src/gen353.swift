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
    var p0: [s1]
    var p1: [s1]
  }
  struct s3 {
    var p0: s0
    var p1: [s2]
    var p2: s0
    var p3: [[s2]]
    var p4: [[s0]]
  }
  struct s4 {
    var p0: s2
  }
  struct s6 {
    var p0: s2
    var p1: s2
  }
  struct s8 {
    var p0: [s4]
    var p1: [[s3]]
  }
  func f27(_ v0: s0, _ v1: Double) -> Double {
    let v6: Double = v1 - v1
    let v25: Double = v6 * v1
    let v18: Double = v25 / v1
    return v18
  }
  func f3(_ v0: [[s6]]) -> [[s6]] {
    var v2: [[s6]] = v0
    v2 = v0
    v2 = v0
    let v18: [s6] = v2[0]
    let v35: [[[s6]]] = [v2, v0, v2, v2, v2]
    let v32: [[s6]] = v35[1]
    v2[2] = v18
    var v45: [[s6]] = v32
    return v45
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: [s6], _ v2: Double) -> Double {
    var v3: [s6] = v1
    var v4: [s6] = v1
    var v9: Double = v2
    let v13: [[s6]] = [v4, v4, v4]
    var v12: Double = v9
    let v10: [[s6]] = f3(v13)
    var v19: [[s6]] = v10
    let v18: [s6] = v19[2]
    var v32: Double = v12
    let v38: s6 = v18[0]
    v19[2] = v3
    let v30: s2 = v38.p1
    let v49: [s1] = v30.p1
    let v39: [s1] = v30.p0
    v3 = v4
    var v94: [s1] = v39
    var v69: Double = v12
    let v77: Double = v12 / v12
    var v93: [s1] = v49
    let v73: s1 = v94[0]
    var v59: s1 = v73
    let v176: [Double] = [v77, v2, v32, v77, v9, v69, v69]
    let v76: Double = v176[5]
    v94[1] = v59
    let v109: s0 = v59.p0
    let v150: s1 = v93[0]
    let v141: Double = f27(v109, v76)
    let v206: [[s0]] = v73.p1
    v94[1] = v150
    v59.p1 = v206
    return v141
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: [s4(p0: s2(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [[s0(p0: [[3.0]], p1: [[4.0], [5.0]])]]), s1(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: [[s0(p0: [[9.0]], p1: [[10.0], [11.0]])]])], p1: [s1(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0]]), p1: [[s0(p0: [[15.0]], p1: [[16.0], [17.0]])]])])), s4(p0: s2(p0: [s1(p0: s0(p0: [[18.0]], p1: [[19.0], [20.0]]), p1: [[s0(p0: [[21.0]], p1: [[22.0], [23.0]])]]), s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: [[s0(p0: [[27.0]], p1: [[28.0], [29.0]])]])], p1: [s1(p0: s0(p0: [[30.0]], p1: [[31.0], [32.0]]), p1: [[s0(p0: [[33.0]], p1: [[34.0], [35.0]])]])])), s4(p0: s2(p0: [s1(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0]]), p1: [[s0(p0: [[39.0]], p1: [[40.0], [41.0]])]]), s1(p0: s0(p0: [[42.0]], p1: [[43.0], [44.0]]), p1: [[s0(p0: [[45.0]], p1: [[46.0], [47.0]])]])], p1: [s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0]]), p1: [[s0(p0: [[51.0]], p1: [[52.0], [53.0]])]])]))], p1: [[s3(p0: s0(p0: [[54.0]], p1: [[55.0], [56.0]]), p1: [s2(p0: [s1(p0: s0(p0: [[57.0]], p1: [[58.0], [59.0]]), p1: [[s0(p0: [[60.0]], p1: [[61.0], [62.0]])]]), s1(p0: s0(p0: [[63.0]], p1: [[64.0], [65.0]]), p1: [[s0(p0: [[66.0]], p1: [[67.0], [68.0]])]])], p1: [s1(p0: s0(p0: [[69.0]], p1: [[70.0], [71.0]]), p1: [[s0(p0: [[72.0]], p1: [[73.0], [74.0]])]])])], p2: s0(p0: [[75.0]], p1: [[76.0], [77.0]]), p3: [[s2(p0: [s1(p0: s0(p0: [[78.0]], p1: [[79.0], [80.0]]), p1: [[s0(p0: [[81.0]], p1: [[82.0], [83.0]])]]), s1(p0: s0(p0: [[84.0]], p1: [[85.0], [86.0]]), p1: [[s0(p0: [[87.0]], p1: [[88.0], [89.0]])]])], p1: [s1(p0: s0(p0: [[90.0]], p1: [[91.0], [92.0]]), p1: [[s0(p0: [[93.0]], p1: [[94.0], [95.0]])]])])], [s2(p0: [s1(p0: s0(p0: [[96.0]], p1: [[97.0], [98.0]]), p1: [[s0(p0: [[99.0]], p1: [[100.0], [101.0]])]]), s1(p0: s0(p0: [[102.0]], p1: [[103.0], [104.0]]), p1: [[s0(p0: [[105.0]], p1: [[106.0], [107.0]])]])], p1: [s1(p0: s0(p0: [[108.0]], p1: [[109.0], [110.0]]), p1: [[s0(p0: [[111.0]], p1: [[112.0], [113.0]])]])])]], p4: [[s0(p0: [[114.0]], p1: [[115.0], [116.0]])], [s0(p0: [[117.0]], p1: [[118.0], [119.0]])], [s0(p0: [[120.0]], p1: [[121.0], [122.0]])]])], [s3(p0: s0(p0: [[123.0]], p1: [[124.0], [125.0]]), p1: [s2(p0: [s1(p0: s0(p0: [[126.0]], p1: [[127.0], [128.0]]), p1: [[s0(p0: [[129.0]], p1: [[130.0], [131.0]])]]), s1(p0: s0(p0: [[132.0]], p1: [[133.0], [134.0]]), p1: [[s0(p0: [[135.0]], p1: [[136.0], [137.0]])]])], p1: [s1(p0: s0(p0: [[138.0]], p1: [[139.0], [140.0]]), p1: [[s0(p0: [[141.0]], p1: [[142.0], [143.0]])]])])], p2: s0(p0: [[144.0]], p1: [[145.0], [146.0]]), p3: [[s2(p0: [s1(p0: s0(p0: [[147.0]], p1: [[148.0], [149.0]]), p1: [[s0(p0: [[150.0]], p1: [[151.0], [152.0]])]]), s1(p0: s0(p0: [[153.0]], p1: [[154.0], [155.0]]), p1: [[s0(p0: [[156.0]], p1: [[157.0], [158.0]])]])], p1: [s1(p0: s0(p0: [[159.0]], p1: [[160.0], [161.0]]), p1: [[s0(p0: [[162.0]], p1: [[163.0], [164.0]])]])])], [s2(p0: [s1(p0: s0(p0: [[165.0]], p1: [[166.0], [167.0]]), p1: [[s0(p0: [[168.0]], p1: [[169.0], [170.0]])]]), s1(p0: s0(p0: [[171.0]], p1: [[172.0], [173.0]]), p1: [[s0(p0: [[174.0]], p1: [[175.0], [176.0]])]])], p1: [s1(p0: s0(p0: [[177.0]], p1: [[178.0], [179.0]]), p1: [[s0(p0: [[180.0]], p1: [[181.0], [182.0]])]])])]], p4: [[s0(p0: [[183.0]], p1: [[184.0], [185.0]])], [s0(p0: [[186.0]], p1: [[187.0], [188.0]])], [s0(p0: [[189.0]], p1: [[190.0], [191.0]])]])], [s3(p0: s0(p0: [[192.0]], p1: [[193.0], [194.0]]), p1: [s2(p0: [s1(p0: s0(p0: [[195.0]], p1: [[196.0], [197.0]]), p1: [[s0(p0: [[198.0]], p1: [[199.0], [200.0]])]]), s1(p0: s0(p0: [[201.0]], p1: [[202.0], [203.0]]), p1: [[s0(p0: [[204.0]], p1: [[205.0], [206.0]])]])], p1: [s1(p0: s0(p0: [[207.0]], p1: [[208.0], [209.0]]), p1: [[s0(p0: [[210.0]], p1: [[211.0], [212.0]])]])])], p2: s0(p0: [[213.0]], p1: [[214.0], [215.0]]), p3: [[s2(p0: [s1(p0: s0(p0: [[216.0]], p1: [[217.0], [218.0]]), p1: [[s0(p0: [[219.0]], p1: [[220.0], [221.0]])]]), s1(p0: s0(p0: [[222.0]], p1: [[223.0], [224.0]]), p1: [[s0(p0: [[225.0]], p1: [[226.0], [227.0]])]])], p1: [s1(p0: s0(p0: [[228.0]], p1: [[229.0], [230.0]]), p1: [[s0(p0: [[231.0]], p1: [[232.0], [233.0]])]])])], [s2(p0: [s1(p0: s0(p0: [[234.0]], p1: [[235.0], [236.0]]), p1: [[s0(p0: [[237.0]], p1: [[238.0], [239.0]])]]), s1(p0: s0(p0: [[240.0]], p1: [[241.0], [242.0]]), p1: [[s0(p0: [[243.0]], p1: [[244.0], [245.0]])]])], p1: [s1(p0: s0(p0: [[246.0]], p1: [[247.0], [248.0]]), p1: [[s0(p0: [[249.0]], p1: [[250.0], [251.0]])]])])]], p4: [[s0(p0: [[252.0]], p1: [[253.0], [254.0]])], [s0(p0: [[255.0]], p1: [[256.0], [257.0]])], [s0(p0: [[258.0]], p1: [[259.0], [260.0]])]])]])]
    let v1: [s6] = [s6(p0: s2(p0: [s1(p0: s0(p0: [[261.0]], p1: [[262.0], [263.0]]), p1: [[s0(p0: [[264.0]], p1: [[265.0], [266.0]])]]), s1(p0: s0(p0: [[267.0]], p1: [[268.0], [269.0]]), p1: [[s0(p0: [[270.0]], p1: [[271.0], [272.0]])]])], p1: [s1(p0: s0(p0: [[273.0]], p1: [[274.0], [275.0]]), p1: [[s0(p0: [[276.0]], p1: [[277.0], [278.0]])]])]), p1: s2(p0: [s1(p0: s0(p0: [[279.0]], p1: [[280.0], [281.0]]), p1: [[s0(p0: [[282.0]], p1: [[283.0], [284.0]])]]), s1(p0: s0(p0: [[285.0]], p1: [[286.0], [287.0]]), p1: [[s0(p0: [[288.0]], p1: [[289.0], [290.0]])]])], p1: [s1(p0: s0(p0: [[291.0]], p1: [[292.0], [293.0]]), p1: [[s0(p0: [[294.0]], p1: [[295.0], [296.0]])]])]))]
    let v2: Double = 297.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 297.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
