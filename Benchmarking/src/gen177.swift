  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: [[s1]]
    var p1: s2
    var p2: [s2]
  }
  struct s8 {
    var p0: s3
    var p1: s1
  }
  func f26(_ v0: s2) -> s2 {
    return v0
  }
  func f17(_ v0: s3) -> s3 {
    let v6: s2 = v0.p1
    let v5: s2 = f26(v6)
    let v7: [[s1]] = v0.p0
    let v2: [s2] = [v5, v5, v5]
    let v14: s3 = s3(p0: v7, p1: v5, p2: v2)
    return v14
  }
  func f10(_ v0: s3) -> s3 {
    let v1: s3 = f17(v0)
    let v7: s3 = f17(v1)
    let v5: [[s1]] = v7.p0
    let v8: [s1] = v5[0]
    let v10: s3 = f17(v7)
    let v13: s2 = v0.p1
    let v2: [s2] = v0.p2
    let v23: s2 = f26(v13)
    let v21: [s2] = [v23, v13, v13, v23]
    var v14: [s2] = v2
    let v37: s2 = v21[2]
    var v24: [s2] = v2
    var v27: s3 = v10
    let v31: s2 = f26(v37)
    let v40: s2 = f26(v31)
    v27.p2 = v2
    v27.p2 = v14
    let v25: s2 = f26(v37)
    let v32: [[s1]] = v1.p0
    var v26: s3 = v27
    v14 = v24
    v27.p1 = v25
    v27.p1 = v13
    let v61: s2 = f26(v40)
    v26.p1 = v25
    var v117: [[s1]] = v5
    v26.p0 = v32
    v27.p0 = v117
    let v112: s2 = v24[0]
    v26.p1 = v23
    v26.p1 = v61
    v27.p0 = v32
    v27.p1 = v112
    var v127: [s1] = v8
    v117[1] = v127
    v127 = v8
    v27.p1 = v61
    return v26
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    var v4: s8 = v0
    let v3: s3 = v0.p0
    let v8: s1 = v4.p1
    let v6: s3 = f10(v3)
    v4.p0 = v6
    var v7: s1 = v8
    let v13: [s0] = v8.p0
    v4.p1 = v7
    let v16: s0 = v13[0]
    v7.p1 = v16
    var v44: s0 = v16
    var v25: s0 = v44
    let v28: s0 = v13[0]
    let v42: s0 = v13[0]
    let v76: [[Double]] = v42.p1
    v4.p1 = v7
    var v43: s0 = v28
    v7.p0 = v13
    let v66: [[Double]] = v43.p0
    let v61: [Double] = v66[0]
    let v105: [[Double]] = v25.p1
    v44.p1 = v105
    v25.p1 = v76
    var v122: [[Double]] = v66
    v25.p0 = v122
    v7.p1 = v44
    let v203: Double = v61[0]
    return v203
  }
  func benchmark() {
    let v0: s8 = s8(p0: s3(p0: [[s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))], [s1(p0: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))]], p1: s2(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]), p2: [s2(p0: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), p1: [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]), s2(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])]), s2(p0: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), p1: [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])])]), p1: s1(p0: [s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])], p1: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])))
    let v1: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
