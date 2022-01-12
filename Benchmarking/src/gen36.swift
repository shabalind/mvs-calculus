  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s3 {
    var p0: [[s1]]
    var p1: [s0]
  }
  func f19(_ v0: s3, _ v1: s3, _ v2: s3) -> s3 {
    let v6: [[s1]] = v2.p0
    var v4: s3 = v0
    v4.p0 = v6
    v4 = v0
    return v4
  }
  func f9(_ v0: s3, _ v1: [s3]) -> s3 {
    return v0
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [[s3]], _ v2: Double) -> Double {
    let v4: [s3] = v1[1]
    var v5: Double = v2
    let v8: s3 = v4[0]
    var v9: Double = v5
    let v10: s3 = f19(v8, v8, v8)
    let v15: s3 = f9(v10, v4)
    let v11: [s0] = v15.p1
    let v34: s0 = v11[1]
    let v40: [[Double]] = v34.p0
    var v24: Double = v5
    let v22: [Double] = v40[1]
    let v43: Double = v22[0]
    v9 = v2
    let v29: Double = v24 - v2
    let v118: Double = v43 + v29
    v5 = v9
    return v118
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s1(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]]), p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]])]))]
    let v1: [[s3]] = [[s3(p0: [[s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0]])])]], p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])])], [s3(p0: [[s1(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0]]), p1: [s0(p0: [[24.0], [25.0]], p1: [[26.0]])])]], p1: [s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]])])], [s3(p0: [[s1(p0: s0(p0: [[33.0], [34.0]], p1: [[35.0]]), p1: [s0(p0: [[36.0], [37.0]], p1: [[38.0]])])]], p1: [s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]])])]]
    let v2: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
