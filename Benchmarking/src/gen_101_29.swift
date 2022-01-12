  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: [s1]
  }
  struct s4 {
    var p0: [[s0]]
    var p1: s3
  }
  struct s6 {
    var p0: [Double]
    var p1: [s4]
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: Double) -> Double {
    let v7: [s6] = v0[1]
    let v8: s6 = v7[0]
    let v12: [Double] = v8.p0
    let v10: Double = v12[2]
    let v38: [Double] = [v1, v10, v1, v1]
    let v37: Double = v1 + v10
    let v36: Double = v38[0]
    let v32: Double = v36 + v36
    let v41: Double = v32 * v37
    let v116: Double = v41 / v41
    return v116
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: [0.0, 1.0, 2.0], p1: [s4(p0: [[s0(p0: [[3.0]], p1: [[4.0]])]], p1: s3(p0: s1(p0: [s0(p0: [[5.0]], p1: [[6.0]])], p1: [s0(p0: [[7.0]], p1: [[8.0]]), s0(p0: [[9.0]], p1: [[10.0]])]), p1: [s1(p0: [s0(p0: [[11.0]], p1: [[12.0]])], p1: [s0(p0: [[13.0]], p1: [[14.0]]), s0(p0: [[15.0]], p1: [[16.0]])]), s1(p0: [s0(p0: [[17.0]], p1: [[18.0]])], p1: [s0(p0: [[19.0]], p1: [[20.0]]), s0(p0: [[21.0]], p1: [[22.0]])])])), s4(p0: [[s0(p0: [[23.0]], p1: [[24.0]])]], p1: s3(p0: s1(p0: [s0(p0: [[25.0]], p1: [[26.0]])], p1: [s0(p0: [[27.0]], p1: [[28.0]]), s0(p0: [[29.0]], p1: [[30.0]])]), p1: [s1(p0: [s0(p0: [[31.0]], p1: [[32.0]])], p1: [s0(p0: [[33.0]], p1: [[34.0]]), s0(p0: [[35.0]], p1: [[36.0]])]), s1(p0: [s0(p0: [[37.0]], p1: [[38.0]])], p1: [s0(p0: [[39.0]], p1: [[40.0]]), s0(p0: [[41.0]], p1: [[42.0]])])]))])], [s6(p0: [43.0, 44.0, 45.0], p1: [s4(p0: [[s0(p0: [[46.0]], p1: [[47.0]])]], p1: s3(p0: s1(p0: [s0(p0: [[48.0]], p1: [[49.0]])], p1: [s0(p0: [[50.0]], p1: [[51.0]]), s0(p0: [[52.0]], p1: [[53.0]])]), p1: [s1(p0: [s0(p0: [[54.0]], p1: [[55.0]])], p1: [s0(p0: [[56.0]], p1: [[57.0]]), s0(p0: [[58.0]], p1: [[59.0]])]), s1(p0: [s0(p0: [[60.0]], p1: [[61.0]])], p1: [s0(p0: [[62.0]], p1: [[63.0]]), s0(p0: [[64.0]], p1: [[65.0]])])])), s4(p0: [[s0(p0: [[66.0]], p1: [[67.0]])]], p1: s3(p0: s1(p0: [s0(p0: [[68.0]], p1: [[69.0]])], p1: [s0(p0: [[70.0]], p1: [[71.0]]), s0(p0: [[72.0]], p1: [[73.0]])]), p1: [s1(p0: [s0(p0: [[74.0]], p1: [[75.0]])], p1: [s0(p0: [[76.0]], p1: [[77.0]]), s0(p0: [[78.0]], p1: [[79.0]])]), s1(p0: [s0(p0: [[80.0]], p1: [[81.0]])], p1: [s0(p0: [[82.0]], p1: [[83.0]]), s0(p0: [[84.0]], p1: [[85.0]])])]))])], [s6(p0: [86.0, 87.0, 88.0], p1: [s4(p0: [[s0(p0: [[89.0]], p1: [[90.0]])]], p1: s3(p0: s1(p0: [s0(p0: [[91.0]], p1: [[92.0]])], p1: [s0(p0: [[93.0]], p1: [[94.0]]), s0(p0: [[95.0]], p1: [[96.0]])]), p1: [s1(p0: [s0(p0: [[97.0]], p1: [[98.0]])], p1: [s0(p0: [[99.0]], p1: [[100.0]]), s0(p0: [[101.0]], p1: [[102.0]])]), s1(p0: [s0(p0: [[103.0]], p1: [[104.0]])], p1: [s0(p0: [[105.0]], p1: [[106.0]]), s0(p0: [[107.0]], p1: [[108.0]])])])), s4(p0: [[s0(p0: [[109.0]], p1: [[110.0]])]], p1: s3(p0: s1(p0: [s0(p0: [[111.0]], p1: [[112.0]])], p1: [s0(p0: [[113.0]], p1: [[114.0]]), s0(p0: [[115.0]], p1: [[116.0]])]), p1: [s1(p0: [s0(p0: [[117.0]], p1: [[118.0]])], p1: [s0(p0: [[119.0]], p1: [[120.0]]), s0(p0: [[121.0]], p1: [[122.0]])]), s1(p0: [s0(p0: [[123.0]], p1: [[124.0]])], p1: [s0(p0: [[125.0]], p1: [[126.0]]), s0(p0: [[127.0]], p1: [[128.0]])])]))])]]
    let v1: Double = 129.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 129.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
