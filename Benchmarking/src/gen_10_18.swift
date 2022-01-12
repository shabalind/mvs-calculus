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
    var p0: [s1]
    var p1: [[s0]]
    var p2: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  func f108(_ v0: Double) -> Double {
    var v7: Double = v0
    var v5: Double = v0
    var v6: Double = v0
    var v9: Double = v7
    var v2: Double = v7
    var v3: Double = v6
    var v16: Double = v7
    var v15: Double = v0
    let v12: Double = v16 - v3
    var v4: Double = v16
    let v30: Double = v16 - v4
    var v33: Double = v6
    var v22: Double = v30
    var v20: Double = v3
    let v41: [Double] = [v33, v16, v3, v22, v12, v12]
    var v18: [Double] = v41
    let v25: Double = v18[2]
    let v53: Double = v18[5]
    var v42: Double = v53
    let v59: Double = v41[5]
    var v24: [Double] = v41
    var v28: Double = v9
    v24[0] = v5
    var v49: [Double] = v24
    var v71: [Double] = v49
    v24[1] = v25
    let v37: [[Double]] = [v41]
    var v43: [Double] = v41
    v49[0] = v12
    let v56: [Double] = v37[0]
    let v85: [[Double]] = [v56, v18, v41, v49, v41, v24]
    v24[5] = v28
    var v45: [[Double]] = v85
    var v44: [[Double]] = v85
    v45 = v44
    v2 = v59
    v24 = v71
    v22 = v42
    var v123: [[Double]] = v44
    v71[3] = v2
    var v47: [[Double]] = v123
    v123[4] = v43
    v43 = v24
    v24[2] = v28
    var v89: [[Double]] = v47
    let v94: [[[Double]]] = [v89, v47, v47, v45, v123, v44, v45]
    v2 = v7
    var v103: [[[Double]]] = v94
    v43[4] = v0
    v18[0] = v9
    var v100: [[[Double]]] = v103
    let v78: [[Double]] = v100[4]
    v71[0] = v20
    let v80: [Double] = v78[4]
    v49[5] = v15
    let v259: Double = v80[3]
    return v259
  }
  func f73(_ v0: Double) -> Double {
    let v7: Double = f108(v0)
    var v5: Double = v0
    let v4: Double = f108(v7)
    var v11: Double = v5
    var v8: Double = v4
    let v14: [Double] = [v8, v11, v11, v5]
    let v9: Double = v14[1]
    let v26: Double = f108(v0)
    var v12: [Double] = v14
    let v19: Double = v12[2]
    var v40: [Double] = v12
    var v20: [Double] = v40
    let v24: Double = f108(v5)
    let v43: Double = f108(v26)
    v12[3] = v7
    v40 = v14
    var v25: [Double] = v12
    var v22: [Double] = v25
    let v28: Double = v20[3]
    let v32: Double = f108(v9)
    var v59: [Double] = v25
    let v79: Double = v14[0]
    var v61: [Double] = v14
    v20[2] = v32
    var v57: [Double] = v59
    var v42: [Double] = v40
    v12[1] = v4
    let v34: Double = v40[0]
    let v44: Double = v14[3]
    var v41: [Double] = v59
    var v103: [Double] = v61
    let v134: Double = f108(v26)
    var v75: [Double] = v61
    v40[2] = v19
    let v63: Double = f108(v44)
    v103[2] = v134
    let v52: Double = v41[3]
    v42 = v22
    v41[2] = v34
    v59[0] = v52
    v57 = v61
    v40[0] = v8
    let v62: Double = v14[3]
    v57[3] = v79
    var v139: [Double] = v61
    v41[0] = v24
    let v114: [[Double]] = [v57, v103, v139, v75, v61, v42, v12]
    v61[0] = v62
    v61 = v40
    v59[0] = v43
    let v81: [Double] = v114[6]
    v12[2] = v28
    let v119: Double = f108(v63)
    var v133: [Double] = v81
    v25[2] = v119
    var v181: Double = v5
    let v116: Double = v133[0]
    let v135: Double = f108(v116)
    v139[1] = v19
    v42[3] = v181
    v41[2] = v135
    return v135
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s3, _ v2: s2, _ v3: Double) -> Double {
    let v6: [s0] = v2.p2
    let v28: s0 = v6[1]
    var v13: Double = v3
    let v25: [[Double]] = v28.p1
    let v26: [Double] = v25[0]
    var v34: [Double] = v26
    let v50: Double = f73(v13)
    var v60: [Double] = v34
    let v46: Double = v60[0]
    v60[0] = v3
    let v38: Double = v34[0]
    v34[0] = v13
    var v49: [Double] = v26
    let v87: Double = v3 + v13
    v34[0] = v38
    v49 = v34
    v60[0] = v50
    v60[0] = v87
    v34[0] = v46
    let v119: Double = v49[0]
    return v119
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]))]
    let v1: s3 = s3(p0: s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])), p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])])
    let v2: s2 = s2(p0: [s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])), s1(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]]), p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]]))], p1: [[s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])], [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])]], p2: [s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]]), s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]])])
    let v3: Double = 78.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 78.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
