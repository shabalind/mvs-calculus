  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: s2
    var p2: [s1]
  }
  struct s4 {
    var p0: s0
    var p1: [s2]
  }
  struct s5 {
    var p0: s2
    var p1: s3
    var p2: s4
    var p3: s3
  }
  struct s7 {
    var p0: [s0]
    var p1: s1
  }
  struct s8 {
    var p0: s5
    var p1: [[s3]]
    var p2: [s7]
  }
  func f21(_ v0: Double) -> Double {
    var v4: Double = v0
    var v8: Double = v4
    v8 = v0
    let v2: Double = v4 * v0
    var v7: Double = v0
    var v11: Double = v4
    let v6: [Double] = [v7, v11, v7, v2, v11]
    var v5: [Double] = v6
    var v9: [Double] = v5
    v5[1] = v0
    v5[0] = v8
    var v12: [Double] = v9
    var v28: [Double] = v12
    let v116: Double = v28[4]
    var v47: Double = v116
    return v47
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s4], _ v2: [s3], _ v3: [[s8]], _ v4: s4, _ v5: Double) -> Double {
    let v8: [Double] = [v5, v5, v5, v5, v5]
    let v20: Double = v8[1]
    let v76: Double = f21(v20)
    return v76
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: [s0(p0: [[0.0]], p1: [[1.0]])], p1: s0(p0: [[2.0]], p1: [[3.0]]), p2: [s0(p0: [[4.0]], p1: [[5.0]])]), s1(p0: [s0(p0: [[6.0]], p1: [[7.0]])], p1: s0(p0: [[8.0]], p1: [[9.0]]), p2: [s0(p0: [[10.0]], p1: [[11.0]])]), s1(p0: [s0(p0: [[12.0]], p1: [[13.0]])], p1: s0(p0: [[14.0]], p1: [[15.0]]), p2: [s0(p0: [[16.0]], p1: [[17.0]])])], p1: s0(p0: [[18.0]], p1: [[19.0]]))
    let v1: [s4] = [s4(p0: s0(p0: [[20.0]], p1: [[21.0]]), p1: [s2(p0: [s1(p0: [s0(p0: [[22.0]], p1: [[23.0]])], p1: s0(p0: [[24.0]], p1: [[25.0]]), p2: [s0(p0: [[26.0]], p1: [[27.0]])]), s1(p0: [s0(p0: [[28.0]], p1: [[29.0]])], p1: s0(p0: [[30.0]], p1: [[31.0]]), p2: [s0(p0: [[32.0]], p1: [[33.0]])]), s1(p0: [s0(p0: [[34.0]], p1: [[35.0]])], p1: s0(p0: [[36.0]], p1: [[37.0]]), p2: [s0(p0: [[38.0]], p1: [[39.0]])])], p1: s0(p0: [[40.0]], p1: [[41.0]])), s2(p0: [s1(p0: [s0(p0: [[42.0]], p1: [[43.0]])], p1: s0(p0: [[44.0]], p1: [[45.0]]), p2: [s0(p0: [[46.0]], p1: [[47.0]])]), s1(p0: [s0(p0: [[48.0]], p1: [[49.0]])], p1: s0(p0: [[50.0]], p1: [[51.0]]), p2: [s0(p0: [[52.0]], p1: [[53.0]])]), s1(p0: [s0(p0: [[54.0]], p1: [[55.0]])], p1: s0(p0: [[56.0]], p1: [[57.0]]), p2: [s0(p0: [[58.0]], p1: [[59.0]])])], p1: s0(p0: [[60.0]], p1: [[61.0]])), s2(p0: [s1(p0: [s0(p0: [[62.0]], p1: [[63.0]])], p1: s0(p0: [[64.0]], p1: [[65.0]]), p2: [s0(p0: [[66.0]], p1: [[67.0]])]), s1(p0: [s0(p0: [[68.0]], p1: [[69.0]])], p1: s0(p0: [[70.0]], p1: [[71.0]]), p2: [s0(p0: [[72.0]], p1: [[73.0]])]), s1(p0: [s0(p0: [[74.0]], p1: [[75.0]])], p1: s0(p0: [[76.0]], p1: [[77.0]]), p2: [s0(p0: [[78.0]], p1: [[79.0]])])], p1: s0(p0: [[80.0]], p1: [[81.0]]))]), s4(p0: s0(p0: [[82.0]], p1: [[83.0]]), p1: [s2(p0: [s1(p0: [s0(p0: [[84.0]], p1: [[85.0]])], p1: s0(p0: [[86.0]], p1: [[87.0]]), p2: [s0(p0: [[88.0]], p1: [[89.0]])]), s1(p0: [s0(p0: [[90.0]], p1: [[91.0]])], p1: s0(p0: [[92.0]], p1: [[93.0]]), p2: [s0(p0: [[94.0]], p1: [[95.0]])]), s1(p0: [s0(p0: [[96.0]], p1: [[97.0]])], p1: s0(p0: [[98.0]], p1: [[99.0]]), p2: [s0(p0: [[100.0]], p1: [[101.0]])])], p1: s0(p0: [[102.0]], p1: [[103.0]])), s2(p0: [s1(p0: [s0(p0: [[104.0]], p1: [[105.0]])], p1: s0(p0: [[106.0]], p1: [[107.0]]), p2: [s0(p0: [[108.0]], p1: [[109.0]])]), s1(p0: [s0(p0: [[110.0]], p1: [[111.0]])], p1: s0(p0: [[112.0]], p1: [[113.0]]), p2: [s0(p0: [[114.0]], p1: [[115.0]])]), s1(p0: [s0(p0: [[116.0]], p1: [[117.0]])], p1: s0(p0: [[118.0]], p1: [[119.0]]), p2: [s0(p0: [[120.0]], p1: [[121.0]])])], p1: s0(p0: [[122.0]], p1: [[123.0]])), s2(p0: [s1(p0: [s0(p0: [[124.0]], p1: [[125.0]])], p1: s0(p0: [[126.0]], p1: [[127.0]]), p2: [s0(p0: [[128.0]], p1: [[129.0]])]), s1(p0: [s0(p0: [[130.0]], p1: [[131.0]])], p1: s0(p0: [[132.0]], p1: [[133.0]]), p2: [s0(p0: [[134.0]], p1: [[135.0]])]), s1(p0: [s0(p0: [[136.0]], p1: [[137.0]])], p1: s0(p0: [[138.0]], p1: [[139.0]]), p2: [s0(p0: [[140.0]], p1: [[141.0]])])], p1: s0(p0: [[142.0]], p1: [[143.0]]))])]
    let v2: [s3] = [s3(p0: s1(p0: [s0(p0: [[144.0]], p1: [[145.0]])], p1: s0(p0: [[146.0]], p1: [[147.0]]), p2: [s0(p0: [[148.0]], p1: [[149.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[150.0]], p1: [[151.0]])], p1: s0(p0: [[152.0]], p1: [[153.0]]), p2: [s0(p0: [[154.0]], p1: [[155.0]])]), s1(p0: [s0(p0: [[156.0]], p1: [[157.0]])], p1: s0(p0: [[158.0]], p1: [[159.0]]), p2: [s0(p0: [[160.0]], p1: [[161.0]])]), s1(p0: [s0(p0: [[162.0]], p1: [[163.0]])], p1: s0(p0: [[164.0]], p1: [[165.0]]), p2: [s0(p0: [[166.0]], p1: [[167.0]])])], p1: s0(p0: [[168.0]], p1: [[169.0]])), p2: [s1(p0: [s0(p0: [[170.0]], p1: [[171.0]])], p1: s0(p0: [[172.0]], p1: [[173.0]]), p2: [s0(p0: [[174.0]], p1: [[175.0]])])]), s3(p0: s1(p0: [s0(p0: [[176.0]], p1: [[177.0]])], p1: s0(p0: [[178.0]], p1: [[179.0]]), p2: [s0(p0: [[180.0]], p1: [[181.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[182.0]], p1: [[183.0]])], p1: s0(p0: [[184.0]], p1: [[185.0]]), p2: [s0(p0: [[186.0]], p1: [[187.0]])]), s1(p0: [s0(p0: [[188.0]], p1: [[189.0]])], p1: s0(p0: [[190.0]], p1: [[191.0]]), p2: [s0(p0: [[192.0]], p1: [[193.0]])]), s1(p0: [s0(p0: [[194.0]], p1: [[195.0]])], p1: s0(p0: [[196.0]], p1: [[197.0]]), p2: [s0(p0: [[198.0]], p1: [[199.0]])])], p1: s0(p0: [[200.0]], p1: [[201.0]])), p2: [s1(p0: [s0(p0: [[202.0]], p1: [[203.0]])], p1: s0(p0: [[204.0]], p1: [[205.0]]), p2: [s0(p0: [[206.0]], p1: [[207.0]])])]), s3(p0: s1(p0: [s0(p0: [[208.0]], p1: [[209.0]])], p1: s0(p0: [[210.0]], p1: [[211.0]]), p2: [s0(p0: [[212.0]], p1: [[213.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[214.0]], p1: [[215.0]])], p1: s0(p0: [[216.0]], p1: [[217.0]]), p2: [s0(p0: [[218.0]], p1: [[219.0]])]), s1(p0: [s0(p0: [[220.0]], p1: [[221.0]])], p1: s0(p0: [[222.0]], p1: [[223.0]]), p2: [s0(p0: [[224.0]], p1: [[225.0]])]), s1(p0: [s0(p0: [[226.0]], p1: [[227.0]])], p1: s0(p0: [[228.0]], p1: [[229.0]]), p2: [s0(p0: [[230.0]], p1: [[231.0]])])], p1: s0(p0: [[232.0]], p1: [[233.0]])), p2: [s1(p0: [s0(p0: [[234.0]], p1: [[235.0]])], p1: s0(p0: [[236.0]], p1: [[237.0]]), p2: [s0(p0: [[238.0]], p1: [[239.0]])])])]
    let v3: [[s8]] = [[s8(p0: s5(p0: s2(p0: [s1(p0: [s0(p0: [[240.0]], p1: [[241.0]])], p1: s0(p0: [[242.0]], p1: [[243.0]]), p2: [s0(p0: [[244.0]], p1: [[245.0]])]), s1(p0: [s0(p0: [[246.0]], p1: [[247.0]])], p1: s0(p0: [[248.0]], p1: [[249.0]]), p2: [s0(p0: [[250.0]], p1: [[251.0]])]), s1(p0: [s0(p0: [[252.0]], p1: [[253.0]])], p1: s0(p0: [[254.0]], p1: [[255.0]]), p2: [s0(p0: [[256.0]], p1: [[257.0]])])], p1: s0(p0: [[258.0]], p1: [[259.0]])), p1: s3(p0: s1(p0: [s0(p0: [[260.0]], p1: [[261.0]])], p1: s0(p0: [[262.0]], p1: [[263.0]]), p2: [s0(p0: [[264.0]], p1: [[265.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[266.0]], p1: [[267.0]])], p1: s0(p0: [[268.0]], p1: [[269.0]]), p2: [s0(p0: [[270.0]], p1: [[271.0]])]), s1(p0: [s0(p0: [[272.0]], p1: [[273.0]])], p1: s0(p0: [[274.0]], p1: [[275.0]]), p2: [s0(p0: [[276.0]], p1: [[277.0]])]), s1(p0: [s0(p0: [[278.0]], p1: [[279.0]])], p1: s0(p0: [[280.0]], p1: [[281.0]]), p2: [s0(p0: [[282.0]], p1: [[283.0]])])], p1: s0(p0: [[284.0]], p1: [[285.0]])), p2: [s1(p0: [s0(p0: [[286.0]], p1: [[287.0]])], p1: s0(p0: [[288.0]], p1: [[289.0]]), p2: [s0(p0: [[290.0]], p1: [[291.0]])])]), p2: s4(p0: s0(p0: [[292.0]], p1: [[293.0]]), p1: [s2(p0: [s1(p0: [s0(p0: [[294.0]], p1: [[295.0]])], p1: s0(p0: [[296.0]], p1: [[297.0]]), p2: [s0(p0: [[298.0]], p1: [[299.0]])]), s1(p0: [s0(p0: [[300.0]], p1: [[301.0]])], p1: s0(p0: [[302.0]], p1: [[303.0]]), p2: [s0(p0: [[304.0]], p1: [[305.0]])]), s1(p0: [s0(p0: [[306.0]], p1: [[307.0]])], p1: s0(p0: [[308.0]], p1: [[309.0]]), p2: [s0(p0: [[310.0]], p1: [[311.0]])])], p1: s0(p0: [[312.0]], p1: [[313.0]])), s2(p0: [s1(p0: [s0(p0: [[314.0]], p1: [[315.0]])], p1: s0(p0: [[316.0]], p1: [[317.0]]), p2: [s0(p0: [[318.0]], p1: [[319.0]])]), s1(p0: [s0(p0: [[320.0]], p1: [[321.0]])], p1: s0(p0: [[322.0]], p1: [[323.0]]), p2: [s0(p0: [[324.0]], p1: [[325.0]])]), s1(p0: [s0(p0: [[326.0]], p1: [[327.0]])], p1: s0(p0: [[328.0]], p1: [[329.0]]), p2: [s0(p0: [[330.0]], p1: [[331.0]])])], p1: s0(p0: [[332.0]], p1: [[333.0]])), s2(p0: [s1(p0: [s0(p0: [[334.0]], p1: [[335.0]])], p1: s0(p0: [[336.0]], p1: [[337.0]]), p2: [s0(p0: [[338.0]], p1: [[339.0]])]), s1(p0: [s0(p0: [[340.0]], p1: [[341.0]])], p1: s0(p0: [[342.0]], p1: [[343.0]]), p2: [s0(p0: [[344.0]], p1: [[345.0]])]), s1(p0: [s0(p0: [[346.0]], p1: [[347.0]])], p1: s0(p0: [[348.0]], p1: [[349.0]]), p2: [s0(p0: [[350.0]], p1: [[351.0]])])], p1: s0(p0: [[352.0]], p1: [[353.0]]))]), p3: s3(p0: s1(p0: [s0(p0: [[354.0]], p1: [[355.0]])], p1: s0(p0: [[356.0]], p1: [[357.0]]), p2: [s0(p0: [[358.0]], p1: [[359.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[360.0]], p1: [[361.0]])], p1: s0(p0: [[362.0]], p1: [[363.0]]), p2: [s0(p0: [[364.0]], p1: [[365.0]])]), s1(p0: [s0(p0: [[366.0]], p1: [[367.0]])], p1: s0(p0: [[368.0]], p1: [[369.0]]), p2: [s0(p0: [[370.0]], p1: [[371.0]])]), s1(p0: [s0(p0: [[372.0]], p1: [[373.0]])], p1: s0(p0: [[374.0]], p1: [[375.0]]), p2: [s0(p0: [[376.0]], p1: [[377.0]])])], p1: s0(p0: [[378.0]], p1: [[379.0]])), p2: [s1(p0: [s0(p0: [[380.0]], p1: [[381.0]])], p1: s0(p0: [[382.0]], p1: [[383.0]]), p2: [s0(p0: [[384.0]], p1: [[385.0]])])])), p1: [[s3(p0: s1(p0: [s0(p0: [[386.0]], p1: [[387.0]])], p1: s0(p0: [[388.0]], p1: [[389.0]]), p2: [s0(p0: [[390.0]], p1: [[391.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[392.0]], p1: [[393.0]])], p1: s0(p0: [[394.0]], p1: [[395.0]]), p2: [s0(p0: [[396.0]], p1: [[397.0]])]), s1(p0: [s0(p0: [[398.0]], p1: [[399.0]])], p1: s0(p0: [[400.0]], p1: [[401.0]]), p2: [s0(p0: [[402.0]], p1: [[403.0]])]), s1(p0: [s0(p0: [[404.0]], p1: [[405.0]])], p1: s0(p0: [[406.0]], p1: [[407.0]]), p2: [s0(p0: [[408.0]], p1: [[409.0]])])], p1: s0(p0: [[410.0]], p1: [[411.0]])), p2: [s1(p0: [s0(p0: [[412.0]], p1: [[413.0]])], p1: s0(p0: [[414.0]], p1: [[415.0]]), p2: [s0(p0: [[416.0]], p1: [[417.0]])])])]], p2: [s7(p0: [s0(p0: [[418.0]], p1: [[419.0]])], p1: s1(p0: [s0(p0: [[420.0]], p1: [[421.0]])], p1: s0(p0: [[422.0]], p1: [[423.0]]), p2: [s0(p0: [[424.0]], p1: [[425.0]])]))])], [s8(p0: s5(p0: s2(p0: [s1(p0: [s0(p0: [[426.0]], p1: [[427.0]])], p1: s0(p0: [[428.0]], p1: [[429.0]]), p2: [s0(p0: [[430.0]], p1: [[431.0]])]), s1(p0: [s0(p0: [[432.0]], p1: [[433.0]])], p1: s0(p0: [[434.0]], p1: [[435.0]]), p2: [s0(p0: [[436.0]], p1: [[437.0]])]), s1(p0: [s0(p0: [[438.0]], p1: [[439.0]])], p1: s0(p0: [[440.0]], p1: [[441.0]]), p2: [s0(p0: [[442.0]], p1: [[443.0]])])], p1: s0(p0: [[444.0]], p1: [[445.0]])), p1: s3(p0: s1(p0: [s0(p0: [[446.0]], p1: [[447.0]])], p1: s0(p0: [[448.0]], p1: [[449.0]]), p2: [s0(p0: [[450.0]], p1: [[451.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[452.0]], p1: [[453.0]])], p1: s0(p0: [[454.0]], p1: [[455.0]]), p2: [s0(p0: [[456.0]], p1: [[457.0]])]), s1(p0: [s0(p0: [[458.0]], p1: [[459.0]])], p1: s0(p0: [[460.0]], p1: [[461.0]]), p2: [s0(p0: [[462.0]], p1: [[463.0]])]), s1(p0: [s0(p0: [[464.0]], p1: [[465.0]])], p1: s0(p0: [[466.0]], p1: [[467.0]]), p2: [s0(p0: [[468.0]], p1: [[469.0]])])], p1: s0(p0: [[470.0]], p1: [[471.0]])), p2: [s1(p0: [s0(p0: [[472.0]], p1: [[473.0]])], p1: s0(p0: [[474.0]], p1: [[475.0]]), p2: [s0(p0: [[476.0]], p1: [[477.0]])])]), p2: s4(p0: s0(p0: [[478.0]], p1: [[479.0]]), p1: [s2(p0: [s1(p0: [s0(p0: [[480.0]], p1: [[481.0]])], p1: s0(p0: [[482.0]], p1: [[483.0]]), p2: [s0(p0: [[484.0]], p1: [[485.0]])]), s1(p0: [s0(p0: [[486.0]], p1: [[487.0]])], p1: s0(p0: [[488.0]], p1: [[489.0]]), p2: [s0(p0: [[490.0]], p1: [[491.0]])]), s1(p0: [s0(p0: [[492.0]], p1: [[493.0]])], p1: s0(p0: [[494.0]], p1: [[495.0]]), p2: [s0(p0: [[496.0]], p1: [[497.0]])])], p1: s0(p0: [[498.0]], p1: [[499.0]])), s2(p0: [s1(p0: [s0(p0: [[500.0]], p1: [[501.0]])], p1: s0(p0: [[502.0]], p1: [[503.0]]), p2: [s0(p0: [[504.0]], p1: [[505.0]])]), s1(p0: [s0(p0: [[506.0]], p1: [[507.0]])], p1: s0(p0: [[508.0]], p1: [[509.0]]), p2: [s0(p0: [[510.0]], p1: [[511.0]])]), s1(p0: [s0(p0: [[512.0]], p1: [[513.0]])], p1: s0(p0: [[514.0]], p1: [[515.0]]), p2: [s0(p0: [[516.0]], p1: [[517.0]])])], p1: s0(p0: [[518.0]], p1: [[519.0]])), s2(p0: [s1(p0: [s0(p0: [[520.0]], p1: [[521.0]])], p1: s0(p0: [[522.0]], p1: [[523.0]]), p2: [s0(p0: [[524.0]], p1: [[525.0]])]), s1(p0: [s0(p0: [[526.0]], p1: [[527.0]])], p1: s0(p0: [[528.0]], p1: [[529.0]]), p2: [s0(p0: [[530.0]], p1: [[531.0]])]), s1(p0: [s0(p0: [[532.0]], p1: [[533.0]])], p1: s0(p0: [[534.0]], p1: [[535.0]]), p2: [s0(p0: [[536.0]], p1: [[537.0]])])], p1: s0(p0: [[538.0]], p1: [[539.0]]))]), p3: s3(p0: s1(p0: [s0(p0: [[540.0]], p1: [[541.0]])], p1: s0(p0: [[542.0]], p1: [[543.0]]), p2: [s0(p0: [[544.0]], p1: [[545.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[546.0]], p1: [[547.0]])], p1: s0(p0: [[548.0]], p1: [[549.0]]), p2: [s0(p0: [[550.0]], p1: [[551.0]])]), s1(p0: [s0(p0: [[552.0]], p1: [[553.0]])], p1: s0(p0: [[554.0]], p1: [[555.0]]), p2: [s0(p0: [[556.0]], p1: [[557.0]])]), s1(p0: [s0(p0: [[558.0]], p1: [[559.0]])], p1: s0(p0: [[560.0]], p1: [[561.0]]), p2: [s0(p0: [[562.0]], p1: [[563.0]])])], p1: s0(p0: [[564.0]], p1: [[565.0]])), p2: [s1(p0: [s0(p0: [[566.0]], p1: [[567.0]])], p1: s0(p0: [[568.0]], p1: [[569.0]]), p2: [s0(p0: [[570.0]], p1: [[571.0]])])])), p1: [[s3(p0: s1(p0: [s0(p0: [[572.0]], p1: [[573.0]])], p1: s0(p0: [[574.0]], p1: [[575.0]]), p2: [s0(p0: [[576.0]], p1: [[577.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[578.0]], p1: [[579.0]])], p1: s0(p0: [[580.0]], p1: [[581.0]]), p2: [s0(p0: [[582.0]], p1: [[583.0]])]), s1(p0: [s0(p0: [[584.0]], p1: [[585.0]])], p1: s0(p0: [[586.0]], p1: [[587.0]]), p2: [s0(p0: [[588.0]], p1: [[589.0]])]), s1(p0: [s0(p0: [[590.0]], p1: [[591.0]])], p1: s0(p0: [[592.0]], p1: [[593.0]]), p2: [s0(p0: [[594.0]], p1: [[595.0]])])], p1: s0(p0: [[596.0]], p1: [[597.0]])), p2: [s1(p0: [s0(p0: [[598.0]], p1: [[599.0]])], p1: s0(p0: [[600.0]], p1: [[601.0]]), p2: [s0(p0: [[602.0]], p1: [[603.0]])])])]], p2: [s7(p0: [s0(p0: [[604.0]], p1: [[605.0]])], p1: s1(p0: [s0(p0: [[606.0]], p1: [[607.0]])], p1: s0(p0: [[608.0]], p1: [[609.0]]), p2: [s0(p0: [[610.0]], p1: [[611.0]])]))])], [s8(p0: s5(p0: s2(p0: [s1(p0: [s0(p0: [[612.0]], p1: [[613.0]])], p1: s0(p0: [[614.0]], p1: [[615.0]]), p2: [s0(p0: [[616.0]], p1: [[617.0]])]), s1(p0: [s0(p0: [[618.0]], p1: [[619.0]])], p1: s0(p0: [[620.0]], p1: [[621.0]]), p2: [s0(p0: [[622.0]], p1: [[623.0]])]), s1(p0: [s0(p0: [[624.0]], p1: [[625.0]])], p1: s0(p0: [[626.0]], p1: [[627.0]]), p2: [s0(p0: [[628.0]], p1: [[629.0]])])], p1: s0(p0: [[630.0]], p1: [[631.0]])), p1: s3(p0: s1(p0: [s0(p0: [[632.0]], p1: [[633.0]])], p1: s0(p0: [[634.0]], p1: [[635.0]]), p2: [s0(p0: [[636.0]], p1: [[637.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[638.0]], p1: [[639.0]])], p1: s0(p0: [[640.0]], p1: [[641.0]]), p2: [s0(p0: [[642.0]], p1: [[643.0]])]), s1(p0: [s0(p0: [[644.0]], p1: [[645.0]])], p1: s0(p0: [[646.0]], p1: [[647.0]]), p2: [s0(p0: [[648.0]], p1: [[649.0]])]), s1(p0: [s0(p0: [[650.0]], p1: [[651.0]])], p1: s0(p0: [[652.0]], p1: [[653.0]]), p2: [s0(p0: [[654.0]], p1: [[655.0]])])], p1: s0(p0: [[656.0]], p1: [[657.0]])), p2: [s1(p0: [s0(p0: [[658.0]], p1: [[659.0]])], p1: s0(p0: [[660.0]], p1: [[661.0]]), p2: [s0(p0: [[662.0]], p1: [[663.0]])])]), p2: s4(p0: s0(p0: [[664.0]], p1: [[665.0]]), p1: [s2(p0: [s1(p0: [s0(p0: [[666.0]], p1: [[667.0]])], p1: s0(p0: [[668.0]], p1: [[669.0]]), p2: [s0(p0: [[670.0]], p1: [[671.0]])]), s1(p0: [s0(p0: [[672.0]], p1: [[673.0]])], p1: s0(p0: [[674.0]], p1: [[675.0]]), p2: [s0(p0: [[676.0]], p1: [[677.0]])]), s1(p0: [s0(p0: [[678.0]], p1: [[679.0]])], p1: s0(p0: [[680.0]], p1: [[681.0]]), p2: [s0(p0: [[682.0]], p1: [[683.0]])])], p1: s0(p0: [[684.0]], p1: [[685.0]])), s2(p0: [s1(p0: [s0(p0: [[686.0]], p1: [[687.0]])], p1: s0(p0: [[688.0]], p1: [[689.0]]), p2: [s0(p0: [[690.0]], p1: [[691.0]])]), s1(p0: [s0(p0: [[692.0]], p1: [[693.0]])], p1: s0(p0: [[694.0]], p1: [[695.0]]), p2: [s0(p0: [[696.0]], p1: [[697.0]])]), s1(p0: [s0(p0: [[698.0]], p1: [[699.0]])], p1: s0(p0: [[700.0]], p1: [[701.0]]), p2: [s0(p0: [[702.0]], p1: [[703.0]])])], p1: s0(p0: [[704.0]], p1: [[705.0]])), s2(p0: [s1(p0: [s0(p0: [[706.0]], p1: [[707.0]])], p1: s0(p0: [[708.0]], p1: [[709.0]]), p2: [s0(p0: [[710.0]], p1: [[711.0]])]), s1(p0: [s0(p0: [[712.0]], p1: [[713.0]])], p1: s0(p0: [[714.0]], p1: [[715.0]]), p2: [s0(p0: [[716.0]], p1: [[717.0]])]), s1(p0: [s0(p0: [[718.0]], p1: [[719.0]])], p1: s0(p0: [[720.0]], p1: [[721.0]]), p2: [s0(p0: [[722.0]], p1: [[723.0]])])], p1: s0(p0: [[724.0]], p1: [[725.0]]))]), p3: s3(p0: s1(p0: [s0(p0: [[726.0]], p1: [[727.0]])], p1: s0(p0: [[728.0]], p1: [[729.0]]), p2: [s0(p0: [[730.0]], p1: [[731.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[732.0]], p1: [[733.0]])], p1: s0(p0: [[734.0]], p1: [[735.0]]), p2: [s0(p0: [[736.0]], p1: [[737.0]])]), s1(p0: [s0(p0: [[738.0]], p1: [[739.0]])], p1: s0(p0: [[740.0]], p1: [[741.0]]), p2: [s0(p0: [[742.0]], p1: [[743.0]])]), s1(p0: [s0(p0: [[744.0]], p1: [[745.0]])], p1: s0(p0: [[746.0]], p1: [[747.0]]), p2: [s0(p0: [[748.0]], p1: [[749.0]])])], p1: s0(p0: [[750.0]], p1: [[751.0]])), p2: [s1(p0: [s0(p0: [[752.0]], p1: [[753.0]])], p1: s0(p0: [[754.0]], p1: [[755.0]]), p2: [s0(p0: [[756.0]], p1: [[757.0]])])])), p1: [[s3(p0: s1(p0: [s0(p0: [[758.0]], p1: [[759.0]])], p1: s0(p0: [[760.0]], p1: [[761.0]]), p2: [s0(p0: [[762.0]], p1: [[763.0]])]), p1: s2(p0: [s1(p0: [s0(p0: [[764.0]], p1: [[765.0]])], p1: s0(p0: [[766.0]], p1: [[767.0]]), p2: [s0(p0: [[768.0]], p1: [[769.0]])]), s1(p0: [s0(p0: [[770.0]], p1: [[771.0]])], p1: s0(p0: [[772.0]], p1: [[773.0]]), p2: [s0(p0: [[774.0]], p1: [[775.0]])]), s1(p0: [s0(p0: [[776.0]], p1: [[777.0]])], p1: s0(p0: [[778.0]], p1: [[779.0]]), p2: [s0(p0: [[780.0]], p1: [[781.0]])])], p1: s0(p0: [[782.0]], p1: [[783.0]])), p2: [s1(p0: [s0(p0: [[784.0]], p1: [[785.0]])], p1: s0(p0: [[786.0]], p1: [[787.0]]), p2: [s0(p0: [[788.0]], p1: [[789.0]])])])]], p2: [s7(p0: [s0(p0: [[790.0]], p1: [[791.0]])], p1: s1(p0: [s0(p0: [[792.0]], p1: [[793.0]])], p1: s0(p0: [[794.0]], p1: [[795.0]]), p2: [s0(p0: [[796.0]], p1: [[797.0]])]))])]]
    let v4: s4 = s4(p0: s0(p0: [[798.0]], p1: [[799.0]]), p1: [s2(p0: [s1(p0: [s0(p0: [[800.0]], p1: [[801.0]])], p1: s0(p0: [[802.0]], p1: [[803.0]]), p2: [s0(p0: [[804.0]], p1: [[805.0]])]), s1(p0: [s0(p0: [[806.0]], p1: [[807.0]])], p1: s0(p0: [[808.0]], p1: [[809.0]]), p2: [s0(p0: [[810.0]], p1: [[811.0]])]), s1(p0: [s0(p0: [[812.0]], p1: [[813.0]])], p1: s0(p0: [[814.0]], p1: [[815.0]]), p2: [s0(p0: [[816.0]], p1: [[817.0]])])], p1: s0(p0: [[818.0]], p1: [[819.0]])), s2(p0: [s1(p0: [s0(p0: [[820.0]], p1: [[821.0]])], p1: s0(p0: [[822.0]], p1: [[823.0]]), p2: [s0(p0: [[824.0]], p1: [[825.0]])]), s1(p0: [s0(p0: [[826.0]], p1: [[827.0]])], p1: s0(p0: [[828.0]], p1: [[829.0]]), p2: [s0(p0: [[830.0]], p1: [[831.0]])]), s1(p0: [s0(p0: [[832.0]], p1: [[833.0]])], p1: s0(p0: [[834.0]], p1: [[835.0]]), p2: [s0(p0: [[836.0]], p1: [[837.0]])])], p1: s0(p0: [[838.0]], p1: [[839.0]])), s2(p0: [s1(p0: [s0(p0: [[840.0]], p1: [[841.0]])], p1: s0(p0: [[842.0]], p1: [[843.0]]), p2: [s0(p0: [[844.0]], p1: [[845.0]])]), s1(p0: [s0(p0: [[846.0]], p1: [[847.0]])], p1: s0(p0: [[848.0]], p1: [[849.0]]), p2: [s0(p0: [[850.0]], p1: [[851.0]])]), s1(p0: [s0(p0: [[852.0]], p1: [[853.0]])], p1: s0(p0: [[854.0]], p1: [[855.0]]), p2: [s0(p0: [[856.0]], p1: [[857.0]])])], p1: s0(p0: [[858.0]], p1: [[859.0]]))])
    let v5: Double = 860.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 860.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
