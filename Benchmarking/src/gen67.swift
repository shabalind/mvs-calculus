  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  struct s3 {
    var p0: s0
    var p1: [s1]
  }
  struct s4 {
    var p0: s0
    var p1: [s1]
  }
  struct s5 {
    var p0: [Double]
    var p1: [s2]
  }
  struct s6 {
    var p0: [[s2]]
    var p1: s3
  }
  struct s7 {
    var p0: s0
    var p1: s6
  }
  func f24(_ v0: s6) -> s6 {
    let v1: [[s2]] = v0.p0
    var v5: s6 = v0
    v5.p0 = v1
    v5 = v0
    var v9: [[s2]] = v1
    let v7: [[[s2]]] = [v9, v1]
    v5.p0 = v9
    v5.p0 = v9
    let v16: [[s2]] = v7[0]
    var v23: s6 = v0
    let v21: s3 = v23.p1
    v23.p0 = v16
    v5.p1 = v21
    return v5
  }
  func f17(_ v0: s6) -> s6 {
    let v3: s6 = f24(v0)
    let v1: [[s2]] = v3.p0
    let v5: [[s2]] = v0.p0
    let v7: [s2] = v5[1]
    var v2: [[s2]] = v5
    var v4: [[s2]] = v1
    let v8: [s2] = v4[0]
    v2[1] = v8
    let v22: s6 = f24(v3)
    let v21: s2 = v8[0]
    v4[0] = v7
    let v17: [[s2]] = v3.p0
    v2[1] = v7
    v4[1] = v8
    let v13: [[s2]] = v0.p0
    let v12: [s2] = [v21]
    let v16: [s2] = v4[0]
    var v55: [[s2]] = v2
    v55[1] = v8
    v55[0] = v16
    var v65: s6 = v22
    let v33: [s2] = v17[0]
    v4[0] = v33
    v2[0] = v8
    v65.p0 = v55
    v55[0] = v33
    v4[0] = v12
    v65.p0 = v13
    return v65
  }
  func f12(_ v0: s7, _ v1: Double) -> Double {
    let v3: s0 = v0.p0
    let v17: [[Double]] = v3.p1
    let v28: [Double] = v17[0]
    let v37: Double = v28[0]
    var v206: Double = v37
    return v206
  }
  func f8(_ v0: s7) -> s7 {
    var v7: s7 = v0
    var v6: s7 = v7
    let v3: s6 = v0.p1
    let v1: s6 = v6.p1
    var v14: s7 = v7
    let v16: s6 = f17(v1)
    v7.p1 = v16
    v6 = v14
    var v78: s7 = v7
    v78.p1 = v3
    return v78
  }
  func f7(_ v0: s7, _ v1: s5) -> s7 {
    let v95: s7 = f8(v0)
    return v95
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: s1, _ v2: [s5], _ v3: s4, _ v4: Double) -> Double {
    let v7: s5 = v2[0]
    let v9: s7 = f7(v0, v7)
    var v13: Double = v4
    let v43: Double = f12(v9, v4)
    let v21: Double = v13 * v43
    var v32: Double = v21
    let v54: Double = f12(v0, v32)
    return v54
  }
  func benchmark() {
    let v0: s7 = s7(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s6(p0: [[s2(p0: [s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]])))], [s2(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]]), p1: s0(p0: [[18.0], [19.0]], p1: [[20.0]])))]], p1: s3(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0]]), p1: [s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p1: s0(p0: [[27.0], [28.0]], p1: [[29.0]])), s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0]]), p1: s0(p0: [[33.0], [34.0]], p1: [[35.0]]))])))
    let v1: s1 = s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0]]), p1: s0(p0: [[39.0], [40.0]], p1: [[41.0]]))
    let v2: [s5] = [s5(p0: [42.0], p1: [s2(p0: [s0(p0: [[43.0], [44.0]], p1: [[45.0]])], p1: s1(p0: s0(p0: [[46.0], [47.0]], p1: [[48.0]]), p1: s0(p0: [[49.0], [50.0]], p1: [[51.0]])))]), s5(p0: [52.0], p1: [s2(p0: [s0(p0: [[53.0], [54.0]], p1: [[55.0]])], p1: s1(p0: s0(p0: [[56.0], [57.0]], p1: [[58.0]]), p1: s0(p0: [[59.0], [60.0]], p1: [[61.0]])))]), s5(p0: [62.0], p1: [s2(p0: [s0(p0: [[63.0], [64.0]], p1: [[65.0]])], p1: s1(p0: s0(p0: [[66.0], [67.0]], p1: [[68.0]]), p1: s0(p0: [[69.0], [70.0]], p1: [[71.0]])))])]
    let v3: s4 = s4(p0: s0(p0: [[72.0], [73.0]], p1: [[74.0]]), p1: [s1(p0: s0(p0: [[75.0], [76.0]], p1: [[77.0]]), p1: s0(p0: [[78.0], [79.0]], p1: [[80.0]])), s1(p0: s0(p0: [[81.0], [82.0]], p1: [[83.0]]), p1: s0(p0: [[84.0], [85.0]], p1: [[86.0]])), s1(p0: s0(p0: [[87.0], [88.0]], p1: [[89.0]]), p1: s0(p0: [[90.0], [91.0]], p1: [[92.0]]))])
    let v4: Double = 93.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 93.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
