  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: [s1]
    var p1: [[s3]]
  }
  struct s6 {
    var p0: [s0]
    var p1: [[s4]]
  }
  struct s7 {
    var p0: [s6]
    var p1: s3
  }
  struct s9 {
    var p0: [Double]
    var p1: [s6]
  }
  struct s10 {
    var p0: [[s1]]
    var p1: [s9]
  }
  func f11(_ v0: s3) -> s3 {
    let v2: s0 = v0.p0
    var v7: s3 = v0
    let v8: s0 = v7.p0
    var v9: s3 = v7
    let v1: [[Double]] = v8.p0
    let v3: s0 = v7.p0
    let v5: [Double] = v1[0]
    var v6: [Double] = v5
    v9.p1 = v8
    v9.p0 = v8
    var v12: s0 = v8
    let v14: Double = v5[0]
    let v10: [[Double]] = v3.p0
    var v16: Double = v14
    var v4: [[Double]] = v1
    let v20: [Double] = v10[0]
    v7.p1 = v12
    var v15: s0 = v2
    v4[0] = v20
    let v13: s3 = s3(p0: v15, p1: v15)
    v9.p0 = v15
    var v17: Double = v16
    let v30: [[Double]] = v15.p0
    let v51: [s3] = [v9, v9, v9, v9]
    v12.p0 = v30
    v7.p0 = v15
    var v24: s3 = v13
    v6[0] = v14
    var v40: [Double] = v6
    let v29: s3 = v51[3]
    let v26: s0 = v13.p1
    var v22: [s3] = v51
    let v42: s0 = v0.p0
    v15.p0 = v10
    let v32: s0 = v29.p0
    var v43: s3 = v0
    var v28: s3 = v24
    var v46: Double = v16
    var v58: [s3] = v51
    var v44: [Double] = v40
    let v61: s0 = v0.p0
    v40[0] = v46
    var v72: s3 = v0
    v44[0] = v17
    var v48: [s3] = v22
    let v50: s3 = s3(p0: v15, p1: v12)
    var v59: [s3] = v58
    var v45: [[Double]] = v1
    v43.p0 = v32
    let v41: [[Double]] = v3.p0
    v45 = v4
    v9.p1 = v61
    v58[1] = v72
    let v37: s3 = v59[0]
    v4[0] = v44
    v24.p0 = v3
    var v113: [s3] = v48
    var v62: s3 = v29
    v62.p1 = v61
    let v89: s3 = v48[2]
    v113[0] = v89
    var v125: [s3] = v113
    v7.p0 = v42
    v113[1] = v37
    v6[0] = v14
    let v63: s0 = v24.p1
    v9.p1 = v63
    let v274: s3 = v125[2]
    v113[1] = v62
    v62.p1 = v42
    let v153: [[Double]] = v26.p0
    v12.p0 = v4
    v12.p0 = v153
    v15.p0 = v45
    v15.p0 = v41
    v9 = v50
    v58[3] = v28
    v125[0] = v13
    v72.p1 = v32
    v58[3] = v43
    return v274
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [[s10]], _ v2: [s7], _ v3: Double) -> Double {
    let v10: s3 = f11(v0)
    let v8: s0 = v10.p0
    let v11: [s0] = [v8, v8, v8, v8, v8, v8]
    let v9: s0 = v11[2]
    let v30: Double = v3 * v3
    let v52: [[Double]] = v9.p0
    let v49: [Double] = v52[0]
    let v87: Double = v49[0]
    let v152: Double = v30 - v87
    var v114: Double = v152
    return v114
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0]]), p1: s0(p0: [[1.0]]))
    let v1: [[s10]] = [[s10(p0: [[s1(p0: [s0(p0: [[2.0]]), s0(p0: [[3.0]])], p1: s0(p0: [[4.0]]))]], p1: [s9(p0: [5.0], p1: [s6(p0: [s0(p0: [[6.0]]), s0(p0: [[7.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[8.0]]), s0(p0: [[9.0]])], p1: s0(p0: [[10.0]])), s1(p0: [s0(p0: [[11.0]]), s0(p0: [[12.0]])], p1: s0(p0: [[13.0]])), s1(p0: [s0(p0: [[14.0]]), s0(p0: [[15.0]])], p1: s0(p0: [[16.0]]))], p1: [[s3(p0: s0(p0: [[17.0]]), p1: s0(p0: [[18.0]]))], [s3(p0: s0(p0: [[19.0]]), p1: s0(p0: [[20.0]]))], [s3(p0: s0(p0: [[21.0]]), p1: s0(p0: [[22.0]]))]])]])]), s9(p0: [23.0], p1: [s6(p0: [s0(p0: [[24.0]]), s0(p0: [[25.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[26.0]]), s0(p0: [[27.0]])], p1: s0(p0: [[28.0]])), s1(p0: [s0(p0: [[29.0]]), s0(p0: [[30.0]])], p1: s0(p0: [[31.0]])), s1(p0: [s0(p0: [[32.0]]), s0(p0: [[33.0]])], p1: s0(p0: [[34.0]]))], p1: [[s3(p0: s0(p0: [[35.0]]), p1: s0(p0: [[36.0]]))], [s3(p0: s0(p0: [[37.0]]), p1: s0(p0: [[38.0]]))], [s3(p0: s0(p0: [[39.0]]), p1: s0(p0: [[40.0]]))]])]])]), s9(p0: [41.0], p1: [s6(p0: [s0(p0: [[42.0]]), s0(p0: [[43.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[44.0]]), s0(p0: [[45.0]])], p1: s0(p0: [[46.0]])), s1(p0: [s0(p0: [[47.0]]), s0(p0: [[48.0]])], p1: s0(p0: [[49.0]])), s1(p0: [s0(p0: [[50.0]]), s0(p0: [[51.0]])], p1: s0(p0: [[52.0]]))], p1: [[s3(p0: s0(p0: [[53.0]]), p1: s0(p0: [[54.0]]))], [s3(p0: s0(p0: [[55.0]]), p1: s0(p0: [[56.0]]))], [s3(p0: s0(p0: [[57.0]]), p1: s0(p0: [[58.0]]))]])]])])])], [s10(p0: [[s1(p0: [s0(p0: [[59.0]]), s0(p0: [[60.0]])], p1: s0(p0: [[61.0]]))]], p1: [s9(p0: [62.0], p1: [s6(p0: [s0(p0: [[63.0]]), s0(p0: [[64.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[65.0]]), s0(p0: [[66.0]])], p1: s0(p0: [[67.0]])), s1(p0: [s0(p0: [[68.0]]), s0(p0: [[69.0]])], p1: s0(p0: [[70.0]])), s1(p0: [s0(p0: [[71.0]]), s0(p0: [[72.0]])], p1: s0(p0: [[73.0]]))], p1: [[s3(p0: s0(p0: [[74.0]]), p1: s0(p0: [[75.0]]))], [s3(p0: s0(p0: [[76.0]]), p1: s0(p0: [[77.0]]))], [s3(p0: s0(p0: [[78.0]]), p1: s0(p0: [[79.0]]))]])]])]), s9(p0: [80.0], p1: [s6(p0: [s0(p0: [[81.0]]), s0(p0: [[82.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[83.0]]), s0(p0: [[84.0]])], p1: s0(p0: [[85.0]])), s1(p0: [s0(p0: [[86.0]]), s0(p0: [[87.0]])], p1: s0(p0: [[88.0]])), s1(p0: [s0(p0: [[89.0]]), s0(p0: [[90.0]])], p1: s0(p0: [[91.0]]))], p1: [[s3(p0: s0(p0: [[92.0]]), p1: s0(p0: [[93.0]]))], [s3(p0: s0(p0: [[94.0]]), p1: s0(p0: [[95.0]]))], [s3(p0: s0(p0: [[96.0]]), p1: s0(p0: [[97.0]]))]])]])]), s9(p0: [98.0], p1: [s6(p0: [s0(p0: [[99.0]]), s0(p0: [[100.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[101.0]]), s0(p0: [[102.0]])], p1: s0(p0: [[103.0]])), s1(p0: [s0(p0: [[104.0]]), s0(p0: [[105.0]])], p1: s0(p0: [[106.0]])), s1(p0: [s0(p0: [[107.0]]), s0(p0: [[108.0]])], p1: s0(p0: [[109.0]]))], p1: [[s3(p0: s0(p0: [[110.0]]), p1: s0(p0: [[111.0]]))], [s3(p0: s0(p0: [[112.0]]), p1: s0(p0: [[113.0]]))], [s3(p0: s0(p0: [[114.0]]), p1: s0(p0: [[115.0]]))]])]])])])], [s10(p0: [[s1(p0: [s0(p0: [[116.0]]), s0(p0: [[117.0]])], p1: s0(p0: [[118.0]]))]], p1: [s9(p0: [119.0], p1: [s6(p0: [s0(p0: [[120.0]]), s0(p0: [[121.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[122.0]]), s0(p0: [[123.0]])], p1: s0(p0: [[124.0]])), s1(p0: [s0(p0: [[125.0]]), s0(p0: [[126.0]])], p1: s0(p0: [[127.0]])), s1(p0: [s0(p0: [[128.0]]), s0(p0: [[129.0]])], p1: s0(p0: [[130.0]]))], p1: [[s3(p0: s0(p0: [[131.0]]), p1: s0(p0: [[132.0]]))], [s3(p0: s0(p0: [[133.0]]), p1: s0(p0: [[134.0]]))], [s3(p0: s0(p0: [[135.0]]), p1: s0(p0: [[136.0]]))]])]])]), s9(p0: [137.0], p1: [s6(p0: [s0(p0: [[138.0]]), s0(p0: [[139.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[140.0]]), s0(p0: [[141.0]])], p1: s0(p0: [[142.0]])), s1(p0: [s0(p0: [[143.0]]), s0(p0: [[144.0]])], p1: s0(p0: [[145.0]])), s1(p0: [s0(p0: [[146.0]]), s0(p0: [[147.0]])], p1: s0(p0: [[148.0]]))], p1: [[s3(p0: s0(p0: [[149.0]]), p1: s0(p0: [[150.0]]))], [s3(p0: s0(p0: [[151.0]]), p1: s0(p0: [[152.0]]))], [s3(p0: s0(p0: [[153.0]]), p1: s0(p0: [[154.0]]))]])]])]), s9(p0: [155.0], p1: [s6(p0: [s0(p0: [[156.0]]), s0(p0: [[157.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[158.0]]), s0(p0: [[159.0]])], p1: s0(p0: [[160.0]])), s1(p0: [s0(p0: [[161.0]]), s0(p0: [[162.0]])], p1: s0(p0: [[163.0]])), s1(p0: [s0(p0: [[164.0]]), s0(p0: [[165.0]])], p1: s0(p0: [[166.0]]))], p1: [[s3(p0: s0(p0: [[167.0]]), p1: s0(p0: [[168.0]]))], [s3(p0: s0(p0: [[169.0]]), p1: s0(p0: [[170.0]]))], [s3(p0: s0(p0: [[171.0]]), p1: s0(p0: [[172.0]]))]])]])])])]]
    let v2: [s7] = [s7(p0: [s6(p0: [s0(p0: [[173.0]]), s0(p0: [[174.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[175.0]]), s0(p0: [[176.0]])], p1: s0(p0: [[177.0]])), s1(p0: [s0(p0: [[178.0]]), s0(p0: [[179.0]])], p1: s0(p0: [[180.0]])), s1(p0: [s0(p0: [[181.0]]), s0(p0: [[182.0]])], p1: s0(p0: [[183.0]]))], p1: [[s3(p0: s0(p0: [[184.0]]), p1: s0(p0: [[185.0]]))], [s3(p0: s0(p0: [[186.0]]), p1: s0(p0: [[187.0]]))], [s3(p0: s0(p0: [[188.0]]), p1: s0(p0: [[189.0]]))]])]]), s6(p0: [s0(p0: [[190.0]]), s0(p0: [[191.0]])], p1: [[s4(p0: [s1(p0: [s0(p0: [[192.0]]), s0(p0: [[193.0]])], p1: s0(p0: [[194.0]])), s1(p0: [s0(p0: [[195.0]]), s0(p0: [[196.0]])], p1: s0(p0: [[197.0]])), s1(p0: [s0(p0: [[198.0]]), s0(p0: [[199.0]])], p1: s0(p0: [[200.0]]))], p1: [[s3(p0: s0(p0: [[201.0]]), p1: s0(p0: [[202.0]]))], [s3(p0: s0(p0: [[203.0]]), p1: s0(p0: [[204.0]]))], [s3(p0: s0(p0: [[205.0]]), p1: s0(p0: [[206.0]]))]])]])], p1: s3(p0: s0(p0: [[207.0]]), p1: s0(p0: [[208.0]])))]
    let v3: Double = 209.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 209.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
