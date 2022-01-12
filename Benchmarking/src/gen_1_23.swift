  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s3 {
    var p0: [s1]
    var p1: [[s0]]
  }
  struct s4 {
    var p0: [s0]
    var p1: [s1]
    var p2: s3
  }
  struct s11 {
    var p0: s2
    var p1: [s1]
  }
  struct s12 {
    var p0: [s4]
    var p1: s11
    var p2: [s3]
  }
  func f48(_ v0: Double) -> Double {
    var v7: Double = v0
    var v6: Double = v0
    var v2: Double = v0
    var v1: Double = v6
    var v3: Double = v6
    let v14: Double = v6 * v1
    let v8: [Double] = [v3, v14, v7, v2, v2]
    var v32: [Double] = v8
    let v16: Double = v32[2]
    return v16
  }
  func f13(_ v0: Double) -> Double {
    var v4: Double = v0
    let v23: Double = f48(v4)
    var v31: Double = v23
    var v25: Double = v31
    return v25
  }
  @inline(never)
  func f0(_ v0: [s12], _ v1: Double) -> Double {
    let v7: Double = f48(v1)
    let v10: Double = f48(v7)
    let v31: Double = f48(v10)
    let v25: Double = f48(v31)
    let v61: Double = f13(v25)
    return v61
  }
  func benchmark() {
    let v0: [s12] = [s12(p0: [s4(p0: [s0(p0: 0.0, p1: [[1.0], [2.0], [3.0]]), s0(p0: 4.0, p1: [[5.0], [6.0], [7.0]]), s0(p0: 8.0, p1: [[9.0], [10.0], [11.0]])], p1: [s1(p0: s0(p0: 12.0, p1: [[13.0], [14.0], [15.0]]), p1: s0(p0: 16.0, p1: [[17.0], [18.0], [19.0]])), s1(p0: s0(p0: 20.0, p1: [[21.0], [22.0], [23.0]]), p1: s0(p0: 24.0, p1: [[25.0], [26.0], [27.0]])), s1(p0: s0(p0: 28.0, p1: [[29.0], [30.0], [31.0]]), p1: s0(p0: 32.0, p1: [[33.0], [34.0], [35.0]]))], p2: s3(p0: [s1(p0: s0(p0: 36.0, p1: [[37.0], [38.0], [39.0]]), p1: s0(p0: 40.0, p1: [[41.0], [42.0], [43.0]])), s1(p0: s0(p0: 44.0, p1: [[45.0], [46.0], [47.0]]), p1: s0(p0: 48.0, p1: [[49.0], [50.0], [51.0]]))], p1: [[s0(p0: 52.0, p1: [[53.0], [54.0], [55.0]])]])), s4(p0: [s0(p0: 56.0, p1: [[57.0], [58.0], [59.0]]), s0(p0: 60.0, p1: [[61.0], [62.0], [63.0]]), s0(p0: 64.0, p1: [[65.0], [66.0], [67.0]])], p1: [s1(p0: s0(p0: 68.0, p1: [[69.0], [70.0], [71.0]]), p1: s0(p0: 72.0, p1: [[73.0], [74.0], [75.0]])), s1(p0: s0(p0: 76.0, p1: [[77.0], [78.0], [79.0]]), p1: s0(p0: 80.0, p1: [[81.0], [82.0], [83.0]])), s1(p0: s0(p0: 84.0, p1: [[85.0], [86.0], [87.0]]), p1: s0(p0: 88.0, p1: [[89.0], [90.0], [91.0]]))], p2: s3(p0: [s1(p0: s0(p0: 92.0, p1: [[93.0], [94.0], [95.0]]), p1: s0(p0: 96.0, p1: [[97.0], [98.0], [99.0]])), s1(p0: s0(p0: 100.0, p1: [[101.0], [102.0], [103.0]]), p1: s0(p0: 104.0, p1: [[105.0], [106.0], [107.0]]))], p1: [[s0(p0: 108.0, p1: [[109.0], [110.0], [111.0]])]])), s4(p0: [s0(p0: 112.0, p1: [[113.0], [114.0], [115.0]]), s0(p0: 116.0, p1: [[117.0], [118.0], [119.0]]), s0(p0: 120.0, p1: [[121.0], [122.0], [123.0]])], p1: [s1(p0: s0(p0: 124.0, p1: [[125.0], [126.0], [127.0]]), p1: s0(p0: 128.0, p1: [[129.0], [130.0], [131.0]])), s1(p0: s0(p0: 132.0, p1: [[133.0], [134.0], [135.0]]), p1: s0(p0: 136.0, p1: [[137.0], [138.0], [139.0]])), s1(p0: s0(p0: 140.0, p1: [[141.0], [142.0], [143.0]]), p1: s0(p0: 144.0, p1: [[145.0], [146.0], [147.0]]))], p2: s3(p0: [s1(p0: s0(p0: 148.0, p1: [[149.0], [150.0], [151.0]]), p1: s0(p0: 152.0, p1: [[153.0], [154.0], [155.0]])), s1(p0: s0(p0: 156.0, p1: [[157.0], [158.0], [159.0]]), p1: s0(p0: 160.0, p1: [[161.0], [162.0], [163.0]]))], p1: [[s0(p0: 164.0, p1: [[165.0], [166.0], [167.0]])]]))], p1: s11(p0: s2(p0: s0(p0: 168.0, p1: [[169.0], [170.0], [171.0]]), p1: s1(p0: s0(p0: 172.0, p1: [[173.0], [174.0], [175.0]]), p1: s0(p0: 176.0, p1: [[177.0], [178.0], [179.0]]))), p1: [s1(p0: s0(p0: 180.0, p1: [[181.0], [182.0], [183.0]]), p1: s0(p0: 184.0, p1: [[185.0], [186.0], [187.0]])), s1(p0: s0(p0: 188.0, p1: [[189.0], [190.0], [191.0]]), p1: s0(p0: 192.0, p1: [[193.0], [194.0], [195.0]]))]), p2: [s3(p0: [s1(p0: s0(p0: 196.0, p1: [[197.0], [198.0], [199.0]]), p1: s0(p0: 200.0, p1: [[201.0], [202.0], [203.0]])), s1(p0: s0(p0: 204.0, p1: [[205.0], [206.0], [207.0]]), p1: s0(p0: 208.0, p1: [[209.0], [210.0], [211.0]]))], p1: [[s0(p0: 212.0, p1: [[213.0], [214.0], [215.0]])]]), s3(p0: [s1(p0: s0(p0: 216.0, p1: [[217.0], [218.0], [219.0]]), p1: s0(p0: 220.0, p1: [[221.0], [222.0], [223.0]])), s1(p0: s0(p0: 224.0, p1: [[225.0], [226.0], [227.0]]), p1: s0(p0: 228.0, p1: [[229.0], [230.0], [231.0]]))], p1: [[s0(p0: 232.0, p1: [[233.0], [234.0], [235.0]])]]), s3(p0: [s1(p0: s0(p0: 236.0, p1: [[237.0], [238.0], [239.0]]), p1: s0(p0: 240.0, p1: [[241.0], [242.0], [243.0]])), s1(p0: s0(p0: 244.0, p1: [[245.0], [246.0], [247.0]]), p1: s0(p0: 248.0, p1: [[249.0], [250.0], [251.0]]))], p1: [[s0(p0: 252.0, p1: [[253.0], [254.0], [255.0]])]])]), s12(p0: [s4(p0: [s0(p0: 256.0, p1: [[257.0], [258.0], [259.0]]), s0(p0: 260.0, p1: [[261.0], [262.0], [263.0]]), s0(p0: 264.0, p1: [[265.0], [266.0], [267.0]])], p1: [s1(p0: s0(p0: 268.0, p1: [[269.0], [270.0], [271.0]]), p1: s0(p0: 272.0, p1: [[273.0], [274.0], [275.0]])), s1(p0: s0(p0: 276.0, p1: [[277.0], [278.0], [279.0]]), p1: s0(p0: 280.0, p1: [[281.0], [282.0], [283.0]])), s1(p0: s0(p0: 284.0, p1: [[285.0], [286.0], [287.0]]), p1: s0(p0: 288.0, p1: [[289.0], [290.0], [291.0]]))], p2: s3(p0: [s1(p0: s0(p0: 292.0, p1: [[293.0], [294.0], [295.0]]), p1: s0(p0: 296.0, p1: [[297.0], [298.0], [299.0]])), s1(p0: s0(p0: 300.0, p1: [[301.0], [302.0], [303.0]]), p1: s0(p0: 304.0, p1: [[305.0], [306.0], [307.0]]))], p1: [[s0(p0: 308.0, p1: [[309.0], [310.0], [311.0]])]])), s4(p0: [s0(p0: 312.0, p1: [[313.0], [314.0], [315.0]]), s0(p0: 316.0, p1: [[317.0], [318.0], [319.0]]), s0(p0: 320.0, p1: [[321.0], [322.0], [323.0]])], p1: [s1(p0: s0(p0: 324.0, p1: [[325.0], [326.0], [327.0]]), p1: s0(p0: 328.0, p1: [[329.0], [330.0], [331.0]])), s1(p0: s0(p0: 332.0, p1: [[333.0], [334.0], [335.0]]), p1: s0(p0: 336.0, p1: [[337.0], [338.0], [339.0]])), s1(p0: s0(p0: 340.0, p1: [[341.0], [342.0], [343.0]]), p1: s0(p0: 344.0, p1: [[345.0], [346.0], [347.0]]))], p2: s3(p0: [s1(p0: s0(p0: 348.0, p1: [[349.0], [350.0], [351.0]]), p1: s0(p0: 352.0, p1: [[353.0], [354.0], [355.0]])), s1(p0: s0(p0: 356.0, p1: [[357.0], [358.0], [359.0]]), p1: s0(p0: 360.0, p1: [[361.0], [362.0], [363.0]]))], p1: [[s0(p0: 364.0, p1: [[365.0], [366.0], [367.0]])]])), s4(p0: [s0(p0: 368.0, p1: [[369.0], [370.0], [371.0]]), s0(p0: 372.0, p1: [[373.0], [374.0], [375.0]]), s0(p0: 376.0, p1: [[377.0], [378.0], [379.0]])], p1: [s1(p0: s0(p0: 380.0, p1: [[381.0], [382.0], [383.0]]), p1: s0(p0: 384.0, p1: [[385.0], [386.0], [387.0]])), s1(p0: s0(p0: 388.0, p1: [[389.0], [390.0], [391.0]]), p1: s0(p0: 392.0, p1: [[393.0], [394.0], [395.0]])), s1(p0: s0(p0: 396.0, p1: [[397.0], [398.0], [399.0]]), p1: s0(p0: 400.0, p1: [[401.0], [402.0], [403.0]]))], p2: s3(p0: [s1(p0: s0(p0: 404.0, p1: [[405.0], [406.0], [407.0]]), p1: s0(p0: 408.0, p1: [[409.0], [410.0], [411.0]])), s1(p0: s0(p0: 412.0, p1: [[413.0], [414.0], [415.0]]), p1: s0(p0: 416.0, p1: [[417.0], [418.0], [419.0]]))], p1: [[s0(p0: 420.0, p1: [[421.0], [422.0], [423.0]])]]))], p1: s11(p0: s2(p0: s0(p0: 424.0, p1: [[425.0], [426.0], [427.0]]), p1: s1(p0: s0(p0: 428.0, p1: [[429.0], [430.0], [431.0]]), p1: s0(p0: 432.0, p1: [[433.0], [434.0], [435.0]]))), p1: [s1(p0: s0(p0: 436.0, p1: [[437.0], [438.0], [439.0]]), p1: s0(p0: 440.0, p1: [[441.0], [442.0], [443.0]])), s1(p0: s0(p0: 444.0, p1: [[445.0], [446.0], [447.0]]), p1: s0(p0: 448.0, p1: [[449.0], [450.0], [451.0]]))]), p2: [s3(p0: [s1(p0: s0(p0: 452.0, p1: [[453.0], [454.0], [455.0]]), p1: s0(p0: 456.0, p1: [[457.0], [458.0], [459.0]])), s1(p0: s0(p0: 460.0, p1: [[461.0], [462.0], [463.0]]), p1: s0(p0: 464.0, p1: [[465.0], [466.0], [467.0]]))], p1: [[s0(p0: 468.0, p1: [[469.0], [470.0], [471.0]])]]), s3(p0: [s1(p0: s0(p0: 472.0, p1: [[473.0], [474.0], [475.0]]), p1: s0(p0: 476.0, p1: [[477.0], [478.0], [479.0]])), s1(p0: s0(p0: 480.0, p1: [[481.0], [482.0], [483.0]]), p1: s0(p0: 484.0, p1: [[485.0], [486.0], [487.0]]))], p1: [[s0(p0: 488.0, p1: [[489.0], [490.0], [491.0]])]]), s3(p0: [s1(p0: s0(p0: 492.0, p1: [[493.0], [494.0], [495.0]]), p1: s0(p0: 496.0, p1: [[497.0], [498.0], [499.0]])), s1(p0: s0(p0: 500.0, p1: [[501.0], [502.0], [503.0]]), p1: s0(p0: 504.0, p1: [[505.0], [506.0], [507.0]]))], p1: [[s0(p0: 508.0, p1: [[509.0], [510.0], [511.0]])]])])]
    let v1: Double = 512.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 512.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
