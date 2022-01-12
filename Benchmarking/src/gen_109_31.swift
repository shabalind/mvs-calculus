  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  struct s3 {
    var p0: [s2]
    var p1: [[s2]]
  }
  func f60(_ v0: Double) -> Double {
    var v7: Double = v0
    var v6: Double = v0
    var v1: Double = v0
    var v8: Double = v6
    var v5: Double = v0
    var v10: Double = v8
    v7 = v0
    v10 = v7
    v1 = v0
    var v12: Double = v5
    var v18: Double = v8
    var v24: Double = v7
    var v3: Double = v10
    var v11: Double = v0
    v5 = v8
    var v28: Double = v24
    var v21: Double = v28
    v5 = v1
    var v16: Double = v5
    var v25: Double = v6
    var v15: Double = v16
    let v17: Double = v11 - v12
    var v42: Double = v15
    let v31: [Double] = [v42, v3, v25, v21, v5, v18]
    var v33: [Double] = v31
    var v50: [Double] = v33
    v50[1] = v17
    let v39: Double = v50[2]
    return v39
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: s3, _ v2: Double) -> Double {
    let v15: Double = f60(v2)
    return v15
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: [s2(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0]])), p1: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])]), s2(p0: s1(p0: s0(p0: [[8.0]], p1: [[9.0]])), p1: [s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]])]), s2(p0: s1(p0: s0(p0: [[16.0]], p1: [[17.0]])), p1: [s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]]), s0(p0: [[22.0]], p1: [[23.0]])])], p1: [[s2(p0: s1(p0: s0(p0: [[24.0]], p1: [[25.0]])), p1: [s0(p0: [[26.0]], p1: [[27.0]]), s0(p0: [[28.0]], p1: [[29.0]]), s0(p0: [[30.0]], p1: [[31.0]])])]])]]
    let v1: s3 = s3(p0: [s2(p0: s1(p0: s0(p0: [[32.0]], p1: [[33.0]])), p1: [s0(p0: [[34.0]], p1: [[35.0]]), s0(p0: [[36.0]], p1: [[37.0]]), s0(p0: [[38.0]], p1: [[39.0]])]), s2(p0: s1(p0: s0(p0: [[40.0]], p1: [[41.0]])), p1: [s0(p0: [[42.0]], p1: [[43.0]]), s0(p0: [[44.0]], p1: [[45.0]]), s0(p0: [[46.0]], p1: [[47.0]])]), s2(p0: s1(p0: s0(p0: [[48.0]], p1: [[49.0]])), p1: [s0(p0: [[50.0]], p1: [[51.0]]), s0(p0: [[52.0]], p1: [[53.0]]), s0(p0: [[54.0]], p1: [[55.0]])])], p1: [[s2(p0: s1(p0: s0(p0: [[56.0]], p1: [[57.0]])), p1: [s0(p0: [[58.0]], p1: [[59.0]]), s0(p0: [[60.0]], p1: [[61.0]]), s0(p0: [[62.0]], p1: [[63.0]])])]])
    let v2: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
