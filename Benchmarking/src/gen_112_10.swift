  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s4 {
    var p0: s0
    var p1: [s2]
  }
  struct s5 {
    var p0: [s4]
    var p1: s2
    var p2: s1
  }
  struct s6 {
    var p0: [[s0]]
    var p1: s5
  }
  func f114(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v3: [s0] = [v7]
    let v10: s0 = v3[0]
    return v10
  }
  func f101(_ v0: s0, _ v1: s1) -> s0 {
    let v5: s0 = f114(v0)
    let v2: s0 = f114(v5)
    let v30: s0 = f114(v2)
    let v22: s0 = f114(v30)
    return v22
  }
  func f81(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v3: [[Double]] = v7.p0
    let v1: s0 = f114(v0)
    var v4: [[Double]] = v3
    let v8: s0 = f114(v1)
    let v6: s0 = f114(v7)
    var v2: [[Double]] = v4
    v7.p0 = v3
    let v9: s0 = f114(v1)
    v2 = v3
    let v12: [s0] = [v6, v9, v0, v6, v7, v8]
    v7.p0 = v3
    let v13: s0 = f114(v1)
    let v11: [[Double]] = v7.p0
    var v16: s0 = v13
    let v25: s0 = f114(v16)
    let v42: [[Double]] = v25.p0
    v7.p0 = v42
    v7.p0 = v2
    let v51: s0 = v12[5]
    v7.p0 = v11
    return v51
  }
  func f80(_ v0: s1) -> s1 {
    var v2: s1 = v0
    return v2
  }
  func f66(_ v0: s1) -> s1 {
    var v6: s1 = v0
    let v1: [s0] = v6.p0
    let v4: s0 = v1[1]
    let v14: s0 = f101(v4, v0)
    v6.p1 = v14
    return v6
  }
  func f35(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p0
    let v2: s0 = f81(v0)
    let v15: s0 = f81(v2)
    let v8: s0 = f81(v0)
    let v4: s0 = f114(v0)
    let v11: [[Double]] = v4.p1
    var v21: s0 = v0
    v21.p1 = v11
    let v16: s0 = f114(v21)
    v21.p0 = v1
    let v44: s0 = f114(v15)
    v21.p1 = v11
    let v61: [[Double]] = v44.p0
    v21.p0 = v61
    let v96: [[Double]] = v8.p0
    v21.p0 = v96
    return v16
  }
  func f25(_ v0: Double) -> Double {
    var v2: Double = v0
    var v3: Double = v0
    var v1: Double = v2
    let v6: Double = v1 / v1
    var v5: Double = v2
    var v10: Double = v3
    var v7: Double = v5
    v3 = v6
    var v4: Double = v1
    var v8: Double = v0
    let v9: Double = v2 * v10
    var v13: Double = v7
    v5 = v6
    var v21: Double = v5
    let v17: Double = v0 / v21
    v4 = v17
    var v29: Double = v8
    var v43: Double = v4
    var v14: Double = v9
    var v19: Double = v14
    let v25: [Double] = [v6, v43, v10, v29]
    var v71: [Double] = v25
    let v32: Double = v25[1]
    var v37: [Double] = v71
    var v39: [Double] = v71
    v4 = v13
    var v46: Double = v32
    v29 = v3
    v5 = v10
    let v53: Double = v37[0]
    let v55: Double = v39[0]
    v39[0] = v53
    v71[0] = v19
    v39[2] = v46
    v39[1] = v13
    return v55
  }
  func f16(_ v0: Double) -> Double {
    let v1: Double = f25(v0)
    var v4: Double = v0
    let v7: Double = f25(v0)
    let v2: Double = f25(v0)
    var v5: Double = v4
    var v6: Double = v1
    var v12: Double = v1
    let v3: Double = f25(v12)
    var v8: Double = v6
    var v9: Double = v0
    var v15: Double = v0
    let v11: Double = f25(v9)
    var v28: Double = v5
    var v10: Double = v0
    var v13: Double = v10
    let v18: Double = f25(v10)
    let v27: Double = f25(v7)
    var v40: Double = v15
    let v24: Double = f25(v28)
    let v21: [Double] = [v2, v18, v18, v4, v3, v4, v3]
    var v34: [Double] = v21
    var v16: [Double] = v21
    var v19: Double = v24
    var v41: Double = v8
    let v26: Double = v16[1]
    v5 = v40
    var v61: [Double] = v21
    v61[5] = v40
    var v22: [Double] = v61
    v16[2] = v41
    var v64: [Double] = v34
    v16[5] = v26
    v10 = v11
    let v73: [[Double]] = [v34, v61, v64, v34]
    var v51: [Double] = v22
    var v71: [[Double]] = v73
    let v66: Double = v51[1]
    var v57: Double = v18
    v16[0] = v15
    v71[2] = v16
    let v115: [Double] = v71[1]
    v61[0] = v27
    v16[1] = v66
    let v94: Double = v13 - v24
    v16[3] = v57
    let v106: Double = v115[5]
    v71[0] = v22
    v22[5] = v18
    v61[0] = v11
    v16[1] = v94
    v51[4] = v9
    v71[2] = v21
    v64[5] = v19
    let v176: Double = f25(v106)
    return v176
  }
  func f11(_ v0: s0) -> s0 {
    var v5: s0 = v0
    var v4: s0 = v0
    let v3: s0 = f114(v0)
    let v6: s0 = f114(v3)
    let v2: [[Double]] = v5.p0
    let v7: s0 = f81(v3)
    let v8: s0 = f81(v4)
    let v12: [[Double]] = v0.p1
    var v10: [[Double]] = v2
    v5.p1 = v12
    let v1: s0 = f114(v0)
    let v13: [s0] = [v7, v8, v5, v0]
    let v33: s0 = f35(v0)
    v4.p0 = v2
    let v15: s0 = v13[2]
    let v32: s0 = f114(v5)
    var v11: [s0] = v13
    let v18: [Double] = v10[0]
    v11[3] = v3
    let v16: Double = v18[0]
    var v22: [[Double]] = v10
    var v20: [s0] = v13
    var v26: [[Double]] = v2
    let v29: [[Double]] = v4.p0
    let v17: s0 = f81(v6)
    let v43: [[Double]] = v7.p1
    let v25: [Double] = v29[0]
    let v27: [[Double]] = v7.p1
    v5.p0 = v26
    v4 = v15
    let v30: [[Double]] = v33.p0
    let v28: [Double] = v43[1]
    var v34: [[Double]] = v29
    var v23: [s0] = v11
    let v59: s0 = v20[1]
    v4 = v17
    let v85: [[Double]] = v32.p0
    let v49: [Double] = v22[1]
    let v57: Double = v28[0]
    let v61: Double = v25[0]
    let v44: [[Double]] = v6.p0
    let v66: s0 = f35(v1)
    v5.p0 = v85
    v5.p0 = v34
    v4.p0 = v30
    let v51: [[Double]] = v17.p0
    let v81: Double = f16(v61)
    var v53: [[Double]] = v27
    var v58: [Double] = v49
    v4.p0 = v22
    let v102: [Double] = v34[0]
    v53[1] = v58
    var v67: [Double] = v102
    var v100: [[Double]] = v53
    var v138: [[Double]] = v43
    var v63: [s0] = v23
    v67[0] = v81
    let v113: s0 = f114(v66)
    v11[0] = v8
    v34[1] = v67
    v23[3] = v33
    let v95: [Double] = v100[1]
    v4.p0 = v51
    let v106: s0 = v63[2]
    v67[0] = v57
    v5.p0 = v44
    v23[1] = v113
    let v114: [[Double]] = v59.p0
    v5.p0 = v2
    v34[2] = v95
    v67[0] = v16
    v5.p1 = v138
    v5.p0 = v114
    v5.p1 = v12
    v5.p1 = v53
    v4.p1 = v53
    return v106
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: Double) -> Double {
    var v5: Double = v1
    v5 = v1
    let v2: Double = f16(v1)
    var v4: Double = v5
    let v6: [s6] = v0[2]
    let v7: Double = f16(v2)
    var v3: [[s6]] = v0
    v3[0] = v6
    let v11: [s6] = v3[2]
    let v13: s6 = v6[0]
    v3[1] = v6
    let v12: s6 = v11[0]
    let v22: [s6] = v0[2]
    v3[2] = v22
    let v46: s5 = v13.p1
    v3[0] = v11
    let v23: [[s0]] = v12.p0
    let v24: [s6] = v3[2]
    v3[1] = v24
    let v35: s1 = v46.p2
    let v44: Double = f16(v4)
    v3[0] = v11
    let v38: [s0] = v35.p0
    let v36: s1 = f66(v35)
    var v55: [s0] = v38
    let v87: s1 = f80(v36)
    let v54: [s0] = v23[0]
    let v62: s0 = v87.p1
    let v49: s0 = f11(v62)
    v3[1] = v24
    var v34: s0 = v49
    let v28: s0 = v55[2]
    let v50: s0 = v54[0]
    let v42: [[Double]] = v34.p0
    v34.p0 = v42
    let v56: [[Double]] = v28.p0
    let v33: s0 = f81(v50)
    v55[0] = v33
    v34.p0 = v56
    v55[2] = v33
    let v133: [Double] = v56[2]
    let v98: [Double] = v42[1]
    var v76: [Double] = v133
    v76[0] = v7
    let v176: Double = v76[0]
    let v255: Double = v44 - v176
    let v131: Double = v98[0]
    v76[0] = v131
    v3[2] = v24
    return v255
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])]], p1: s5(p0: [s4(p0: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]))]), s4(p0: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])], p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])), p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]]))]), s4(p0: s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]]), s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]]), s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]])], p1: s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]])), p1: s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0]]))])], p1: s2(p0: s1(p0: [s0(p0: [[95.0], [96.0], [97.0]], p1: [[98.0], [99.0]]), s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0], [104.0]]), s0(p0: [[105.0], [106.0], [107.0]], p1: [[108.0], [109.0]])], p1: s0(p0: [[110.0], [111.0], [112.0]], p1: [[113.0], [114.0]])), p1: s0(p0: [[115.0], [116.0], [117.0]], p1: [[118.0], [119.0]])), p2: s1(p0: [s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0]]), s0(p0: [[125.0], [126.0], [127.0]], p1: [[128.0], [129.0]]), s0(p0: [[130.0], [131.0], [132.0]], p1: [[133.0], [134.0]])], p1: s0(p0: [[135.0], [136.0], [137.0]], p1: [[138.0], [139.0]]))))], [s6(p0: [[s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0], [144.0]])]], p1: s5(p0: [s4(p0: s0(p0: [[145.0], [146.0], [147.0]], p1: [[148.0], [149.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[150.0], [151.0], [152.0]], p1: [[153.0], [154.0]]), s0(p0: [[155.0], [156.0], [157.0]], p1: [[158.0], [159.0]]), s0(p0: [[160.0], [161.0], [162.0]], p1: [[163.0], [164.0]])], p1: s0(p0: [[165.0], [166.0], [167.0]], p1: [[168.0], [169.0]])), p1: s0(p0: [[170.0], [171.0], [172.0]], p1: [[173.0], [174.0]]))]), s4(p0: s0(p0: [[175.0], [176.0], [177.0]], p1: [[178.0], [179.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0], [184.0]]), s0(p0: [[185.0], [186.0], [187.0]], p1: [[188.0], [189.0]]), s0(p0: [[190.0], [191.0], [192.0]], p1: [[193.0], [194.0]])], p1: s0(p0: [[195.0], [196.0], [197.0]], p1: [[198.0], [199.0]])), p1: s0(p0: [[200.0], [201.0], [202.0]], p1: [[203.0], [204.0]]))]), s4(p0: s0(p0: [[205.0], [206.0], [207.0]], p1: [[208.0], [209.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[210.0], [211.0], [212.0]], p1: [[213.0], [214.0]]), s0(p0: [[215.0], [216.0], [217.0]], p1: [[218.0], [219.0]]), s0(p0: [[220.0], [221.0], [222.0]], p1: [[223.0], [224.0]])], p1: s0(p0: [[225.0], [226.0], [227.0]], p1: [[228.0], [229.0]])), p1: s0(p0: [[230.0], [231.0], [232.0]], p1: [[233.0], [234.0]]))])], p1: s2(p0: s1(p0: [s0(p0: [[235.0], [236.0], [237.0]], p1: [[238.0], [239.0]]), s0(p0: [[240.0], [241.0], [242.0]], p1: [[243.0], [244.0]]), s0(p0: [[245.0], [246.0], [247.0]], p1: [[248.0], [249.0]])], p1: s0(p0: [[250.0], [251.0], [252.0]], p1: [[253.0], [254.0]])), p1: s0(p0: [[255.0], [256.0], [257.0]], p1: [[258.0], [259.0]])), p2: s1(p0: [s0(p0: [[260.0], [261.0], [262.0]], p1: [[263.0], [264.0]]), s0(p0: [[265.0], [266.0], [267.0]], p1: [[268.0], [269.0]]), s0(p0: [[270.0], [271.0], [272.0]], p1: [[273.0], [274.0]])], p1: s0(p0: [[275.0], [276.0], [277.0]], p1: [[278.0], [279.0]]))))], [s6(p0: [[s0(p0: [[280.0], [281.0], [282.0]], p1: [[283.0], [284.0]])]], p1: s5(p0: [s4(p0: s0(p0: [[285.0], [286.0], [287.0]], p1: [[288.0], [289.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[290.0], [291.0], [292.0]], p1: [[293.0], [294.0]]), s0(p0: [[295.0], [296.0], [297.0]], p1: [[298.0], [299.0]]), s0(p0: [[300.0], [301.0], [302.0]], p1: [[303.0], [304.0]])], p1: s0(p0: [[305.0], [306.0], [307.0]], p1: [[308.0], [309.0]])), p1: s0(p0: [[310.0], [311.0], [312.0]], p1: [[313.0], [314.0]]))]), s4(p0: s0(p0: [[315.0], [316.0], [317.0]], p1: [[318.0], [319.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[320.0], [321.0], [322.0]], p1: [[323.0], [324.0]]), s0(p0: [[325.0], [326.0], [327.0]], p1: [[328.0], [329.0]]), s0(p0: [[330.0], [331.0], [332.0]], p1: [[333.0], [334.0]])], p1: s0(p0: [[335.0], [336.0], [337.0]], p1: [[338.0], [339.0]])), p1: s0(p0: [[340.0], [341.0], [342.0]], p1: [[343.0], [344.0]]))]), s4(p0: s0(p0: [[345.0], [346.0], [347.0]], p1: [[348.0], [349.0]]), p1: [s2(p0: s1(p0: [s0(p0: [[350.0], [351.0], [352.0]], p1: [[353.0], [354.0]]), s0(p0: [[355.0], [356.0], [357.0]], p1: [[358.0], [359.0]]), s0(p0: [[360.0], [361.0], [362.0]], p1: [[363.0], [364.0]])], p1: s0(p0: [[365.0], [366.0], [367.0]], p1: [[368.0], [369.0]])), p1: s0(p0: [[370.0], [371.0], [372.0]], p1: [[373.0], [374.0]]))])], p1: s2(p0: s1(p0: [s0(p0: [[375.0], [376.0], [377.0]], p1: [[378.0], [379.0]]), s0(p0: [[380.0], [381.0], [382.0]], p1: [[383.0], [384.0]]), s0(p0: [[385.0], [386.0], [387.0]], p1: [[388.0], [389.0]])], p1: s0(p0: [[390.0], [391.0], [392.0]], p1: [[393.0], [394.0]])), p1: s0(p0: [[395.0], [396.0], [397.0]], p1: [[398.0], [399.0]])), p2: s1(p0: [s0(p0: [[400.0], [401.0], [402.0]], p1: [[403.0], [404.0]]), s0(p0: [[405.0], [406.0], [407.0]], p1: [[408.0], [409.0]]), s0(p0: [[410.0], [411.0], [412.0]], p1: [[413.0], [414.0]])], p1: s0(p0: [[415.0], [416.0], [417.0]], p1: [[418.0], [419.0]]))))]]
    let v1: Double = 420.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 420.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
