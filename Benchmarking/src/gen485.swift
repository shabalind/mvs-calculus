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
    var p0: s1
    var p1: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  struct s4 {
    var p0: s3
    var p1: [s2]
  }
  struct s5 {
    var p0: s1
    var p1: [s1]
  }
  struct s7 {
    var p0: [s5]
    var p1: [[s3]]
  }
  struct s9 {
    var p0: [s4]
    var p1: s7
  }
  func f36(_ v0: Double) -> Double {
    let v5: Double = v0 / v0
    var v6: Double = v0
    var v8: Double = v0
    v8 = v6
    let v4: Double = v5 / v8
    v6 = v4
    var v12: Double = v5
    let v9: Double = v4 - v12
    v12 = v5
    var v1: Double = v9
    var v10: Double = v0
    var v17: Double = v10
    var v32: Double = v17
    v8 = v32
    var v27: Double = v12
    let v38: Double = v27 - v1
    return v38
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: [[s3]], _ v2: s9, _ v3: Double) -> Double {
    var v4: Double = v3
    let v19: Double = f36(v4)
    let v43: Double = f36(v19)
    let v23: Double = v4 * v4
    let v20: Double = v43 * v23
    return v20
  }
  func benchmark() {
    let v0: s9 = s9(p0: [s4(p0: s3(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]), p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]), p1: s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), p1: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])])), p1: [s2(p0: s1(p0: s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), p1: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]]), s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]])]), p1: [s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]])])])], p1: s7(p0: [s5(p0: s1(p0: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]]), p1: [s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0], [95.0]]), s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0], [100.0], [101.0]]), s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0], [107.0]])]), p1: [s1(p0: s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0], [112.0], [113.0]]), p1: [s0(p0: [[114.0], [115.0], [116.0]], p1: [[117.0], [118.0], [119.0]]), s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0], [125.0]]), s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0], [130.0], [131.0]])]), s1(p0: s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0], [136.0], [137.0]]), p1: [s0(p0: [[138.0], [139.0], [140.0]], p1: [[141.0], [142.0], [143.0]]), s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0], [148.0], [149.0]]), s0(p0: [[150.0], [151.0], [152.0]], p1: [[153.0], [154.0], [155.0]])]), s1(p0: s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0], [160.0], [161.0]]), p1: [s0(p0: [[162.0], [163.0], [164.0]], p1: [[165.0], [166.0], [167.0]]), s0(p0: [[168.0], [169.0], [170.0]], p1: [[171.0], [172.0], [173.0]]), s0(p0: [[174.0], [175.0], [176.0]], p1: [[177.0], [178.0], [179.0]])])]), s5(p0: s1(p0: s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0], [184.0], [185.0]]), p1: [s0(p0: [[186.0], [187.0], [188.0]], p1: [[189.0], [190.0], [191.0]]), s0(p0: [[192.0], [193.0], [194.0]], p1: [[195.0], [196.0], [197.0]]), s0(p0: [[198.0], [199.0], [200.0]], p1: [[201.0], [202.0], [203.0]])]), p1: [s1(p0: s0(p0: [[204.0], [205.0], [206.0]], p1: [[207.0], [208.0], [209.0]]), p1: [s0(p0: [[210.0], [211.0], [212.0]], p1: [[213.0], [214.0], [215.0]]), s0(p0: [[216.0], [217.0], [218.0]], p1: [[219.0], [220.0], [221.0]]), s0(p0: [[222.0], [223.0], [224.0]], p1: [[225.0], [226.0], [227.0]])]), s1(p0: s0(p0: [[228.0], [229.0], [230.0]], p1: [[231.0], [232.0], [233.0]]), p1: [s0(p0: [[234.0], [235.0], [236.0]], p1: [[237.0], [238.0], [239.0]]), s0(p0: [[240.0], [241.0], [242.0]], p1: [[243.0], [244.0], [245.0]]), s0(p0: [[246.0], [247.0], [248.0]], p1: [[249.0], [250.0], [251.0]])]), s1(p0: s0(p0: [[252.0], [253.0], [254.0]], p1: [[255.0], [256.0], [257.0]]), p1: [s0(p0: [[258.0], [259.0], [260.0]], p1: [[261.0], [262.0], [263.0]]), s0(p0: [[264.0], [265.0], [266.0]], p1: [[267.0], [268.0], [269.0]]), s0(p0: [[270.0], [271.0], [272.0]], p1: [[273.0], [274.0], [275.0]])])]), s5(p0: s1(p0: s0(p0: [[276.0], [277.0], [278.0]], p1: [[279.0], [280.0], [281.0]]), p1: [s0(p0: [[282.0], [283.0], [284.0]], p1: [[285.0], [286.0], [287.0]]), s0(p0: [[288.0], [289.0], [290.0]], p1: [[291.0], [292.0], [293.0]]), s0(p0: [[294.0], [295.0], [296.0]], p1: [[297.0], [298.0], [299.0]])]), p1: [s1(p0: s0(p0: [[300.0], [301.0], [302.0]], p1: [[303.0], [304.0], [305.0]]), p1: [s0(p0: [[306.0], [307.0], [308.0]], p1: [[309.0], [310.0], [311.0]]), s0(p0: [[312.0], [313.0], [314.0]], p1: [[315.0], [316.0], [317.0]]), s0(p0: [[318.0], [319.0], [320.0]], p1: [[321.0], [322.0], [323.0]])]), s1(p0: s0(p0: [[324.0], [325.0], [326.0]], p1: [[327.0], [328.0], [329.0]]), p1: [s0(p0: [[330.0], [331.0], [332.0]], p1: [[333.0], [334.0], [335.0]]), s0(p0: [[336.0], [337.0], [338.0]], p1: [[339.0], [340.0], [341.0]]), s0(p0: [[342.0], [343.0], [344.0]], p1: [[345.0], [346.0], [347.0]])]), s1(p0: s0(p0: [[348.0], [349.0], [350.0]], p1: [[351.0], [352.0], [353.0]]), p1: [s0(p0: [[354.0], [355.0], [356.0]], p1: [[357.0], [358.0], [359.0]]), s0(p0: [[360.0], [361.0], [362.0]], p1: [[363.0], [364.0], [365.0]]), s0(p0: [[366.0], [367.0], [368.0]], p1: [[369.0], [370.0], [371.0]])])])], p1: [[s3(p0: s2(p0: s1(p0: s0(p0: [[372.0], [373.0], [374.0]], p1: [[375.0], [376.0], [377.0]]), p1: [s0(p0: [[378.0], [379.0], [380.0]], p1: [[381.0], [382.0], [383.0]]), s0(p0: [[384.0], [385.0], [386.0]], p1: [[387.0], [388.0], [389.0]]), s0(p0: [[390.0], [391.0], [392.0]], p1: [[393.0], [394.0], [395.0]])]), p1: [s0(p0: [[396.0], [397.0], [398.0]], p1: [[399.0], [400.0], [401.0]])]), p1: s1(p0: s0(p0: [[402.0], [403.0], [404.0]], p1: [[405.0], [406.0], [407.0]]), p1: [s0(p0: [[408.0], [409.0], [410.0]], p1: [[411.0], [412.0], [413.0]]), s0(p0: [[414.0], [415.0], [416.0]], p1: [[417.0], [418.0], [419.0]]), s0(p0: [[420.0], [421.0], [422.0]], p1: [[423.0], [424.0], [425.0]])]))], [s3(p0: s2(p0: s1(p0: s0(p0: [[426.0], [427.0], [428.0]], p1: [[429.0], [430.0], [431.0]]), p1: [s0(p0: [[432.0], [433.0], [434.0]], p1: [[435.0], [436.0], [437.0]]), s0(p0: [[438.0], [439.0], [440.0]], p1: [[441.0], [442.0], [443.0]]), s0(p0: [[444.0], [445.0], [446.0]], p1: [[447.0], [448.0], [449.0]])]), p1: [s0(p0: [[450.0], [451.0], [452.0]], p1: [[453.0], [454.0], [455.0]])]), p1: s1(p0: s0(p0: [[456.0], [457.0], [458.0]], p1: [[459.0], [460.0], [461.0]]), p1: [s0(p0: [[462.0], [463.0], [464.0]], p1: [[465.0], [466.0], [467.0]]), s0(p0: [[468.0], [469.0], [470.0]], p1: [[471.0], [472.0], [473.0]]), s0(p0: [[474.0], [475.0], [476.0]], p1: [[477.0], [478.0], [479.0]])]))]]))
    let v1: [[s3]] = [[s3(p0: s2(p0: s1(p0: s0(p0: [[480.0], [481.0], [482.0]], p1: [[483.0], [484.0], [485.0]]), p1: [s0(p0: [[486.0], [487.0], [488.0]], p1: [[489.0], [490.0], [491.0]]), s0(p0: [[492.0], [493.0], [494.0]], p1: [[495.0], [496.0], [497.0]]), s0(p0: [[498.0], [499.0], [500.0]], p1: [[501.0], [502.0], [503.0]])]), p1: [s0(p0: [[504.0], [505.0], [506.0]], p1: [[507.0], [508.0], [509.0]])]), p1: s1(p0: s0(p0: [[510.0], [511.0], [512.0]], p1: [[513.0], [514.0], [515.0]]), p1: [s0(p0: [[516.0], [517.0], [518.0]], p1: [[519.0], [520.0], [521.0]]), s0(p0: [[522.0], [523.0], [524.0]], p1: [[525.0], [526.0], [527.0]]), s0(p0: [[528.0], [529.0], [530.0]], p1: [[531.0], [532.0], [533.0]])]))]]
    let v2: s9 = s9(p0: [s4(p0: s3(p0: s2(p0: s1(p0: s0(p0: [[534.0], [535.0], [536.0]], p1: [[537.0], [538.0], [539.0]]), p1: [s0(p0: [[540.0], [541.0], [542.0]], p1: [[543.0], [544.0], [545.0]]), s0(p0: [[546.0], [547.0], [548.0]], p1: [[549.0], [550.0], [551.0]]), s0(p0: [[552.0], [553.0], [554.0]], p1: [[555.0], [556.0], [557.0]])]), p1: [s0(p0: [[558.0], [559.0], [560.0]], p1: [[561.0], [562.0], [563.0]])]), p1: s1(p0: s0(p0: [[564.0], [565.0], [566.0]], p1: [[567.0], [568.0], [569.0]]), p1: [s0(p0: [[570.0], [571.0], [572.0]], p1: [[573.0], [574.0], [575.0]]), s0(p0: [[576.0], [577.0], [578.0]], p1: [[579.0], [580.0], [581.0]]), s0(p0: [[582.0], [583.0], [584.0]], p1: [[585.0], [586.0], [587.0]])])), p1: [s2(p0: s1(p0: s0(p0: [[588.0], [589.0], [590.0]], p1: [[591.0], [592.0], [593.0]]), p1: [s0(p0: [[594.0], [595.0], [596.0]], p1: [[597.0], [598.0], [599.0]]), s0(p0: [[600.0], [601.0], [602.0]], p1: [[603.0], [604.0], [605.0]]), s0(p0: [[606.0], [607.0], [608.0]], p1: [[609.0], [610.0], [611.0]])]), p1: [s0(p0: [[612.0], [613.0], [614.0]], p1: [[615.0], [616.0], [617.0]])])])], p1: s7(p0: [s5(p0: s1(p0: s0(p0: [[618.0], [619.0], [620.0]], p1: [[621.0], [622.0], [623.0]]), p1: [s0(p0: [[624.0], [625.0], [626.0]], p1: [[627.0], [628.0], [629.0]]), s0(p0: [[630.0], [631.0], [632.0]], p1: [[633.0], [634.0], [635.0]]), s0(p0: [[636.0], [637.0], [638.0]], p1: [[639.0], [640.0], [641.0]])]), p1: [s1(p0: s0(p0: [[642.0], [643.0], [644.0]], p1: [[645.0], [646.0], [647.0]]), p1: [s0(p0: [[648.0], [649.0], [650.0]], p1: [[651.0], [652.0], [653.0]]), s0(p0: [[654.0], [655.0], [656.0]], p1: [[657.0], [658.0], [659.0]]), s0(p0: [[660.0], [661.0], [662.0]], p1: [[663.0], [664.0], [665.0]])]), s1(p0: s0(p0: [[666.0], [667.0], [668.0]], p1: [[669.0], [670.0], [671.0]]), p1: [s0(p0: [[672.0], [673.0], [674.0]], p1: [[675.0], [676.0], [677.0]]), s0(p0: [[678.0], [679.0], [680.0]], p1: [[681.0], [682.0], [683.0]]), s0(p0: [[684.0], [685.0], [686.0]], p1: [[687.0], [688.0], [689.0]])]), s1(p0: s0(p0: [[690.0], [691.0], [692.0]], p1: [[693.0], [694.0], [695.0]]), p1: [s0(p0: [[696.0], [697.0], [698.0]], p1: [[699.0], [700.0], [701.0]]), s0(p0: [[702.0], [703.0], [704.0]], p1: [[705.0], [706.0], [707.0]]), s0(p0: [[708.0], [709.0], [710.0]], p1: [[711.0], [712.0], [713.0]])])]), s5(p0: s1(p0: s0(p0: [[714.0], [715.0], [716.0]], p1: [[717.0], [718.0], [719.0]]), p1: [s0(p0: [[720.0], [721.0], [722.0]], p1: [[723.0], [724.0], [725.0]]), s0(p0: [[726.0], [727.0], [728.0]], p1: [[729.0], [730.0], [731.0]]), s0(p0: [[732.0], [733.0], [734.0]], p1: [[735.0], [736.0], [737.0]])]), p1: [s1(p0: s0(p0: [[738.0], [739.0], [740.0]], p1: [[741.0], [742.0], [743.0]]), p1: [s0(p0: [[744.0], [745.0], [746.0]], p1: [[747.0], [748.0], [749.0]]), s0(p0: [[750.0], [751.0], [752.0]], p1: [[753.0], [754.0], [755.0]]), s0(p0: [[756.0], [757.0], [758.0]], p1: [[759.0], [760.0], [761.0]])]), s1(p0: s0(p0: [[762.0], [763.0], [764.0]], p1: [[765.0], [766.0], [767.0]]), p1: [s0(p0: [[768.0], [769.0], [770.0]], p1: [[771.0], [772.0], [773.0]]), s0(p0: [[774.0], [775.0], [776.0]], p1: [[777.0], [778.0], [779.0]]), s0(p0: [[780.0], [781.0], [782.0]], p1: [[783.0], [784.0], [785.0]])]), s1(p0: s0(p0: [[786.0], [787.0], [788.0]], p1: [[789.0], [790.0], [791.0]]), p1: [s0(p0: [[792.0], [793.0], [794.0]], p1: [[795.0], [796.0], [797.0]]), s0(p0: [[798.0], [799.0], [800.0]], p1: [[801.0], [802.0], [803.0]]), s0(p0: [[804.0], [805.0], [806.0]], p1: [[807.0], [808.0], [809.0]])])]), s5(p0: s1(p0: s0(p0: [[810.0], [811.0], [812.0]], p1: [[813.0], [814.0], [815.0]]), p1: [s0(p0: [[816.0], [817.0], [818.0]], p1: [[819.0], [820.0], [821.0]]), s0(p0: [[822.0], [823.0], [824.0]], p1: [[825.0], [826.0], [827.0]]), s0(p0: [[828.0], [829.0], [830.0]], p1: [[831.0], [832.0], [833.0]])]), p1: [s1(p0: s0(p0: [[834.0], [835.0], [836.0]], p1: [[837.0], [838.0], [839.0]]), p1: [s0(p0: [[840.0], [841.0], [842.0]], p1: [[843.0], [844.0], [845.0]]), s0(p0: [[846.0], [847.0], [848.0]], p1: [[849.0], [850.0], [851.0]]), s0(p0: [[852.0], [853.0], [854.0]], p1: [[855.0], [856.0], [857.0]])]), s1(p0: s0(p0: [[858.0], [859.0], [860.0]], p1: [[861.0], [862.0], [863.0]]), p1: [s0(p0: [[864.0], [865.0], [866.0]], p1: [[867.0], [868.0], [869.0]]), s0(p0: [[870.0], [871.0], [872.0]], p1: [[873.0], [874.0], [875.0]]), s0(p0: [[876.0], [877.0], [878.0]], p1: [[879.0], [880.0], [881.0]])]), s1(p0: s0(p0: [[882.0], [883.0], [884.0]], p1: [[885.0], [886.0], [887.0]]), p1: [s0(p0: [[888.0], [889.0], [890.0]], p1: [[891.0], [892.0], [893.0]]), s0(p0: [[894.0], [895.0], [896.0]], p1: [[897.0], [898.0], [899.0]]), s0(p0: [[900.0], [901.0], [902.0]], p1: [[903.0], [904.0], [905.0]])])])], p1: [[s3(p0: s2(p0: s1(p0: s0(p0: [[906.0], [907.0], [908.0]], p1: [[909.0], [910.0], [911.0]]), p1: [s0(p0: [[912.0], [913.0], [914.0]], p1: [[915.0], [916.0], [917.0]]), s0(p0: [[918.0], [919.0], [920.0]], p1: [[921.0], [922.0], [923.0]]), s0(p0: [[924.0], [925.0], [926.0]], p1: [[927.0], [928.0], [929.0]])]), p1: [s0(p0: [[930.0], [931.0], [932.0]], p1: [[933.0], [934.0], [935.0]])]), p1: s1(p0: s0(p0: [[936.0], [937.0], [938.0]], p1: [[939.0], [940.0], [941.0]]), p1: [s0(p0: [[942.0], [943.0], [944.0]], p1: [[945.0], [946.0], [947.0]]), s0(p0: [[948.0], [949.0], [950.0]], p1: [[951.0], [952.0], [953.0]]), s0(p0: [[954.0], [955.0], [956.0]], p1: [[957.0], [958.0], [959.0]])]))], [s3(p0: s2(p0: s1(p0: s0(p0: [[960.0], [961.0], [962.0]], p1: [[963.0], [964.0], [965.0]]), p1: [s0(p0: [[966.0], [967.0], [968.0]], p1: [[969.0], [970.0], [971.0]]), s0(p0: [[972.0], [973.0], [974.0]], p1: [[975.0], [976.0], [977.0]]), s0(p0: [[978.0], [979.0], [980.0]], p1: [[981.0], [982.0], [983.0]])]), p1: [s0(p0: [[984.0], [985.0], [986.0]], p1: [[987.0], [988.0], [989.0]])]), p1: s1(p0: s0(p0: [[990.0], [991.0], [992.0]], p1: [[993.0], [994.0], [995.0]]), p1: [s0(p0: [[996.0], [997.0], [998.0]], p1: [[999.0], [1000.0], [1001.0]]), s0(p0: [[1002.0], [1003.0], [1004.0]], p1: [[1005.0], [1006.0], [1007.0]]), s0(p0: [[1008.0], [1009.0], [1010.0]], p1: [[1011.0], [1012.0], [1013.0]])]))]]))
    let v3: Double = 1014.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 1014.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
