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
    var p0: s1
    var p1: s0
  }
  struct s5 {
    var p0: s2
    var p1: s2
  }
  func f63(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p1
    let v1: [Double] = v3[0]
    let v5: [[Double]] = v0.p0
    var v7: s0 = v0
    let v9: [[Double]] = v7.p1
    var v4: [[Double]] = v5
    let v11: [Double] = v3[1]
    v4[0] = v11
    v4[0] = v1
    var v18: [[Double]] = v9
    let v38: [Double] = v18[0]
    let v14: [Double] = v9[1]
    let v31: [Double] = v18[1]
    let v20: [[Double]] = v0.p1
    var v42: [[Double]] = v4
    let v60: s0 = s0(p0: v42, p1: v20)
    v4[2] = v1
    v18[1] = v14
    v4[0] = v38
    v42[0] = v31
    return v60
  }
  func f61(_ v0: s2) -> s2 {
    let v30: s5 = s5(p0: v0, p1: v0)
    var v69: s5 = v30
    var v76: s5 = v69
    v69.p1 = v0
    let v214: s2 = v76.p0
    return v214
  }
  func f46(_ v0: [[Double]]) -> [[Double]] {
    var v3: [[Double]] = v0
    var v6: [[Double]] = v3
    let v7: [[[Double]]] = [v6, v6, v6, v0]
    let v8: [[Double]] = v7[0]
    var v2: [[[Double]]] = v7
    let v5: [Double] = v6[0]
    let v4: [Double] = v6[0]
    var v11: [Double] = v5
    let v14: [[[[Double]]]] = [v7, v7, v7, v2]
    let v10: [[[Double]]] = v14[1]
    v3[1] = v11
    v6[1] = v4
    let v21: [[Double]] = v10[0]
    v3[1] = v4
    v2[1] = v8
    v6[1] = v5
    return v21
  }
  func f45(_ v0: s2) -> s2 {
    var v6: s2 = v0
    let v5: s0 = v0.p1
    var v3: s2 = v0
    var v4: s0 = v5
    var v1: s2 = v6
    let v10: s2 = f61(v3)
    v1.p1 = v4
    v3.p1 = v5
    let v11: s0 = f63(v5)
    v1.p1 = v11
    let v9: s1 = v10.p0
    let v14: [[Double]] = v5.p1
    var v20: s0 = v4
    let v18: [[Double]] = f46(v14)
    let v23: [s0] = v9.p0
    let v21: [[Double]] = f46(v18)
    v3.p0 = v9
    let v22: s0 = v23[0]
    v1.p0 = v9
    let v67: [[Double]] = v22.p0
    v6.p1 = v20
    v4.p0 = v67
    let v69: s2 = f61(v1)
    v1.p1 = v20
    v1.p0 = v9
    v4.p1 = v21
    return v69
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v4: s2 = v0
    let v5: s2 = f45(v4)
    let v7: s0 = v4.p1
    var v10: s0 = v7
    v4.p1 = v10
    let v11: s2 = f61(v5)
    let v21: s0 = f63(v10)
    var v30: Double = v1
    let v56: [[Double]] = v21.p1
    let v46: [Double] = v56[0]
    let v31: Double = v46[0]
    let v34: Double = v46[0]
    let v53: Double = v34 + v30
    let v60: Double = v31 + v53
    let v99: s1 = v11.p0
    var v55: Double = v60
    v4.p0 = v99
    return v55
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])), p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]))
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
