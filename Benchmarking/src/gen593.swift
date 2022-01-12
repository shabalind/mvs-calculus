  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: Double
    var p4: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  func f49(_ v0: [s2], _ v1: s2) -> s2 {
    var v4: [s2] = v0
    var v2: [s2] = v0
    let v11: s2 = v2[0]
    let v3: [s0] = v1.p1
    var v5: s2 = v1
    let v7: [s0] = v1.p1
    let v6: s0 = v7[0]
    let v24: s0 = v7[0]
    let v13: [s0] = v5.p1
    v5.p1 = v13
    let v10: [s0] = v1.p1
    var v18: s0 = v6
    let v12: s0 = v7[0]
    let v33: s0 = v5.p0
    let v14: Double = v6.p3
    v18.p3 = v14
    var v29: Double = v14
    v5.p1 = v10
    var v15: [s0] = v13
    var v49: s2 = v11
    var v21: Double = v14
    let v30: [Double] = [v21, v21, v14, v14, v29, v29, v14]
    var v71: s0 = v18
    let v39: [[Double]] = v12.p4
    let v35: s0 = v49.p0
    v4[1] = v5
    var v41: [s0] = v3
    var v52: [s0] = v41
    let v86: Double = v30[0]
    v49.p1 = v41
    let v19: s0 = v52[1]
    let v31: Double = v21 * v21
    v2[0] = v1
    v15[1] = v71
    let v28: s2 = v4[0]
    v5.p0 = v6
    var v20: [s0] = v3
    v21 = v31
    v71.p0 = v39
    v2[1] = v49
    v15 = v20
    var v40: Double = v86
    var v53: [Double] = v30
    v71.p3 = v86
    var v102: s2 = v5
    let v89: s0 = v13[0]
    var v51: [Double] = v53
    v102.p0 = v24
    let v109: Double = v40 / v31
    v5.p0 = v6
    let v116: s0 = v10[0]
    let v47: [s2] = [v49, v5, v11, v49, v102, v28, v1]
    v18.p4 = v39
    v49.p0 = v89
    var v42: [s2] = v47
    v102.p0 = v33
    v53[1] = v40
    v102.p1 = v41
    v102.p0 = v19
    v49.p1 = v15
    let v103: Double = v51[5]
    v71.p3 = v103
    v5.p0 = v116
    v102.p1 = v52
    v5.p0 = v12
    v52[0] = v89
    let v88: [[Double]] = v35.p0
    v18.p0 = v88
    v5.p0 = v89
    let v97: s2 = v42[5]
    v4[1] = v49
    v18.p3 = v109
    v5.p1 = v10
    v53[6] = v103
    return v97
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v6: s2 = v0[0]
    let v3: s2 = f49(v0, v6)
    let v9: s0 = v3.p0
    let v11: [[Double]] = v9.p2
    let v61: [Double] = v11[1]
    let v66: Double = v61[0]
    return v66
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0], [5.0], [6.0]], p3: 7.0, p4: [[8.0]]), p1: [s0(p0: [[9.0]], p1: [[10.0], [11.0], [12.0]], p2: [[13.0], [14.0], [15.0]], p3: 16.0, p4: [[17.0]]), s0(p0: [[18.0]], p1: [[19.0], [20.0], [21.0]], p2: [[22.0], [23.0], [24.0]], p3: 25.0, p4: [[26.0]])]), s2(p0: s0(p0: [[27.0]], p1: [[28.0], [29.0], [30.0]], p2: [[31.0], [32.0], [33.0]], p3: 34.0, p4: [[35.0]]), p1: [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]], p2: [[40.0], [41.0], [42.0]], p3: 43.0, p4: [[44.0]]), s0(p0: [[45.0]], p1: [[46.0], [47.0], [48.0]], p2: [[49.0], [50.0], [51.0]], p3: 52.0, p4: [[53.0]])])]
    let v1: Double = 54.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 54.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
