  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: Double
    var p1: [s0]
  }
  struct s4 {
    var p0: [s0]
    var p1: s2
  }
  struct s9 {
    var p0: Double
    var p1: [s4]
  }
  struct s12 {
    var p0: s0
    var p1: s4
  }
  func f119(_ v0: s4) -> s4 {
    var v1: s4 = v0
    var v6: s4 = v0
    let v7: s2 = v6.p1
    var v2: s2 = v7
    var v4: s2 = v7
    var v8: s4 = v1
    let v3: [s0] = v4.p1
    var v10: [s0] = v3
    let v11: [s0] = v4.p1
    let v5: Double = v4.p0
    let v12: s0 = v3[1]
    v6.p1 = v2
    let v16: s2 = v8.p1
    v4 = v2
    v4 = v7
    v2.p0 = v5
    v6.p1 = v4
    let v43: [s0] = v16.p1
    v8.p1 = v2
    v8.p1 = v4
    let v34: Double = v4.p0
    v10 = v11
    let v24: s0 = v43[0]
    v1.p1 = v16
    v10[0] = v12
    v4.p1 = v3
    v2.p1 = v3
    v4.p1 = v10
    v4.p1 = v10
    var v37: s4 = v0
    v4.p0 = v34
    v37.p1 = v7
    v10[1] = v24
    let v203: s12 = s12(p0: v24, p1: v37)
    let v129: s4 = v203.p1
    v10[1] = v24
    v2.p0 = v34
    v1.p1 = v7
    return v129
  }
  func f109(_ v0: [s4]) -> [s4] {
    let v2: s4 = v0[0]
    let v6: s4 = f119(v2)
    let v8: s4 = f119(v6)
    let v1: s4 = v0[0]
    let v10: s4 = f119(v1)
    var v9: [s4] = v0
    v9[0] = v2
    let v26: s4 = f119(v1)
    var v23: [s4] = v0
    v9[0] = v8
    v9[0] = v26
    let v87: s4 = f119(v10)
    var v121: [s4] = v9
    v23[0] = v87
    var v78: [s4] = v23
    v23 = v121
    v23[0] = v1
    return v78
  }
  func f75(_ v0: s9) -> s9 {
    var v4: s9 = v0
    var v2: s9 = v4
    let v5: [s4] = v4.p1
    v4 = v2
    let v1: [s4] = f109(v5)
    let v8: [s4] = f109(v5)
    let v6: Double = v2.p0
    let v9: s9 = s9(p0: v6, p1: v8)
    var v11: [s4] = v1
    let v3: [s4] = v4.p1
    let v7: [s4] = f109(v3)
    v4.p0 = v6
    let v17: s4 = v11[0]
    let v21: s4 = v5[0]
    v11[0] = v21
    v11[0] = v17
    v11[0] = v17
    v11[0] = v17
    let v26: s4 = f119(v17)
    var v12: [s4] = v7
    v11[0] = v17
    let v37: Double = v4.p0
    v12[0] = v26
    v11[0] = v21
    v12[0] = v26
    let v59: s9 = s9(p0: v6, p1: v8)
    var v20: s4 = v17
    let v42: [s4] = f109(v12)
    let v19: s9 = s9(p0: v37, p1: v1)
    var v34: s9 = v9
    let v24: s4 = f119(v20)
    let v46: [s4] = v34.p1
    v4 = v19
    v34.p1 = v42
    v4 = v59
    let v54: [s0] = v21.p0
    v2.p1 = v46
    let v58: s4 = f119(v24)
    v12[0] = v58
    v34.p0 = v37
    v11[0] = v26
    let v48: Double = v0.p0
    v4.p0 = v6
    v4.p0 = v48
    v2.p1 = v5
    v20.p0 = v54
    v20.p0 = v54
    return v34
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    let v5: s9 = f75(v0)
    let v11: [s4] = v5.p1
    let v13: [s4] = f109(v11)
    let v18: s4 = v13[0]
    let v20: s2 = v18.p1
    let v44: Double = v20.p0
    var v53: Double = v44
    var v179: Double = v53
    return v179
  }
  func benchmark() {
    let v0: s9 = s9(p0: 0.0, p1: [s4(p0: [s0(p0: [[1.0]], p1: [[2.0], [3.0], [4.0]])], p1: s2(p0: 5.0, p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0]], p1: [[11.0], [12.0], [13.0]])]))])
    let v1: Double = 14.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 14.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
