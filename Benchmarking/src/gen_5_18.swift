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
    var p1: [[s1]]
  }
  struct s3 {
    var p0: s2
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s0], _ v2: [[s1]], _ v3: Double) -> Double {
    let v7: s0 = v0.p1
    let v4: [[Double]] = v7.p5
    var v5: s0 = v7
    var v10: Double = v3
    let v9: [[Double]] = v5.p2
    let v11: [Double] = v9[0]
    let v23: Double = v11[0]
    let v47: Double = v23 - v10
    var v38: Double = v23
    v38 = v47
    v10 = v47
    v5.p2 = v4
    return v38
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0], [7.0]], p3: [[8.0]], p4: [[9.0], [10.0]], p5: [[11.0], [12.0], [13.0]]), s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0], [18.0]], p2: [[19.0], [20.0], [21.0]], p3: [[22.0]], p4: [[23.0], [24.0]], p5: [[25.0], [26.0], [27.0]])], p1: [[s1(p0: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0], [32.0]], p2: [[33.0], [34.0], [35.0]], p3: [[36.0]], p4: [[37.0], [38.0]], p5: [[39.0], [40.0], [41.0]]), p1: [s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0]], p2: [[47.0], [48.0], [49.0]], p3: [[50.0]], p4: [[51.0], [52.0]], p5: [[53.0], [54.0], [55.0]]), s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0], [60.0]], p2: [[61.0], [62.0], [63.0]], p3: [[64.0]], p4: [[65.0], [66.0]], p5: [[67.0], [68.0], [69.0]])])], [s1(p0: s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]], p2: [[75.0], [76.0], [77.0]], p3: [[78.0]], p4: [[79.0], [80.0]], p5: [[81.0], [82.0], [83.0]]), p1: [s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0]], p2: [[89.0], [90.0], [91.0]], p3: [[92.0]], p4: [[93.0], [94.0]], p5: [[95.0], [96.0], [97.0]]), s0(p0: [[98.0], [99.0], [100.0]], p1: [[101.0], [102.0]], p2: [[103.0], [104.0], [105.0]], p3: [[106.0]], p4: [[107.0], [108.0]], p5: [[109.0], [110.0], [111.0]])])], [s1(p0: s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0], [116.0]], p2: [[117.0], [118.0], [119.0]], p3: [[120.0]], p4: [[121.0], [122.0]], p5: [[123.0], [124.0], [125.0]]), p1: [s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0], [130.0]], p2: [[131.0], [132.0], [133.0]], p3: [[134.0]], p4: [[135.0], [136.0]], p5: [[137.0], [138.0], [139.0]]), s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0], [144.0]], p2: [[145.0], [146.0], [147.0]], p3: [[148.0]], p4: [[149.0], [150.0]], p5: [[151.0], [152.0], [153.0]])])]]), p1: s0(p0: [[154.0], [155.0], [156.0]], p1: [[157.0], [158.0]], p2: [[159.0], [160.0], [161.0]], p3: [[162.0]], p4: [[163.0], [164.0]], p5: [[165.0], [166.0], [167.0]]))
    let v1: [s0] = [s0(p0: [[168.0], [169.0], [170.0]], p1: [[171.0], [172.0]], p2: [[173.0], [174.0], [175.0]], p3: [[176.0]], p4: [[177.0], [178.0]], p5: [[179.0], [180.0], [181.0]])]
    let v2: [[s1]] = [[s1(p0: s0(p0: [[182.0], [183.0], [184.0]], p1: [[185.0], [186.0]], p2: [[187.0], [188.0], [189.0]], p3: [[190.0]], p4: [[191.0], [192.0]], p5: [[193.0], [194.0], [195.0]]), p1: [s0(p0: [[196.0], [197.0], [198.0]], p1: [[199.0], [200.0]], p2: [[201.0], [202.0], [203.0]], p3: [[204.0]], p4: [[205.0], [206.0]], p5: [[207.0], [208.0], [209.0]]), s0(p0: [[210.0], [211.0], [212.0]], p1: [[213.0], [214.0]], p2: [[215.0], [216.0], [217.0]], p3: [[218.0]], p4: [[219.0], [220.0]], p5: [[221.0], [222.0], [223.0]])])], [s1(p0: s0(p0: [[224.0], [225.0], [226.0]], p1: [[227.0], [228.0]], p2: [[229.0], [230.0], [231.0]], p3: [[232.0]], p4: [[233.0], [234.0]], p5: [[235.0], [236.0], [237.0]]), p1: [s0(p0: [[238.0], [239.0], [240.0]], p1: [[241.0], [242.0]], p2: [[243.0], [244.0], [245.0]], p3: [[246.0]], p4: [[247.0], [248.0]], p5: [[249.0], [250.0], [251.0]]), s0(p0: [[252.0], [253.0], [254.0]], p1: [[255.0], [256.0]], p2: [[257.0], [258.0], [259.0]], p3: [[260.0]], p4: [[261.0], [262.0]], p5: [[263.0], [264.0], [265.0]])])], [s1(p0: s0(p0: [[266.0], [267.0], [268.0]], p1: [[269.0], [270.0]], p2: [[271.0], [272.0], [273.0]], p3: [[274.0]], p4: [[275.0], [276.0]], p5: [[277.0], [278.0], [279.0]]), p1: [s0(p0: [[280.0], [281.0], [282.0]], p1: [[283.0], [284.0]], p2: [[285.0], [286.0], [287.0]], p3: [[288.0]], p4: [[289.0], [290.0]], p5: [[291.0], [292.0], [293.0]]), s0(p0: [[294.0], [295.0], [296.0]], p1: [[297.0], [298.0]], p2: [[299.0], [300.0], [301.0]], p3: [[302.0]], p4: [[303.0], [304.0]], p5: [[305.0], [306.0], [307.0]])])]]
    let v3: Double = 308.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 308.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
