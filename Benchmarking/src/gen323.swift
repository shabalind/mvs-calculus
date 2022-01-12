  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
    var p2: [s0]
  }
  struct s3 {
    var p0: [s1]
    var p1: s2
    var p2: [s0]
  }
  func f52(_ v0: Double) -> Double {
    var v6: Double = v0
    var v7: Double = v0
    let v2: [Double] = [v7]
    v7 = v6
    let v5: Double = v0 - v7
    var v3: [Double] = v2
    var v4: [Double] = v2
    v4[0] = v0
    v6 = v7
    var v11: [Double] = v4
    var v1: Double = v5
    var v8: Double = v5
    var v9: Double = v0
    var v13: [Double] = v4
    v13[0] = v8
    var v16: [Double] = v13
    let v23: [[Double]] = [v13, v2, v13, v11, v3]
    let v17: [Double] = v23[2]
    var v18: [[Double]] = v23
    let v19: Double = v16[0]
    var v14: [Double] = v11
    v11[0] = v1
    var v15: [Double] = v14
    let v27: [Double] = v18[2]
    v18[1] = v27
    v11[0] = v6
    let v35: Double = v15[0]
    var v37: [[Double]] = v18
    let v78: [Double] = v37[4]
    let v83: Double = v35 / v9
    v13[0] = v19
    v11 = v78
    let v103: Double = v17[0]
    v13[0] = v83
    return v103
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: s0, _ v2: Double) -> Double {
    var v21: Double = v2
    let v40: Double = f52(v21)
    v21 = v2
    return v40
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [[s0(p0: [[2.0]], p1: [[3.0]])]]), s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: [[s0(p0: [[6.0]], p1: [[7.0]])]]), s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [[s0(p0: [[10.0]], p1: [[11.0]])]])], p1: s2(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: s0(p0: [[14.0]], p1: [[15.0]]), p2: [s0(p0: [[16.0]], p1: [[17.0]]), s0(p0: [[18.0]], p1: [[19.0]])]), p2: [s0(p0: [[20.0]], p1: [[21.0]]), s0(p0: [[22.0]], p1: [[23.0]])]), s3(p0: [s1(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: [[s0(p0: [[26.0]], p1: [[27.0]])]]), s1(p0: s0(p0: [[28.0]], p1: [[29.0]]), p1: [[s0(p0: [[30.0]], p1: [[31.0]])]]), s1(p0: s0(p0: [[32.0]], p1: [[33.0]]), p1: [[s0(p0: [[34.0]], p1: [[35.0]])]])], p1: s2(p0: s0(p0: [[36.0]], p1: [[37.0]]), p1: s0(p0: [[38.0]], p1: [[39.0]]), p2: [s0(p0: [[40.0]], p1: [[41.0]]), s0(p0: [[42.0]], p1: [[43.0]])]), p2: [s0(p0: [[44.0]], p1: [[45.0]]), s0(p0: [[46.0]], p1: [[47.0]])])]
    let v1: s0 = s0(p0: [[48.0]], p1: [[49.0]])
    let v2: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
