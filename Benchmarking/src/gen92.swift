  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: Double
    var p3: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s0
    var p2: [s0]
  }
  struct s4 {
    var p0: s0
    var p1: [s3]
    var p2: s0
  }
  struct s5 {
    var p0: s3
    var p1: Double
  }
  struct s6 {
    var p0: s1
    var p1: s0
  }
  struct s7 {
    var p0: [[s6]]
    var p1: s5
  }
  func f87(_ v0: s4, _ v1: s3) -> s4 {
    let v7: s0 = v1.p1
    var v3: s0 = v7
    var v6: s0 = v7
    let v8: s0 = v1.p1
    var v4: s0 = v3
    var v17: s0 = v4
    let v19: [s3] = v0.p1
    var v10: s0 = v6
    let v20: [[Double]] = v17.p1
    let v22: [[Double]] = v10.p1
    let v24: [[Double]] = v10.p0
    v4.p1 = v20
    let v14: s4 = s4(p0: v8, p1: v19, p2: v17)
    v17.p0 = v20
    var v39: [[Double]] = v24
    v4.p1 = v39
    v10.p1 = v39
    v6.p0 = v20
    var v68: [[Double]] = v22
    v3.p0 = v20
    v10.p0 = v68
    var v91: [[Double]] = v20
    v4.p1 = v91
    v10.p1 = v20
    return v14
  }
  func f79(_ v0: s3) -> s3 {
    var v7: s3 = v0
    var v3: s3 = v7
    let v1: [s0] = v7.p2
    v7.p2 = v1
    let v4: s0 = v7.p1
    let v8: [s0] = [v4, v4]
    var v2: s0 = v4
    let v5: [s0] = v7.p0
    let v9: [s0] = v0.p0
    let v11: s0 = v9[2]
    let v18: s0 = v7.p1
    var v17: [s0] = v1
    let v16: [s0] = v7.p2
    v17[1] = v18
    let v23: s0 = v3.p1
    v3.p1 = v23
    let v13: s0 = v8[1]
    v7.p2 = v17
    let v15: s0 = v16[1]
    var v14: [s0] = v5
    let v37: [[Double]] = v18.p1
    v17[0] = v18
    let v19: s0 = v1[0]
    let v22: s0 = v9[1]
    var v38: s3 = v7
    let v34: [s0] = [v22, v13, v19, v15]
    v3.p0 = v14
    var v35: [s0] = v34
    let v28: [s0] = v3.p2
    v35[3] = v23
    v17[0] = v2
    var v27: [s0] = v5
    v7 = v38
    let v53: s0 = v28[1]
    var v43: [s0] = v5
    v38.p0 = v5
    v17 = v28
    v2 = v13
    v17[0] = v22
    let v69: s0 = v35[1]
    v3.p2 = v8
    let v60: [[Double]] = v11.p0
    var v85: [[Double]] = v60
    let v51: s0 = v5[2]
    let v100: [[Double]] = v53.p0
    v38.p0 = v5
    v3.p0 = v5
    v3.p1 = v23
    let v46: [Double] = v37[0]
    v38.p0 = v27
    let v92: [[s0]] = [v27, v9, v43, v5, v14]
    let v161: [[Double]] = v4.p0
    v38.p1 = v23
    v2.p1 = v100
    v2.p0 = v161
    let v102: [s0] = v92[2]
    v3.p2 = v16
    v38.p1 = v69
    let v120: s0 = v34[0]
    v38.p2 = v16
    v17[0] = v19
    let v112: s3 = s3(p0: v102, p1: v51, p2: v16)
    v43[2] = v120
    v38.p0 = v43
    v85[2] = v46
    v2.p0 = v85
    v17[0] = v19
    return v112
  }
  func f77(_ v0: s4) -> s4 {
    let v6: [s3] = v0.p1
    let v3: s3 = v6[0]
    let v13: s3 = f79(v3)
    let v9: s4 = f87(v0, v13)
    return v9
  }
  func f59(_ v0: s0, _ v1: s3, _ v2: s4) -> s3 {
    var v6: s4 = v2
    let v3: [[Double]] = v0.p1
    var v4: s0 = v0
    let v9: s0 = v2.p0
    v4.p1 = v3
    let v10: s3 = f79(v1)
    var v12: s4 = v6
    let v22: s4 = f77(v12)
    let v17: [[Double]] = v0.p0
    let v14: s0 = v1.p1
    let v16: s4 = f87(v22, v10)
    v12.p2 = v4
    v4.p0 = v17
    let v27: [s3] = v16.p1
    v6.p0 = v9
    let v28: s3 = v27[0]
    v12.p2 = v14
    return v28
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s7], _ v2: [s4], _ v3: [s0], _ v4: Double) -> Double {
    let v6: s4 = v2[1]
    let v7: s0 = v3[1]
    let v5: s3 = f79(v0)
    let v14: s3 = f59(v7, v5, v6)
    let v8: s5 = s5(p0: v14, p1: v4)
    let v53: Double = v8.p1
    var v34: Double = v53
    return v34
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]), p2: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])])
    let v1: [s7] = [s7(p0: [[s6(p0: s1(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), p1: [[s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])]], p2: 48.0, p3: s0(p0: [[49.0], [50.0], [51.0]], p1: [[52.0], [53.0], [54.0]])), p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0], [60.0]]))], [s6(p0: s1(p0: s0(p0: [[61.0], [62.0], [63.0]], p1: [[64.0], [65.0], [66.0]]), p1: [[s0(p0: [[67.0], [68.0], [69.0]], p1: [[70.0], [71.0], [72.0]])]], p2: 73.0, p3: s0(p0: [[74.0], [75.0], [76.0]], p1: [[77.0], [78.0], [79.0]])), p1: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0], [85.0]]))]], p1: s5(p0: s3(p0: [s0(p0: [[86.0], [87.0], [88.0]], p1: [[89.0], [90.0], [91.0]]), s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0], [96.0], [97.0]]), s0(p0: [[98.0], [99.0], [100.0]], p1: [[101.0], [102.0], [103.0]])], p1: s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0], [108.0], [109.0]]), p2: [s0(p0: [[110.0], [111.0], [112.0]], p1: [[113.0], [114.0], [115.0]]), s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0], [120.0], [121.0]])]), p1: 122.0)), s7(p0: [[s6(p0: s1(p0: s0(p0: [[123.0], [124.0], [125.0]], p1: [[126.0], [127.0], [128.0]]), p1: [[s0(p0: [[129.0], [130.0], [131.0]], p1: [[132.0], [133.0], [134.0]])]], p2: 135.0, p3: s0(p0: [[136.0], [137.0], [138.0]], p1: [[139.0], [140.0], [141.0]])), p1: s0(p0: [[142.0], [143.0], [144.0]], p1: [[145.0], [146.0], [147.0]]))], [s6(p0: s1(p0: s0(p0: [[148.0], [149.0], [150.0]], p1: [[151.0], [152.0], [153.0]]), p1: [[s0(p0: [[154.0], [155.0], [156.0]], p1: [[157.0], [158.0], [159.0]])]], p2: 160.0, p3: s0(p0: [[161.0], [162.0], [163.0]], p1: [[164.0], [165.0], [166.0]])), p1: s0(p0: [[167.0], [168.0], [169.0]], p1: [[170.0], [171.0], [172.0]]))]], p1: s5(p0: s3(p0: [s0(p0: [[173.0], [174.0], [175.0]], p1: [[176.0], [177.0], [178.0]]), s0(p0: [[179.0], [180.0], [181.0]], p1: [[182.0], [183.0], [184.0]]), s0(p0: [[185.0], [186.0], [187.0]], p1: [[188.0], [189.0], [190.0]])], p1: s0(p0: [[191.0], [192.0], [193.0]], p1: [[194.0], [195.0], [196.0]]), p2: [s0(p0: [[197.0], [198.0], [199.0]], p1: [[200.0], [201.0], [202.0]]), s0(p0: [[203.0], [204.0], [205.0]], p1: [[206.0], [207.0], [208.0]])]), p1: 209.0)), s7(p0: [[s6(p0: s1(p0: s0(p0: [[210.0], [211.0], [212.0]], p1: [[213.0], [214.0], [215.0]]), p1: [[s0(p0: [[216.0], [217.0], [218.0]], p1: [[219.0], [220.0], [221.0]])]], p2: 222.0, p3: s0(p0: [[223.0], [224.0], [225.0]], p1: [[226.0], [227.0], [228.0]])), p1: s0(p0: [[229.0], [230.0], [231.0]], p1: [[232.0], [233.0], [234.0]]))], [s6(p0: s1(p0: s0(p0: [[235.0], [236.0], [237.0]], p1: [[238.0], [239.0], [240.0]]), p1: [[s0(p0: [[241.0], [242.0], [243.0]], p1: [[244.0], [245.0], [246.0]])]], p2: 247.0, p3: s0(p0: [[248.0], [249.0], [250.0]], p1: [[251.0], [252.0], [253.0]])), p1: s0(p0: [[254.0], [255.0], [256.0]], p1: [[257.0], [258.0], [259.0]]))]], p1: s5(p0: s3(p0: [s0(p0: [[260.0], [261.0], [262.0]], p1: [[263.0], [264.0], [265.0]]), s0(p0: [[266.0], [267.0], [268.0]], p1: [[269.0], [270.0], [271.0]]), s0(p0: [[272.0], [273.0], [274.0]], p1: [[275.0], [276.0], [277.0]])], p1: s0(p0: [[278.0], [279.0], [280.0]], p1: [[281.0], [282.0], [283.0]]), p2: [s0(p0: [[284.0], [285.0], [286.0]], p1: [[287.0], [288.0], [289.0]]), s0(p0: [[290.0], [291.0], [292.0]], p1: [[293.0], [294.0], [295.0]])]), p1: 296.0))]
    let v2: [s4] = [s4(p0: s0(p0: [[297.0], [298.0], [299.0]], p1: [[300.0], [301.0], [302.0]]), p1: [s3(p0: [s0(p0: [[303.0], [304.0], [305.0]], p1: [[306.0], [307.0], [308.0]]), s0(p0: [[309.0], [310.0], [311.0]], p1: [[312.0], [313.0], [314.0]]), s0(p0: [[315.0], [316.0], [317.0]], p1: [[318.0], [319.0], [320.0]])], p1: s0(p0: [[321.0], [322.0], [323.0]], p1: [[324.0], [325.0], [326.0]]), p2: [s0(p0: [[327.0], [328.0], [329.0]], p1: [[330.0], [331.0], [332.0]]), s0(p0: [[333.0], [334.0], [335.0]], p1: [[336.0], [337.0], [338.0]])])], p2: s0(p0: [[339.0], [340.0], [341.0]], p1: [[342.0], [343.0], [344.0]])), s4(p0: s0(p0: [[345.0], [346.0], [347.0]], p1: [[348.0], [349.0], [350.0]]), p1: [s3(p0: [s0(p0: [[351.0], [352.0], [353.0]], p1: [[354.0], [355.0], [356.0]]), s0(p0: [[357.0], [358.0], [359.0]], p1: [[360.0], [361.0], [362.0]]), s0(p0: [[363.0], [364.0], [365.0]], p1: [[366.0], [367.0], [368.0]])], p1: s0(p0: [[369.0], [370.0], [371.0]], p1: [[372.0], [373.0], [374.0]]), p2: [s0(p0: [[375.0], [376.0], [377.0]], p1: [[378.0], [379.0], [380.0]]), s0(p0: [[381.0], [382.0], [383.0]], p1: [[384.0], [385.0], [386.0]])])], p2: s0(p0: [[387.0], [388.0], [389.0]], p1: [[390.0], [391.0], [392.0]]))]
    let v3: [s0] = [s0(p0: [[393.0], [394.0], [395.0]], p1: [[396.0], [397.0], [398.0]]), s0(p0: [[399.0], [400.0], [401.0]], p1: [[402.0], [403.0], [404.0]]), s0(p0: [[405.0], [406.0], [407.0]], p1: [[408.0], [409.0], [410.0]])]
    let v4: Double = 411.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 411.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
