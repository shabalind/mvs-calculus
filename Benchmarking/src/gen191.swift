  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: [s1]
  }
  func f85(_ v0: [s0]) -> [s0] {
    var v5: [s0] = v0
    var v4: [s0] = v5
    let v1: s0 = v4[0]
    v4[0] = v1
    var v3: s0 = v1
    let v9: [[Double]] = v3.p1
    var v17: [s0] = v4
    let v15: [[Double]] = v3.p0
    v17[0] = v1
    var v23: [[Double]] = v9
    v5 = v17
    v3.p1 = v15
    v3.p0 = v23
    v4[0] = v3
    return v17
  }
  func f77(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    var v7: [[Double]] = v5
    var v1: s0 = v0
    v1.p0 = v5
    var v3: [[Double]] = v5
    let v4: s0 = s0(p0: v5, p1: v3)
    v1.p1 = v3
    let v6: [[Double]] = v1.p0
    let v12: [[Double]] = v0.p0
    v7 = v6
    v1.p0 = v7
    v1.p0 = v12
    let v33: [[Double]] = v4.p0
    v1.p0 = v3
    var v29: [[Double]] = v12
    v1.p1 = v33
    let v41: [[Double]] = v0.p1
    let v70: [[Double]] = v1.p0
    v1.p0 = v29
    v1.p1 = v41
    let v58: s0 = s0(p0: v70, p1: v33)
    v1.p0 = v70
    v1.p0 = v41
    return v58
  }
  func f40(_ v0: [s0]) -> [s0] {
    var v3: [s0] = v0
    let v2: [s0] = f85(v0)
    let v5: s0 = v3[0]
    let v1: [[Double]] = v5.p1
    var v6: [[Double]] = v1
    let v4: [Double] = v6[1]
    let v13: [[Double]] = v5.p0
    let v8: s0 = f77(v5)
    let v10: s0 = v3[0]
    let v11: [[Double]] = v8.p1
    var v12: s0 = v8
    let v14: [[Double]] = v10.p1
    v12.p0 = v14
    let v22: [[Double]] = v8.p1
    let v19: [s0] = f85(v2)
    v12.p0 = v11
    v12.p1 = v13
    v6[0] = v4
    v12.p1 = v22
    let v30: [[Double]] = v10.p0
    v12.p1 = v1
    v3[0] = v10
    v12.p0 = v6
    var v29: s0 = v8
    v6[1] = v4
    let v39: s0 = s0(p0: v6, p1: v30)
    let v38: s0 = f77(v29)
    let v51: [[Double]] = v12.p1
    let v34: [s0] = f85(v19)
    let v59: [Double] = v51[1]
    v3[0] = v5
    v6[2] = v59
    v29.p0 = v14
    v29.p1 = v1
    v29.p1 = v30
    let v109: [[Double]] = v38.p0
    let v105: s0 = s0(p0: v6, p1: v6)
    let v150: [s0] = f85(v34)
    v12.p1 = v11
    v12.p1 = v14
    v12 = v39
    var v89: [s0] = v150
    v29.p1 = v109
    v89[0] = v105
    v3[0] = v29
    v12.p1 = v1
    v29.p0 = v13
    return v89
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s0], _ v2: Double) -> Double {
    let v3: [s0] = f40(v1)
    let v4: s0 = v3[0]
    let v10: [[Double]] = v4.p0
    let v23: [Double] = v10[0]
    let v105: Double = v23[0]
    return v105
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])])])
    let v1: [s0] = [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]
    let v2: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
