  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s4 {
    var p0: [s1]
    var p1: [s1]
  }
  struct s9 {
    var p0: s4
    var p1: [s0]
  }
  func f75(_ v0: Double) -> Double {
    var v3: Double = v0
    var v4: Double = v3
    var v2: Double = v4
    var v7: Double = v3
    var v5: Double = v4
    var v9: Double = v4
    var v1: Double = v0
    var v8: Double = v9
    let v12: Double = v5 + v5
    let v13: [Double] = [v7, v5, v9, v8]
    var v21: [Double] = v13
    v21[1] = v2
    v3 = v1
    v21[2] = v7
    v21[3] = v12
    var v15: Double = v5
    let v17: Double = v13[1]
    var v23: [Double] = v13
    var v42: [Double] = v21
    v23[0] = v17
    let v32: Double = v13[0]
    v23[3] = v15
    var v29: Double = v15
    let v50: Double = v13[0]
    var v51: [Double] = v42
    let v35: [Double] = [v32, v50, v1, v5, v4, v1]
    var v48: [Double] = v51
    var v56: [Double] = v35
    v42[3] = v1
    let v86: Double = v56[1]
    v51[2] = v86
    v51 = v23
    let v59: Double = v48[0]
    v42[3] = v29
    return v59
  }
  func f26(_ v0: Double) -> Double {
    var v6: Double = v0
    var v3: Double = v0
    let v5: Double = f75(v6)
    let v8: Double = f75(v0)
    let v1: Double = f75(v3)
    let v4: Double = f75(v1)
    var v7: Double = v6
    var v2: Double = v8
    var v9: Double = v2
    let v25: Double = f75(v5)
    var v14: Double = v8
    let v15: Double = f75(v5)
    let v11: Double = f75(v3)
    let v21: Double = f75(v5)
    var v13: Double = v21
    let v10: Double = f75(v8)
    let v19: Double = f75(v9)
    let v23: Double = f75(v0)
    let v26: Double = f75(v11)
    let v31: Double = f75(v26)
    var v27: Double = v25
    let v33: [Double] = [v10, v19, v14, v31, v6, v5, v26]
    var v40: [Double] = v33
    let v55: Double = v27 - v4
    let v38: Double = v33[6]
    var v22: [Double] = v40
    v22[4] = v55
    var v56: [Double] = v22
    let v103: Double = v56[2]
    v40[1] = v15
    let v91: Double = v22[4]
    var v36: [Double] = v40
    var v57: Double = v23
    v22[2] = v55
    let v69: Double = f75(v11)
    var v35: [Double] = v56
    let v45: Double = v36[5]
    var v34: Double = v91
    v56[0] = v3
    let v47: [Double] = [v0, v57, v25]
    v40[1] = v7
    var v68: [Double] = v47
    let v42: Double = f75(v69)
    v68[2] = v31
    v68[0] = v13
    let v54: Double = v68[0]
    v40[0] = v54
    v36[1] = v34
    let v134: Double = v45 / v103
    let v141: Double = f75(v15)
    v36[1] = v141
    v40 = v35
    let v79: Double = f75(v42)
    let v210: Double = f75(v134)
    v68[0] = v23
    v68[2] = v79
    v36 = v35
    v36[6] = v38
    return v210
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    let v6: Double = f26(v1)
    let v113: Double = f75(v6)
    return v113
  }
  func benchmark() {
    let v0: s9 = s9(p0: s4(p0: [s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: [[s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]]), s1(p0: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], p1: [[s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])], [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]])], p1: [s1(p0: [s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])], p1: [[s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])], [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])]]), s1(p0: [s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])], p1: [[s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]])], [s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]])]])]), p1: [s0(p0: [[80.0]], p1: [[81.0], [82.0], [83.0]]), s0(p0: [[84.0]], p1: [[85.0], [86.0], [87.0]])])
    let v1: Double = 88.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 88.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
