  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: s0
    var p3: [[s0]]
    var p4: [s0]
    var p5: s0
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
    var p1: [s0]
  }
  struct s5 {
    var p0: s2
    var p1: [s1]
  }
  struct s6 {
    var p0: s0
    var p1: s3
  }
  struct s7 {
    var p0: s1
    var p1: s3
  }
  struct s10 {
    var p0: [s5]
    var p1: s7
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: s10, _ v2: Double) -> Double {
    let v18: s6 = v0[1]
    let v21: s0 = v18.p0
    let v30: [[Double]] = v21.p1
    let v28: [Double] = v30[0]
    let v29: [[Double]] = v21.p1
    var v57: [[Double]] = v29
    var v42: [[Double]] = v57
    var v140: [Double] = v28
    let v77: Double = v140[0]
    var v60: Double = v77
    let v73: Double = v60 + v77
    let v138: [Double] = v42[0]
    v140 = v138
    v57[0] = v28
    return v73
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s3(p0: [s2(p0: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))], p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])])), s6(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), p1: s3(p0: [s2(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]))], p1: [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])])), s6(p0: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]), p1: s3(p0: [s2(p0: s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), p1: s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]))], p1: [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]]), s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]])]))]
    let v1: s10 = s10(p0: [s5(p0: s2(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]), p1: s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])), p1: [s1(p0: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]]), p1: s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]), p2: s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]]), p3: [[s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]])]], p4: [s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]]), s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]])], p5: s0(p0: [[92.0], [93.0]], p1: [[94.0], [95.0]]))]), s5(p0: s2(p0: s0(p0: [[96.0], [97.0]], p1: [[98.0], [99.0]]), p1: s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0]])), p1: [s1(p0: s0(p0: [[104.0], [105.0]], p1: [[106.0], [107.0]]), p1: s0(p0: [[108.0], [109.0]], p1: [[110.0], [111.0]]), p2: s0(p0: [[112.0], [113.0]], p1: [[114.0], [115.0]]), p3: [[s0(p0: [[116.0], [117.0]], p1: [[118.0], [119.0]])]], p4: [s0(p0: [[120.0], [121.0]], p1: [[122.0], [123.0]]), s0(p0: [[124.0], [125.0]], p1: [[126.0], [127.0]])], p5: s0(p0: [[128.0], [129.0]], p1: [[130.0], [131.0]]))])], p1: s7(p0: s1(p0: s0(p0: [[132.0], [133.0]], p1: [[134.0], [135.0]]), p1: s0(p0: [[136.0], [137.0]], p1: [[138.0], [139.0]]), p2: s0(p0: [[140.0], [141.0]], p1: [[142.0], [143.0]]), p3: [[s0(p0: [[144.0], [145.0]], p1: [[146.0], [147.0]])]], p4: [s0(p0: [[148.0], [149.0]], p1: [[150.0], [151.0]]), s0(p0: [[152.0], [153.0]], p1: [[154.0], [155.0]])], p5: s0(p0: [[156.0], [157.0]], p1: [[158.0], [159.0]])), p1: s3(p0: [s2(p0: s0(p0: [[160.0], [161.0]], p1: [[162.0], [163.0]]), p1: s0(p0: [[164.0], [165.0]], p1: [[166.0], [167.0]]))], p1: [s0(p0: [[168.0], [169.0]], p1: [[170.0], [171.0]]), s0(p0: [[172.0], [173.0]], p1: [[174.0], [175.0]])])))
    let v2: Double = 176.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 176.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
