  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
  }
  struct s3 {
    var p0: [[s2]]
    var p1: [[s1]]
  }
  struct s4 {
    var p0: s2
    var p1: s2
  }
  struct s5 {
    var p0: s3
    var p1: s2
  }
  func f30(_ v0: s1) -> s1 {
    var v3: s1 = v0
    let v4: [s1] = [v0, v3, v3]
    let v6: s1 = v4[1]
    return v6
  }
  func f27(_ v0: s2) -> s2 {
    let v4: s1 = v0.p0
    var v5: s1 = v4
    let v8: s1 = v0.p0
    let v2: [[s0]] = v4.p1
    var v1: [[s0]] = v2
    let v6: [[[s0]]] = [v2, v1, v2, v1, v2, v1]
    let v10: s0 = v8.p0
    let v7: [s0] = v1[1]
    var v17: s2 = v0
    var v13: [s0] = v7
    var v21: s0 = v10
    var v12: s2 = v17
    var v18: [[s0]] = v2
    v12.p0 = v5
    let v15: [[s0]] = v6[4]
    var v27: [[s0]] = v18
    v18[0] = v13
    let v16: [s0] = v2[0]
    let v43: s1 = v0.p0
    v5.p1 = v27
    let v25: Double = v10.p1
    let v26: s1 = f30(v5)
    let v34: s1 = f30(v26)
    v21.p1 = v25
    let v22: s1 = f30(v34)
    v5 = v43
    let v38: s1 = f30(v22)
    var v24: Double = v25
    var v32: s2 = v12
    v18 = v15
    v17.p0 = v38
    let v23: s1 = v12.p0
    v18[0] = v16
    let v28: s1 = f30(v23)
    let v60: s0 = v16[0]
    v5.p1 = v2
    let v63: s1 = f30(v8)
    v13[0] = v60
    v21.p1 = v24
    v32.p0 = v63
    var v86: s2 = v32
    var v160: s2 = v86
    v5.p0 = v21
    v17.p0 = v28
    return v160
  }
  @inline(never)
  func f0(_ v0: [[s4]], _ v1: [s5], _ v2: Double) -> Double {
    let v7: s5 = v1[0]
    let v3: s2 = v7.p1
    let v18: s2 = f27(v3)
    let v11: s1 = v18.p0
    let v21: s0 = v11.p0
    let v38: Double = v21.p1
    return v38
  }
  func benchmark() {
    let v0: [[s4]] = [[s4(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: 2.0), p1: [[s0(p0: [[3.0], [4.0]], p1: 5.0)], [s0(p0: [[6.0], [7.0]], p1: 8.0)]])), p1: s2(p0: s1(p0: s0(p0: [[9.0], [10.0]], p1: 11.0), p1: [[s0(p0: [[12.0], [13.0]], p1: 14.0)], [s0(p0: [[15.0], [16.0]], p1: 17.0)]])))], [s4(p0: s2(p0: s1(p0: s0(p0: [[18.0], [19.0]], p1: 20.0), p1: [[s0(p0: [[21.0], [22.0]], p1: 23.0)], [s0(p0: [[24.0], [25.0]], p1: 26.0)]])), p1: s2(p0: s1(p0: s0(p0: [[27.0], [28.0]], p1: 29.0), p1: [[s0(p0: [[30.0], [31.0]], p1: 32.0)], [s0(p0: [[33.0], [34.0]], p1: 35.0)]])))], [s4(p0: s2(p0: s1(p0: s0(p0: [[36.0], [37.0]], p1: 38.0), p1: [[s0(p0: [[39.0], [40.0]], p1: 41.0)], [s0(p0: [[42.0], [43.0]], p1: 44.0)]])), p1: s2(p0: s1(p0: s0(p0: [[45.0], [46.0]], p1: 47.0), p1: [[s0(p0: [[48.0], [49.0]], p1: 50.0)], [s0(p0: [[51.0], [52.0]], p1: 53.0)]])))]]
    let v1: [s5] = [s5(p0: s3(p0: [[s2(p0: s1(p0: s0(p0: [[54.0], [55.0]], p1: 56.0), p1: [[s0(p0: [[57.0], [58.0]], p1: 59.0)], [s0(p0: [[60.0], [61.0]], p1: 62.0)]]))]], p1: [[s1(p0: s0(p0: [[63.0], [64.0]], p1: 65.0), p1: [[s0(p0: [[66.0], [67.0]], p1: 68.0)], [s0(p0: [[69.0], [70.0]], p1: 71.0)]])], [s1(p0: s0(p0: [[72.0], [73.0]], p1: 74.0), p1: [[s0(p0: [[75.0], [76.0]], p1: 77.0)], [s0(p0: [[78.0], [79.0]], p1: 80.0)]])]]), p1: s2(p0: s1(p0: s0(p0: [[81.0], [82.0]], p1: 83.0), p1: [[s0(p0: [[84.0], [85.0]], p1: 86.0)], [s0(p0: [[87.0], [88.0]], p1: 89.0)]])))]
    let v2: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
