  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: s1
  }
  struct s9 {
    var p0: [[s1]]
    var p1: [s1]
  }
  struct s11 {
    var p0: s9
    var p1: s4
  }
  struct s12 {
    var p0: [[s4]]
    var p1: s9
  }
  func f20(_ v0: Double) -> Double {
    var v5: Double = v0
    let v4: [Double] = [v0, v0]
    var v1: Double = v5
    var v12: [Double] = v4
    let v9: Double = v4[1]
    var v7: [Double] = v4
    v12[0] = v1
    var v25: [Double] = v7
    let v10: [[Double]] = [v25, v7, v12, v25]
    var v17: [[Double]] = v10
    var v15: [[Double]] = v17
    v15[1] = v7
    v15 = v10
    var v41: [[Double]] = v17
    let v27: [Double] = v10[3]
    v17[0] = v27
    var v46: [[Double]] = v41
    v15 = v46
    v25[0] = v9
    let v48: [Double] = v15[3]
    v41[0] = v12
    v15[3] = v48
    let v47: Double = v48[0]
    return v47
  }
  @inline(never)
  func f0(_ v0: [[s11]], _ v1: s12, _ v2: Double) -> Double {
    let v11: Double = f20(v2)
    let v15: Double = f20(v11)
    let v20: Double = f20(v15)
    return v20
  }
  func benchmark() {
    let v0: [[s11]] = [[s11(p0: s9(p0: [[s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))]], p1: [s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])], p1: s0(p0: [[21.0], [22.0]], p1: [[23.0]])), s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]])], p1: s0(p0: [[33.0], [34.0]], p1: [[35.0]]))]), p1: s4(p0: s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]])], p1: s0(p0: [[45.0], [46.0]], p1: [[47.0]]))))], [s11(p0: s9(p0: [[s1(p0: [s0(p0: [[48.0], [49.0]], p1: [[50.0]]), s0(p0: [[51.0], [52.0]], p1: [[53.0]]), s0(p0: [[54.0], [55.0]], p1: [[56.0]])], p1: s0(p0: [[57.0], [58.0]], p1: [[59.0]]))]], p1: [s1(p0: [s0(p0: [[60.0], [61.0]], p1: [[62.0]]), s0(p0: [[63.0], [64.0]], p1: [[65.0]]), s0(p0: [[66.0], [67.0]], p1: [[68.0]])], p1: s0(p0: [[69.0], [70.0]], p1: [[71.0]])), s1(p0: [s0(p0: [[72.0], [73.0]], p1: [[74.0]]), s0(p0: [[75.0], [76.0]], p1: [[77.0]]), s0(p0: [[78.0], [79.0]], p1: [[80.0]])], p1: s0(p0: [[81.0], [82.0]], p1: [[83.0]]))]), p1: s4(p0: s1(p0: [s0(p0: [[84.0], [85.0]], p1: [[86.0]]), s0(p0: [[87.0], [88.0]], p1: [[89.0]]), s0(p0: [[90.0], [91.0]], p1: [[92.0]])], p1: s0(p0: [[93.0], [94.0]], p1: [[95.0]]))))], [s11(p0: s9(p0: [[s1(p0: [s0(p0: [[96.0], [97.0]], p1: [[98.0]]), s0(p0: [[99.0], [100.0]], p1: [[101.0]]), s0(p0: [[102.0], [103.0]], p1: [[104.0]])], p1: s0(p0: [[105.0], [106.0]], p1: [[107.0]]))]], p1: [s1(p0: [s0(p0: [[108.0], [109.0]], p1: [[110.0]]), s0(p0: [[111.0], [112.0]], p1: [[113.0]]), s0(p0: [[114.0], [115.0]], p1: [[116.0]])], p1: s0(p0: [[117.0], [118.0]], p1: [[119.0]])), s1(p0: [s0(p0: [[120.0], [121.0]], p1: [[122.0]]), s0(p0: [[123.0], [124.0]], p1: [[125.0]]), s0(p0: [[126.0], [127.0]], p1: [[128.0]])], p1: s0(p0: [[129.0], [130.0]], p1: [[131.0]]))]), p1: s4(p0: s1(p0: [s0(p0: [[132.0], [133.0]], p1: [[134.0]]), s0(p0: [[135.0], [136.0]], p1: [[137.0]]), s0(p0: [[138.0], [139.0]], p1: [[140.0]])], p1: s0(p0: [[141.0], [142.0]], p1: [[143.0]]))))]]
    let v1: s12 = s12(p0: [[s4(p0: s1(p0: [s0(p0: [[144.0], [145.0]], p1: [[146.0]]), s0(p0: [[147.0], [148.0]], p1: [[149.0]]), s0(p0: [[150.0], [151.0]], p1: [[152.0]])], p1: s0(p0: [[153.0], [154.0]], p1: [[155.0]])))], [s4(p0: s1(p0: [s0(p0: [[156.0], [157.0]], p1: [[158.0]]), s0(p0: [[159.0], [160.0]], p1: [[161.0]]), s0(p0: [[162.0], [163.0]], p1: [[164.0]])], p1: s0(p0: [[165.0], [166.0]], p1: [[167.0]])))]], p1: s9(p0: [[s1(p0: [s0(p0: [[168.0], [169.0]], p1: [[170.0]]), s0(p0: [[171.0], [172.0]], p1: [[173.0]]), s0(p0: [[174.0], [175.0]], p1: [[176.0]])], p1: s0(p0: [[177.0], [178.0]], p1: [[179.0]]))]], p1: [s1(p0: [s0(p0: [[180.0], [181.0]], p1: [[182.0]]), s0(p0: [[183.0], [184.0]], p1: [[185.0]]), s0(p0: [[186.0], [187.0]], p1: [[188.0]])], p1: s0(p0: [[189.0], [190.0]], p1: [[191.0]])), s1(p0: [s0(p0: [[192.0], [193.0]], p1: [[194.0]]), s0(p0: [[195.0], [196.0]], p1: [[197.0]]), s0(p0: [[198.0], [199.0]], p1: [[200.0]])], p1: s0(p0: [[201.0], [202.0]], p1: [[203.0]]))]))
    let v2: Double = 204.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 204.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
