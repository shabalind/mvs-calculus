  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s1
  }
  struct s4 {
    var p0: [s3]
    var p1: s3
  }
  struct s5 {
    var p0: s4
    var p1: [s4]
  }
  struct s7 {
    var p0: s3
    var p1: [s1]
  }
  struct s9 {
    var p0: [s7]
    var p1: s5
  }
  func f29(_ v0: Double) -> Double {
    var v2: Double = v0
    var v6: Double = v0
    var v7: Double = v6
    var v3: Double = v7
    v3 = v2
    var v1: Double = v7
    var v10: Double = v2
    var v9: Double = v3
    var v8: Double = v7
    var v18: Double = v7
    var v11: Double = v8
    var v14: Double = v10
    var v24: Double = v0
    var v15: Double = v9
    v9 = v7
    var v21: Double = v9
    var v26: Double = v18
    var v38: Double = v21
    var v16: Double = v38
    var v17: Double = v15
    var v23: Double = v26
    v1 = v17
    var v40: Double = v2
    var v44: Double = v17
    var v34: Double = v23
    var v43: Double = v16
    v18 = v10
    var v32: Double = v6
    var v50: Double = v32
    v7 = v24
    let v92: [Double] = [v11, v50]
    let v28: Double = v92[0]
    v11 = v2
    var v33: [Double] = v92
    var v61: [Double] = v92
    var v41: Double = v8
    var v48: Double = v34
    var v51: [Double] = v92
    v21 = v48
    v61[0] = v43
    v51[1] = v40
    let v66: Double = v51[0]
    var v60: [Double] = v33
    v33[0] = v18
    let v86: Double = v61[0]
    let v65: [Double] = [v44, v41]
    let v125: [[Double]] = [v60, v33, v65, v33, v61, v60, v51]
    v33[0] = v50
    var v59: [[Double]] = v125
    var v114: [Double] = v33
    let v95: Double = v51[1]
    var v56: [[Double]] = v125
    v51[1] = v14
    v60[1] = v86
    var v98: [Double] = v114
    var v64: [Double] = v114
    var v71: [Double] = v64
    v61[1] = v66
    let v212: Double = v98[1]
    var v110: [[Double]] = v59
    let v148: [[[Double]]] = [v125, v125, v125, v56, v125]
    v44 = v0
    var v296: [[[Double]]] = v148
    v9 = v28
    var v53: [[Double]] = v110
    let v150: [[Double]] = v296[1]
    let v191: [Double] = v150[2]
    var v115: [[Double]] = v56
    v60[0] = v95
    v114[0] = v50
    let v172: [Double] = v115[4]
    v59[1] = v71
    v110[3] = v33
    let v119: Double = v172[1]
    let v139: [Double] = v53[4]
    v53[3] = v191
    v33[1] = v1
    v32 = v212
    v115[5] = v114
    v115[5] = v139
    return v119
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s9, _ v2: Double) -> Double {
    let v4: Double = f29(v2)
    let v7: Double = f29(v4)
    let v10: Double = f29(v7)
    var v13: Double = v4
    let v31: Double = v13 * v10
    return v31
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0]])], p1: s0(p0: [[2.0]], p1: [[3.0]]))
    let v1: s9 = s9(p0: [s7(p0: s3(p0: [s1(p0: [s0(p0: [[4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0]], p1: [[7.0]])), s1(p0: [s0(p0: [[8.0]], p1: [[9.0]])], p1: s0(p0: [[10.0]], p1: [[11.0]])), s1(p0: [s0(p0: [[12.0]], p1: [[13.0]])], p1: s0(p0: [[14.0]], p1: [[15.0]]))], p1: s1(p0: [s0(p0: [[16.0]], p1: [[17.0]])], p1: s0(p0: [[18.0]], p1: [[19.0]]))), p1: [s1(p0: [s0(p0: [[20.0]], p1: [[21.0]])], p1: s0(p0: [[22.0]], p1: [[23.0]]))])], p1: s5(p0: s4(p0: [s3(p0: [s1(p0: [s0(p0: [[24.0]], p1: [[25.0]])], p1: s0(p0: [[26.0]], p1: [[27.0]])), s1(p0: [s0(p0: [[28.0]], p1: [[29.0]])], p1: s0(p0: [[30.0]], p1: [[31.0]])), s1(p0: [s0(p0: [[32.0]], p1: [[33.0]])], p1: s0(p0: [[34.0]], p1: [[35.0]]))], p1: s1(p0: [s0(p0: [[36.0]], p1: [[37.0]])], p1: s0(p0: [[38.0]], p1: [[39.0]])))], p1: s3(p0: [s1(p0: [s0(p0: [[40.0]], p1: [[41.0]])], p1: s0(p0: [[42.0]], p1: [[43.0]])), s1(p0: [s0(p0: [[44.0]], p1: [[45.0]])], p1: s0(p0: [[46.0]], p1: [[47.0]])), s1(p0: [s0(p0: [[48.0]], p1: [[49.0]])], p1: s0(p0: [[50.0]], p1: [[51.0]]))], p1: s1(p0: [s0(p0: [[52.0]], p1: [[53.0]])], p1: s0(p0: [[54.0]], p1: [[55.0]])))), p1: [s4(p0: [s3(p0: [s1(p0: [s0(p0: [[56.0]], p1: [[57.0]])], p1: s0(p0: [[58.0]], p1: [[59.0]])), s1(p0: [s0(p0: [[60.0]], p1: [[61.0]])], p1: s0(p0: [[62.0]], p1: [[63.0]])), s1(p0: [s0(p0: [[64.0]], p1: [[65.0]])], p1: s0(p0: [[66.0]], p1: [[67.0]]))], p1: s1(p0: [s0(p0: [[68.0]], p1: [[69.0]])], p1: s0(p0: [[70.0]], p1: [[71.0]])))], p1: s3(p0: [s1(p0: [s0(p0: [[72.0]], p1: [[73.0]])], p1: s0(p0: [[74.0]], p1: [[75.0]])), s1(p0: [s0(p0: [[76.0]], p1: [[77.0]])], p1: s0(p0: [[78.0]], p1: [[79.0]])), s1(p0: [s0(p0: [[80.0]], p1: [[81.0]])], p1: s0(p0: [[82.0]], p1: [[83.0]]))], p1: s1(p0: [s0(p0: [[84.0]], p1: [[85.0]])], p1: s0(p0: [[86.0]], p1: [[87.0]])))), s4(p0: [s3(p0: [s1(p0: [s0(p0: [[88.0]], p1: [[89.0]])], p1: s0(p0: [[90.0]], p1: [[91.0]])), s1(p0: [s0(p0: [[92.0]], p1: [[93.0]])], p1: s0(p0: [[94.0]], p1: [[95.0]])), s1(p0: [s0(p0: [[96.0]], p1: [[97.0]])], p1: s0(p0: [[98.0]], p1: [[99.0]]))], p1: s1(p0: [s0(p0: [[100.0]], p1: [[101.0]])], p1: s0(p0: [[102.0]], p1: [[103.0]])))], p1: s3(p0: [s1(p0: [s0(p0: [[104.0]], p1: [[105.0]])], p1: s0(p0: [[106.0]], p1: [[107.0]])), s1(p0: [s0(p0: [[108.0]], p1: [[109.0]])], p1: s0(p0: [[110.0]], p1: [[111.0]])), s1(p0: [s0(p0: [[112.0]], p1: [[113.0]])], p1: s0(p0: [[114.0]], p1: [[115.0]]))], p1: s1(p0: [s0(p0: [[116.0]], p1: [[117.0]])], p1: s0(p0: [[118.0]], p1: [[119.0]]))))]))
    let v2: Double = 120.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 120.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
