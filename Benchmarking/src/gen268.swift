  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: [[s2]]
    var p1: [s2]
  }
  struct s4 {
    var p0: [[s2]]
    var p1: [s0]
  }
  struct s5 {
    var p0: s4
    var p1: s3
    var p2: [s1]
    var p3: [[s3]]
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    let v2: Double = v1 + v1
    let v9: [[s3]] = v0.p3
    var v3: s5 = v0
    let v4: [s3] = v9[1]
    var v7: [s3] = v4
    let v8: s4 = v3.p0
    let v6: [s3] = v9[1]
    let v5: [s0] = v8.p1
    var v28: s4 = v8
    let v11: s0 = v5[0]
    let v18: [[Double]] = v11.p0
    var v16: Double = v2
    v28.p1 = v5
    var v29: s4 = v28
    let v17: [s0] = v28.p1
    let v21: [Double] = v18[0]
    var v34: s0 = v11
    v34.p1 = v18
    let v22: Double = v21[0]
    let v19: [s3] = v9[1]
    let v30: [[s2]] = v8.p0
    let v63: s4 = v3.p0
    var v52: [[s2]] = v30
    v29.p1 = v17
    let v35: s3 = v19[0]
    let v42: s4 = s4(p0: v52, p1: v5)
    var v88: [s3] = v6
    v3.p0 = v28
    let v58: s0 = v17[0]
    let v109: [s3] = [v35, v35, v35]
    var v73: [s0] = v5
    v7[0] = v35
    let v64: s3 = v109[1]
    let v54: [[Double]] = v58.p0
    var v74: [s0] = v17
    let v33: [s0] = v42.p1
    v29.p0 = v30
    var v78: s3 = v35
    let v92: s4 = s4(p0: v52, p1: v73)
    v73[0] = v34
    v29.p0 = v30
    let v85: s3 = v7[0]
    let v45: [s2] = v64.p1
    let v43: Double = v16 - v22
    var v111: Double = v43
    let v65: [s1] = v3.p2
    v34.p1 = v54
    let v56: s1 = v65[0]
    v78.p1 = v45
    let v114: [[s0]] = v56.p1
    v28.p1 = v33
    let v132: [s0] = v114[2]
    var v105: s5 = v0
    let v104: [[s2]] = v29.p0
    let v98: [s0] = v63.p1
    v29.p1 = v98
    var v291: Double = v2
    v28.p0 = v104
    v29.p1 = v132
    var v89: s5 = v105
    v34.p0 = v18
    let v148: [s1] = v89.p2
    v105.p1 = v85
    v28.p1 = v74
    var v145: [s1] = v148
    v78.p1 = v45
    v3.p0 = v92
    let v147: Double = v291 * v22
    let v91: Double = v111 + v111
    var v69: [s1] = v145
    v88[0] = v85
    v3.p2 = v69
    let v143: Double = v91 * v43
    v29.p0 = v104
    v88[0] = v78
    v69[0] = v56
    let v136: Double = v147 + v143
    v7 = v88
    v88[0] = v85
    v29.p1 = v33
    v291 = v143
    return v136
  }
  func benchmark() {
    let v0: s5 = s5(p0: s4(p0: [[s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: [[s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])]])], p1: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]))]], p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])]), p1: s3(p0: [[s2(p0: [s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), p1: [[s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])], [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])], [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])]])], p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]))]], p1: [s2(p0: [s1(p0: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), p1: [[s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])], [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])], [s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]])]])], p1: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]])), s2(p0: [s1(p0: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]]), p1: [[s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]])], [s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]])], [s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]])]])], p1: s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]])), s2(p0: [s1(p0: s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]]), p1: [[s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]])], [s0(p0: [[92.0], [93.0]], p1: [[94.0], [95.0]])], [s0(p0: [[96.0], [97.0]], p1: [[98.0], [99.0]])]])], p1: s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0]]))]), p2: [s1(p0: s0(p0: [[104.0], [105.0]], p1: [[106.0], [107.0]]), p1: [[s0(p0: [[108.0], [109.0]], p1: [[110.0], [111.0]])], [s0(p0: [[112.0], [113.0]], p1: [[114.0], [115.0]])], [s0(p0: [[116.0], [117.0]], p1: [[118.0], [119.0]])]])], p3: [[s3(p0: [[s2(p0: [s1(p0: s0(p0: [[120.0], [121.0]], p1: [[122.0], [123.0]]), p1: [[s0(p0: [[124.0], [125.0]], p1: [[126.0], [127.0]])], [s0(p0: [[128.0], [129.0]], p1: [[130.0], [131.0]])], [s0(p0: [[132.0], [133.0]], p1: [[134.0], [135.0]])]])], p1: s0(p0: [[136.0], [137.0]], p1: [[138.0], [139.0]]))]], p1: [s2(p0: [s1(p0: s0(p0: [[140.0], [141.0]], p1: [[142.0], [143.0]]), p1: [[s0(p0: [[144.0], [145.0]], p1: [[146.0], [147.0]])], [s0(p0: [[148.0], [149.0]], p1: [[150.0], [151.0]])], [s0(p0: [[152.0], [153.0]], p1: [[154.0], [155.0]])]])], p1: s0(p0: [[156.0], [157.0]], p1: [[158.0], [159.0]])), s2(p0: [s1(p0: s0(p0: [[160.0], [161.0]], p1: [[162.0], [163.0]]), p1: [[s0(p0: [[164.0], [165.0]], p1: [[166.0], [167.0]])], [s0(p0: [[168.0], [169.0]], p1: [[170.0], [171.0]])], [s0(p0: [[172.0], [173.0]], p1: [[174.0], [175.0]])]])], p1: s0(p0: [[176.0], [177.0]], p1: [[178.0], [179.0]])), s2(p0: [s1(p0: s0(p0: [[180.0], [181.0]], p1: [[182.0], [183.0]]), p1: [[s0(p0: [[184.0], [185.0]], p1: [[186.0], [187.0]])], [s0(p0: [[188.0], [189.0]], p1: [[190.0], [191.0]])], [s0(p0: [[192.0], [193.0]], p1: [[194.0], [195.0]])]])], p1: s0(p0: [[196.0], [197.0]], p1: [[198.0], [199.0]]))])], [s3(p0: [[s2(p0: [s1(p0: s0(p0: [[200.0], [201.0]], p1: [[202.0], [203.0]]), p1: [[s0(p0: [[204.0], [205.0]], p1: [[206.0], [207.0]])], [s0(p0: [[208.0], [209.0]], p1: [[210.0], [211.0]])], [s0(p0: [[212.0], [213.0]], p1: [[214.0], [215.0]])]])], p1: s0(p0: [[216.0], [217.0]], p1: [[218.0], [219.0]]))]], p1: [s2(p0: [s1(p0: s0(p0: [[220.0], [221.0]], p1: [[222.0], [223.0]]), p1: [[s0(p0: [[224.0], [225.0]], p1: [[226.0], [227.0]])], [s0(p0: [[228.0], [229.0]], p1: [[230.0], [231.0]])], [s0(p0: [[232.0], [233.0]], p1: [[234.0], [235.0]])]])], p1: s0(p0: [[236.0], [237.0]], p1: [[238.0], [239.0]])), s2(p0: [s1(p0: s0(p0: [[240.0], [241.0]], p1: [[242.0], [243.0]]), p1: [[s0(p0: [[244.0], [245.0]], p1: [[246.0], [247.0]])], [s0(p0: [[248.0], [249.0]], p1: [[250.0], [251.0]])], [s0(p0: [[252.0], [253.0]], p1: [[254.0], [255.0]])]])], p1: s0(p0: [[256.0], [257.0]], p1: [[258.0], [259.0]])), s2(p0: [s1(p0: s0(p0: [[260.0], [261.0]], p1: [[262.0], [263.0]]), p1: [[s0(p0: [[264.0], [265.0]], p1: [[266.0], [267.0]])], [s0(p0: [[268.0], [269.0]], p1: [[270.0], [271.0]])], [s0(p0: [[272.0], [273.0]], p1: [[274.0], [275.0]])]])], p1: s0(p0: [[276.0], [277.0]], p1: [[278.0], [279.0]]))])]])
    let v1: Double = 280.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 280.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
