  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: [s1]
  }
  struct s4 {
    var p0: [[s2]]
    var p1: s0
  }
  struct s6 {
    var p0: s4
    var p1: s2
  }
  struct s10 {
    var p0: [s0]
    var p1: [s6]
  }
  @inline(never)
  func f0(_ v0: s10, _ v1: [s10], _ v2: Double) -> Double {
    let v8: [s0] = v0.p0
    let v6: s0 = v8[0]
    var v13: Double = v2
    let v9: [[Double]] = v6.p1
    let v27: Double = v2 * v2
    let v32: [Double] = v9[1]
    var v26: [Double] = v32
    v26[0] = v13
    var v83: [Double] = v26
    v83[0] = v27
    v83[0] = v27
    let v111: Double = v83[0]
    let v352: Double = v83[0]
    v26[0] = v111
    return v352
  }
  func benchmark() {
    let v0: s10 = s10(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], p1: [s6(p0: s4(p0: [[s2(p0: s1(p0: [[s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])]], p1: [[s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])]]), p1: [s1(p0: [[s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])], [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])], [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])]], p1: [[s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])], [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])]]), s1(p0: [[s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])], [s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])], [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])]], p1: [[s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]])], [s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]])]]), s1(p0: [[s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])], [s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]])], [s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]])]], p1: [[s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]])], [s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]])]])])], [s2(p0: s1(p0: [[s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]])], [s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]])], [s0(p0: [[92.0], [93.0]], p1: [[94.0], [95.0]])]], p1: [[s0(p0: [[96.0], [97.0]], p1: [[98.0], [99.0]])], [s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0]])]]), p1: [s1(p0: [[s0(p0: [[104.0], [105.0]], p1: [[106.0], [107.0]])], [s0(p0: [[108.0], [109.0]], p1: [[110.0], [111.0]])], [s0(p0: [[112.0], [113.0]], p1: [[114.0], [115.0]])]], p1: [[s0(p0: [[116.0], [117.0]], p1: [[118.0], [119.0]])], [s0(p0: [[120.0], [121.0]], p1: [[122.0], [123.0]])]]), s1(p0: [[s0(p0: [[124.0], [125.0]], p1: [[126.0], [127.0]])], [s0(p0: [[128.0], [129.0]], p1: [[130.0], [131.0]])], [s0(p0: [[132.0], [133.0]], p1: [[134.0], [135.0]])]], p1: [[s0(p0: [[136.0], [137.0]], p1: [[138.0], [139.0]])], [s0(p0: [[140.0], [141.0]], p1: [[142.0], [143.0]])]]), s1(p0: [[s0(p0: [[144.0], [145.0]], p1: [[146.0], [147.0]])], [s0(p0: [[148.0], [149.0]], p1: [[150.0], [151.0]])], [s0(p0: [[152.0], [153.0]], p1: [[154.0], [155.0]])]], p1: [[s0(p0: [[156.0], [157.0]], p1: [[158.0], [159.0]])], [s0(p0: [[160.0], [161.0]], p1: [[162.0], [163.0]])]])])]], p1: s0(p0: [[164.0], [165.0]], p1: [[166.0], [167.0]])), p1: s2(p0: s1(p0: [[s0(p0: [[168.0], [169.0]], p1: [[170.0], [171.0]])], [s0(p0: [[172.0], [173.0]], p1: [[174.0], [175.0]])], [s0(p0: [[176.0], [177.0]], p1: [[178.0], [179.0]])]], p1: [[s0(p0: [[180.0], [181.0]], p1: [[182.0], [183.0]])], [s0(p0: [[184.0], [185.0]], p1: [[186.0], [187.0]])]]), p1: [s1(p0: [[s0(p0: [[188.0], [189.0]], p1: [[190.0], [191.0]])], [s0(p0: [[192.0], [193.0]], p1: [[194.0], [195.0]])], [s0(p0: [[196.0], [197.0]], p1: [[198.0], [199.0]])]], p1: [[s0(p0: [[200.0], [201.0]], p1: [[202.0], [203.0]])], [s0(p0: [[204.0], [205.0]], p1: [[206.0], [207.0]])]]), s1(p0: [[s0(p0: [[208.0], [209.0]], p1: [[210.0], [211.0]])], [s0(p0: [[212.0], [213.0]], p1: [[214.0], [215.0]])], [s0(p0: [[216.0], [217.0]], p1: [[218.0], [219.0]])]], p1: [[s0(p0: [[220.0], [221.0]], p1: [[222.0], [223.0]])], [s0(p0: [[224.0], [225.0]], p1: [[226.0], [227.0]])]]), s1(p0: [[s0(p0: [[228.0], [229.0]], p1: [[230.0], [231.0]])], [s0(p0: [[232.0], [233.0]], p1: [[234.0], [235.0]])], [s0(p0: [[236.0], [237.0]], p1: [[238.0], [239.0]])]], p1: [[s0(p0: [[240.0], [241.0]], p1: [[242.0], [243.0]])], [s0(p0: [[244.0], [245.0]], p1: [[246.0], [247.0]])]])]))])
    let v1: [s10] = [s10(p0: [s0(p0: [[248.0], [249.0]], p1: [[250.0], [251.0]])], p1: [s6(p0: s4(p0: [[s2(p0: s1(p0: [[s0(p0: [[252.0], [253.0]], p1: [[254.0], [255.0]])], [s0(p0: [[256.0], [257.0]], p1: [[258.0], [259.0]])], [s0(p0: [[260.0], [261.0]], p1: [[262.0], [263.0]])]], p1: [[s0(p0: [[264.0], [265.0]], p1: [[266.0], [267.0]])], [s0(p0: [[268.0], [269.0]], p1: [[270.0], [271.0]])]]), p1: [s1(p0: [[s0(p0: [[272.0], [273.0]], p1: [[274.0], [275.0]])], [s0(p0: [[276.0], [277.0]], p1: [[278.0], [279.0]])], [s0(p0: [[280.0], [281.0]], p1: [[282.0], [283.0]])]], p1: [[s0(p0: [[284.0], [285.0]], p1: [[286.0], [287.0]])], [s0(p0: [[288.0], [289.0]], p1: [[290.0], [291.0]])]]), s1(p0: [[s0(p0: [[292.0], [293.0]], p1: [[294.0], [295.0]])], [s0(p0: [[296.0], [297.0]], p1: [[298.0], [299.0]])], [s0(p0: [[300.0], [301.0]], p1: [[302.0], [303.0]])]], p1: [[s0(p0: [[304.0], [305.0]], p1: [[306.0], [307.0]])], [s0(p0: [[308.0], [309.0]], p1: [[310.0], [311.0]])]]), s1(p0: [[s0(p0: [[312.0], [313.0]], p1: [[314.0], [315.0]])], [s0(p0: [[316.0], [317.0]], p1: [[318.0], [319.0]])], [s0(p0: [[320.0], [321.0]], p1: [[322.0], [323.0]])]], p1: [[s0(p0: [[324.0], [325.0]], p1: [[326.0], [327.0]])], [s0(p0: [[328.0], [329.0]], p1: [[330.0], [331.0]])]])])], [s2(p0: s1(p0: [[s0(p0: [[332.0], [333.0]], p1: [[334.0], [335.0]])], [s0(p0: [[336.0], [337.0]], p1: [[338.0], [339.0]])], [s0(p0: [[340.0], [341.0]], p1: [[342.0], [343.0]])]], p1: [[s0(p0: [[344.0], [345.0]], p1: [[346.0], [347.0]])], [s0(p0: [[348.0], [349.0]], p1: [[350.0], [351.0]])]]), p1: [s1(p0: [[s0(p0: [[352.0], [353.0]], p1: [[354.0], [355.0]])], [s0(p0: [[356.0], [357.0]], p1: [[358.0], [359.0]])], [s0(p0: [[360.0], [361.0]], p1: [[362.0], [363.0]])]], p1: [[s0(p0: [[364.0], [365.0]], p1: [[366.0], [367.0]])], [s0(p0: [[368.0], [369.0]], p1: [[370.0], [371.0]])]]), s1(p0: [[s0(p0: [[372.0], [373.0]], p1: [[374.0], [375.0]])], [s0(p0: [[376.0], [377.0]], p1: [[378.0], [379.0]])], [s0(p0: [[380.0], [381.0]], p1: [[382.0], [383.0]])]], p1: [[s0(p0: [[384.0], [385.0]], p1: [[386.0], [387.0]])], [s0(p0: [[388.0], [389.0]], p1: [[390.0], [391.0]])]]), s1(p0: [[s0(p0: [[392.0], [393.0]], p1: [[394.0], [395.0]])], [s0(p0: [[396.0], [397.0]], p1: [[398.0], [399.0]])], [s0(p0: [[400.0], [401.0]], p1: [[402.0], [403.0]])]], p1: [[s0(p0: [[404.0], [405.0]], p1: [[406.0], [407.0]])], [s0(p0: [[408.0], [409.0]], p1: [[410.0], [411.0]])]])])]], p1: s0(p0: [[412.0], [413.0]], p1: [[414.0], [415.0]])), p1: s2(p0: s1(p0: [[s0(p0: [[416.0], [417.0]], p1: [[418.0], [419.0]])], [s0(p0: [[420.0], [421.0]], p1: [[422.0], [423.0]])], [s0(p0: [[424.0], [425.0]], p1: [[426.0], [427.0]])]], p1: [[s0(p0: [[428.0], [429.0]], p1: [[430.0], [431.0]])], [s0(p0: [[432.0], [433.0]], p1: [[434.0], [435.0]])]]), p1: [s1(p0: [[s0(p0: [[436.0], [437.0]], p1: [[438.0], [439.0]])], [s0(p0: [[440.0], [441.0]], p1: [[442.0], [443.0]])], [s0(p0: [[444.0], [445.0]], p1: [[446.0], [447.0]])]], p1: [[s0(p0: [[448.0], [449.0]], p1: [[450.0], [451.0]])], [s0(p0: [[452.0], [453.0]], p1: [[454.0], [455.0]])]]), s1(p0: [[s0(p0: [[456.0], [457.0]], p1: [[458.0], [459.0]])], [s0(p0: [[460.0], [461.0]], p1: [[462.0], [463.0]])], [s0(p0: [[464.0], [465.0]], p1: [[466.0], [467.0]])]], p1: [[s0(p0: [[468.0], [469.0]], p1: [[470.0], [471.0]])], [s0(p0: [[472.0], [473.0]], p1: [[474.0], [475.0]])]]), s1(p0: [[s0(p0: [[476.0], [477.0]], p1: [[478.0], [479.0]])], [s0(p0: [[480.0], [481.0]], p1: [[482.0], [483.0]])], [s0(p0: [[484.0], [485.0]], p1: [[486.0], [487.0]])]], p1: [[s0(p0: [[488.0], [489.0]], p1: [[490.0], [491.0]])], [s0(p0: [[492.0], [493.0]], p1: [[494.0], [495.0]])]])]))]), s10(p0: [s0(p0: [[496.0], [497.0]], p1: [[498.0], [499.0]])], p1: [s6(p0: s4(p0: [[s2(p0: s1(p0: [[s0(p0: [[500.0], [501.0]], p1: [[502.0], [503.0]])], [s0(p0: [[504.0], [505.0]], p1: [[506.0], [507.0]])], [s0(p0: [[508.0], [509.0]], p1: [[510.0], [511.0]])]], p1: [[s0(p0: [[512.0], [513.0]], p1: [[514.0], [515.0]])], [s0(p0: [[516.0], [517.0]], p1: [[518.0], [519.0]])]]), p1: [s1(p0: [[s0(p0: [[520.0], [521.0]], p1: [[522.0], [523.0]])], [s0(p0: [[524.0], [525.0]], p1: [[526.0], [527.0]])], [s0(p0: [[528.0], [529.0]], p1: [[530.0], [531.0]])]], p1: [[s0(p0: [[532.0], [533.0]], p1: [[534.0], [535.0]])], [s0(p0: [[536.0], [537.0]], p1: [[538.0], [539.0]])]]), s1(p0: [[s0(p0: [[540.0], [541.0]], p1: [[542.0], [543.0]])], [s0(p0: [[544.0], [545.0]], p1: [[546.0], [547.0]])], [s0(p0: [[548.0], [549.0]], p1: [[550.0], [551.0]])]], p1: [[s0(p0: [[552.0], [553.0]], p1: [[554.0], [555.0]])], [s0(p0: [[556.0], [557.0]], p1: [[558.0], [559.0]])]]), s1(p0: [[s0(p0: [[560.0], [561.0]], p1: [[562.0], [563.0]])], [s0(p0: [[564.0], [565.0]], p1: [[566.0], [567.0]])], [s0(p0: [[568.0], [569.0]], p1: [[570.0], [571.0]])]], p1: [[s0(p0: [[572.0], [573.0]], p1: [[574.0], [575.0]])], [s0(p0: [[576.0], [577.0]], p1: [[578.0], [579.0]])]])])], [s2(p0: s1(p0: [[s0(p0: [[580.0], [581.0]], p1: [[582.0], [583.0]])], [s0(p0: [[584.0], [585.0]], p1: [[586.0], [587.0]])], [s0(p0: [[588.0], [589.0]], p1: [[590.0], [591.0]])]], p1: [[s0(p0: [[592.0], [593.0]], p1: [[594.0], [595.0]])], [s0(p0: [[596.0], [597.0]], p1: [[598.0], [599.0]])]]), p1: [s1(p0: [[s0(p0: [[600.0], [601.0]], p1: [[602.0], [603.0]])], [s0(p0: [[604.0], [605.0]], p1: [[606.0], [607.0]])], [s0(p0: [[608.0], [609.0]], p1: [[610.0], [611.0]])]], p1: [[s0(p0: [[612.0], [613.0]], p1: [[614.0], [615.0]])], [s0(p0: [[616.0], [617.0]], p1: [[618.0], [619.0]])]]), s1(p0: [[s0(p0: [[620.0], [621.0]], p1: [[622.0], [623.0]])], [s0(p0: [[624.0], [625.0]], p1: [[626.0], [627.0]])], [s0(p0: [[628.0], [629.0]], p1: [[630.0], [631.0]])]], p1: [[s0(p0: [[632.0], [633.0]], p1: [[634.0], [635.0]])], [s0(p0: [[636.0], [637.0]], p1: [[638.0], [639.0]])]]), s1(p0: [[s0(p0: [[640.0], [641.0]], p1: [[642.0], [643.0]])], [s0(p0: [[644.0], [645.0]], p1: [[646.0], [647.0]])], [s0(p0: [[648.0], [649.0]], p1: [[650.0], [651.0]])]], p1: [[s0(p0: [[652.0], [653.0]], p1: [[654.0], [655.0]])], [s0(p0: [[656.0], [657.0]], p1: [[658.0], [659.0]])]])])]], p1: s0(p0: [[660.0], [661.0]], p1: [[662.0], [663.0]])), p1: s2(p0: s1(p0: [[s0(p0: [[664.0], [665.0]], p1: [[666.0], [667.0]])], [s0(p0: [[668.0], [669.0]], p1: [[670.0], [671.0]])], [s0(p0: [[672.0], [673.0]], p1: [[674.0], [675.0]])]], p1: [[s0(p0: [[676.0], [677.0]], p1: [[678.0], [679.0]])], [s0(p0: [[680.0], [681.0]], p1: [[682.0], [683.0]])]]), p1: [s1(p0: [[s0(p0: [[684.0], [685.0]], p1: [[686.0], [687.0]])], [s0(p0: [[688.0], [689.0]], p1: [[690.0], [691.0]])], [s0(p0: [[692.0], [693.0]], p1: [[694.0], [695.0]])]], p1: [[s0(p0: [[696.0], [697.0]], p1: [[698.0], [699.0]])], [s0(p0: [[700.0], [701.0]], p1: [[702.0], [703.0]])]]), s1(p0: [[s0(p0: [[704.0], [705.0]], p1: [[706.0], [707.0]])], [s0(p0: [[708.0], [709.0]], p1: [[710.0], [711.0]])], [s0(p0: [[712.0], [713.0]], p1: [[714.0], [715.0]])]], p1: [[s0(p0: [[716.0], [717.0]], p1: [[718.0], [719.0]])], [s0(p0: [[720.0], [721.0]], p1: [[722.0], [723.0]])]]), s1(p0: [[s0(p0: [[724.0], [725.0]], p1: [[726.0], [727.0]])], [s0(p0: [[728.0], [729.0]], p1: [[730.0], [731.0]])], [s0(p0: [[732.0], [733.0]], p1: [[734.0], [735.0]])]], p1: [[s0(p0: [[736.0], [737.0]], p1: [[738.0], [739.0]])], [s0(p0: [[740.0], [741.0]], p1: [[742.0], [743.0]])]])]))]), s10(p0: [s0(p0: [[744.0], [745.0]], p1: [[746.0], [747.0]])], p1: [s6(p0: s4(p0: [[s2(p0: s1(p0: [[s0(p0: [[748.0], [749.0]], p1: [[750.0], [751.0]])], [s0(p0: [[752.0], [753.0]], p1: [[754.0], [755.0]])], [s0(p0: [[756.0], [757.0]], p1: [[758.0], [759.0]])]], p1: [[s0(p0: [[760.0], [761.0]], p1: [[762.0], [763.0]])], [s0(p0: [[764.0], [765.0]], p1: [[766.0], [767.0]])]]), p1: [s1(p0: [[s0(p0: [[768.0], [769.0]], p1: [[770.0], [771.0]])], [s0(p0: [[772.0], [773.0]], p1: [[774.0], [775.0]])], [s0(p0: [[776.0], [777.0]], p1: [[778.0], [779.0]])]], p1: [[s0(p0: [[780.0], [781.0]], p1: [[782.0], [783.0]])], [s0(p0: [[784.0], [785.0]], p1: [[786.0], [787.0]])]]), s1(p0: [[s0(p0: [[788.0], [789.0]], p1: [[790.0], [791.0]])], [s0(p0: [[792.0], [793.0]], p1: [[794.0], [795.0]])], [s0(p0: [[796.0], [797.0]], p1: [[798.0], [799.0]])]], p1: [[s0(p0: [[800.0], [801.0]], p1: [[802.0], [803.0]])], [s0(p0: [[804.0], [805.0]], p1: [[806.0], [807.0]])]]), s1(p0: [[s0(p0: [[808.0], [809.0]], p1: [[810.0], [811.0]])], [s0(p0: [[812.0], [813.0]], p1: [[814.0], [815.0]])], [s0(p0: [[816.0], [817.0]], p1: [[818.0], [819.0]])]], p1: [[s0(p0: [[820.0], [821.0]], p1: [[822.0], [823.0]])], [s0(p0: [[824.0], [825.0]], p1: [[826.0], [827.0]])]])])], [s2(p0: s1(p0: [[s0(p0: [[828.0], [829.0]], p1: [[830.0], [831.0]])], [s0(p0: [[832.0], [833.0]], p1: [[834.0], [835.0]])], [s0(p0: [[836.0], [837.0]], p1: [[838.0], [839.0]])]], p1: [[s0(p0: [[840.0], [841.0]], p1: [[842.0], [843.0]])], [s0(p0: [[844.0], [845.0]], p1: [[846.0], [847.0]])]]), p1: [s1(p0: [[s0(p0: [[848.0], [849.0]], p1: [[850.0], [851.0]])], [s0(p0: [[852.0], [853.0]], p1: [[854.0], [855.0]])], [s0(p0: [[856.0], [857.0]], p1: [[858.0], [859.0]])]], p1: [[s0(p0: [[860.0], [861.0]], p1: [[862.0], [863.0]])], [s0(p0: [[864.0], [865.0]], p1: [[866.0], [867.0]])]]), s1(p0: [[s0(p0: [[868.0], [869.0]], p1: [[870.0], [871.0]])], [s0(p0: [[872.0], [873.0]], p1: [[874.0], [875.0]])], [s0(p0: [[876.0], [877.0]], p1: [[878.0], [879.0]])]], p1: [[s0(p0: [[880.0], [881.0]], p1: [[882.0], [883.0]])], [s0(p0: [[884.0], [885.0]], p1: [[886.0], [887.0]])]]), s1(p0: [[s0(p0: [[888.0], [889.0]], p1: [[890.0], [891.0]])], [s0(p0: [[892.0], [893.0]], p1: [[894.0], [895.0]])], [s0(p0: [[896.0], [897.0]], p1: [[898.0], [899.0]])]], p1: [[s0(p0: [[900.0], [901.0]], p1: [[902.0], [903.0]])], [s0(p0: [[904.0], [905.0]], p1: [[906.0], [907.0]])]])])]], p1: s0(p0: [[908.0], [909.0]], p1: [[910.0], [911.0]])), p1: s2(p0: s1(p0: [[s0(p0: [[912.0], [913.0]], p1: [[914.0], [915.0]])], [s0(p0: [[916.0], [917.0]], p1: [[918.0], [919.0]])], [s0(p0: [[920.0], [921.0]], p1: [[922.0], [923.0]])]], p1: [[s0(p0: [[924.0], [925.0]], p1: [[926.0], [927.0]])], [s0(p0: [[928.0], [929.0]], p1: [[930.0], [931.0]])]]), p1: [s1(p0: [[s0(p0: [[932.0], [933.0]], p1: [[934.0], [935.0]])], [s0(p0: [[936.0], [937.0]], p1: [[938.0], [939.0]])], [s0(p0: [[940.0], [941.0]], p1: [[942.0], [943.0]])]], p1: [[s0(p0: [[944.0], [945.0]], p1: [[946.0], [947.0]])], [s0(p0: [[948.0], [949.0]], p1: [[950.0], [951.0]])]]), s1(p0: [[s0(p0: [[952.0], [953.0]], p1: [[954.0], [955.0]])], [s0(p0: [[956.0], [957.0]], p1: [[958.0], [959.0]])], [s0(p0: [[960.0], [961.0]], p1: [[962.0], [963.0]])]], p1: [[s0(p0: [[964.0], [965.0]], p1: [[966.0], [967.0]])], [s0(p0: [[968.0], [969.0]], p1: [[970.0], [971.0]])]]), s1(p0: [[s0(p0: [[972.0], [973.0]], p1: [[974.0], [975.0]])], [s0(p0: [[976.0], [977.0]], p1: [[978.0], [979.0]])], [s0(p0: [[980.0], [981.0]], p1: [[982.0], [983.0]])]], p1: [[s0(p0: [[984.0], [985.0]], p1: [[986.0], [987.0]])], [s0(p0: [[988.0], [989.0]], p1: [[990.0], [991.0]])]])]))])]
    let v2: Double = 992.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 992.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
