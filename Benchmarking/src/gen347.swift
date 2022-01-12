  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: s0
    var p3: s0
    var p4: s0
    var p5: s0
  }
  func f20(_ v0: s1) -> s1 {
    let v5: s0 = v0.p0
    var v3: s0 = v5
    let v2: [[Double]] = v5.p0
    let v15: s0 = v0.p0
    v3.p0 = v2
    let v6: [s1] = [v0, v0, v0, v0, v0, v0]
    let v9: [[Double]] = v3.p0
    v3.p0 = v2
    let v13: s1 = v6[5]
    let v34: [[Double]] = v15.p0
    v3.p0 = v34
    let v22: s1 = v6[0]
    let v38: [[Double]] = v3.p0
    v3.p0 = v38
    let v29: s0 = v13.p5
    var v42: [[Double]] = v38
    v3.p0 = v9
    var v43: s0 = v29
    var v63: s1 = v22
    var v82: s1 = v63
    v43.p0 = v42
    v63.p3 = v43
    return v82
  }
  func f14(_ v0: [Double]) -> [Double] {
    let v2: Double = v0[0]
    var v7: Double = v2
    var v4: [Double] = v0
    let v6: Double = v4[0]
    v4[0] = v6
    var v1: [Double] = v0
    v4[0] = v7
    let v15: Double = v4[0]
    v1[0] = v7
    let v3: [[Double]] = [v0, v1]
    let v20: [Double] = v3[0]
    let v13: Double = v20[0]
    v4[0] = v15
    var v11: [Double] = v4
    let v9: [[Double]] = [v0, v4, v0]
    v4 = v1
    var v17: Double = v13
    v4[0] = v2
    var v14: [[Double]] = v9
    let v25: [Double] = v14[1]
    var v19: [[Double]] = v9
    v19[0] = v11
    let v26: [Double] = v19[0]
    var v43: [Double] = v25
    v43[0] = v17
    v14[0] = v4
    v14 = v19
    v19[2] = v26
    return v43
  }
  func f13(_ v0: s0, _ v1: s1, _ v2: s1) -> s0 {
    let v3: s0 = v1.p5
    let v4: [[Double]] = v0.p0
    let v6: [Double] = v4[0]
    let v7: [Double] = v4[0]
    var v9: s0 = v3
    let v5: [Double] = v4[1]
    let v14: s0 = v1.p5
    v9.p0 = v4
    let v13: s0 = v1.p5
    let v35: [[Double]] = v3.p0
    var v11: [[Double]] = v35
    let v10: [Double] = v4[1]
    let v12: s0 = s0(p0: v35)
    let v15: s1 = f20(v1)
    v9.p0 = v35
    v9 = v13
    v11[0] = v5
    let v32: [[Double]] = v3.p0
    let v39: [Double] = v11[1]
    v11[0] = v7
    v9.p0 = v32
    v9.p0 = v35
    v9.p0 = v35
    var v23: s1 = v2
    let v26: Double = v39[0]
    let v54: [[Double]] = v9.p0
    v23.p5 = v9
    v23.p0 = v12
    v11[1] = v7
    let v33: [[Double]] = v3.p0
    let v34: [Double] = f14(v10)
    v9.p0 = v33
    v11[0] = v34
    let v56: [[Double]] = v3.p0
    v11[1] = v39
    v9.p0 = v54
    v23.p3 = v3
    var v49: [Double] = v34
    let v21: [Double] = v56[0]
    let v50: s0 = v2.p4
    v23.p2 = v0
    v9.p0 = v33
    v23.p2 = v3
    let v46: Double = v10[0]
    var v37: [[Double]] = v35
    var v101: [Double] = v6
    v37[0] = v49
    v37[1] = v101
    v23.p2 = v50
    v37[0] = v6
    v37[0] = v49
    v9.p0 = v37
    v9.p0 = v35
    var v62: s1 = v15
    var v63: [Double] = v21
    var v85: Double = v46
    v37[1] = v63
    let v243: s1 = f20(v23)
    let v113: s0 = v62.p4
    v23.p5 = v14
    let v171: s0 = v243.p0
    let v91: Double = v5[0]
    v62.p5 = v9
    v23.p1 = v113
    v101[0] = v85
    v101[0] = v91
    var v187: s0 = v171
    v63[0] = v26
    return v187
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v6: [s1] = v0[0]
    let v2: [s1] = v0[0]
    let v3: s1 = v6[0]
    let v9: s1 = v2[0]
    let v10: s1 = v6[0]
    let v4: s0 = v10.p5
    var v11: s1 = v9
    var v19: s1 = v9
    v19.p2 = v4
    let v13: s0 = f13(v4, v11, v3)
    let v30: s0 = f13(v13, v19, v10)
    let v31: s0 = v11.p1
    let v28: s1 = v6[0]
    v19.p4 = v31
    let v41: [[Double]] = v30.p0
    let v50: s0 = v28.p1
    let v42: Double = v1 + v1
    let v79: [Double] = [v1, v1, v1, v42]
    let v43: Double = v79[0]
    v19.p4 = v13
    let v60: [Double] = v41[1]
    let v93: Double = v60[0]
    v19.p2 = v50
    let v142: Double = v93 * v43
    return v142
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0]]), p1: s0(p0: [[2.0], [3.0]]), p2: s0(p0: [[4.0], [5.0]]), p3: s0(p0: [[6.0], [7.0]]), p4: s0(p0: [[8.0], [9.0]]), p5: s0(p0: [[10.0], [11.0]]))], [s1(p0: s0(p0: [[12.0], [13.0]]), p1: s0(p0: [[14.0], [15.0]]), p2: s0(p0: [[16.0], [17.0]]), p3: s0(p0: [[18.0], [19.0]]), p4: s0(p0: [[20.0], [21.0]]), p5: s0(p0: [[22.0], [23.0]]))]]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
