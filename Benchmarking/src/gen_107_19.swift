  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s1]]
  }
  struct s5 {
    var p0: [s1]
    var p1: s2
  }
  struct s9 {
    var p0: s5
    var p1: s5
  }
  struct s12 {
    var p0: [s9]
    var p1: [s9]
  }
  func f15(_ v0: Double) -> Double {
    var v2: Double = v0
    var v7: Double = v0
    var v3: Double = v2
    var v4: Double = v0
    var v9: Double = v3
    var v5: Double = v7
    let v12: [Double] = [v4, v9, v3, v5]
    var v13: [Double] = v12
    let v6: Double = v13[1]
    v13[1] = v6
    var v34: Double = v9
    var v17: Double = v2
    var v41: [Double] = v12
    var v10: [Double] = v12
    let v22: Double = v13[3]
    v41[1] = v5
    var v21: Double = v0
    v10[0] = v9
    let v23: Double = v13[2]
    v41[1] = v34
    let v18: Double = v2 / v22
    let v24: [[Double]] = [v12, v10, v41]
    v10[1] = v23
    let v42: [Double] = v24[0]
    v10[1] = v18
    v10[2] = v18
    v41[3] = v23
    v41[0] = v5
    let v48: Double = v21 / v7
    let v38: Double = v42[1]
    v4 = v48
    v10[3] = v17
    return v38
  }
  @inline(never)
  func f0(_ v0: [[s12]], _ v1: Double) -> Double {
    let v5: Double = f15(v1)
    let v7: Double = f15(v5)
    let v32: Double = v7 * v1
    let v59: Double = v32 * v32
    let v65: [Double] = [v59]
    let v62: Double = v65[0]
    return v62
  }
  func benchmark() {
    let v0: [[s12]] = [[s12(p0: [s9(p0: s5(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [7.0])]), s1(p0: s0(p0: [[8.0], [9.0], [10.0]], p1: [11.0]), p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [15.0])]), s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [19.0]), p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [23.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [27.0]), p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [31.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[32.0], [33.0], [34.0]], p1: [35.0]), p1: [s0(p0: [[36.0], [37.0], [38.0]], p1: [39.0])]), s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [43.0]), p1: [s0(p0: [[44.0], [45.0], [46.0]], p1: [47.0])]), s1(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [51.0]), p1: [s0(p0: [[52.0], [53.0], [54.0]], p1: [55.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[56.0], [57.0], [58.0]], p1: [59.0]), p1: [s0(p0: [[60.0], [61.0], [62.0]], p1: [63.0])])]]))), s9(p0: s5(p0: [s1(p0: s0(p0: [[64.0], [65.0], [66.0]], p1: [67.0]), p1: [s0(p0: [[68.0], [69.0], [70.0]], p1: [71.0])]), s1(p0: s0(p0: [[72.0], [73.0], [74.0]], p1: [75.0]), p1: [s0(p0: [[76.0], [77.0], [78.0]], p1: [79.0])]), s1(p0: s0(p0: [[80.0], [81.0], [82.0]], p1: [83.0]), p1: [s0(p0: [[84.0], [85.0], [86.0]], p1: [87.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[88.0], [89.0], [90.0]], p1: [91.0]), p1: [s0(p0: [[92.0], [93.0], [94.0]], p1: [95.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[96.0], [97.0], [98.0]], p1: [99.0]), p1: [s0(p0: [[100.0], [101.0], [102.0]], p1: [103.0])]), s1(p0: s0(p0: [[104.0], [105.0], [106.0]], p1: [107.0]), p1: [s0(p0: [[108.0], [109.0], [110.0]], p1: [111.0])]), s1(p0: s0(p0: [[112.0], [113.0], [114.0]], p1: [115.0]), p1: [s0(p0: [[116.0], [117.0], [118.0]], p1: [119.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[120.0], [121.0], [122.0]], p1: [123.0]), p1: [s0(p0: [[124.0], [125.0], [126.0]], p1: [127.0])])]]))), s9(p0: s5(p0: [s1(p0: s0(p0: [[128.0], [129.0], [130.0]], p1: [131.0]), p1: [s0(p0: [[132.0], [133.0], [134.0]], p1: [135.0])]), s1(p0: s0(p0: [[136.0], [137.0], [138.0]], p1: [139.0]), p1: [s0(p0: [[140.0], [141.0], [142.0]], p1: [143.0])]), s1(p0: s0(p0: [[144.0], [145.0], [146.0]], p1: [147.0]), p1: [s0(p0: [[148.0], [149.0], [150.0]], p1: [151.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[152.0], [153.0], [154.0]], p1: [155.0]), p1: [s0(p0: [[156.0], [157.0], [158.0]], p1: [159.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[160.0], [161.0], [162.0]], p1: [163.0]), p1: [s0(p0: [[164.0], [165.0], [166.0]], p1: [167.0])]), s1(p0: s0(p0: [[168.0], [169.0], [170.0]], p1: [171.0]), p1: [s0(p0: [[172.0], [173.0], [174.0]], p1: [175.0])]), s1(p0: s0(p0: [[176.0], [177.0], [178.0]], p1: [179.0]), p1: [s0(p0: [[180.0], [181.0], [182.0]], p1: [183.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[184.0], [185.0], [186.0]], p1: [187.0]), p1: [s0(p0: [[188.0], [189.0], [190.0]], p1: [191.0])])]])))], p1: [s9(p0: s5(p0: [s1(p0: s0(p0: [[192.0], [193.0], [194.0]], p1: [195.0]), p1: [s0(p0: [[196.0], [197.0], [198.0]], p1: [199.0])]), s1(p0: s0(p0: [[200.0], [201.0], [202.0]], p1: [203.0]), p1: [s0(p0: [[204.0], [205.0], [206.0]], p1: [207.0])]), s1(p0: s0(p0: [[208.0], [209.0], [210.0]], p1: [211.0]), p1: [s0(p0: [[212.0], [213.0], [214.0]], p1: [215.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[216.0], [217.0], [218.0]], p1: [219.0]), p1: [s0(p0: [[220.0], [221.0], [222.0]], p1: [223.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[224.0], [225.0], [226.0]], p1: [227.0]), p1: [s0(p0: [[228.0], [229.0], [230.0]], p1: [231.0])]), s1(p0: s0(p0: [[232.0], [233.0], [234.0]], p1: [235.0]), p1: [s0(p0: [[236.0], [237.0], [238.0]], p1: [239.0])]), s1(p0: s0(p0: [[240.0], [241.0], [242.0]], p1: [243.0]), p1: [s0(p0: [[244.0], [245.0], [246.0]], p1: [247.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[248.0], [249.0], [250.0]], p1: [251.0]), p1: [s0(p0: [[252.0], [253.0], [254.0]], p1: [255.0])])]]))), s9(p0: s5(p0: [s1(p0: s0(p0: [[256.0], [257.0], [258.0]], p1: [259.0]), p1: [s0(p0: [[260.0], [261.0], [262.0]], p1: [263.0])]), s1(p0: s0(p0: [[264.0], [265.0], [266.0]], p1: [267.0]), p1: [s0(p0: [[268.0], [269.0], [270.0]], p1: [271.0])]), s1(p0: s0(p0: [[272.0], [273.0], [274.0]], p1: [275.0]), p1: [s0(p0: [[276.0], [277.0], [278.0]], p1: [279.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[280.0], [281.0], [282.0]], p1: [283.0]), p1: [s0(p0: [[284.0], [285.0], [286.0]], p1: [287.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[288.0], [289.0], [290.0]], p1: [291.0]), p1: [s0(p0: [[292.0], [293.0], [294.0]], p1: [295.0])]), s1(p0: s0(p0: [[296.0], [297.0], [298.0]], p1: [299.0]), p1: [s0(p0: [[300.0], [301.0], [302.0]], p1: [303.0])]), s1(p0: s0(p0: [[304.0], [305.0], [306.0]], p1: [307.0]), p1: [s0(p0: [[308.0], [309.0], [310.0]], p1: [311.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[312.0], [313.0], [314.0]], p1: [315.0]), p1: [s0(p0: [[316.0], [317.0], [318.0]], p1: [319.0])])]])))])], [s12(p0: [s9(p0: s5(p0: [s1(p0: s0(p0: [[320.0], [321.0], [322.0]], p1: [323.0]), p1: [s0(p0: [[324.0], [325.0], [326.0]], p1: [327.0])]), s1(p0: s0(p0: [[328.0], [329.0], [330.0]], p1: [331.0]), p1: [s0(p0: [[332.0], [333.0], [334.0]], p1: [335.0])]), s1(p0: s0(p0: [[336.0], [337.0], [338.0]], p1: [339.0]), p1: [s0(p0: [[340.0], [341.0], [342.0]], p1: [343.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[344.0], [345.0], [346.0]], p1: [347.0]), p1: [s0(p0: [[348.0], [349.0], [350.0]], p1: [351.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[352.0], [353.0], [354.0]], p1: [355.0]), p1: [s0(p0: [[356.0], [357.0], [358.0]], p1: [359.0])]), s1(p0: s0(p0: [[360.0], [361.0], [362.0]], p1: [363.0]), p1: [s0(p0: [[364.0], [365.0], [366.0]], p1: [367.0])]), s1(p0: s0(p0: [[368.0], [369.0], [370.0]], p1: [371.0]), p1: [s0(p0: [[372.0], [373.0], [374.0]], p1: [375.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[376.0], [377.0], [378.0]], p1: [379.0]), p1: [s0(p0: [[380.0], [381.0], [382.0]], p1: [383.0])])]]))), s9(p0: s5(p0: [s1(p0: s0(p0: [[384.0], [385.0], [386.0]], p1: [387.0]), p1: [s0(p0: [[388.0], [389.0], [390.0]], p1: [391.0])]), s1(p0: s0(p0: [[392.0], [393.0], [394.0]], p1: [395.0]), p1: [s0(p0: [[396.0], [397.0], [398.0]], p1: [399.0])]), s1(p0: s0(p0: [[400.0], [401.0], [402.0]], p1: [403.0]), p1: [s0(p0: [[404.0], [405.0], [406.0]], p1: [407.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[408.0], [409.0], [410.0]], p1: [411.0]), p1: [s0(p0: [[412.0], [413.0], [414.0]], p1: [415.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[416.0], [417.0], [418.0]], p1: [419.0]), p1: [s0(p0: [[420.0], [421.0], [422.0]], p1: [423.0])]), s1(p0: s0(p0: [[424.0], [425.0], [426.0]], p1: [427.0]), p1: [s0(p0: [[428.0], [429.0], [430.0]], p1: [431.0])]), s1(p0: s0(p0: [[432.0], [433.0], [434.0]], p1: [435.0]), p1: [s0(p0: [[436.0], [437.0], [438.0]], p1: [439.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[440.0], [441.0], [442.0]], p1: [443.0]), p1: [s0(p0: [[444.0], [445.0], [446.0]], p1: [447.0])])]]))), s9(p0: s5(p0: [s1(p0: s0(p0: [[448.0], [449.0], [450.0]], p1: [451.0]), p1: [s0(p0: [[452.0], [453.0], [454.0]], p1: [455.0])]), s1(p0: s0(p0: [[456.0], [457.0], [458.0]], p1: [459.0]), p1: [s0(p0: [[460.0], [461.0], [462.0]], p1: [463.0])]), s1(p0: s0(p0: [[464.0], [465.0], [466.0]], p1: [467.0]), p1: [s0(p0: [[468.0], [469.0], [470.0]], p1: [471.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[472.0], [473.0], [474.0]], p1: [475.0]), p1: [s0(p0: [[476.0], [477.0], [478.0]], p1: [479.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[480.0], [481.0], [482.0]], p1: [483.0]), p1: [s0(p0: [[484.0], [485.0], [486.0]], p1: [487.0])]), s1(p0: s0(p0: [[488.0], [489.0], [490.0]], p1: [491.0]), p1: [s0(p0: [[492.0], [493.0], [494.0]], p1: [495.0])]), s1(p0: s0(p0: [[496.0], [497.0], [498.0]], p1: [499.0]), p1: [s0(p0: [[500.0], [501.0], [502.0]], p1: [503.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[504.0], [505.0], [506.0]], p1: [507.0]), p1: [s0(p0: [[508.0], [509.0], [510.0]], p1: [511.0])])]])))], p1: [s9(p0: s5(p0: [s1(p0: s0(p0: [[512.0], [513.0], [514.0]], p1: [515.0]), p1: [s0(p0: [[516.0], [517.0], [518.0]], p1: [519.0])]), s1(p0: s0(p0: [[520.0], [521.0], [522.0]], p1: [523.0]), p1: [s0(p0: [[524.0], [525.0], [526.0]], p1: [527.0])]), s1(p0: s0(p0: [[528.0], [529.0], [530.0]], p1: [531.0]), p1: [s0(p0: [[532.0], [533.0], [534.0]], p1: [535.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[536.0], [537.0], [538.0]], p1: [539.0]), p1: [s0(p0: [[540.0], [541.0], [542.0]], p1: [543.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[544.0], [545.0], [546.0]], p1: [547.0]), p1: [s0(p0: [[548.0], [549.0], [550.0]], p1: [551.0])]), s1(p0: s0(p0: [[552.0], [553.0], [554.0]], p1: [555.0]), p1: [s0(p0: [[556.0], [557.0], [558.0]], p1: [559.0])]), s1(p0: s0(p0: [[560.0], [561.0], [562.0]], p1: [563.0]), p1: [s0(p0: [[564.0], [565.0], [566.0]], p1: [567.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[568.0], [569.0], [570.0]], p1: [571.0]), p1: [s0(p0: [[572.0], [573.0], [574.0]], p1: [575.0])])]]))), s9(p0: s5(p0: [s1(p0: s0(p0: [[576.0], [577.0], [578.0]], p1: [579.0]), p1: [s0(p0: [[580.0], [581.0], [582.0]], p1: [583.0])]), s1(p0: s0(p0: [[584.0], [585.0], [586.0]], p1: [587.0]), p1: [s0(p0: [[588.0], [589.0], [590.0]], p1: [591.0])]), s1(p0: s0(p0: [[592.0], [593.0], [594.0]], p1: [595.0]), p1: [s0(p0: [[596.0], [597.0], [598.0]], p1: [599.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[600.0], [601.0], [602.0]], p1: [603.0]), p1: [s0(p0: [[604.0], [605.0], [606.0]], p1: [607.0])])]])), p1: s5(p0: [s1(p0: s0(p0: [[608.0], [609.0], [610.0]], p1: [611.0]), p1: [s0(p0: [[612.0], [613.0], [614.0]], p1: [615.0])]), s1(p0: s0(p0: [[616.0], [617.0], [618.0]], p1: [619.0]), p1: [s0(p0: [[620.0], [621.0], [622.0]], p1: [623.0])]), s1(p0: s0(p0: [[624.0], [625.0], [626.0]], p1: [627.0]), p1: [s0(p0: [[628.0], [629.0], [630.0]], p1: [631.0])])], p1: s2(p0: [[s1(p0: s0(p0: [[632.0], [633.0], [634.0]], p1: [635.0]), p1: [s0(p0: [[636.0], [637.0], [638.0]], p1: [639.0])])]])))])]]
    let v1: Double = 640.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 640.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
