  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  struct s4 {
    var p0: [s3]
  }
  func f52(_ v0: Double) -> Double {
    var v1: Double = v0
    var v6: Double = v0
    var v5: Double = v1
    let v7: Double = v5 / v0
    let v3: [Double] = [v1, v7, v6, v0, v1, v5, v0]
    var v13: [Double] = v3
    var v15: [Double] = v13
    v13[1] = v6
    v13[0] = v6
    let v10: Double = v15[0]
    var v18: [Double] = v3
    var v23: [Double] = v15
    v18[0] = v10
    var v17: [Double] = v23
    let v24: Double = v23[0]
    let v16: [[Double]] = [v23, v18, v15, v13]
    v13[5] = v10
    var v14: [Double] = v13
    let v45: [Double] = v16[1]
    let v20: Double = v15[6]
    let v33: Double = v14[0]
    let v28: [Double] = v16[3]
    v18[4] = v33
    var v40: [Double] = v28
    let v37: [Double] = v16[0]
    v14[4] = v24
    var v70: [Double] = v28
    let v39: [[Double]] = [v70, v13, v40, v70, v45, v37, v17]
    let v32: [Double] = v39[3]
    let v31: Double = v32[0]
    let v103: Double = v40[5]
    v40[0] = v20
    let v77: Double = v3[2]
    v15[5] = v77
    v15[5] = v103
    return v31
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s4], _ v2: [s2], _ v3: Double) -> Double {
    var v5: Double = v3
    var v10: Double = v5
    let v4: Double = f52(v10)
    return v4
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])])
    let v1: [s4] = [s4(p0: [s3(p0: s2(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]])]), p1: s2(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: [s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]]), s0(p0: [[22.0]], p1: [[23.0]])])), s3(p0: s2(p0: s0(p0: [[24.0]], p1: [[25.0]]), p1: [s0(p0: [[26.0]], p1: [[27.0]]), s0(p0: [[28.0]], p1: [[29.0]]), s0(p0: [[30.0]], p1: [[31.0]])]), p1: s2(p0: s0(p0: [[32.0]], p1: [[33.0]]), p1: [s0(p0: [[34.0]], p1: [[35.0]]), s0(p0: [[36.0]], p1: [[37.0]]), s0(p0: [[38.0]], p1: [[39.0]])]))])]
    let v2: [s2] = [s2(p0: s0(p0: [[40.0]], p1: [[41.0]]), p1: [s0(p0: [[42.0]], p1: [[43.0]]), s0(p0: [[44.0]], p1: [[45.0]]), s0(p0: [[46.0]], p1: [[47.0]])])]
    let v3: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
