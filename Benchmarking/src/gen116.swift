  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f21(_ v0: [[Double]]) -> [[Double]] {
    var v5: [[Double]] = v0
    let v7: [Double] = v5[0]
    let v1: [Double] = v5[0]
    var v3: [Double] = v7
    let v6: [Double] = v5[0]
    v5[0] = v3
    let v4: Double = v3[0]
    var v8: Double = v4
    let v12: [Double] = v5[0]
    v5[0] = v7
    let v9: [Double] = v0[0]
    v5[0] = v12
    let v11: [Double] = v5[0]
    let v16: [Double] = v0[0]
    let v17: Double = v16[0]
    let v13: Double = v9[0]
    let v23: Double = v12[0]
    var v18: Double = v17
    v5[0] = v1
    var v33: [Double] = v6
    v3[0] = v13
    var v30: [Double] = v11
    let v31: Double = v23 / v13
    var v46: [[Double]] = v5
    let v34: Double = v7[0]
    v46 = v5
    v30[0] = v34
    v3[0] = v18
    v46[0] = v30
    v5[0] = v33
    v33[0] = v31
    var v50: [[Double]] = v46
    v33[0] = v8
    return v50
  }
  func f20(_ v0: s0, _ v1: s1) -> s0 {
    let v3: [[Double]] = v0.p1
    let v2: s0 = v1.p1
    var v5: [[Double]] = v3
    let v4: s0 = v1.p0
    let v7: [Double] = v3[0]
    let v10: [[Double]] = v4.p1
    var v6: [[Double]] = v10
    let v8: s0 = v1.p1
    let v9: [Double] = v6[0]
    v6[0] = v7
    var v14: [[Double]] = v5
    v6 = v10
    let v12: [Double] = v14[0]
    var v19: s1 = v1
    v6[1] = v9
    let v15: s0 = v19.p0
    v5[0] = v9
    var v16: s0 = v2
    v19.p0 = v16
    v6[1] = v9
    v6[0] = v12
    var v28: s0 = v0
    v16.p1 = v14
    v19.p0 = v4
    var v35: s1 = v19
    let v33: [[Double]] = v8.p2
    v19.p0 = v0
    let v51: [[Double]] = f21(v33)
    v6[1] = v9
    let v46: s0 = v35.p1
    let v43: [[Double]] = v46.p2
    let v106: [[Double]] = f21(v43)
    let v89: s0 = v35.p1
    let v37: [Double] = v5[0]
    let v146: [[Double]] = f21(v51)
    let v98: [[Double]] = v15.p1
    let v77: [[Double]] = f21(v146)
    v14[0] = v37
    v35.p0 = v15
    v16.p2 = v77
    var v109: s1 = v35
    v16.p2 = v106
    let v80: s0 = v109.p0
    v109.p1 = v89
    var v113: [[Double]] = v98
    v28.p1 = v113
    v109.p0 = v8
    v19.p1 = v28
    return v80
  }
  func f19(_ v0: s0) -> s0 {
    let v1: s1 = s1(p0: v0, p1: v0)
    let v2: s0 = f20(v0, v1)
    let v11: s0 = f20(v2, v1)
    let v13: s0 = f20(v11, v1)
    let v14: s0 = f20(v13, v1)
    return v14
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s0, _ v2: Double) -> Double {
    let v7: s0 = v0.p0
    let v10: s0 = f19(v1)
    let v3: s0 = f20(v10, v0)
    let v6: [s0] = [v3, v1, v7, v1]
    var v39: Double = v2
    let v26: s0 = v6[0]
    let v21: [[Double]] = v26.p0
    var v34: [[Double]] = v21
    let v58: [Double] = v34[1]
    var v33: [Double] = v58
    v34[2] = v58
    let v75: Double = v33[0]
    let v244: Double = v75 / v39
    return v244
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0]], p2: [[11.0]]))
    let v1: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0]], p2: [[17.0]])
    let v2: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
