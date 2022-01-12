  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v7: s3 = v0[0]
    let v4: [s0] = v7.p0
    let v10: s0 = v4[0]
    var v9: Double = v1
    v9 = v1
    let v15: [[Double]] = v10.p3
    let v13: [Double] = v15[0]
    let v20: Double = v13[0]
    let v38: Double = v20 / v1
    let v69: Double = v13[0]
    let v82: Double = v69 - v38
    let v213: [Double] = v15[0]
    let v72: Double = v213[0]
    v9 = v82
    let v103: Double = v9 - v69
    let v167: Double = v103 * v72
    let v118: Double = v167 - v82
    return v118
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s0(p0: [0.0], p1: [[1.0], [2.0]], p2: [[3.0]], p3: [[4.0]]), s0(p0: [5.0], p1: [[6.0], [7.0]], p2: [[8.0]], p3: [[9.0]]), s0(p0: [10.0], p1: [[11.0], [12.0]], p2: [[13.0]], p3: [[14.0]])], p1: s1(p0: s0(p0: [15.0], p1: [[16.0], [17.0]], p2: [[18.0]], p3: [[19.0]]), p1: s0(p0: [20.0], p1: [[21.0], [22.0]], p2: [[23.0]], p3: [[24.0]]))), s3(p0: [s0(p0: [25.0], p1: [[26.0], [27.0]], p2: [[28.0]], p3: [[29.0]]), s0(p0: [30.0], p1: [[31.0], [32.0]], p2: [[33.0]], p3: [[34.0]]), s0(p0: [35.0], p1: [[36.0], [37.0]], p2: [[38.0]], p3: [[39.0]])], p1: s1(p0: s0(p0: [40.0], p1: [[41.0], [42.0]], p2: [[43.0]], p3: [[44.0]]), p1: s0(p0: [45.0], p1: [[46.0], [47.0]], p2: [[48.0]], p3: [[49.0]])))]
    let v1: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
