  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: [Double]
  }
  struct s6 {
    var p0: [s2]
    var p1: s2
    var p2: Double
    var p3: s2
    var p4: s2
    var p5: s3
  }
  func f84(_ v0: Double) -> Double {
    var v3: Double = v0
    var v7: Double = v3
    var v4: Double = v3
    let v5: [Double] = [v7, v0, v7, v3, v3, v4]
    let v2: Double = v5[3]
    var v6: Double = v4
    var v35: [Double] = v5
    var v25: [Double] = v35
    let v33: Double = v35[3]
    v35[4] = v2
    let v22: Double = v25[1]
    let v47: [[Double]] = [v5, v25]
    let v23: [[[Double]]] = [v47]
    v35[5] = v22
    let v36: [[Double]] = v23[0]
    v35[2] = v0
    let v31: [[Double]] = v23[0]
    v25[4] = v6
    let v124: [Double] = v31[0]
    let v41: Double = v124[5]
    let v96: [Double] = v36[1]
    v25 = v96
    let v205: [Double] = [v41, v0, v33]
    var v71: [Double] = v205
    let v147: Double = v71[0]
    return v147
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    let v4: s6 = v0[1]
    let v7: s2 = v4.p3
    let v2: s0 = v7.p1
    let v11: [[Double]] = v2.p0
    let v35: Double = f84(v1)
    let v69: [Double] = v11[0]
    let v127: Double = v69[0]
    let v52: [Double] = [v35, v127, v35, v127, v35]
    let v84: Double = v52[2]
    let v87: Double = f84(v84)
    return v87
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: [s2(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [[s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])], [s0(p0: [[9.0]], p1: [[10.0], [11.0]])]], p2: s0(p0: [[12.0]], p1: [[13.0], [14.0]])), p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]])), s2(p0: s1(p0: s0(p0: [[18.0]], p1: [[19.0], [20.0]]), p1: [[s0(p0: [[21.0]], p1: [[22.0], [23.0]])], [s0(p0: [[24.0]], p1: [[25.0], [26.0]])], [s0(p0: [[27.0]], p1: [[28.0], [29.0]])]], p2: s0(p0: [[30.0]], p1: [[31.0], [32.0]])), p1: s0(p0: [[33.0]], p1: [[34.0], [35.0]]))], p1: s2(p0: s1(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0]]), p1: [[s0(p0: [[39.0]], p1: [[40.0], [41.0]])], [s0(p0: [[42.0]], p1: [[43.0], [44.0]])], [s0(p0: [[45.0]], p1: [[46.0], [47.0]])]], p2: s0(p0: [[48.0]], p1: [[49.0], [50.0]])), p1: s0(p0: [[51.0]], p1: [[52.0], [53.0]])), p2: 54.0, p3: s2(p0: s1(p0: s0(p0: [[55.0]], p1: [[56.0], [57.0]]), p1: [[s0(p0: [[58.0]], p1: [[59.0], [60.0]])], [s0(p0: [[61.0]], p1: [[62.0], [63.0]])], [s0(p0: [[64.0]], p1: [[65.0], [66.0]])]], p2: s0(p0: [[67.0]], p1: [[68.0], [69.0]])), p1: s0(p0: [[70.0]], p1: [[71.0], [72.0]])), p4: s2(p0: s1(p0: s0(p0: [[73.0]], p1: [[74.0], [75.0]]), p1: [[s0(p0: [[76.0]], p1: [[77.0], [78.0]])], [s0(p0: [[79.0]], p1: [[80.0], [81.0]])], [s0(p0: [[82.0]], p1: [[83.0], [84.0]])]], p2: s0(p0: [[85.0]], p1: [[86.0], [87.0]])), p1: s0(p0: [[88.0]], p1: [[89.0], [90.0]])), p5: s3(p0: [91.0, 92.0])), s6(p0: [s2(p0: s1(p0: s0(p0: [[93.0]], p1: [[94.0], [95.0]]), p1: [[s0(p0: [[96.0]], p1: [[97.0], [98.0]])], [s0(p0: [[99.0]], p1: [[100.0], [101.0]])], [s0(p0: [[102.0]], p1: [[103.0], [104.0]])]], p2: s0(p0: [[105.0]], p1: [[106.0], [107.0]])), p1: s0(p0: [[108.0]], p1: [[109.0], [110.0]])), s2(p0: s1(p0: s0(p0: [[111.0]], p1: [[112.0], [113.0]]), p1: [[s0(p0: [[114.0]], p1: [[115.0], [116.0]])], [s0(p0: [[117.0]], p1: [[118.0], [119.0]])], [s0(p0: [[120.0]], p1: [[121.0], [122.0]])]], p2: s0(p0: [[123.0]], p1: [[124.0], [125.0]])), p1: s0(p0: [[126.0]], p1: [[127.0], [128.0]]))], p1: s2(p0: s1(p0: s0(p0: [[129.0]], p1: [[130.0], [131.0]]), p1: [[s0(p0: [[132.0]], p1: [[133.0], [134.0]])], [s0(p0: [[135.0]], p1: [[136.0], [137.0]])], [s0(p0: [[138.0]], p1: [[139.0], [140.0]])]], p2: s0(p0: [[141.0]], p1: [[142.0], [143.0]])), p1: s0(p0: [[144.0]], p1: [[145.0], [146.0]])), p2: 147.0, p3: s2(p0: s1(p0: s0(p0: [[148.0]], p1: [[149.0], [150.0]]), p1: [[s0(p0: [[151.0]], p1: [[152.0], [153.0]])], [s0(p0: [[154.0]], p1: [[155.0], [156.0]])], [s0(p0: [[157.0]], p1: [[158.0], [159.0]])]], p2: s0(p0: [[160.0]], p1: [[161.0], [162.0]])), p1: s0(p0: [[163.0]], p1: [[164.0], [165.0]])), p4: s2(p0: s1(p0: s0(p0: [[166.0]], p1: [[167.0], [168.0]]), p1: [[s0(p0: [[169.0]], p1: [[170.0], [171.0]])], [s0(p0: [[172.0]], p1: [[173.0], [174.0]])], [s0(p0: [[175.0]], p1: [[176.0], [177.0]])]], p2: s0(p0: [[178.0]], p1: [[179.0], [180.0]])), p1: s0(p0: [[181.0]], p1: [[182.0], [183.0]])), p5: s3(p0: [184.0, 185.0])), s6(p0: [s2(p0: s1(p0: s0(p0: [[186.0]], p1: [[187.0], [188.0]]), p1: [[s0(p0: [[189.0]], p1: [[190.0], [191.0]])], [s0(p0: [[192.0]], p1: [[193.0], [194.0]])], [s0(p0: [[195.0]], p1: [[196.0], [197.0]])]], p2: s0(p0: [[198.0]], p1: [[199.0], [200.0]])), p1: s0(p0: [[201.0]], p1: [[202.0], [203.0]])), s2(p0: s1(p0: s0(p0: [[204.0]], p1: [[205.0], [206.0]]), p1: [[s0(p0: [[207.0]], p1: [[208.0], [209.0]])], [s0(p0: [[210.0]], p1: [[211.0], [212.0]])], [s0(p0: [[213.0]], p1: [[214.0], [215.0]])]], p2: s0(p0: [[216.0]], p1: [[217.0], [218.0]])), p1: s0(p0: [[219.0]], p1: [[220.0], [221.0]]))], p1: s2(p0: s1(p0: s0(p0: [[222.0]], p1: [[223.0], [224.0]]), p1: [[s0(p0: [[225.0]], p1: [[226.0], [227.0]])], [s0(p0: [[228.0]], p1: [[229.0], [230.0]])], [s0(p0: [[231.0]], p1: [[232.0], [233.0]])]], p2: s0(p0: [[234.0]], p1: [[235.0], [236.0]])), p1: s0(p0: [[237.0]], p1: [[238.0], [239.0]])), p2: 240.0, p3: s2(p0: s1(p0: s0(p0: [[241.0]], p1: [[242.0], [243.0]]), p1: [[s0(p0: [[244.0]], p1: [[245.0], [246.0]])], [s0(p0: [[247.0]], p1: [[248.0], [249.0]])], [s0(p0: [[250.0]], p1: [[251.0], [252.0]])]], p2: s0(p0: [[253.0]], p1: [[254.0], [255.0]])), p1: s0(p0: [[256.0]], p1: [[257.0], [258.0]])), p4: s2(p0: s1(p0: s0(p0: [[259.0]], p1: [[260.0], [261.0]]), p1: [[s0(p0: [[262.0]], p1: [[263.0], [264.0]])], [s0(p0: [[265.0]], p1: [[266.0], [267.0]])], [s0(p0: [[268.0]], p1: [[269.0], [270.0]])]], p2: s0(p0: [[271.0]], p1: [[272.0], [273.0]])), p1: s0(p0: [[274.0]], p1: [[275.0], [276.0]])), p5: s3(p0: [277.0, 278.0]))]
    let v1: Double = 279.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 279.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
