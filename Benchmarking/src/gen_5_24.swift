  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: Double
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
    var p2: s0
    var p3: s1
    var p4: [s1]
  }
  func f107(_ v0: Double) -> Double {
    var v5: Double = v0
    var v6: Double = v5
    var v2: Double = v5
    var v1: Double = v2
    v2 = v5
    var v4: Double = v5
    let v3: Double = v6 * v2
    var v11: Double = v4
    let v10: Double = v11 / v3
    var v19: Double = v0
    var v15: Double = v11
    let v12: [Double] = [v11, v15, v10, v19, v1, v4]
    var v21: [Double] = v12
    v21[2] = v6
    var v18: [Double] = v21
    var v23: Double = v5
    v18[5] = v5
    v21[4] = v0
    v18[3] = v11
    v21[1] = v23
    let v37: Double = v18[3]
    let v34: [Double] = [v6]
    var v24: Double = v37
    let v33: Double = v34[0]
    v18[3] = v37
    v24 = v37
    var v51: Double = v33
    v21[4] = v51
    return v24
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v10: Double = f107(v1)
    var v13: Double = v10
    let v17: Double = v1 * v1
    v13 = v17
    return v13
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]], p2: 3.0), p1: [s0(p0: [[4.0], [5.0]], p1: [[6.0]], p2: 7.0)], p2: s0(p0: [[8.0], [9.0]], p1: [[10.0]], p2: 11.0), p3: s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]], p2: 15.0), p1: s0(p0: [[16.0], [17.0]], p1: [[18.0]], p2: 19.0)), p4: [s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0]], p2: 23.0), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0]], p2: 27.0))])]
    let v1: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
