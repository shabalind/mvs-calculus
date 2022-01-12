  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
    var p2: [[s0]]
  }
  struct s3 {
    var p0: [s2]
    var p1: s1
    var p2: s2
    var p3: s1
    var p4: s1
    var p5: [s1]
    var p6: [s0]
    var p7: s0
  }
  struct s4 {
    var p0: [[s2]]
    var p1: [[s2]]
  }
  struct s5 {
    var p0: [[s1]]
    var p1: s1
  }
  struct s6 {
    var p0: s1
    var p1: s4
  }
  struct s8 {
    var p0: s5
    var p1: [[s5]]
    var p2: s3
    var p3: s1
    var p4: [s1]
  }
  func f10(_ v0: Double) -> Double {
    let v4: Double = v0 / v0
    let v5: Double = v0 / v0
    var v1: Double = v5
    var v10: Double = v4
    var v2: Double = v4
    var v12: Double = v10
    var v11: Double = v10
    var v8: Double = v4
    var v13: Double = v12
    var v15: Double = v11
    let v21: [Double] = [v8, v10, v8]
    var v14: [Double] = v21
    v14[0] = v15
    let v27: Double = v21[0]
    var v24: [Double] = v21
    var v18: [Double] = v24
    var v33: [Double] = v18
    v2 = v8
    let v29: Double = v24[1]
    v33[1] = v11
    let v19: Double = v33[0]
    let v51: Double = v18[0]
    let v26: Double = v18[0]
    var v45: [Double] = v33
    let v43: Double = v0 - v0
    v24[0] = v4
    var v72: Double = v2
    var v76: [Double] = v14
    v76[2] = v13
    var v54: Double = v4
    var v32: [Double] = v18
    let v94: Double = v45[2]
    v24[1] = v51
    let v81: Double = v32[1]
    var v41: [Double] = v45
    let v42: Double = v32[2]
    v76[1] = v27
    v76[2] = v1
    let v47: Double = v76[0]
    v12 = v43
    var v65: [Double] = v41
    var v101: [Double] = v14
    var v38: Double = v81
    let v60: Double = v32[2]
    var v40: [Double] = v65
    let v56: Double = v45[1]
    let v109: Double = v76[2]
    v15 = v94
    v14 = v101
    var v196: Double = v19
    v12 = v109
    let v86: Double = v56 - v29
    v45[2] = v72
    let v78: Double = v86 + v26
    v41[0] = v196
    v41[0] = v42
    v13 = v5
    v10 = v54
    let v130: Double = v40[1]
    v33[2] = v130
    v11 = v29
    v32 = v18
    v101[1] = v60
    v41[0] = v47
    v45[1] = v94
    v65[2] = v38
    return v78
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: s6, _ v2: Double) -> Double {
    var v11: Double = v2
    var v15: Double = v11
    let v53: Double = f10(v15)
    return v53
  }
  func benchmark() {
    let v0: s8 = s8(p0: s5(p0: [[s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]))], [s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0]]))]], p1: s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: s0(p0: [[10.0]], p1: [[11.0]]))), p1: [[s5(p0: [[s1(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: s0(p0: [[14.0]], p1: [[15.0]]))], [s1(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: s0(p0: [[18.0]], p1: [[19.0]]))]], p1: s1(p0: s0(p0: [[20.0]], p1: [[21.0]]), p1: s0(p0: [[22.0]], p1: [[23.0]])))], [s5(p0: [[s1(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: s0(p0: [[26.0]], p1: [[27.0]]))], [s1(p0: s0(p0: [[28.0]], p1: [[29.0]]), p1: s0(p0: [[30.0]], p1: [[31.0]]))]], p1: s1(p0: s0(p0: [[32.0]], p1: [[33.0]]), p1: s0(p0: [[34.0]], p1: [[35.0]])))], [s5(p0: [[s1(p0: s0(p0: [[36.0]], p1: [[37.0]]), p1: s0(p0: [[38.0]], p1: [[39.0]]))], [s1(p0: s0(p0: [[40.0]], p1: [[41.0]]), p1: s0(p0: [[42.0]], p1: [[43.0]]))]], p1: s1(p0: s0(p0: [[44.0]], p1: [[45.0]]), p1: s0(p0: [[46.0]], p1: [[47.0]])))]], p2: s3(p0: [s2(p0: [s0(p0: [[48.0]], p1: [[49.0]]), s0(p0: [[50.0]], p1: [[51.0]]), s0(p0: [[52.0]], p1: [[53.0]])], p1: s1(p0: s0(p0: [[54.0]], p1: [[55.0]]), p1: s0(p0: [[56.0]], p1: [[57.0]])), p2: [[s0(p0: [[58.0]], p1: [[59.0]])]])], p1: s1(p0: s0(p0: [[60.0]], p1: [[61.0]]), p1: s0(p0: [[62.0]], p1: [[63.0]])), p2: s2(p0: [s0(p0: [[64.0]], p1: [[65.0]]), s0(p0: [[66.0]], p1: [[67.0]]), s0(p0: [[68.0]], p1: [[69.0]])], p1: s1(p0: s0(p0: [[70.0]], p1: [[71.0]]), p1: s0(p0: [[72.0]], p1: [[73.0]])), p2: [[s0(p0: [[74.0]], p1: [[75.0]])]]), p3: s1(p0: s0(p0: [[76.0]], p1: [[77.0]]), p1: s0(p0: [[78.0]], p1: [[79.0]])), p4: s1(p0: s0(p0: [[80.0]], p1: [[81.0]]), p1: s0(p0: [[82.0]], p1: [[83.0]])), p5: [s1(p0: s0(p0: [[84.0]], p1: [[85.0]]), p1: s0(p0: [[86.0]], p1: [[87.0]]))], p6: [s0(p0: [[88.0]], p1: [[89.0]])], p7: s0(p0: [[90.0]], p1: [[91.0]])), p3: s1(p0: s0(p0: [[92.0]], p1: [[93.0]]), p1: s0(p0: [[94.0]], p1: [[95.0]])), p4: [s1(p0: s0(p0: [[96.0]], p1: [[97.0]]), p1: s0(p0: [[98.0]], p1: [[99.0]])), s1(p0: s0(p0: [[100.0]], p1: [[101.0]]), p1: s0(p0: [[102.0]], p1: [[103.0]]))])
    let v1: s6 = s6(p0: s1(p0: s0(p0: [[104.0]], p1: [[105.0]]), p1: s0(p0: [[106.0]], p1: [[107.0]])), p1: s4(p0: [[s2(p0: [s0(p0: [[108.0]], p1: [[109.0]]), s0(p0: [[110.0]], p1: [[111.0]]), s0(p0: [[112.0]], p1: [[113.0]])], p1: s1(p0: s0(p0: [[114.0]], p1: [[115.0]]), p1: s0(p0: [[116.0]], p1: [[117.0]])), p2: [[s0(p0: [[118.0]], p1: [[119.0]])]])]], p1: [[s2(p0: [s0(p0: [[120.0]], p1: [[121.0]]), s0(p0: [[122.0]], p1: [[123.0]]), s0(p0: [[124.0]], p1: [[125.0]])], p1: s1(p0: s0(p0: [[126.0]], p1: [[127.0]]), p1: s0(p0: [[128.0]], p1: [[129.0]])), p2: [[s0(p0: [[130.0]], p1: [[131.0]])]])], [s2(p0: [s0(p0: [[132.0]], p1: [[133.0]]), s0(p0: [[134.0]], p1: [[135.0]]), s0(p0: [[136.0]], p1: [[137.0]])], p1: s1(p0: s0(p0: [[138.0]], p1: [[139.0]]), p1: s0(p0: [[140.0]], p1: [[141.0]])), p2: [[s0(p0: [[142.0]], p1: [[143.0]])]])]]))
    let v2: Double = 144.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 144.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
