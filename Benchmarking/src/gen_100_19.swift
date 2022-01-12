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
    var p0: [[s0]]
    var p1: s1
  }
  struct s3 {
    var p0: s0
    var p1: [s2]
  }
  struct s4 {
    var p0: s2
    var p1: s0
  }
  struct s5 {
    var p0: s3
    var p1: s4
  }
  struct s6 {
    var p0: s1
    var p1: s3
  }
  struct s8 {
    var p0: [[s6]]
    var p1: s5
  }
  func f20(_ v0: Double) -> Double {
    var v2: Double = v0
    var v4: Double = v2
    var v1: Double = v0
    var v6: Double = v0
    var v3: Double = v2
    var v8: Double = v6
    var v11: Double = v2
    var v7: Double = v8
    let v15: [Double] = [v8, v7, v11, v6, v3, v4, v1]
    var v14: [Double] = v15
    let v12: Double = v15[6]
    v14[1] = v1
    v7 = v12
    v14[5] = v7
    let v19: [[Double]] = [v15, v15, v14]
    let v17: [Double] = v19[0]
    let v25: Double = v17[5]
    v3 = v2
    v8 = v4
    v14[3] = v7
    return v25
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s8, _ v2: Double, _ v3: [[s5]]) -> Double {
    let v14: Double = f20(v2)
    let v26: Double = f20(v14)
    let v33: Double = f20(v14)
    let v136: Double = v26 - v33
    let v133: Double = f20(v136)
    return v133
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]
    let v1: s8 = s8(p0: [[s6(p0: s1(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), p1: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]), p1: s3(p0: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), p1: [s2(p0: [[s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])], [s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])]], p1: s1(p0: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p1: [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]))]))], [s6(p0: s1(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])]), p1: s3(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p1: [s2(p0: [[s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])], [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])]], p1: s1(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), p1: [s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])]))]))]], p1: s5(p0: s3(p0: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]]), p1: [s2(p0: [[s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])], [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])]], p1: s1(p0: s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]]), p1: [s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]])]))]), p1: s4(p0: s2(p0: [[s0(p0: [[88.0]], p1: [[89.0], [90.0], [91.0]])], [s0(p0: [[92.0]], p1: [[93.0], [94.0], [95.0]])]], p1: s1(p0: s0(p0: [[96.0]], p1: [[97.0], [98.0], [99.0]]), p1: [s0(p0: [[100.0]], p1: [[101.0], [102.0], [103.0]])])), p1: s0(p0: [[104.0]], p1: [[105.0], [106.0], [107.0]]))))
    let v2: Double = 108.0
    let v3: [[s5]] = [[s5(p0: s3(p0: s0(p0: [[109.0]], p1: [[110.0], [111.0], [112.0]]), p1: [s2(p0: [[s0(p0: [[113.0]], p1: [[114.0], [115.0], [116.0]])], [s0(p0: [[117.0]], p1: [[118.0], [119.0], [120.0]])]], p1: s1(p0: s0(p0: [[121.0]], p1: [[122.0], [123.0], [124.0]]), p1: [s0(p0: [[125.0]], p1: [[126.0], [127.0], [128.0]])]))]), p1: s4(p0: s2(p0: [[s0(p0: [[129.0]], p1: [[130.0], [131.0], [132.0]])], [s0(p0: [[133.0]], p1: [[134.0], [135.0], [136.0]])]], p1: s1(p0: s0(p0: [[137.0]], p1: [[138.0], [139.0], [140.0]]), p1: [s0(p0: [[141.0]], p1: [[142.0], [143.0], [144.0]])])), p1: s0(p0: [[145.0]], p1: [[146.0], [147.0], [148.0]])))], [s5(p0: s3(p0: s0(p0: [[149.0]], p1: [[150.0], [151.0], [152.0]]), p1: [s2(p0: [[s0(p0: [[153.0]], p1: [[154.0], [155.0], [156.0]])], [s0(p0: [[157.0]], p1: [[158.0], [159.0], [160.0]])]], p1: s1(p0: s0(p0: [[161.0]], p1: [[162.0], [163.0], [164.0]]), p1: [s0(p0: [[165.0]], p1: [[166.0], [167.0], [168.0]])]))]), p1: s4(p0: s2(p0: [[s0(p0: [[169.0]], p1: [[170.0], [171.0], [172.0]])], [s0(p0: [[173.0]], p1: [[174.0], [175.0], [176.0]])]], p1: s1(p0: s0(p0: [[177.0]], p1: [[178.0], [179.0], [180.0]]), p1: [s0(p0: [[181.0]], p1: [[182.0], [183.0], [184.0]])])), p1: s0(p0: [[185.0]], p1: [[186.0], [187.0], [188.0]])))], [s5(p0: s3(p0: s0(p0: [[189.0]], p1: [[190.0], [191.0], [192.0]]), p1: [s2(p0: [[s0(p0: [[193.0]], p1: [[194.0], [195.0], [196.0]])], [s0(p0: [[197.0]], p1: [[198.0], [199.0], [200.0]])]], p1: s1(p0: s0(p0: [[201.0]], p1: [[202.0], [203.0], [204.0]]), p1: [s0(p0: [[205.0]], p1: [[206.0], [207.0], [208.0]])]))]), p1: s4(p0: s2(p0: [[s0(p0: [[209.0]], p1: [[210.0], [211.0], [212.0]])], [s0(p0: [[213.0]], p1: [[214.0], [215.0], [216.0]])]], p1: s1(p0: s0(p0: [[217.0]], p1: [[218.0], [219.0], [220.0]]), p1: [s0(p0: [[221.0]], p1: [[222.0], [223.0], [224.0]])])), p1: s0(p0: [[225.0]], p1: [[226.0], [227.0], [228.0]])))]]
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = [[StructValue(Name(str='s5', ty=None), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[109.0]], [[110.0], [111.0], [112.0]]]), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[113.0]], [[114.0], [115.0], [116.0]]])], [StructValue(Name(str='s0', ty=None), [[[117.0]], [[118.0], [119.0], [120.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[121.0]], [[122.0], [123.0], [124.0]]]), [StructValue(Name(str='s0', ty=None), [[[125.0]], [[126.0], [127.0], [128.0]]])]])])]]), StructValue(Name(str='s4', ty=None), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[129.0]], [[130.0], [131.0], [132.0]]])], [StructValue(Name(str='s0', ty=None), [[[133.0]], [[134.0], [135.0], [136.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[137.0]], [[138.0], [139.0], [140.0]]]), [StructValue(Name(str='s0', ty=None), [[[141.0]], [[142.0], [143.0], [144.0]]])]])]), StructValue(Name(str='s0', ty=None), [[[145.0]], [[146.0], [147.0], [148.0]]])])])], [StructValue(Name(str='s5', ty=None), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[149.0]], [[150.0], [151.0], [152.0]]]), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[153.0]], [[154.0], [155.0], [156.0]]])], [StructValue(Name(str='s0', ty=None), [[[157.0]], [[158.0], [159.0], [160.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[161.0]], [[162.0], [163.0], [164.0]]]), [StructValue(Name(str='s0', ty=None), [[[165.0]], [[166.0], [167.0], [168.0]]])]])])]]), StructValue(Name(str='s4', ty=None), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[169.0]], [[170.0], [171.0], [172.0]]])], [StructValue(Name(str='s0', ty=None), [[[173.0]], [[174.0], [175.0], [176.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[177.0]], [[178.0], [179.0], [180.0]]]), [StructValue(Name(str='s0', ty=None), [[[181.0]], [[182.0], [183.0], [184.0]]])]])]), StructValue(Name(str='s0', ty=None), [[[185.0]], [[186.0], [187.0], [188.0]]])])])], [StructValue(Name(str='s5', ty=None), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[189.0]], [[190.0], [191.0], [192.0]]]), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[193.0]], [[194.0], [195.0], [196.0]]])], [StructValue(Name(str='s0', ty=None), [[[197.0]], [[198.0], [199.0], [200.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[201.0]], [[202.0], [203.0], [204.0]]]), [StructValue(Name(str='s0', ty=None), [[[205.0]], [[206.0], [207.0], [208.0]]])]])])]]), StructValue(Name(str='s4', ty=None), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[209.0]], [[210.0], [211.0], [212.0]]])], [StructValue(Name(str='s0', ty=None), [[[213.0]], [[214.0], [215.0], [216.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[217.0]], [[218.0], [219.0], [220.0]]]), [StructValue(Name(str='s0', ty=None), [[[221.0]], [[222.0], [223.0], [224.0]]])]])]), StructValue(Name(str='s0', ty=None), [[[225.0]], [[226.0], [227.0], [228.0]]])])])]]
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
