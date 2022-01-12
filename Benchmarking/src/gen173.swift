  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  struct s7 {
    var p0: [s1]
    var p1: s3
  }
  func f2(_ v0: [[s0]]) -> [[s0]] {
    var v3: [[s0]] = v0
    v3 = v0
    var v1: [[s0]] = v0
    var v2: [[s0]] = v1
    var v6: [[s0]] = v0
    let v7: [s0] = v1[1]
    v3[2] = v7
    var v4: [[s0]] = v6
    var v8: [s0] = v7
    let v9: [s0] = v1[1]
    v3[1] = v8
    let v5: s0 = v8[0]
    var v12: s0 = v5
    let v16: s0 = v8[0]
    let v20: [[Double]] = v12.p1
    v1[1] = v8
    let v10: [[Double]] = v16.p0
    var v11: [[Double]] = v20
    let v21: [[Double]] = v5.p0
    let v15: [[Double]] = v16.p0
    let v22: [[Double]] = v5.p0
    var v14: [[Double]] = v21
    let v25: s0 = v8[0]
    let v34: [Double] = v14[1]
    let v24: [[Double]] = v16.p1
    let v13: s0 = s0(p0: v21, p1: v20)
    var v43: [s0] = v7
    v12.p1 = v20
    let v32: [Double] = v15[0]
    let v30: [[Double]] = v25.p0
    let v17: [[Double]] = v25.p1
    var v33: [Double] = v32
    v3[1] = v9
    v4[0] = v43
    v3[2] = v43
    var v29: [[Double]] = v20
    let v39: Double = v32[0]
    let v35: [[Double]] = v13.p1
    let v19: Double = v34[0]
    v14[0] = v33
    let v26: [Double] = v17[1]
    let v73: s0 = v8[0]
    v12.p1 = v29
    var v58: [s0] = v9
    v4[1] = v58
    v11 = v20
    let v59: [s0] = v2[2]
    v33[0] = v19
    let v97: [s0] = v6[2]
    let v31: s0 = v97[0]
    let v36: [[Double]] = v73.p0
    let v48: s0 = s0(p0: v36, p1: v35)
    v58[0] = v48
    let v38: Double = v19 * v39
    let v93: [[Double]] = v25.p0
    v12.p1 = v29
    let v37: [s0] = v4[2]
    v11[1] = v26
    var v23: s0 = v31
    let v70: [[[Double]]] = [v17, v35, v24]
    let v84: [[Double]] = v48.p1
    v23.p1 = v17
    var v52: [Double] = v26
    v14[1] = v52
    v12.p1 = v20
    let v104: s0 = v59[0]
    let v81: [[Double]] = v70[0]
    v12.p1 = v84
    v12.p0 = v93
    v12.p0 = v15
    let v45: [[Double]] = v23.p1
    let v86: [s0] = v3[1]
    v23.p0 = v22
    let v124: s1 = s1(p0: v12, p1: v6)
    var v51: Double = v19
    v2[0] = v8
    let v56: s0 = v124.p0
    v23.p1 = v84
    let v66: [s0] = v3[0]
    var v90: [s0] = v9
    v11[0] = v34
    v33[0] = v38
    let v78: Double = v19 + v51
    v12.p1 = v17
    v4[0] = v9
    let v72: [[Double]] = v104.p1
    v90[0] = v56
    v8 = v7
    v2[1] = v37
    v12.p0 = v36
    var v169: [[s0]] = v3
    v169[0] = v90
    v43[0] = v31
    v90[0] = v25
    v169[2] = v66
    v23.p1 = v81
    let v155: Double = v78 * v51
    v23.p0 = v30
    v23.p1 = v72
    v12.p1 = v45
    v52[0] = v155
    v3[1] = v86
    let v100: [s0] = v2[0]
    v12.p0 = v10
    v12.p1 = v11
    v2[0] = v58
    v2[1] = v100
    v8[0] = v12
    return v169
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v5: s3 = v0.p1
    let v4: s2 = v5.p0
    let v11: [[s0]] = v4.p1
    let v16: [[s0]] = f2(v11)
    let v12: [s0] = v16[0]
    let v18: s0 = v12[0]
    var v13: s0 = v18
    let v26: [[Double]] = v13.p0
    let v37: [Double] = v26[0]
    v13.p0 = v26
    let v63: [[Double]] = v13.p0
    v13.p0 = v63
    v13.p0 = v26
    v13.p0 = v26
    let v159: Double = v37[0]
    return v159
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])], [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]]), s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: [[s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])], [s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])]]), s1(p0: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]), p1: [[s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])], [s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]])], [s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]])], p1: s3(p0: s2(p0: [s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]]), s0(p0: [[65.0], [66.0]], p1: [[67.0], [68.0], [69.0]])], p1: [[s0(p0: [[70.0], [71.0]], p1: [[72.0], [73.0], [74.0]])], [s0(p0: [[75.0], [76.0]], p1: [[77.0], [78.0], [79.0]])], [s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0], [84.0]])]]), p1: s1(p0: s0(p0: [[85.0], [86.0]], p1: [[87.0], [88.0], [89.0]]), p1: [[s0(p0: [[90.0], [91.0]], p1: [[92.0], [93.0], [94.0]])], [s0(p0: [[95.0], [96.0]], p1: [[97.0], [98.0], [99.0]])], [s0(p0: [[100.0], [101.0]], p1: [[102.0], [103.0], [104.0]])]])))
    let v1: Double = 105.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 105.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
