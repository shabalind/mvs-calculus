  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
    var p2: [s1]
    var p3: s0
    var p4: s1
  }
  struct s3 {
    var p0: s1
    var p1: s2
  }
  struct s4 {
    var p0: [[s2]]
    var p1: s0
  }
  struct s6 {
    var p0: s3
    var p1: s2
  }
  struct s7 {
    var p0: s0
    var p1: [[s6]]
  }
  func f29(_ v0: Double) -> Double {
    var v3: Double = v0
    var v7: Double = v3
    var v6: Double = v3
    var v4: Double = v7
    var v5: Double = v4
    v4 = v5
    var v2: Double = v5
    v2 = v5
    var v1: Double = v3
    v2 = v0
    var v10: Double = v6
    v5 = v10
    var v11: Double = v4
    var v14: Double = v6
    var v19: Double = v0
    v4 = v10
    let v29: Double = v14 * v10
    var v32: Double = v2
    var v16: Double = v7
    var v30: Double = v11
    var v35: Double = v30
    let v25: [Double] = [v29]
    var v36: [Double] = v25
    v36[0] = v3
    var v34: [Double] = v36
    v36[0] = v32
    let v141: Double = v25[0]
    let v40: Double = v34[0]
    let v48: [Double] = [v16, v141, v32, v40, v16]
    v34[0] = v19
    var v68: [Double] = v48
    var v146: Double = v35
    var v114: [Double] = v68
    let v41: Double = v114[3]
    v68[2] = v40
    v34[0] = v1
    v114[1] = v146
    v68[0] = v40
    return v41
  }
  @inline(never)
  func f0(_ v0: [[s4]], _ v1: s2, _ v2: [s2], _ v3: [s7], _ v4: Double) -> Double {
    let v8: Double = f29(v4)
    let v13: Double = f29(v8)
    let v20: Double = f29(v4)
    let v87: Double = v20 + v13
    let v68: [Double] = [v87, v87, v8, v87, v8]
    let v88: Double = v68[1]
    var v146: Double = v87
    let v77: Double = v146 + v88
    return v77
  }
  func benchmark() {
    let v0: [[s4]] = [[s4(p0: [[s2(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: s1(p0: [[s0(p0: [[9.0]], p1: [[10.0], [11.0]])]], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0]])), p2: [s1(p0: [[s0(p0: [[15.0]], p1: [[16.0], [17.0]])]], p1: s0(p0: [[18.0]], p1: [[19.0], [20.0]])), s1(p0: [[s0(p0: [[21.0]], p1: [[22.0], [23.0]])]], p1: s0(p0: [[24.0]], p1: [[25.0], [26.0]])), s1(p0: [[s0(p0: [[27.0]], p1: [[28.0], [29.0]])]], p1: s0(p0: [[30.0]], p1: [[31.0], [32.0]]))], p3: s0(p0: [[33.0]], p1: [[34.0], [35.0]]), p4: s1(p0: [[s0(p0: [[36.0]], p1: [[37.0], [38.0]])]], p1: s0(p0: [[39.0]], p1: [[40.0], [41.0]])))]], p1: s0(p0: [[42.0]], p1: [[43.0], [44.0]]))], [s4(p0: [[s2(p0: [s0(p0: [[45.0]], p1: [[46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0], [50.0]]), s0(p0: [[51.0]], p1: [[52.0], [53.0]])], p1: s1(p0: [[s0(p0: [[54.0]], p1: [[55.0], [56.0]])]], p1: s0(p0: [[57.0]], p1: [[58.0], [59.0]])), p2: [s1(p0: [[s0(p0: [[60.0]], p1: [[61.0], [62.0]])]], p1: s0(p0: [[63.0]], p1: [[64.0], [65.0]])), s1(p0: [[s0(p0: [[66.0]], p1: [[67.0], [68.0]])]], p1: s0(p0: [[69.0]], p1: [[70.0], [71.0]])), s1(p0: [[s0(p0: [[72.0]], p1: [[73.0], [74.0]])]], p1: s0(p0: [[75.0]], p1: [[76.0], [77.0]]))], p3: s0(p0: [[78.0]], p1: [[79.0], [80.0]]), p4: s1(p0: [[s0(p0: [[81.0]], p1: [[82.0], [83.0]])]], p1: s0(p0: [[84.0]], p1: [[85.0], [86.0]])))]], p1: s0(p0: [[87.0]], p1: [[88.0], [89.0]]))]]
    let v1: s2 = s2(p0: [s0(p0: [[90.0]], p1: [[91.0], [92.0]]), s0(p0: [[93.0]], p1: [[94.0], [95.0]]), s0(p0: [[96.0]], p1: [[97.0], [98.0]])], p1: s1(p0: [[s0(p0: [[99.0]], p1: [[100.0], [101.0]])]], p1: s0(p0: [[102.0]], p1: [[103.0], [104.0]])), p2: [s1(p0: [[s0(p0: [[105.0]], p1: [[106.0], [107.0]])]], p1: s0(p0: [[108.0]], p1: [[109.0], [110.0]])), s1(p0: [[s0(p0: [[111.0]], p1: [[112.0], [113.0]])]], p1: s0(p0: [[114.0]], p1: [[115.0], [116.0]])), s1(p0: [[s0(p0: [[117.0]], p1: [[118.0], [119.0]])]], p1: s0(p0: [[120.0]], p1: [[121.0], [122.0]]))], p3: s0(p0: [[123.0]], p1: [[124.0], [125.0]]), p4: s1(p0: [[s0(p0: [[126.0]], p1: [[127.0], [128.0]])]], p1: s0(p0: [[129.0]], p1: [[130.0], [131.0]])))
    let v2: [s2] = [s2(p0: [s0(p0: [[132.0]], p1: [[133.0], [134.0]]), s0(p0: [[135.0]], p1: [[136.0], [137.0]]), s0(p0: [[138.0]], p1: [[139.0], [140.0]])], p1: s1(p0: [[s0(p0: [[141.0]], p1: [[142.0], [143.0]])]], p1: s0(p0: [[144.0]], p1: [[145.0], [146.0]])), p2: [s1(p0: [[s0(p0: [[147.0]], p1: [[148.0], [149.0]])]], p1: s0(p0: [[150.0]], p1: [[151.0], [152.0]])), s1(p0: [[s0(p0: [[153.0]], p1: [[154.0], [155.0]])]], p1: s0(p0: [[156.0]], p1: [[157.0], [158.0]])), s1(p0: [[s0(p0: [[159.0]], p1: [[160.0], [161.0]])]], p1: s0(p0: [[162.0]], p1: [[163.0], [164.0]]))], p3: s0(p0: [[165.0]], p1: [[166.0], [167.0]]), p4: s1(p0: [[s0(p0: [[168.0]], p1: [[169.0], [170.0]])]], p1: s0(p0: [[171.0]], p1: [[172.0], [173.0]]))), s2(p0: [s0(p0: [[174.0]], p1: [[175.0], [176.0]]), s0(p0: [[177.0]], p1: [[178.0], [179.0]]), s0(p0: [[180.0]], p1: [[181.0], [182.0]])], p1: s1(p0: [[s0(p0: [[183.0]], p1: [[184.0], [185.0]])]], p1: s0(p0: [[186.0]], p1: [[187.0], [188.0]])), p2: [s1(p0: [[s0(p0: [[189.0]], p1: [[190.0], [191.0]])]], p1: s0(p0: [[192.0]], p1: [[193.0], [194.0]])), s1(p0: [[s0(p0: [[195.0]], p1: [[196.0], [197.0]])]], p1: s0(p0: [[198.0]], p1: [[199.0], [200.0]])), s1(p0: [[s0(p0: [[201.0]], p1: [[202.0], [203.0]])]], p1: s0(p0: [[204.0]], p1: [[205.0], [206.0]]))], p3: s0(p0: [[207.0]], p1: [[208.0], [209.0]]), p4: s1(p0: [[s0(p0: [[210.0]], p1: [[211.0], [212.0]])]], p1: s0(p0: [[213.0]], p1: [[214.0], [215.0]])))]
    let v3: [s7] = [s7(p0: s0(p0: [[216.0]], p1: [[217.0], [218.0]]), p1: [[s6(p0: s3(p0: s1(p0: [[s0(p0: [[219.0]], p1: [[220.0], [221.0]])]], p1: s0(p0: [[222.0]], p1: [[223.0], [224.0]])), p1: s2(p0: [s0(p0: [[225.0]], p1: [[226.0], [227.0]]), s0(p0: [[228.0]], p1: [[229.0], [230.0]]), s0(p0: [[231.0]], p1: [[232.0], [233.0]])], p1: s1(p0: [[s0(p0: [[234.0]], p1: [[235.0], [236.0]])]], p1: s0(p0: [[237.0]], p1: [[238.0], [239.0]])), p2: [s1(p0: [[s0(p0: [[240.0]], p1: [[241.0], [242.0]])]], p1: s0(p0: [[243.0]], p1: [[244.0], [245.0]])), s1(p0: [[s0(p0: [[246.0]], p1: [[247.0], [248.0]])]], p1: s0(p0: [[249.0]], p1: [[250.0], [251.0]])), s1(p0: [[s0(p0: [[252.0]], p1: [[253.0], [254.0]])]], p1: s0(p0: [[255.0]], p1: [[256.0], [257.0]]))], p3: s0(p0: [[258.0]], p1: [[259.0], [260.0]]), p4: s1(p0: [[s0(p0: [[261.0]], p1: [[262.0], [263.0]])]], p1: s0(p0: [[264.0]], p1: [[265.0], [266.0]])))), p1: s2(p0: [s0(p0: [[267.0]], p1: [[268.0], [269.0]]), s0(p0: [[270.0]], p1: [[271.0], [272.0]]), s0(p0: [[273.0]], p1: [[274.0], [275.0]])], p1: s1(p0: [[s0(p0: [[276.0]], p1: [[277.0], [278.0]])]], p1: s0(p0: [[279.0]], p1: [[280.0], [281.0]])), p2: [s1(p0: [[s0(p0: [[282.0]], p1: [[283.0], [284.0]])]], p1: s0(p0: [[285.0]], p1: [[286.0], [287.0]])), s1(p0: [[s0(p0: [[288.0]], p1: [[289.0], [290.0]])]], p1: s0(p0: [[291.0]], p1: [[292.0], [293.0]])), s1(p0: [[s0(p0: [[294.0]], p1: [[295.0], [296.0]])]], p1: s0(p0: [[297.0]], p1: [[298.0], [299.0]]))], p3: s0(p0: [[300.0]], p1: [[301.0], [302.0]]), p4: s1(p0: [[s0(p0: [[303.0]], p1: [[304.0], [305.0]])]], p1: s0(p0: [[306.0]], p1: [[307.0], [308.0]]))))], [s6(p0: s3(p0: s1(p0: [[s0(p0: [[309.0]], p1: [[310.0], [311.0]])]], p1: s0(p0: [[312.0]], p1: [[313.0], [314.0]])), p1: s2(p0: [s0(p0: [[315.0]], p1: [[316.0], [317.0]]), s0(p0: [[318.0]], p1: [[319.0], [320.0]]), s0(p0: [[321.0]], p1: [[322.0], [323.0]])], p1: s1(p0: [[s0(p0: [[324.0]], p1: [[325.0], [326.0]])]], p1: s0(p0: [[327.0]], p1: [[328.0], [329.0]])), p2: [s1(p0: [[s0(p0: [[330.0]], p1: [[331.0], [332.0]])]], p1: s0(p0: [[333.0]], p1: [[334.0], [335.0]])), s1(p0: [[s0(p0: [[336.0]], p1: [[337.0], [338.0]])]], p1: s0(p0: [[339.0]], p1: [[340.0], [341.0]])), s1(p0: [[s0(p0: [[342.0]], p1: [[343.0], [344.0]])]], p1: s0(p0: [[345.0]], p1: [[346.0], [347.0]]))], p3: s0(p0: [[348.0]], p1: [[349.0], [350.0]]), p4: s1(p0: [[s0(p0: [[351.0]], p1: [[352.0], [353.0]])]], p1: s0(p0: [[354.0]], p1: [[355.0], [356.0]])))), p1: s2(p0: [s0(p0: [[357.0]], p1: [[358.0], [359.0]]), s0(p0: [[360.0]], p1: [[361.0], [362.0]]), s0(p0: [[363.0]], p1: [[364.0], [365.0]])], p1: s1(p0: [[s0(p0: [[366.0]], p1: [[367.0], [368.0]])]], p1: s0(p0: [[369.0]], p1: [[370.0], [371.0]])), p2: [s1(p0: [[s0(p0: [[372.0]], p1: [[373.0], [374.0]])]], p1: s0(p0: [[375.0]], p1: [[376.0], [377.0]])), s1(p0: [[s0(p0: [[378.0]], p1: [[379.0], [380.0]])]], p1: s0(p0: [[381.0]], p1: [[382.0], [383.0]])), s1(p0: [[s0(p0: [[384.0]], p1: [[385.0], [386.0]])]], p1: s0(p0: [[387.0]], p1: [[388.0], [389.0]]))], p3: s0(p0: [[390.0]], p1: [[391.0], [392.0]]), p4: s1(p0: [[s0(p0: [[393.0]], p1: [[394.0], [395.0]])]], p1: s0(p0: [[396.0]], p1: [[397.0], [398.0]]))))], [s6(p0: s3(p0: s1(p0: [[s0(p0: [[399.0]], p1: [[400.0], [401.0]])]], p1: s0(p0: [[402.0]], p1: [[403.0], [404.0]])), p1: s2(p0: [s0(p0: [[405.0]], p1: [[406.0], [407.0]]), s0(p0: [[408.0]], p1: [[409.0], [410.0]]), s0(p0: [[411.0]], p1: [[412.0], [413.0]])], p1: s1(p0: [[s0(p0: [[414.0]], p1: [[415.0], [416.0]])]], p1: s0(p0: [[417.0]], p1: [[418.0], [419.0]])), p2: [s1(p0: [[s0(p0: [[420.0]], p1: [[421.0], [422.0]])]], p1: s0(p0: [[423.0]], p1: [[424.0], [425.0]])), s1(p0: [[s0(p0: [[426.0]], p1: [[427.0], [428.0]])]], p1: s0(p0: [[429.0]], p1: [[430.0], [431.0]])), s1(p0: [[s0(p0: [[432.0]], p1: [[433.0], [434.0]])]], p1: s0(p0: [[435.0]], p1: [[436.0], [437.0]]))], p3: s0(p0: [[438.0]], p1: [[439.0], [440.0]]), p4: s1(p0: [[s0(p0: [[441.0]], p1: [[442.0], [443.0]])]], p1: s0(p0: [[444.0]], p1: [[445.0], [446.0]])))), p1: s2(p0: [s0(p0: [[447.0]], p1: [[448.0], [449.0]]), s0(p0: [[450.0]], p1: [[451.0], [452.0]]), s0(p0: [[453.0]], p1: [[454.0], [455.0]])], p1: s1(p0: [[s0(p0: [[456.0]], p1: [[457.0], [458.0]])]], p1: s0(p0: [[459.0]], p1: [[460.0], [461.0]])), p2: [s1(p0: [[s0(p0: [[462.0]], p1: [[463.0], [464.0]])]], p1: s0(p0: [[465.0]], p1: [[466.0], [467.0]])), s1(p0: [[s0(p0: [[468.0]], p1: [[469.0], [470.0]])]], p1: s0(p0: [[471.0]], p1: [[472.0], [473.0]])), s1(p0: [[s0(p0: [[474.0]], p1: [[475.0], [476.0]])]], p1: s0(p0: [[477.0]], p1: [[478.0], [479.0]]))], p3: s0(p0: [[480.0]], p1: [[481.0], [482.0]]), p4: s1(p0: [[s0(p0: [[483.0]], p1: [[484.0], [485.0]])]], p1: s0(p0: [[486.0]], p1: [[487.0], [488.0]]))))]])]
    let v4: Double = 489.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 489.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
