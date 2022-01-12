  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f76(_ v0: [s0]) -> [s0] {
    var v2: [s0] = v0
    var v1: [s0] = v2
    v2 = v1
    let v7: s0 = v2[0]
    var v3: s0 = v7
    v2[0] = v3
    let v5: s0 = v2[0]
    let v6: s0 = v0[0]
    let v10: s0 = v1[0]
    let v4: s0 = v2[0]
    let v8: [[Double]] = v4.p1
    v2[0] = v10
    var v16: s0 = v5
    var v11: [[Double]] = v8
    let v13: [[Double]] = v5.p0
    let v33: [[Double]] = v16.p0
    let v30: [[Double]] = v3.p1
    v3.p1 = v30
    var v65: s0 = v5
    v3.p1 = v11
    let v19: [[Double]] = v4.p0
    v16.p0 = v13
    let v36: [[Double]] = v10.p0
    v3.p0 = v36
    v2[0] = v7
    let v87: [[Double]] = v4.p0
    let v34: [[Double]] = v65.p1
    let v48: [[Double]] = v65.p0
    v1[0] = v6
    v1[0] = v16
    v65.p0 = v36
    v3.p0 = v36
    v3.p0 = v19
    v65.p1 = v34
    v1[0] = v65
    let v66: [[Double]] = v16.p0
    v65.p0 = v33
    v65.p0 = v87
    v1[0] = v7
    var v128: [[Double]] = v66
    let v165: [Double] = v8[0]
    v16.p0 = v48
    v65.p0 = v128
    v128[1] = v165
    v65.p0 = v66
    v65.p1 = v11
    return v1
  }
  func f51(_ v0: s1) -> s1 {
    var v5: s1 = v0
    let v9: s0 = v5.p0
    let v3: s1 = s1(p0: v9, p1: v9)
    var v8: s0 = v9
    var v6: s1 = v3
    v5.p1 = v8
    var v2: s1 = v6
    var v1: s0 = v8
    v2.p1 = v1
    v2.p0 = v8
    return v2
  }
  func f46(_ v0: s0, _ v1: s0) -> s0 {
    let v4: [s0] = [v1, v1]
    let v7: [[Double]] = v0.p1
    var v5: [[Double]] = v7
    var v9: [s0] = v4
    let v2: s1 = s1(p0: v1, p1: v0)
    var v17: s1 = v2
    let v13: s0 = v2.p1
    let v19: s1 = f51(v17)
    let v8: s0 = v2.p0
    let v18: s0 = v9[1]
    let v11: [[Double]] = v8.p0
    var v10: s0 = v13
    let v12: s1 = f51(v2)
    v17.p0 = v8
    let v48: [[Double]] = v1.p1
    v17.p1 = v10
    let v21: s0 = v12.p0
    let v25: s0 = v19.p0
    v10.p1 = v5
    v10.p1 = v7
    v10.p1 = v5
    v10.p0 = v11
    v17.p0 = v18
    v17.p1 = v1
    let v63: [s0] = [v25]
    var v59: s0 = v21
    let v60: [s0] = f76(v63)
    v9[0] = v59
    let v53: [s0] = f76(v60)
    v59.p1 = v48
    var v30: [s0] = v53
    let v51: s0 = v30[0]
    return v51
  }
  func f34(_ v0: s0) -> s0 {
    var v1: s0 = v0
    let v3: s0 = f46(v1, v0)
    var v6: s0 = v0
    let v7: [[Double]] = v0.p0
    let v4: [[Double]] = v1.p0
    v1.p0 = v4
    let v5: [[Double]] = v6.p1
    let v11: [Double] = v4[0]
    var v2: s0 = v6
    var v18: [[Double]] = v5
    v18[0] = v11
    let v33: [[Double]] = v1.p0
    v2 = v1
    v18[0] = v11
    let v24: s1 = s1(p0: v0, p1: v2)
    let v35: s0 = v24.p1
    v2.p1 = v18
    let v23: s0 = f46(v35, v3)
    let v30: s0 = f46(v6, v23)
    let v17: [Double] = v7[1]
    let v27: [[Double]] = v3.p0
    let v29: [Double] = v27[1]
    v18[0] = v29
    let v31: [[Double]] = v35.p1
    v6.p0 = v33
    v18[0] = v17
    let v77: s0 = f46(v1, v30)
    v2.p1 = v31
    return v77
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v4: s0 = v0[0]
    let v2: s0 = f34(v4)
    let v18: [[Double]] = v2.p1
    let v9: [Double] = v18[0]
    let v43: Double = v9[0]
    let v72: Double = v43 + v43
    return v72
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])]
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
