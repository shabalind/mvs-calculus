  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f18(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v4: [[Double]] = v0.p2
    let v6: [Double] = v4[2]
    let v2: [Double] = v4[1]
    var v5: s0 = v7
    v5.p1 = v4
    v5.p2 = v4
    v5.p2 = v4
    var v3: s0 = v5
    let v8: [Double] = v4[1]
    let v1: [[Double]] = v7.p2
    var v15: [[Double]] = v1
    let v13: [Double] = v1[2]
    var v20: [[Double]] = v1
    let v9: [[Double]] = v0.p1
    var v12: [[Double]] = v9
    var v11: [[Double]] = v12
    var v17: [Double] = v13
    let v14: [[Double]] = v0.p2
    let v28: [[Double]] = v3.p2
    v15[0] = v13
    var v21: [[Double]] = v1
    let v18: [[Double]] = v3.p2
    v21[2] = v2
    v21[1] = v6
    v21[0] = v6
    let v36: [[Double]] = v7.p0
    v20 = v11
    v5.p2 = v9
    v11[0] = v6
    v5.p2 = v11
    let v19: [[Double]] = v7.p0
    var v25: [[Double]] = v19
    var v26: [[Double]] = v25
    v7.p1 = v15
    let v50: [[Double]] = v7.p0
    v7.p0 = v50
    v3.p1 = v14
    let v41: s0 = s0(p0: v26, p1: v28, p2: v21)
    v15[2] = v17
    v3.p0 = v26
    v7.p0 = v36
    var v38: [Double] = v2
    v25[0] = v13
    v26[0] = v8
    v5.p2 = v18
    let v61: [[Double]] = v5.p0
    let v120: Double = v6[0]
    var v93: [Double] = v38
    let v47: [Double] = v20[0]
    let v46: Double = v47[0]
    let v49: [[Double]] = v3.p2
    v3.p0 = v61
    v26[1] = v93
    v3.p0 = v50
    let v69: [[Double]] = v41.p0
    var v62: s0 = v41
    v38[0] = v120
    v38[0] = v46
    var v65: s0 = v62
    v5.p2 = v12
    v62.p1 = v49
    v65.p0 = v69
    return v65
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v6: s1 = v0
    var v4: s1 = v6
    let v2: s0 = v4.p0
    let v5: s0 = f18(v2)
    let v8: [[Double]] = v5.p0
    let v9: [Double] = v8[0]
    let v15: Double = v9[0]
    let v27: Double = v9[0]
    let v22: [s0] = v6.p1
    let v28: Double = v1 + v15
    var v59: [Double] = v9
    let v41: s0 = v22[0]
    v59[0] = v27
    let v123: [[Double]] = v5.p1
    let v54: [Double] = v123[2]
    let v52: Double = v54[0]
    v4.p1 = v22
    v59[0] = v52
    var v39: [s0] = v22
    v59[0] = v1
    let v61: Double = v59[0]
    v59[0] = v27
    let v45: Double = v61 / v28
    let v135: s0 = v39[1]
    v59[0] = v27
    v6.p0 = v41
    v4.p0 = v135
    return v45
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0], [6.0], [7.0]]), p1: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0], [12.0]], p2: [[13.0], [14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0], [20.0]], p2: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0], [28.0]], p2: [[29.0], [30.0], [31.0]])])
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
