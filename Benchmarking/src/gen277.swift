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
  struct s3 {
    var p0: Double
    var p1: s0
  }
  struct s4 {
    var p0: s3
    var p1: s3
  }
  struct s6 {
    var p0: [s3]
    var p1: s4
  }
  func f112(_ v0: s6) -> s6 {
    var v6: s6 = v0
    var v1: s6 = v6
    var v4: s6 = v1
    let v3: s4 = v1.p1
    v6.p1 = v3
    return v4
  }
  func f89(_ v0: s0, _ v1: s0) -> s0 {
    let v6: [[Double]] = v0.p3
    var v3: s0 = v0
    let v8: [[Double]] = v3.p2
    let v4: [[Double]] = v0.p2
    var v9: s0 = v1
    let v2: [[Double]] = v9.p3
    v9.p3 = v6
    let v5: [Double] = v8[0]
    var v15: s0 = v0
    let v22: [[Double]] = v15.p2
    var v12: s0 = v15
    var v13: [Double] = v5
    let v7: Double = v13[0]
    v15.p1 = v8
    v9.p2 = v4
    v12.p2 = v4
    let v11: Double = v13[0]
    let v10: Double = v5[0]
    v13[0] = v10
    v15.p0 = v8
    var v17: [Double] = v5
    v12.p0 = v22
    let v26: [[Double]] = v15.p0
    let v16: Double = v7 - v11
    let v14: [[Double]] = v15.p3
    v9.p1 = v14
    v13[0] = v16
    v3.p0 = v2
    let v25: [Double] = v2[0]
    v13[0] = v11
    v9.p3 = v22
    v15.p3 = v2
    v17[0] = v16
    v3.p0 = v2
    v15.p0 = v8
    v15.p2 = v8
    var v84: [[Double]] = v26
    var v51: s0 = v3
    v84[0] = v17
    let v43: s1 = s1(p0: v51, p1: v12)
    var v61: s1 = v43
    var v149: [[Double]] = v8
    let v52: [Double] = v149[0]
    v3.p1 = v84
    v84[0] = v52
    let v58: s0 = v61.p1
    v15.p2 = v149
    v84[0] = v25
    v15.p2 = v22
    v61.p0 = v12
    return v58
  }
  func f81(_ v0: s6) -> s6 {
    let v1: s4 = v0.p1
    var v3: s6 = v0
    v3 = v0
    let v5: s4 = v3.p1
    v3.p1 = v5
    let v8: [s4] = [v5, v1, v5, v1, v5, v1, v5]
    var v6: s6 = v0
    v6.p1 = v5
    var v16: s6 = v6
    let v25: s4 = v8[6]
    v16.p1 = v25
    v6.p1 = v25
    return v16
  }
  func f62(_ v0: s6) -> s6 {
    var v2: s6 = v0
    var v6: s6 = v2
    let v10: [s3] = v6.p0
    v2.p0 = v10
    return v6
  }
  func f6(_ v0: s4, _ v1: Double) -> Double {
    let v8: s3 = v0.p0
    let v11: s0 = v8.p1
    var v12: s0 = v11
    let v10: s0 = f89(v12, v11)
    let v26: s0 = f89(v11, v11)
    let v43: s0 = f89(v26, v26)
    let v23: s0 = f89(v10, v43)
    let v33: [[Double]] = v23.p2
    let v47: [Double] = v33[0]
    let v68: Double = v8.p0
    let v51: Double = v47[0]
    let v53: Double = v51 * v68
    v12.p2 = v33
    return v53
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    var v7: Double = v1
    let v2: s6 = v0[0]
    let v4: s6 = f62(v2)
    let v6: s6 = f81(v4)
    let v11: s6 = f62(v2)
    var v9: Double = v7
    var v10: s6 = v6
    let v12: s6 = f112(v11)
    let v16: s6 = v0[0]
    let v14: s6 = f112(v10)
    let v21: [s6] = [v14, v6, v4, v12, v16, v2]
    var v20: Double = v9
    let v37: s6 = f62(v10)
    let v39: s6 = v21[2]
    let v42: [s3] = v37.p0
    v10.p0 = v42
    v10.p0 = v42
    let v68: s4 = v39.p1
    v10.p0 = v42
    v10.p0 = v42
    let v150: Double = f6(v68, v20)
    let v134: Double = v150 * v1
    return v134
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: [s3(p0: 0.0, p1: s0(p0: [[1.0]], p1: [[2.0]], p2: [[3.0]], p3: [[4.0]]))], p1: s4(p0: s3(p0: 5.0, p1: s0(p0: [[6.0]], p1: [[7.0]], p2: [[8.0]], p3: [[9.0]])), p1: s3(p0: 10.0, p1: s0(p0: [[11.0]], p1: [[12.0]], p2: [[13.0]], p3: [[14.0]]))))]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
