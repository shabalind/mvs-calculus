  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  struct s3 {
    var p0: [s2]
    var p1: s1
  }
  struct s4 {
    var p0: [[s1]]
    var p1: Double
  }
  struct s5 {
    var p0: [s3]
    var p1: s4
  }
  struct s6 {
    var p0: [[s5]]
  }
  struct s7 {
    var p0: [s5]
    var p1: s6
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: [[s7]], _ v2: Double) -> Double {
    var v11: Double = v2
    let v39: s6 = v0[1]
    var v10: Double = v11
    var v31: Double = v10
    let v23: [[s5]] = v39.p0
    let v50: [s5] = v23[0]
    let v79: Double = v31 + v2
    let v46: s5 = v50[0]
    let v180: s4 = v46.p1
    let v75: Double = v180.p1
    let v195: Double = v75 - v79
    return v195
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: [[s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])]], p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]), p1: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])]), s2(p0: s1(p0: [[s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])]], p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])]), p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])])], p1: s1(p0: [[s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])]], p1: [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])]], p1: [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])]), p1: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]), s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]])]), s2(p0: s1(p0: [[s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])]], p1: [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]])]), p1: [s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]]), s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]]), s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]])])], p1: s1(p0: [[s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]])]], p1: [s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]])]], p1: [s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]])]), p1: [s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]]), s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]]), s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]])]), s2(p0: s1(p0: [[s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0]])]], p1: [s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]])]), p1: [s0(p0: [[124.0], [125.0], [126.0]], p1: [[127.0]]), s0(p0: [[128.0], [129.0], [130.0]], p1: [[131.0]]), s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0]])])], p1: s1(p0: [[s0(p0: [[136.0], [137.0], [138.0]], p1: [[139.0]])]], p1: [s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0]])]], p1: [s0(p0: [[148.0], [149.0], [150.0]], p1: [[151.0]])])], [s1(p0: [[s0(p0: [[152.0], [153.0], [154.0]], p1: [[155.0]])]], p1: [s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0]])])]], p1: 160.0))], [s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[161.0], [162.0], [163.0]], p1: [[164.0]])]], p1: [s0(p0: [[165.0], [166.0], [167.0]], p1: [[168.0]])]), p1: [s0(p0: [[169.0], [170.0], [171.0]], p1: [[172.0]]), s0(p0: [[173.0], [174.0], [175.0]], p1: [[176.0]]), s0(p0: [[177.0], [178.0], [179.0]], p1: [[180.0]])]), s2(p0: s1(p0: [[s0(p0: [[181.0], [182.0], [183.0]], p1: [[184.0]])]], p1: [s0(p0: [[185.0], [186.0], [187.0]], p1: [[188.0]])]), p1: [s0(p0: [[189.0], [190.0], [191.0]], p1: [[192.0]]), s0(p0: [[193.0], [194.0], [195.0]], p1: [[196.0]]), s0(p0: [[197.0], [198.0], [199.0]], p1: [[200.0]])])], p1: s1(p0: [[s0(p0: [[201.0], [202.0], [203.0]], p1: [[204.0]])]], p1: [s0(p0: [[205.0], [206.0], [207.0]], p1: [[208.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[209.0], [210.0], [211.0]], p1: [[212.0]])]], p1: [s0(p0: [[213.0], [214.0], [215.0]], p1: [[216.0]])]), p1: [s0(p0: [[217.0], [218.0], [219.0]], p1: [[220.0]]), s0(p0: [[221.0], [222.0], [223.0]], p1: [[224.0]]), s0(p0: [[225.0], [226.0], [227.0]], p1: [[228.0]])]), s2(p0: s1(p0: [[s0(p0: [[229.0], [230.0], [231.0]], p1: [[232.0]])]], p1: [s0(p0: [[233.0], [234.0], [235.0]], p1: [[236.0]])]), p1: [s0(p0: [[237.0], [238.0], [239.0]], p1: [[240.0]]), s0(p0: [[241.0], [242.0], [243.0]], p1: [[244.0]]), s0(p0: [[245.0], [246.0], [247.0]], p1: [[248.0]])])], p1: s1(p0: [[s0(p0: [[249.0], [250.0], [251.0]], p1: [[252.0]])]], p1: [s0(p0: [[253.0], [254.0], [255.0]], p1: [[256.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[257.0], [258.0], [259.0]], p1: [[260.0]])]], p1: [s0(p0: [[261.0], [262.0], [263.0]], p1: [[264.0]])]), p1: [s0(p0: [[265.0], [266.0], [267.0]], p1: [[268.0]]), s0(p0: [[269.0], [270.0], [271.0]], p1: [[272.0]]), s0(p0: [[273.0], [274.0], [275.0]], p1: [[276.0]])]), s2(p0: s1(p0: [[s0(p0: [[277.0], [278.0], [279.0]], p1: [[280.0]])]], p1: [s0(p0: [[281.0], [282.0], [283.0]], p1: [[284.0]])]), p1: [s0(p0: [[285.0], [286.0], [287.0]], p1: [[288.0]]), s0(p0: [[289.0], [290.0], [291.0]], p1: [[292.0]]), s0(p0: [[293.0], [294.0], [295.0]], p1: [[296.0]])])], p1: s1(p0: [[s0(p0: [[297.0], [298.0], [299.0]], p1: [[300.0]])]], p1: [s0(p0: [[301.0], [302.0], [303.0]], p1: [[304.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[305.0], [306.0], [307.0]], p1: [[308.0]])]], p1: [s0(p0: [[309.0], [310.0], [311.0]], p1: [[312.0]])])], [s1(p0: [[s0(p0: [[313.0], [314.0], [315.0]], p1: [[316.0]])]], p1: [s0(p0: [[317.0], [318.0], [319.0]], p1: [[320.0]])])]], p1: 321.0))]]), s6(p0: [[s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[322.0], [323.0], [324.0]], p1: [[325.0]])]], p1: [s0(p0: [[326.0], [327.0], [328.0]], p1: [[329.0]])]), p1: [s0(p0: [[330.0], [331.0], [332.0]], p1: [[333.0]]), s0(p0: [[334.0], [335.0], [336.0]], p1: [[337.0]]), s0(p0: [[338.0], [339.0], [340.0]], p1: [[341.0]])]), s2(p0: s1(p0: [[s0(p0: [[342.0], [343.0], [344.0]], p1: [[345.0]])]], p1: [s0(p0: [[346.0], [347.0], [348.0]], p1: [[349.0]])]), p1: [s0(p0: [[350.0], [351.0], [352.0]], p1: [[353.0]]), s0(p0: [[354.0], [355.0], [356.0]], p1: [[357.0]]), s0(p0: [[358.0], [359.0], [360.0]], p1: [[361.0]])])], p1: s1(p0: [[s0(p0: [[362.0], [363.0], [364.0]], p1: [[365.0]])]], p1: [s0(p0: [[366.0], [367.0], [368.0]], p1: [[369.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[370.0], [371.0], [372.0]], p1: [[373.0]])]], p1: [s0(p0: [[374.0], [375.0], [376.0]], p1: [[377.0]])]), p1: [s0(p0: [[378.0], [379.0], [380.0]], p1: [[381.0]]), s0(p0: [[382.0], [383.0], [384.0]], p1: [[385.0]]), s0(p0: [[386.0], [387.0], [388.0]], p1: [[389.0]])]), s2(p0: s1(p0: [[s0(p0: [[390.0], [391.0], [392.0]], p1: [[393.0]])]], p1: [s0(p0: [[394.0], [395.0], [396.0]], p1: [[397.0]])]), p1: [s0(p0: [[398.0], [399.0], [400.0]], p1: [[401.0]]), s0(p0: [[402.0], [403.0], [404.0]], p1: [[405.0]]), s0(p0: [[406.0], [407.0], [408.0]], p1: [[409.0]])])], p1: s1(p0: [[s0(p0: [[410.0], [411.0], [412.0]], p1: [[413.0]])]], p1: [s0(p0: [[414.0], [415.0], [416.0]], p1: [[417.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[418.0], [419.0], [420.0]], p1: [[421.0]])]], p1: [s0(p0: [[422.0], [423.0], [424.0]], p1: [[425.0]])]), p1: [s0(p0: [[426.0], [427.0], [428.0]], p1: [[429.0]]), s0(p0: [[430.0], [431.0], [432.0]], p1: [[433.0]]), s0(p0: [[434.0], [435.0], [436.0]], p1: [[437.0]])]), s2(p0: s1(p0: [[s0(p0: [[438.0], [439.0], [440.0]], p1: [[441.0]])]], p1: [s0(p0: [[442.0], [443.0], [444.0]], p1: [[445.0]])]), p1: [s0(p0: [[446.0], [447.0], [448.0]], p1: [[449.0]]), s0(p0: [[450.0], [451.0], [452.0]], p1: [[453.0]]), s0(p0: [[454.0], [455.0], [456.0]], p1: [[457.0]])])], p1: s1(p0: [[s0(p0: [[458.0], [459.0], [460.0]], p1: [[461.0]])]], p1: [s0(p0: [[462.0], [463.0], [464.0]], p1: [[465.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[466.0], [467.0], [468.0]], p1: [[469.0]])]], p1: [s0(p0: [[470.0], [471.0], [472.0]], p1: [[473.0]])])], [s1(p0: [[s0(p0: [[474.0], [475.0], [476.0]], p1: [[477.0]])]], p1: [s0(p0: [[478.0], [479.0], [480.0]], p1: [[481.0]])])]], p1: 482.0))], [s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[483.0], [484.0], [485.0]], p1: [[486.0]])]], p1: [s0(p0: [[487.0], [488.0], [489.0]], p1: [[490.0]])]), p1: [s0(p0: [[491.0], [492.0], [493.0]], p1: [[494.0]]), s0(p0: [[495.0], [496.0], [497.0]], p1: [[498.0]]), s0(p0: [[499.0], [500.0], [501.0]], p1: [[502.0]])]), s2(p0: s1(p0: [[s0(p0: [[503.0], [504.0], [505.0]], p1: [[506.0]])]], p1: [s0(p0: [[507.0], [508.0], [509.0]], p1: [[510.0]])]), p1: [s0(p0: [[511.0], [512.0], [513.0]], p1: [[514.0]]), s0(p0: [[515.0], [516.0], [517.0]], p1: [[518.0]]), s0(p0: [[519.0], [520.0], [521.0]], p1: [[522.0]])])], p1: s1(p0: [[s0(p0: [[523.0], [524.0], [525.0]], p1: [[526.0]])]], p1: [s0(p0: [[527.0], [528.0], [529.0]], p1: [[530.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[531.0], [532.0], [533.0]], p1: [[534.0]])]], p1: [s0(p0: [[535.0], [536.0], [537.0]], p1: [[538.0]])]), p1: [s0(p0: [[539.0], [540.0], [541.0]], p1: [[542.0]]), s0(p0: [[543.0], [544.0], [545.0]], p1: [[546.0]]), s0(p0: [[547.0], [548.0], [549.0]], p1: [[550.0]])]), s2(p0: s1(p0: [[s0(p0: [[551.0], [552.0], [553.0]], p1: [[554.0]])]], p1: [s0(p0: [[555.0], [556.0], [557.0]], p1: [[558.0]])]), p1: [s0(p0: [[559.0], [560.0], [561.0]], p1: [[562.0]]), s0(p0: [[563.0], [564.0], [565.0]], p1: [[566.0]]), s0(p0: [[567.0], [568.0], [569.0]], p1: [[570.0]])])], p1: s1(p0: [[s0(p0: [[571.0], [572.0], [573.0]], p1: [[574.0]])]], p1: [s0(p0: [[575.0], [576.0], [577.0]], p1: [[578.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[579.0], [580.0], [581.0]], p1: [[582.0]])]], p1: [s0(p0: [[583.0], [584.0], [585.0]], p1: [[586.0]])]), p1: [s0(p0: [[587.0], [588.0], [589.0]], p1: [[590.0]]), s0(p0: [[591.0], [592.0], [593.0]], p1: [[594.0]]), s0(p0: [[595.0], [596.0], [597.0]], p1: [[598.0]])]), s2(p0: s1(p0: [[s0(p0: [[599.0], [600.0], [601.0]], p1: [[602.0]])]], p1: [s0(p0: [[603.0], [604.0], [605.0]], p1: [[606.0]])]), p1: [s0(p0: [[607.0], [608.0], [609.0]], p1: [[610.0]]), s0(p0: [[611.0], [612.0], [613.0]], p1: [[614.0]]), s0(p0: [[615.0], [616.0], [617.0]], p1: [[618.0]])])], p1: s1(p0: [[s0(p0: [[619.0], [620.0], [621.0]], p1: [[622.0]])]], p1: [s0(p0: [[623.0], [624.0], [625.0]], p1: [[626.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[627.0], [628.0], [629.0]], p1: [[630.0]])]], p1: [s0(p0: [[631.0], [632.0], [633.0]], p1: [[634.0]])])], [s1(p0: [[s0(p0: [[635.0], [636.0], [637.0]], p1: [[638.0]])]], p1: [s0(p0: [[639.0], [640.0], [641.0]], p1: [[642.0]])])]], p1: 643.0))]]), s6(p0: [[s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[644.0], [645.0], [646.0]], p1: [[647.0]])]], p1: [s0(p0: [[648.0], [649.0], [650.0]], p1: [[651.0]])]), p1: [s0(p0: [[652.0], [653.0], [654.0]], p1: [[655.0]]), s0(p0: [[656.0], [657.0], [658.0]], p1: [[659.0]]), s0(p0: [[660.0], [661.0], [662.0]], p1: [[663.0]])]), s2(p0: s1(p0: [[s0(p0: [[664.0], [665.0], [666.0]], p1: [[667.0]])]], p1: [s0(p0: [[668.0], [669.0], [670.0]], p1: [[671.0]])]), p1: [s0(p0: [[672.0], [673.0], [674.0]], p1: [[675.0]]), s0(p0: [[676.0], [677.0], [678.0]], p1: [[679.0]]), s0(p0: [[680.0], [681.0], [682.0]], p1: [[683.0]])])], p1: s1(p0: [[s0(p0: [[684.0], [685.0], [686.0]], p1: [[687.0]])]], p1: [s0(p0: [[688.0], [689.0], [690.0]], p1: [[691.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[692.0], [693.0], [694.0]], p1: [[695.0]])]], p1: [s0(p0: [[696.0], [697.0], [698.0]], p1: [[699.0]])]), p1: [s0(p0: [[700.0], [701.0], [702.0]], p1: [[703.0]]), s0(p0: [[704.0], [705.0], [706.0]], p1: [[707.0]]), s0(p0: [[708.0], [709.0], [710.0]], p1: [[711.0]])]), s2(p0: s1(p0: [[s0(p0: [[712.0], [713.0], [714.0]], p1: [[715.0]])]], p1: [s0(p0: [[716.0], [717.0], [718.0]], p1: [[719.0]])]), p1: [s0(p0: [[720.0], [721.0], [722.0]], p1: [[723.0]]), s0(p0: [[724.0], [725.0], [726.0]], p1: [[727.0]]), s0(p0: [[728.0], [729.0], [730.0]], p1: [[731.0]])])], p1: s1(p0: [[s0(p0: [[732.0], [733.0], [734.0]], p1: [[735.0]])]], p1: [s0(p0: [[736.0], [737.0], [738.0]], p1: [[739.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[740.0], [741.0], [742.0]], p1: [[743.0]])]], p1: [s0(p0: [[744.0], [745.0], [746.0]], p1: [[747.0]])]), p1: [s0(p0: [[748.0], [749.0], [750.0]], p1: [[751.0]]), s0(p0: [[752.0], [753.0], [754.0]], p1: [[755.0]]), s0(p0: [[756.0], [757.0], [758.0]], p1: [[759.0]])]), s2(p0: s1(p0: [[s0(p0: [[760.0], [761.0], [762.0]], p1: [[763.0]])]], p1: [s0(p0: [[764.0], [765.0], [766.0]], p1: [[767.0]])]), p1: [s0(p0: [[768.0], [769.0], [770.0]], p1: [[771.0]]), s0(p0: [[772.0], [773.0], [774.0]], p1: [[775.0]]), s0(p0: [[776.0], [777.0], [778.0]], p1: [[779.0]])])], p1: s1(p0: [[s0(p0: [[780.0], [781.0], [782.0]], p1: [[783.0]])]], p1: [s0(p0: [[784.0], [785.0], [786.0]], p1: [[787.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[788.0], [789.0], [790.0]], p1: [[791.0]])]], p1: [s0(p0: [[792.0], [793.0], [794.0]], p1: [[795.0]])])], [s1(p0: [[s0(p0: [[796.0], [797.0], [798.0]], p1: [[799.0]])]], p1: [s0(p0: [[800.0], [801.0], [802.0]], p1: [[803.0]])])]], p1: 804.0))], [s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[805.0], [806.0], [807.0]], p1: [[808.0]])]], p1: [s0(p0: [[809.0], [810.0], [811.0]], p1: [[812.0]])]), p1: [s0(p0: [[813.0], [814.0], [815.0]], p1: [[816.0]]), s0(p0: [[817.0], [818.0], [819.0]], p1: [[820.0]]), s0(p0: [[821.0], [822.0], [823.0]], p1: [[824.0]])]), s2(p0: s1(p0: [[s0(p0: [[825.0], [826.0], [827.0]], p1: [[828.0]])]], p1: [s0(p0: [[829.0], [830.0], [831.0]], p1: [[832.0]])]), p1: [s0(p0: [[833.0], [834.0], [835.0]], p1: [[836.0]]), s0(p0: [[837.0], [838.0], [839.0]], p1: [[840.0]]), s0(p0: [[841.0], [842.0], [843.0]], p1: [[844.0]])])], p1: s1(p0: [[s0(p0: [[845.0], [846.0], [847.0]], p1: [[848.0]])]], p1: [s0(p0: [[849.0], [850.0], [851.0]], p1: [[852.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[853.0], [854.0], [855.0]], p1: [[856.0]])]], p1: [s0(p0: [[857.0], [858.0], [859.0]], p1: [[860.0]])]), p1: [s0(p0: [[861.0], [862.0], [863.0]], p1: [[864.0]]), s0(p0: [[865.0], [866.0], [867.0]], p1: [[868.0]]), s0(p0: [[869.0], [870.0], [871.0]], p1: [[872.0]])]), s2(p0: s1(p0: [[s0(p0: [[873.0], [874.0], [875.0]], p1: [[876.0]])]], p1: [s0(p0: [[877.0], [878.0], [879.0]], p1: [[880.0]])]), p1: [s0(p0: [[881.0], [882.0], [883.0]], p1: [[884.0]]), s0(p0: [[885.0], [886.0], [887.0]], p1: [[888.0]]), s0(p0: [[889.0], [890.0], [891.0]], p1: [[892.0]])])], p1: s1(p0: [[s0(p0: [[893.0], [894.0], [895.0]], p1: [[896.0]])]], p1: [s0(p0: [[897.0], [898.0], [899.0]], p1: [[900.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[901.0], [902.0], [903.0]], p1: [[904.0]])]], p1: [s0(p0: [[905.0], [906.0], [907.0]], p1: [[908.0]])]), p1: [s0(p0: [[909.0], [910.0], [911.0]], p1: [[912.0]]), s0(p0: [[913.0], [914.0], [915.0]], p1: [[916.0]]), s0(p0: [[917.0], [918.0], [919.0]], p1: [[920.0]])]), s2(p0: s1(p0: [[s0(p0: [[921.0], [922.0], [923.0]], p1: [[924.0]])]], p1: [s0(p0: [[925.0], [926.0], [927.0]], p1: [[928.0]])]), p1: [s0(p0: [[929.0], [930.0], [931.0]], p1: [[932.0]]), s0(p0: [[933.0], [934.0], [935.0]], p1: [[936.0]]), s0(p0: [[937.0], [938.0], [939.0]], p1: [[940.0]])])], p1: s1(p0: [[s0(p0: [[941.0], [942.0], [943.0]], p1: [[944.0]])]], p1: [s0(p0: [[945.0], [946.0], [947.0]], p1: [[948.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[949.0], [950.0], [951.0]], p1: [[952.0]])]], p1: [s0(p0: [[953.0], [954.0], [955.0]], p1: [[956.0]])])], [s1(p0: [[s0(p0: [[957.0], [958.0], [959.0]], p1: [[960.0]])]], p1: [s0(p0: [[961.0], [962.0], [963.0]], p1: [[964.0]])])]], p1: 965.0))]])]
    let v1: [[s7]] = [[s7(p0: [s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[966.0], [967.0], [968.0]], p1: [[969.0]])]], p1: [s0(p0: [[970.0], [971.0], [972.0]], p1: [[973.0]])]), p1: [s0(p0: [[974.0], [975.0], [976.0]], p1: [[977.0]]), s0(p0: [[978.0], [979.0], [980.0]], p1: [[981.0]]), s0(p0: [[982.0], [983.0], [984.0]], p1: [[985.0]])]), s2(p0: s1(p0: [[s0(p0: [[986.0], [987.0], [988.0]], p1: [[989.0]])]], p1: [s0(p0: [[990.0], [991.0], [992.0]], p1: [[993.0]])]), p1: [s0(p0: [[994.0], [995.0], [996.0]], p1: [[997.0]]), s0(p0: [[998.0], [999.0], [1000.0]], p1: [[1001.0]]), s0(p0: [[1002.0], [1003.0], [1004.0]], p1: [[1005.0]])])], p1: s1(p0: [[s0(p0: [[1006.0], [1007.0], [1008.0]], p1: [[1009.0]])]], p1: [s0(p0: [[1010.0], [1011.0], [1012.0]], p1: [[1013.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1014.0], [1015.0], [1016.0]], p1: [[1017.0]])]], p1: [s0(p0: [[1018.0], [1019.0], [1020.0]], p1: [[1021.0]])]), p1: [s0(p0: [[1022.0], [1023.0], [1024.0]], p1: [[1025.0]]), s0(p0: [[1026.0], [1027.0], [1028.0]], p1: [[1029.0]]), s0(p0: [[1030.0], [1031.0], [1032.0]], p1: [[1033.0]])]), s2(p0: s1(p0: [[s0(p0: [[1034.0], [1035.0], [1036.0]], p1: [[1037.0]])]], p1: [s0(p0: [[1038.0], [1039.0], [1040.0]], p1: [[1041.0]])]), p1: [s0(p0: [[1042.0], [1043.0], [1044.0]], p1: [[1045.0]]), s0(p0: [[1046.0], [1047.0], [1048.0]], p1: [[1049.0]]), s0(p0: [[1050.0], [1051.0], [1052.0]], p1: [[1053.0]])])], p1: s1(p0: [[s0(p0: [[1054.0], [1055.0], [1056.0]], p1: [[1057.0]])]], p1: [s0(p0: [[1058.0], [1059.0], [1060.0]], p1: [[1061.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1062.0], [1063.0], [1064.0]], p1: [[1065.0]])]], p1: [s0(p0: [[1066.0], [1067.0], [1068.0]], p1: [[1069.0]])]), p1: [s0(p0: [[1070.0], [1071.0], [1072.0]], p1: [[1073.0]]), s0(p0: [[1074.0], [1075.0], [1076.0]], p1: [[1077.0]]), s0(p0: [[1078.0], [1079.0], [1080.0]], p1: [[1081.0]])]), s2(p0: s1(p0: [[s0(p0: [[1082.0], [1083.0], [1084.0]], p1: [[1085.0]])]], p1: [s0(p0: [[1086.0], [1087.0], [1088.0]], p1: [[1089.0]])]), p1: [s0(p0: [[1090.0], [1091.0], [1092.0]], p1: [[1093.0]]), s0(p0: [[1094.0], [1095.0], [1096.0]], p1: [[1097.0]]), s0(p0: [[1098.0], [1099.0], [1100.0]], p1: [[1101.0]])])], p1: s1(p0: [[s0(p0: [[1102.0], [1103.0], [1104.0]], p1: [[1105.0]])]], p1: [s0(p0: [[1106.0], [1107.0], [1108.0]], p1: [[1109.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[1110.0], [1111.0], [1112.0]], p1: [[1113.0]])]], p1: [s0(p0: [[1114.0], [1115.0], [1116.0]], p1: [[1117.0]])])], [s1(p0: [[s0(p0: [[1118.0], [1119.0], [1120.0]], p1: [[1121.0]])]], p1: [s0(p0: [[1122.0], [1123.0], [1124.0]], p1: [[1125.0]])])]], p1: 1126.0))], p1: s6(p0: [[s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1127.0], [1128.0], [1129.0]], p1: [[1130.0]])]], p1: [s0(p0: [[1131.0], [1132.0], [1133.0]], p1: [[1134.0]])]), p1: [s0(p0: [[1135.0], [1136.0], [1137.0]], p1: [[1138.0]]), s0(p0: [[1139.0], [1140.0], [1141.0]], p1: [[1142.0]]), s0(p0: [[1143.0], [1144.0], [1145.0]], p1: [[1146.0]])]), s2(p0: s1(p0: [[s0(p0: [[1147.0], [1148.0], [1149.0]], p1: [[1150.0]])]], p1: [s0(p0: [[1151.0], [1152.0], [1153.0]], p1: [[1154.0]])]), p1: [s0(p0: [[1155.0], [1156.0], [1157.0]], p1: [[1158.0]]), s0(p0: [[1159.0], [1160.0], [1161.0]], p1: [[1162.0]]), s0(p0: [[1163.0], [1164.0], [1165.0]], p1: [[1166.0]])])], p1: s1(p0: [[s0(p0: [[1167.0], [1168.0], [1169.0]], p1: [[1170.0]])]], p1: [s0(p0: [[1171.0], [1172.0], [1173.0]], p1: [[1174.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1175.0], [1176.0], [1177.0]], p1: [[1178.0]])]], p1: [s0(p0: [[1179.0], [1180.0], [1181.0]], p1: [[1182.0]])]), p1: [s0(p0: [[1183.0], [1184.0], [1185.0]], p1: [[1186.0]]), s0(p0: [[1187.0], [1188.0], [1189.0]], p1: [[1190.0]]), s0(p0: [[1191.0], [1192.0], [1193.0]], p1: [[1194.0]])]), s2(p0: s1(p0: [[s0(p0: [[1195.0], [1196.0], [1197.0]], p1: [[1198.0]])]], p1: [s0(p0: [[1199.0], [1200.0], [1201.0]], p1: [[1202.0]])]), p1: [s0(p0: [[1203.0], [1204.0], [1205.0]], p1: [[1206.0]]), s0(p0: [[1207.0], [1208.0], [1209.0]], p1: [[1210.0]]), s0(p0: [[1211.0], [1212.0], [1213.0]], p1: [[1214.0]])])], p1: s1(p0: [[s0(p0: [[1215.0], [1216.0], [1217.0]], p1: [[1218.0]])]], p1: [s0(p0: [[1219.0], [1220.0], [1221.0]], p1: [[1222.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1223.0], [1224.0], [1225.0]], p1: [[1226.0]])]], p1: [s0(p0: [[1227.0], [1228.0], [1229.0]], p1: [[1230.0]])]), p1: [s0(p0: [[1231.0], [1232.0], [1233.0]], p1: [[1234.0]]), s0(p0: [[1235.0], [1236.0], [1237.0]], p1: [[1238.0]]), s0(p0: [[1239.0], [1240.0], [1241.0]], p1: [[1242.0]])]), s2(p0: s1(p0: [[s0(p0: [[1243.0], [1244.0], [1245.0]], p1: [[1246.0]])]], p1: [s0(p0: [[1247.0], [1248.0], [1249.0]], p1: [[1250.0]])]), p1: [s0(p0: [[1251.0], [1252.0], [1253.0]], p1: [[1254.0]]), s0(p0: [[1255.0], [1256.0], [1257.0]], p1: [[1258.0]]), s0(p0: [[1259.0], [1260.0], [1261.0]], p1: [[1262.0]])])], p1: s1(p0: [[s0(p0: [[1263.0], [1264.0], [1265.0]], p1: [[1266.0]])]], p1: [s0(p0: [[1267.0], [1268.0], [1269.0]], p1: [[1270.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[1271.0], [1272.0], [1273.0]], p1: [[1274.0]])]], p1: [s0(p0: [[1275.0], [1276.0], [1277.0]], p1: [[1278.0]])])], [s1(p0: [[s0(p0: [[1279.0], [1280.0], [1281.0]], p1: [[1282.0]])]], p1: [s0(p0: [[1283.0], [1284.0], [1285.0]], p1: [[1286.0]])])]], p1: 1287.0))], [s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1288.0], [1289.0], [1290.0]], p1: [[1291.0]])]], p1: [s0(p0: [[1292.0], [1293.0], [1294.0]], p1: [[1295.0]])]), p1: [s0(p0: [[1296.0], [1297.0], [1298.0]], p1: [[1299.0]]), s0(p0: [[1300.0], [1301.0], [1302.0]], p1: [[1303.0]]), s0(p0: [[1304.0], [1305.0], [1306.0]], p1: [[1307.0]])]), s2(p0: s1(p0: [[s0(p0: [[1308.0], [1309.0], [1310.0]], p1: [[1311.0]])]], p1: [s0(p0: [[1312.0], [1313.0], [1314.0]], p1: [[1315.0]])]), p1: [s0(p0: [[1316.0], [1317.0], [1318.0]], p1: [[1319.0]]), s0(p0: [[1320.0], [1321.0], [1322.0]], p1: [[1323.0]]), s0(p0: [[1324.0], [1325.0], [1326.0]], p1: [[1327.0]])])], p1: s1(p0: [[s0(p0: [[1328.0], [1329.0], [1330.0]], p1: [[1331.0]])]], p1: [s0(p0: [[1332.0], [1333.0], [1334.0]], p1: [[1335.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1336.0], [1337.0], [1338.0]], p1: [[1339.0]])]], p1: [s0(p0: [[1340.0], [1341.0], [1342.0]], p1: [[1343.0]])]), p1: [s0(p0: [[1344.0], [1345.0], [1346.0]], p1: [[1347.0]]), s0(p0: [[1348.0], [1349.0], [1350.0]], p1: [[1351.0]]), s0(p0: [[1352.0], [1353.0], [1354.0]], p1: [[1355.0]])]), s2(p0: s1(p0: [[s0(p0: [[1356.0], [1357.0], [1358.0]], p1: [[1359.0]])]], p1: [s0(p0: [[1360.0], [1361.0], [1362.0]], p1: [[1363.0]])]), p1: [s0(p0: [[1364.0], [1365.0], [1366.0]], p1: [[1367.0]]), s0(p0: [[1368.0], [1369.0], [1370.0]], p1: [[1371.0]]), s0(p0: [[1372.0], [1373.0], [1374.0]], p1: [[1375.0]])])], p1: s1(p0: [[s0(p0: [[1376.0], [1377.0], [1378.0]], p1: [[1379.0]])]], p1: [s0(p0: [[1380.0], [1381.0], [1382.0]], p1: [[1383.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1384.0], [1385.0], [1386.0]], p1: [[1387.0]])]], p1: [s0(p0: [[1388.0], [1389.0], [1390.0]], p1: [[1391.0]])]), p1: [s0(p0: [[1392.0], [1393.0], [1394.0]], p1: [[1395.0]]), s0(p0: [[1396.0], [1397.0], [1398.0]], p1: [[1399.0]]), s0(p0: [[1400.0], [1401.0], [1402.0]], p1: [[1403.0]])]), s2(p0: s1(p0: [[s0(p0: [[1404.0], [1405.0], [1406.0]], p1: [[1407.0]])]], p1: [s0(p0: [[1408.0], [1409.0], [1410.0]], p1: [[1411.0]])]), p1: [s0(p0: [[1412.0], [1413.0], [1414.0]], p1: [[1415.0]]), s0(p0: [[1416.0], [1417.0], [1418.0]], p1: [[1419.0]]), s0(p0: [[1420.0], [1421.0], [1422.0]], p1: [[1423.0]])])], p1: s1(p0: [[s0(p0: [[1424.0], [1425.0], [1426.0]], p1: [[1427.0]])]], p1: [s0(p0: [[1428.0], [1429.0], [1430.0]], p1: [[1431.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[1432.0], [1433.0], [1434.0]], p1: [[1435.0]])]], p1: [s0(p0: [[1436.0], [1437.0], [1438.0]], p1: [[1439.0]])])], [s1(p0: [[s0(p0: [[1440.0], [1441.0], [1442.0]], p1: [[1443.0]])]], p1: [s0(p0: [[1444.0], [1445.0], [1446.0]], p1: [[1447.0]])])]], p1: 1448.0))]]))], [s7(p0: [s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1449.0], [1450.0], [1451.0]], p1: [[1452.0]])]], p1: [s0(p0: [[1453.0], [1454.0], [1455.0]], p1: [[1456.0]])]), p1: [s0(p0: [[1457.0], [1458.0], [1459.0]], p1: [[1460.0]]), s0(p0: [[1461.0], [1462.0], [1463.0]], p1: [[1464.0]]), s0(p0: [[1465.0], [1466.0], [1467.0]], p1: [[1468.0]])]), s2(p0: s1(p0: [[s0(p0: [[1469.0], [1470.0], [1471.0]], p1: [[1472.0]])]], p1: [s0(p0: [[1473.0], [1474.0], [1475.0]], p1: [[1476.0]])]), p1: [s0(p0: [[1477.0], [1478.0], [1479.0]], p1: [[1480.0]]), s0(p0: [[1481.0], [1482.0], [1483.0]], p1: [[1484.0]]), s0(p0: [[1485.0], [1486.0], [1487.0]], p1: [[1488.0]])])], p1: s1(p0: [[s0(p0: [[1489.0], [1490.0], [1491.0]], p1: [[1492.0]])]], p1: [s0(p0: [[1493.0], [1494.0], [1495.0]], p1: [[1496.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1497.0], [1498.0], [1499.0]], p1: [[1500.0]])]], p1: [s0(p0: [[1501.0], [1502.0], [1503.0]], p1: [[1504.0]])]), p1: [s0(p0: [[1505.0], [1506.0], [1507.0]], p1: [[1508.0]]), s0(p0: [[1509.0], [1510.0], [1511.0]], p1: [[1512.0]]), s0(p0: [[1513.0], [1514.0], [1515.0]], p1: [[1516.0]])]), s2(p0: s1(p0: [[s0(p0: [[1517.0], [1518.0], [1519.0]], p1: [[1520.0]])]], p1: [s0(p0: [[1521.0], [1522.0], [1523.0]], p1: [[1524.0]])]), p1: [s0(p0: [[1525.0], [1526.0], [1527.0]], p1: [[1528.0]]), s0(p0: [[1529.0], [1530.0], [1531.0]], p1: [[1532.0]]), s0(p0: [[1533.0], [1534.0], [1535.0]], p1: [[1536.0]])])], p1: s1(p0: [[s0(p0: [[1537.0], [1538.0], [1539.0]], p1: [[1540.0]])]], p1: [s0(p0: [[1541.0], [1542.0], [1543.0]], p1: [[1544.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1545.0], [1546.0], [1547.0]], p1: [[1548.0]])]], p1: [s0(p0: [[1549.0], [1550.0], [1551.0]], p1: [[1552.0]])]), p1: [s0(p0: [[1553.0], [1554.0], [1555.0]], p1: [[1556.0]]), s0(p0: [[1557.0], [1558.0], [1559.0]], p1: [[1560.0]]), s0(p0: [[1561.0], [1562.0], [1563.0]], p1: [[1564.0]])]), s2(p0: s1(p0: [[s0(p0: [[1565.0], [1566.0], [1567.0]], p1: [[1568.0]])]], p1: [s0(p0: [[1569.0], [1570.0], [1571.0]], p1: [[1572.0]])]), p1: [s0(p0: [[1573.0], [1574.0], [1575.0]], p1: [[1576.0]]), s0(p0: [[1577.0], [1578.0], [1579.0]], p1: [[1580.0]]), s0(p0: [[1581.0], [1582.0], [1583.0]], p1: [[1584.0]])])], p1: s1(p0: [[s0(p0: [[1585.0], [1586.0], [1587.0]], p1: [[1588.0]])]], p1: [s0(p0: [[1589.0], [1590.0], [1591.0]], p1: [[1592.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[1593.0], [1594.0], [1595.0]], p1: [[1596.0]])]], p1: [s0(p0: [[1597.0], [1598.0], [1599.0]], p1: [[1600.0]])])], [s1(p0: [[s0(p0: [[1601.0], [1602.0], [1603.0]], p1: [[1604.0]])]], p1: [s0(p0: [[1605.0], [1606.0], [1607.0]], p1: [[1608.0]])])]], p1: 1609.0))], p1: s6(p0: [[s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1610.0], [1611.0], [1612.0]], p1: [[1613.0]])]], p1: [s0(p0: [[1614.0], [1615.0], [1616.0]], p1: [[1617.0]])]), p1: [s0(p0: [[1618.0], [1619.0], [1620.0]], p1: [[1621.0]]), s0(p0: [[1622.0], [1623.0], [1624.0]], p1: [[1625.0]]), s0(p0: [[1626.0], [1627.0], [1628.0]], p1: [[1629.0]])]), s2(p0: s1(p0: [[s0(p0: [[1630.0], [1631.0], [1632.0]], p1: [[1633.0]])]], p1: [s0(p0: [[1634.0], [1635.0], [1636.0]], p1: [[1637.0]])]), p1: [s0(p0: [[1638.0], [1639.0], [1640.0]], p1: [[1641.0]]), s0(p0: [[1642.0], [1643.0], [1644.0]], p1: [[1645.0]]), s0(p0: [[1646.0], [1647.0], [1648.0]], p1: [[1649.0]])])], p1: s1(p0: [[s0(p0: [[1650.0], [1651.0], [1652.0]], p1: [[1653.0]])]], p1: [s0(p0: [[1654.0], [1655.0], [1656.0]], p1: [[1657.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1658.0], [1659.0], [1660.0]], p1: [[1661.0]])]], p1: [s0(p0: [[1662.0], [1663.0], [1664.0]], p1: [[1665.0]])]), p1: [s0(p0: [[1666.0], [1667.0], [1668.0]], p1: [[1669.0]]), s0(p0: [[1670.0], [1671.0], [1672.0]], p1: [[1673.0]]), s0(p0: [[1674.0], [1675.0], [1676.0]], p1: [[1677.0]])]), s2(p0: s1(p0: [[s0(p0: [[1678.0], [1679.0], [1680.0]], p1: [[1681.0]])]], p1: [s0(p0: [[1682.0], [1683.0], [1684.0]], p1: [[1685.0]])]), p1: [s0(p0: [[1686.0], [1687.0], [1688.0]], p1: [[1689.0]]), s0(p0: [[1690.0], [1691.0], [1692.0]], p1: [[1693.0]]), s0(p0: [[1694.0], [1695.0], [1696.0]], p1: [[1697.0]])])], p1: s1(p0: [[s0(p0: [[1698.0], [1699.0], [1700.0]], p1: [[1701.0]])]], p1: [s0(p0: [[1702.0], [1703.0], [1704.0]], p1: [[1705.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1706.0], [1707.0], [1708.0]], p1: [[1709.0]])]], p1: [s0(p0: [[1710.0], [1711.0], [1712.0]], p1: [[1713.0]])]), p1: [s0(p0: [[1714.0], [1715.0], [1716.0]], p1: [[1717.0]]), s0(p0: [[1718.0], [1719.0], [1720.0]], p1: [[1721.0]]), s0(p0: [[1722.0], [1723.0], [1724.0]], p1: [[1725.0]])]), s2(p0: s1(p0: [[s0(p0: [[1726.0], [1727.0], [1728.0]], p1: [[1729.0]])]], p1: [s0(p0: [[1730.0], [1731.0], [1732.0]], p1: [[1733.0]])]), p1: [s0(p0: [[1734.0], [1735.0], [1736.0]], p1: [[1737.0]]), s0(p0: [[1738.0], [1739.0], [1740.0]], p1: [[1741.0]]), s0(p0: [[1742.0], [1743.0], [1744.0]], p1: [[1745.0]])])], p1: s1(p0: [[s0(p0: [[1746.0], [1747.0], [1748.0]], p1: [[1749.0]])]], p1: [s0(p0: [[1750.0], [1751.0], [1752.0]], p1: [[1753.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[1754.0], [1755.0], [1756.0]], p1: [[1757.0]])]], p1: [s0(p0: [[1758.0], [1759.0], [1760.0]], p1: [[1761.0]])])], [s1(p0: [[s0(p0: [[1762.0], [1763.0], [1764.0]], p1: [[1765.0]])]], p1: [s0(p0: [[1766.0], [1767.0], [1768.0]], p1: [[1769.0]])])]], p1: 1770.0))], [s5(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1771.0], [1772.0], [1773.0]], p1: [[1774.0]])]], p1: [s0(p0: [[1775.0], [1776.0], [1777.0]], p1: [[1778.0]])]), p1: [s0(p0: [[1779.0], [1780.0], [1781.0]], p1: [[1782.0]]), s0(p0: [[1783.0], [1784.0], [1785.0]], p1: [[1786.0]]), s0(p0: [[1787.0], [1788.0], [1789.0]], p1: [[1790.0]])]), s2(p0: s1(p0: [[s0(p0: [[1791.0], [1792.0], [1793.0]], p1: [[1794.0]])]], p1: [s0(p0: [[1795.0], [1796.0], [1797.0]], p1: [[1798.0]])]), p1: [s0(p0: [[1799.0], [1800.0], [1801.0]], p1: [[1802.0]]), s0(p0: [[1803.0], [1804.0], [1805.0]], p1: [[1806.0]]), s0(p0: [[1807.0], [1808.0], [1809.0]], p1: [[1810.0]])])], p1: s1(p0: [[s0(p0: [[1811.0], [1812.0], [1813.0]], p1: [[1814.0]])]], p1: [s0(p0: [[1815.0], [1816.0], [1817.0]], p1: [[1818.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1819.0], [1820.0], [1821.0]], p1: [[1822.0]])]], p1: [s0(p0: [[1823.0], [1824.0], [1825.0]], p1: [[1826.0]])]), p1: [s0(p0: [[1827.0], [1828.0], [1829.0]], p1: [[1830.0]]), s0(p0: [[1831.0], [1832.0], [1833.0]], p1: [[1834.0]]), s0(p0: [[1835.0], [1836.0], [1837.0]], p1: [[1838.0]])]), s2(p0: s1(p0: [[s0(p0: [[1839.0], [1840.0], [1841.0]], p1: [[1842.0]])]], p1: [s0(p0: [[1843.0], [1844.0], [1845.0]], p1: [[1846.0]])]), p1: [s0(p0: [[1847.0], [1848.0], [1849.0]], p1: [[1850.0]]), s0(p0: [[1851.0], [1852.0], [1853.0]], p1: [[1854.0]]), s0(p0: [[1855.0], [1856.0], [1857.0]], p1: [[1858.0]])])], p1: s1(p0: [[s0(p0: [[1859.0], [1860.0], [1861.0]], p1: [[1862.0]])]], p1: [s0(p0: [[1863.0], [1864.0], [1865.0]], p1: [[1866.0]])])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[1867.0], [1868.0], [1869.0]], p1: [[1870.0]])]], p1: [s0(p0: [[1871.0], [1872.0], [1873.0]], p1: [[1874.0]])]), p1: [s0(p0: [[1875.0], [1876.0], [1877.0]], p1: [[1878.0]]), s0(p0: [[1879.0], [1880.0], [1881.0]], p1: [[1882.0]]), s0(p0: [[1883.0], [1884.0], [1885.0]], p1: [[1886.0]])]), s2(p0: s1(p0: [[s0(p0: [[1887.0], [1888.0], [1889.0]], p1: [[1890.0]])]], p1: [s0(p0: [[1891.0], [1892.0], [1893.0]], p1: [[1894.0]])]), p1: [s0(p0: [[1895.0], [1896.0], [1897.0]], p1: [[1898.0]]), s0(p0: [[1899.0], [1900.0], [1901.0]], p1: [[1902.0]]), s0(p0: [[1903.0], [1904.0], [1905.0]], p1: [[1906.0]])])], p1: s1(p0: [[s0(p0: [[1907.0], [1908.0], [1909.0]], p1: [[1910.0]])]], p1: [s0(p0: [[1911.0], [1912.0], [1913.0]], p1: [[1914.0]])]))], p1: s4(p0: [[s1(p0: [[s0(p0: [[1915.0], [1916.0], [1917.0]], p1: [[1918.0]])]], p1: [s0(p0: [[1919.0], [1920.0], [1921.0]], p1: [[1922.0]])])], [s1(p0: [[s0(p0: [[1923.0], [1924.0], [1925.0]], p1: [[1926.0]])]], p1: [s0(p0: [[1927.0], [1928.0], [1929.0]], p1: [[1930.0]])])]], p1: 1931.0))]]))]]
    let v2: Double = 1932.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 1932.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
