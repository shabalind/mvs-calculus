  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
    var p2: s0
    var p3: s0
    var p4: s0
    var p5: [[s0]]
    var p6: [s0]
    var p7: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[Double]]
  }
  struct s4 {
    var p0: [[s1]]
    var p1: s1
  }
  struct s5 {
    var p0: s4
    var p1: s2
    var p2: [s4]
    var p3: s0
  }
  struct s6 {
    var p0: s4
    var p1: [[s2]]
  }
  struct s7 {
    var p0: [[s6]]
    var p1: [s5]
  }
  func f21(_ v0: s4, _ v1: s0) -> s0 {
    let v7: [s0] = [v1, v1, v1, v1, v1, v1, v1]
    let v3: [[Double]] = v1.p0
    let v6: [[Double]] = v1.p0
    let v2: s0 = v7[6]
    var v5: [[Double]] = v3
    var v9: [[Double]] = v3
    let v4: s0 = v7[1]
    let v17: [[Double]] = v4.p0
    let v11: s0 = s0(p0: v9)
    let v12: [Double] = v6[1]
    let v10: s1 = v0.p1
    let v30: [Double] = v3[0]
    let v24: [Double] = v9[0]
    var v18: [Double] = v24
    var v25: [Double] = v30
    v5[1] = v25
    var v34: s0 = v11
    v34.p0 = v3
    let v46: s0 = v10.p1
    let v27: [[Double]] = v2.p0
    var v36: [s0] = v7
    v34.p0 = v27
    v25 = v12
    let v64: Double = v25[0]
    v36[0] = v2
    v34.p0 = v5
    v34.p0 = v17
    v34 = v2
    v36[0] = v46
    v36[6] = v34
    let v54: [[Double]] = v1.p0
    let v80: Double = v30[0]
    v5[0] = v18
    v34.p0 = v54
    var v40: Double = v80
    v34 = v4
    v40 = v64
    v25[0] = v80
    v25[0] = v64
    v34.p0 = v27
    v25[0] = v40
    v34.p0 = v54
    var v61: [s0] = v36
    let v79: s0 = v61[3]
    v25[0] = v80
    v9[1] = v25
    return v79
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: [s7], _ v2: Double) -> Double {
    let v6: s1 = v0.p1
    let v7: s7 = v1[1]
    let v3: s1 = v0.p1
    let v15: s0 = v6.p1
    let v22: s0 = f21(v0, v15)
    let v13: s0 = f21(v0, v22)
    let v34: [[s6]] = v7.p0
    let v36: [s6] = v34[0]
    let v130: s6 = v36[0]
    let v43: [[s1]] = v0.p0
    var v86: s4 = v0
    let v44: s0 = f21(v86, v13)
    v86.p0 = v43
    let v58: s4 = v130.p0
    let v68: s0 = f21(v58, v44)
    v86.p1 = v3
    v86.p0 = v43
    let v93: [[Double]] = v68.p0
    let v193: [Double] = v93[1]
    let v191: Double = v193[0]
    return v191
  }
  func benchmark() {
    let v0: s4 = s4(p0: [[s1(p0: [[s0(p0: [[0.0], [1.0]])], [s0(p0: [[2.0], [3.0]])]], p1: s0(p0: [[4.0], [5.0]]), p2: s0(p0: [[6.0], [7.0]]), p3: s0(p0: [[8.0], [9.0]]), p4: s0(p0: [[10.0], [11.0]]), p5: [[s0(p0: [[12.0], [13.0]])]], p6: [s0(p0: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]])], p7: s0(p0: [[18.0], [19.0]]))], [s1(p0: [[s0(p0: [[20.0], [21.0]])], [s0(p0: [[22.0], [23.0]])]], p1: s0(p0: [[24.0], [25.0]]), p2: s0(p0: [[26.0], [27.0]]), p3: s0(p0: [[28.0], [29.0]]), p4: s0(p0: [[30.0], [31.0]]), p5: [[s0(p0: [[32.0], [33.0]])]], p6: [s0(p0: [[34.0], [35.0]]), s0(p0: [[36.0], [37.0]])], p7: s0(p0: [[38.0], [39.0]]))]], p1: s1(p0: [[s0(p0: [[40.0], [41.0]])], [s0(p0: [[42.0], [43.0]])]], p1: s0(p0: [[44.0], [45.0]]), p2: s0(p0: [[46.0], [47.0]]), p3: s0(p0: [[48.0], [49.0]]), p4: s0(p0: [[50.0], [51.0]]), p5: [[s0(p0: [[52.0], [53.0]])]], p6: [s0(p0: [[54.0], [55.0]]), s0(p0: [[56.0], [57.0]])], p7: s0(p0: [[58.0], [59.0]])))
    let v1: [s7] = [s7(p0: [[s6(p0: s4(p0: [[s1(p0: [[s0(p0: [[60.0], [61.0]])], [s0(p0: [[62.0], [63.0]])]], p1: s0(p0: [[64.0], [65.0]]), p2: s0(p0: [[66.0], [67.0]]), p3: s0(p0: [[68.0], [69.0]]), p4: s0(p0: [[70.0], [71.0]]), p5: [[s0(p0: [[72.0], [73.0]])]], p6: [s0(p0: [[74.0], [75.0]]), s0(p0: [[76.0], [77.0]])], p7: s0(p0: [[78.0], [79.0]]))], [s1(p0: [[s0(p0: [[80.0], [81.0]])], [s0(p0: [[82.0], [83.0]])]], p1: s0(p0: [[84.0], [85.0]]), p2: s0(p0: [[86.0], [87.0]]), p3: s0(p0: [[88.0], [89.0]]), p4: s0(p0: [[90.0], [91.0]]), p5: [[s0(p0: [[92.0], [93.0]])]], p6: [s0(p0: [[94.0], [95.0]]), s0(p0: [[96.0], [97.0]])], p7: s0(p0: [[98.0], [99.0]]))]], p1: s1(p0: [[s0(p0: [[100.0], [101.0]])], [s0(p0: [[102.0], [103.0]])]], p1: s0(p0: [[104.0], [105.0]]), p2: s0(p0: [[106.0], [107.0]]), p3: s0(p0: [[108.0], [109.0]]), p4: s0(p0: [[110.0], [111.0]]), p5: [[s0(p0: [[112.0], [113.0]])]], p6: [s0(p0: [[114.0], [115.0]]), s0(p0: [[116.0], [117.0]])], p7: s0(p0: [[118.0], [119.0]]))), p1: [[s2(p0: s1(p0: [[s0(p0: [[120.0], [121.0]])], [s0(p0: [[122.0], [123.0]])]], p1: s0(p0: [[124.0], [125.0]]), p2: s0(p0: [[126.0], [127.0]]), p3: s0(p0: [[128.0], [129.0]]), p4: s0(p0: [[130.0], [131.0]]), p5: [[s0(p0: [[132.0], [133.0]])]], p6: [s0(p0: [[134.0], [135.0]]), s0(p0: [[136.0], [137.0]])], p7: s0(p0: [[138.0], [139.0]])), p1: [[140.0]])], [s2(p0: s1(p0: [[s0(p0: [[141.0], [142.0]])], [s0(p0: [[143.0], [144.0]])]], p1: s0(p0: [[145.0], [146.0]]), p2: s0(p0: [[147.0], [148.0]]), p3: s0(p0: [[149.0], [150.0]]), p4: s0(p0: [[151.0], [152.0]]), p5: [[s0(p0: [[153.0], [154.0]])]], p6: [s0(p0: [[155.0], [156.0]]), s0(p0: [[157.0], [158.0]])], p7: s0(p0: [[159.0], [160.0]])), p1: [[161.0]])], [s2(p0: s1(p0: [[s0(p0: [[162.0], [163.0]])], [s0(p0: [[164.0], [165.0]])]], p1: s0(p0: [[166.0], [167.0]]), p2: s0(p0: [[168.0], [169.0]]), p3: s0(p0: [[170.0], [171.0]]), p4: s0(p0: [[172.0], [173.0]]), p5: [[s0(p0: [[174.0], [175.0]])]], p6: [s0(p0: [[176.0], [177.0]]), s0(p0: [[178.0], [179.0]])], p7: s0(p0: [[180.0], [181.0]])), p1: [[182.0]])]])]], p1: [s5(p0: s4(p0: [[s1(p0: [[s0(p0: [[183.0], [184.0]])], [s0(p0: [[185.0], [186.0]])]], p1: s0(p0: [[187.0], [188.0]]), p2: s0(p0: [[189.0], [190.0]]), p3: s0(p0: [[191.0], [192.0]]), p4: s0(p0: [[193.0], [194.0]]), p5: [[s0(p0: [[195.0], [196.0]])]], p6: [s0(p0: [[197.0], [198.0]]), s0(p0: [[199.0], [200.0]])], p7: s0(p0: [[201.0], [202.0]]))], [s1(p0: [[s0(p0: [[203.0], [204.0]])], [s0(p0: [[205.0], [206.0]])]], p1: s0(p0: [[207.0], [208.0]]), p2: s0(p0: [[209.0], [210.0]]), p3: s0(p0: [[211.0], [212.0]]), p4: s0(p0: [[213.0], [214.0]]), p5: [[s0(p0: [[215.0], [216.0]])]], p6: [s0(p0: [[217.0], [218.0]]), s0(p0: [[219.0], [220.0]])], p7: s0(p0: [[221.0], [222.0]]))]], p1: s1(p0: [[s0(p0: [[223.0], [224.0]])], [s0(p0: [[225.0], [226.0]])]], p1: s0(p0: [[227.0], [228.0]]), p2: s0(p0: [[229.0], [230.0]]), p3: s0(p0: [[231.0], [232.0]]), p4: s0(p0: [[233.0], [234.0]]), p5: [[s0(p0: [[235.0], [236.0]])]], p6: [s0(p0: [[237.0], [238.0]]), s0(p0: [[239.0], [240.0]])], p7: s0(p0: [[241.0], [242.0]]))), p1: s2(p0: s1(p0: [[s0(p0: [[243.0], [244.0]])], [s0(p0: [[245.0], [246.0]])]], p1: s0(p0: [[247.0], [248.0]]), p2: s0(p0: [[249.0], [250.0]]), p3: s0(p0: [[251.0], [252.0]]), p4: s0(p0: [[253.0], [254.0]]), p5: [[s0(p0: [[255.0], [256.0]])]], p6: [s0(p0: [[257.0], [258.0]]), s0(p0: [[259.0], [260.0]])], p7: s0(p0: [[261.0], [262.0]])), p1: [[263.0]]), p2: [s4(p0: [[s1(p0: [[s0(p0: [[264.0], [265.0]])], [s0(p0: [[266.0], [267.0]])]], p1: s0(p0: [[268.0], [269.0]]), p2: s0(p0: [[270.0], [271.0]]), p3: s0(p0: [[272.0], [273.0]]), p4: s0(p0: [[274.0], [275.0]]), p5: [[s0(p0: [[276.0], [277.0]])]], p6: [s0(p0: [[278.0], [279.0]]), s0(p0: [[280.0], [281.0]])], p7: s0(p0: [[282.0], [283.0]]))], [s1(p0: [[s0(p0: [[284.0], [285.0]])], [s0(p0: [[286.0], [287.0]])]], p1: s0(p0: [[288.0], [289.0]]), p2: s0(p0: [[290.0], [291.0]]), p3: s0(p0: [[292.0], [293.0]]), p4: s0(p0: [[294.0], [295.0]]), p5: [[s0(p0: [[296.0], [297.0]])]], p6: [s0(p0: [[298.0], [299.0]]), s0(p0: [[300.0], [301.0]])], p7: s0(p0: [[302.0], [303.0]]))]], p1: s1(p0: [[s0(p0: [[304.0], [305.0]])], [s0(p0: [[306.0], [307.0]])]], p1: s0(p0: [[308.0], [309.0]]), p2: s0(p0: [[310.0], [311.0]]), p3: s0(p0: [[312.0], [313.0]]), p4: s0(p0: [[314.0], [315.0]]), p5: [[s0(p0: [[316.0], [317.0]])]], p6: [s0(p0: [[318.0], [319.0]]), s0(p0: [[320.0], [321.0]])], p7: s0(p0: [[322.0], [323.0]]))), s4(p0: [[s1(p0: [[s0(p0: [[324.0], [325.0]])], [s0(p0: [[326.0], [327.0]])]], p1: s0(p0: [[328.0], [329.0]]), p2: s0(p0: [[330.0], [331.0]]), p3: s0(p0: [[332.0], [333.0]]), p4: s0(p0: [[334.0], [335.0]]), p5: [[s0(p0: [[336.0], [337.0]])]], p6: [s0(p0: [[338.0], [339.0]]), s0(p0: [[340.0], [341.0]])], p7: s0(p0: [[342.0], [343.0]]))], [s1(p0: [[s0(p0: [[344.0], [345.0]])], [s0(p0: [[346.0], [347.0]])]], p1: s0(p0: [[348.0], [349.0]]), p2: s0(p0: [[350.0], [351.0]]), p3: s0(p0: [[352.0], [353.0]]), p4: s0(p0: [[354.0], [355.0]]), p5: [[s0(p0: [[356.0], [357.0]])]], p6: [s0(p0: [[358.0], [359.0]]), s0(p0: [[360.0], [361.0]])], p7: s0(p0: [[362.0], [363.0]]))]], p1: s1(p0: [[s0(p0: [[364.0], [365.0]])], [s0(p0: [[366.0], [367.0]])]], p1: s0(p0: [[368.0], [369.0]]), p2: s0(p0: [[370.0], [371.0]]), p3: s0(p0: [[372.0], [373.0]]), p4: s0(p0: [[374.0], [375.0]]), p5: [[s0(p0: [[376.0], [377.0]])]], p6: [s0(p0: [[378.0], [379.0]]), s0(p0: [[380.0], [381.0]])], p7: s0(p0: [[382.0], [383.0]])))], p3: s0(p0: [[384.0], [385.0]]))]), s7(p0: [[s6(p0: s4(p0: [[s1(p0: [[s0(p0: [[386.0], [387.0]])], [s0(p0: [[388.0], [389.0]])]], p1: s0(p0: [[390.0], [391.0]]), p2: s0(p0: [[392.0], [393.0]]), p3: s0(p0: [[394.0], [395.0]]), p4: s0(p0: [[396.0], [397.0]]), p5: [[s0(p0: [[398.0], [399.0]])]], p6: [s0(p0: [[400.0], [401.0]]), s0(p0: [[402.0], [403.0]])], p7: s0(p0: [[404.0], [405.0]]))], [s1(p0: [[s0(p0: [[406.0], [407.0]])], [s0(p0: [[408.0], [409.0]])]], p1: s0(p0: [[410.0], [411.0]]), p2: s0(p0: [[412.0], [413.0]]), p3: s0(p0: [[414.0], [415.0]]), p4: s0(p0: [[416.0], [417.0]]), p5: [[s0(p0: [[418.0], [419.0]])]], p6: [s0(p0: [[420.0], [421.0]]), s0(p0: [[422.0], [423.0]])], p7: s0(p0: [[424.0], [425.0]]))]], p1: s1(p0: [[s0(p0: [[426.0], [427.0]])], [s0(p0: [[428.0], [429.0]])]], p1: s0(p0: [[430.0], [431.0]]), p2: s0(p0: [[432.0], [433.0]]), p3: s0(p0: [[434.0], [435.0]]), p4: s0(p0: [[436.0], [437.0]]), p5: [[s0(p0: [[438.0], [439.0]])]], p6: [s0(p0: [[440.0], [441.0]]), s0(p0: [[442.0], [443.0]])], p7: s0(p0: [[444.0], [445.0]]))), p1: [[s2(p0: s1(p0: [[s0(p0: [[446.0], [447.0]])], [s0(p0: [[448.0], [449.0]])]], p1: s0(p0: [[450.0], [451.0]]), p2: s0(p0: [[452.0], [453.0]]), p3: s0(p0: [[454.0], [455.0]]), p4: s0(p0: [[456.0], [457.0]]), p5: [[s0(p0: [[458.0], [459.0]])]], p6: [s0(p0: [[460.0], [461.0]]), s0(p0: [[462.0], [463.0]])], p7: s0(p0: [[464.0], [465.0]])), p1: [[466.0]])], [s2(p0: s1(p0: [[s0(p0: [[467.0], [468.0]])], [s0(p0: [[469.0], [470.0]])]], p1: s0(p0: [[471.0], [472.0]]), p2: s0(p0: [[473.0], [474.0]]), p3: s0(p0: [[475.0], [476.0]]), p4: s0(p0: [[477.0], [478.0]]), p5: [[s0(p0: [[479.0], [480.0]])]], p6: [s0(p0: [[481.0], [482.0]]), s0(p0: [[483.0], [484.0]])], p7: s0(p0: [[485.0], [486.0]])), p1: [[487.0]])], [s2(p0: s1(p0: [[s0(p0: [[488.0], [489.0]])], [s0(p0: [[490.0], [491.0]])]], p1: s0(p0: [[492.0], [493.0]]), p2: s0(p0: [[494.0], [495.0]]), p3: s0(p0: [[496.0], [497.0]]), p4: s0(p0: [[498.0], [499.0]]), p5: [[s0(p0: [[500.0], [501.0]])]], p6: [s0(p0: [[502.0], [503.0]]), s0(p0: [[504.0], [505.0]])], p7: s0(p0: [[506.0], [507.0]])), p1: [[508.0]])]])]], p1: [s5(p0: s4(p0: [[s1(p0: [[s0(p0: [[509.0], [510.0]])], [s0(p0: [[511.0], [512.0]])]], p1: s0(p0: [[513.0], [514.0]]), p2: s0(p0: [[515.0], [516.0]]), p3: s0(p0: [[517.0], [518.0]]), p4: s0(p0: [[519.0], [520.0]]), p5: [[s0(p0: [[521.0], [522.0]])]], p6: [s0(p0: [[523.0], [524.0]]), s0(p0: [[525.0], [526.0]])], p7: s0(p0: [[527.0], [528.0]]))], [s1(p0: [[s0(p0: [[529.0], [530.0]])], [s0(p0: [[531.0], [532.0]])]], p1: s0(p0: [[533.0], [534.0]]), p2: s0(p0: [[535.0], [536.0]]), p3: s0(p0: [[537.0], [538.0]]), p4: s0(p0: [[539.0], [540.0]]), p5: [[s0(p0: [[541.0], [542.0]])]], p6: [s0(p0: [[543.0], [544.0]]), s0(p0: [[545.0], [546.0]])], p7: s0(p0: [[547.0], [548.0]]))]], p1: s1(p0: [[s0(p0: [[549.0], [550.0]])], [s0(p0: [[551.0], [552.0]])]], p1: s0(p0: [[553.0], [554.0]]), p2: s0(p0: [[555.0], [556.0]]), p3: s0(p0: [[557.0], [558.0]]), p4: s0(p0: [[559.0], [560.0]]), p5: [[s0(p0: [[561.0], [562.0]])]], p6: [s0(p0: [[563.0], [564.0]]), s0(p0: [[565.0], [566.0]])], p7: s0(p0: [[567.0], [568.0]]))), p1: s2(p0: s1(p0: [[s0(p0: [[569.0], [570.0]])], [s0(p0: [[571.0], [572.0]])]], p1: s0(p0: [[573.0], [574.0]]), p2: s0(p0: [[575.0], [576.0]]), p3: s0(p0: [[577.0], [578.0]]), p4: s0(p0: [[579.0], [580.0]]), p5: [[s0(p0: [[581.0], [582.0]])]], p6: [s0(p0: [[583.0], [584.0]]), s0(p0: [[585.0], [586.0]])], p7: s0(p0: [[587.0], [588.0]])), p1: [[589.0]]), p2: [s4(p0: [[s1(p0: [[s0(p0: [[590.0], [591.0]])], [s0(p0: [[592.0], [593.0]])]], p1: s0(p0: [[594.0], [595.0]]), p2: s0(p0: [[596.0], [597.0]]), p3: s0(p0: [[598.0], [599.0]]), p4: s0(p0: [[600.0], [601.0]]), p5: [[s0(p0: [[602.0], [603.0]])]], p6: [s0(p0: [[604.0], [605.0]]), s0(p0: [[606.0], [607.0]])], p7: s0(p0: [[608.0], [609.0]]))], [s1(p0: [[s0(p0: [[610.0], [611.0]])], [s0(p0: [[612.0], [613.0]])]], p1: s0(p0: [[614.0], [615.0]]), p2: s0(p0: [[616.0], [617.0]]), p3: s0(p0: [[618.0], [619.0]]), p4: s0(p0: [[620.0], [621.0]]), p5: [[s0(p0: [[622.0], [623.0]])]], p6: [s0(p0: [[624.0], [625.0]]), s0(p0: [[626.0], [627.0]])], p7: s0(p0: [[628.0], [629.0]]))]], p1: s1(p0: [[s0(p0: [[630.0], [631.0]])], [s0(p0: [[632.0], [633.0]])]], p1: s0(p0: [[634.0], [635.0]]), p2: s0(p0: [[636.0], [637.0]]), p3: s0(p0: [[638.0], [639.0]]), p4: s0(p0: [[640.0], [641.0]]), p5: [[s0(p0: [[642.0], [643.0]])]], p6: [s0(p0: [[644.0], [645.0]]), s0(p0: [[646.0], [647.0]])], p7: s0(p0: [[648.0], [649.0]]))), s4(p0: [[s1(p0: [[s0(p0: [[650.0], [651.0]])], [s0(p0: [[652.0], [653.0]])]], p1: s0(p0: [[654.0], [655.0]]), p2: s0(p0: [[656.0], [657.0]]), p3: s0(p0: [[658.0], [659.0]]), p4: s0(p0: [[660.0], [661.0]]), p5: [[s0(p0: [[662.0], [663.0]])]], p6: [s0(p0: [[664.0], [665.0]]), s0(p0: [[666.0], [667.0]])], p7: s0(p0: [[668.0], [669.0]]))], [s1(p0: [[s0(p0: [[670.0], [671.0]])], [s0(p0: [[672.0], [673.0]])]], p1: s0(p0: [[674.0], [675.0]]), p2: s0(p0: [[676.0], [677.0]]), p3: s0(p0: [[678.0], [679.0]]), p4: s0(p0: [[680.0], [681.0]]), p5: [[s0(p0: [[682.0], [683.0]])]], p6: [s0(p0: [[684.0], [685.0]]), s0(p0: [[686.0], [687.0]])], p7: s0(p0: [[688.0], [689.0]]))]], p1: s1(p0: [[s0(p0: [[690.0], [691.0]])], [s0(p0: [[692.0], [693.0]])]], p1: s0(p0: [[694.0], [695.0]]), p2: s0(p0: [[696.0], [697.0]]), p3: s0(p0: [[698.0], [699.0]]), p4: s0(p0: [[700.0], [701.0]]), p5: [[s0(p0: [[702.0], [703.0]])]], p6: [s0(p0: [[704.0], [705.0]]), s0(p0: [[706.0], [707.0]])], p7: s0(p0: [[708.0], [709.0]])))], p3: s0(p0: [[710.0], [711.0]]))])]
    let v2: Double = 712.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 712.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
