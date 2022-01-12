  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: [[s1]]
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  func f46(_ v0: Double) -> Double {
    var v7: Double = v0
    v7 = v0
    var v1: Double = v0
    let v6: Double = v1 * v1
    let v3: Double = v1 + v7
    var v4: Double = v3
    var v10: Double = v1
    var v13: Double = v10
    var v9: Double = v6
    v13 = v1
    var v11: Double = v4
    let v24: Double = v0 + v13
    let v15: [Double] = [v9]
    let v16: Double = v15[0]
    let v29: Double = v15[0]
    var v39: [Double] = v15
    v39[0] = v4
    var v48: [Double] = v39
    var v37: Double = v24
    let v38: Double = v48[0]
    v48[0] = v3
    v4 = v37
    v48[0] = v10
    v48[0] = v29
    let v23: [Double] = [v11, v16, v38]
    let v58: Double = v23[2]
    return v58
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v6: Double = v1
    var v9: Double = v6
    let v8: Double = f46(v1)
    v6 = v8
    var v50: Double = v9
    let v59: Double = v9 * v50
    return v59
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [[s1(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]]), p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p2: [[s0(p0: [[15.0], [16.0]], p1: [[17.0]])], [s0(p0: [[18.0], [19.0]], p1: [[20.0]])], [s0(p0: [[21.0], [22.0]], p1: [[23.0]])]])]]), p1: s2(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p1: [[s1(p0: s0(p0: [[27.0], [28.0]], p1: [[29.0]]), p1: [s0(p0: [[30.0], [31.0]], p1: [[32.0]]), s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]])], p2: [[s0(p0: [[39.0], [40.0]], p1: [[41.0]])], [s0(p0: [[42.0], [43.0]], p1: [[44.0]])], [s0(p0: [[45.0], [46.0]], p1: [[47.0]])]])]]))
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
