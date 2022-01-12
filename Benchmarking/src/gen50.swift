  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  func f49(_ v0: Double, _ v1: s0, _ v2: Double) -> Double {
    let v8: [[Double]] = v1.p3
    var v4: [[Double]] = v8
    let v3: [[Double]] = v1.p2
    let v13: [Double] = v4[0]
    let v5: [Double] = v3[1]
    let v7: Double = v13[0]
    v4[0] = v13
    let v6: [[Double]] = v1.p3
    v4[0] = v5
    let v21: [Double] = v3[1]
    let v20: [Double] = v3[0]
    v4[0] = v21
    let v18: [Double] = v6[1]
    v4[1] = v21
    v4[1] = v20
    var v48: Double = v7
    v4[0] = v18
    v4[1] = v20
    return v48
  }
  func f37(_ v0: s2) -> s2 {
    var v2: s2 = v0
    var v6: s2 = v2
    var v3: s2 = v6
    let v4: [s1] = v0.p0
    let v1: s1 = v4[0]
    v6.p0 = v4
    v6.p0 = v4
    v3.p0 = v4
    v3.p1 = v1
    return v3
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s2], _ v2: Double) -> Double {
    let v4: [[Double]] = v0.p2
    let v3: [[Double]] = v0.p0
    var v6: [[Double]] = v4
    let v11: Double = f49(v2, v0, v2)
    let v8: [Double] = v6[1]
    v6 = v4
    let v7: Double = f49(v11, v0, v11)
    var v12: s0 = v0
    v12 = v0
    v12.p1 = v6
    let v14: [[Double]] = v12.p1
    let v13: [[Double]] = v0.p3
    let v17: Double = v8[0]
    let v16: s2 = v1[0]
    let v15: Double = f49(v7, v12, v17)
    var v19: [Double] = v8
    let v21: s2 = f37(v16)
    let v24: s1 = v21.p1
    var v30: [[Double]] = v13
    var v25: [Double] = v8
    var v26: [[Double]] = v30
    let v22: s0 = v24.p1
    v6[1] = v19
    let v29: Double = v19[0]
    let v20: [Double] = v3[0]
    v12.p3 = v26
    v25[0] = v15
    let v61: Double = v8[0]
    v30[0] = v8
    var v47: [[Double]] = v3
    let v117: [[Double]] = v22.p0
    let v66: s0 = v24.p1
    let v65: Double = f49(v17, v66, v29)
    v25[0] = v11
    let v50: [Double] = v47[0]
    var v40: [Double] = v20
    let v35: [Double] = v14[1]
    v40[0] = v61
    v30[1] = v40
    v26[1] = v19
    let v44: Double = v2 - v29
    var v81: Double = v65
    let v63: Double = f49(v2, v22, v7)
    v40[0] = v81
    v25 = v50
    v19[0] = v44
    v25[0] = v2
    v47 = v117
    v12.p0 = v47
    v25[0] = v63
    v6[1] = v35
    let v274: Double = v25[0]
    return v274
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0], [4.0]], p3: [[5.0], [6.0]])
    let v1: [s2] = [s2(p0: [s1(p0: s0(p0: [[7.0]], p1: [[8.0], [9.0]], p2: [[10.0], [11.0]], p3: [[12.0], [13.0]]), p1: s0(p0: [[14.0]], p1: [[15.0], [16.0]], p2: [[17.0], [18.0]], p3: [[19.0], [20.0]]))], p1: s1(p0: s0(p0: [[21.0]], p1: [[22.0], [23.0]], p2: [[24.0], [25.0]], p3: [[26.0], [27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0], [30.0]], p2: [[31.0], [32.0]], p3: [[33.0], [34.0]]))), s2(p0: [s1(p0: s0(p0: [[35.0]], p1: [[36.0], [37.0]], p2: [[38.0], [39.0]], p3: [[40.0], [41.0]]), p1: s0(p0: [[42.0]], p1: [[43.0], [44.0]], p2: [[45.0], [46.0]], p3: [[47.0], [48.0]]))], p1: s1(p0: s0(p0: [[49.0]], p1: [[50.0], [51.0]], p2: [[52.0], [53.0]], p3: [[54.0], [55.0]]), p1: s0(p0: [[56.0]], p1: [[57.0], [58.0]], p2: [[59.0], [60.0]], p3: [[61.0], [62.0]])))]
    let v2: Double = 63.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 63.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
