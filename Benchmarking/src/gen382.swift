  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [[Double]]
    var p6: [[Double]]
    var p7: Double
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  struct s3 {
    var p0: [s1]
    var p1: [[s2]]
  }
  struct s5 {
    var p0: Double
    var p1: s3
  }
  struct s6 {
    var p0: s1
  }
  struct s8 {
    var p0: s5
    var p1: [[s1]]
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: [[s6]], _ v2: Double) -> Double {
    var v3: s8 = v0
    let v11: s5 = v3.p0
    var v5: s5 = v11
    v5.p0 = v2
    let v4: Double = v11.p0
    v3.p0 = v5
    v3.p0 = v11
    let v28: [[s1]] = v0.p1
    v3.p1 = v28
    v3.p1 = v28
    v3.p0 = v5
    v5.p0 = v2
    v3.p0 = v5
    let v42: [Double] = [v4, v4, v2, v4]
    var v87: s5 = v11
    let v97: s3 = v5.p1
    let v65: Double = v42[0]
    v87.p1 = v97
    v5 = v87
    return v65
  }
  func benchmark() {
    let v0: s8 = s8(p0: s5(p0: 0.0, p1: s3(p0: [s1(p0: [[s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0]], p2: [[5.0]], p3: [[6.0]], p4: [[7.0]], p5: [[8.0], [9.0]], p6: [[10.0]], p7: 11.0)]], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]], p2: [[16.0]], p3: [[17.0]], p4: [[18.0]], p5: [[19.0], [20.0]], p6: [[21.0]], p7: 22.0), s0(p0: [[23.0], [24.0], [25.0]], p1: [[26.0]], p2: [[27.0]], p3: [[28.0]], p4: [[29.0]], p5: [[30.0], [31.0]], p6: [[32.0]], p7: 33.0), s0(p0: [[34.0], [35.0], [36.0]], p1: [[37.0]], p2: [[38.0]], p3: [[39.0]], p4: [[40.0]], p5: [[41.0], [42.0]], p6: [[43.0]], p7: 44.0)]), s1(p0: [[s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0]], p2: [[49.0]], p3: [[50.0]], p4: [[51.0]], p5: [[52.0], [53.0]], p6: [[54.0]], p7: 55.0)]], p1: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]], p2: [[60.0]], p3: [[61.0]], p4: [[62.0]], p5: [[63.0], [64.0]], p6: [[65.0]], p7: 66.0), s0(p0: [[67.0], [68.0], [69.0]], p1: [[70.0]], p2: [[71.0]], p3: [[72.0]], p4: [[73.0]], p5: [[74.0], [75.0]], p6: [[76.0]], p7: 77.0), s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0]], p2: [[82.0]], p3: [[83.0]], p4: [[84.0]], p5: [[85.0], [86.0]], p6: [[87.0]], p7: 88.0)]), s1(p0: [[s0(p0: [[89.0], [90.0], [91.0]], p1: [[92.0]], p2: [[93.0]], p3: [[94.0]], p4: [[95.0]], p5: [[96.0], [97.0]], p6: [[98.0]], p7: 99.0)]], p1: [s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]], p2: [[104.0]], p3: [[105.0]], p4: [[106.0]], p5: [[107.0], [108.0]], p6: [[109.0]], p7: 110.0), s0(p0: [[111.0], [112.0], [113.0]], p1: [[114.0]], p2: [[115.0]], p3: [[116.0]], p4: [[117.0]], p5: [[118.0], [119.0]], p6: [[120.0]], p7: 121.0), s0(p0: [[122.0], [123.0], [124.0]], p1: [[125.0]], p2: [[126.0]], p3: [[127.0]], p4: [[128.0]], p5: [[129.0], [130.0]], p6: [[131.0]], p7: 132.0)])], p1: [[s2(p0: [s1(p0: [[s0(p0: [[133.0], [134.0], [135.0]], p1: [[136.0]], p2: [[137.0]], p3: [[138.0]], p4: [[139.0]], p5: [[140.0], [141.0]], p6: [[142.0]], p7: 143.0)]], p1: [s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0]], p2: [[148.0]], p3: [[149.0]], p4: [[150.0]], p5: [[151.0], [152.0]], p6: [[153.0]], p7: 154.0), s0(p0: [[155.0], [156.0], [157.0]], p1: [[158.0]], p2: [[159.0]], p3: [[160.0]], p4: [[161.0]], p5: [[162.0], [163.0]], p6: [[164.0]], p7: 165.0), s0(p0: [[166.0], [167.0], [168.0]], p1: [[169.0]], p2: [[170.0]], p3: [[171.0]], p4: [[172.0]], p5: [[173.0], [174.0]], p6: [[175.0]], p7: 176.0)]), s1(p0: [[s0(p0: [[177.0], [178.0], [179.0]], p1: [[180.0]], p2: [[181.0]], p3: [[182.0]], p4: [[183.0]], p5: [[184.0], [185.0]], p6: [[186.0]], p7: 187.0)]], p1: [s0(p0: [[188.0], [189.0], [190.0]], p1: [[191.0]], p2: [[192.0]], p3: [[193.0]], p4: [[194.0]], p5: [[195.0], [196.0]], p6: [[197.0]], p7: 198.0), s0(p0: [[199.0], [200.0], [201.0]], p1: [[202.0]], p2: [[203.0]], p3: [[204.0]], p4: [[205.0]], p5: [[206.0], [207.0]], p6: [[208.0]], p7: 209.0), s0(p0: [[210.0], [211.0], [212.0]], p1: [[213.0]], p2: [[214.0]], p3: [[215.0]], p4: [[216.0]], p5: [[217.0], [218.0]], p6: [[219.0]], p7: 220.0)])], p1: s1(p0: [[s0(p0: [[221.0], [222.0], [223.0]], p1: [[224.0]], p2: [[225.0]], p3: [[226.0]], p4: [[227.0]], p5: [[228.0], [229.0]], p6: [[230.0]], p7: 231.0)]], p1: [s0(p0: [[232.0], [233.0], [234.0]], p1: [[235.0]], p2: [[236.0]], p3: [[237.0]], p4: [[238.0]], p5: [[239.0], [240.0]], p6: [[241.0]], p7: 242.0), s0(p0: [[243.0], [244.0], [245.0]], p1: [[246.0]], p2: [[247.0]], p3: [[248.0]], p4: [[249.0]], p5: [[250.0], [251.0]], p6: [[252.0]], p7: 253.0), s0(p0: [[254.0], [255.0], [256.0]], p1: [[257.0]], p2: [[258.0]], p3: [[259.0]], p4: [[260.0]], p5: [[261.0], [262.0]], p6: [[263.0]], p7: 264.0)]))], [s2(p0: [s1(p0: [[s0(p0: [[265.0], [266.0], [267.0]], p1: [[268.0]], p2: [[269.0]], p3: [[270.0]], p4: [[271.0]], p5: [[272.0], [273.0]], p6: [[274.0]], p7: 275.0)]], p1: [s0(p0: [[276.0], [277.0], [278.0]], p1: [[279.0]], p2: [[280.0]], p3: [[281.0]], p4: [[282.0]], p5: [[283.0], [284.0]], p6: [[285.0]], p7: 286.0), s0(p0: [[287.0], [288.0], [289.0]], p1: [[290.0]], p2: [[291.0]], p3: [[292.0]], p4: [[293.0]], p5: [[294.0], [295.0]], p6: [[296.0]], p7: 297.0), s0(p0: [[298.0], [299.0], [300.0]], p1: [[301.0]], p2: [[302.0]], p3: [[303.0]], p4: [[304.0]], p5: [[305.0], [306.0]], p6: [[307.0]], p7: 308.0)]), s1(p0: [[s0(p0: [[309.0], [310.0], [311.0]], p1: [[312.0]], p2: [[313.0]], p3: [[314.0]], p4: [[315.0]], p5: [[316.0], [317.0]], p6: [[318.0]], p7: 319.0)]], p1: [s0(p0: [[320.0], [321.0], [322.0]], p1: [[323.0]], p2: [[324.0]], p3: [[325.0]], p4: [[326.0]], p5: [[327.0], [328.0]], p6: [[329.0]], p7: 330.0), s0(p0: [[331.0], [332.0], [333.0]], p1: [[334.0]], p2: [[335.0]], p3: [[336.0]], p4: [[337.0]], p5: [[338.0], [339.0]], p6: [[340.0]], p7: 341.0), s0(p0: [[342.0], [343.0], [344.0]], p1: [[345.0]], p2: [[346.0]], p3: [[347.0]], p4: [[348.0]], p5: [[349.0], [350.0]], p6: [[351.0]], p7: 352.0)])], p1: s1(p0: [[s0(p0: [[353.0], [354.0], [355.0]], p1: [[356.0]], p2: [[357.0]], p3: [[358.0]], p4: [[359.0]], p5: [[360.0], [361.0]], p6: [[362.0]], p7: 363.0)]], p1: [s0(p0: [[364.0], [365.0], [366.0]], p1: [[367.0]], p2: [[368.0]], p3: [[369.0]], p4: [[370.0]], p5: [[371.0], [372.0]], p6: [[373.0]], p7: 374.0), s0(p0: [[375.0], [376.0], [377.0]], p1: [[378.0]], p2: [[379.0]], p3: [[380.0]], p4: [[381.0]], p5: [[382.0], [383.0]], p6: [[384.0]], p7: 385.0), s0(p0: [[386.0], [387.0], [388.0]], p1: [[389.0]], p2: [[390.0]], p3: [[391.0]], p4: [[392.0]], p5: [[393.0], [394.0]], p6: [[395.0]], p7: 396.0)]))], [s2(p0: [s1(p0: [[s0(p0: [[397.0], [398.0], [399.0]], p1: [[400.0]], p2: [[401.0]], p3: [[402.0]], p4: [[403.0]], p5: [[404.0], [405.0]], p6: [[406.0]], p7: 407.0)]], p1: [s0(p0: [[408.0], [409.0], [410.0]], p1: [[411.0]], p2: [[412.0]], p3: [[413.0]], p4: [[414.0]], p5: [[415.0], [416.0]], p6: [[417.0]], p7: 418.0), s0(p0: [[419.0], [420.0], [421.0]], p1: [[422.0]], p2: [[423.0]], p3: [[424.0]], p4: [[425.0]], p5: [[426.0], [427.0]], p6: [[428.0]], p7: 429.0), s0(p0: [[430.0], [431.0], [432.0]], p1: [[433.0]], p2: [[434.0]], p3: [[435.0]], p4: [[436.0]], p5: [[437.0], [438.0]], p6: [[439.0]], p7: 440.0)]), s1(p0: [[s0(p0: [[441.0], [442.0], [443.0]], p1: [[444.0]], p2: [[445.0]], p3: [[446.0]], p4: [[447.0]], p5: [[448.0], [449.0]], p6: [[450.0]], p7: 451.0)]], p1: [s0(p0: [[452.0], [453.0], [454.0]], p1: [[455.0]], p2: [[456.0]], p3: [[457.0]], p4: [[458.0]], p5: [[459.0], [460.0]], p6: [[461.0]], p7: 462.0), s0(p0: [[463.0], [464.0], [465.0]], p1: [[466.0]], p2: [[467.0]], p3: [[468.0]], p4: [[469.0]], p5: [[470.0], [471.0]], p6: [[472.0]], p7: 473.0), s0(p0: [[474.0], [475.0], [476.0]], p1: [[477.0]], p2: [[478.0]], p3: [[479.0]], p4: [[480.0]], p5: [[481.0], [482.0]], p6: [[483.0]], p7: 484.0)])], p1: s1(p0: [[s0(p0: [[485.0], [486.0], [487.0]], p1: [[488.0]], p2: [[489.0]], p3: [[490.0]], p4: [[491.0]], p5: [[492.0], [493.0]], p6: [[494.0]], p7: 495.0)]], p1: [s0(p0: [[496.0], [497.0], [498.0]], p1: [[499.0]], p2: [[500.0]], p3: [[501.0]], p4: [[502.0]], p5: [[503.0], [504.0]], p6: [[505.0]], p7: 506.0), s0(p0: [[507.0], [508.0], [509.0]], p1: [[510.0]], p2: [[511.0]], p3: [[512.0]], p4: [[513.0]], p5: [[514.0], [515.0]], p6: [[516.0]], p7: 517.0), s0(p0: [[518.0], [519.0], [520.0]], p1: [[521.0]], p2: [[522.0]], p3: [[523.0]], p4: [[524.0]], p5: [[525.0], [526.0]], p6: [[527.0]], p7: 528.0)]))]])), p1: [[s1(p0: [[s0(p0: [[529.0], [530.0], [531.0]], p1: [[532.0]], p2: [[533.0]], p3: [[534.0]], p4: [[535.0]], p5: [[536.0], [537.0]], p6: [[538.0]], p7: 539.0)]], p1: [s0(p0: [[540.0], [541.0], [542.0]], p1: [[543.0]], p2: [[544.0]], p3: [[545.0]], p4: [[546.0]], p5: [[547.0], [548.0]], p6: [[549.0]], p7: 550.0), s0(p0: [[551.0], [552.0], [553.0]], p1: [[554.0]], p2: [[555.0]], p3: [[556.0]], p4: [[557.0]], p5: [[558.0], [559.0]], p6: [[560.0]], p7: 561.0), s0(p0: [[562.0], [563.0], [564.0]], p1: [[565.0]], p2: [[566.0]], p3: [[567.0]], p4: [[568.0]], p5: [[569.0], [570.0]], p6: [[571.0]], p7: 572.0)])], [s1(p0: [[s0(p0: [[573.0], [574.0], [575.0]], p1: [[576.0]], p2: [[577.0]], p3: [[578.0]], p4: [[579.0]], p5: [[580.0], [581.0]], p6: [[582.0]], p7: 583.0)]], p1: [s0(p0: [[584.0], [585.0], [586.0]], p1: [[587.0]], p2: [[588.0]], p3: [[589.0]], p4: [[590.0]], p5: [[591.0], [592.0]], p6: [[593.0]], p7: 594.0), s0(p0: [[595.0], [596.0], [597.0]], p1: [[598.0]], p2: [[599.0]], p3: [[600.0]], p4: [[601.0]], p5: [[602.0], [603.0]], p6: [[604.0]], p7: 605.0), s0(p0: [[606.0], [607.0], [608.0]], p1: [[609.0]], p2: [[610.0]], p3: [[611.0]], p4: [[612.0]], p5: [[613.0], [614.0]], p6: [[615.0]], p7: 616.0)])]])
    let v1: [[s6]] = [[s6(p0: s1(p0: [[s0(p0: [[617.0], [618.0], [619.0]], p1: [[620.0]], p2: [[621.0]], p3: [[622.0]], p4: [[623.0]], p5: [[624.0], [625.0]], p6: [[626.0]], p7: 627.0)]], p1: [s0(p0: [[628.0], [629.0], [630.0]], p1: [[631.0]], p2: [[632.0]], p3: [[633.0]], p4: [[634.0]], p5: [[635.0], [636.0]], p6: [[637.0]], p7: 638.0), s0(p0: [[639.0], [640.0], [641.0]], p1: [[642.0]], p2: [[643.0]], p3: [[644.0]], p4: [[645.0]], p5: [[646.0], [647.0]], p6: [[648.0]], p7: 649.0), s0(p0: [[650.0], [651.0], [652.0]], p1: [[653.0]], p2: [[654.0]], p3: [[655.0]], p4: [[656.0]], p5: [[657.0], [658.0]], p6: [[659.0]], p7: 660.0)]))], [s6(p0: s1(p0: [[s0(p0: [[661.0], [662.0], [663.0]], p1: [[664.0]], p2: [[665.0]], p3: [[666.0]], p4: [[667.0]], p5: [[668.0], [669.0]], p6: [[670.0]], p7: 671.0)]], p1: [s0(p0: [[672.0], [673.0], [674.0]], p1: [[675.0]], p2: [[676.0]], p3: [[677.0]], p4: [[678.0]], p5: [[679.0], [680.0]], p6: [[681.0]], p7: 682.0), s0(p0: [[683.0], [684.0], [685.0]], p1: [[686.0]], p2: [[687.0]], p3: [[688.0]], p4: [[689.0]], p5: [[690.0], [691.0]], p6: [[692.0]], p7: 693.0), s0(p0: [[694.0], [695.0], [696.0]], p1: [[697.0]], p2: [[698.0]], p3: [[699.0]], p4: [[700.0]], p5: [[701.0], [702.0]], p6: [[703.0]], p7: 704.0)]))], [s6(p0: s1(p0: [[s0(p0: [[705.0], [706.0], [707.0]], p1: [[708.0]], p2: [[709.0]], p3: [[710.0]], p4: [[711.0]], p5: [[712.0], [713.0]], p6: [[714.0]], p7: 715.0)]], p1: [s0(p0: [[716.0], [717.0], [718.0]], p1: [[719.0]], p2: [[720.0]], p3: [[721.0]], p4: [[722.0]], p5: [[723.0], [724.0]], p6: [[725.0]], p7: 726.0), s0(p0: [[727.0], [728.0], [729.0]], p1: [[730.0]], p2: [[731.0]], p3: [[732.0]], p4: [[733.0]], p5: [[734.0], [735.0]], p6: [[736.0]], p7: 737.0), s0(p0: [[738.0], [739.0], [740.0]], p1: [[741.0]], p2: [[742.0]], p3: [[743.0]], p4: [[744.0]], p5: [[745.0], [746.0]], p6: [[747.0]], p7: 748.0)]))]]
    let v2: Double = 749.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 749.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
