  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: Double
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  struct s4 {
    var p0: [s1]
    var p1: [s0]
    var p2: [[s0]]
  }
  struct s11 {
    var p0: [s0]
    var p1: s3
  }
  func f5(_ v0: s4) -> s4 {
    var v3: s4 = v0
    let v7: [s1] = v0.p0
    var v5: s4 = v3
    var v2: [s1] = v7
    v3.p0 = v2
    let v8: [[s0]] = v0.p2
    var v4: [s1] = v7
    var v9: [[s0]] = v8
    let v6: [s1] = v3.p0
    let v11: [s1] = v5.p0
    let v13: [[s0]] = v5.p2
    let v18: s1 = v6[0]
    let v15: [s0] = v13[1]
    v9[1] = v15
    v2[0] = v18
    let v28: s1 = v11[0]
    v2[0] = v28
    v3.p2 = v8
    v5.p0 = v7
    v3.p2 = v9
    var v50: s4 = v5
    v50.p0 = v4
    return v50
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: [[s11]], _ v2: Double) -> Double {
    let v5: s4 = v0[0]
    let v3: [s1] = v5.p0
    var v10: [s4] = v0
    var v4: [s4] = v10
    let v7: s4 = f5(v5)
    let v8: s4 = f5(v7)
    var v12: [s1] = v3
    v4[2] = v5
    let v30: s4 = f5(v8)
    v4[1] = v30
    var v17: [s4] = v4
    let v21: s4 = v17[2]
    v17[1] = v30
    let v18: s4 = f5(v7)
    let v24: s4 = f5(v18)
    let v36: [s1] = v21.p0
    v17 = v0
    v10[2] = v30
    let v44: s4 = f5(v24)
    let v26: s1 = v36[0]
    let v38: [[s1]] = [v12, v36, v12, v36, v12, v36]
    let v79: [s1] = v38[4]
    v4[2] = v44
    v4[1] = v21
    v10[2] = v8
    let v101: s1 = v79[0]
    let v244: Double = v26.p0
    let v198: Double = v101.p0
    var v155: s1 = v26
    let v127: Double = v198 - v244
    v12[0] = v155
    return v127
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [s1(p0: 0.0, p1: s0(p0: [[1.0], [2.0]], p1: [[3.0]]))], p1: [s0(p0: [[4.0], [5.0]], p1: [[6.0]])], p2: [[s0(p0: [[7.0], [8.0]], p1: [[9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0]])]]), s4(p0: [s1(p0: 13.0, p1: s0(p0: [[14.0], [15.0]], p1: [[16.0]]))], p1: [s0(p0: [[17.0], [18.0]], p1: [[19.0]])], p2: [[s0(p0: [[20.0], [21.0]], p1: [[22.0]])], [s0(p0: [[23.0], [24.0]], p1: [[25.0]])]]), s4(p0: [s1(p0: 26.0, p1: s0(p0: [[27.0], [28.0]], p1: [[29.0]]))], p1: [s0(p0: [[30.0], [31.0]], p1: [[32.0]])], p2: [[s0(p0: [[33.0], [34.0]], p1: [[35.0]])], [s0(p0: [[36.0], [37.0]], p1: [[38.0]])]])]
    let v1: [[s11]] = [[s11(p0: [s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]])], p1: s3(p0: [s1(p0: 45.0, p1: s0(p0: [[46.0], [47.0]], p1: [[48.0]]))], p1: s0(p0: [[49.0], [50.0]], p1: [[51.0]])))], [s11(p0: [s0(p0: [[52.0], [53.0]], p1: [[54.0]]), s0(p0: [[55.0], [56.0]], p1: [[57.0]])], p1: s3(p0: [s1(p0: 58.0, p1: s0(p0: [[59.0], [60.0]], p1: [[61.0]]))], p1: s0(p0: [[62.0], [63.0]], p1: [[64.0]])))], [s11(p0: [s0(p0: [[65.0], [66.0]], p1: [[67.0]]), s0(p0: [[68.0], [69.0]], p1: [[70.0]])], p1: s3(p0: [s1(p0: 71.0, p1: s0(p0: [[72.0], [73.0]], p1: [[74.0]]))], p1: s0(p0: [[75.0], [76.0]], p1: [[77.0]])))]]
    let v2: Double = 78.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 78.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
