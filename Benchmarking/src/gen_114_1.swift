  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: [s1]
  }
  struct s4 {
    var p0: s1
    var p1: s1
  }
  struct s5 {
    var p0: s3
    var p1: s0
  }
  struct s6 {
    var p0: [s5]
    var p1: s3
    var p2: [[s4]]
    var p3: s0
  }
  struct s7 {
    var p0: [s5]
    var p1: [[s6]]
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v6: [[s6]] = v0.p1
    var v10: [[s6]] = v6
    let v4: [s6] = v10[1]
    let v15: s6 = v4[0]
    var v8: [s6] = v4
    v8[0] = v15
    v10[1] = v8
    let v13: [s6] = v10[0]
    var v14: s7 = v0
    var v20: s6 = v15
    let v43: [s5] = v14.p0
    let v19: s3 = v15.p1
    v20.p1 = v19
    var v38: s6 = v20
    let v28: s0 = v20.p3
    let v30: s5 = v43[0]
    var v34: [s6] = v13
    var v75: s5 = v30
    var v22: s5 = v75
    var v42: s5 = v22
    let v48: [[s4]] = v20.p2
    let v96: s3 = v42.p0
    v34[0] = v38
    var v44: s6 = v38
    v38.p3 = v28
    let v109: [s6] = [v44, v44, v20, v15]
    v42.p1 = v28
    v8[0] = v38
    let v83: s6 = v109[2]
    let v101: s0 = v83.p3
    let v199: [[s4]] = v44.p2
    let v62: s6 = v109[1]
    v38 = v62
    v22.p0 = v19
    v10[1] = v34
    let v139: [Double] = v28.p0
    v22.p1 = v101
    v20.p2 = v199
    v8[0] = v62
    v10[0] = v13
    v20.p2 = v48
    v20.p1 = v96
    let v125: Double = v139[1]
    return v125
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s5(p0: s3(p0: s1(p0: s0(p0: [0.0, 1.0], p1: [[2.0]]), p1: [s0(p0: [3.0, 4.0], p1: [[5.0]]), s0(p0: [6.0, 7.0], p1: [[8.0]]), s0(p0: [9.0, 10.0], p1: [[11.0]])], p2: [s0(p0: [12.0, 13.0], p1: [[14.0]]), s0(p0: [15.0, 16.0], p1: [[17.0]])]), p1: [s1(p0: s0(p0: [18.0, 19.0], p1: [[20.0]]), p1: [s0(p0: [21.0, 22.0], p1: [[23.0]]), s0(p0: [24.0, 25.0], p1: [[26.0]]), s0(p0: [27.0, 28.0], p1: [[29.0]])], p2: [s0(p0: [30.0, 31.0], p1: [[32.0]]), s0(p0: [33.0, 34.0], p1: [[35.0]])]), s1(p0: s0(p0: [36.0, 37.0], p1: [[38.0]]), p1: [s0(p0: [39.0, 40.0], p1: [[41.0]]), s0(p0: [42.0, 43.0], p1: [[44.0]]), s0(p0: [45.0, 46.0], p1: [[47.0]])], p2: [s0(p0: [48.0, 49.0], p1: [[50.0]]), s0(p0: [51.0, 52.0], p1: [[53.0]])])]), p1: s0(p0: [54.0, 55.0], p1: [[56.0]]))], p1: [[s6(p0: [s5(p0: s3(p0: s1(p0: s0(p0: [57.0, 58.0], p1: [[59.0]]), p1: [s0(p0: [60.0, 61.0], p1: [[62.0]]), s0(p0: [63.0, 64.0], p1: [[65.0]]), s0(p0: [66.0, 67.0], p1: [[68.0]])], p2: [s0(p0: [69.0, 70.0], p1: [[71.0]]), s0(p0: [72.0, 73.0], p1: [[74.0]])]), p1: [s1(p0: s0(p0: [75.0, 76.0], p1: [[77.0]]), p1: [s0(p0: [78.0, 79.0], p1: [[80.0]]), s0(p0: [81.0, 82.0], p1: [[83.0]]), s0(p0: [84.0, 85.0], p1: [[86.0]])], p2: [s0(p0: [87.0, 88.0], p1: [[89.0]]), s0(p0: [90.0, 91.0], p1: [[92.0]])]), s1(p0: s0(p0: [93.0, 94.0], p1: [[95.0]]), p1: [s0(p0: [96.0, 97.0], p1: [[98.0]]), s0(p0: [99.0, 100.0], p1: [[101.0]]), s0(p0: [102.0, 103.0], p1: [[104.0]])], p2: [s0(p0: [105.0, 106.0], p1: [[107.0]]), s0(p0: [108.0, 109.0], p1: [[110.0]])])]), p1: s0(p0: [111.0, 112.0], p1: [[113.0]])), s5(p0: s3(p0: s1(p0: s0(p0: [114.0, 115.0], p1: [[116.0]]), p1: [s0(p0: [117.0, 118.0], p1: [[119.0]]), s0(p0: [120.0, 121.0], p1: [[122.0]]), s0(p0: [123.0, 124.0], p1: [[125.0]])], p2: [s0(p0: [126.0, 127.0], p1: [[128.0]]), s0(p0: [129.0, 130.0], p1: [[131.0]])]), p1: [s1(p0: s0(p0: [132.0, 133.0], p1: [[134.0]]), p1: [s0(p0: [135.0, 136.0], p1: [[137.0]]), s0(p0: [138.0, 139.0], p1: [[140.0]]), s0(p0: [141.0, 142.0], p1: [[143.0]])], p2: [s0(p0: [144.0, 145.0], p1: [[146.0]]), s0(p0: [147.0, 148.0], p1: [[149.0]])]), s1(p0: s0(p0: [150.0, 151.0], p1: [[152.0]]), p1: [s0(p0: [153.0, 154.0], p1: [[155.0]]), s0(p0: [156.0, 157.0], p1: [[158.0]]), s0(p0: [159.0, 160.0], p1: [[161.0]])], p2: [s0(p0: [162.0, 163.0], p1: [[164.0]]), s0(p0: [165.0, 166.0], p1: [[167.0]])])]), p1: s0(p0: [168.0, 169.0], p1: [[170.0]])), s5(p0: s3(p0: s1(p0: s0(p0: [171.0, 172.0], p1: [[173.0]]), p1: [s0(p0: [174.0, 175.0], p1: [[176.0]]), s0(p0: [177.0, 178.0], p1: [[179.0]]), s0(p0: [180.0, 181.0], p1: [[182.0]])], p2: [s0(p0: [183.0, 184.0], p1: [[185.0]]), s0(p0: [186.0, 187.0], p1: [[188.0]])]), p1: [s1(p0: s0(p0: [189.0, 190.0], p1: [[191.0]]), p1: [s0(p0: [192.0, 193.0], p1: [[194.0]]), s0(p0: [195.0, 196.0], p1: [[197.0]]), s0(p0: [198.0, 199.0], p1: [[200.0]])], p2: [s0(p0: [201.0, 202.0], p1: [[203.0]]), s0(p0: [204.0, 205.0], p1: [[206.0]])]), s1(p0: s0(p0: [207.0, 208.0], p1: [[209.0]]), p1: [s0(p0: [210.0, 211.0], p1: [[212.0]]), s0(p0: [213.0, 214.0], p1: [[215.0]]), s0(p0: [216.0, 217.0], p1: [[218.0]])], p2: [s0(p0: [219.0, 220.0], p1: [[221.0]]), s0(p0: [222.0, 223.0], p1: [[224.0]])])]), p1: s0(p0: [225.0, 226.0], p1: [[227.0]]))], p1: s3(p0: s1(p0: s0(p0: [228.0, 229.0], p1: [[230.0]]), p1: [s0(p0: [231.0, 232.0], p1: [[233.0]]), s0(p0: [234.0, 235.0], p1: [[236.0]]), s0(p0: [237.0, 238.0], p1: [[239.0]])], p2: [s0(p0: [240.0, 241.0], p1: [[242.0]]), s0(p0: [243.0, 244.0], p1: [[245.0]])]), p1: [s1(p0: s0(p0: [246.0, 247.0], p1: [[248.0]]), p1: [s0(p0: [249.0, 250.0], p1: [[251.0]]), s0(p0: [252.0, 253.0], p1: [[254.0]]), s0(p0: [255.0, 256.0], p1: [[257.0]])], p2: [s0(p0: [258.0, 259.0], p1: [[260.0]]), s0(p0: [261.0, 262.0], p1: [[263.0]])]), s1(p0: s0(p0: [264.0, 265.0], p1: [[266.0]]), p1: [s0(p0: [267.0, 268.0], p1: [[269.0]]), s0(p0: [270.0, 271.0], p1: [[272.0]]), s0(p0: [273.0, 274.0], p1: [[275.0]])], p2: [s0(p0: [276.0, 277.0], p1: [[278.0]]), s0(p0: [279.0, 280.0], p1: [[281.0]])])]), p2: [[s4(p0: s1(p0: s0(p0: [282.0, 283.0], p1: [[284.0]]), p1: [s0(p0: [285.0, 286.0], p1: [[287.0]]), s0(p0: [288.0, 289.0], p1: [[290.0]]), s0(p0: [291.0, 292.0], p1: [[293.0]])], p2: [s0(p0: [294.0, 295.0], p1: [[296.0]]), s0(p0: [297.0, 298.0], p1: [[299.0]])]), p1: s1(p0: s0(p0: [300.0, 301.0], p1: [[302.0]]), p1: [s0(p0: [303.0, 304.0], p1: [[305.0]]), s0(p0: [306.0, 307.0], p1: [[308.0]]), s0(p0: [309.0, 310.0], p1: [[311.0]])], p2: [s0(p0: [312.0, 313.0], p1: [[314.0]]), s0(p0: [315.0, 316.0], p1: [[317.0]])]))], [s4(p0: s1(p0: s0(p0: [318.0, 319.0], p1: [[320.0]]), p1: [s0(p0: [321.0, 322.0], p1: [[323.0]]), s0(p0: [324.0, 325.0], p1: [[326.0]]), s0(p0: [327.0, 328.0], p1: [[329.0]])], p2: [s0(p0: [330.0, 331.0], p1: [[332.0]]), s0(p0: [333.0, 334.0], p1: [[335.0]])]), p1: s1(p0: s0(p0: [336.0, 337.0], p1: [[338.0]]), p1: [s0(p0: [339.0, 340.0], p1: [[341.0]]), s0(p0: [342.0, 343.0], p1: [[344.0]]), s0(p0: [345.0, 346.0], p1: [[347.0]])], p2: [s0(p0: [348.0, 349.0], p1: [[350.0]]), s0(p0: [351.0, 352.0], p1: [[353.0]])]))]], p3: s0(p0: [354.0, 355.0], p1: [[356.0]]))], [s6(p0: [s5(p0: s3(p0: s1(p0: s0(p0: [357.0, 358.0], p1: [[359.0]]), p1: [s0(p0: [360.0, 361.0], p1: [[362.0]]), s0(p0: [363.0, 364.0], p1: [[365.0]]), s0(p0: [366.0, 367.0], p1: [[368.0]])], p2: [s0(p0: [369.0, 370.0], p1: [[371.0]]), s0(p0: [372.0, 373.0], p1: [[374.0]])]), p1: [s1(p0: s0(p0: [375.0, 376.0], p1: [[377.0]]), p1: [s0(p0: [378.0, 379.0], p1: [[380.0]]), s0(p0: [381.0, 382.0], p1: [[383.0]]), s0(p0: [384.0, 385.0], p1: [[386.0]])], p2: [s0(p0: [387.0, 388.0], p1: [[389.0]]), s0(p0: [390.0, 391.0], p1: [[392.0]])]), s1(p0: s0(p0: [393.0, 394.0], p1: [[395.0]]), p1: [s0(p0: [396.0, 397.0], p1: [[398.0]]), s0(p0: [399.0, 400.0], p1: [[401.0]]), s0(p0: [402.0, 403.0], p1: [[404.0]])], p2: [s0(p0: [405.0, 406.0], p1: [[407.0]]), s0(p0: [408.0, 409.0], p1: [[410.0]])])]), p1: s0(p0: [411.0, 412.0], p1: [[413.0]])), s5(p0: s3(p0: s1(p0: s0(p0: [414.0, 415.0], p1: [[416.0]]), p1: [s0(p0: [417.0, 418.0], p1: [[419.0]]), s0(p0: [420.0, 421.0], p1: [[422.0]]), s0(p0: [423.0, 424.0], p1: [[425.0]])], p2: [s0(p0: [426.0, 427.0], p1: [[428.0]]), s0(p0: [429.0, 430.0], p1: [[431.0]])]), p1: [s1(p0: s0(p0: [432.0, 433.0], p1: [[434.0]]), p1: [s0(p0: [435.0, 436.0], p1: [[437.0]]), s0(p0: [438.0, 439.0], p1: [[440.0]]), s0(p0: [441.0, 442.0], p1: [[443.0]])], p2: [s0(p0: [444.0, 445.0], p1: [[446.0]]), s0(p0: [447.0, 448.0], p1: [[449.0]])]), s1(p0: s0(p0: [450.0, 451.0], p1: [[452.0]]), p1: [s0(p0: [453.0, 454.0], p1: [[455.0]]), s0(p0: [456.0, 457.0], p1: [[458.0]]), s0(p0: [459.0, 460.0], p1: [[461.0]])], p2: [s0(p0: [462.0, 463.0], p1: [[464.0]]), s0(p0: [465.0, 466.0], p1: [[467.0]])])]), p1: s0(p0: [468.0, 469.0], p1: [[470.0]])), s5(p0: s3(p0: s1(p0: s0(p0: [471.0, 472.0], p1: [[473.0]]), p1: [s0(p0: [474.0, 475.0], p1: [[476.0]]), s0(p0: [477.0, 478.0], p1: [[479.0]]), s0(p0: [480.0, 481.0], p1: [[482.0]])], p2: [s0(p0: [483.0, 484.0], p1: [[485.0]]), s0(p0: [486.0, 487.0], p1: [[488.0]])]), p1: [s1(p0: s0(p0: [489.0, 490.0], p1: [[491.0]]), p1: [s0(p0: [492.0, 493.0], p1: [[494.0]]), s0(p0: [495.0, 496.0], p1: [[497.0]]), s0(p0: [498.0, 499.0], p1: [[500.0]])], p2: [s0(p0: [501.0, 502.0], p1: [[503.0]]), s0(p0: [504.0, 505.0], p1: [[506.0]])]), s1(p0: s0(p0: [507.0, 508.0], p1: [[509.0]]), p1: [s0(p0: [510.0, 511.0], p1: [[512.0]]), s0(p0: [513.0, 514.0], p1: [[515.0]]), s0(p0: [516.0, 517.0], p1: [[518.0]])], p2: [s0(p0: [519.0, 520.0], p1: [[521.0]]), s0(p0: [522.0, 523.0], p1: [[524.0]])])]), p1: s0(p0: [525.0, 526.0], p1: [[527.0]]))], p1: s3(p0: s1(p0: s0(p0: [528.0, 529.0], p1: [[530.0]]), p1: [s0(p0: [531.0, 532.0], p1: [[533.0]]), s0(p0: [534.0, 535.0], p1: [[536.0]]), s0(p0: [537.0, 538.0], p1: [[539.0]])], p2: [s0(p0: [540.0, 541.0], p1: [[542.0]]), s0(p0: [543.0, 544.0], p1: [[545.0]])]), p1: [s1(p0: s0(p0: [546.0, 547.0], p1: [[548.0]]), p1: [s0(p0: [549.0, 550.0], p1: [[551.0]]), s0(p0: [552.0, 553.0], p1: [[554.0]]), s0(p0: [555.0, 556.0], p1: [[557.0]])], p2: [s0(p0: [558.0, 559.0], p1: [[560.0]]), s0(p0: [561.0, 562.0], p1: [[563.0]])]), s1(p0: s0(p0: [564.0, 565.0], p1: [[566.0]]), p1: [s0(p0: [567.0, 568.0], p1: [[569.0]]), s0(p0: [570.0, 571.0], p1: [[572.0]]), s0(p0: [573.0, 574.0], p1: [[575.0]])], p2: [s0(p0: [576.0, 577.0], p1: [[578.0]]), s0(p0: [579.0, 580.0], p1: [[581.0]])])]), p2: [[s4(p0: s1(p0: s0(p0: [582.0, 583.0], p1: [[584.0]]), p1: [s0(p0: [585.0, 586.0], p1: [[587.0]]), s0(p0: [588.0, 589.0], p1: [[590.0]]), s0(p0: [591.0, 592.0], p1: [[593.0]])], p2: [s0(p0: [594.0, 595.0], p1: [[596.0]]), s0(p0: [597.0, 598.0], p1: [[599.0]])]), p1: s1(p0: s0(p0: [600.0, 601.0], p1: [[602.0]]), p1: [s0(p0: [603.0, 604.0], p1: [[605.0]]), s0(p0: [606.0, 607.0], p1: [[608.0]]), s0(p0: [609.0, 610.0], p1: [[611.0]])], p2: [s0(p0: [612.0, 613.0], p1: [[614.0]]), s0(p0: [615.0, 616.0], p1: [[617.0]])]))], [s4(p0: s1(p0: s0(p0: [618.0, 619.0], p1: [[620.0]]), p1: [s0(p0: [621.0, 622.0], p1: [[623.0]]), s0(p0: [624.0, 625.0], p1: [[626.0]]), s0(p0: [627.0, 628.0], p1: [[629.0]])], p2: [s0(p0: [630.0, 631.0], p1: [[632.0]]), s0(p0: [633.0, 634.0], p1: [[635.0]])]), p1: s1(p0: s0(p0: [636.0, 637.0], p1: [[638.0]]), p1: [s0(p0: [639.0, 640.0], p1: [[641.0]]), s0(p0: [642.0, 643.0], p1: [[644.0]]), s0(p0: [645.0, 646.0], p1: [[647.0]])], p2: [s0(p0: [648.0, 649.0], p1: [[650.0]]), s0(p0: [651.0, 652.0], p1: [[653.0]])]))]], p3: s0(p0: [654.0, 655.0], p1: [[656.0]]))]])
    let v1: Double = 657.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 657.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
