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
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: Double
    var p1: s1
    var p2: s1
    var p3: s0
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  struct s5 {
    var p0: [[s0]]
    var p1: [s0]
  }
  func f120(_ v0: Double) -> Double {
    var v3: Double = v0
    var v7: Double = v3
    var v4: Double = v7
    v4 = v3
    var v1: Double = v0
    var v6: Double = v0
    var v9: Double = v3
    var v24: Double = v3
    var v8: Double = v24
    var v12: Double = v8
    var v11: Double = v3
    let v25: [Double] = [v24, v11, v1]
    var v18: Double = v9
    var v29: [Double] = v25
    var v48: [Double] = v25
    let v14: Double = v48[0]
    v48[1] = v18
    let v43: Double = v24 / v14
    v9 = v0
    var v22: Double = v0
    let v37: [Double] = [v22, v24, v6, v24, v43]
    v29[0] = v9
    let v16: Double = v29[2]
    var v39: Double = v16
    v29[0] = v3
    let v33: Double = v37[0]
    var v53: [Double] = v37
    var v70: [Double] = v53
    var v41: [Double] = v53
    let v57: Double = v37[4]
    var v42: Double = v4
    v41[3] = v39
    var v67: Double = v1
    var v77: [Double] = v37
    let v49: [[Double]] = [v70, v70, v77, v41]
    v53[2] = v12
    var v55: [[Double]] = v49
    v53[3] = v42
    var v79: [[Double]] = v55
    var v92: [[Double]] = v79
    v53[0] = v42
    let v102: [Double] = v92[3]
    v41[2] = v67
    var v58: [Double] = v102
    let v130: Double = v58[3]
    v7 = v57
    let v256: Double = v33 + v130
    return v256
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: [s3], _ v2: [[s0]], _ v3: s5, _ v4: Double) -> Double {
    let v6: Double = f120(v4)
    var v11: Double = v6
    let v16: Double = f120(v6)
    let v24: Double = f120(v11)
    let v43: Double = v6 / v11
    v11 = v4
    v11 = v43
    let v70: Double = v24 * v16
    return v70
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]], p2: [[6.0], [7.0]], p3: [[8.0], [9.0]], p4: [[10.0]], p5: [[11.0], [12.0]])], [s0(p0: [[13.0], [14.0], [15.0]], p1: [[16.0], [17.0], [18.0]], p2: [[19.0], [20.0]], p3: [[21.0], [22.0]], p4: [[23.0]], p5: [[24.0], [25.0]])]]
    let v1: [s3] = [s3(p0: s2(p0: 26.0, p1: s1(p0: [s0(p0: [[27.0], [28.0], [29.0]], p1: [[30.0], [31.0], [32.0]], p2: [[33.0], [34.0]], p3: [[35.0], [36.0]], p4: [[37.0]], p5: [[38.0], [39.0]])], p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0], [45.0]], p2: [[46.0], [47.0]], p3: [[48.0], [49.0]], p4: [[50.0]], p5: [[51.0], [52.0]])), p2: s1(p0: [s0(p0: [[53.0], [54.0], [55.0]], p1: [[56.0], [57.0], [58.0]], p2: [[59.0], [60.0]], p3: [[61.0], [62.0]], p4: [[63.0]], p5: [[64.0], [65.0]])], p1: s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]], p2: [[72.0], [73.0]], p3: [[74.0], [75.0]], p4: [[76.0]], p5: [[77.0], [78.0]])), p3: s0(p0: [[79.0], [80.0], [81.0]], p1: [[82.0], [83.0], [84.0]], p2: [[85.0], [86.0]], p3: [[87.0], [88.0]], p4: [[89.0]], p5: [[90.0], [91.0]])), p1: s2(p0: 92.0, p1: s1(p0: [s0(p0: [[93.0], [94.0], [95.0]], p1: [[96.0], [97.0], [98.0]], p2: [[99.0], [100.0]], p3: [[101.0], [102.0]], p4: [[103.0]], p5: [[104.0], [105.0]])], p1: s0(p0: [[106.0], [107.0], [108.0]], p1: [[109.0], [110.0], [111.0]], p2: [[112.0], [113.0]], p3: [[114.0], [115.0]], p4: [[116.0]], p5: [[117.0], [118.0]])), p2: s1(p0: [s0(p0: [[119.0], [120.0], [121.0]], p1: [[122.0], [123.0], [124.0]], p2: [[125.0], [126.0]], p3: [[127.0], [128.0]], p4: [[129.0]], p5: [[130.0], [131.0]])], p1: s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0], [136.0], [137.0]], p2: [[138.0], [139.0]], p3: [[140.0], [141.0]], p4: [[142.0]], p5: [[143.0], [144.0]])), p3: s0(p0: [[145.0], [146.0], [147.0]], p1: [[148.0], [149.0], [150.0]], p2: [[151.0], [152.0]], p3: [[153.0], [154.0]], p4: [[155.0]], p5: [[156.0], [157.0]])))]
    let v2: [[s0]] = [[s0(p0: [[158.0], [159.0], [160.0]], p1: [[161.0], [162.0], [163.0]], p2: [[164.0], [165.0]], p3: [[166.0], [167.0]], p4: [[168.0]], p5: [[169.0], [170.0]])], [s0(p0: [[171.0], [172.0], [173.0]], p1: [[174.0], [175.0], [176.0]], p2: [[177.0], [178.0]], p3: [[179.0], [180.0]], p4: [[181.0]], p5: [[182.0], [183.0]])], [s0(p0: [[184.0], [185.0], [186.0]], p1: [[187.0], [188.0], [189.0]], p2: [[190.0], [191.0]], p3: [[192.0], [193.0]], p4: [[194.0]], p5: [[195.0], [196.0]])]]
    let v3: s5 = s5(p0: [[s0(p0: [[197.0], [198.0], [199.0]], p1: [[200.0], [201.0], [202.0]], p2: [[203.0], [204.0]], p3: [[205.0], [206.0]], p4: [[207.0]], p5: [[208.0], [209.0]])]], p1: [s0(p0: [[210.0], [211.0], [212.0]], p1: [[213.0], [214.0], [215.0]], p2: [[216.0], [217.0]], p3: [[218.0], [219.0]], p4: [[220.0]], p5: [[221.0], [222.0]]), s0(p0: [[223.0], [224.0], [225.0]], p1: [[226.0], [227.0], [228.0]], p2: [[229.0], [230.0]], p3: [[231.0], [232.0]], p4: [[233.0]], p5: [[234.0], [235.0]]), s0(p0: [[236.0], [237.0], [238.0]], p1: [[239.0], [240.0], [241.0]], p2: [[242.0], [243.0]], p3: [[244.0], [245.0]], p4: [[246.0]], p5: [[247.0], [248.0]])])
    let v4: Double = 249.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 249.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
