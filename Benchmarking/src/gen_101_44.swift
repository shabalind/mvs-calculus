  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [[s0]]
    var p1: [s1]
  }
  struct s5 {
    var p0: s2
    var p1: [[s3]]
  }
  struct s6 {
    var p0: s0
    var p1: [s5]
  }
  struct s7 {
    var p0: [[s6]]
    var p1: s6
  }
  struct s9 {
    var p0: [s3]
    var p1: s3
  }
  func f28(_ v0: s7) -> s7 {
    var v4: s7 = v0
    v4 = v0
    return v4
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: s5, _ v2: s3, _ v3: s9, _ v4: Double) -> Double {
    let v6: s7 = f28(v0)
    let v10: [[s6]] = v6.p0
    let v18: [s6] = v10[1]
    let v27: s6 = v18[0]
    let v68: s0 = v27.p0
    let v101: [Double] = v68.p0
    let v132: Double = v101[0]
    return v132
  }
  func benchmark() {
    let v0: s7 = s7(p0: [[s6(p0: s0(p0: [0.0, 1.0], p1: [[2.0], [3.0], [4.0]]), p1: [s5(p0: s2(p0: [s0(p0: [5.0, 6.0], p1: [[7.0], [8.0], [9.0]]), s0(p0: [10.0, 11.0], p1: [[12.0], [13.0], [14.0]]), s0(p0: [15.0, 16.0], p1: [[17.0], [18.0], [19.0]])], p1: s0(p0: [20.0, 21.0], p1: [[22.0], [23.0], [24.0]])), p1: [[s3(p0: [[s0(p0: [25.0, 26.0], p1: [[27.0], [28.0], [29.0]])]], p1: [s1(p0: s0(p0: [30.0, 31.0], p1: [[32.0], [33.0], [34.0]]), p1: s0(p0: [35.0, 36.0], p1: [[37.0], [38.0], [39.0]])), s1(p0: s0(p0: [40.0, 41.0], p1: [[42.0], [43.0], [44.0]]), p1: s0(p0: [45.0, 46.0], p1: [[47.0], [48.0], [49.0]]))])]])])], [s6(p0: s0(p0: [50.0, 51.0], p1: [[52.0], [53.0], [54.0]]), p1: [s5(p0: s2(p0: [s0(p0: [55.0, 56.0], p1: [[57.0], [58.0], [59.0]]), s0(p0: [60.0, 61.0], p1: [[62.0], [63.0], [64.0]]), s0(p0: [65.0, 66.0], p1: [[67.0], [68.0], [69.0]])], p1: s0(p0: [70.0, 71.0], p1: [[72.0], [73.0], [74.0]])), p1: [[s3(p0: [[s0(p0: [75.0, 76.0], p1: [[77.0], [78.0], [79.0]])]], p1: [s1(p0: s0(p0: [80.0, 81.0], p1: [[82.0], [83.0], [84.0]]), p1: s0(p0: [85.0, 86.0], p1: [[87.0], [88.0], [89.0]])), s1(p0: s0(p0: [90.0, 91.0], p1: [[92.0], [93.0], [94.0]]), p1: s0(p0: [95.0, 96.0], p1: [[97.0], [98.0], [99.0]]))])]])])]], p1: s6(p0: s0(p0: [100.0, 101.0], p1: [[102.0], [103.0], [104.0]]), p1: [s5(p0: s2(p0: [s0(p0: [105.0, 106.0], p1: [[107.0], [108.0], [109.0]]), s0(p0: [110.0, 111.0], p1: [[112.0], [113.0], [114.0]]), s0(p0: [115.0, 116.0], p1: [[117.0], [118.0], [119.0]])], p1: s0(p0: [120.0, 121.0], p1: [[122.0], [123.0], [124.0]])), p1: [[s3(p0: [[s0(p0: [125.0, 126.0], p1: [[127.0], [128.0], [129.0]])]], p1: [s1(p0: s0(p0: [130.0, 131.0], p1: [[132.0], [133.0], [134.0]]), p1: s0(p0: [135.0, 136.0], p1: [[137.0], [138.0], [139.0]])), s1(p0: s0(p0: [140.0, 141.0], p1: [[142.0], [143.0], [144.0]]), p1: s0(p0: [145.0, 146.0], p1: [[147.0], [148.0], [149.0]]))])]])]))
    let v1: s5 = s5(p0: s2(p0: [s0(p0: [150.0, 151.0], p1: [[152.0], [153.0], [154.0]]), s0(p0: [155.0, 156.0], p1: [[157.0], [158.0], [159.0]]), s0(p0: [160.0, 161.0], p1: [[162.0], [163.0], [164.0]])], p1: s0(p0: [165.0, 166.0], p1: [[167.0], [168.0], [169.0]])), p1: [[s3(p0: [[s0(p0: [170.0, 171.0], p1: [[172.0], [173.0], [174.0]])]], p1: [s1(p0: s0(p0: [175.0, 176.0], p1: [[177.0], [178.0], [179.0]]), p1: s0(p0: [180.0, 181.0], p1: [[182.0], [183.0], [184.0]])), s1(p0: s0(p0: [185.0, 186.0], p1: [[187.0], [188.0], [189.0]]), p1: s0(p0: [190.0, 191.0], p1: [[192.0], [193.0], [194.0]]))])]])
    let v2: s3 = s3(p0: [[s0(p0: [195.0, 196.0], p1: [[197.0], [198.0], [199.0]])]], p1: [s1(p0: s0(p0: [200.0, 201.0], p1: [[202.0], [203.0], [204.0]]), p1: s0(p0: [205.0, 206.0], p1: [[207.0], [208.0], [209.0]])), s1(p0: s0(p0: [210.0, 211.0], p1: [[212.0], [213.0], [214.0]]), p1: s0(p0: [215.0, 216.0], p1: [[217.0], [218.0], [219.0]]))])
    let v3: s9 = s9(p0: [s3(p0: [[s0(p0: [220.0, 221.0], p1: [[222.0], [223.0], [224.0]])]], p1: [s1(p0: s0(p0: [225.0, 226.0], p1: [[227.0], [228.0], [229.0]]), p1: s0(p0: [230.0, 231.0], p1: [[232.0], [233.0], [234.0]])), s1(p0: s0(p0: [235.0, 236.0], p1: [[237.0], [238.0], [239.0]]), p1: s0(p0: [240.0, 241.0], p1: [[242.0], [243.0], [244.0]]))])], p1: s3(p0: [[s0(p0: [245.0, 246.0], p1: [[247.0], [248.0], [249.0]])]], p1: [s1(p0: s0(p0: [250.0, 251.0], p1: [[252.0], [253.0], [254.0]]), p1: s0(p0: [255.0, 256.0], p1: [[257.0], [258.0], [259.0]])), s1(p0: s0(p0: [260.0, 261.0], p1: [[262.0], [263.0], [264.0]]), p1: s0(p0: [265.0, 266.0], p1: [[267.0], [268.0], [269.0]]))]))
    let v4: Double = 270.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 270.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
