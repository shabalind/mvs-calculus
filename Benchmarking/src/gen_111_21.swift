  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: [s1]
  }
  struct s4 {
    var p0: [[s3]]
    var p1: [s0]
  }
  struct s5 {
    var p0: s1
    var p1: [s4]
  }
  struct s7 {
    var p0: s2
    var p1: s5
  }
  @inline(never)
  func f0(_ v0: [[s5]], _ v1: s7, _ v2: Double) -> Double {
    let v7: s5 = v1.p1
    let v3: s1 = v7.p0
    let v6: [s0] = v3.p1
    let v9: s2 = v1.p0
    let v13: [s0] = v9.p0
    let v28: s0 = v6[0]
    let v20: s0 = v13[2]
    let v17: [Double] = v28.p0
    var v22: [Double] = v17
    let v15: Double = v17[1]
    var v32: Double = v15
    var v37: [Double] = v22
    let v39: [[Double]] = v20.p1
    let v46: [Double] = v39[1]
    let v56: Double = v37[0]
    let v82: Double = v46[0]
    v37[1] = v32
    let v125: Double = v56 / v82
    var v78: Double = v125
    return v78
  }
  func benchmark() {
    let v0: [[s5]] = [[s5(p0: s1(p0: s0(p0: [0.0, 1.0], p1: [[2.0], [3.0], [4.0]]), p1: [s0(p0: [5.0, 6.0], p1: [[7.0], [8.0], [9.0]]), s0(p0: [10.0, 11.0], p1: [[12.0], [13.0], [14.0]]), s0(p0: [15.0, 16.0], p1: [[17.0], [18.0], [19.0]])]), p1: [s4(p0: [[s3(p0: s0(p0: [20.0, 21.0], p1: [[22.0], [23.0], [24.0]]), p1: [s1(p0: s0(p0: [25.0, 26.0], p1: [[27.0], [28.0], [29.0]]), p1: [s0(p0: [30.0, 31.0], p1: [[32.0], [33.0], [34.0]]), s0(p0: [35.0, 36.0], p1: [[37.0], [38.0], [39.0]]), s0(p0: [40.0, 41.0], p1: [[42.0], [43.0], [44.0]])]), s1(p0: s0(p0: [45.0, 46.0], p1: [[47.0], [48.0], [49.0]]), p1: [s0(p0: [50.0, 51.0], p1: [[52.0], [53.0], [54.0]]), s0(p0: [55.0, 56.0], p1: [[57.0], [58.0], [59.0]]), s0(p0: [60.0, 61.0], p1: [[62.0], [63.0], [64.0]])])])]], p1: [s0(p0: [65.0, 66.0], p1: [[67.0], [68.0], [69.0]]), s0(p0: [70.0, 71.0], p1: [[72.0], [73.0], [74.0]]), s0(p0: [75.0, 76.0], p1: [[77.0], [78.0], [79.0]])]), s4(p0: [[s3(p0: s0(p0: [80.0, 81.0], p1: [[82.0], [83.0], [84.0]]), p1: [s1(p0: s0(p0: [85.0, 86.0], p1: [[87.0], [88.0], [89.0]]), p1: [s0(p0: [90.0, 91.0], p1: [[92.0], [93.0], [94.0]]), s0(p0: [95.0, 96.0], p1: [[97.0], [98.0], [99.0]]), s0(p0: [100.0, 101.0], p1: [[102.0], [103.0], [104.0]])]), s1(p0: s0(p0: [105.0, 106.0], p1: [[107.0], [108.0], [109.0]]), p1: [s0(p0: [110.0, 111.0], p1: [[112.0], [113.0], [114.0]]), s0(p0: [115.0, 116.0], p1: [[117.0], [118.0], [119.0]]), s0(p0: [120.0, 121.0], p1: [[122.0], [123.0], [124.0]])])])]], p1: [s0(p0: [125.0, 126.0], p1: [[127.0], [128.0], [129.0]]), s0(p0: [130.0, 131.0], p1: [[132.0], [133.0], [134.0]]), s0(p0: [135.0, 136.0], p1: [[137.0], [138.0], [139.0]])]), s4(p0: [[s3(p0: s0(p0: [140.0, 141.0], p1: [[142.0], [143.0], [144.0]]), p1: [s1(p0: s0(p0: [145.0, 146.0], p1: [[147.0], [148.0], [149.0]]), p1: [s0(p0: [150.0, 151.0], p1: [[152.0], [153.0], [154.0]]), s0(p0: [155.0, 156.0], p1: [[157.0], [158.0], [159.0]]), s0(p0: [160.0, 161.0], p1: [[162.0], [163.0], [164.0]])]), s1(p0: s0(p0: [165.0, 166.0], p1: [[167.0], [168.0], [169.0]]), p1: [s0(p0: [170.0, 171.0], p1: [[172.0], [173.0], [174.0]]), s0(p0: [175.0, 176.0], p1: [[177.0], [178.0], [179.0]]), s0(p0: [180.0, 181.0], p1: [[182.0], [183.0], [184.0]])])])]], p1: [s0(p0: [185.0, 186.0], p1: [[187.0], [188.0], [189.0]]), s0(p0: [190.0, 191.0], p1: [[192.0], [193.0], [194.0]]), s0(p0: [195.0, 196.0], p1: [[197.0], [198.0], [199.0]])])])]]
    let v1: s7 = s7(p0: s2(p0: [s0(p0: [200.0, 201.0], p1: [[202.0], [203.0], [204.0]]), s0(p0: [205.0, 206.0], p1: [[207.0], [208.0], [209.0]]), s0(p0: [210.0, 211.0], p1: [[212.0], [213.0], [214.0]])]), p1: s5(p0: s1(p0: s0(p0: [215.0, 216.0], p1: [[217.0], [218.0], [219.0]]), p1: [s0(p0: [220.0, 221.0], p1: [[222.0], [223.0], [224.0]]), s0(p0: [225.0, 226.0], p1: [[227.0], [228.0], [229.0]]), s0(p0: [230.0, 231.0], p1: [[232.0], [233.0], [234.0]])]), p1: [s4(p0: [[s3(p0: s0(p0: [235.0, 236.0], p1: [[237.0], [238.0], [239.0]]), p1: [s1(p0: s0(p0: [240.0, 241.0], p1: [[242.0], [243.0], [244.0]]), p1: [s0(p0: [245.0, 246.0], p1: [[247.0], [248.0], [249.0]]), s0(p0: [250.0, 251.0], p1: [[252.0], [253.0], [254.0]]), s0(p0: [255.0, 256.0], p1: [[257.0], [258.0], [259.0]])]), s1(p0: s0(p0: [260.0, 261.0], p1: [[262.0], [263.0], [264.0]]), p1: [s0(p0: [265.0, 266.0], p1: [[267.0], [268.0], [269.0]]), s0(p0: [270.0, 271.0], p1: [[272.0], [273.0], [274.0]]), s0(p0: [275.0, 276.0], p1: [[277.0], [278.0], [279.0]])])])]], p1: [s0(p0: [280.0, 281.0], p1: [[282.0], [283.0], [284.0]]), s0(p0: [285.0, 286.0], p1: [[287.0], [288.0], [289.0]]), s0(p0: [290.0, 291.0], p1: [[292.0], [293.0], [294.0]])]), s4(p0: [[s3(p0: s0(p0: [295.0, 296.0], p1: [[297.0], [298.0], [299.0]]), p1: [s1(p0: s0(p0: [300.0, 301.0], p1: [[302.0], [303.0], [304.0]]), p1: [s0(p0: [305.0, 306.0], p1: [[307.0], [308.0], [309.0]]), s0(p0: [310.0, 311.0], p1: [[312.0], [313.0], [314.0]]), s0(p0: [315.0, 316.0], p1: [[317.0], [318.0], [319.0]])]), s1(p0: s0(p0: [320.0, 321.0], p1: [[322.0], [323.0], [324.0]]), p1: [s0(p0: [325.0, 326.0], p1: [[327.0], [328.0], [329.0]]), s0(p0: [330.0, 331.0], p1: [[332.0], [333.0], [334.0]]), s0(p0: [335.0, 336.0], p1: [[337.0], [338.0], [339.0]])])])]], p1: [s0(p0: [340.0, 341.0], p1: [[342.0], [343.0], [344.0]]), s0(p0: [345.0, 346.0], p1: [[347.0], [348.0], [349.0]]), s0(p0: [350.0, 351.0], p1: [[352.0], [353.0], [354.0]])]), s4(p0: [[s3(p0: s0(p0: [355.0, 356.0], p1: [[357.0], [358.0], [359.0]]), p1: [s1(p0: s0(p0: [360.0, 361.0], p1: [[362.0], [363.0], [364.0]]), p1: [s0(p0: [365.0, 366.0], p1: [[367.0], [368.0], [369.0]]), s0(p0: [370.0, 371.0], p1: [[372.0], [373.0], [374.0]]), s0(p0: [375.0, 376.0], p1: [[377.0], [378.0], [379.0]])]), s1(p0: s0(p0: [380.0, 381.0], p1: [[382.0], [383.0], [384.0]]), p1: [s0(p0: [385.0, 386.0], p1: [[387.0], [388.0], [389.0]]), s0(p0: [390.0, 391.0], p1: [[392.0], [393.0], [394.0]]), s0(p0: [395.0, 396.0], p1: [[397.0], [398.0], [399.0]])])])]], p1: [s0(p0: [400.0, 401.0], p1: [[402.0], [403.0], [404.0]]), s0(p0: [405.0, 406.0], p1: [[407.0], [408.0], [409.0]]), s0(p0: [410.0, 411.0], p1: [[412.0], [413.0], [414.0]])])]))
    let v2: Double = 415.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 415.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
