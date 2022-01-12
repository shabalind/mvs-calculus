  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f20(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v7: [[Double]] = v5.p1
    let v2: [[Double]] = v0.p0
    let v4: [[Double]] = v0.p0
    let v13: s0 = s0(p0: v2, p1: v7)
    var v10: s0 = v0
    v10.p1 = v7
    v10.p0 = v4
    let v42: [Double] = v7[0]
    v5.p0 = v2
    v5.p0 = v2
    var v35: [[Double]] = v7
    let v23: [[Double]] = v13.p1
    let v28: [Double] = v35[0]
    v5.p1 = v35
    v35[1] = v42
    let v18: [Double] = v2[0]
    v10.p1 = v23
    var v20: [Double] = v28
    let v48: [[Double]] = v10.p0
    v10.p1 = v35
    v35[0] = v20
    v10.p0 = v4
    let v33: [Double] = v48[0]
    v35[1] = v18
    var v61: [Double] = v33
    v35[0] = v61
    return v10
  }
  func f9(_ v0: s0) -> s0 {
    let v8: s0 = f20(v0)
    let v13: s0 = f20(v8)
    let v10: s0 = f20(v13)
    return v10
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: [[Double]] = v0.p1
    let v5: [[Double]] = v0.p1
    var v6: s0 = v0
    v6.p1 = v3
    let v11: [[Double]] = v6.p1
    let v14: s0 = f9(v6)
    var v9: [[Double]] = v5
    let v17: s0 = f20(v14)
    v6.p1 = v11
    let v26: [[Double]] = v17.p0
    var v21: s0 = v17
    let v34: s0 = f20(v14)
    let v19: s0 = f20(v14)
    let v23: [Double] = v26[1]
    let v42: [Double] = v26[2]
    v6.p1 = v9
    v9[0] = v23
    var v22: s0 = v34
    v6.p1 = v9
    let v33: [[Double]] = v21.p1
    let v53: Double = v42[0]
    v6.p1 = v9
    v6.p1 = v33
    let v51: [[Double]] = v14.p0
    v21.p0 = v51
    let v58: Double = v53 + v53
    let v115: [[Double]] = v19.p0
    v6.p1 = v33
    v21.p0 = v115
    let v174: [[Double]] = v22.p0
    v21.p0 = v174
    return v58
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
