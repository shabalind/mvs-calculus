  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: [[s1]]
    var p1: [[s1]]
  }
  struct s4 {
    var p0: [s1]
    var p1: [s3]
    var p2: [s2]
  }
  struct s5 {
    var p0: [s0]
    var p1: s0
    var p2: s4
    var p3: s4
    var p4: s2
  }
  @inline(never)
  func f0(_ v0: [[s5]], _ v1: Double) -> Double {
    let v5: [s5] = v0[0]
    var v9: Double = v1
    let v4: s5 = v5[0]
    let v13: [s0] = v4.p0
    var v14: Double = v9
    let v21: s0 = v13[0]
    var v41: Double = v9
    let v10: [[Double]] = v21.p0
    var v47: Double = v14
    let v30: [[Double]] = v21.p1
    var v31: Double = v41
    v31 = v41
    let v32: [Double] = v10[0]
    let v53: Double = v32[0]
    let v50: [Double] = v30[0]
    v9 = v47
    let v54: Double = v50[0]
    let v89: Double = v14 - v54
    let v210: [Double] = [v89, v53, v54, v31]
    let v126: Double = v210[2]
    return v126
  }
  func benchmark() {
    let v0: [[s5]] = [[s5(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]])], p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]), p2: s4(p0: [s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])])], p1: [s3(p0: [[s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p1: [s0(p0: [[21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]])])], [s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0]]), p1: [s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]])])], [s1(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0]]), p1: [s0(p0: [[45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0]]), s0(p0: [[51.0], [52.0]], p1: [[53.0]])])]], p1: [[s1(p0: s0(p0: [[54.0], [55.0]], p1: [[56.0]]), p1: [s0(p0: [[57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0]]), s0(p0: [[63.0], [64.0]], p1: [[65.0]])])], [s1(p0: s0(p0: [[66.0], [67.0]], p1: [[68.0]]), p1: [s0(p0: [[69.0], [70.0]], p1: [[71.0]]), s0(p0: [[72.0], [73.0]], p1: [[74.0]]), s0(p0: [[75.0], [76.0]], p1: [[77.0]])])]]), s3(p0: [[s1(p0: s0(p0: [[78.0], [79.0]], p1: [[80.0]]), p1: [s0(p0: [[81.0], [82.0]], p1: [[83.0]]), s0(p0: [[84.0], [85.0]], p1: [[86.0]]), s0(p0: [[87.0], [88.0]], p1: [[89.0]])])], [s1(p0: s0(p0: [[90.0], [91.0]], p1: [[92.0]]), p1: [s0(p0: [[93.0], [94.0]], p1: [[95.0]]), s0(p0: [[96.0], [97.0]], p1: [[98.0]]), s0(p0: [[99.0], [100.0]], p1: [[101.0]])])], [s1(p0: s0(p0: [[102.0], [103.0]], p1: [[104.0]]), p1: [s0(p0: [[105.0], [106.0]], p1: [[107.0]]), s0(p0: [[108.0], [109.0]], p1: [[110.0]]), s0(p0: [[111.0], [112.0]], p1: [[113.0]])])]], p1: [[s1(p0: s0(p0: [[114.0], [115.0]], p1: [[116.0]]), p1: [s0(p0: [[117.0], [118.0]], p1: [[119.0]]), s0(p0: [[120.0], [121.0]], p1: [[122.0]]), s0(p0: [[123.0], [124.0]], p1: [[125.0]])])], [s1(p0: s0(p0: [[126.0], [127.0]], p1: [[128.0]]), p1: [s0(p0: [[129.0], [130.0]], p1: [[131.0]]), s0(p0: [[132.0], [133.0]], p1: [[134.0]]), s0(p0: [[135.0], [136.0]], p1: [[137.0]])])]]), s3(p0: [[s1(p0: s0(p0: [[138.0], [139.0]], p1: [[140.0]]), p1: [s0(p0: [[141.0], [142.0]], p1: [[143.0]]), s0(p0: [[144.0], [145.0]], p1: [[146.0]]), s0(p0: [[147.0], [148.0]], p1: [[149.0]])])], [s1(p0: s0(p0: [[150.0], [151.0]], p1: [[152.0]]), p1: [s0(p0: [[153.0], [154.0]], p1: [[155.0]]), s0(p0: [[156.0], [157.0]], p1: [[158.0]]), s0(p0: [[159.0], [160.0]], p1: [[161.0]])])], [s1(p0: s0(p0: [[162.0], [163.0]], p1: [[164.0]]), p1: [s0(p0: [[165.0], [166.0]], p1: [[167.0]]), s0(p0: [[168.0], [169.0]], p1: [[170.0]]), s0(p0: [[171.0], [172.0]], p1: [[173.0]])])]], p1: [[s1(p0: s0(p0: [[174.0], [175.0]], p1: [[176.0]]), p1: [s0(p0: [[177.0], [178.0]], p1: [[179.0]]), s0(p0: [[180.0], [181.0]], p1: [[182.0]]), s0(p0: [[183.0], [184.0]], p1: [[185.0]])])], [s1(p0: s0(p0: [[186.0], [187.0]], p1: [[188.0]]), p1: [s0(p0: [[189.0], [190.0]], p1: [[191.0]]), s0(p0: [[192.0], [193.0]], p1: [[194.0]]), s0(p0: [[195.0], [196.0]], p1: [[197.0]])])]])], p2: [s2(p0: [s1(p0: s0(p0: [[198.0], [199.0]], p1: [[200.0]]), p1: [s0(p0: [[201.0], [202.0]], p1: [[203.0]]), s0(p0: [[204.0], [205.0]], p1: [[206.0]]), s0(p0: [[207.0], [208.0]], p1: [[209.0]])]), s1(p0: s0(p0: [[210.0], [211.0]], p1: [[212.0]]), p1: [s0(p0: [[213.0], [214.0]], p1: [[215.0]]), s0(p0: [[216.0], [217.0]], p1: [[218.0]]), s0(p0: [[219.0], [220.0]], p1: [[221.0]])]), s1(p0: s0(p0: [[222.0], [223.0]], p1: [[224.0]]), p1: [s0(p0: [[225.0], [226.0]], p1: [[227.0]]), s0(p0: [[228.0], [229.0]], p1: [[230.0]]), s0(p0: [[231.0], [232.0]], p1: [[233.0]])])], p1: s0(p0: [[234.0], [235.0]], p1: [[236.0]]))]), p3: s4(p0: [s1(p0: s0(p0: [[237.0], [238.0]], p1: [[239.0]]), p1: [s0(p0: [[240.0], [241.0]], p1: [[242.0]]), s0(p0: [[243.0], [244.0]], p1: [[245.0]]), s0(p0: [[246.0], [247.0]], p1: [[248.0]])])], p1: [s3(p0: [[s1(p0: s0(p0: [[249.0], [250.0]], p1: [[251.0]]), p1: [s0(p0: [[252.0], [253.0]], p1: [[254.0]]), s0(p0: [[255.0], [256.0]], p1: [[257.0]]), s0(p0: [[258.0], [259.0]], p1: [[260.0]])])], [s1(p0: s0(p0: [[261.0], [262.0]], p1: [[263.0]]), p1: [s0(p0: [[264.0], [265.0]], p1: [[266.0]]), s0(p0: [[267.0], [268.0]], p1: [[269.0]]), s0(p0: [[270.0], [271.0]], p1: [[272.0]])])], [s1(p0: s0(p0: [[273.0], [274.0]], p1: [[275.0]]), p1: [s0(p0: [[276.0], [277.0]], p1: [[278.0]]), s0(p0: [[279.0], [280.0]], p1: [[281.0]]), s0(p0: [[282.0], [283.0]], p1: [[284.0]])])]], p1: [[s1(p0: s0(p0: [[285.0], [286.0]], p1: [[287.0]]), p1: [s0(p0: [[288.0], [289.0]], p1: [[290.0]]), s0(p0: [[291.0], [292.0]], p1: [[293.0]]), s0(p0: [[294.0], [295.0]], p1: [[296.0]])])], [s1(p0: s0(p0: [[297.0], [298.0]], p1: [[299.0]]), p1: [s0(p0: [[300.0], [301.0]], p1: [[302.0]]), s0(p0: [[303.0], [304.0]], p1: [[305.0]]), s0(p0: [[306.0], [307.0]], p1: [[308.0]])])]]), s3(p0: [[s1(p0: s0(p0: [[309.0], [310.0]], p1: [[311.0]]), p1: [s0(p0: [[312.0], [313.0]], p1: [[314.0]]), s0(p0: [[315.0], [316.0]], p1: [[317.0]]), s0(p0: [[318.0], [319.0]], p1: [[320.0]])])], [s1(p0: s0(p0: [[321.0], [322.0]], p1: [[323.0]]), p1: [s0(p0: [[324.0], [325.0]], p1: [[326.0]]), s0(p0: [[327.0], [328.0]], p1: [[329.0]]), s0(p0: [[330.0], [331.0]], p1: [[332.0]])])], [s1(p0: s0(p0: [[333.0], [334.0]], p1: [[335.0]]), p1: [s0(p0: [[336.0], [337.0]], p1: [[338.0]]), s0(p0: [[339.0], [340.0]], p1: [[341.0]]), s0(p0: [[342.0], [343.0]], p1: [[344.0]])])]], p1: [[s1(p0: s0(p0: [[345.0], [346.0]], p1: [[347.0]]), p1: [s0(p0: [[348.0], [349.0]], p1: [[350.0]]), s0(p0: [[351.0], [352.0]], p1: [[353.0]]), s0(p0: [[354.0], [355.0]], p1: [[356.0]])])], [s1(p0: s0(p0: [[357.0], [358.0]], p1: [[359.0]]), p1: [s0(p0: [[360.0], [361.0]], p1: [[362.0]]), s0(p0: [[363.0], [364.0]], p1: [[365.0]]), s0(p0: [[366.0], [367.0]], p1: [[368.0]])])]]), s3(p0: [[s1(p0: s0(p0: [[369.0], [370.0]], p1: [[371.0]]), p1: [s0(p0: [[372.0], [373.0]], p1: [[374.0]]), s0(p0: [[375.0], [376.0]], p1: [[377.0]]), s0(p0: [[378.0], [379.0]], p1: [[380.0]])])], [s1(p0: s0(p0: [[381.0], [382.0]], p1: [[383.0]]), p1: [s0(p0: [[384.0], [385.0]], p1: [[386.0]]), s0(p0: [[387.0], [388.0]], p1: [[389.0]]), s0(p0: [[390.0], [391.0]], p1: [[392.0]])])], [s1(p0: s0(p0: [[393.0], [394.0]], p1: [[395.0]]), p1: [s0(p0: [[396.0], [397.0]], p1: [[398.0]]), s0(p0: [[399.0], [400.0]], p1: [[401.0]]), s0(p0: [[402.0], [403.0]], p1: [[404.0]])])]], p1: [[s1(p0: s0(p0: [[405.0], [406.0]], p1: [[407.0]]), p1: [s0(p0: [[408.0], [409.0]], p1: [[410.0]]), s0(p0: [[411.0], [412.0]], p1: [[413.0]]), s0(p0: [[414.0], [415.0]], p1: [[416.0]])])], [s1(p0: s0(p0: [[417.0], [418.0]], p1: [[419.0]]), p1: [s0(p0: [[420.0], [421.0]], p1: [[422.0]]), s0(p0: [[423.0], [424.0]], p1: [[425.0]]), s0(p0: [[426.0], [427.0]], p1: [[428.0]])])]])], p2: [s2(p0: [s1(p0: s0(p0: [[429.0], [430.0]], p1: [[431.0]]), p1: [s0(p0: [[432.0], [433.0]], p1: [[434.0]]), s0(p0: [[435.0], [436.0]], p1: [[437.0]]), s0(p0: [[438.0], [439.0]], p1: [[440.0]])]), s1(p0: s0(p0: [[441.0], [442.0]], p1: [[443.0]]), p1: [s0(p0: [[444.0], [445.0]], p1: [[446.0]]), s0(p0: [[447.0], [448.0]], p1: [[449.0]]), s0(p0: [[450.0], [451.0]], p1: [[452.0]])]), s1(p0: s0(p0: [[453.0], [454.0]], p1: [[455.0]]), p1: [s0(p0: [[456.0], [457.0]], p1: [[458.0]]), s0(p0: [[459.0], [460.0]], p1: [[461.0]]), s0(p0: [[462.0], [463.0]], p1: [[464.0]])])], p1: s0(p0: [[465.0], [466.0]], p1: [[467.0]]))]), p4: s2(p0: [s1(p0: s0(p0: [[468.0], [469.0]], p1: [[470.0]]), p1: [s0(p0: [[471.0], [472.0]], p1: [[473.0]]), s0(p0: [[474.0], [475.0]], p1: [[476.0]]), s0(p0: [[477.0], [478.0]], p1: [[479.0]])]), s1(p0: s0(p0: [[480.0], [481.0]], p1: [[482.0]]), p1: [s0(p0: [[483.0], [484.0]], p1: [[485.0]]), s0(p0: [[486.0], [487.0]], p1: [[488.0]]), s0(p0: [[489.0], [490.0]], p1: [[491.0]])]), s1(p0: s0(p0: [[492.0], [493.0]], p1: [[494.0]]), p1: [s0(p0: [[495.0], [496.0]], p1: [[497.0]]), s0(p0: [[498.0], [499.0]], p1: [[500.0]]), s0(p0: [[501.0], [502.0]], p1: [[503.0]])])], p1: s0(p0: [[504.0], [505.0]], p1: [[506.0]])))]]
    let v1: Double = 507.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 507.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
