  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [s0]
    var p3: [s0]
  }
  struct s2 {
    var p0: [[s1]]
    var p1: [[s1]]
  }
  func f14(_ v0: Double) -> Double {
    var v6: Double = v0
    var v4: Double = v0
    var v1: Double = v6
    var v7: Double = v0
    var v8: Double = v4
    v1 = v7
    var v5: Double = v4
    var v3: Double = v7
    var v11: Double = v3
    var v2: Double = v8
    let v13: [Double] = [v8, v5, v2, v8, v6, v1]
    v1 = v11
    let v10: Double = v13[5]
    let v14: Double = v13[2]
    var v34: [Double] = v13
    let v32: Double = v34[2]
    v34[3] = v14
    v34[3] = v10
    v34[3] = v0
    v34[2] = v2
    return v32
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v8: Double = v1
    let v9: Double = f14(v8)
    var v7: Double = v8
    let v11: Double = f14(v9)
    v8 = v7
    let v142: Double = v11 * v11
    return v142
  }
  func benchmark() {
    let v0: s2 = s2(p0: [[s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]), p2: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])], p3: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])])], [s1(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0]]), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p2: [s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]])], p3: [s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]])])]], p1: [[s1(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0]]), p1: s0(p0: [[45.0], [46.0]], p1: [[47.0]]), p2: [s0(p0: [[48.0], [49.0]], p1: [[50.0]]), s0(p0: [[51.0], [52.0]], p1: [[53.0]])], p3: [s0(p0: [[54.0], [55.0]], p1: [[56.0]]), s0(p0: [[57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0]])])]])
    let v1: Double = 63.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 63.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
