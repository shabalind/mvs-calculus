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
    var p0: s0
    var p1: s0
    var p2: [s0]
    var p3: s1
    var p4: [s1]
    var p5: [[s0]]
  }
  struct s3 {
    var p0: s0
    var p1: [[s1]]
    var p2: [s2]
  }
  struct s4 {
    var p0: s1
    var p1: s2
  }
  struct s5 {
    var p0: [s4]
    var p1: [s0]
  }
  struct s6 {
    var p0: [s5]
    var p1: s3
  }
  func f21(_ v0: [s0], _ v1: Double) -> [s0] {
    let v9: [[s0]] = [v0, v0, v0]
    var v8: [[s0]] = v9
    v8[0] = v0
    let v13: [s0] = v8[2]
    v8[1] = v0
    var v44: [s0] = v0
    v8[2] = v44
    var v102: [[s0]] = v8
    v102[0] = v13
    v8[1] = v13
    v8[2] = v44
    let v57: [s0] = v102[2]
    v102 = v9
    v102[0] = v57
    return v57
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: [[s6]], _ v2: Double) -> Double {
    let v6: [s0] = v0.p1
    let v11: [s0] = f21(v6, v2)
    let v37: s0 = v11[0]
    let v35: [[Double]] = v37.p1
    let v132: [Double] = v35[2]
    let v136: Double = v132[0]
    let v85: Double = v136 + v136
    return v85
  }
  func benchmark() {
    let v0: s5 = s5(p0: [s4(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [[s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]]), p1: s2(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]), p2: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])], p3: s1(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), p1: [[s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])]]), p4: [s1(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]]), p1: [[s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]]), s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]]), p1: [[s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]])]]), s1(p0: s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]]), p1: [[s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]])]])], p5: [[s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])]])), s4(p0: s1(p0: s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0], [95.0]]), p1: [[s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0], [100.0], [101.0]])]]), p1: s2(p0: s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0], [107.0]]), p1: s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0], [112.0], [113.0]]), p2: [s0(p0: [[114.0], [115.0], [116.0]], p1: [[117.0], [118.0], [119.0]]), s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0], [125.0]])], p3: s1(p0: s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0], [130.0], [131.0]]), p1: [[s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0], [136.0], [137.0]])]]), p4: [s1(p0: s0(p0: [[138.0], [139.0], [140.0]], p1: [[141.0], [142.0], [143.0]]), p1: [[s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0], [148.0], [149.0]])]]), s1(p0: s0(p0: [[150.0], [151.0], [152.0]], p1: [[153.0], [154.0], [155.0]]), p1: [[s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0], [160.0], [161.0]])]]), s1(p0: s0(p0: [[162.0], [163.0], [164.0]], p1: [[165.0], [166.0], [167.0]]), p1: [[s0(p0: [[168.0], [169.0], [170.0]], p1: [[171.0], [172.0], [173.0]])]])], p5: [[s0(p0: [[174.0], [175.0], [176.0]], p1: [[177.0], [178.0], [179.0]])]])), s4(p0: s1(p0: s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0], [184.0], [185.0]]), p1: [[s0(p0: [[186.0], [187.0], [188.0]], p1: [[189.0], [190.0], [191.0]])]]), p1: s2(p0: s0(p0: [[192.0], [193.0], [194.0]], p1: [[195.0], [196.0], [197.0]]), p1: s0(p0: [[198.0], [199.0], [200.0]], p1: [[201.0], [202.0], [203.0]]), p2: [s0(p0: [[204.0], [205.0], [206.0]], p1: [[207.0], [208.0], [209.0]]), s0(p0: [[210.0], [211.0], [212.0]], p1: [[213.0], [214.0], [215.0]])], p3: s1(p0: s0(p0: [[216.0], [217.0], [218.0]], p1: [[219.0], [220.0], [221.0]]), p1: [[s0(p0: [[222.0], [223.0], [224.0]], p1: [[225.0], [226.0], [227.0]])]]), p4: [s1(p0: s0(p0: [[228.0], [229.0], [230.0]], p1: [[231.0], [232.0], [233.0]]), p1: [[s0(p0: [[234.0], [235.0], [236.0]], p1: [[237.0], [238.0], [239.0]])]]), s1(p0: s0(p0: [[240.0], [241.0], [242.0]], p1: [[243.0], [244.0], [245.0]]), p1: [[s0(p0: [[246.0], [247.0], [248.0]], p1: [[249.0], [250.0], [251.0]])]]), s1(p0: s0(p0: [[252.0], [253.0], [254.0]], p1: [[255.0], [256.0], [257.0]]), p1: [[s0(p0: [[258.0], [259.0], [260.0]], p1: [[261.0], [262.0], [263.0]])]])], p5: [[s0(p0: [[264.0], [265.0], [266.0]], p1: [[267.0], [268.0], [269.0]])]]))], p1: [s0(p0: [[270.0], [271.0], [272.0]], p1: [[273.0], [274.0], [275.0]])])
    let v1: [[s6]] = [[s6(p0: [s5(p0: [s4(p0: s1(p0: s0(p0: [[276.0], [277.0], [278.0]], p1: [[279.0], [280.0], [281.0]]), p1: [[s0(p0: [[282.0], [283.0], [284.0]], p1: [[285.0], [286.0], [287.0]])]]), p1: s2(p0: s0(p0: [[288.0], [289.0], [290.0]], p1: [[291.0], [292.0], [293.0]]), p1: s0(p0: [[294.0], [295.0], [296.0]], p1: [[297.0], [298.0], [299.0]]), p2: [s0(p0: [[300.0], [301.0], [302.0]], p1: [[303.0], [304.0], [305.0]]), s0(p0: [[306.0], [307.0], [308.0]], p1: [[309.0], [310.0], [311.0]])], p3: s1(p0: s0(p0: [[312.0], [313.0], [314.0]], p1: [[315.0], [316.0], [317.0]]), p1: [[s0(p0: [[318.0], [319.0], [320.0]], p1: [[321.0], [322.0], [323.0]])]]), p4: [s1(p0: s0(p0: [[324.0], [325.0], [326.0]], p1: [[327.0], [328.0], [329.0]]), p1: [[s0(p0: [[330.0], [331.0], [332.0]], p1: [[333.0], [334.0], [335.0]])]]), s1(p0: s0(p0: [[336.0], [337.0], [338.0]], p1: [[339.0], [340.0], [341.0]]), p1: [[s0(p0: [[342.0], [343.0], [344.0]], p1: [[345.0], [346.0], [347.0]])]]), s1(p0: s0(p0: [[348.0], [349.0], [350.0]], p1: [[351.0], [352.0], [353.0]]), p1: [[s0(p0: [[354.0], [355.0], [356.0]], p1: [[357.0], [358.0], [359.0]])]])], p5: [[s0(p0: [[360.0], [361.0], [362.0]], p1: [[363.0], [364.0], [365.0]])]])), s4(p0: s1(p0: s0(p0: [[366.0], [367.0], [368.0]], p1: [[369.0], [370.0], [371.0]]), p1: [[s0(p0: [[372.0], [373.0], [374.0]], p1: [[375.0], [376.0], [377.0]])]]), p1: s2(p0: s0(p0: [[378.0], [379.0], [380.0]], p1: [[381.0], [382.0], [383.0]]), p1: s0(p0: [[384.0], [385.0], [386.0]], p1: [[387.0], [388.0], [389.0]]), p2: [s0(p0: [[390.0], [391.0], [392.0]], p1: [[393.0], [394.0], [395.0]]), s0(p0: [[396.0], [397.0], [398.0]], p1: [[399.0], [400.0], [401.0]])], p3: s1(p0: s0(p0: [[402.0], [403.0], [404.0]], p1: [[405.0], [406.0], [407.0]]), p1: [[s0(p0: [[408.0], [409.0], [410.0]], p1: [[411.0], [412.0], [413.0]])]]), p4: [s1(p0: s0(p0: [[414.0], [415.0], [416.0]], p1: [[417.0], [418.0], [419.0]]), p1: [[s0(p0: [[420.0], [421.0], [422.0]], p1: [[423.0], [424.0], [425.0]])]]), s1(p0: s0(p0: [[426.0], [427.0], [428.0]], p1: [[429.0], [430.0], [431.0]]), p1: [[s0(p0: [[432.0], [433.0], [434.0]], p1: [[435.0], [436.0], [437.0]])]]), s1(p0: s0(p0: [[438.0], [439.0], [440.0]], p1: [[441.0], [442.0], [443.0]]), p1: [[s0(p0: [[444.0], [445.0], [446.0]], p1: [[447.0], [448.0], [449.0]])]])], p5: [[s0(p0: [[450.0], [451.0], [452.0]], p1: [[453.0], [454.0], [455.0]])]])), s4(p0: s1(p0: s0(p0: [[456.0], [457.0], [458.0]], p1: [[459.0], [460.0], [461.0]]), p1: [[s0(p0: [[462.0], [463.0], [464.0]], p1: [[465.0], [466.0], [467.0]])]]), p1: s2(p0: s0(p0: [[468.0], [469.0], [470.0]], p1: [[471.0], [472.0], [473.0]]), p1: s0(p0: [[474.0], [475.0], [476.0]], p1: [[477.0], [478.0], [479.0]]), p2: [s0(p0: [[480.0], [481.0], [482.0]], p1: [[483.0], [484.0], [485.0]]), s0(p0: [[486.0], [487.0], [488.0]], p1: [[489.0], [490.0], [491.0]])], p3: s1(p0: s0(p0: [[492.0], [493.0], [494.0]], p1: [[495.0], [496.0], [497.0]]), p1: [[s0(p0: [[498.0], [499.0], [500.0]], p1: [[501.0], [502.0], [503.0]])]]), p4: [s1(p0: s0(p0: [[504.0], [505.0], [506.0]], p1: [[507.0], [508.0], [509.0]]), p1: [[s0(p0: [[510.0], [511.0], [512.0]], p1: [[513.0], [514.0], [515.0]])]]), s1(p0: s0(p0: [[516.0], [517.0], [518.0]], p1: [[519.0], [520.0], [521.0]]), p1: [[s0(p0: [[522.0], [523.0], [524.0]], p1: [[525.0], [526.0], [527.0]])]]), s1(p0: s0(p0: [[528.0], [529.0], [530.0]], p1: [[531.0], [532.0], [533.0]]), p1: [[s0(p0: [[534.0], [535.0], [536.0]], p1: [[537.0], [538.0], [539.0]])]])], p5: [[s0(p0: [[540.0], [541.0], [542.0]], p1: [[543.0], [544.0], [545.0]])]]))], p1: [s0(p0: [[546.0], [547.0], [548.0]], p1: [[549.0], [550.0], [551.0]])])], p1: s3(p0: s0(p0: [[552.0], [553.0], [554.0]], p1: [[555.0], [556.0], [557.0]]), p1: [[s1(p0: s0(p0: [[558.0], [559.0], [560.0]], p1: [[561.0], [562.0], [563.0]]), p1: [[s0(p0: [[564.0], [565.0], [566.0]], p1: [[567.0], [568.0], [569.0]])]])]], p2: [s2(p0: s0(p0: [[570.0], [571.0], [572.0]], p1: [[573.0], [574.0], [575.0]]), p1: s0(p0: [[576.0], [577.0], [578.0]], p1: [[579.0], [580.0], [581.0]]), p2: [s0(p0: [[582.0], [583.0], [584.0]], p1: [[585.0], [586.0], [587.0]]), s0(p0: [[588.0], [589.0], [590.0]], p1: [[591.0], [592.0], [593.0]])], p3: s1(p0: s0(p0: [[594.0], [595.0], [596.0]], p1: [[597.0], [598.0], [599.0]]), p1: [[s0(p0: [[600.0], [601.0], [602.0]], p1: [[603.0], [604.0], [605.0]])]]), p4: [s1(p0: s0(p0: [[606.0], [607.0], [608.0]], p1: [[609.0], [610.0], [611.0]]), p1: [[s0(p0: [[612.0], [613.0], [614.0]], p1: [[615.0], [616.0], [617.0]])]]), s1(p0: s0(p0: [[618.0], [619.0], [620.0]], p1: [[621.0], [622.0], [623.0]]), p1: [[s0(p0: [[624.0], [625.0], [626.0]], p1: [[627.0], [628.0], [629.0]])]]), s1(p0: s0(p0: [[630.0], [631.0], [632.0]], p1: [[633.0], [634.0], [635.0]]), p1: [[s0(p0: [[636.0], [637.0], [638.0]], p1: [[639.0], [640.0], [641.0]])]])], p5: [[s0(p0: [[642.0], [643.0], [644.0]], p1: [[645.0], [646.0], [647.0]])]]), s2(p0: s0(p0: [[648.0], [649.0], [650.0]], p1: [[651.0], [652.0], [653.0]]), p1: s0(p0: [[654.0], [655.0], [656.0]], p1: [[657.0], [658.0], [659.0]]), p2: [s0(p0: [[660.0], [661.0], [662.0]], p1: [[663.0], [664.0], [665.0]]), s0(p0: [[666.0], [667.0], [668.0]], p1: [[669.0], [670.0], [671.0]])], p3: s1(p0: s0(p0: [[672.0], [673.0], [674.0]], p1: [[675.0], [676.0], [677.0]]), p1: [[s0(p0: [[678.0], [679.0], [680.0]], p1: [[681.0], [682.0], [683.0]])]]), p4: [s1(p0: s0(p0: [[684.0], [685.0], [686.0]], p1: [[687.0], [688.0], [689.0]]), p1: [[s0(p0: [[690.0], [691.0], [692.0]], p1: [[693.0], [694.0], [695.0]])]]), s1(p0: s0(p0: [[696.0], [697.0], [698.0]], p1: [[699.0], [700.0], [701.0]]), p1: [[s0(p0: [[702.0], [703.0], [704.0]], p1: [[705.0], [706.0], [707.0]])]]), s1(p0: s0(p0: [[708.0], [709.0], [710.0]], p1: [[711.0], [712.0], [713.0]]), p1: [[s0(p0: [[714.0], [715.0], [716.0]], p1: [[717.0], [718.0], [719.0]])]])], p5: [[s0(p0: [[720.0], [721.0], [722.0]], p1: [[723.0], [724.0], [725.0]])]]), s2(p0: s0(p0: [[726.0], [727.0], [728.0]], p1: [[729.0], [730.0], [731.0]]), p1: s0(p0: [[732.0], [733.0], [734.0]], p1: [[735.0], [736.0], [737.0]]), p2: [s0(p0: [[738.0], [739.0], [740.0]], p1: [[741.0], [742.0], [743.0]]), s0(p0: [[744.0], [745.0], [746.0]], p1: [[747.0], [748.0], [749.0]])], p3: s1(p0: s0(p0: [[750.0], [751.0], [752.0]], p1: [[753.0], [754.0], [755.0]]), p1: [[s0(p0: [[756.0], [757.0], [758.0]], p1: [[759.0], [760.0], [761.0]])]]), p4: [s1(p0: s0(p0: [[762.0], [763.0], [764.0]], p1: [[765.0], [766.0], [767.0]]), p1: [[s0(p0: [[768.0], [769.0], [770.0]], p1: [[771.0], [772.0], [773.0]])]]), s1(p0: s0(p0: [[774.0], [775.0], [776.0]], p1: [[777.0], [778.0], [779.0]]), p1: [[s0(p0: [[780.0], [781.0], [782.0]], p1: [[783.0], [784.0], [785.0]])]]), s1(p0: s0(p0: [[786.0], [787.0], [788.0]], p1: [[789.0], [790.0], [791.0]]), p1: [[s0(p0: [[792.0], [793.0], [794.0]], p1: [[795.0], [796.0], [797.0]])]])], p5: [[s0(p0: [[798.0], [799.0], [800.0]], p1: [[801.0], [802.0], [803.0]])]])]))]]
    let v2: Double = 804.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 804.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
