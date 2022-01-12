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
    var p0: s1
    var p1: s1
  }
  struct s4 {
    var p0: [s2]
    var p1: s2
  }
  func f24(_ v0: s1) -> s1 {
    let v6: s0 = v0.p0
    let v7: [[Double]] = v6.p1
    var v5: s1 = v0
    v5 = v0
    let v11: [[Double]] = v6.p0
    v5.p1 = v6
    let v42: s0 = s0(p0: v11, p1: v7)
    v5.p1 = v42
    return v5
  }
  func f17(_ v0: s2) -> s2 {
    var v6: s2 = v0
    var v2: s2 = v6
    v6 = v2
    var v5: s2 = v0
    let v4: s1 = v6.p1
    var v1: s1 = v4
    let v3: s1 = f24(v4)
    let v10: s1 = f24(v4)
    var v7: s1 = v10
    var v18: s2 = v2
    v18.p1 = v4
    v6.p1 = v1
    let v11: s1 = v18.p1
    let v12: s1 = f24(v7)
    let v15: s1 = f24(v3)
    let v14: s1 = v2.p0
    v2.p0 = v12
    var v16: s1 = v1
    v6.p1 = v14
    let v20: s0 = v7.p0
    let v24: s0 = v16.p0
    v16.p0 = v24
    v7.p0 = v20
    v16 = v11
    let v50: s1 = f24(v11)
    v16.p1 = v24
    v1.p0 = v24
    let v78: s1 = v5.p0
    let v67: s0 = v50.p1
    let v58: s2 = s2(p0: v50, p1: v78)
    v18.p0 = v4
    var v91: s2 = v58
    v16.p0 = v67
    let v81: s0 = v15.p1
    v16.p1 = v81
    return v91
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v5: s2 = v0.p1
    let v2: s2 = f17(v5)
    var v7: Double = v1
    let v4: s1 = v2.p1
    let v3: s1 = f24(v4)
    let v25: s0 = v3.p0
    var v53: s0 = v25
    let v16: [[Double]] = v53.p1
    let v32: [Double] = v16[0]
    let v35: [[Double]] = v53.p1
    var v68: [Double] = v32
    var v50: [[Double]] = v35
    v53.p1 = v50
    v53.p1 = v16
    v68[0] = v7
    let v93: Double = v68[0]
    return v93
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), p1: s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))), s2(p0: s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]])), p1: s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p1: s0(p0: [[21.0], [22.0]], p1: [[23.0]]))), s2(p0: s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p1: s0(p0: [[27.0], [28.0]], p1: [[29.0]])), p1: s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0]]), p1: s0(p0: [[33.0], [34.0]], p1: [[35.0]])))], p1: s2(p0: s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0]]), p1: s0(p0: [[39.0], [40.0]], p1: [[41.0]])), p1: s1(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0]]), p1: s0(p0: [[45.0], [46.0]], p1: [[47.0]]))))
    let v1: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
