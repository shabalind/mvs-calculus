  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  struct s3 {
    var p0: [s1]
  }
  struct s5 {
    var p0: [s1]
    var p1: s0
  }
  struct s6 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s9 {
    var p0: s5
    var p1: [s6]
  }
  struct s12 {
    var p0: s5
    var p1: [s3]
  }
  func f112(_ v0: Double) -> Double {
    var v2: Double = v0
    var v4: Double = v0
    let v7: Double = v2 + v2
    var v8: Double = v7
    var v1: Double = v4
    var v3: Double = v4
    let v10: Double = v2 + v1
    var v9: Double = v3
    var v15: Double = v7
    var v17: Double = v0
    var v13: Double = v17
    let v14: Double = v9 * v0
    var v18: Double = v4
    var v20: Double = v18
    let v24: [Double] = [v9, v1, v13, v4, v14]
    var v42: [Double] = v24
    var v26: [Double] = v24
    v42[3] = v1
    v42[1] = v10
    var v33: Double = v8
    v26[0] = v17
    v42[0] = v2
    v8 = v15
    v42[3] = v9
    let v44: [[Double]] = [v42, v24, v42, v26]
    let v139: [Double] = v44[0]
    v42[3] = v14
    var v48: [[Double]] = v44
    var v67: [[Double]] = v48
    var v87: [[Double]] = v67
    let v45: [Double] = v87[1]
    v26[4] = v20
    var v62: [Double] = v139
    v42[0] = v0
    let v76: [[Double]] = [v45, v62]
    let v147: [Double] = v76[0]
    let v137: Double = v147[0]
    v42[1] = v33
    return v137
  }
  func f20(_ v0: Double) -> Double {
    let v7: Double = f112(v0)
    var v3: Double = v7
    let v5: Double = v3 - v7
    var v1: Double = v5
    let v10: Double = f112(v0)
    let v6: Double = f112(v5)
    let v2: Double = f112(v10)
    var v11: Double = v6
    var v9: Double = v2
    var v8: Double = v6
    let v16: [Double] = [v0, v11, v7]
    let v12: Double = f112(v2)
    let v26: Double = f112(v9)
    let v20: Double = v16[1]
    var v21: [Double] = v16
    var v17: Double = v5
    let v19: Double = v21[0]
    v21[1] = v8
    v21[1] = v17
    let v51: Double = v19 / v3
    v21[1] = v26
    v21[0] = v1
    let v35: Double = f112(v12)
    v21[2] = v20
    v9 = v35
    return v51
  }
  @inline(never)
  func f0(_ v0: [s9], _ v1: [[s12]], _ v2: Double) -> Double {
    let v7: Double = f112(v2)
    let v6: Double = f112(v7)
    let v18: Double = f20(v7)
    let v20: [Double] = [v18]
    let v42: Double = v20[0]
    let v115: Double = v6 - v42
    let v189: Double = f112(v115)
    return v189
  }
  func benchmark() {
    let v0: [s9] = [s9(p0: s5(p0: [s1(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])]), s1(p0: [s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])]), s1(p0: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])])], p1: s0(p0: [[12.0]], p1: [[13.0]])), p1: [s6(p0: [s0(p0: [[14.0]], p1: [[15.0]]), s0(p0: [[16.0]], p1: [[17.0]])], p1: [[s0(p0: [[18.0]], p1: [[19.0]])], [s0(p0: [[20.0]], p1: [[21.0]])]]), s6(p0: [s0(p0: [[22.0]], p1: [[23.0]]), s0(p0: [[24.0]], p1: [[25.0]])], p1: [[s0(p0: [[26.0]], p1: [[27.0]])], [s0(p0: [[28.0]], p1: [[29.0]])]]), s6(p0: [s0(p0: [[30.0]], p1: [[31.0]]), s0(p0: [[32.0]], p1: [[33.0]])], p1: [[s0(p0: [[34.0]], p1: [[35.0]])], [s0(p0: [[36.0]], p1: [[37.0]])]])]), s9(p0: s5(p0: [s1(p0: [s0(p0: [[38.0]], p1: [[39.0]]), s0(p0: [[40.0]], p1: [[41.0]])]), s1(p0: [s0(p0: [[42.0]], p1: [[43.0]]), s0(p0: [[44.0]], p1: [[45.0]])]), s1(p0: [s0(p0: [[46.0]], p1: [[47.0]]), s0(p0: [[48.0]], p1: [[49.0]])])], p1: s0(p0: [[50.0]], p1: [[51.0]])), p1: [s6(p0: [s0(p0: [[52.0]], p1: [[53.0]]), s0(p0: [[54.0]], p1: [[55.0]])], p1: [[s0(p0: [[56.0]], p1: [[57.0]])], [s0(p0: [[58.0]], p1: [[59.0]])]]), s6(p0: [s0(p0: [[60.0]], p1: [[61.0]]), s0(p0: [[62.0]], p1: [[63.0]])], p1: [[s0(p0: [[64.0]], p1: [[65.0]])], [s0(p0: [[66.0]], p1: [[67.0]])]]), s6(p0: [s0(p0: [[68.0]], p1: [[69.0]]), s0(p0: [[70.0]], p1: [[71.0]])], p1: [[s0(p0: [[72.0]], p1: [[73.0]])], [s0(p0: [[74.0]], p1: [[75.0]])]])]), s9(p0: s5(p0: [s1(p0: [s0(p0: [[76.0]], p1: [[77.0]]), s0(p0: [[78.0]], p1: [[79.0]])]), s1(p0: [s0(p0: [[80.0]], p1: [[81.0]]), s0(p0: [[82.0]], p1: [[83.0]])]), s1(p0: [s0(p0: [[84.0]], p1: [[85.0]]), s0(p0: [[86.0]], p1: [[87.0]])])], p1: s0(p0: [[88.0]], p1: [[89.0]])), p1: [s6(p0: [s0(p0: [[90.0]], p1: [[91.0]]), s0(p0: [[92.0]], p1: [[93.0]])], p1: [[s0(p0: [[94.0]], p1: [[95.0]])], [s0(p0: [[96.0]], p1: [[97.0]])]]), s6(p0: [s0(p0: [[98.0]], p1: [[99.0]]), s0(p0: [[100.0]], p1: [[101.0]])], p1: [[s0(p0: [[102.0]], p1: [[103.0]])], [s0(p0: [[104.0]], p1: [[105.0]])]]), s6(p0: [s0(p0: [[106.0]], p1: [[107.0]]), s0(p0: [[108.0]], p1: [[109.0]])], p1: [[s0(p0: [[110.0]], p1: [[111.0]])], [s0(p0: [[112.0]], p1: [[113.0]])]])])]
    let v1: [[s12]] = [[s12(p0: s5(p0: [s1(p0: [s0(p0: [[114.0]], p1: [[115.0]]), s0(p0: [[116.0]], p1: [[117.0]])]), s1(p0: [s0(p0: [[118.0]], p1: [[119.0]]), s0(p0: [[120.0]], p1: [[121.0]])]), s1(p0: [s0(p0: [[122.0]], p1: [[123.0]]), s0(p0: [[124.0]], p1: [[125.0]])])], p1: s0(p0: [[126.0]], p1: [[127.0]])), p1: [s3(p0: [s1(p0: [s0(p0: [[128.0]], p1: [[129.0]]), s0(p0: [[130.0]], p1: [[131.0]])]), s1(p0: [s0(p0: [[132.0]], p1: [[133.0]]), s0(p0: [[134.0]], p1: [[135.0]])]), s1(p0: [s0(p0: [[136.0]], p1: [[137.0]]), s0(p0: [[138.0]], p1: [[139.0]])])])])], [s12(p0: s5(p0: [s1(p0: [s0(p0: [[140.0]], p1: [[141.0]]), s0(p0: [[142.0]], p1: [[143.0]])]), s1(p0: [s0(p0: [[144.0]], p1: [[145.0]]), s0(p0: [[146.0]], p1: [[147.0]])]), s1(p0: [s0(p0: [[148.0]], p1: [[149.0]]), s0(p0: [[150.0]], p1: [[151.0]])])], p1: s0(p0: [[152.0]], p1: [[153.0]])), p1: [s3(p0: [s1(p0: [s0(p0: [[154.0]], p1: [[155.0]]), s0(p0: [[156.0]], p1: [[157.0]])]), s1(p0: [s0(p0: [[158.0]], p1: [[159.0]]), s0(p0: [[160.0]], p1: [[161.0]])]), s1(p0: [s0(p0: [[162.0]], p1: [[163.0]]), s0(p0: [[164.0]], p1: [[165.0]])])])])]]
    let v2: Double = 166.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 166.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
