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
    var p0: s0
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [s1]
    var p1: s2
  }
  struct s4 {
    var p0: [s2]
    var p1: s0
  }
  struct s5 {
    var p0: s4
    var p1: s1
  }
  struct s6 {
    var p0: [s3]
    var p1: s1
  }
  struct s7 {
    var p0: s2
    var p1: s5
  }
  struct s8 {
    var p0: s7
    var p1: s3
  }
  func f10(_ v0: Double) -> Double {
    var v7: Double = v0
    v7 = v0
    var v4: Double = v7
    var v3: Double = v0
    v3 = v0
    var v1: Double = v0
    var v5: Double = v1
    var v8: Double = v3
    var v15: Double = v5
    var v11: Double = v0
    let v2: [Double] = [v15, v5, v11, v4, v11, v3, v3]
    var v18: [Double] = v2
    v18[0] = v8
    v18[3] = v3
    v18[4] = v0
    let v12: Double = v18[6]
    var v26: Double = v8
    v18[1] = v4
    v18[1] = v8
    v4 = v1
    let v39: Double = v12 - v26
    return v39
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: [s6], _ v2: s8, _ v3: [[s7]], _ v4: Double) -> Double {
    var v16: Double = v4
    let v22: Double = v16 - v4
    let v29: Double = f10(v16)
    var v49: Double = v29
    let v112: Double = v49 - v22
    return v112
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])], [s0(p0: [[6.0], [7.0]], p1: [[8.0]])]]
    let v1: [s6] = [s6(p0: [s3(p0: [s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0]])]), s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]]), p1: [s0(p0: [[18.0], [19.0]], p1: [[20.0]])]), s1(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0]]), p1: [s0(p0: [[24.0], [25.0]], p1: [[26.0]])])], p1: s2(p0: s0(p0: [[27.0], [28.0]], p1: [[29.0]]), p1: [[s0(p0: [[30.0], [31.0]], p1: [[32.0]])], [s0(p0: [[33.0], [34.0]], p1: [[35.0]])], [s0(p0: [[36.0], [37.0]], p1: [[38.0]])]]))], p1: s1(p0: s0(p0: [[39.0], [40.0]], p1: [[41.0]]), p1: [s0(p0: [[42.0], [43.0]], p1: [[44.0]])])), s6(p0: [s3(p0: [s1(p0: s0(p0: [[45.0], [46.0]], p1: [[47.0]]), p1: [s0(p0: [[48.0], [49.0]], p1: [[50.0]])]), s1(p0: s0(p0: [[51.0], [52.0]], p1: [[53.0]]), p1: [s0(p0: [[54.0], [55.0]], p1: [[56.0]])]), s1(p0: s0(p0: [[57.0], [58.0]], p1: [[59.0]]), p1: [s0(p0: [[60.0], [61.0]], p1: [[62.0]])])], p1: s2(p0: s0(p0: [[63.0], [64.0]], p1: [[65.0]]), p1: [[s0(p0: [[66.0], [67.0]], p1: [[68.0]])], [s0(p0: [[69.0], [70.0]], p1: [[71.0]])], [s0(p0: [[72.0], [73.0]], p1: [[74.0]])]]))], p1: s1(p0: s0(p0: [[75.0], [76.0]], p1: [[77.0]]), p1: [s0(p0: [[78.0], [79.0]], p1: [[80.0]])]))]
    let v2: s8 = s8(p0: s7(p0: s2(p0: s0(p0: [[81.0], [82.0]], p1: [[83.0]]), p1: [[s0(p0: [[84.0], [85.0]], p1: [[86.0]])], [s0(p0: [[87.0], [88.0]], p1: [[89.0]])], [s0(p0: [[90.0], [91.0]], p1: [[92.0]])]]), p1: s5(p0: s4(p0: [s2(p0: s0(p0: [[93.0], [94.0]], p1: [[95.0]]), p1: [[s0(p0: [[96.0], [97.0]], p1: [[98.0]])], [s0(p0: [[99.0], [100.0]], p1: [[101.0]])], [s0(p0: [[102.0], [103.0]], p1: [[104.0]])]])], p1: s0(p0: [[105.0], [106.0]], p1: [[107.0]])), p1: s1(p0: s0(p0: [[108.0], [109.0]], p1: [[110.0]]), p1: [s0(p0: [[111.0], [112.0]], p1: [[113.0]])]))), p1: s3(p0: [s1(p0: s0(p0: [[114.0], [115.0]], p1: [[116.0]]), p1: [s0(p0: [[117.0], [118.0]], p1: [[119.0]])]), s1(p0: s0(p0: [[120.0], [121.0]], p1: [[122.0]]), p1: [s0(p0: [[123.0], [124.0]], p1: [[125.0]])]), s1(p0: s0(p0: [[126.0], [127.0]], p1: [[128.0]]), p1: [s0(p0: [[129.0], [130.0]], p1: [[131.0]])])], p1: s2(p0: s0(p0: [[132.0], [133.0]], p1: [[134.0]]), p1: [[s0(p0: [[135.0], [136.0]], p1: [[137.0]])], [s0(p0: [[138.0], [139.0]], p1: [[140.0]])], [s0(p0: [[141.0], [142.0]], p1: [[143.0]])]])))
    let v3: [[s7]] = [[s7(p0: s2(p0: s0(p0: [[144.0], [145.0]], p1: [[146.0]]), p1: [[s0(p0: [[147.0], [148.0]], p1: [[149.0]])], [s0(p0: [[150.0], [151.0]], p1: [[152.0]])], [s0(p0: [[153.0], [154.0]], p1: [[155.0]])]]), p1: s5(p0: s4(p0: [s2(p0: s0(p0: [[156.0], [157.0]], p1: [[158.0]]), p1: [[s0(p0: [[159.0], [160.0]], p1: [[161.0]])], [s0(p0: [[162.0], [163.0]], p1: [[164.0]])], [s0(p0: [[165.0], [166.0]], p1: [[167.0]])]])], p1: s0(p0: [[168.0], [169.0]], p1: [[170.0]])), p1: s1(p0: s0(p0: [[171.0], [172.0]], p1: [[173.0]]), p1: [s0(p0: [[174.0], [175.0]], p1: [[176.0]])])))], [s7(p0: s2(p0: s0(p0: [[177.0], [178.0]], p1: [[179.0]]), p1: [[s0(p0: [[180.0], [181.0]], p1: [[182.0]])], [s0(p0: [[183.0], [184.0]], p1: [[185.0]])], [s0(p0: [[186.0], [187.0]], p1: [[188.0]])]]), p1: s5(p0: s4(p0: [s2(p0: s0(p0: [[189.0], [190.0]], p1: [[191.0]]), p1: [[s0(p0: [[192.0], [193.0]], p1: [[194.0]])], [s0(p0: [[195.0], [196.0]], p1: [[197.0]])], [s0(p0: [[198.0], [199.0]], p1: [[200.0]])]])], p1: s0(p0: [[201.0], [202.0]], p1: [[203.0]])), p1: s1(p0: s0(p0: [[204.0], [205.0]], p1: [[206.0]]), p1: [s0(p0: [[207.0], [208.0]], p1: [[209.0]])])))]]
    let v4: Double = 210.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 210.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
