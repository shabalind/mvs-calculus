  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s2
    var p1: [s2]
  }
  struct s4 {
    var p0: s3
    var p1: s1
  }
  struct s5 {
    var p0: [[s2]]
    var p1: s3
  }
  struct s7 {
    var p0: [s5]
    var p1: s5
  }
  struct s8 {
    var p0: s2
    var p1: [s4]
  }
  struct s9 {
    var p0: s4
    var p1: s8
  }
  struct s13 {
    var p0: s5
    var p1: [s9]
  }
  func f36(_ v0: Double) -> Double {
    var v3: Double = v0
    var v7: Double = v0
    var v2: Double = v0
    var v6: Double = v3
    var v9: Double = v7
    var v13: Double = v2
    var v1: Double = v2
    var v8: Double = v9
    var v5: Double = v13
    var v14: Double = v6
    let v12: [Double] = [v6, v8, v14, v7, v1, v3]
    let v11: Double = v12[5]
    v1 = v5
    let v15: [[Double]] = [v12, v12, v12, v12]
    var v19: [Double] = v12
    var v16: [[Double]] = v15
    var v36: Double = v13
    let v31: [Double] = v16[2]
    v19[1] = v11
    var v41: [[Double]] = v16
    var v61: [[Double]] = v41
    let v56: [Double] = v61[1]
    var v59: [[Double]] = v16
    v59[3] = v31
    v59[3] = v12
    v59[1] = v56
    v59[0] = v19
    let v60: [Double] = v59[0]
    let v103: [Double] = v61[0]
    v19 = v103
    let v146: Double = v60[5]
    let v251: [Double] = v16[1]
    v3 = v6
    var v84: Double = v36
    v19[1] = v84
    v16[3] = v251
    let v109: Double = v146 * v84
    return v109
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: s13, _ v2: s5, _ v3: s3, _ v4: Double) -> Double {
    let v5: Double = f36(v4)
    let v13: Double = v5 * v4
    var v18: Double = v13
    v18 = v13
    let v65: Double = v18 + v13
    return v65
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s5(p0: [[s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0]], p3: [[6.0]], p4: [[7.0]], p5: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0]], p2: [[14.0], [15.0]], p3: [[16.0]], p4: [[17.0]], p5: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]], p2: [[24.0], [25.0]], p3: [[26.0]], p4: [[27.0]], p5: [[28.0], [29.0]])], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0]], p2: [[34.0], [35.0]], p3: [[36.0]], p4: [[37.0]], p5: [[38.0], [39.0]]))], [s2(p0: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]], p2: [[44.0], [45.0]], p3: [[46.0]], p4: [[47.0]], p5: [[48.0], [49.0]]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0]], p2: [[54.0], [55.0]], p3: [[56.0]], p4: [[57.0]], p5: [[58.0], [59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]], p2: [[64.0], [65.0]], p3: [[66.0]], p4: [[67.0]], p5: [[68.0], [69.0]])], p1: s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0]], p2: [[74.0], [75.0]], p3: [[76.0]], p4: [[77.0]], p5: [[78.0], [79.0]]))]], p1: s3(p0: s2(p0: [s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]], p2: [[84.0], [85.0]], p3: [[86.0]], p4: [[87.0]], p5: [[88.0], [89.0]]), s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0]], p2: [[94.0], [95.0]], p3: [[96.0]], p4: [[97.0]], p5: [[98.0], [99.0]]), s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]], p2: [[104.0], [105.0]], p3: [[106.0]], p4: [[107.0]], p5: [[108.0], [109.0]])], p1: s0(p0: [[110.0], [111.0], [112.0]], p1: [[113.0]], p2: [[114.0], [115.0]], p3: [[116.0]], p4: [[117.0]], p5: [[118.0], [119.0]])), p1: [s2(p0: [s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]], p2: [[124.0], [125.0]], p3: [[126.0]], p4: [[127.0]], p5: [[128.0], [129.0]]), s0(p0: [[130.0], [131.0], [132.0]], p1: [[133.0]], p2: [[134.0], [135.0]], p3: [[136.0]], p4: [[137.0]], p5: [[138.0], [139.0]]), s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0]], p2: [[144.0], [145.0]], p3: [[146.0]], p4: [[147.0]], p5: [[148.0], [149.0]])], p1: s0(p0: [[150.0], [151.0], [152.0]], p1: [[153.0]], p2: [[154.0], [155.0]], p3: [[156.0]], p4: [[157.0]], p5: [[158.0], [159.0]])), s2(p0: [s0(p0: [[160.0], [161.0], [162.0]], p1: [[163.0]], p2: [[164.0], [165.0]], p3: [[166.0]], p4: [[167.0]], p5: [[168.0], [169.0]]), s0(p0: [[170.0], [171.0], [172.0]], p1: [[173.0]], p2: [[174.0], [175.0]], p3: [[176.0]], p4: [[177.0]], p5: [[178.0], [179.0]]), s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0]], p2: [[184.0], [185.0]], p3: [[186.0]], p4: [[187.0]], p5: [[188.0], [189.0]])], p1: s0(p0: [[190.0], [191.0], [192.0]], p1: [[193.0]], p2: [[194.0], [195.0]], p3: [[196.0]], p4: [[197.0]], p5: [[198.0], [199.0]]))])), s5(p0: [[s2(p0: [s0(p0: [[200.0], [201.0], [202.0]], p1: [[203.0]], p2: [[204.0], [205.0]], p3: [[206.0]], p4: [[207.0]], p5: [[208.0], [209.0]]), s0(p0: [[210.0], [211.0], [212.0]], p1: [[213.0]], p2: [[214.0], [215.0]], p3: [[216.0]], p4: [[217.0]], p5: [[218.0], [219.0]]), s0(p0: [[220.0], [221.0], [222.0]], p1: [[223.0]], p2: [[224.0], [225.0]], p3: [[226.0]], p4: [[227.0]], p5: [[228.0], [229.0]])], p1: s0(p0: [[230.0], [231.0], [232.0]], p1: [[233.0]], p2: [[234.0], [235.0]], p3: [[236.0]], p4: [[237.0]], p5: [[238.0], [239.0]]))], [s2(p0: [s0(p0: [[240.0], [241.0], [242.0]], p1: [[243.0]], p2: [[244.0], [245.0]], p3: [[246.0]], p4: [[247.0]], p5: [[248.0], [249.0]]), s0(p0: [[250.0], [251.0], [252.0]], p1: [[253.0]], p2: [[254.0], [255.0]], p3: [[256.0]], p4: [[257.0]], p5: [[258.0], [259.0]]), s0(p0: [[260.0], [261.0], [262.0]], p1: [[263.0]], p2: [[264.0], [265.0]], p3: [[266.0]], p4: [[267.0]], p5: [[268.0], [269.0]])], p1: s0(p0: [[270.0], [271.0], [272.0]], p1: [[273.0]], p2: [[274.0], [275.0]], p3: [[276.0]], p4: [[277.0]], p5: [[278.0], [279.0]]))]], p1: s3(p0: s2(p0: [s0(p0: [[280.0], [281.0], [282.0]], p1: [[283.0]], p2: [[284.0], [285.0]], p3: [[286.0]], p4: [[287.0]], p5: [[288.0], [289.0]]), s0(p0: [[290.0], [291.0], [292.0]], p1: [[293.0]], p2: [[294.0], [295.0]], p3: [[296.0]], p4: [[297.0]], p5: [[298.0], [299.0]]), s0(p0: [[300.0], [301.0], [302.0]], p1: [[303.0]], p2: [[304.0], [305.0]], p3: [[306.0]], p4: [[307.0]], p5: [[308.0], [309.0]])], p1: s0(p0: [[310.0], [311.0], [312.0]], p1: [[313.0]], p2: [[314.0], [315.0]], p3: [[316.0]], p4: [[317.0]], p5: [[318.0], [319.0]])), p1: [s2(p0: [s0(p0: [[320.0], [321.0], [322.0]], p1: [[323.0]], p2: [[324.0], [325.0]], p3: [[326.0]], p4: [[327.0]], p5: [[328.0], [329.0]]), s0(p0: [[330.0], [331.0], [332.0]], p1: [[333.0]], p2: [[334.0], [335.0]], p3: [[336.0]], p4: [[337.0]], p5: [[338.0], [339.0]]), s0(p0: [[340.0], [341.0], [342.0]], p1: [[343.0]], p2: [[344.0], [345.0]], p3: [[346.0]], p4: [[347.0]], p5: [[348.0], [349.0]])], p1: s0(p0: [[350.0], [351.0], [352.0]], p1: [[353.0]], p2: [[354.0], [355.0]], p3: [[356.0]], p4: [[357.0]], p5: [[358.0], [359.0]])), s2(p0: [s0(p0: [[360.0], [361.0], [362.0]], p1: [[363.0]], p2: [[364.0], [365.0]], p3: [[366.0]], p4: [[367.0]], p5: [[368.0], [369.0]]), s0(p0: [[370.0], [371.0], [372.0]], p1: [[373.0]], p2: [[374.0], [375.0]], p3: [[376.0]], p4: [[377.0]], p5: [[378.0], [379.0]]), s0(p0: [[380.0], [381.0], [382.0]], p1: [[383.0]], p2: [[384.0], [385.0]], p3: [[386.0]], p4: [[387.0]], p5: [[388.0], [389.0]])], p1: s0(p0: [[390.0], [391.0], [392.0]], p1: [[393.0]], p2: [[394.0], [395.0]], p3: [[396.0]], p4: [[397.0]], p5: [[398.0], [399.0]]))])), s5(p0: [[s2(p0: [s0(p0: [[400.0], [401.0], [402.0]], p1: [[403.0]], p2: [[404.0], [405.0]], p3: [[406.0]], p4: [[407.0]], p5: [[408.0], [409.0]]), s0(p0: [[410.0], [411.0], [412.0]], p1: [[413.0]], p2: [[414.0], [415.0]], p3: [[416.0]], p4: [[417.0]], p5: [[418.0], [419.0]]), s0(p0: [[420.0], [421.0], [422.0]], p1: [[423.0]], p2: [[424.0], [425.0]], p3: [[426.0]], p4: [[427.0]], p5: [[428.0], [429.0]])], p1: s0(p0: [[430.0], [431.0], [432.0]], p1: [[433.0]], p2: [[434.0], [435.0]], p3: [[436.0]], p4: [[437.0]], p5: [[438.0], [439.0]]))], [s2(p0: [s0(p0: [[440.0], [441.0], [442.0]], p1: [[443.0]], p2: [[444.0], [445.0]], p3: [[446.0]], p4: [[447.0]], p5: [[448.0], [449.0]]), s0(p0: [[450.0], [451.0], [452.0]], p1: [[453.0]], p2: [[454.0], [455.0]], p3: [[456.0]], p4: [[457.0]], p5: [[458.0], [459.0]]), s0(p0: [[460.0], [461.0], [462.0]], p1: [[463.0]], p2: [[464.0], [465.0]], p3: [[466.0]], p4: [[467.0]], p5: [[468.0], [469.0]])], p1: s0(p0: [[470.0], [471.0], [472.0]], p1: [[473.0]], p2: [[474.0], [475.0]], p3: [[476.0]], p4: [[477.0]], p5: [[478.0], [479.0]]))]], p1: s3(p0: s2(p0: [s0(p0: [[480.0], [481.0], [482.0]], p1: [[483.0]], p2: [[484.0], [485.0]], p3: [[486.0]], p4: [[487.0]], p5: [[488.0], [489.0]]), s0(p0: [[490.0], [491.0], [492.0]], p1: [[493.0]], p2: [[494.0], [495.0]], p3: [[496.0]], p4: [[497.0]], p5: [[498.0], [499.0]]), s0(p0: [[500.0], [501.0], [502.0]], p1: [[503.0]], p2: [[504.0], [505.0]], p3: [[506.0]], p4: [[507.0]], p5: [[508.0], [509.0]])], p1: s0(p0: [[510.0], [511.0], [512.0]], p1: [[513.0]], p2: [[514.0], [515.0]], p3: [[516.0]], p4: [[517.0]], p5: [[518.0], [519.0]])), p1: [s2(p0: [s0(p0: [[520.0], [521.0], [522.0]], p1: [[523.0]], p2: [[524.0], [525.0]], p3: [[526.0]], p4: [[527.0]], p5: [[528.0], [529.0]]), s0(p0: [[530.0], [531.0], [532.0]], p1: [[533.0]], p2: [[534.0], [535.0]], p3: [[536.0]], p4: [[537.0]], p5: [[538.0], [539.0]]), s0(p0: [[540.0], [541.0], [542.0]], p1: [[543.0]], p2: [[544.0], [545.0]], p3: [[546.0]], p4: [[547.0]], p5: [[548.0], [549.0]])], p1: s0(p0: [[550.0], [551.0], [552.0]], p1: [[553.0]], p2: [[554.0], [555.0]], p3: [[556.0]], p4: [[557.0]], p5: [[558.0], [559.0]])), s2(p0: [s0(p0: [[560.0], [561.0], [562.0]], p1: [[563.0]], p2: [[564.0], [565.0]], p3: [[566.0]], p4: [[567.0]], p5: [[568.0], [569.0]]), s0(p0: [[570.0], [571.0], [572.0]], p1: [[573.0]], p2: [[574.0], [575.0]], p3: [[576.0]], p4: [[577.0]], p5: [[578.0], [579.0]]), s0(p0: [[580.0], [581.0], [582.0]], p1: [[583.0]], p2: [[584.0], [585.0]], p3: [[586.0]], p4: [[587.0]], p5: [[588.0], [589.0]])], p1: s0(p0: [[590.0], [591.0], [592.0]], p1: [[593.0]], p2: [[594.0], [595.0]], p3: [[596.0]], p4: [[597.0]], p5: [[598.0], [599.0]]))]))], p1: s5(p0: [[s2(p0: [s0(p0: [[600.0], [601.0], [602.0]], p1: [[603.0]], p2: [[604.0], [605.0]], p3: [[606.0]], p4: [[607.0]], p5: [[608.0], [609.0]]), s0(p0: [[610.0], [611.0], [612.0]], p1: [[613.0]], p2: [[614.0], [615.0]], p3: [[616.0]], p4: [[617.0]], p5: [[618.0], [619.0]]), s0(p0: [[620.0], [621.0], [622.0]], p1: [[623.0]], p2: [[624.0], [625.0]], p3: [[626.0]], p4: [[627.0]], p5: [[628.0], [629.0]])], p1: s0(p0: [[630.0], [631.0], [632.0]], p1: [[633.0]], p2: [[634.0], [635.0]], p3: [[636.0]], p4: [[637.0]], p5: [[638.0], [639.0]]))], [s2(p0: [s0(p0: [[640.0], [641.0], [642.0]], p1: [[643.0]], p2: [[644.0], [645.0]], p3: [[646.0]], p4: [[647.0]], p5: [[648.0], [649.0]]), s0(p0: [[650.0], [651.0], [652.0]], p1: [[653.0]], p2: [[654.0], [655.0]], p3: [[656.0]], p4: [[657.0]], p5: [[658.0], [659.0]]), s0(p0: [[660.0], [661.0], [662.0]], p1: [[663.0]], p2: [[664.0], [665.0]], p3: [[666.0]], p4: [[667.0]], p5: [[668.0], [669.0]])], p1: s0(p0: [[670.0], [671.0], [672.0]], p1: [[673.0]], p2: [[674.0], [675.0]], p3: [[676.0]], p4: [[677.0]], p5: [[678.0], [679.0]]))]], p1: s3(p0: s2(p0: [s0(p0: [[680.0], [681.0], [682.0]], p1: [[683.0]], p2: [[684.0], [685.0]], p3: [[686.0]], p4: [[687.0]], p5: [[688.0], [689.0]]), s0(p0: [[690.0], [691.0], [692.0]], p1: [[693.0]], p2: [[694.0], [695.0]], p3: [[696.0]], p4: [[697.0]], p5: [[698.0], [699.0]]), s0(p0: [[700.0], [701.0], [702.0]], p1: [[703.0]], p2: [[704.0], [705.0]], p3: [[706.0]], p4: [[707.0]], p5: [[708.0], [709.0]])], p1: s0(p0: [[710.0], [711.0], [712.0]], p1: [[713.0]], p2: [[714.0], [715.0]], p3: [[716.0]], p4: [[717.0]], p5: [[718.0], [719.0]])), p1: [s2(p0: [s0(p0: [[720.0], [721.0], [722.0]], p1: [[723.0]], p2: [[724.0], [725.0]], p3: [[726.0]], p4: [[727.0]], p5: [[728.0], [729.0]]), s0(p0: [[730.0], [731.0], [732.0]], p1: [[733.0]], p2: [[734.0], [735.0]], p3: [[736.0]], p4: [[737.0]], p5: [[738.0], [739.0]]), s0(p0: [[740.0], [741.0], [742.0]], p1: [[743.0]], p2: [[744.0], [745.0]], p3: [[746.0]], p4: [[747.0]], p5: [[748.0], [749.0]])], p1: s0(p0: [[750.0], [751.0], [752.0]], p1: [[753.0]], p2: [[754.0], [755.0]], p3: [[756.0]], p4: [[757.0]], p5: [[758.0], [759.0]])), s2(p0: [s0(p0: [[760.0], [761.0], [762.0]], p1: [[763.0]], p2: [[764.0], [765.0]], p3: [[766.0]], p4: [[767.0]], p5: [[768.0], [769.0]]), s0(p0: [[770.0], [771.0], [772.0]], p1: [[773.0]], p2: [[774.0], [775.0]], p3: [[776.0]], p4: [[777.0]], p5: [[778.0], [779.0]]), s0(p0: [[780.0], [781.0], [782.0]], p1: [[783.0]], p2: [[784.0], [785.0]], p3: [[786.0]], p4: [[787.0]], p5: [[788.0], [789.0]])], p1: s0(p0: [[790.0], [791.0], [792.0]], p1: [[793.0]], p2: [[794.0], [795.0]], p3: [[796.0]], p4: [[797.0]], p5: [[798.0], [799.0]]))])))
    let v1: s13 = s13(p0: s5(p0: [[s2(p0: [s0(p0: [[800.0], [801.0], [802.0]], p1: [[803.0]], p2: [[804.0], [805.0]], p3: [[806.0]], p4: [[807.0]], p5: [[808.0], [809.0]]), s0(p0: [[810.0], [811.0], [812.0]], p1: [[813.0]], p2: [[814.0], [815.0]], p3: [[816.0]], p4: [[817.0]], p5: [[818.0], [819.0]]), s0(p0: [[820.0], [821.0], [822.0]], p1: [[823.0]], p2: [[824.0], [825.0]], p3: [[826.0]], p4: [[827.0]], p5: [[828.0], [829.0]])], p1: s0(p0: [[830.0], [831.0], [832.0]], p1: [[833.0]], p2: [[834.0], [835.0]], p3: [[836.0]], p4: [[837.0]], p5: [[838.0], [839.0]]))], [s2(p0: [s0(p0: [[840.0], [841.0], [842.0]], p1: [[843.0]], p2: [[844.0], [845.0]], p3: [[846.0]], p4: [[847.0]], p5: [[848.0], [849.0]]), s0(p0: [[850.0], [851.0], [852.0]], p1: [[853.0]], p2: [[854.0], [855.0]], p3: [[856.0]], p4: [[857.0]], p5: [[858.0], [859.0]]), s0(p0: [[860.0], [861.0], [862.0]], p1: [[863.0]], p2: [[864.0], [865.0]], p3: [[866.0]], p4: [[867.0]], p5: [[868.0], [869.0]])], p1: s0(p0: [[870.0], [871.0], [872.0]], p1: [[873.0]], p2: [[874.0], [875.0]], p3: [[876.0]], p4: [[877.0]], p5: [[878.0], [879.0]]))]], p1: s3(p0: s2(p0: [s0(p0: [[880.0], [881.0], [882.0]], p1: [[883.0]], p2: [[884.0], [885.0]], p3: [[886.0]], p4: [[887.0]], p5: [[888.0], [889.0]]), s0(p0: [[890.0], [891.0], [892.0]], p1: [[893.0]], p2: [[894.0], [895.0]], p3: [[896.0]], p4: [[897.0]], p5: [[898.0], [899.0]]), s0(p0: [[900.0], [901.0], [902.0]], p1: [[903.0]], p2: [[904.0], [905.0]], p3: [[906.0]], p4: [[907.0]], p5: [[908.0], [909.0]])], p1: s0(p0: [[910.0], [911.0], [912.0]], p1: [[913.0]], p2: [[914.0], [915.0]], p3: [[916.0]], p4: [[917.0]], p5: [[918.0], [919.0]])), p1: [s2(p0: [s0(p0: [[920.0], [921.0], [922.0]], p1: [[923.0]], p2: [[924.0], [925.0]], p3: [[926.0]], p4: [[927.0]], p5: [[928.0], [929.0]]), s0(p0: [[930.0], [931.0], [932.0]], p1: [[933.0]], p2: [[934.0], [935.0]], p3: [[936.0]], p4: [[937.0]], p5: [[938.0], [939.0]]), s0(p0: [[940.0], [941.0], [942.0]], p1: [[943.0]], p2: [[944.0], [945.0]], p3: [[946.0]], p4: [[947.0]], p5: [[948.0], [949.0]])], p1: s0(p0: [[950.0], [951.0], [952.0]], p1: [[953.0]], p2: [[954.0], [955.0]], p3: [[956.0]], p4: [[957.0]], p5: [[958.0], [959.0]])), s2(p0: [s0(p0: [[960.0], [961.0], [962.0]], p1: [[963.0]], p2: [[964.0], [965.0]], p3: [[966.0]], p4: [[967.0]], p5: [[968.0], [969.0]]), s0(p0: [[970.0], [971.0], [972.0]], p1: [[973.0]], p2: [[974.0], [975.0]], p3: [[976.0]], p4: [[977.0]], p5: [[978.0], [979.0]]), s0(p0: [[980.0], [981.0], [982.0]], p1: [[983.0]], p2: [[984.0], [985.0]], p3: [[986.0]], p4: [[987.0]], p5: [[988.0], [989.0]])], p1: s0(p0: [[990.0], [991.0], [992.0]], p1: [[993.0]], p2: [[994.0], [995.0]], p3: [[996.0]], p4: [[997.0]], p5: [[998.0], [999.0]]))])), p1: [s9(p0: s4(p0: s3(p0: s2(p0: [s0(p0: [[1000.0], [1001.0], [1002.0]], p1: [[1003.0]], p2: [[1004.0], [1005.0]], p3: [[1006.0]], p4: [[1007.0]], p5: [[1008.0], [1009.0]]), s0(p0: [[1010.0], [1011.0], [1012.0]], p1: [[1013.0]], p2: [[1014.0], [1015.0]], p3: [[1016.0]], p4: [[1017.0]], p5: [[1018.0], [1019.0]]), s0(p0: [[1020.0], [1021.0], [1022.0]], p1: [[1023.0]], p2: [[1024.0], [1025.0]], p3: [[1026.0]], p4: [[1027.0]], p5: [[1028.0], [1029.0]])], p1: s0(p0: [[1030.0], [1031.0], [1032.0]], p1: [[1033.0]], p2: [[1034.0], [1035.0]], p3: [[1036.0]], p4: [[1037.0]], p5: [[1038.0], [1039.0]])), p1: [s2(p0: [s0(p0: [[1040.0], [1041.0], [1042.0]], p1: [[1043.0]], p2: [[1044.0], [1045.0]], p3: [[1046.0]], p4: [[1047.0]], p5: [[1048.0], [1049.0]]), s0(p0: [[1050.0], [1051.0], [1052.0]], p1: [[1053.0]], p2: [[1054.0], [1055.0]], p3: [[1056.0]], p4: [[1057.0]], p5: [[1058.0], [1059.0]]), s0(p0: [[1060.0], [1061.0], [1062.0]], p1: [[1063.0]], p2: [[1064.0], [1065.0]], p3: [[1066.0]], p4: [[1067.0]], p5: [[1068.0], [1069.0]])], p1: s0(p0: [[1070.0], [1071.0], [1072.0]], p1: [[1073.0]], p2: [[1074.0], [1075.0]], p3: [[1076.0]], p4: [[1077.0]], p5: [[1078.0], [1079.0]])), s2(p0: [s0(p0: [[1080.0], [1081.0], [1082.0]], p1: [[1083.0]], p2: [[1084.0], [1085.0]], p3: [[1086.0]], p4: [[1087.0]], p5: [[1088.0], [1089.0]]), s0(p0: [[1090.0], [1091.0], [1092.0]], p1: [[1093.0]], p2: [[1094.0], [1095.0]], p3: [[1096.0]], p4: [[1097.0]], p5: [[1098.0], [1099.0]]), s0(p0: [[1100.0], [1101.0], [1102.0]], p1: [[1103.0]], p2: [[1104.0], [1105.0]], p3: [[1106.0]], p4: [[1107.0]], p5: [[1108.0], [1109.0]])], p1: s0(p0: [[1110.0], [1111.0], [1112.0]], p1: [[1113.0]], p2: [[1114.0], [1115.0]], p3: [[1116.0]], p4: [[1117.0]], p5: [[1118.0], [1119.0]]))]), p1: s1(p0: s0(p0: [[1120.0], [1121.0], [1122.0]], p1: [[1123.0]], p2: [[1124.0], [1125.0]], p3: [[1126.0]], p4: [[1127.0]], p5: [[1128.0], [1129.0]]), p1: [s0(p0: [[1130.0], [1131.0], [1132.0]], p1: [[1133.0]], p2: [[1134.0], [1135.0]], p3: [[1136.0]], p4: [[1137.0]], p5: [[1138.0], [1139.0]]), s0(p0: [[1140.0], [1141.0], [1142.0]], p1: [[1143.0]], p2: [[1144.0], [1145.0]], p3: [[1146.0]], p4: [[1147.0]], p5: [[1148.0], [1149.0]])])), p1: s8(p0: s2(p0: [s0(p0: [[1150.0], [1151.0], [1152.0]], p1: [[1153.0]], p2: [[1154.0], [1155.0]], p3: [[1156.0]], p4: [[1157.0]], p5: [[1158.0], [1159.0]]), s0(p0: [[1160.0], [1161.0], [1162.0]], p1: [[1163.0]], p2: [[1164.0], [1165.0]], p3: [[1166.0]], p4: [[1167.0]], p5: [[1168.0], [1169.0]]), s0(p0: [[1170.0], [1171.0], [1172.0]], p1: [[1173.0]], p2: [[1174.0], [1175.0]], p3: [[1176.0]], p4: [[1177.0]], p5: [[1178.0], [1179.0]])], p1: s0(p0: [[1180.0], [1181.0], [1182.0]], p1: [[1183.0]], p2: [[1184.0], [1185.0]], p3: [[1186.0]], p4: [[1187.0]], p5: [[1188.0], [1189.0]])), p1: [s4(p0: s3(p0: s2(p0: [s0(p0: [[1190.0], [1191.0], [1192.0]], p1: [[1193.0]], p2: [[1194.0], [1195.0]], p3: [[1196.0]], p4: [[1197.0]], p5: [[1198.0], [1199.0]]), s0(p0: [[1200.0], [1201.0], [1202.0]], p1: [[1203.0]], p2: [[1204.0], [1205.0]], p3: [[1206.0]], p4: [[1207.0]], p5: [[1208.0], [1209.0]]), s0(p0: [[1210.0], [1211.0], [1212.0]], p1: [[1213.0]], p2: [[1214.0], [1215.0]], p3: [[1216.0]], p4: [[1217.0]], p5: [[1218.0], [1219.0]])], p1: s0(p0: [[1220.0], [1221.0], [1222.0]], p1: [[1223.0]], p2: [[1224.0], [1225.0]], p3: [[1226.0]], p4: [[1227.0]], p5: [[1228.0], [1229.0]])), p1: [s2(p0: [s0(p0: [[1230.0], [1231.0], [1232.0]], p1: [[1233.0]], p2: [[1234.0], [1235.0]], p3: [[1236.0]], p4: [[1237.0]], p5: [[1238.0], [1239.0]]), s0(p0: [[1240.0], [1241.0], [1242.0]], p1: [[1243.0]], p2: [[1244.0], [1245.0]], p3: [[1246.0]], p4: [[1247.0]], p5: [[1248.0], [1249.0]]), s0(p0: [[1250.0], [1251.0], [1252.0]], p1: [[1253.0]], p2: [[1254.0], [1255.0]], p3: [[1256.0]], p4: [[1257.0]], p5: [[1258.0], [1259.0]])], p1: s0(p0: [[1260.0], [1261.0], [1262.0]], p1: [[1263.0]], p2: [[1264.0], [1265.0]], p3: [[1266.0]], p4: [[1267.0]], p5: [[1268.0], [1269.0]])), s2(p0: [s0(p0: [[1270.0], [1271.0], [1272.0]], p1: [[1273.0]], p2: [[1274.0], [1275.0]], p3: [[1276.0]], p4: [[1277.0]], p5: [[1278.0], [1279.0]]), s0(p0: [[1280.0], [1281.0], [1282.0]], p1: [[1283.0]], p2: [[1284.0], [1285.0]], p3: [[1286.0]], p4: [[1287.0]], p5: [[1288.0], [1289.0]]), s0(p0: [[1290.0], [1291.0], [1292.0]], p1: [[1293.0]], p2: [[1294.0], [1295.0]], p3: [[1296.0]], p4: [[1297.0]], p5: [[1298.0], [1299.0]])], p1: s0(p0: [[1300.0], [1301.0], [1302.0]], p1: [[1303.0]], p2: [[1304.0], [1305.0]], p3: [[1306.0]], p4: [[1307.0]], p5: [[1308.0], [1309.0]]))]), p1: s1(p0: s0(p0: [[1310.0], [1311.0], [1312.0]], p1: [[1313.0]], p2: [[1314.0], [1315.0]], p3: [[1316.0]], p4: [[1317.0]], p5: [[1318.0], [1319.0]]), p1: [s0(p0: [[1320.0], [1321.0], [1322.0]], p1: [[1323.0]], p2: [[1324.0], [1325.0]], p3: [[1326.0]], p4: [[1327.0]], p5: [[1328.0], [1329.0]]), s0(p0: [[1330.0], [1331.0], [1332.0]], p1: [[1333.0]], p2: [[1334.0], [1335.0]], p3: [[1336.0]], p4: [[1337.0]], p5: [[1338.0], [1339.0]])])), s4(p0: s3(p0: s2(p0: [s0(p0: [[1340.0], [1341.0], [1342.0]], p1: [[1343.0]], p2: [[1344.0], [1345.0]], p3: [[1346.0]], p4: [[1347.0]], p5: [[1348.0], [1349.0]]), s0(p0: [[1350.0], [1351.0], [1352.0]], p1: [[1353.0]], p2: [[1354.0], [1355.0]], p3: [[1356.0]], p4: [[1357.0]], p5: [[1358.0], [1359.0]]), s0(p0: [[1360.0], [1361.0], [1362.0]], p1: [[1363.0]], p2: [[1364.0], [1365.0]], p3: [[1366.0]], p4: [[1367.0]], p5: [[1368.0], [1369.0]])], p1: s0(p0: [[1370.0], [1371.0], [1372.0]], p1: [[1373.0]], p2: [[1374.0], [1375.0]], p3: [[1376.0]], p4: [[1377.0]], p5: [[1378.0], [1379.0]])), p1: [s2(p0: [s0(p0: [[1380.0], [1381.0], [1382.0]], p1: [[1383.0]], p2: [[1384.0], [1385.0]], p3: [[1386.0]], p4: [[1387.0]], p5: [[1388.0], [1389.0]]), s0(p0: [[1390.0], [1391.0], [1392.0]], p1: [[1393.0]], p2: [[1394.0], [1395.0]], p3: [[1396.0]], p4: [[1397.0]], p5: [[1398.0], [1399.0]]), s0(p0: [[1400.0], [1401.0], [1402.0]], p1: [[1403.0]], p2: [[1404.0], [1405.0]], p3: [[1406.0]], p4: [[1407.0]], p5: [[1408.0], [1409.0]])], p1: s0(p0: [[1410.0], [1411.0], [1412.0]], p1: [[1413.0]], p2: [[1414.0], [1415.0]], p3: [[1416.0]], p4: [[1417.0]], p5: [[1418.0], [1419.0]])), s2(p0: [s0(p0: [[1420.0], [1421.0], [1422.0]], p1: [[1423.0]], p2: [[1424.0], [1425.0]], p3: [[1426.0]], p4: [[1427.0]], p5: [[1428.0], [1429.0]]), s0(p0: [[1430.0], [1431.0], [1432.0]], p1: [[1433.0]], p2: [[1434.0], [1435.0]], p3: [[1436.0]], p4: [[1437.0]], p5: [[1438.0], [1439.0]]), s0(p0: [[1440.0], [1441.0], [1442.0]], p1: [[1443.0]], p2: [[1444.0], [1445.0]], p3: [[1446.0]], p4: [[1447.0]], p5: [[1448.0], [1449.0]])], p1: s0(p0: [[1450.0], [1451.0], [1452.0]], p1: [[1453.0]], p2: [[1454.0], [1455.0]], p3: [[1456.0]], p4: [[1457.0]], p5: [[1458.0], [1459.0]]))]), p1: s1(p0: s0(p0: [[1460.0], [1461.0], [1462.0]], p1: [[1463.0]], p2: [[1464.0], [1465.0]], p3: [[1466.0]], p4: [[1467.0]], p5: [[1468.0], [1469.0]]), p1: [s0(p0: [[1470.0], [1471.0], [1472.0]], p1: [[1473.0]], p2: [[1474.0], [1475.0]], p3: [[1476.0]], p4: [[1477.0]], p5: [[1478.0], [1479.0]]), s0(p0: [[1480.0], [1481.0], [1482.0]], p1: [[1483.0]], p2: [[1484.0], [1485.0]], p3: [[1486.0]], p4: [[1487.0]], p5: [[1488.0], [1489.0]])]))])), s9(p0: s4(p0: s3(p0: s2(p0: [s0(p0: [[1490.0], [1491.0], [1492.0]], p1: [[1493.0]], p2: [[1494.0], [1495.0]], p3: [[1496.0]], p4: [[1497.0]], p5: [[1498.0], [1499.0]]), s0(p0: [[1500.0], [1501.0], [1502.0]], p1: [[1503.0]], p2: [[1504.0], [1505.0]], p3: [[1506.0]], p4: [[1507.0]], p5: [[1508.0], [1509.0]]), s0(p0: [[1510.0], [1511.0], [1512.0]], p1: [[1513.0]], p2: [[1514.0], [1515.0]], p3: [[1516.0]], p4: [[1517.0]], p5: [[1518.0], [1519.0]])], p1: s0(p0: [[1520.0], [1521.0], [1522.0]], p1: [[1523.0]], p2: [[1524.0], [1525.0]], p3: [[1526.0]], p4: [[1527.0]], p5: [[1528.0], [1529.0]])), p1: [s2(p0: [s0(p0: [[1530.0], [1531.0], [1532.0]], p1: [[1533.0]], p2: [[1534.0], [1535.0]], p3: [[1536.0]], p4: [[1537.0]], p5: [[1538.0], [1539.0]]), s0(p0: [[1540.0], [1541.0], [1542.0]], p1: [[1543.0]], p2: [[1544.0], [1545.0]], p3: [[1546.0]], p4: [[1547.0]], p5: [[1548.0], [1549.0]]), s0(p0: [[1550.0], [1551.0], [1552.0]], p1: [[1553.0]], p2: [[1554.0], [1555.0]], p3: [[1556.0]], p4: [[1557.0]], p5: [[1558.0], [1559.0]])], p1: s0(p0: [[1560.0], [1561.0], [1562.0]], p1: [[1563.0]], p2: [[1564.0], [1565.0]], p3: [[1566.0]], p4: [[1567.0]], p5: [[1568.0], [1569.0]])), s2(p0: [s0(p0: [[1570.0], [1571.0], [1572.0]], p1: [[1573.0]], p2: [[1574.0], [1575.0]], p3: [[1576.0]], p4: [[1577.0]], p5: [[1578.0], [1579.0]]), s0(p0: [[1580.0], [1581.0], [1582.0]], p1: [[1583.0]], p2: [[1584.0], [1585.0]], p3: [[1586.0]], p4: [[1587.0]], p5: [[1588.0], [1589.0]]), s0(p0: [[1590.0], [1591.0], [1592.0]], p1: [[1593.0]], p2: [[1594.0], [1595.0]], p3: [[1596.0]], p4: [[1597.0]], p5: [[1598.0], [1599.0]])], p1: s0(p0: [[1600.0], [1601.0], [1602.0]], p1: [[1603.0]], p2: [[1604.0], [1605.0]], p3: [[1606.0]], p4: [[1607.0]], p5: [[1608.0], [1609.0]]))]), p1: s1(p0: s0(p0: [[1610.0], [1611.0], [1612.0]], p1: [[1613.0]], p2: [[1614.0], [1615.0]], p3: [[1616.0]], p4: [[1617.0]], p5: [[1618.0], [1619.0]]), p1: [s0(p0: [[1620.0], [1621.0], [1622.0]], p1: [[1623.0]], p2: [[1624.0], [1625.0]], p3: [[1626.0]], p4: [[1627.0]], p5: [[1628.0], [1629.0]]), s0(p0: [[1630.0], [1631.0], [1632.0]], p1: [[1633.0]], p2: [[1634.0], [1635.0]], p3: [[1636.0]], p4: [[1637.0]], p5: [[1638.0], [1639.0]])])), p1: s8(p0: s2(p0: [s0(p0: [[1640.0], [1641.0], [1642.0]], p1: [[1643.0]], p2: [[1644.0], [1645.0]], p3: [[1646.0]], p4: [[1647.0]], p5: [[1648.0], [1649.0]]), s0(p0: [[1650.0], [1651.0], [1652.0]], p1: [[1653.0]], p2: [[1654.0], [1655.0]], p3: [[1656.0]], p4: [[1657.0]], p5: [[1658.0], [1659.0]]), s0(p0: [[1660.0], [1661.0], [1662.0]], p1: [[1663.0]], p2: [[1664.0], [1665.0]], p3: [[1666.0]], p4: [[1667.0]], p5: [[1668.0], [1669.0]])], p1: s0(p0: [[1670.0], [1671.0], [1672.0]], p1: [[1673.0]], p2: [[1674.0], [1675.0]], p3: [[1676.0]], p4: [[1677.0]], p5: [[1678.0], [1679.0]])), p1: [s4(p0: s3(p0: s2(p0: [s0(p0: [[1680.0], [1681.0], [1682.0]], p1: [[1683.0]], p2: [[1684.0], [1685.0]], p3: [[1686.0]], p4: [[1687.0]], p5: [[1688.0], [1689.0]]), s0(p0: [[1690.0], [1691.0], [1692.0]], p1: [[1693.0]], p2: [[1694.0], [1695.0]], p3: [[1696.0]], p4: [[1697.0]], p5: [[1698.0], [1699.0]]), s0(p0: [[1700.0], [1701.0], [1702.0]], p1: [[1703.0]], p2: [[1704.0], [1705.0]], p3: [[1706.0]], p4: [[1707.0]], p5: [[1708.0], [1709.0]])], p1: s0(p0: [[1710.0], [1711.0], [1712.0]], p1: [[1713.0]], p2: [[1714.0], [1715.0]], p3: [[1716.0]], p4: [[1717.0]], p5: [[1718.0], [1719.0]])), p1: [s2(p0: [s0(p0: [[1720.0], [1721.0], [1722.0]], p1: [[1723.0]], p2: [[1724.0], [1725.0]], p3: [[1726.0]], p4: [[1727.0]], p5: [[1728.0], [1729.0]]), s0(p0: [[1730.0], [1731.0], [1732.0]], p1: [[1733.0]], p2: [[1734.0], [1735.0]], p3: [[1736.0]], p4: [[1737.0]], p5: [[1738.0], [1739.0]]), s0(p0: [[1740.0], [1741.0], [1742.0]], p1: [[1743.0]], p2: [[1744.0], [1745.0]], p3: [[1746.0]], p4: [[1747.0]], p5: [[1748.0], [1749.0]])], p1: s0(p0: [[1750.0], [1751.0], [1752.0]], p1: [[1753.0]], p2: [[1754.0], [1755.0]], p3: [[1756.0]], p4: [[1757.0]], p5: [[1758.0], [1759.0]])), s2(p0: [s0(p0: [[1760.0], [1761.0], [1762.0]], p1: [[1763.0]], p2: [[1764.0], [1765.0]], p3: [[1766.0]], p4: [[1767.0]], p5: [[1768.0], [1769.0]]), s0(p0: [[1770.0], [1771.0], [1772.0]], p1: [[1773.0]], p2: [[1774.0], [1775.0]], p3: [[1776.0]], p4: [[1777.0]], p5: [[1778.0], [1779.0]]), s0(p0: [[1780.0], [1781.0], [1782.0]], p1: [[1783.0]], p2: [[1784.0], [1785.0]], p3: [[1786.0]], p4: [[1787.0]], p5: [[1788.0], [1789.0]])], p1: s0(p0: [[1790.0], [1791.0], [1792.0]], p1: [[1793.0]], p2: [[1794.0], [1795.0]], p3: [[1796.0]], p4: [[1797.0]], p5: [[1798.0], [1799.0]]))]), p1: s1(p0: s0(p0: [[1800.0], [1801.0], [1802.0]], p1: [[1803.0]], p2: [[1804.0], [1805.0]], p3: [[1806.0]], p4: [[1807.0]], p5: [[1808.0], [1809.0]]), p1: [s0(p0: [[1810.0], [1811.0], [1812.0]], p1: [[1813.0]], p2: [[1814.0], [1815.0]], p3: [[1816.0]], p4: [[1817.0]], p5: [[1818.0], [1819.0]]), s0(p0: [[1820.0], [1821.0], [1822.0]], p1: [[1823.0]], p2: [[1824.0], [1825.0]], p3: [[1826.0]], p4: [[1827.0]], p5: [[1828.0], [1829.0]])])), s4(p0: s3(p0: s2(p0: [s0(p0: [[1830.0], [1831.0], [1832.0]], p1: [[1833.0]], p2: [[1834.0], [1835.0]], p3: [[1836.0]], p4: [[1837.0]], p5: [[1838.0], [1839.0]]), s0(p0: [[1840.0], [1841.0], [1842.0]], p1: [[1843.0]], p2: [[1844.0], [1845.0]], p3: [[1846.0]], p4: [[1847.0]], p5: [[1848.0], [1849.0]]), s0(p0: [[1850.0], [1851.0], [1852.0]], p1: [[1853.0]], p2: [[1854.0], [1855.0]], p3: [[1856.0]], p4: [[1857.0]], p5: [[1858.0], [1859.0]])], p1: s0(p0: [[1860.0], [1861.0], [1862.0]], p1: [[1863.0]], p2: [[1864.0], [1865.0]], p3: [[1866.0]], p4: [[1867.0]], p5: [[1868.0], [1869.0]])), p1: [s2(p0: [s0(p0: [[1870.0], [1871.0], [1872.0]], p1: [[1873.0]], p2: [[1874.0], [1875.0]], p3: [[1876.0]], p4: [[1877.0]], p5: [[1878.0], [1879.0]]), s0(p0: [[1880.0], [1881.0], [1882.0]], p1: [[1883.0]], p2: [[1884.0], [1885.0]], p3: [[1886.0]], p4: [[1887.0]], p5: [[1888.0], [1889.0]]), s0(p0: [[1890.0], [1891.0], [1892.0]], p1: [[1893.0]], p2: [[1894.0], [1895.0]], p3: [[1896.0]], p4: [[1897.0]], p5: [[1898.0], [1899.0]])], p1: s0(p0: [[1900.0], [1901.0], [1902.0]], p1: [[1903.0]], p2: [[1904.0], [1905.0]], p3: [[1906.0]], p4: [[1907.0]], p5: [[1908.0], [1909.0]])), s2(p0: [s0(p0: [[1910.0], [1911.0], [1912.0]], p1: [[1913.0]], p2: [[1914.0], [1915.0]], p3: [[1916.0]], p4: [[1917.0]], p5: [[1918.0], [1919.0]]), s0(p0: [[1920.0], [1921.0], [1922.0]], p1: [[1923.0]], p2: [[1924.0], [1925.0]], p3: [[1926.0]], p4: [[1927.0]], p5: [[1928.0], [1929.0]]), s0(p0: [[1930.0], [1931.0], [1932.0]], p1: [[1933.0]], p2: [[1934.0], [1935.0]], p3: [[1936.0]], p4: [[1937.0]], p5: [[1938.0], [1939.0]])], p1: s0(p0: [[1940.0], [1941.0], [1942.0]], p1: [[1943.0]], p2: [[1944.0], [1945.0]], p3: [[1946.0]], p4: [[1947.0]], p5: [[1948.0], [1949.0]]))]), p1: s1(p0: s0(p0: [[1950.0], [1951.0], [1952.0]], p1: [[1953.0]], p2: [[1954.0], [1955.0]], p3: [[1956.0]], p4: [[1957.0]], p5: [[1958.0], [1959.0]]), p1: [s0(p0: [[1960.0], [1961.0], [1962.0]], p1: [[1963.0]], p2: [[1964.0], [1965.0]], p3: [[1966.0]], p4: [[1967.0]], p5: [[1968.0], [1969.0]]), s0(p0: [[1970.0], [1971.0], [1972.0]], p1: [[1973.0]], p2: [[1974.0], [1975.0]], p3: [[1976.0]], p4: [[1977.0]], p5: [[1978.0], [1979.0]])]))]))])
    let v2: s5 = s5(p0: [[s2(p0: [s0(p0: [[1980.0], [1981.0], [1982.0]], p1: [[1983.0]], p2: [[1984.0], [1985.0]], p3: [[1986.0]], p4: [[1987.0]], p5: [[1988.0], [1989.0]]), s0(p0: [[1990.0], [1991.0], [1992.0]], p1: [[1993.0]], p2: [[1994.0], [1995.0]], p3: [[1996.0]], p4: [[1997.0]], p5: [[1998.0], [1999.0]]), s0(p0: [[2000.0], [2001.0], [2002.0]], p1: [[2003.0]], p2: [[2004.0], [2005.0]], p3: [[2006.0]], p4: [[2007.0]], p5: [[2008.0], [2009.0]])], p1: s0(p0: [[2010.0], [2011.0], [2012.0]], p1: [[2013.0]], p2: [[2014.0], [2015.0]], p3: [[2016.0]], p4: [[2017.0]], p5: [[2018.0], [2019.0]]))], [s2(p0: [s0(p0: [[2020.0], [2021.0], [2022.0]], p1: [[2023.0]], p2: [[2024.0], [2025.0]], p3: [[2026.0]], p4: [[2027.0]], p5: [[2028.0], [2029.0]]), s0(p0: [[2030.0], [2031.0], [2032.0]], p1: [[2033.0]], p2: [[2034.0], [2035.0]], p3: [[2036.0]], p4: [[2037.0]], p5: [[2038.0], [2039.0]]), s0(p0: [[2040.0], [2041.0], [2042.0]], p1: [[2043.0]], p2: [[2044.0], [2045.0]], p3: [[2046.0]], p4: [[2047.0]], p5: [[2048.0], [2049.0]])], p1: s0(p0: [[2050.0], [2051.0], [2052.0]], p1: [[2053.0]], p2: [[2054.0], [2055.0]], p3: [[2056.0]], p4: [[2057.0]], p5: [[2058.0], [2059.0]]))]], p1: s3(p0: s2(p0: [s0(p0: [[2060.0], [2061.0], [2062.0]], p1: [[2063.0]], p2: [[2064.0], [2065.0]], p3: [[2066.0]], p4: [[2067.0]], p5: [[2068.0], [2069.0]]), s0(p0: [[2070.0], [2071.0], [2072.0]], p1: [[2073.0]], p2: [[2074.0], [2075.0]], p3: [[2076.0]], p4: [[2077.0]], p5: [[2078.0], [2079.0]]), s0(p0: [[2080.0], [2081.0], [2082.0]], p1: [[2083.0]], p2: [[2084.0], [2085.0]], p3: [[2086.0]], p4: [[2087.0]], p5: [[2088.0], [2089.0]])], p1: s0(p0: [[2090.0], [2091.0], [2092.0]], p1: [[2093.0]], p2: [[2094.0], [2095.0]], p3: [[2096.0]], p4: [[2097.0]], p5: [[2098.0], [2099.0]])), p1: [s2(p0: [s0(p0: [[2100.0], [2101.0], [2102.0]], p1: [[2103.0]], p2: [[2104.0], [2105.0]], p3: [[2106.0]], p4: [[2107.0]], p5: [[2108.0], [2109.0]]), s0(p0: [[2110.0], [2111.0], [2112.0]], p1: [[2113.0]], p2: [[2114.0], [2115.0]], p3: [[2116.0]], p4: [[2117.0]], p5: [[2118.0], [2119.0]]), s0(p0: [[2120.0], [2121.0], [2122.0]], p1: [[2123.0]], p2: [[2124.0], [2125.0]], p3: [[2126.0]], p4: [[2127.0]], p5: [[2128.0], [2129.0]])], p1: s0(p0: [[2130.0], [2131.0], [2132.0]], p1: [[2133.0]], p2: [[2134.0], [2135.0]], p3: [[2136.0]], p4: [[2137.0]], p5: [[2138.0], [2139.0]])), s2(p0: [s0(p0: [[2140.0], [2141.0], [2142.0]], p1: [[2143.0]], p2: [[2144.0], [2145.0]], p3: [[2146.0]], p4: [[2147.0]], p5: [[2148.0], [2149.0]]), s0(p0: [[2150.0], [2151.0], [2152.0]], p1: [[2153.0]], p2: [[2154.0], [2155.0]], p3: [[2156.0]], p4: [[2157.0]], p5: [[2158.0], [2159.0]]), s0(p0: [[2160.0], [2161.0], [2162.0]], p1: [[2163.0]], p2: [[2164.0], [2165.0]], p3: [[2166.0]], p4: [[2167.0]], p5: [[2168.0], [2169.0]])], p1: s0(p0: [[2170.0], [2171.0], [2172.0]], p1: [[2173.0]], p2: [[2174.0], [2175.0]], p3: [[2176.0]], p4: [[2177.0]], p5: [[2178.0], [2179.0]]))]))
    let v3: s3 = s3(p0: s2(p0: [s0(p0: [[2180.0], [2181.0], [2182.0]], p1: [[2183.0]], p2: [[2184.0], [2185.0]], p3: [[2186.0]], p4: [[2187.0]], p5: [[2188.0], [2189.0]]), s0(p0: [[2190.0], [2191.0], [2192.0]], p1: [[2193.0]], p2: [[2194.0], [2195.0]], p3: [[2196.0]], p4: [[2197.0]], p5: [[2198.0], [2199.0]]), s0(p0: [[2200.0], [2201.0], [2202.0]], p1: [[2203.0]], p2: [[2204.0], [2205.0]], p3: [[2206.0]], p4: [[2207.0]], p5: [[2208.0], [2209.0]])], p1: s0(p0: [[2210.0], [2211.0], [2212.0]], p1: [[2213.0]], p2: [[2214.0], [2215.0]], p3: [[2216.0]], p4: [[2217.0]], p5: [[2218.0], [2219.0]])), p1: [s2(p0: [s0(p0: [[2220.0], [2221.0], [2222.0]], p1: [[2223.0]], p2: [[2224.0], [2225.0]], p3: [[2226.0]], p4: [[2227.0]], p5: [[2228.0], [2229.0]]), s0(p0: [[2230.0], [2231.0], [2232.0]], p1: [[2233.0]], p2: [[2234.0], [2235.0]], p3: [[2236.0]], p4: [[2237.0]], p5: [[2238.0], [2239.0]]), s0(p0: [[2240.0], [2241.0], [2242.0]], p1: [[2243.0]], p2: [[2244.0], [2245.0]], p3: [[2246.0]], p4: [[2247.0]], p5: [[2248.0], [2249.0]])], p1: s0(p0: [[2250.0], [2251.0], [2252.0]], p1: [[2253.0]], p2: [[2254.0], [2255.0]], p3: [[2256.0]], p4: [[2257.0]], p5: [[2258.0], [2259.0]])), s2(p0: [s0(p0: [[2260.0], [2261.0], [2262.0]], p1: [[2263.0]], p2: [[2264.0], [2265.0]], p3: [[2266.0]], p4: [[2267.0]], p5: [[2268.0], [2269.0]]), s0(p0: [[2270.0], [2271.0], [2272.0]], p1: [[2273.0]], p2: [[2274.0], [2275.0]], p3: [[2276.0]], p4: [[2277.0]], p5: [[2278.0], [2279.0]]), s0(p0: [[2280.0], [2281.0], [2282.0]], p1: [[2283.0]], p2: [[2284.0], [2285.0]], p3: [[2286.0]], p4: [[2287.0]], p5: [[2288.0], [2289.0]])], p1: s0(p0: [[2290.0], [2291.0], [2292.0]], p1: [[2293.0]], p2: [[2294.0], [2295.0]], p3: [[2296.0]], p4: [[2297.0]], p5: [[2298.0], [2299.0]]))])
    let v4: Double = 2300.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2300.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
