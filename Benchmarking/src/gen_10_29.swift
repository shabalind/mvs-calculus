  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: [s0]
    var p3: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: [s2]
    var p1: [Double]
  }
  struct s4 {
    var p0: s3
    var p1: s0
    var p2: s3
  }
  struct s5 {
    var p0: s1
    var p1: s2
  }
  func f100(_ v0: s0, _ v1: [Double]) -> [Double] {
    let v25: Double = v1[0]
    var v32: [Double] = v1
    v32[0] = v25
    return v32
  }
  func f82(_ v0: s1) -> s1 {
    return v0
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: s4, _ v2: Double) -> Double {
    let v3: s3 = v1.p0
    var v10: s3 = v3
    let v9: [s2] = v10.p0
    v10.p0 = v9
    let v5: s2 = v9[1]
    let v8: s1 = v5.p0
    var v12: s1 = v8
    let v44: s1 = v5.p0
    let v30: [s2] = v10.p0
    let v58: s1 = f82(v44)
    v10.p0 = v30
    let v48: [s0] = v58.p2
    let v51: s0 = v12.p3
    let v54: s3 = v1.p2
    v12.p3 = v51
    v12.p2 = v48
    let v85: [s0] = v12.p1
    let v90: s0 = v85[0]
    let v115: [Double] = v54.p1
    let v107: [Double] = f100(v90, v115)
    var v99: [Double] = v107
    let v155: Double = v99[1]
    return v155
  }
  func benchmark() {
    let v0: s5 = s5(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], p2: [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])], p3: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])), p1: s2(p0: s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), p1: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])], p2: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])], p3: s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])), p1: s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]]), p1: [s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]])], p2: [s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]])], p3: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]]))))
    let v1: s4 = s4(p0: s3(p0: [s2(p0: s1(p0: s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0], [94.0], [95.0]]), p1: [s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0], [100.0], [101.0]]), s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0], [106.0], [107.0]])], p2: [s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0], [112.0], [113.0]])], p3: s0(p0: [[114.0], [115.0], [116.0]], p1: [[117.0], [118.0], [119.0]])), p1: s1(p0: s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0], [125.0]]), p1: [s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0], [130.0], [131.0]]), s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0], [136.0], [137.0]])], p2: [s0(p0: [[138.0], [139.0], [140.0]], p1: [[141.0], [142.0], [143.0]])], p3: s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0], [148.0], [149.0]]))), s2(p0: s1(p0: s0(p0: [[150.0], [151.0], [152.0]], p1: [[153.0], [154.0], [155.0]]), p1: [s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0], [160.0], [161.0]]), s0(p0: [[162.0], [163.0], [164.0]], p1: [[165.0], [166.0], [167.0]])], p2: [s0(p0: [[168.0], [169.0], [170.0]], p1: [[171.0], [172.0], [173.0]])], p3: s0(p0: [[174.0], [175.0], [176.0]], p1: [[177.0], [178.0], [179.0]])), p1: s1(p0: s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0], [184.0], [185.0]]), p1: [s0(p0: [[186.0], [187.0], [188.0]], p1: [[189.0], [190.0], [191.0]]), s0(p0: [[192.0], [193.0], [194.0]], p1: [[195.0], [196.0], [197.0]])], p2: [s0(p0: [[198.0], [199.0], [200.0]], p1: [[201.0], [202.0], [203.0]])], p3: s0(p0: [[204.0], [205.0], [206.0]], p1: [[207.0], [208.0], [209.0]])))], p1: [210.0, 211.0, 212.0]), p1: s0(p0: [[213.0], [214.0], [215.0]], p1: [[216.0], [217.0], [218.0]]), p2: s3(p0: [s2(p0: s1(p0: s0(p0: [[219.0], [220.0], [221.0]], p1: [[222.0], [223.0], [224.0]]), p1: [s0(p0: [[225.0], [226.0], [227.0]], p1: [[228.0], [229.0], [230.0]]), s0(p0: [[231.0], [232.0], [233.0]], p1: [[234.0], [235.0], [236.0]])], p2: [s0(p0: [[237.0], [238.0], [239.0]], p1: [[240.0], [241.0], [242.0]])], p3: s0(p0: [[243.0], [244.0], [245.0]], p1: [[246.0], [247.0], [248.0]])), p1: s1(p0: s0(p0: [[249.0], [250.0], [251.0]], p1: [[252.0], [253.0], [254.0]]), p1: [s0(p0: [[255.0], [256.0], [257.0]], p1: [[258.0], [259.0], [260.0]]), s0(p0: [[261.0], [262.0], [263.0]], p1: [[264.0], [265.0], [266.0]])], p2: [s0(p0: [[267.0], [268.0], [269.0]], p1: [[270.0], [271.0], [272.0]])], p3: s0(p0: [[273.0], [274.0], [275.0]], p1: [[276.0], [277.0], [278.0]]))), s2(p0: s1(p0: s0(p0: [[279.0], [280.0], [281.0]], p1: [[282.0], [283.0], [284.0]]), p1: [s0(p0: [[285.0], [286.0], [287.0]], p1: [[288.0], [289.0], [290.0]]), s0(p0: [[291.0], [292.0], [293.0]], p1: [[294.0], [295.0], [296.0]])], p2: [s0(p0: [[297.0], [298.0], [299.0]], p1: [[300.0], [301.0], [302.0]])], p3: s0(p0: [[303.0], [304.0], [305.0]], p1: [[306.0], [307.0], [308.0]])), p1: s1(p0: s0(p0: [[309.0], [310.0], [311.0]], p1: [[312.0], [313.0], [314.0]]), p1: [s0(p0: [[315.0], [316.0], [317.0]], p1: [[318.0], [319.0], [320.0]]), s0(p0: [[321.0], [322.0], [323.0]], p1: [[324.0], [325.0], [326.0]])], p2: [s0(p0: [[327.0], [328.0], [329.0]], p1: [[330.0], [331.0], [332.0]])], p3: s0(p0: [[333.0], [334.0], [335.0]], p1: [[336.0], [337.0], [338.0]])))], p1: [339.0, 340.0, 341.0]))
    let v2: Double = 342.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 342.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
