  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  struct s5 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s6 {
    var p0: s0
    var p1: Double
    var p2: s5
    var p3: s1
  }
  struct s10 {
    var p0: [s1]
    var p1: [s2]
  }
  struct s11 {
    var p0: [s6]
    var p1: [s10]
  }
  func f24(_ v0: Double) -> Double {
    let v3: [Double] = [v0, v0, v0]
    let v4: Double = v3[2]
    let v7: Double = v3[2]
    var v6: [Double] = v3
    var v8: [Double] = v6
    let v2: Double = v6[2]
    var v12: [Double] = v6
    var v13: [Double] = v12
    v8[2] = v7
    let v5: Double = v12[1]
    var v11: [Double] = v13
    var v14: [Double] = v6
    var v18: [Double] = v8
    var v24: [Double] = v11
    let v73: Double = v18[2]
    let v23: Double = v14[2]
    let v49: Double = v2 / v73
    var v43: [Double] = v6
    v14[2] = v5
    let v103: Double = v43[1]
    let v83: Double = v24[2]
    v11[1] = v4
    let v128: [Double] = [v49, v83, v5, v23, v49, v103]
    let v116: [[Double]] = [v128, v128, v128, v128, v128, v128, v128]
    let v97: [Double] = v116[3]
    var v154: [Double] = v97
    var v112: [Double] = v154
    let v106: Double = v112[3]
    return v106
  }
  @inline(never)
  func f0(_ v0: [[s11]], _ v1: Double) -> Double {
    let v7: Double = f24(v1)
    let v49: Double = f24(v1)
    let v44: Double = f24(v49)
    let v46: Double = v44 * v7
    return v46
  }
  func benchmark() {
    let v0: [[s11]] = [[s11(p0: [s6(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: [[4.0], [5.0]]), p1: 6.0, p2: s5(p0: [s0(p0: [[7.0], [8.0]], p1: [[9.0], [10.0]], p2: [[11.0], [12.0]]), s0(p0: [[13.0], [14.0]], p1: [[15.0], [16.0]], p2: [[17.0], [18.0]]), s0(p0: [[19.0], [20.0]], p1: [[21.0], [22.0]], p2: [[23.0], [24.0]])], p1: [s1(p0: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0]], p2: [[29.0], [30.0]]), p1: s0(p0: [[31.0], [32.0]], p1: [[33.0], [34.0]], p2: [[35.0], [36.0]])), s1(p0: s0(p0: [[37.0], [38.0]], p1: [[39.0], [40.0]], p2: [[41.0], [42.0]]), p1: s0(p0: [[43.0], [44.0]], p1: [[45.0], [46.0]], p2: [[47.0], [48.0]])), s1(p0: s0(p0: [[49.0], [50.0]], p1: [[51.0], [52.0]], p2: [[53.0], [54.0]]), p1: s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0]], p2: [[59.0], [60.0]]))]), p3: s1(p0: s0(p0: [[61.0], [62.0]], p1: [[63.0], [64.0]], p2: [[65.0], [66.0]]), p1: s0(p0: [[67.0], [68.0]], p1: [[69.0], [70.0]], p2: [[71.0], [72.0]]))), s6(p0: s0(p0: [[73.0], [74.0]], p1: [[75.0], [76.0]], p2: [[77.0], [78.0]]), p1: 79.0, p2: s5(p0: [s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]], p2: [[84.0], [85.0]]), s0(p0: [[86.0], [87.0]], p1: [[88.0], [89.0]], p2: [[90.0], [91.0]]), s0(p0: [[92.0], [93.0]], p1: [[94.0], [95.0]], p2: [[96.0], [97.0]])], p1: [s1(p0: s0(p0: [[98.0], [99.0]], p1: [[100.0], [101.0]], p2: [[102.0], [103.0]]), p1: s0(p0: [[104.0], [105.0]], p1: [[106.0], [107.0]], p2: [[108.0], [109.0]])), s1(p0: s0(p0: [[110.0], [111.0]], p1: [[112.0], [113.0]], p2: [[114.0], [115.0]]), p1: s0(p0: [[116.0], [117.0]], p1: [[118.0], [119.0]], p2: [[120.0], [121.0]])), s1(p0: s0(p0: [[122.0], [123.0]], p1: [[124.0], [125.0]], p2: [[126.0], [127.0]]), p1: s0(p0: [[128.0], [129.0]], p1: [[130.0], [131.0]], p2: [[132.0], [133.0]]))]), p3: s1(p0: s0(p0: [[134.0], [135.0]], p1: [[136.0], [137.0]], p2: [[138.0], [139.0]]), p1: s0(p0: [[140.0], [141.0]], p1: [[142.0], [143.0]], p2: [[144.0], [145.0]])))], p1: [s10(p0: [s1(p0: s0(p0: [[146.0], [147.0]], p1: [[148.0], [149.0]], p2: [[150.0], [151.0]]), p1: s0(p0: [[152.0], [153.0]], p1: [[154.0], [155.0]], p2: [[156.0], [157.0]]))], p1: [s2(p0: [s1(p0: s0(p0: [[158.0], [159.0]], p1: [[160.0], [161.0]], p2: [[162.0], [163.0]]), p1: s0(p0: [[164.0], [165.0]], p1: [[166.0], [167.0]], p2: [[168.0], [169.0]])), s1(p0: s0(p0: [[170.0], [171.0]], p1: [[172.0], [173.0]], p2: [[174.0], [175.0]]), p1: s0(p0: [[176.0], [177.0]], p1: [[178.0], [179.0]], p2: [[180.0], [181.0]])), s1(p0: s0(p0: [[182.0], [183.0]], p1: [[184.0], [185.0]], p2: [[186.0], [187.0]]), p1: s0(p0: [[188.0], [189.0]], p1: [[190.0], [191.0]], p2: [[192.0], [193.0]]))], p1: s1(p0: s0(p0: [[194.0], [195.0]], p1: [[196.0], [197.0]], p2: [[198.0], [199.0]]), p1: s0(p0: [[200.0], [201.0]], p1: [[202.0], [203.0]], p2: [[204.0], [205.0]])))])])], [s11(p0: [s6(p0: s0(p0: [[206.0], [207.0]], p1: [[208.0], [209.0]], p2: [[210.0], [211.0]]), p1: 212.0, p2: s5(p0: [s0(p0: [[213.0], [214.0]], p1: [[215.0], [216.0]], p2: [[217.0], [218.0]]), s0(p0: [[219.0], [220.0]], p1: [[221.0], [222.0]], p2: [[223.0], [224.0]]), s0(p0: [[225.0], [226.0]], p1: [[227.0], [228.0]], p2: [[229.0], [230.0]])], p1: [s1(p0: s0(p0: [[231.0], [232.0]], p1: [[233.0], [234.0]], p2: [[235.0], [236.0]]), p1: s0(p0: [[237.0], [238.0]], p1: [[239.0], [240.0]], p2: [[241.0], [242.0]])), s1(p0: s0(p0: [[243.0], [244.0]], p1: [[245.0], [246.0]], p2: [[247.0], [248.0]]), p1: s0(p0: [[249.0], [250.0]], p1: [[251.0], [252.0]], p2: [[253.0], [254.0]])), s1(p0: s0(p0: [[255.0], [256.0]], p1: [[257.0], [258.0]], p2: [[259.0], [260.0]]), p1: s0(p0: [[261.0], [262.0]], p1: [[263.0], [264.0]], p2: [[265.0], [266.0]]))]), p3: s1(p0: s0(p0: [[267.0], [268.0]], p1: [[269.0], [270.0]], p2: [[271.0], [272.0]]), p1: s0(p0: [[273.0], [274.0]], p1: [[275.0], [276.0]], p2: [[277.0], [278.0]]))), s6(p0: s0(p0: [[279.0], [280.0]], p1: [[281.0], [282.0]], p2: [[283.0], [284.0]]), p1: 285.0, p2: s5(p0: [s0(p0: [[286.0], [287.0]], p1: [[288.0], [289.0]], p2: [[290.0], [291.0]]), s0(p0: [[292.0], [293.0]], p1: [[294.0], [295.0]], p2: [[296.0], [297.0]]), s0(p0: [[298.0], [299.0]], p1: [[300.0], [301.0]], p2: [[302.0], [303.0]])], p1: [s1(p0: s0(p0: [[304.0], [305.0]], p1: [[306.0], [307.0]], p2: [[308.0], [309.0]]), p1: s0(p0: [[310.0], [311.0]], p1: [[312.0], [313.0]], p2: [[314.0], [315.0]])), s1(p0: s0(p0: [[316.0], [317.0]], p1: [[318.0], [319.0]], p2: [[320.0], [321.0]]), p1: s0(p0: [[322.0], [323.0]], p1: [[324.0], [325.0]], p2: [[326.0], [327.0]])), s1(p0: s0(p0: [[328.0], [329.0]], p1: [[330.0], [331.0]], p2: [[332.0], [333.0]]), p1: s0(p0: [[334.0], [335.0]], p1: [[336.0], [337.0]], p2: [[338.0], [339.0]]))]), p3: s1(p0: s0(p0: [[340.0], [341.0]], p1: [[342.0], [343.0]], p2: [[344.0], [345.0]]), p1: s0(p0: [[346.0], [347.0]], p1: [[348.0], [349.0]], p2: [[350.0], [351.0]])))], p1: [s10(p0: [s1(p0: s0(p0: [[352.0], [353.0]], p1: [[354.0], [355.0]], p2: [[356.0], [357.0]]), p1: s0(p0: [[358.0], [359.0]], p1: [[360.0], [361.0]], p2: [[362.0], [363.0]]))], p1: [s2(p0: [s1(p0: s0(p0: [[364.0], [365.0]], p1: [[366.0], [367.0]], p2: [[368.0], [369.0]]), p1: s0(p0: [[370.0], [371.0]], p1: [[372.0], [373.0]], p2: [[374.0], [375.0]])), s1(p0: s0(p0: [[376.0], [377.0]], p1: [[378.0], [379.0]], p2: [[380.0], [381.0]]), p1: s0(p0: [[382.0], [383.0]], p1: [[384.0], [385.0]], p2: [[386.0], [387.0]])), s1(p0: s0(p0: [[388.0], [389.0]], p1: [[390.0], [391.0]], p2: [[392.0], [393.0]]), p1: s0(p0: [[394.0], [395.0]], p1: [[396.0], [397.0]], p2: [[398.0], [399.0]]))], p1: s1(p0: s0(p0: [[400.0], [401.0]], p1: [[402.0], [403.0]], p2: [[404.0], [405.0]]), p1: s0(p0: [[406.0], [407.0]], p1: [[408.0], [409.0]], p2: [[410.0], [411.0]])))])])]]
    let v1: Double = 412.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 412.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
