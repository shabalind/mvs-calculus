  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: [s1]
  }
  struct s6 {
    var p0: s0
    var p1: s3
  }
  struct s8 {
    var p0: s0
    var p1: [[s4]]
  }
  func f1(_ v0: s8) -> s8 {
    return v0
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: s6, _ v2: Double) -> Double {
    let v3: s8 = f1(v0)
    let v4: s8 = f1(v3)
    let v31: s0 = v4.p0
    let v17: [[Double]] = v31.p1
    let v37: [Double] = v17[1]
    let v38: Double = v37[0]
    let v76: [Double] = v17[2]
    var v73: [Double] = v76
    let v72: Double = v73[0]
    v73[0] = v38
    return v72
  }
  func benchmark() {
    let v0: s8 = s8(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [[s4(p0: s1(p0: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], p1: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]), p1: [s1(p0: [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])], p1: [s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])]), s1(p0: [s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])], p1: [s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])]), s1(p0: [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]]), s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]]), s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]])], p1: [s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]]), s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]]), s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]])])])], [s4(p0: s1(p0: [s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]]), s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]]), s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]])], p1: [s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]]), s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]]), s0(p0: [[120.0]], p1: [[121.0], [122.0], [123.0]])]), p1: [s1(p0: [s0(p0: [[124.0]], p1: [[125.0], [126.0], [127.0]]), s0(p0: [[128.0]], p1: [[129.0], [130.0], [131.0]]), s0(p0: [[132.0]], p1: [[133.0], [134.0], [135.0]])], p1: [s0(p0: [[136.0]], p1: [[137.0], [138.0], [139.0]]), s0(p0: [[140.0]], p1: [[141.0], [142.0], [143.0]]), s0(p0: [[144.0]], p1: [[145.0], [146.0], [147.0]])]), s1(p0: [s0(p0: [[148.0]], p1: [[149.0], [150.0], [151.0]]), s0(p0: [[152.0]], p1: [[153.0], [154.0], [155.0]]), s0(p0: [[156.0]], p1: [[157.0], [158.0], [159.0]])], p1: [s0(p0: [[160.0]], p1: [[161.0], [162.0], [163.0]]), s0(p0: [[164.0]], p1: [[165.0], [166.0], [167.0]]), s0(p0: [[168.0]], p1: [[169.0], [170.0], [171.0]])]), s1(p0: [s0(p0: [[172.0]], p1: [[173.0], [174.0], [175.0]]), s0(p0: [[176.0]], p1: [[177.0], [178.0], [179.0]]), s0(p0: [[180.0]], p1: [[181.0], [182.0], [183.0]])], p1: [s0(p0: [[184.0]], p1: [[185.0], [186.0], [187.0]]), s0(p0: [[188.0]], p1: [[189.0], [190.0], [191.0]]), s0(p0: [[192.0]], p1: [[193.0], [194.0], [195.0]])])])]])
    let v1: s6 = s6(p0: s0(p0: [[196.0]], p1: [[197.0], [198.0], [199.0]]), p1: s3(p0: [s1(p0: [s0(p0: [[200.0]], p1: [[201.0], [202.0], [203.0]]), s0(p0: [[204.0]], p1: [[205.0], [206.0], [207.0]]), s0(p0: [[208.0]], p1: [[209.0], [210.0], [211.0]])], p1: [s0(p0: [[212.0]], p1: [[213.0], [214.0], [215.0]]), s0(p0: [[216.0]], p1: [[217.0], [218.0], [219.0]]), s0(p0: [[220.0]], p1: [[221.0], [222.0], [223.0]])]), s1(p0: [s0(p0: [[224.0]], p1: [[225.0], [226.0], [227.0]]), s0(p0: [[228.0]], p1: [[229.0], [230.0], [231.0]]), s0(p0: [[232.0]], p1: [[233.0], [234.0], [235.0]])], p1: [s0(p0: [[236.0]], p1: [[237.0], [238.0], [239.0]]), s0(p0: [[240.0]], p1: [[241.0], [242.0], [243.0]]), s0(p0: [[244.0]], p1: [[245.0], [246.0], [247.0]])]), s1(p0: [s0(p0: [[248.0]], p1: [[249.0], [250.0], [251.0]]), s0(p0: [[252.0]], p1: [[253.0], [254.0], [255.0]]), s0(p0: [[256.0]], p1: [[257.0], [258.0], [259.0]])], p1: [s0(p0: [[260.0]], p1: [[261.0], [262.0], [263.0]]), s0(p0: [[264.0]], p1: [[265.0], [266.0], [267.0]]), s0(p0: [[268.0]], p1: [[269.0], [270.0], [271.0]])])], p1: s0(p0: [[272.0]], p1: [[273.0], [274.0], [275.0]])))
    let v2: Double = 276.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 276.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
