  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: s1
    var p2: [s0]
    var p3: [s0]
    var p4: [s1]
  }
  struct s4 {
    var p0: [s0]
    var p1: s2
  }
  struct s5 {
    var p0: s4
    var p1: s2
  }
  struct s6 {
    var p0: [s5]
    var p1: Double
  }
  func f41(_ v0: s2) -> s2 {
    let v2: [s1] = v0.p4
    var v3: [s1] = v2
    var v4: s2 = v0
    let v7: s1 = v3[1]
    v3[0] = v7
    let v8: s1 = v2[0]
    var v21: s2 = v4
    v21.p4 = v3
    let v12: [s0] = v4.p2
    v3[0] = v8
    v4.p2 = v12
    let v59: [s0] = v4.p2
    v4.p2 = v59
    let v78: [s1] = v21.p4
    var v97: [s1] = v78
    var v58: s2 = v21
    v58.p4 = v97
    return v58
  }
  func f33(_ v0: s4) -> s4 {
    let v6: [s0] = v0.p0
    let v2: s2 = v0.p1
    let v26: s4 = s4(p0: v6, p1: v2)
    return v26
  }
  func f21(_ v0: s5) -> s5 {
    var v7: s5 = v0
    var v3: s5 = v7
    var v8: s5 = v3
    let v4: s2 = v3.p1
    let v9: [[s1]] = v4.p0
    var v20: [[s1]] = v9
    v8.p1 = v4
    var v10: s5 = v0
    let v29: [s1] = v20[0]
    v8.p1 = v4
    v20[0] = v29
    v8 = v3
    let v63: s2 = v10.p1
    var v47: s2 = v63
    v8.p1 = v47
    let v52: s4 = v7.p0
    let v89: [s1] = v47.p4
    v10.p0 = v52
    var v28: [s1] = v89
    var v78: s4 = v52
    v3.p0 = v78
    v47.p4 = v28
    v47.p0 = v20
    return v8
  }
  func f20(_ v0: s5) -> s5 {
    let v5: s5 = f21(v0)
    let v8: s4 = v5.p0
    let v3: s2 = v5.p1
    let v15: [s2] = [v3]
    let v4: s2 = v15[0]
    let v11: s4 = f33(v8)
    let v12: s5 = f21(v0)
    let v18: [s0] = v11.p0
    let v36: s4 = s4(p0: v18, p1: v4)
    var v114: s5 = v12
    let v38: s4 = f33(v36)
    var v123: s4 = v38
    let v93: s5 = f21(v114)
    v114.p1 = v3
    v114.p0 = v123
    let v161: s5 = f21(v93)
    let v366: s5 = f21(v161)
    return v366
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    var v4: s6 = v0
    var v6: Double = v1
    var v8: Double = v6
    var v3: s6 = v0
    v4.p1 = v8
    var v2: s6 = v4
    let v9: Double = v4.p1
    let v15: [s5] = v4.p0
    let v5: Double = v4.p1
    v2.p1 = v5
    let v12: s5 = v15[0]
    let v11: s5 = f20(v12)
    let v33: s5 = v15[1]
    var v10: [s5] = v15
    v10[0] = v33
    let v22: s5 = f21(v33)
    let v20: s2 = v11.p1
    var v19: [s5] = v10
    v19[0] = v12
    var v43: [s5] = v10
    let v36: s2 = f41(v20)
    let v31: s2 = f41(v36)
    var v64: [s5] = v10
    let v87: s5 = v15[0]
    v19[0] = v87
    v3.p0 = v43
    v10[1] = v33
    let v29: Double = v2.p1
    v2.p0 = v19
    v4 = v3
    v43[1] = v33
    var v66: Double = v29
    let v94: Double = v9 * v66
    var v65: s2 = v31
    v3.p0 = v64
    var v62: s5 = v33
    v43[0] = v22
    v2.p1 = v9
    v43[1] = v62
    let v39: s5 = v15[0]
    v62.p1 = v65
    v4.p1 = v8
    v64[0] = v39
    return v94
  }
  func benchmark() {
    let v0: s6 = s6(p0: [s5(p0: s4(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s2(p0: [[s1(p0: [[s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]], p1: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]))]], p1: s1(p0: [[s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])], [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]], p1: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])), p2: [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])], p3: [s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])], p4: [s1(p0: [[s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])], [s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])], [s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])]], p1: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])), s1(p0: [[s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])], [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])], [s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]])]], p1: s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]]))])), p1: s2(p0: [[s1(p0: [[s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]])], [s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]])], [s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]])]], p1: s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]]))]], p1: s1(p0: [[s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]])], [s0(p0: [[108.0]], p1: [[109.0], [110.0], [111.0]])], [s0(p0: [[112.0]], p1: [[113.0], [114.0], [115.0]])]], p1: s0(p0: [[116.0]], p1: [[117.0], [118.0], [119.0]])), p2: [s0(p0: [[120.0]], p1: [[121.0], [122.0], [123.0]]), s0(p0: [[124.0]], p1: [[125.0], [126.0], [127.0]])], p3: [s0(p0: [[128.0]], p1: [[129.0], [130.0], [131.0]])], p4: [s1(p0: [[s0(p0: [[132.0]], p1: [[133.0], [134.0], [135.0]])], [s0(p0: [[136.0]], p1: [[137.0], [138.0], [139.0]])], [s0(p0: [[140.0]], p1: [[141.0], [142.0], [143.0]])]], p1: s0(p0: [[144.0]], p1: [[145.0], [146.0], [147.0]])), s1(p0: [[s0(p0: [[148.0]], p1: [[149.0], [150.0], [151.0]])], [s0(p0: [[152.0]], p1: [[153.0], [154.0], [155.0]])], [s0(p0: [[156.0]], p1: [[157.0], [158.0], [159.0]])]], p1: s0(p0: [[160.0]], p1: [[161.0], [162.0], [163.0]]))])), s5(p0: s4(p0: [s0(p0: [[164.0]], p1: [[165.0], [166.0], [167.0]]), s0(p0: [[168.0]], p1: [[169.0], [170.0], [171.0]]), s0(p0: [[172.0]], p1: [[173.0], [174.0], [175.0]])], p1: s2(p0: [[s1(p0: [[s0(p0: [[176.0]], p1: [[177.0], [178.0], [179.0]])], [s0(p0: [[180.0]], p1: [[181.0], [182.0], [183.0]])], [s0(p0: [[184.0]], p1: [[185.0], [186.0], [187.0]])]], p1: s0(p0: [[188.0]], p1: [[189.0], [190.0], [191.0]]))]], p1: s1(p0: [[s0(p0: [[192.0]], p1: [[193.0], [194.0], [195.0]])], [s0(p0: [[196.0]], p1: [[197.0], [198.0], [199.0]])], [s0(p0: [[200.0]], p1: [[201.0], [202.0], [203.0]])]], p1: s0(p0: [[204.0]], p1: [[205.0], [206.0], [207.0]])), p2: [s0(p0: [[208.0]], p1: [[209.0], [210.0], [211.0]]), s0(p0: [[212.0]], p1: [[213.0], [214.0], [215.0]])], p3: [s0(p0: [[216.0]], p1: [[217.0], [218.0], [219.0]])], p4: [s1(p0: [[s0(p0: [[220.0]], p1: [[221.0], [222.0], [223.0]])], [s0(p0: [[224.0]], p1: [[225.0], [226.0], [227.0]])], [s0(p0: [[228.0]], p1: [[229.0], [230.0], [231.0]])]], p1: s0(p0: [[232.0]], p1: [[233.0], [234.0], [235.0]])), s1(p0: [[s0(p0: [[236.0]], p1: [[237.0], [238.0], [239.0]])], [s0(p0: [[240.0]], p1: [[241.0], [242.0], [243.0]])], [s0(p0: [[244.0]], p1: [[245.0], [246.0], [247.0]])]], p1: s0(p0: [[248.0]], p1: [[249.0], [250.0], [251.0]]))])), p1: s2(p0: [[s1(p0: [[s0(p0: [[252.0]], p1: [[253.0], [254.0], [255.0]])], [s0(p0: [[256.0]], p1: [[257.0], [258.0], [259.0]])], [s0(p0: [[260.0]], p1: [[261.0], [262.0], [263.0]])]], p1: s0(p0: [[264.0]], p1: [[265.0], [266.0], [267.0]]))]], p1: s1(p0: [[s0(p0: [[268.0]], p1: [[269.0], [270.0], [271.0]])], [s0(p0: [[272.0]], p1: [[273.0], [274.0], [275.0]])], [s0(p0: [[276.0]], p1: [[277.0], [278.0], [279.0]])]], p1: s0(p0: [[280.0]], p1: [[281.0], [282.0], [283.0]])), p2: [s0(p0: [[284.0]], p1: [[285.0], [286.0], [287.0]]), s0(p0: [[288.0]], p1: [[289.0], [290.0], [291.0]])], p3: [s0(p0: [[292.0]], p1: [[293.0], [294.0], [295.0]])], p4: [s1(p0: [[s0(p0: [[296.0]], p1: [[297.0], [298.0], [299.0]])], [s0(p0: [[300.0]], p1: [[301.0], [302.0], [303.0]])], [s0(p0: [[304.0]], p1: [[305.0], [306.0], [307.0]])]], p1: s0(p0: [[308.0]], p1: [[309.0], [310.0], [311.0]])), s1(p0: [[s0(p0: [[312.0]], p1: [[313.0], [314.0], [315.0]])], [s0(p0: [[316.0]], p1: [[317.0], [318.0], [319.0]])], [s0(p0: [[320.0]], p1: [[321.0], [322.0], [323.0]])]], p1: s0(p0: [[324.0]], p1: [[325.0], [326.0], [327.0]]))]))], p1: 328.0)
    let v1: Double = 329.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 329.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
