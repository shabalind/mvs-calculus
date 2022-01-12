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
    var p0: s0
    var p1: s1
  }
  struct s3 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s7 {
    var p0: [s3]
    var p1: s1
    var p2: [s2]
  }
  func f4(_ v0: Double) -> Double {
    var v5: Double = v0
    var v1: Double = v5
    var v2: Double = v5
    var v4: Double = v5
    let v10: [Double] = [v2, v2, v4, v0, v4]
    var v9: Double = v1
    var v6: Double = v9
    var v3: [Double] = v10
    v5 = v6
    let v15: Double = v3[0]
    var v26: [Double] = v3
    v26 = v10
    v26[3] = v15
    let v63: Double = v26[0]
    v3 = v26
    var v66: Double = v63
    return v66
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: s1, _ v2: Double) -> Double {
    let v8: Double = f4(v2)
    let v5: Double = f4(v8)
    let v9: Double = f4(v8)
    let v25: Double = v5 - v9
    let v44: Double = v8 * v25
    return v44
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s3(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: [[s0(p0: [[9.0], [10.0]], p1: [[11.0]])], [s0(p0: [[12.0], [13.0]], p1: [[14.0]])], [s0(p0: [[15.0], [16.0]], p1: [[17.0]])]]), s3(p0: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0]])], p1: [[s0(p0: [[27.0], [28.0]], p1: [[29.0]])], [s0(p0: [[30.0], [31.0]], p1: [[32.0]])], [s0(p0: [[33.0], [34.0]], p1: [[35.0]])]])], p1: s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0]]), p1: s0(p0: [[39.0], [40.0]], p1: [[41.0]])), p2: [s2(p0: s0(p0: [[42.0], [43.0]], p1: [[44.0]]), p1: s1(p0: s0(p0: [[45.0], [46.0]], p1: [[47.0]]), p1: s0(p0: [[48.0], [49.0]], p1: [[50.0]]))), s2(p0: s0(p0: [[51.0], [52.0]], p1: [[53.0]]), p1: s1(p0: s0(p0: [[54.0], [55.0]], p1: [[56.0]]), p1: s0(p0: [[57.0], [58.0]], p1: [[59.0]])))])
    let v1: s1 = s1(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0]]), p1: s0(p0: [[63.0], [64.0]], p1: [[65.0]]))
    let v2: Double = 66.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 66.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
